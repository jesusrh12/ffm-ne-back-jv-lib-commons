package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Possible values for the state of a task
 */
public enum TaskStateType {

    ACCEPTED("accepted"),
    TERMINATEDWITHERROR("terminatedWithError"),
    INPROGRESS("inProgress"),
    DONE("done");

    private final String value;

    TaskStateType(String value) {
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
    public static TaskStateType fromValue(String value) {
        for (TaskStateType b : TaskStateType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

}