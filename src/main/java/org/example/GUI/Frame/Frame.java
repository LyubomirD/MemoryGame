package org.example.GUI.Frame;


import javax.swing.*;
import java.awt.*;

public class Frame {

    final JFrame jFrame;
    private final Dimension dimension;

    public Frame(Dimension dimension) {
        this.jFrame = new JFrame();
        this.dimension = dimension;

        setJFrame();
    }

    private void setJFrame() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize((int) dimension.getWidth(), (int) dimension.getHeight());
        jFrame.setLocationRelativeTo(null);
        jFrame.setAlwaysOnTop(true);
        jFrame.setVisible(true);
    }
}
