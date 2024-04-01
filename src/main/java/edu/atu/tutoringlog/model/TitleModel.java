package edu.atu.tutoringlog.model;

public class TitleModel implements LogDataModel {
    private String title;
    @Override
    public void setValue(String value) {
        this.title = value;
    }

    @Override
    public String getValue() {
        return title;
    }
}
