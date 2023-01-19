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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * PartThree
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:17:44.472Z[Etc/UTC]")public class PartThree {

  @SerializedName("otherId")
  private String otherId = null;
  public PartThree otherId(String otherId) {
    this.otherId = otherId;
    return this;
  }

  

  /**
  * Get otherId
  * @return otherId
  **/
  @Schema(description = "")
  public String getOtherId() {
    return otherId;
  }
  public void setOtherId(String otherId) {
    this.otherId = otherId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartThree partThree = (PartThree) o;
    return Objects.equals(this.otherId, partThree.otherId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(otherId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartThree {\n");
    
    sb.append("    otherId: ").append(toIndentedString(otherId)).append("\n");
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
