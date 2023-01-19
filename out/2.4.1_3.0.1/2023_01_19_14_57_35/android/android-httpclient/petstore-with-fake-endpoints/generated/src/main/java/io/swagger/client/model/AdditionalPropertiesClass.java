package io.swagger.client.model;

import java.util.*;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AdditionalPropertiesClass  {
  
  @SerializedName("map_property")
  private Map<String, String> mapProperty = null;
  @SerializedName("map_of_map_property")
  private Map<String, Map<String, String>> mapOfMapProperty = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, String> getMapProperty() {
    return mapProperty;
  }
  public void setMapProperty(Map<String, String> mapProperty) {
    this.mapProperty = mapProperty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Map<String, Map<String, String>> getMapOfMapProperty() {
    return mapOfMapProperty;
  }
  public void setMapOfMapProperty(Map<String, Map<String, String>> mapOfMapProperty) {
    this.mapOfMapProperty = mapOfMapProperty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalPropertiesClass additionalPropertiesClass = (AdditionalPropertiesClass) o;
    return (this.mapProperty == null ? additionalPropertiesClass.mapProperty == null : this.mapProperty.equals(additionalPropertiesClass.mapProperty)) &&
        (this.mapOfMapProperty == null ? additionalPropertiesClass.mapOfMapProperty == null : this.mapOfMapProperty.equals(additionalPropertiesClass.mapOfMapProperty));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mapProperty == null ? 0: this.mapProperty.hashCode());
    result = 31 * result + (this.mapOfMapProperty == null ? 0: this.mapOfMapProperty.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalPropertiesClass {\n");
    
    sb.append("  mapProperty: ").append(mapProperty).append("\n");
    sb.append("  mapOfMapProperty: ").append(mapOfMapProperty).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
