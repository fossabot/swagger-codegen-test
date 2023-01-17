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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Business Term: Scheme Members Definition: Information about the Members of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
 */
@Schema(description = "Business Term: Scheme Members Definition: Information about the Members of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:07:34.941Z[Etc/UTC]")
public class ValMembers {
  @SerializedName("val_member")
  private List<OneOfvalMembersValMemberItems> valMember = new ArrayList<OneOfvalMembersValMemberItems>();

  public ValMembers valMember(List<OneOfvalMembersValMemberItems> valMember) {
    this.valMember = valMember;
    return this;
  }

  public ValMembers addValMemberItem(OneOfvalMembersValMemberItems valMemberItem) {
    this.valMember.add(valMemberItem);
    return this;
  }

   /**
   * Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
   * @return valMember
  **/
  @Schema(required = true, description = "Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.")
  public List<OneOfvalMembersValMemberItems> getValMember() {
    return valMember;
  }

  public void setValMember(List<OneOfvalMembersValMemberItems> valMember) {
    this.valMember = valMember;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValMembers valMembers = (ValMembers) o;
    return Objects.equals(this.valMember, valMembers.valMember);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valMember);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValMembers {\n");
    
    sb.append("    valMember: ").append(toIndentedString(valMember)).append("\n");
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
