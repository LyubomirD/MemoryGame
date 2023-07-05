package org.example.GUI.Buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartButton implements RestartButtonProvider {

    private final JButton jButton;

    public RestartButton() {
        this.jButton = new JButton();

        setJButton();
        addButtonListener();
    }

    private void setJButton() {
        jButton.setText("Restart Game");
    }

    @Override
    public JButton getRestartButton() {
        return jButton;
    }

    private void addButtonListener() {
        jButton.addActionListener(e -> {
                System.out.println("Clicked Button1");
                System.out.println("Clicked Button2");
                System.out.println("Clicked Button3");
        });
    }
}

/*
TODO as I can see the RestartButtonFuncionality would not work and the only solution is to
put the actionPerformer method here, because I would be repeting the same code only for it
to restart, wast of time and resources

TODO read the below really important!!!
TODO the game would restart itself, if a player cannot repeat the color pattern given, the game would restart by itself, no need for a button
 */