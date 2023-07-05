package org.example.GUI.Frame;

import org.example.GUI.InterfaceGiveComponents.GetComponentsProvider;

import java.awt.*;

public class FrameAddComponents extends Frame {

    private final GetComponentsProvider getComponentsProvider;

    public FrameAddComponents(Dimension dimension, GetComponentsProvider getComponentsProvider) {
        super(dimension);

        this.getComponentsProvider = getComponentsProvider;
        addJFrameComponents();
    }

    private void addJFrameComponents() {
        jFrame.add(getComponentsProvider.getSingleComponent());
        jFrame.validate();
    }
}
