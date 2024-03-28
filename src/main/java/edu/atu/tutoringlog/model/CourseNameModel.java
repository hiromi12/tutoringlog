package edu.atu.tutoringlog.model;

public class CourseNameModel implements LogDataModel {
    private String courseName;
    @Override
    public void setValue(String value) {
        this.courseName = value;
    }

    @Override
    public String getValue() {
        return courseName;
    }

    @Override
    public String toJSONString() {
        // TODO: Implement toJSONString method for courseName
        return null;
    }
}
