package org.example;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.Buttons.GameButtonsProvider;
import org.example.GUI.Buttons.RestartButton;
import org.example.GUI.Buttons.RestartButtonProvider;
import org.example.GUI.Frame.Frame;
import org.example.GUI.Frame.FrameComponents;
import org.example.GUI.Frame.FrameComponentsProvider;
import org.example.GUI.Panel.Panel;
import org.example.GUI.Panel.PanelComponents;
import org.example.GUI.Panel.PanelComponentsProvider;
import org.example.GUI.Panel.PanelProvider;
import org.example.GameLogic.RestartButtonFunctionality;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(400, 500);
        FrameComponentsProvider componentsProvider = new FrameComponents();

        PanelComponentsProvider panelComponentsProvider = new PanelComponents();
        PanelProvider panelProvider = new Panel(dimension, panelComponentsProvider);

        GameButtonsProvider gameButtonsProvider = new GameButtons();
        RestartButtonFunctionality restartButtonFunctionality = new RestartButtonFunctionality();

        Frame frame = new Frame(dimension, componentsProvider, panelProvider);
        FrameComponentsProvider frameComponentsProvider = new FrameComponents();
        frameComponentsProvider.addJFramePanelProvider(panelProvider);
    }
}