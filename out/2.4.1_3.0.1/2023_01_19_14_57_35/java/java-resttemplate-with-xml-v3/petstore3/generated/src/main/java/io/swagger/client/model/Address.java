/*
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
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
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * Address
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:13:34.897Z[Etc/UTC]")@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "address")public class Address {

  @JsonProperty("street")
  @JacksonXmlProperty(localName = "street")
  @XmlElement(name="street")

  private String street = null;

  @JsonProperty("city")
  @JacksonXmlProperty(localName = "city")
  @XmlElement(name="city")

  private String city = null;

  @JsonProperty("state")
  @JacksonXmlProperty(localName = "state")
  @XmlElement(name="state")

  private String state = null;

  @JsonProperty("zip")
  @JacksonXmlProperty(localName = "zip")
  @XmlElement(name="zip")

  private String zip = null;
  public Address street(String street) {
    this.street = street;
    return this;
  }

  

  /**
  * Get street
  * @return street
  **/
  @Schema(example = "437 Lytton", description = "")
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
  public Address city(String city) {
    this.city = city;
    return this;
  }

  

  /**
  * Get city
  * @return city
  **/
  @Schema(example = "Palo Alto", description = "")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }
  public Address state(String state) {
    this.state = state;
    return this;
  }

  

  /**
  * Get state
  * @return state
  **/
  @Schema(example = "CA", description = "")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  public Address zip(String zip) {
    this.zip = zip;
    return this;
  }

  

  /**
  * Get zip
  * @return zip
  **/
  @Schema(example = "94301", description = "")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.street, address.street) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.zip, address.zip);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(street, city, state, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
