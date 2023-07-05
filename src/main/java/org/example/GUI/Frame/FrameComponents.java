package org.example.GUI.Frame;

import org.example.GUI.Panel.PanelProvider;

import javax.swing.*;

public class FrameComponents implements FrameComponentsProvider {
    @Override
    public JPanel addJFramePanelProvider(PanelProvider panelProvider) {
        return panelProvider.getJPanel();
    }

}
