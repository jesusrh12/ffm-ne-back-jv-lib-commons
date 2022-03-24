package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WorkTicketStatusType {
    ACKNOWLEDGED("acknowledged"),
    REJECTED("rejected"),
    PLANNED("planned"),
    SUBMITTED("submitted"),
    BLOCKED("blocked"),
    DONE("done"),
    PENDING("pending"),
    HELD("held"),
    IN_PROGRESS("in_Progress"),
    CANCELED("canceled"),
    CLOSED("closed"),
    RESOLVED("resolved");

    private final String value;

    WorkTicketStatusType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static WorkTicketStatusType fromValue(String text) {
        for (WorkTicketStatusType b : WorkTicketStatusType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
