package org.example.Buttons;

import javax.swing.*;

public class Buttons implements ButtonsProvider {
    
    private final JButton[] buttons;

    public Buttons() {
        this.buttons = new JButton[1];
        buttons[0] = new JButton("JButton[0]");

        setJButton();
    }

    private void setJButton() {

    }

    @Override
    public JButton[] getButtons() {
        return buttons;
    }
}
