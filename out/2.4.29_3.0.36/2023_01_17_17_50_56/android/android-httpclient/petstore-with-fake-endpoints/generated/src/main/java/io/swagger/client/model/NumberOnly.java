package io.swagger.client.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NumberOnly  {
  
  @SerializedName("JustNumber")
  private BigDecimal justNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getJustNumber() {
    return justNumber;
  }
  public void setJustNumber(BigDecimal justNumber) {
    this.justNumber = justNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOnly numberOnly = (NumberOnly) o;
    return (this.justNumber == null ? numberOnly.justNumber == null : this.justNumber.equals(numberOnly.justNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.justNumber == null ? 0: this.justNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOnly {\n");
    
    sb.append("  justNumber: ").append(justNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
