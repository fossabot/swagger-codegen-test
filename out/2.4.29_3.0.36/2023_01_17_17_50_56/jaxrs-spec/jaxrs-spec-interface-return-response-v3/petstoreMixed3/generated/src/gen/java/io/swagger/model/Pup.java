package io.swagger.model;

import io.swagger.model.Category;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pup  implements Serializable , OneOfPup  {

  private @Valid Long id = null;

  private @Valid Category category2 = null;

  private @Valid List<AllOfPupPetsItems> pets = new ArrayList<AllOfPupPetsItems>();

  /**
   **/
  public Pup id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("id")

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public Pup category2(Category category2) {
    this.category2 = category2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("category2")

  public Category getCategory2() {
    return category2;
  }
  public void setCategory2(Category category2) {
    this.category2 = category2;
  }

  /**
   **/
  public Pup pets(List<AllOfPupPetsItems> pets) {
    this.pets = pets;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pets")

  public List<AllOfPupPetsItems> getPets() {
    return pets;
  }
  public void setPets(List<AllOfPupPetsItems> pets) {
    this.pets = pets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pup pup = (Pup) o;
    return Objects.equals(id, pup.id) &&
        Objects.equals(category2, pup.category2) &&
        Objects.equals(pets, pup.pets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category2, pets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category2: ").append(toIndentedString(category2)).append("\n");
    sb.append("    pets: ").append(toIndentedString(pets)).append("\n");
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
