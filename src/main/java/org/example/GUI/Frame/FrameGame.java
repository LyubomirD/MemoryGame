package org.example.GUI.Frame;

import org.example.GUI.InterfaceGiveComponents.GetComponentsProvider;

import javax.swing.*;
import java.awt.*;

public class FrameGame {

    private final JFrame jFrame;
    private final Dimension dimension;
    private final GetComponentsProvider getComponentsProvider;

    public FrameGame(Dimension dimension, GetComponentsProvider getComponentsProvider) {
        this.jFrame = new JFrame();
        this.dimension = dimension;
        this.getComponentsProvider = getComponentsProvider;

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
        jFrame.add(getComponentsProvider.getSingleComponent());
        jFrame.validate();
    }
}
