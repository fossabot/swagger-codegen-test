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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Macaw
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T17:58:19.583Z[Etc/UTC]")
public class Macaw implements OneOfinlineResponse200ParrotsItems, InlineResponse2001, AnyOfparrotBodyParrotsItems, ParrotBody1 {
  @SerializedName("color")
  private String color = null;

  @SerializedName("singer")
  private Boolean singer = null;

  public Macaw color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @Schema(description = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Macaw singer(Boolean singer) {
    this.singer = singer;
    return this;
  }

   /**
   * Get singer
   * @return singer
  **/
  @Schema(description = "")
  public Boolean isSinger() {
    return singer;
  }

  public void setSinger(Boolean singer) {
    this.singer = singer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Macaw macaw = (Macaw) o;
    return Objects.equals(this.color, macaw.color) &&
        Objects.equals(this.singer, macaw.singer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, singer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Macaw {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    singer: ").append(toIndentedString(singer)).append("\n");
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
