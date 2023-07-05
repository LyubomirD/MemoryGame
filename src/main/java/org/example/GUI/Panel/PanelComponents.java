package org.example.GUI.Panel;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.Buttons.GameButtonsProvider;
import org.example.GUI.GetComponentsProvider;

import java.awt.*;

public class PanelComponents implements GetComponentsProvider {

    @Override
    public Component[] getMultipleComponents() {
        GameButtonsProvider gameButtonsProvider = new GameButtons();
        return gameButtonsProvider.getGameButtons();
    }

    @Override
    public Component getSingleComponent() {
        return null;
    }
}
