package edu.atu.tutoringlog.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {

    // tab manu "Home" and "Create New Log"
    private final JTabbedPane tabbedPane;

    public MainFrame(HomePagePanel homePagePanel, NewLogPagePanel newLogPagePanel) {
        // set the title
        super("Tutoring Log");

        // configure the main frame's properties
        setSize(900, 600);  // frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation
        setLayout(new BorderLayout());  // set layout manager

        // initialize the tabbed pane
        tabbedPane = new JTabbedPane();

        // initialize and add the home panel and the new log page panel
        tabbedPane.addTab("Home", homePagePanel);
        tabbedPane.addTab("New", newLogPagePanel);

        // add the tabbed pane to the frame
        add(tabbedPane, BorderLayout.CENTER);

        // make it visible
        setVisible(true);
    }
}
