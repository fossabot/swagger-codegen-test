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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;
/**
 * OuterComposite
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:07:31.395Z[Etc/UTC]")@XmlRootElement(name = "OuterComposite")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "OuterComposite")
public class OuterComposite {
  @JsonProperty("my_number")
  @JacksonXmlProperty(localName = "my_number")
  @XmlElement(name = "my_number")
  private BigDecimal myNumber = null;

  @JsonProperty("my_string")
  @JacksonXmlProperty(localName = "my_string")
  @XmlElement(name = "my_string")
  private String myString = null;

  @JsonProperty("my_boolean")
  @JacksonXmlProperty(localName = "my_boolean")
  @XmlElement(name = "my_boolean")
  private Boolean myBoolean = null;

  public OuterComposite myNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
    return this;
  }

   /**
   * Get myNumber
   * @return myNumber
  **/
  @Schema(description = "")
  public BigDecimal getMyNumber() {
    return myNumber;
  }

  public void setMyNumber(BigDecimal myNumber) {
    this.myNumber = myNumber;
  }

  public OuterComposite myString(String myString) {
    this.myString = myString;
    return this;
  }

   /**
   * Get myString
   * @return myString
  **/
  @Schema(description = "")
  public String getMyString() {
    return myString;
  }

  public void setMyString(String myString) {
    this.myString = myString;
  }

  public OuterComposite myBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
    return this;
  }

   /**
   * Get myBoolean
   * @return myBoolean
  **/
  @Schema(description = "")
  public Boolean getMyBoolean() {
    return myBoolean;
  }

  public void setMyBoolean(Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterComposite outerComposite = (OuterComposite) o;
    return Objects.equals(this.myNumber, outerComposite.myNumber) &&
        Objects.equals(this.myString, outerComposite.myString) &&
        Objects.equals(this.myBoolean, outerComposite.myBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myNumber, myString, myBoolean);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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
