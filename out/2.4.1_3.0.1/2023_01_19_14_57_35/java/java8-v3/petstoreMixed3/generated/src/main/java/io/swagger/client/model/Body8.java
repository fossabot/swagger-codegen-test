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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

/**
 * Body8
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:12:20.411Z[Etc/UTC]")public class Body8 {

  @JsonProperty("parrots")

  private List<Object> parrots = null;
  public Body8 parrots(List<Object> parrots) {
    this.parrots = parrots;
    return this;
  }

  public Body8 addParrotsItem(Object parrotsItem) {
    if (this.parrots == null) {
      this.parrots = new ArrayList<>();
    }
    this.parrots.add(parrotsItem);
    return this;
  }

  /**
  * Get parrots
  * @return parrots
  **/
  @Schema(description = "")
  public List<Object> getParrots() {
    return parrots;
  }
  public void setParrots(List<Object> parrots) {
    this.parrots = parrots;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body8 body8 = (Body8) o;
    return Objects.equals(this.parrots, body8.parrots);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(parrots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body8 {\n");
    
    sb.append("    parrots: ").append(toIndentedString(parrots)).append("\n");
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
