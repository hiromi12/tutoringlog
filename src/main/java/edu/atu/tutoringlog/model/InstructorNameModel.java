package edu.atu.tutoringlog.model;

public class InstructorNameModel implements LogDataModel {
    private String instructorName;
    @Override
    public void setValue(String value) {
        this.instructorName = value;
    }

    @Override
    public String getValue() {
        return instructorName;
    }

    @Override
    public String toJSONString() {
        // TODO: Implement toJSONString method for instructorName
        return null;
    }
}
