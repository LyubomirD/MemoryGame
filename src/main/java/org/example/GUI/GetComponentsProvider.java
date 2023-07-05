package org.example.GUI;

import org.example.GUI.Panel.PanelProvider;

import java.awt.*;

public interface GetComponentsProvider {

    Component[] getMultipleComponents();

    Component getSingleComponent();

}
