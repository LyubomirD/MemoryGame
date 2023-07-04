package org.example;

import org.example.Dimensions.DimensionProvider;
import org.example.Dimensions.Dimensions;
import org.example.Frame.Frame;
import org.example.Frame.FrameComponents;
import org.example.Frame.FrameComponentsProvider;
import org.example.Panel.Panel;
import org.example.Panel.PanelComponents;
import org.example.Panel.PanelComponentsProvider;
import org.example.Panel.PanelProvider;

public class Main {

    public static void main(String[] args) {
        DimensionProvider dimensions = new Dimensions(400, 400);
        FrameComponentsProvider componentsProvider = new FrameComponents();

        PanelComponentsProvider panelComponentsProvider = new PanelComponents();
        PanelProvider panelProvider = new Panel(dimensions, panelComponentsProvider);

        Frame frame = new Frame(dimensions, componentsProvider, panelProvider);
        FrameComponentsProvider frameComponentsProvider = new FrameComponents();
        frameComponentsProvider.addJFrameComponents(panelProvider);
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
