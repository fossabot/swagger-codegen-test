package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.server.api.model.ReadOnlyFirst;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ArrayTest   {
  
  private List<String> arrayOfString = new ArrayList<>();
  private List<List<Long>> arrayArrayOfInteger = new ArrayList<>();
  private List<List<ReadOnlyFirst>> arrayArrayOfModel = new ArrayList<>();

  public ArrayTest () {

  }

  public ArrayTest (List<String> arrayOfString, List<List<Long>> arrayArrayOfInteger, List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayOfString = arrayOfString;
    this.arrayArrayOfInteger = arrayArrayOfInteger;
    this.arrayArrayOfModel = arrayArrayOfModel;
  }

    
  @JsonProperty("array_of_string")
  public List<String> getArrayOfString() {
    return arrayOfString;
  }
  public void setArrayOfString(List<String> arrayOfString) {
    this.arrayOfString = arrayOfString;
  }

    
  @JsonProperty("array_array_of_integer")
  public List<List<Long>> getArrayArrayOfInteger() {
    return arrayArrayOfInteger;
  }
  public void setArrayArrayOfInteger(List<List<Long>> arrayArrayOfInteger) {
    this.arrayArrayOfInteger = arrayArrayOfInteger;
  }

    
  @JsonProperty("array_array_of_model")
  public List<List<ReadOnlyFirst>> getArrayArrayOfModel() {
    return arrayArrayOfModel;
  }
  public void setArrayArrayOfModel(List<List<ReadOnlyFirst>> arrayArrayOfModel) {
    this.arrayArrayOfModel = arrayArrayOfModel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayTest arrayTest = (ArrayTest) o;
    return Objects.equals(arrayOfString, arrayTest.arrayOfString) &&
        Objects.equals(arrayArrayOfInteger, arrayTest.arrayArrayOfInteger) &&
        Objects.equals(arrayArrayOfModel, arrayTest.arrayArrayOfModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayOfString, arrayArrayOfInteger, arrayArrayOfModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayTest {\n");
    
    sb.append("    arrayOfString: ").append(toIndentedString(arrayOfString)).append("\n");
    sb.append("    arrayArrayOfInteger: ").append(toIndentedString(arrayArrayOfInteger)).append("\n");
    sb.append("    arrayArrayOfModel: ").append(toIndentedString(arrayArrayOfModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
