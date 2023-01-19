package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-19T15:07:22.918Z[Etc/UTC]")public class Capitalization   {
  private String smallCamel = null;
  private String capitalCamel = null;
  private String smallSnake = null;
  private String capitalSnake = null;
  private String scAETHFlowPoints = null;
  private String ATT_NAME = null;

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("smallCamel")
  public String getSmallCamel() {
    return smallCamel;
  }
  public void setSmallCamel(String smallCamel) {
    this.smallCamel = smallCamel;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("CapitalCamel")
  public String getCapitalCamel() {
    return capitalCamel;
  }
  public void setCapitalCamel(String capitalCamel) {
    this.capitalCamel = capitalCamel;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("small_Snake")
  public String getSmallSnake() {
    return smallSnake;
  }
  public void setSmallSnake(String smallSnake) {
    this.smallSnake = smallSnake;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("Capital_Snake")
  public String getCapitalSnake() {
    return capitalSnake;
  }
  public void setCapitalSnake(String capitalSnake) {
    this.capitalSnake = capitalSnake;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("SCA_ETH_Flow_Points")
  public String getScAETHFlowPoints() {
    return scAETHFlowPoints;
  }
  public void setScAETHFlowPoints(String scAETHFlowPoints) {
    this.scAETHFlowPoints = scAETHFlowPoints;
  }

  /**
   * Name of the pet 
   **/
  
  @Schema(description = "Name of the pet ")
  @JsonProperty("ATT_NAME")
  public String getATTNAME() {
    return ATT_NAME;
  }
  public void setATTNAME(String ATT_NAME) {
    this.ATT_NAME = ATT_NAME;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capitalization capitalization = (Capitalization) o;
    return Objects.equals(smallCamel, capitalization.smallCamel) &&
        Objects.equals(capitalCamel, capitalization.capitalCamel) &&
        Objects.equals(smallSnake, capitalization.smallSnake) &&
        Objects.equals(capitalSnake, capitalization.capitalSnake) &&
        Objects.equals(scAETHFlowPoints, capitalization.scAETHFlowPoints) &&
        Objects.equals(ATT_NAME, capitalization.ATT_NAME);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smallCamel, capitalCamel, smallSnake, capitalSnake, scAETHFlowPoints, ATT_NAME);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capitalization {\n");
    
    sb.append("    smallCamel: ").append(toIndentedString(smallCamel)).append("\n");
    sb.append("    capitalCamel: ").append(toIndentedString(capitalCamel)).append("\n");
    sb.append("    smallSnake: ").append(toIndentedString(smallSnake)).append("\n");
    sb.append("    capitalSnake: ").append(toIndentedString(capitalSnake)).append("\n");
    sb.append("    scAETHFlowPoints: ").append(toIndentedString(scAETHFlowPoints)).append("\n");
    sb.append("    ATT_NAME: ").append(toIndentedString(ATT_NAME)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
