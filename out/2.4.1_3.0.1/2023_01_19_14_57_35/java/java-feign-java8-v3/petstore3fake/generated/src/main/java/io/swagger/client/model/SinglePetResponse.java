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

/**
 * SinglePetResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:16:11.304Z[Etc/UTC]")public class SinglePetResponse {

  @JsonProperty("pet")

  private Object pet = null;
  public SinglePetResponse pet(Object pet) {
    this.pet = pet;
    return this;
  }

  

  /**
  * Get pet
  * @return pet
  **/
  @Schema(description = "")
  public Object getPet() {
    return pet;
  }
  public void setPet(Object pet) {
    this.pet = pet;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SinglePetResponse singlePetResponse = (SinglePetResponse) o;
    return Objects.equals(this.pet, singlePetResponse.pet);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(pet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SinglePetResponse {\n");
    
    sb.append("    pet: ").append(toIndentedString(pet)).append("\n");
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
