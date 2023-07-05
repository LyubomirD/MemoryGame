package org.example.GUI.Panel;

import javax.swing.*;
import java.awt.*;

public class Panel implements PanelProvider {

    private final JPanel mainPanel;
    private final JPanel gamePanel;
    private final Dimension dimension;
    private final PanelComponentsProvider panelComponentsProvider;

    public Panel(Dimension dimension, PanelComponentsProvider panelComponentsProvider) {
        this.mainPanel = new JPanel();
        this.gamePanel = new JPanel();
        this.dimension = dimension;
        this.panelComponentsProvider = panelComponentsProvider;

        setMainPanel();
        setGamePanel();
    }


    private void setMainPanel() {
        mainPanel.setSize((int) dimension.getWidth(), (int) dimension.getHeight());
        mainPanel.setBackground(Color.pink);
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.setVisible(true);
        mainPanel.add(gamePanel);
        mainPanel.add(panelComponentsProvider.addJPanelRestartButton());
    }

    @Override
    public JPanel getJPanel() {
        return mainPanel;
    }

    private void setGamePanel() {
        //gamePanel.setSize((int) dimension.getWidth(), (int) dimension.getHeight() - 100);
        gamePanel.setPreferredSize(new Dimension((int) dimension.getWidth(), (int) dimension.getHeight() - 100));
        gamePanel.setLayout(new GridLayout(4, 4));
        JButton[] buttons = panelComponentsProvider.addJPanelGameButtons();
        for (int i = 0; i < buttons.length; i++) {
            gamePanel.add(buttons[i]);
        }
    }
}

