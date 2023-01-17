package io.swagger.server.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets OuterEnum
 */
public enum OuterEnum {
  
  PLACED("placed"),
  
  APPROVED("approved"),
  
  DELIVERED("delivered");

  private String value;

  OuterEnum(String value) {
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

  public static OuterEnum fromValue(String value) {
    for (OuterEnum b : OuterEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}
