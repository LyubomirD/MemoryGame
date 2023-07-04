package org.example.Panel;

import org.example.Dimensions.DimensionProvider;

import javax.swing.*;
import java.awt.*;

public class Panel implements PanelProvider {

    private final JPanel jPanel;
    private final DimensionProvider dimensionProvider;
    private final PanelComponentsProvider panelComponentsProvider;

    public Panel(DimensionProvider dimensionProvider, PanelComponentsProvider panelComponentsProvider) {
        this.jPanel = new JPanel();
        this.dimensionProvider = dimensionProvider;
        this.panelComponentsProvider = panelComponentsProvider;

        setJPanel();
        addComponents();
    }


    private void setJPanel() {
        jPanel.setSize(dimensionProvider.getWidth(), dimensionProvider.getHeight());
        jPanel.setBackground(Color.pink);
        jPanel.setLayout(new GridLayout(4, 4));
        jPanel.setVisible(true);
    }

    @Override
    public JPanel getJPanel() {
        return jPanel;
    }

    private void addComponents() {
        JButton[] buttons = panelComponentsProvider.addJPanelComponents();
        for (int i = 0; i < buttons.length; i++) {
            jPanel.add(buttons[i]);
        }

    }
}
