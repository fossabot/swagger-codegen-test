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
 * List
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:07:35.986Z[Etc/UTC]")
public class List {
  @SerializedName("123-list")
  private String _123List = null;

  public List _123List(String _123List) {
    this._123List = _123List;
    return this;
  }

   /**
   * Get _123List
   * @return _123List
  **/
  @Schema(description = "")
  public String get123List() {
    return _123List;
  }

  public void set123List(String _123List) {
    this._123List = _123List;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    List list = (List) o;
    return Objects.equals(this._123List, list._123List);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_123List);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class List {\n");
    
    sb.append("    _123List: ").append(toIndentedString(_123List)).append("\n");
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
