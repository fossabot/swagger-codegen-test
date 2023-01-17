package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class EnumFormBody   {
@XmlType(name="EnumFormStringArrayEnum")
@XmlEnum(String.class)
public enum EnumFormStringArrayEnum {

    @XmlEnumValue(">") GREATER_THAN(String.valueOf(">")), @XmlEnumValue("$") DOLLAR(String.valueOf("$"));


    private String value;

    EnumFormStringArrayEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EnumFormStringArrayEnum fromValue(String v) {
        for (EnumFormStringArrayEnum b : EnumFormStringArrayEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private List<EnumFormStringArrayEnum> enumFormStringArray = new ArrayList<EnumFormStringArrayEnum>();
@XmlType(name="EnumFormStringEnum")
@XmlEnum(String.class)
public enum EnumFormStringEnum {

    @XmlEnumValue("_abc") _ABC(String.valueOf("_abc")), @XmlEnumValue("-efg") _EFG(String.valueOf("-efg")), @XmlEnumValue("(xyz)") _XYZ_(String.valueOf("(xyz)"));


    private String value;

    EnumFormStringEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EnumFormStringEnum fromValue(String v) {
        for (EnumFormStringEnum b : EnumFormStringEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private EnumFormStringEnum enumFormString = EnumFormStringEnum._EFG;
@XmlType(name="EnumQueryDoubleEnum")
@XmlEnum(Double.class)
public enum EnumQueryDoubleEnum {

    @XmlEnumValue(1.1) NUMBER_1_DOT_1(Double.valueOf(1.1)), @XmlEnumValue(-1.2) NUMBER_MINUS_1_DOT_2(Double.valueOf(-1.2));


    private Double value;

    EnumQueryDoubleEnum (Double v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EnumQueryDoubleEnum fromValue(String v) {
        for (EnumQueryDoubleEnum b : EnumQueryDoubleEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}
  private EnumQueryDoubleEnum enumQueryDouble = null;

  /**
   * Form parameter enum test (string array)
   **/
  public EnumFormBody enumFormStringArray(List<EnumFormStringArrayEnum> enumFormStringArray) {
    this.enumFormStringArray = enumFormStringArray;
    return this;
  }

  
  
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
  public EnumFormBody enumFormString(EnumFormStringEnum enumFormString) {
    this.enumFormString = enumFormString;
    return this;
  }

  
  
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
  public EnumFormBody enumQueryDouble(EnumQueryDoubleEnum enumQueryDouble) {
    this.enumQueryDouble = enumQueryDouble;
    return this;
  }

  
  
  @Schema(description = "Query parameter enum test (double)")
  @JsonProperty("enum_query_double")
  public EnumQueryDoubleEnum getEnumQueryDouble() {
    return enumQueryDouble;
  }
  public void setEnumQueryDouble(EnumQueryDoubleEnum enumQueryDouble) {
    this.enumQueryDouble = enumQueryDouble;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumFormBody enumFormBody = (EnumFormBody) o;
    return Objects.equals(enumFormStringArray, enumFormBody.enumFormStringArray) &&
        Objects.equals(enumFormString, enumFormBody.enumFormString) &&
        Objects.equals(enumQueryDouble, enumFormBody.enumQueryDouble);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enumFormStringArray, enumFormString, enumQueryDouble);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumFormBody {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
