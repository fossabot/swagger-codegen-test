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
 * Cat
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:16:53.133Z[Etc/UTC]")public class Cat extends Pet {

  @SerializedName("hunts")
  private Boolean hunts = null;

  @SerializedName("age")
  private Integer age = null;
  public Cat hunts(Boolean hunts) {
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
  public Cat age(Integer age) {
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
    Cat cat = (Cat) o;
    return Objects.equals(this.hunts, cat.hunts) &&
        Objects.equals(this.age, cat.age) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(hunts, age, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
