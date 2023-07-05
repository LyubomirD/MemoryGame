package org.example.GUI.Panel;

import org.example.GUI.InterfaceGiveComponents.GetComponentsProvider;

import javax.swing.*;
import java.awt.*;

public class PanelAddComponents extends Panel implements GetComponentsProvider {
    private final JPanel gamePanel;
    private final GetComponentsProvider getComponentsProvider;

    public PanelAddComponents(Dimension dimension, GetComponentsProvider getComponentsProvider) {
        super(dimension);
        this.gamePanel = new JPanel();
        this.getComponentsProvider = getComponentsProvider;

        addComponentsToMainPanel();
        setGamePanel();
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