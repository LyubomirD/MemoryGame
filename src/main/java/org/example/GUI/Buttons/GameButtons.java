package org.example.GUI.Buttons;

import javax.swing.*;

public class GameButtons implements GameButtonsProvider {

    private JButton[] buttons;
    private final int NUMBER_OF_GAMEBUTTONS = 16;

    public GameButtons() {
        setJButton();
    }

    private void setJButton() {
        this.buttons = new JButton[NUMBER_OF_GAMEBUTTONS];

        for (int i = 0; i < NUMBER_OF_GAMEBUTTONS; i++) {
            JButton jButton = new JButton();
            buttons[i] = jButton;
        }
    }

    @Override
    public JButton[] getGameButtons() {
        return buttons;
    }
}
