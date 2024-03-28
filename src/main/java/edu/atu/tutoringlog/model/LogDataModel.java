package edu.atu.tutoringlog.model;

/*
* Data Model Interface for
* - title
* - dateTime
* - studentName
* - courseName
* - instructorName
* - description
*/

public interface LogDataModel {
    void setValue(String value);
    String getValue();
    String toJSONString();
}
