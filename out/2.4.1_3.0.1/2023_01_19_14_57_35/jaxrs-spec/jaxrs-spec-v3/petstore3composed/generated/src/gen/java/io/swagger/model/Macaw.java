package io.swagger.model;

import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Macaw   {
  private @Valid String color = null;  private @Valid Boolean singer = null;

  /**
   **/
  public Macaw color(String color) {
    this.color = color;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   **/
  public Macaw singer(Boolean singer) {
    this.singer = singer;
    return this;
  }

  
  @Schema(description = "")
  @JsonProperty("singer")
  public Boolean isisSinger() {
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
    return Objects.equals(color, macaw.color) &&
        Objects.equals(singer, macaw.singer);
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
