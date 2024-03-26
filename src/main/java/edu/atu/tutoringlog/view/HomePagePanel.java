package edu.atu.tutoringlog.view;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class HomePagePanel extends JPanel {

    private JTable logTable;
    public HomePagePanel() {
        setLayout(new BorderLayout());

        // set up the column names for the table
        String[] columnNames = {"Date/Time", "Title", "Student Name", "Course", "Instructor"};

        Object[][] data = {};

        // set the table model
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        logTable = new JTable(model);

        // add the scroll pane to the panel
        JScrollPane scrollPane = new JScrollPane(logTable);

        // add the scroll pane to the panel
        add(scrollPane, BorderLayout.CENTER);
    }

    public void setTableData(Object[][] data) {

    }
}
