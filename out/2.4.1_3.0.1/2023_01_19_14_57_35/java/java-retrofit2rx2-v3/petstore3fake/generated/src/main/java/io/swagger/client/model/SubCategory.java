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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Category;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SubCategory
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:07:19.091Z[Etc/UTC]")public class SubCategory {

  @SerializedName("category")
  private Object category = null;

  @SerializedName("category2")
  private Category category2 = null;

  @SerializedName("pets")
  private List<Object> pets = null;
  public SubCategory category(Object category) {
    this.category = category;
    return this;
  }

  

  /**
  * Get category
  * @return category
  **/
  @Schema(description = "")
  public Object getCategory() {
    return category;
  }
  public void setCategory(Object category) {
    this.category = category;
  }
  public SubCategory category2(Category category2) {
    this.category2 = category2;
    return this;
  }

  

  /**
  * Get category2
  * @return category2
  **/
  @Schema(description = "")
  public Category getCategory2() {
    return category2;
  }
  public void setCategory2(Category category2) {
    this.category2 = category2;
  }
  public SubCategory pets(List<Object> pets) {
    this.pets = pets;
    return this;
  }

  public SubCategory addPetsItem(Object petsItem) {
    if (this.pets == null) {
      this.pets = new ArrayList<Object>();
    }
    this.pets.add(petsItem);
    return this;
  }

  /**
  * Get pets
  * @return pets
  **/
  @Schema(description = "")
  public List<Object> getPets() {
    return pets;
  }
  public void setPets(List<Object> pets) {
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
    SubCategory subCategory = (SubCategory) o;
    return Objects.equals(this.category, subCategory.category) &&
        Objects.equals(this.category2, subCategory.category2) &&
        Objects.equals(this.pets, subCategory.pets);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(category, category2, pets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCategory {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
