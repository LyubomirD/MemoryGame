package org.example;

import org.example.GUI.Buttons.GameButtons;
import org.example.GUI.Frame.FrameGame;
import org.example.GUI.InterfaceGiveComponents.CombiningButtonAndLabel;
import org.example.GUI.InterfaceGiveComponents.GetComponentsProvider;
import org.example.GUI.Label.LabelGameLevelCounter;
import org.example.GUI.Panel.Panel;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimension dimension = new Dimension(400, 500);

        GetComponentsProvider buttons = new GameButtons();
        GetComponentsProvider label = new LabelGameLevelCounter();
        GetComponentsProvider getComponentsProvider = new CombiningButtonAndLabel((GameButtons) buttons, (LabelGameLevelCounter) label);
        GetComponentsProvider panel = new Panel(dimension, getComponentsProvider);

        FrameGame frame = new FrameGame(dimension, panel);
    }
}


































//package org.example;
//
//import javax.swing.*;
//import java.awt.*;
//
//interface DimensionProvider {
//    int getWidth();
//    int getHeight();
//}
//
//class Dimensions implements DimensionProvider {
//    private final int width;
//    private final int height;
//
//    public Dimensions(int width, int height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public int getWidth() {
//        return width;
//    }
//
//    @Override
//    public int getHeight() {
//        return height;
//    }
//}
//
//class PanelProvider {
//    public JPanel createPanel(DimensionProvider dimensionProvider) {
//        JPanel panel = new JPanel();
//        panel.setPreferredSize(new Dimension(dimensionProvider.getWidth(), dimensionProvider.getHeight()));
//        return panel;
//    }
//}
//
//class Frame {
//    private final JFrame frame;
//    private final JPanel panel;
//
//    public Frame(JPanel panel, DimensionProvider dimensionProvider) {
//        this.panel = panel;
//        this.frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(dimensionProvider.getWidth(), dimensionProvider.getHeight());
//        frame.getContentPane().add(panel);
//    }
//
//    public void display() {
//        frame.setVisible(true);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        DimensionProvider dimensionProvider = new Dimensions(800, 600);
//        PanelProvider panelProvider = new PanelProvider();
//        JPanel panel = panelProvider.createPanel(dimensionProvider);
//
//        Frame frame = new Frame(panel, dimensionProvider);
//        frame.display();
//    }
//}
