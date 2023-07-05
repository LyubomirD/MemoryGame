package org.example.GUI.InterfaceGiveComponents;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.Label.LabelGameLevelCounter;

import javax.swing.*;
import java.awt.*;

public class CombiningButtonAndLabel implements GetComponentsProvider {

    private final GameButtons buttons;
    private final LabelGameLevelCounter label;

    public CombiningButtonAndLabel(GameButtons buttons, LabelGameLevelCounter label) {
        this.buttons = buttons;
        this.label = label;
    }

    @Override
    public Component[] getMultipleComponents() {
        return buttons.getMultipleComponents();
    }

    @Override
    public Component getSingleComponent() {
        return label.getSingleComponent();
    }
}
