package org.example.GUI.Buttons;

import org.example.GUI.InterfaceGiveComponents.GameButtonsProvider;

import javax.swing.*;
import java.awt.*;

public class GameButtons implements GameButtonsProvider {

    private final JButton[] gameButtons;
    private final JButton startButton;
    private final int NUMBER_OF_GAME_BUTTONS = 16;

    public GameButtons() {
        this.startButton = new JButton();
        this.gameButtons = new JButton[NUMBER_OF_GAME_BUTTONS];

        setMultipleButtons();
        setStartButton();
    }

    private void setMultipleButtons() {
        for (int i = 0; i < NUMBER_OF_GAME_BUTTONS; i++) {
            JButton jButton = new JButton();
            gameButtons[i] = jButton;
        }
    }

    private void setStartButton() {
        startButton.setText("Start Game");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
    }


    @Override
    public JButton[] getMultipleButtons() {
        return gameButtons;
    }

    @Override
    public JButton getSingleButton() {
        return startButton;
    }
}
