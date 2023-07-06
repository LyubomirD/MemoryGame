package org.example.GUI.Label;

import org.example.GUI.InterfaceGiveComponents.LevelLabelProvider;

import javax.swing.*;
import java.awt.*;

public class LevelLabel implements LevelLabelProvider {

    private final JLabel jLabel;

    public LevelLabel() {
        this.jLabel = new JLabel();

        setJLabel();
    }

    private void setJLabel() {
        jLabel.setText("Level 0");
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    @Override
    public JLabel getLevelLabel() {
        return jLabel;
    }
}
