package org.example.Frame;

import org.example.Panel.PanelProvider;

import javax.swing.*;
import java.awt.*;

public interface FrameComponentsProvider {

    JPanel addJFrameComponents(PanelProvider panelProvider);
}
