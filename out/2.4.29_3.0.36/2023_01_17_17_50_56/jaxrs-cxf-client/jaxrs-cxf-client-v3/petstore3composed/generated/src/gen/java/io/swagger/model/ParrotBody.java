package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonCreator;

public class ParrotBody   {
  
  @Schema(description = "")
  private List<AnyOfparrotBodyParrotsItems> parrots = null;
 /**
   * Get parrots
   * @return parrots
  **/
  @JsonProperty("parrots")
  public List<AnyOfparrotBodyParrotsItems> getParrots() {
    return parrots;
  }

  public void setParrots(List<AnyOfparrotBodyParrotsItems> parrots) {
    this.parrots = parrots;
  }

  public ParrotBody parrots(List<AnyOfparrotBodyParrotsItems> parrots) {
    this.parrots = parrots;
    return this;
  }

  public ParrotBody addParrotsItem(AnyOfparrotBodyParrotsItems parrotsItem) {
    this.parrots.add(parrotsItem);
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
