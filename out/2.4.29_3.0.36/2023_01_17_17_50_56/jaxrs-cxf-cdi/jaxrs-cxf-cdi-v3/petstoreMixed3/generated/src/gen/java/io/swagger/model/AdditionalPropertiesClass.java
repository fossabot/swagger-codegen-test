package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class AdditionalPropertiesClass   {
  private Map<String, String> mapProperty = new HashMap<String, String>();
  private Map<String, Map<String, String>> mapOfMapProperty = new HashMap<String, Map<String, String>>();

  /**
   **/
  public AdditionalPropertiesClass mapProperty(Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("map_property")
  public Map<String, String> getMapProperty() {
    return mapProperty;
  }
  public void setMapProperty(Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
  }

  /**
   **/
  public AdditionalPropertiesClass mapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
    return this;
  }

  
  
  @Schema(description = "")
  @JsonProperty("map_of_map_property")
  @Valid
  public Map<String, Map<String, String>> getMapOfMapProperty() {
    return mapOfMapProperty;
  }
  public void setMapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return Objects.equals(mapProperty, additionalPropertiesClass.mapProperty) &&
        Objects.equals(mapOfMapProperty, additionalPropertiesClass.mapOfMapProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapProperty, mapOfMapProperty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClass {\n");
    
    sb.append("    mapProperty: ").append(toIndentedString(mapProperty)).append("\n");
    sb.append("    mapOfMapProperty: ").append(toIndentedString(mapOfMapProperty)).append("\n");
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
