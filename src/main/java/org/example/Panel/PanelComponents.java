package org.example.Panel;

import org.example.Buttons.Buttons;
import org.example.Buttons.ButtonsProvider;

import javax.swing.*;
import java.util.Arrays;

public class PanelComponents implements PanelComponentsProvider {

    @Override
    public JButton[] addJPanelComponents() {
        ButtonsProvider buttonsProvider = new Buttons();
        return buttonsProvider.getButtons();
    }
}
