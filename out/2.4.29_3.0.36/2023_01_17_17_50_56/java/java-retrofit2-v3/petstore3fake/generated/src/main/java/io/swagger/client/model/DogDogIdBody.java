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
 * DogDogIdBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:05:37.022Z[Etc/UTC]")
public class DogDogIdBody {
  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  public DogDogIdBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Updated name of the dog
   * @return name
  **/
  @Schema(description = "Updated name of the dog")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DogDogIdBody status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Updated status of the dog
   * @return status
  **/
  @Schema(description = "Updated status of the dog")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DogDogIdBody dogDogIdBody = (DogDogIdBody) o;
    return Objects.equals(this.name, dogDogIdBody.name) &&
        Objects.equals(this.status, dogDogIdBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DogDogIdBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
