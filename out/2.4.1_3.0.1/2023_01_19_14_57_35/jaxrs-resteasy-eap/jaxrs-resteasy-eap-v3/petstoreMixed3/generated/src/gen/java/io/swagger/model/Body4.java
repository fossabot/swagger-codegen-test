package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-19T15:18:05.971Z[Etc/UTC]")public class Body4   {
  /**
   * Gets or Sets enumFormStringArray
   */
  public enum EnumFormStringArrayEnum {
    GREATER_THAN(">"),

        DOLLAR("$");
    private String value;

    EnumFormStringArrayEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<EnumFormStringArrayEnum> enumFormStringArray = new ArrayList<EnumFormStringArrayEnum>();
  /**
   * Form parameter enum test (string)
   */
  public enum EnumFormStringEnum {
    _ABC("_abc"),

        _EFG("-efg"),

        _XYZ_("(xyz)");
    private String value;

    EnumFormStringEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EnumFormStringEnum enumFormString = EnumFormStringEnum._EFG;
  /**
   * Query parameter enum test (double)
   */
  public enum EnumQueryDoubleEnum {
    NUMBER_1_DOT_1(1.1),

        NUMBER_MINUS_1_DOT_2(-1.2);
    private Double value;

    EnumQueryDoubleEnum(Double value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EnumQueryDoubleEnum enumQueryDouble = null;

  /**
   * Form parameter enum test (string array)
   **/
  
  @Schema(description = "Form parameter enum test (string array)")
  @JsonProperty("enum_form_string_array")
  public List<EnumFormStringArrayEnum> getEnumFormStringArray() {
    return enumFormStringArray;
  }
  public void setEnumFormStringArray(List<EnumFormStringArrayEnum> enumFormStringArray) {
    this.enumFormStringArray = enumFormStringArray;
  }

  /**
   * Form parameter enum test (string)
   **/
  
  @Schema(description = "Form parameter enum test (string)")
  @JsonProperty("enum_form_string")
  public EnumFormStringEnum getEnumFormString() {
    return enumFormString;
  }
  public void setEnumFormString(EnumFormStringEnum enumFormString) {
    this.enumFormString = enumFormString;
  }

  /**
   * Query parameter enum test (double)
   **/
  
  @Schema(description = "Query parameter enum test (double)")
  @JsonProperty("enum_query_double")
  public EnumQueryDoubleEnum getEnumQueryDouble() {
    return enumQueryDouble;
  }
  public void setEnumQueryDouble(EnumQueryDoubleEnum enumQueryDouble) {
    this.enumQueryDouble = enumQueryDouble;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body4 body4 = (Body4) o;
    return Objects.equals(enumFormStringArray, body4.enumFormStringArray) &&
        Objects.equals(enumFormString, body4.enumFormString) &&
        Objects.equals(enumQueryDouble, body4.enumQueryDouble);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumFormStringArray, enumFormString, enumQueryDouble);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    
    sb.append("    enumFormStringArray: ").append(toIndentedString(enumFormStringArray)).append("\n");
    sb.append("    enumFormString: ").append(toIndentedString(enumFormString)).append("\n");
    sb.append("    enumQueryDouble: ").append(toIndentedString(enumQueryDouble)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
