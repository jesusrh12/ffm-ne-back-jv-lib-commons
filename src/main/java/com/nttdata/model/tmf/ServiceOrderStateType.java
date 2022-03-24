package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible values for the state of the order
 */
public enum ServiceOrderStateType {

    ACKNOWLEDGED("acknowledged"),
    REJECTED("rejected"),
    PENDING("pending"),
    HELD("held"),
    INPROGRESS("inProgress"),
    CANCELLED("cancelled"),
    COMPLETED("completed"),
    FAILED("failed"),
    PARTIAL("partial"),
    ASSESSINGCANCELLATION("assessingCancellation"),
    PENDINGCANCELLATION("pendingCancellation"),
    DELETED("deleted"),
    PLANNED("planned");

    private final String value;

    ServiceOrderStateType(String value) {
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

    @JsonCreator
    public static ServiceOrderStateType fromValue(String value) {
        for (ServiceOrderStateType b : ServiceOrderStateType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

}