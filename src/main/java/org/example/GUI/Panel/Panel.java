package org.example.GUI.Panel;

import javax.swing.*;
import java.awt.*;

public class Panel {

    final JPanel mainPanel;
    final Dimension dimension;

    public Panel(Dimension dimension) {
        this.mainPanel = new JPanel();
        this.dimension = dimension;

        setJPanel();
    }

    private void setJPanel() {
        mainPanel.setBackground(Color.pink);
        mainPanel.setSize((int) dimension.getWidth(), (int) dimension.getHeight());
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    }
}

