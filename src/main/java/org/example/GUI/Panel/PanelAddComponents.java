package org.example.GUI.Panel;

import org.example.GUI.InterfaceGiveComponents.GameButtonsProvider;
import org.example.GUI.InterfaceGiveComponents.LevelLabelProvider;
import org.example.GUI.InterfaceGiveComponents.PanelProvider;

import javax.swing.*;
import java.awt.*;

public class PanelAddComponents implements PanelProvider {

    private final Panel panel;
    private final JPanel gamePanel;
    private final GameButtonsProvider gameButtonsProvider;
    private final LevelLabelProvider levelLabelProvider;

    public PanelAddComponents(Panel panel, GameButtonsProvider gameButtonsProvider, LevelLabelProvider levelLabelProvider) {
        this.panel = panel;
        this.gamePanel = new JPanel();
        this.gameButtonsProvider = gameButtonsProvider;
        this.levelLabelProvider = levelLabelProvider;

        addComponentsToMainPanel();
        setGamePanel();
    }


    private void addComponentsToMainPanel() {
        panel.mainPanel.add(gamePanel);
        addStartButtonToMainPanel();
        addLabelToMainPanel();
    }

    private void setGamePanel() {
        gamePanel.setPreferredSize(panel.dimension);
        gamePanel.setLayout(new GridLayout(4, 4));

        addButtonsToGamePanel();
    }

    private void addStartButtonToMainPanel() {
        JButton startButton = gameButtonsProvider.getSingleButton();
        panel.mainPanel.add(startButton);
    }

    private void addButtonsToGamePanel() {
        JButton[] buttons = gameButtonsProvider.getMultipleButtons();
        for (JButton button : buttons) {
            gamePanel.add(button);
        }
    }

    private void addLabelToMainPanel() {
        JLabel label = levelLabelProvider.getLevelLabel();
        panel.mainPanel.add(label);
    }


    @Override
    public JPanel getJPanel() {
        return panel.mainPanel;
    }
}