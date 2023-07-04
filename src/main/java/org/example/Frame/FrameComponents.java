package org.example.Frame;

import org.example.Dimensions.DimensionProvider;
import org.example.Dimensions.Dimensions;
import org.example.Panel.Panel;
import org.example.Panel.PanelComponents;
import org.example.Panel.PanelComponentsProvider;
import org.example.Panel.PanelProvider;

import javax.swing.*;
import java.awt.*;

public class FrameComponents implements FrameComponentsProvider {

    @Override
    public Component addJFrameComponents(PanelProvider panelProvider) {
        return panelProvider.getJPanel();
    }
}
