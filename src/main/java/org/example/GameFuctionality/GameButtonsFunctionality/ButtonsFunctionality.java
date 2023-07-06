package org.example.GameFuctionality.GameButtonsFunctionality;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.InterfaceGiveComponents.GameButtonsProvider;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class ButtonsFunctionality implements ActionListener {

    private final GameButtonsProvider gameButtonsProvider;
    private final JButton[] buttonsArray;
    private final JButton startButton;

    public ButtonsFunctionality(GameButtonsProvider gameButtonsProvider) {
        this.gameButtonsProvider = gameButtonsProvider;

        this.buttonsArray = gameButtonsProvider.getMultipleButtons();
        this.startButton = gameButtonsProvider.getSingleButton();

        for (int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].setBackground(Color.WHITE);
            fillInButtonsWithColor(buttonsArray[i]);
        }

        startButton.addActionListener(this);
    }

    private void fillInButtonsWithColor(JButton button) {
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setRequestFocusEnabled(true);
        button.setUI(new BasicButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                int xy = 3;
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(button.getBackground());
                g2.fillRoundRect(xy, xy, c.getWidth() - (xy * 2), c.getHeight() - (xy * 2), 10, 10);
                g2.dispose();
                super.paint(g, c);
            }
        });
    }

    private Color randomColorGenerator() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return new Color(red, green, blue);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        startButton.setEnabled(false);
        int buttonCount = 2;
        Color defaultColor = Color.WHITE;

        List<JButton> buttonsList = new ArrayList<>(Arrays.asList(buttonsArray));
        Collections.shuffle(buttonsList);

        new Thread(() -> {
            List<JButton> coloredButtons = new ArrayList<>();

            for (int i = 0; i < buttonCount; i++) {
                JButton currentButton = buttonsList.get(i);

                int finalI = i;
                SwingUtilities.invokeLater(() -> {
                    // Reset the color of the previous button to the default color
                    if (finalI > 0) {
                        JButton previousButton = buttonsList.get(finalI - 1);
                        previousButton.setBackground(defaultColor);
                        fillInButtonsWithColor(previousButton);
                    }

                    // Color the current button
                    currentButton.setBackground(randomColorGenerator());
                    fillInButtonsWithColor(currentButton);

                    // Add the colored button to the list
                    coloredButtons.add(currentButton);
                });

                try {
                    Thread.sleep(1000); // Pause for 1 second after coloring each button
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                SwingUtilities.invokeLater(() -> {
                    currentButton.setBackground(defaultColor);
                    fillInButtonsWithColor(currentButton);
                });
            }

            SwingUtilities.invokeLater(() -> {
                UserInput(coloredButtons, buttonCount); // Call UserInput method after coloring the buttons
            });
        }).start();
    }
    private void UserInput(List<JButton> coloredButtons, int buttonCount) {
        ActionListener userInputListener = new ActionListener() {
            int inputCount = 0; // Keep track of the number of user inputs

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                System.out.println(clickedButton);

                // Check if the coloredButtons list is empty
                if (!coloredButtons.isEmpty()) {
                    // Get the corresponding button from the colored buttons list
                    JButton coloredButton = coloredButtons.get(inputCount);
                    // Check if the clicked button matches the corresponding colored button
                    boolean match = clickedButton.equals(coloredButton);

                    // Increment the input count
                    inputCount++;

                    // Check if all inputs have been made
                    if (inputCount == buttonCount) {
                        if (match) {
                            startButton.setEnabled(true);
                        } else {
                            startButton.setEnabled(false);
                        }
                        inputCount = 0; // Reset the input count for the next round
                        coloredButtons.clear(); // Clear the coloredButtons list for the next round
                    }
                    System.out.println(match);
                }
            }
        };

        // Add the userInputListener to each button
        for (JButton button : buttonsArray) {
            button.addActionListener(userInputListener);
        }
    }
}