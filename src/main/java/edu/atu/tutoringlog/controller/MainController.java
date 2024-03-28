package edu.atu.tutoringlog.controller;

import edu.atu.tutoringlog.view.HomePagePanel;
import edu.atu.tutoringlog.view.MainFrame;
import edu.atu.tutoringlog.view.NewLogPagePanel;
import edu.atu.tutoringlog.model.*;
import javax.swing.SwingUtilities;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Collections;

public class MainController {
    private final MainFrame mainFrame;
    private final NewLogPagePanel newLogForm;
    private final HomePagePanel tableView;

    public MainController () {
        // initialize the home panel and the new log page panel
        tableView = new HomePagePanel();
        newLogForm = new NewLogPagePanel();
        mainFrame = new MainFrame(tableView, newLogForm);   // Build main frame

        // fetch data and build table
        fetchDataAndUpdateTable();
    }

    private void fetchDataAndUpdateTable() {
        // fetching data from the models
        List<LogEntry> logEntries = fetchDataFromModels();

        // update the table iew with this data
        SwingUtilities.invokeLater(() -> tableView.setTableData(logEntries));
    }

    private List<LogEntry> fetchDataFromModels() {
        String filePath = "data/tutoringLog.json"; // Adjust the file path as needed
        try {
            // Read the content of the JSON file into a String
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
            // Parse the JSON string into a list of LogEntry objects
            List<LogEntry> logEntries = JsonUtil.fromJSONString(jsonString);
            return logEntries;
        } catch (IOException e) {
            e.printStackTrace();
            // Handle file reading errors
            System.out.println("File not found.");
        }
        // Return an empty list or null in case of errors, depending on your error handling strategy
        return Collections.emptyList();
    }
}
