package edu.atu.tutoringlog.view;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class NewLogPagePanel extends JPanel {

    // UI components
    private JTextField studentNameField;
    private JTextField dateTimeField;
    private JTextField logTitleField;
    private JTextField courseNameField;
    private JTextField instructorNameField;
    private JTextArea descriptionArea;
    private JButton submitButton;
//    private JButton clearButton;

    public NewLogPagePanel() {
        // TODO: Modify text field size
        setLayout(new GridBagLayout()); // set the layout manager
        GridBagConstraints constraints = new GridBagConstraints();

        // common constraints
        constraints.insets = new Insets(5, 20, 5, 20); // margin for components
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.fill = GridBagConstraints.HORIZONTAL; // fill the space horizontally

        // Add components to the panel
        // Title
        constraints.gridx = 0; // column 0
        constraints.gridy = 0; // row 0
        constraints.gridwidth = 2; // takes 2 columns
        add(new JLabel("Title:"), constraints);

        constraints.gridx = 0; // column 0
        constraints.gridy = 1; // row 1
        constraints.gridwidth = 2; // reset to 2 columns
        logTitleField = new JTextField(20);
        add(logTitleField, constraints);

        constraints.weightx = 0.5; // Set weight of each text field to be equal
        // Student Name
        constraints.gridx = 0; // column 0
        constraints.gridy = 2; // row 2
        constraints.gridwidth = 1; // this component takes up one column
        add(new JLabel("Student Name:"), constraints);

        constraints.gridy = 3; // row 3
        studentNameField = new JTextField(20);
        add(studentNameField, constraints);

        // Date/Time
        constraints.gridx = 1; // column 1
        constraints.gridy = 2; // row 2
        add(new JLabel("Date/Time:"), constraints);

        constraints.gridy = 3; // row 3
        dateTimeField = new JTextField(20);
        add(dateTimeField, constraints);

        // Course Name
        constraints.gridx = 0; // column 0
        constraints.gridy = 4; // row 4
        add(new JLabel("Course Name:"), constraints);

        constraints.gridy = 5; // row 5
        courseNameField = new JTextField(20);
        add(courseNameField, constraints);

        // Instructor Name
        constraints.gridx = 1; // column 1
        constraints.gridy = 4; // row 4
        add(new JLabel("Instructor:"), constraints);

        constraints.gridy = 5; // row 5
        instructorNameField = new JTextField(20);
        add(instructorNameField, constraints);

        // Reset the weightx for other components if they do not need to be evenly distributed
        constraints.weightx = 0;
        // Description
        constraints.gridx = 0; // column 0
        constraints.gridy = 6; // row 6
        constraints.gridwidth = 2; // takes 2 columns
        add(new JLabel("Description:"), constraints);

        constraints.gridy = 7; // row 7
        descriptionArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(descriptionArea); // Allow scrolling
        constraints.weightx = 1.0; // Allow this row to grow
        constraints.weighty = 1.0; // Allow this row to grow
        constraints.fill = GridBagConstraints.BOTH; // Fill both horizontally and vertically
        add(scrollPane, constraints);

        // Submit Button
        constraints.gridx = 1; // Reset to column 0
        constraints.gridy = 8; // row 8
        constraints.gridwidth = 2; // Span across two columns
        constraints.weighty = 0; // Reset to default
        constraints.fill = GridBagConstraints.CENTER;
        submitButton = new JButton("Submit");
        add(submitButton, constraints);

        // TODO: Implement clear button
    }
}
