package org.example.GUI.Panel;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.Buttons.GameButtonsProvider;
import org.example.GUI.Buttons.RestartButton;
import org.example.GUI.Buttons.RestartButtonProvider;

import javax.swing.*;

public class PanelComponents implements PanelComponentsProvider {

    @Override
    public JButton[] addJPanelGameButtons() {
        GameButtonsProvider gameButtonsProvider = new GameButtons();
        return gameButtonsProvider.getGameButtons();
    }

    @Override
    public JButton addJPanelRestartButton() {
        RestartButtonProvider restartButtonProvider = new RestartButton();
        return restartButtonProvider.getRestartButton();
    }
}
