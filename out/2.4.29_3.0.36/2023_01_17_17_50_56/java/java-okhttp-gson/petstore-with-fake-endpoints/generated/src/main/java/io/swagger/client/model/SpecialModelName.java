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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SpecialModelName
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-01-17T17:54:57.794Z")
public class SpecialModelName {
  @SerializedName("$special[property.name]")
  private Long specialPropertyName = null;

  public SpecialModelName specialPropertyName(Long specialPropertyName) {
    this.specialPropertyName = specialPropertyName;
    return this;
  }

   /**
   * Get specialPropertyName
   * @return specialPropertyName
  **/
  @ApiModelProperty(value = "")
  public Long getSpecialPropertyName() {
    return specialPropertyName;
  }

  public void setSpecialPropertyName(Long specialPropertyName) {
    this.specialPropertyName = specialPropertyName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialModelName specialModelName = (SpecialModelName) o;
    return Objects.equals(this.specialPropertyName, specialModelName.specialPropertyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialPropertyName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialModelName {\n");
    
    sb.append("    specialPropertyName: ").append(toIndentedString(specialPropertyName)).append("\n");
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

