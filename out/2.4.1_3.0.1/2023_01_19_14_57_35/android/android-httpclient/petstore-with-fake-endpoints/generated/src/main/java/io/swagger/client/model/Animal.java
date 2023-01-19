package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Animal  {
  
  @SerializedName("className")
  private String className = null;
  @SerializedName("color")
  private String color = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Animal animal = (Animal) o;
    return (this.className == null ? animal.className == null : this.className.equals(animal.className)) &&
        (this.color == null ? animal.color == null : this.color.equals(animal.color));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.className == null ? 0: this.className.hashCode());
    result = 31 * result + (this.color == null ? 0: this.color.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Animal {\n");
    
    sb.append("  className: ").append(className).append("\n");
    sb.append("  color: ").append(color).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
