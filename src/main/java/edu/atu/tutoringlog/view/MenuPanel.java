package edu.atu.tutoringlog.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;

public class MenuPanel extends JPanel {
    public MenuPanel() {
        setPreferredSize(new Dimension(getWidth(), 40));

        // buttons
        JButton homeButton = new JButton("Home");
        JButton createNewButton = new JButton("New");

        // add the buttons to the panel
        add(homeButton);
        add(createNewButton);
    }
}
