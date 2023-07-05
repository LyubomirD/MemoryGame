package org.example.GUI.Label;

import org.example.GUI.InterfaceGiveComponents.GetComponentsProvider;

import javax.swing.*;
import java.awt.*;

public class LabelGameLevelCounter implements GetComponentsProvider {

    private final JLabel jLabel;

    public LabelGameLevelCounter() {
        this.jLabel = new JLabel("Level 0");

        setJLabel();
    }

    private void setJLabel() {
    }

    @Override
    public Component[] getMultipleComponents() {
        return null;
    }

    @Override
    public Component getSingleComponent() {
        return jLabel;
    }
}
