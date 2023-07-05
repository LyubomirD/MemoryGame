package org.example.GUI.Panel;

import org.example.GUI.GetComponentsProvider;

import javax.swing.*;
import java.awt.*;

public class Panel implements PanelProvider {

    private final JPanel mainPanel;
    private final JPanel gamePanel;
    private final Dimension dimension;
    private final GetComponentsProvider getComponentsProvider;

    public Panel(Dimension dimension, GetComponentsProvider getComponentsProvider) {
        this.mainPanel = new JPanel();
        this.gamePanel = new JPanel();
        this.dimension = dimension;
        this.getComponentsProvider = getComponentsProvider;

        setMainPanel();
        setGamePanel();
    }


    private void setMainPanel() {
        mainPanel.setBackground(Color.pink);
        mainPanel.setSize((int) dimension.getWidth(), (int) dimension.getHeight());
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        addComponentsToMainPanel();
    }

    @Override
    public JPanel getJPanel() {
        return mainPanel;
    }

    private void addComponentsToMainPanel() {
        mainPanel.add(gamePanel);
    }

    private void setGamePanel() {
        gamePanel.setPreferredSize(dimension);
        gamePanel.setLayout(new GridLayout(4, 4));

        addButtonsToGamePanel();
    }

    private void addButtonsToGamePanel() {
        JButton[] buttons = (JButton[]) getComponentsProvider.getMultipleComponents();
        for (int i = 0; i < buttons.length; i++) {
            gamePanel.add(buttons[i]);
        }
    }

    private void addLabelLevelToMainPanel() {

    }
}

