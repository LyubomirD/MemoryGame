package org.example.Panel;

import org.example.Buttons.GameButtons;
import org.example.Buttons.GameButtonsProvider;
import org.example.Buttons.RestartButton;
import org.example.Buttons.RestartButtonProvider;

import javax.swing.*;
import java.awt.*;

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
