package org.example.GUI.Frame;

import org.example.GUI.Panel.PanelProvider;
import org.example.GUI.GetComponentsProvider;

import javax.swing.*;
import java.awt.*;

public class Frame {

    private final JFrame jFrame;
    private final Dimension dimension;
    private final PanelProvider panelProvider;

    public Frame(Dimension dimension, PanelProvider panelProvider) {
        this.jFrame = new JFrame();
        this.dimension = dimension;
        this.panelProvider = panelProvider;

        setJFrame();
        addJFrameComponents();
    }

    private void setJFrame() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize((int) dimension.getWidth(), (int) dimension.getHeight());
        jFrame.setLocationRelativeTo(null);
        jFrame.setAlwaysOnTop(true);
        jFrame.setVisible(true);
    }

    private void addJFrameComponents() {
        jFrame.add(panelProvider.getJPanel());
        jFrame.validate();
    }
}
