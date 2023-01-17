package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Model for testing model name same as property name
 **/
@ApiModel(description = "Model for testing model name same as property name")
public class Name  {
  
  @SerializedName("name")
  private Integer name = null;
  @SerializedName("snake_case")
  private Integer snakeCase = null;
  @SerializedName("property")
  private String property = null;
  @SerializedName("123Number")
  private Integer _123Number = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getName() {
    return name;
  }
  public void setName(Integer name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSnakeCase() {
    return snakeCase;
  }
  public void setSnakeCase(Integer snakeCase) {
    this.snakeCase = snakeCase;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProperty() {
    return property;
  }
  public void setProperty(String property) {
    this.property = property;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer get123Number() {
    return _123Number;
  }
  public void set123Number(Integer _123Number) {
    this._123Number = _123Number;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return (this.name == null ? name.name == null : this.name.equals(name.name)) &&
        (this.snakeCase == null ? name.snakeCase == null : this.snakeCase.equals(name.snakeCase)) &&
        (this.property == null ? name.property == null : this.property.equals(name.property)) &&
        (this._123Number == null ? name._123Number == null : this._123Number.equals(name._123Number));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.snakeCase == null ? 0: this.snakeCase.hashCode());
    result = 31 * result + (this.property == null ? 0: this.property.hashCode());
    result = 31 * result + (this._123Number == null ? 0: this._123Number.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  snakeCase: ").append(snakeCase).append("\n");
    sb.append("  property: ").append(property).append("\n");
    sb.append("  _123Number: ").append(_123Number).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
