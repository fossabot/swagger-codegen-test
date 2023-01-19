package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Business Term: Scheme Members Definition: Information about the Members of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
 */
@ApiModel(description = "Business Term: Scheme Members Definition: Information about the Members of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:17:59.383Z[Etc/UTC]")

public class ValMembers   {
  @JsonProperty("val_member")
  @Valid
  private List<Object> valMember = new ArrayList<Object>();

  public ValMembers valMember(List<Object> valMember) {
    this.valMember = valMember;
    return this;
  }

  public ValMembers addValMemberItem(Object valMemberItem) {
    this.valMember.add(valMemberItem);
    return this;
  }

  /**
   * Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
   * @return valMember
  **/
  @ApiModelProperty(required = true, value = "Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.")
  @NotNull

@Size(min=1) 
  public List<Object> getValMember() {
    return valMember;
  }

  public void setValMember(List<Object> valMember) {
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

