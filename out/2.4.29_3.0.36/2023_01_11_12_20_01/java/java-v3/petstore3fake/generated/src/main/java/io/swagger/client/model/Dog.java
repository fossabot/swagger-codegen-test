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
import io.swagger.client.model.Animal;
import io.swagger.client.model.DogAllOf2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Dog
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-11T12:21:29.339Z[Etc/UTC]")
public class Dog extends Animal implements InlineArrayItemsAllPetsResponse, OneOfSinglePetResponsePet {
  @SerializedName("breed")
  private String breed = null;

  public Dog breed(String breed) {
    this.breed = breed;
    return this;
  }

   /**
   * Get breed
   * @return breed
  **/
  @Schema(description = "")
  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dog dog = (Dog) o;
    return Objects.equals(this.breed, dog.breed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breed, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
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
