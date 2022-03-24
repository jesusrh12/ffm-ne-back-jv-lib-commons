package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible values for the state of the order item
 */
public enum ServiceOrderItemStateType {

    ACKNOWLEDGED("acknowledged"),
    REJECTED("rejected"),
    PENDING("pending"),
    HELD("held"),
    INPROGRESS("inProgress"),
    CANCELED("canceled"),
    COMPLETED("completed"),
    FAILED("failed"),
    ASSESSINGCANCELLATION("assessingCancellation"),
    PENDINGCANCELLATION("pendingCancellation"),
    PARTIAL("partial"),
    PLANNED("planned");

    private final String value;

    ServiceOrderItemStateType(String value) {
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
    public static ServiceOrderItemStateType fromValue(String value) {
        for (ServiceOrderItemStateType b : ServiceOrderItemStateType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

}