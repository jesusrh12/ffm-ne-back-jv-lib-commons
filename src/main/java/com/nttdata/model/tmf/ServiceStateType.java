package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Valid values for the lifecycle state of the service
 */
public enum ServiceStateType {

    FEASIBILITYCHECKED("feasibilityChecked"),
    DESIGNED("designed"),
    RESERVED("reserved"),
    INACTIVE("inactive"),
    ACTIVE("active"),
    TERMINATED("terminated"),
    PLANNED("planned"),
    DELETED("deleted");

    private final String value;

    ServiceStateType(String value) {
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
    public static ServiceStateType fromValue(String value) {
        for (ServiceStateType b : ServiceStateType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

}