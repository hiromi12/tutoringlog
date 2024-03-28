package edu.atu.tutoringlog.model;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.List;

public class JsonUtil {

    public static List<LogEntry> fromJSONString(String jsonString) {
        List<LogEntry> logEntries = new ArrayList<>();

        try {
            JSONObject root = new JSONObject(jsonString);
            JSONArray logs = root.getJSONArray("tutoringLogs");

            for (int i = 0; i < logs.length(); i++) {
                // split logs into each log entries
                JSONObject logJson = logs.getJSONObject(i);
                // initialize new log entry
                LogEntry logEntry = new LogEntry();

                // safely extract data using optString instead of getString to avoid JSONException
                logEntry.setTitle(logJson.optString("title", "Default Title"));
                logEntry.setDateTime(logJson.optString("dateTime", "1970-01-01T00:00:00"));
                logEntry.setStudentName(logJson.optString("studentName", "Unknown"));
                logEntry.setCourseName(logJson.optString("courseName", "Unknown Course"));
                logEntry.setInstructorName(logJson.optString("instructorName", "Unknown Instructor"));
                logEntry.setDescription(logJson.optString("description", ""));

                logEntries.add(logEntry);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            // TODO: Handle the error, possibly logging it or informing the user
        }
        return logEntries;
    }
}
