package org.example.GUI.InterfaceGiveComponents;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.Label.LevelLabel;

import java.awt.*;

public class CombiningButtonAndLabel implements GetComponentsProvider {

    private final GameButtons gameButtons;
    private final LevelLabel label;

    public CombiningButtonAndLabel(GameButtons gameButtons, LevelLabel label) {
        this.gameButtons = gameButtons;
        this.label = label;
    }

    @Override
    public Component[] getMultipleComponents() {
        return gameButtons.getMultipleComponents();
    }

    @Override
    public Component getSingleComponent() {
        return label.getSingleComponent();
    }
}
