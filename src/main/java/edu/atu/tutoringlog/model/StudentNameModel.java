package edu.atu.tutoringlog.model;

public class StudentNameModel implements LogDataModel {
    private String studentName;
    @Override
    public void setValue(String value) {
        this.studentName = value;
    }

    @Override
    public String getValue() {
        return studentName;
    }

    @Override
    public String toJSONString() {
        // TODO: Implement toJSONString method for studentName
        return null;
    }
}
