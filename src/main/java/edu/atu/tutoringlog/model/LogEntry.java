package edu.atu.tutoringlog.model;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class LogEntry {
    private String dateTime;
    private String title;
    private String studentName;
    private String courseName;
    private String instructor;
    private String description;
    // other fields like student name, course name, instructor, etc.

    // Constructors, getters, and setters
    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getInstructorName() {
        return instructor;
    }
    public void setInstructorName(String instructor) {
        this.instructor = instructor;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void createNewLog(String title,
                             String dateTime,
                             String studentName,
                             String courseName,
                             String instructor,
                             String description) {
        LogEntry logEntry = new LogEntry();
        logEntry.setTitle(title);
        logEntry.setDateTime(dateTime);
        logEntry.setStudentName(studentName);
        logEntry.setCourseName(courseName);
        logEntry.setInstructorName(instructor);
        logEntry.setDescription(description);

        // convert LogEntry to JSON
        JSONObject logJson = new JSONObject();
        try {
            logJson.put("title", logEntry.getTitle());
            logJson.put("dateTime", logEntry.getDateTime());
            logJson.put("studentName", logEntry.getStudentName());
            logJson.put("courseName", logEntry.getCourseName());
            logJson.put("instructorName", logEntry.getInstructorName());
            logJson.put("description", logEntry.getDescription());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }

        // append to JSON file
        appendLogToJsonFile(logJson, "data/tutoringLog.json");
    }

    private static void appendLogToJsonFile(JSONObject logEntry, String filePath) {
        try {
            JSONObject root;
            if (Files.exists(Paths.get(filePath))) {
                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                root = new JSONObject(content);
            } else {
                root = new JSONObject();
                root.put("tutoringLogs", new JSONArray());
            }

            root.getJSONArray("tutoringLogs").put(logEntry);

            // write back to the file
            Files.write(Paths.get(filePath), root.toString(4).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}
