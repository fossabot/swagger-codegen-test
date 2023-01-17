/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
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
import android.os.Parcelable;
import android.os.Parcel;
/**
 * PartMaster
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T17:58:17.144Z[Etc/UTC]")
public class PartMaster implements Parcelable {
  @SerializedName("destination")
  private OneOfPartMasterDestination destination = null;

  @SerializedName("origin")
  private OneOfPartMasterOrigin origin = null;

  public PartMaster() {
  }
  public PartMaster destination(OneOfPartMasterDestination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public OneOfPartMasterDestination getDestination() {
    return destination;
  }

  public void setDestination(OneOfPartMasterDestination destination) {
    this.destination = destination;
  }

  public PartMaster origin(OneOfPartMasterOrigin origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @Schema(description = "")
  public OneOfPartMasterOrigin getOrigin() {
    return origin;
  }

  public void setOrigin(OneOfPartMasterOrigin origin) {
    this.origin = origin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartMaster partMaster = (PartMaster) o;
    return Objects.equals(this.destination, partMaster.destination) &&
        Objects.equals(this.origin, partMaster.origin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, origin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartMaster {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
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


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(destination);
    out.writeValue(origin);
  }

  PartMaster(Parcel in) {
    destination = (OneOfPartMasterDestination)in.readValue(null);
    origin = (OneOfPartMasterOrigin)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PartMaster> CREATOR = new Parcelable.Creator<PartMaster>() {
    public PartMaster createFromParcel(Parcel in) {
      return new PartMaster(in);
    }
    public PartMaster[] newArray(int size) {
      return new PartMaster[size];
    }
  };
}
