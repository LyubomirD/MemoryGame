package org.example.GUI.Frame;

import org.example.GUI.InterfaceGiveComponents.PanelProvider;

import java.awt.*;

public class FrameAddComponents extends Frame {

    private final PanelProvider panelProvider;

    public FrameAddComponents(Dimension dimension, PanelProvider panelProvider) {
        super(dimension);

        this.panelProvider = panelProvider;
        addJFrameComponents();
    }

    private void addJFrameComponents() {
        jFrame.add(panelProvider.getJPanel());
        jFrame.validate();
    }
}
