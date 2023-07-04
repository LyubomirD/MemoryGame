package org.example.Frame;

import org.example.Dimensions.DimensionProvider;
import org.example.Panel.PanelProvider;

import javax.swing.*;

public class Frame {

    private final JFrame jFrame;
    private final DimensionProvider dimensionProvider;
    private final PanelProvider panelProvider;
    private final FrameComponentsProvider frameComponentsProvider;

    public Frame(DimensionProvider dimensionsProvider, FrameComponentsProvider frameComponentsProvider, PanelProvider panelProvider) {
        this.jFrame = new JFrame();
        this.dimensionProvider = dimensionsProvider;
        this.panelProvider = panelProvider;
        this.frameComponentsProvider = frameComponentsProvider;

        setJFrame();
        addJFrameComponents();
    }

    private void setJFrame() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(dimensionProvider.getWidth(), dimensionProvider.getHeight());
        jFrame.setLocationRelativeTo(null);
        jFrame.setAlwaysOnTop(true);
        jFrame.setVisible(true);
    }

    private void addJFrameComponents() {
        jFrame.add(frameComponentsProvider.addJFrameComponents(panelProvider));
        jFrame.validate();
    }
}
