package org.example.Buttons;

import javax.swing.*;

public class RestartButton implements RestartButtonProvider{

    private final JButton jButton;

    public RestartButton() {
        this.jButton = new JButton();

        setJButton();
    }

    private void setJButton() {
        jButton.setText("Restart Game");
    }

    @Override
    public JButton getRestartButton() {
        return jButton;
    }
}
