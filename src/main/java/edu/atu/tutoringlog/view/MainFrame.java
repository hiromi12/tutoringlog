package edu.atu.tutoringlog.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {

    // tab manu "Home" and "Create New Log"
    private final JTabbedPane tabbedPane;
    private HomePagePanel homePagePanel;
    private NewLogPagePanel newLogPagePanel;

    public MainFrame() {
        // set the title
        super("Tutoring Log");

        // configure the main frame's properties
        setSize(1200, 800);  // frame size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation
        setLayout(new BorderLayout());  // set layout manager

        // initialize the tabbed pane
        tabbedPane = new JTabbedPane();

        // initialize and add the home panel and the new log page panel
        homePagePanel = new HomePagePanel();
        newLogPagePanel = new NewLogPagePanel();
        tabbedPane.addTab("Home", homePagePanel);
        tabbedPane.addTab("New", newLogPagePanel);

        // add the tabbed pane to the frame
        add(tabbedPane, BorderLayout.CENTER);

        // make it visible
        setVisible(true);
    }
}
