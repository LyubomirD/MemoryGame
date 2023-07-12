package org.example.GUI.Frame;

import org.example.GUI.InterfaceGiveComponents.PanelProvider;

import java.awt.*;

public class FrameAddComponents {
    private final Frame frame;
    private final PanelProvider panelProvider;

    public FrameAddComponents(Frame frame, PanelProvider panelProvider) {
        this.frame = frame;
        this.panelProvider = panelProvider;
        addJFrameComponents();
    }

    private void addJFrameComponents() {
        frame.jFrame.add(panelProvider.getJPanel());
        frame.jFrame.validate();
    }
}
