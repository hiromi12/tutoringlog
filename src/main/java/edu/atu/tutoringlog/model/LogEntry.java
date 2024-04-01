package edu.atu.tutoringlog.model;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class LogEntry {
    public TitleModel title = new TitleModel();
    public DateTimeModel dateTime = new DateTimeModel();
    public StudentNameModel studentName = new StudentNameModel();
    public CourseNameModel courseName = new CourseNameModel();
    public InstructorNameModel instructor = new InstructorNameModel();
    public DescriptionModel description = new DescriptionModel();

    public void createNewLog(String title,
                             String dateTime,
                             String studentName,
                             String courseName,
                             String instructor,
                             String description) {
        LogEntry logEntry = new LogEntry();
        logEntry.title.setValue(title);
        logEntry.dateTime.setValue(dateTime);
        logEntry.studentName.setValue(studentName);
        logEntry.courseName.setValue(courseName);
        logEntry.instructor.setValue(instructor);
        logEntry.description.setValue(description);

        // convert LogEntry to JSON
        JSONObject logJson = new JSONObject();
        try {
            logJson.put("title", logEntry.title.getValue());
            logJson.put("dateTime", logEntry.dateTime.getValue());
            logJson.put("studentName", logEntry.studentName.getValue());
            logJson.put("courseName", logEntry.courseName.getValue());
            logJson.put("instructorName", logEntry.instructor.getValue());
            logJson.put("description", logEntry.description.getValue());
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
