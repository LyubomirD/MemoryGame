package org.example.GameFuctionality.GameButtonsFunctionality;

import org.example.GUI.InterfaceGiveComponents.GameButtonsProvider;
import org.example.GUI.InterfaceGiveComponents.LevelLabelProvider;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class ButtonsFunctionality implements ActionListener {
    private final JLabel levelLabel;
    private final JButton[] buttonsArray;
    private final JButton startButton;
    private int incrementAppearingButtons = 2;

    public ButtonsFunctionality(GameButtonsProvider gameButtonsProvider, LevelLabelProvider levelLabelProvider) {
        this.levelLabel = levelLabelProvider.getLevelLabel();

        this.buttonsArray = gameButtonsProvider.getMultipleButtons();
        this.startButton = gameButtonsProvider.getSingleButton();

        for (JButton jButton : buttonsArray) {
            jButton.setBackground(Color.WHITE);
            fillInButtonsWithColor(jButton);
        }

        startButton.addActionListener(this);
    }

    private Color randomColorGenerator() {
        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        return new Color(red, green, blue);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        startButton.setEnabled(false);
        Color defaultColor = Color.WHITE;

        List<JButton> buttonsList = new ArrayList<>(Arrays.asList(buttonsArray));
        Collections.shuffle(buttonsList);

        new Thread(() -> {
            List<JButton> coloredButtons = new ArrayList<>();

            for (int i = 0; i < incrementAppearingButtons; i++) {
                performButtonUpdate(buttonsList, coloredButtons, defaultColor, i);
                performDelay();

                int finalI = i;
                SwingUtilities.invokeLater(() -> {
                    restoreButtonColor(defaultColor, buttonsList, finalI);
                });
            }
            SwingUtilities.invokeLater(() -> {
                UserInput(coloredButtons);
            });
        }).start();
    }

    private void performButtonUpdate(List<JButton> buttonsList, List<JButton> coloredButtons, Color defaultColor, int index) {
        JButton currentButton = buttonsList.get(index);

        SwingUtilities.invokeLater(() -> {
            if (index > 0) {
                JButton previousButton = buttonsList.get(index - 1);
                previousButton.setBackground(defaultColor);
                fillInButtonsWithColor(previousButton);
            }

            currentButton.setBackground(randomColorGenerator());
            fillInButtonsWithColor(currentButton);

            coloredButtons.add(currentButton);
        });
    }

    private void performDelay() {
        try {
            Thread.sleep(1002 - incrementAppearingButtons);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    private void restoreButtonColor(Color defaultColor, List<JButton> buttonsList, int index) {
        JButton currentButton = buttonsList.get(index);
        currentButton.setBackground(defaultColor);
        fillInButtonsWithColor(currentButton);
    }

    private void UserInput(List<JButton> coloredButtons) {
        ActionListener userInputListener = new ActionListener() {
            int inputCount = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();

                if (coloredButtons.isEmpty()) {
                    return;
                }

                JButton coloredButton = coloredButtons.get(inputCount);
                boolean match = clickedButton.equals(coloredButton);
                inputCount++;

                if (match && inputCount == incrementAppearingButtons) {
                    levelLabel.setText("Level " + incrementAppearingButtons);
                    startButton.setText("Start");
                    incrementAppearingButtons++;
                    inputCount = 0;
                    coloredButtons.clear();
                    startButton.setEnabled(true);
                } else if (!match) {
                    levelLabel.setText("Level 1");
                    startButton.setText("Restart");
                    incrementAppearingButtons = 2;
                    inputCount = 0;
                    coloredButtons.clear();
                    startButton.setEnabled(true);
                }
                System.out.println(match);
            }
        };

        for (JButton button : buttonsArray) {
            button.addActionListener(userInputListener);
        }
    }

}