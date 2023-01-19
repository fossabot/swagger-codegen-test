package io.swagger.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class EnumArrays  {
  
  public enum JustSymbolEnum {
     &gt;&#x3D;,  $, 
  };
  @SerializedName("just_symbol")
  private JustSymbolEnum justSymbol = null;
  public enum List&lt;ArrayEnumEnum&gt; {
     fish,  crab, 
  };
  @SerializedName("array_enum")
  private List<ArrayEnumEnum> arrayEnum = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public JustSymbolEnum getJustSymbol() {
    return justSymbol;
  }
  public void setJustSymbol(JustSymbolEnum justSymbol) {
    this.justSymbol = justSymbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ArrayEnumEnum> getArrayEnum() {
    return arrayEnum;
  }
  public void setArrayEnum(List<ArrayEnumEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumArrays enumArrays = (EnumArrays) o;
    return (this.justSymbol == null ? enumArrays.justSymbol == null : this.justSymbol.equals(enumArrays.justSymbol)) &&
        (this.arrayEnum == null ? enumArrays.arrayEnum == null : this.arrayEnum.equals(enumArrays.arrayEnum));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.justSymbol == null ? 0: this.justSymbol.hashCode());
    result = 31 * result + (this.arrayEnum == null ? 0: this.arrayEnum.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumArrays {\n");
    
    sb.append("  justSymbol: ").append(justSymbol).append("\n");
    sb.append("  arrayEnum: ").append(arrayEnum).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
