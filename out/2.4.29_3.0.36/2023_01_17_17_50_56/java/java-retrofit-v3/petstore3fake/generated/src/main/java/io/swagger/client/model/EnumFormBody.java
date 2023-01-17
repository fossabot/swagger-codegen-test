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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * EnumFormBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:05:45.855Z[Etc/UTC]")
public class EnumFormBody {
  /**
   * Gets or Sets enumFormStringArray
   */
  @JsonAdapter(EnumFormStringArrayEnum.Adapter.class)
  public enum EnumFormStringArrayEnum {
    GREATER_THAN(">"),
    DOLLAR("$");

    private String value;

    EnumFormStringArrayEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumFormStringArrayEnum fromValue(String input) {
      for (EnumFormStringArrayEnum b : EnumFormStringArrayEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumFormStringArrayEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumFormStringArrayEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EnumFormStringArrayEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EnumFormStringArrayEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("enum_form_string_array")
  private List<EnumFormStringArrayEnum> enumFormStringArray = null;

  /**
   * Form parameter enum test (string)
   */
  @JsonAdapter(EnumFormStringEnum.Adapter.class)
  public enum EnumFormStringEnum {
    _ABC("_abc"),
    _EFG("-efg"),
    _XYZ_("(xyz)");

    private String value;

    EnumFormStringEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumFormStringEnum fromValue(String input) {
      for (EnumFormStringEnum b : EnumFormStringEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumFormStringEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumFormStringEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EnumFormStringEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EnumFormStringEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("enum_form_string")
  private EnumFormStringEnum enumFormString = EnumFormStringEnum._EFG;

  /**
   * Query parameter enum test (double)
   */
  @JsonAdapter(EnumQueryDoubleEnum.Adapter.class)
  public enum EnumQueryDoubleEnum {
    NUMBER_1_DOT_1(1.1),
    NUMBER_MINUS_1_DOT_2(-1.2);

    private Double value;

    EnumQueryDoubleEnum(Double value) {
      this.value = value;
    }
    public Double getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnumQueryDoubleEnum fromValue(Double input) {
      for (EnumQueryDoubleEnum b : EnumQueryDoubleEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnumQueryDoubleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnumQueryDoubleEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public EnumQueryDoubleEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return EnumQueryDoubleEnum.fromValue((Double)(value));
      }
    }
  }  @SerializedName("enum_query_double")
  private EnumQueryDoubleEnum enumQueryDouble = null;

  public EnumFormBody enumFormStringArray(List<EnumFormStringArrayEnum> enumFormStringArray) {
    this.enumFormStringArray = enumFormStringArray;
    return this;
  }

  public EnumFormBody addEnumFormStringArrayItem(EnumFormStringArrayEnum enumFormStringArrayItem) {
    if (this.enumFormStringArray == null) {
      this.enumFormStringArray = new ArrayList<EnumFormStringArrayEnum>();
    }
    this.enumFormStringArray.add(enumFormStringArrayItem);
    return this;
  }

   /**
   * Form parameter enum test (string array)
   * @return enumFormStringArray
  **/
  @Schema(description = "Form parameter enum test (string array)")
  public List<EnumFormStringArrayEnum> getEnumFormStringArray() {
    return enumFormStringArray;
  }

  public void setEnumFormStringArray(List<EnumFormStringArrayEnum> enumFormStringArray) {
    this.enumFormStringArray = enumFormStringArray;
  }

  public EnumFormBody enumFormString(EnumFormStringEnum enumFormString) {
    this.enumFormString = enumFormString;
    return this;
  }

   /**
   * Form parameter enum test (string)
   * @return enumFormString
  **/
  @Schema(description = "Form parameter enum test (string)")
  public EnumFormStringEnum getEnumFormString() {
    return enumFormString;
  }

  public void setEnumFormString(EnumFormStringEnum enumFormString) {
    this.enumFormString = enumFormString;
  }

  public EnumFormBody enumQueryDouble(EnumQueryDoubleEnum enumQueryDouble) {
    this.enumQueryDouble = enumQueryDouble;
    return this;
  }

   /**
   * Query parameter enum test (double)
   * @return enumQueryDouble
  **/
  @Schema(description = "Query parameter enum test (double)")
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
    return Objects.equals(this.enumFormStringArray, enumFormBody.enumFormStringArray) &&
        Objects.equals(this.enumFormString, enumFormBody.enumFormString) &&
        Objects.equals(this.enumQueryDouble, enumFormBody.enumQueryDouble);
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
