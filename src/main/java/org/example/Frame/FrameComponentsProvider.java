package org.example.Frame;

import org.example.Dimensions.DimensionProvider;
import org.example.Panel.PanelComponentsProvider;
import org.example.Panel.PanelProvider;

import java.awt.*;

public interface FrameComponentsProvider {

    Component addJFrameComponents(PanelProvider panelProvider);
}
