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
/**
 * PartFour
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:07:34.941Z[Etc/UTC]")
public class PartFour implements OneOfPartMasterOrigin {
  @SerializedName("otherIdPart")
  private String otherIdPart = null;

  public PartFour otherIdPart(String otherIdPart) {
    this.otherIdPart = otherIdPart;
    return this;
  }

   /**
   * Get otherIdPart
   * @return otherIdPart
  **/
  @Schema(description = "")
  public String getOtherIdPart() {
    return otherIdPart;
  }

  public void setOtherIdPart(String otherIdPart) {
    this.otherIdPart = otherIdPart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartFour partFour = (PartFour) o;
    return Objects.equals(this.otherIdPart, partFour.otherIdPart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherIdPart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartFour {\n");
    
    sb.append("    otherIdPart: ").append(toIndentedString(otherIdPart)).append("\n");
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
