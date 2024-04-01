package edu.atu.tutoringlog.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeModel implements LogDataModel {
    private LocalDateTime dateTime;
    private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    @Override
    public void setValue(String value) {
        try {
            this.dateTime = LocalDateTime.parse(value, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date time format: " + value, e);
        }
    }

    @Override
    public String getValue() {
        return dateTime != null ? dateTime.format(formatter) : null;
    }
}
