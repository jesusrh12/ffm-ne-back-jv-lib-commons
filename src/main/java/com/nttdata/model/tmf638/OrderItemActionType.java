package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderItemActionType {

	ADD("add"),
	MODIFY("modify"),
	DELETE("delete"),
	NO_CHANGE("noChange");
	
	private final String value;
	
	OrderItemActionType(String value){
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
    public static OrderItemActionType fromValue(String value) {        
		for (OrderItemActionType b : OrderItemActionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");	
	}
}
