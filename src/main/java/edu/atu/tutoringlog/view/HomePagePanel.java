package edu.atu.tutoringlog.view;

import edu.atu.tutoringlog.model.LogEntry;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JScrollPane;

public class HomePagePanel extends JPanel {

    private JTable logTable;
    private DefaultTableModel model;

    public HomePagePanel() {
        setLayout(new BorderLayout());

        // Set up the column names for the table
        String[] columnNames = {"Date/Time", "Title", "Student Name", "Course", "Instructor"};

        // Initialize the table model with no data initially
        model = new DefaultTableModel(columnNames, 0); // 0 indicates no rows initially
        logTable = new JTable(model);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(logTable);

        // Add the scroll pane to the panel
        add(scrollPane, BorderLayout.CENTER);
    }

    public void setTableData(List<LogEntry> logEntries) {
        // Clear existing data
        model.setRowCount(0);

        // Add new data from logEntries
        for (LogEntry entry : logEntries) {
            Object[] row = new Object[5];
            row[0] = entry.getDateTime();
            row[1] = entry.getTitle();
            row[2] = entry.getStudentName();
            row[3] = entry.getCourseName();
            row[4] = entry.getInstructorName();

            model.addRow(row); // Add the row to the model
        }
    }
}