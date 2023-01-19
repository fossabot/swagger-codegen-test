/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
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
import io.swagger.client.model.Pet;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.List;

/**
 * Dog
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:16:53.133Z[Etc/UTC]")public class Dog extends Pet {

  @SerializedName("bark")
  private Boolean bark = null;
  /**
   * Gets or Sets breed
   */
  @JsonAdapter(BreedEnum.Adapter.class)
  public enum BreedEnum {
    DINGO("Dingo"),
    HUSKY("Husky"),
    RETRIEVER("Retriever"),
    SHEPHERD("Shepherd");

    private String value;

    BreedEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static BreedEnum fromValue(String text) {
      for (BreedEnum b : BreedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<BreedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BreedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BreedEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BreedEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("breed")
  private BreedEnum breed = null;
  public Dog bark(Boolean bark) {
    this.bark = bark;
    return this;
  }

  

  /**
  * Get bark
  * @return bark
  **/
  @Schema(description = "")
  public Boolean isBark() {
    return bark;
  }
  public void setBark(Boolean bark) {
    this.bark = bark;
  }
  public Dog breed(BreedEnum breed) {
    this.breed = breed;
    return this;
  }

  

  /**
  * Get breed
  * @return breed
  **/
  @Schema(description = "")
  public BreedEnum getBreed() {
    return breed;
  }
  public void setBreed(BreedEnum breed) {
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
    return Objects.equals(this.bark, dog.bark) &&
        Objects.equals(this.breed, dog.breed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(bark, breed, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
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
