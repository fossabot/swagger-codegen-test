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
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PartMaster
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:16:59.738Z[Etc/UTC]")public class PartMaster {

  @JsonProperty("destination")

  private Object destination = null;

  @JsonProperty("origin")

  private Object origin = null;
  public PartMaster destination(Object destination) {
    this.destination = destination;
    return this;
  }

  

  /**
  * Get destination
  * @return destination
  **/
  @Schema(description = "")
  public Object getDestination() {
    return destination;
  }
  public void setDestination(Object destination) {
    this.destination = destination;
  }
  public PartMaster origin(Object origin) {
    this.origin = origin;
    return this;
  }

  

  /**
  * Get origin
  * @return origin
  **/
  @Schema(description = "")
  public Object getOrigin() {
    return origin;
  }
  public void setOrigin(Object origin) {
    this.origin = origin;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartMaster partMaster = (PartMaster) o;
    return Objects.equals(this.destination, partMaster.destination) &&
        Objects.equals(this.origin, partMaster.origin);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(destination, origin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartMaster {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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
