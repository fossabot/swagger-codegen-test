package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ParrotBody   {
  private List<AnyOfparrotBodyParrotsItems> parrots = new ArrayList<AnyOfparrotBodyParrotsItems>();

  /**
   **/
  public ParrotBody parrots(List<AnyOfparrotBodyParrotsItems> parrots) {
    this.parrots = parrots;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("parrots")
  public List<AnyOfparrotBodyParrotsItems> getParrots() {
    return parrots;
  }
  public void setParrots(List<AnyOfparrotBodyParrotsItems> parrots) {
    this.parrots = parrots;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParrotBody parrotBody = (ParrotBody) o;
    return Objects.equals(parrots, parrotBody.parrots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parrots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParrotBody {\n");
    
    sb.append("    parrots: ").append(toIndentedString(parrots)).append("\n");
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
