package org.example;

import org.example.GUI.Frame.Frame;
import org.example.GUI.GetComponentsProvider;
import org.example.GUI.Panel.Panel;
import org.example.GUI.Panel.PanelComponents;
import org.example.GUI.Panel.PanelProvider;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        GetComponentsProvider componentsProvider;
        Dimension dimension = new Dimension(400, 500);

        componentsProvider = new PanelComponents();
        PanelProvider panelProvider = new Panel(dimension, componentsProvider);

        Frame frame = new Frame(dimension, panelProvider);
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
