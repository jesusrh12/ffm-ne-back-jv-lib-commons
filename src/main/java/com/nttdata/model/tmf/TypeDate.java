


package com.nttdata.model.tmf;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TypeDate {

    MODIFICATIONDATE("modificationDate"),
    EXECUTIONDATE("executionDate"),
    ENDEXECUTIONDATE("endExecutionDate");


    private final String value;

    TypeDate(String value) {
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
    public static TypeDate fromValue(String value) {
        for (TypeDate b : TypeDate.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }


}