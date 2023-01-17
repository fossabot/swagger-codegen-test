/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * NullableEnumModel
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:05:10.134Z[Etc/UTC]")
public class NullableEnumModel {
  /**
   * Gets or Sets enumProp
   */
  public enum EnumPropEnum {
    A("a"),
    B("b"),
    NULL(null);

    private String value;

    EnumPropEnum(String value) {
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
    public static EnumPropEnum fromValue(String input) {
      for (EnumPropEnum b : EnumPropEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("enumProp")
  private EnumPropEnum enumProp = null;

  public NullableEnumModel enumProp(EnumPropEnum enumProp) {
    this.enumProp = enumProp;
    return this;
  }

   /**
   * Get enumProp
   * @return enumProp
  **/
  @Schema(description = "")
  public EnumPropEnum getEnumProp() {
    return enumProp;
  }

  public void setEnumProp(EnumPropEnum enumProp) {
    this.enumProp = enumProp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullableEnumModel nullableEnumModel = (NullableEnumModel) o;
    return Objects.equals(this.enumProp, nullableEnumModel.enumProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumProp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableEnumModel {\n");
    
    sb.append("    enumProp: ").append(toIndentedString(enumProp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
