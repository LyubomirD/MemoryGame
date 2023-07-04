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
        jPanel.setVisible(true);
    }

    @Override
    public JPanel getJPanel() {
        return jPanel;
    }

    private void addComponents() {
        JButton[] button = panelComponentsProvider.addJPanelComponents();
        jPanel.add(button[0]);
    }
}
