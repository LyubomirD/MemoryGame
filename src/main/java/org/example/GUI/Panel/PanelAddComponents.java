package org.example.GUI.Panel;

import org.example.GUI.InterfaceGiveComponents.GameButtonsProvider;
import org.example.GUI.InterfaceGiveComponents.LevelLabelProvider;
import org.example.GUI.InterfaceGiveComponents.PanelProvider;

import javax.swing.*;
import java.awt.*;

public class PanelAddComponents extends Panel implements PanelProvider {
    private final JPanel gamePanel;
    private final GameButtonsProvider gameButtonsProvider;
    private final LevelLabelProvider levelLabelProvider;

    public PanelAddComponents(Dimension dimension, GameButtonsProvider gameButtonsProvider, LevelLabelProvider levelLabelProvider) {
        super(dimension);
        this.gamePanel = new JPanel();
        this.gameButtonsProvider = gameButtonsProvider;
        this.levelLabelProvider = levelLabelProvider;

        addComponentsToMainPanel();
        setGamePanel();
    }

    private void addComponentsToMainPanel() {
        mainPanel.add(gamePanel);
        addStartButtonToMainPanel();
        addLabelToMainPanel();
    }

    private void setGamePanel() {
        gamePanel.setPreferredSize(dimension);
        gamePanel.setLayout(new GridLayout(4, 4));

        addButtonsToGamePanel();
    }

    private void addStartButtonToMainPanel() {
        JButton startButton = gameButtonsProvider.getSingleButton();
        mainPanel.add(startButton);
    }

    private void addButtonsToGamePanel() {
        JButton[] buttons = gameButtonsProvider.getMultipleButtons();
        for (int i = 0; i < buttons.length; i++) {
            gamePanel.add(buttons[i]);
        }
    }

    private void addLabelToMainPanel() {
        JLabel label = levelLabelProvider.getLevelLabel();
        mainPanel.add(label);
    }


    @Override
    public JPanel getJPanel() {
        return mainPanel;
    }
}