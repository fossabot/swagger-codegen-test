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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.Cat;
import io.swagger.client.model.Dog;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Pup
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:17:17.976Z[Etc/UTC]")public class Pup {

  @JsonProperty("bark")

  private Boolean bark = null;
  /**
   * Gets or Sets breed
   */
  public enum BreedEnum {
    DINGO("Dingo"),
    HUSKY("Husky"),
    RETRIEVER("Retriever"),
    SHEPHERD("Shepherd");

    private String value;

    BreedEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static BreedEnum fromValue(String text) {
      for (BreedEnum b : BreedEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("breed")

  private BreedEnum breed = null;

  @JsonProperty("hunts")

  private Boolean hunts = null;

  @JsonProperty("age")

  private Integer age = null;
  public Pup bark(Boolean bark) {
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
  public Pup breed(BreedEnum breed) {
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
  public Pup hunts(Boolean hunts) {
    this.hunts = hunts;
    return this;
  }

  

  /**
  * Get hunts
  * @return hunts
  **/
  @Schema(description = "")
  public Boolean isHunts() {
    return hunts;
  }
  public void setHunts(Boolean hunts) {
    this.hunts = hunts;
  }
  public Pup age(Integer age) {
    this.age = age;
    return this;
  }

  

  /**
  * Get age
  * @return age
  **/
  @Schema(description = "")
  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pup pup = (Pup) o;
    return Objects.equals(this.bark, pup.bark) &&
        Objects.equals(this.breed, pup.breed) &&
        Objects.equals(this.hunts, pup.hunts) &&
        Objects.equals(this.age, pup.age);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(bark, breed, hunts, age);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pup {\n");
    
    sb.append("    bark: ").append(toIndentedString(bark)).append("\n");
    sb.append("    breed: ").append(toIndentedString(breed)).append("\n");
    sb.append("    hunts: ").append(toIndentedString(hunts)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
