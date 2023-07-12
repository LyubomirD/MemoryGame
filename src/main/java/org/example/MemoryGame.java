package org.example;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.Frame.Frame;
import org.example.GUI.Frame.FrameAddComponents;
import org.example.GUI.InterfaceGiveComponents.GameButtonsProvider;
import org.example.GUI.InterfaceGiveComponents.LevelLabelProvider;
import org.example.GUI.InterfaceGiveComponents.PanelProvider;
import org.example.GUI.Label.LevelLabel;
import org.example.GUI.Panel.PanelAddComponents;
import org.example.GameFuctionality.GameButtonsFunctionality.ButtonsFunctionality;

import java.awt.*;

public class MemoryGame {

    public static void main(String[] args) {
        //GUI
        Dimension dimension = new Dimension(400, 500);

        GameButtonsProvider buttons = new GameButtons();
        LevelLabelProvider label = new LevelLabel();

        PanelProvider panel = new PanelAddComponents(dimension, buttons, label);
        Frame frame = new FrameAddComponents(dimension, panel);

        //Functions
        ButtonsFunctionality buttonsFunctionality = new ButtonsFunctionality(buttons, label);


    }
}