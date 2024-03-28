package edu.atu.tutoringlog.model;

public class DescriptionModel implements LogDataModel {
    private String description;
    @Override
    public void setValue(String value) {
        this.description = value;
    }

    @Override
    public String getValue() {
        return description;
    }

    @Override
    public String toJSONString() {
        // TODO: Implement toJSONString method for description
        return null;
    }
}
