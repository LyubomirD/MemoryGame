package org.example.Buttons;

import javax.swing.*;
import java.awt.*;

public class Buttons implements ButtonsProvider {

    private JButton[] buttons;
    private final int NUMBER_OF_BUTTONS = 16;

    public Buttons() {
        setJButton();
    }

    private void setJButton() {
        this.buttons = new JButton[NUMBER_OF_BUTTONS];

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {
            JButton jButton = new JButton();
            buttons[i] = jButton;
        }
    }

    @Override
    public JButton[] getButtons() {
        return buttons;
    }
}
