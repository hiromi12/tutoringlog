package edu.atu.tutoringlog.model;

import java.time.LocalDateTime;

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
}
