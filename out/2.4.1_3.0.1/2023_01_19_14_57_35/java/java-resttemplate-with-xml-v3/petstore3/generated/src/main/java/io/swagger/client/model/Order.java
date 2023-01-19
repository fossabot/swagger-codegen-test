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
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;

/**
 * Order
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:13:34.897Z[Etc/UTC]")@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "order")public class Order {

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  @XmlElement(name="id")

  private Long id = null;

  @JsonProperty("petId")
  @JacksonXmlProperty(localName = "petId")
  @XmlElement(name="petId")

  private Long petId = null;

  @JsonProperty("quantity")
  @JacksonXmlProperty(localName = "quantity")
  @XmlElement(name="quantity")

  private Integer quantity = null;

  @JsonProperty("shipDate")
  @JacksonXmlProperty(localName = "shipDate")
  @XmlElement(name="shipDate")

  private OffsetDateTime shipDate = null;
  /**
   * Order Status
   */
  public enum StatusEnum {
    PLACED("placed"),
    APPROVED("approved"),
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }
  @JsonProperty("status")
  @JacksonXmlProperty(localName = "status")
  @XmlElement(name="status")

  private StatusEnum status = null;

  @JsonProperty("complete")
  @JacksonXmlProperty(localName = "complete")
  @XmlElement(name="complete")

  private Boolean complete = null;
  public Order id(Long id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "10", description = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public Order petId(Long petId) {
    this.petId = petId;
    return this;
  }

  

  /**
  * Get petId
  * @return petId
  **/
  @Schema(example = "198772", description = "")
  public Long getPetId() {
    return petId;
  }
  public void setPetId(Long petId) {
    this.petId = petId;
  }
  public Order quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  

  /**
  * Get quantity
  * @return quantity
  **/
  @Schema(example = "7", description = "")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  public Order shipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  

  /**
  * Get shipDate
  * @return shipDate
  **/
  @Schema(description = "")
  public OffsetDateTime getShipDate() {
    return shipDate;
  }
  public void setShipDate(OffsetDateTime shipDate) {
    this.shipDate = shipDate;
  }
  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  

  /**
  * Order Status
  * @return status
  **/
  @Schema(example = "approved", description = "Order Status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }
  public Order complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

  

  /**
  * Get complete
  * @return complete
  **/
  @Schema(description = "")
  public Boolean isComplete() {
    return complete;
  }
  public void setComplete(Boolean complete) {
    this.complete = complete;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.petId, order.petId) &&
        Objects.equals(this.quantity, order.quantity) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.complete, order.complete);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, petId, quantity, shipDate, status, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    petId: ").append(toIndentedString(petId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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
