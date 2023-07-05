package org.example.GameLogic;
import org.example.GUI.Buttons.RestartButtonProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartButtonFunctionality implements RestartButtonProvider {

    private final JButton button;

    public RestartButtonFunctionality() {
        this.button = new JButton();

        setJButton();
        addButtonListener();
    }

    private void setJButton() {
        button.setText("Restart Game");
    }

    private void addButtonListener() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restartGame();
            }
        });
    }

    private void restartGame() {
        // Add your game restart logic here
        System.out.println("Restart button clicked");
    }

    @Override
    public JButton getRestartButton() {
        return button;
    }
}