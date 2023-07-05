package org.example.GUI.Buttons;

import org.example.GUI.InterfaceGiveComponents.GetComponentsProvider;

import javax.swing.*;
import java.awt.*;

public class GameButtons implements GetComponentsProvider{

    private JButton[] buttons;
    private final int NUMBER_OF_GAME_BUTTONS = 16;

    public GameButtons() {
        setJButtons();
    }

    private void setJButtons() {
        this.buttons = new JButton[NUMBER_OF_GAME_BUTTONS];

        for (int i = 0; i < NUMBER_OF_GAME_BUTTONS; i++) {
            JButton jButton = new JButton();
            buttons[i] = jButton;
        }
    }

    @Override
    public Component[] getMultipleComponents() {
        return buttons;
    }

    @Override
    public Component getSingleComponent() {
        return null;
    }
}
