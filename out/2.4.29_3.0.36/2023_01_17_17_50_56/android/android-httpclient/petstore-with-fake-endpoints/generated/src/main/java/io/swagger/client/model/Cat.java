package io.swagger.client.model;

import io.swagger.client.model.Animal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Cat extends Animal {
  
  @SerializedName("className")
  private String className = null;
  @SerializedName("color")
  private String color = null;
  @SerializedName("declawed")
  private Boolean declawed = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getClassName() {
    return className;
  }
  public void setClassName(String className) {
    this.className = className;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getDeclawed() {
    return declawed;
  }
  public void setDeclawed(Boolean declawed) {
    this.declawed = declawed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return (this.className == null ? cat.className == null : this.className.equals(cat.className)) &&
        (this.color == null ? cat.color == null : this.color.equals(cat.color)) &&
        (this.declawed == null ? cat.declawed == null : this.declawed.equals(cat.declawed));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.className == null ? 0: this.className.hashCode());
    result = 31 * result + (this.color == null ? 0: this.color.hashCode());
    result = 31 * result + (this.declawed == null ? 0: this.declawed.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  className: ").append(className).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("  declawed: ").append(declawed).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
