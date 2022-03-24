package com.nttdata.model.tmf639;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * current line&#39;s provision status
 */
public enum ProvisionStatus {
  
  DONE("done"),
  
  CREATING("creating"),
  
  MODIFYING("modifying"),
  
  DELETING("deleting");

  private String value;

  ProvisionStatus(String value) {
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
  public static ProvisionStatus fromValue(String value) {
    for (ProvisionStatus b : ProvisionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

