package org.example.GUI.Panel;

import org.example.GUI.InterfaceGiveComponents.GetComponentsProvider;

import javax.swing.*;
import java.awt.*;

public class Panel implements GetComponentsProvider {

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

    private void addComponentsToMainPanel() {
        mainPanel.add(gamePanel);
        addLabelToMainPanel();
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

    private void addLabelToMainPanel() {
        JLabel label = (JLabel) getComponentsProvider.getSingleComponent();
        mainPanel.add(label);
    }

    @Override
    public Component[] getMultipleComponents() {
        return null;
    }

    @Override
    public Component getSingleComponent() {
        return mainPanel;
    }
}

