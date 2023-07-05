package org.example.GUI.Frame;

import org.example.GUI.Panel.PanelProvider;

import javax.swing.*;
import java.awt.*;

public class Frame {

    private final JFrame jFrame;
    private final Dimension dimension;
    private final PanelProvider panelProvider;
    private final FrameComponentsProvider frameComponentsProvider;

    public Frame(Dimension dimension, FrameComponentsProvider frameComponentsProvider, PanelProvider panelProvider) {
        this.jFrame = new JFrame();
        this.dimension = dimension;
        this.panelProvider = panelProvider;
        this.frameComponentsProvider = frameComponentsProvider;

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
        jFrame.add(frameComponentsProvider.addJFramePanelProvider(panelProvider));
        jFrame.validate();
    }
}
