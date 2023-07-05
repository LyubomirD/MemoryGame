package org.example.Frame;

import org.example.Panel.PanelProvider;

import javax.swing.*;
import java.awt.*;

public class FrameComponents implements FrameComponentsProvider {

    @Override
    public JPanel addJFrameComponents(PanelProvider panelProvider) {
        return panelProvider.getJPanel();
    }
}
