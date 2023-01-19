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
import org.threeten.bp.LocalDate;

/**
 * Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
 */
@Schema(description = "Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:17:17.976Z[Etc/UTC]")public class ValMemberChoice1 {

  @JsonProperty("val_date_of_birth")

  private LocalDate valDateOfBirth = null;

  @JsonProperty("val_leaving_date")

  private LocalDate valLeavingDate = null;
  public ValMemberChoice1 valDateOfBirth(LocalDate valDateOfBirth) {
    this.valDateOfBirth = valDateOfBirth;
    return this;
  }

  

  /**
  * Business Term: Date Of Birth Definition: The date of birth of the member. Purpose: To be able to uniquely identify a member within a scheme.
  * @return valDateOfBirth
  **/
  @Schema(required = true, description = "Business Term: Date Of Birth Definition: The date of birth of the member. Purpose: To be able to uniquely identify a member within a scheme.")
  public LocalDate getValDateOfBirth() {
    return valDateOfBirth;
  }
  public void setValDateOfBirth(LocalDate valDateOfBirth) {
    this.valDateOfBirth = valDateOfBirth;
  }
  public ValMemberChoice1 valLeavingDate(LocalDate valLeavingDate) {
    this.valLeavingDate = valLeavingDate;
    return this;
  }

  

  /**
  * Business Term: Leaving Date Definition: The date the member left/is due to leave the scheme. Purpose: To identify those members that have left or are due to leave the scheme. To be able to calculate the benefit insured/premium payable in respect of the member/category.
  * @return valLeavingDate
  **/
  @Schema(description = "Business Term: Leaving Date Definition: The date the member left/is due to leave the scheme. Purpose: To identify those members that have left or are due to leave the scheme. To be able to calculate the benefit insured/premium payable in respect of the member/category.")
  public LocalDate getValLeavingDate() {
    return valLeavingDate;
  }
  public void setValLeavingDate(LocalDate valLeavingDate) {
    this.valLeavingDate = valLeavingDate;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValMemberChoice1 valMemberChoice1 = (ValMemberChoice1) o;
    return Objects.equals(this.valDateOfBirth, valMemberChoice1.valDateOfBirth) &&
        Objects.equals(this.valLeavingDate, valMemberChoice1.valLeavingDate);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(valDateOfBirth, valLeavingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValMemberChoice1 {\n");
    
    sb.append("    valDateOfBirth: ").append(toIndentedString(valDateOfBirth)).append("\n");
    sb.append("    valLeavingDate: ").append(toIndentedString(valLeavingDate)).append("\n");
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
