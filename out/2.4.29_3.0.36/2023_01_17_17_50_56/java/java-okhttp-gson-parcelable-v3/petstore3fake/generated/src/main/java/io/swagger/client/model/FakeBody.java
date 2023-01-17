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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import android.os.Parcelable;
import android.os.Parcel;
/**
 * FakeBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T18:05:40.719Z[Etc/UTC]")
public class FakeBody implements Parcelable {
  @SerializedName("integer")
  private Integer integer = null;

  @SerializedName("int32")
  private Integer int32 = null;

  @SerializedName("int64")
  private Long int64 = null;

  @SerializedName("number")
  private BigDecimal number = null;

  @SerializedName("float")
  private Float _float = null;

  @SerializedName("double")
  private Double _double = null;

  @SerializedName("string")
  private String string = null;

  @SerializedName("pattern_without_delimiter")
  private String patternWithoutDelimiter = null;

  @SerializedName("byte")
  private byte[] _byte = null;

  @SerializedName("binary")
  private File binary = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("dateTime")
  private OffsetDateTime dateTime = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("callback")
  private String callback = null;

  public FakeBody() {
  }
  public FakeBody integer(Integer integer) {
    this.integer = integer;
    return this;
  }

   /**
   * None
   * minimum: 10
   * maximum: 100
   * @return integer
  **/
  @Schema(description = "None")
  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public FakeBody int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

   /**
   * None
   * minimum: 20
   * maximum: 200
   * @return int32
  **/
  @Schema(description = "None")
  public Integer getInt32() {
    return int32;
  }

  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  public FakeBody int64(Long int64) {
    this.int64 = int64;
    return this;
  }

   /**
   * None
   * @return int64
  **/
  @Schema(description = "None")
  public Long getInt64() {
    return int64;
  }

  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  public FakeBody number(BigDecimal number) {
    this.number = number;
    return this;
  }

   /**
   * None
   * minimum: 32
   * maximum: 543
   * @return number
  **/
  @Schema(required = true, description = "None")
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public FakeBody _float(Float _float) {
    this._float = _float;
    return this;
  }

   /**
   * None
   * maximum: 987
   * @return _float
  **/
  @Schema(description = "None")
  public Float getFloat() {
    return _float;
  }

  public void setFloat(Float _float) {
    this._float = _float;
  }

  public FakeBody _double(Double _double) {
    this._double = _double;
    return this;
  }

   /**
   * None
   * minimum: 67
   * maximum: 123
   * @return _double
  **/
  @Schema(required = true, description = "None")
  public Double getDouble() {
    return _double;
  }

  public void setDouble(Double _double) {
    this._double = _double;
  }

  public FakeBody string(String string) {
    this.string = string;
    return this;
  }

   /**
   * None
   * @return string
  **/
  @Schema(description = "None")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public FakeBody patternWithoutDelimiter(String patternWithoutDelimiter) {
    this.patternWithoutDelimiter = patternWithoutDelimiter;
    return this;
  }

   /**
   * None
   * @return patternWithoutDelimiter
  **/
  @Schema(required = true, description = "None")
  public String getPatternWithoutDelimiter() {
    return patternWithoutDelimiter;
  }

  public void setPatternWithoutDelimiter(String patternWithoutDelimiter) {
    this.patternWithoutDelimiter = patternWithoutDelimiter;
  }

  public FakeBody _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

   /**
   * None
   * @return _byte
  **/
  @Schema(required = true, description = "None")
  public byte[] getByte() {
    return _byte;
  }

  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  public FakeBody binary(File binary) {
    this.binary = binary;
    return this;
  }

   /**
   * None
   * @return binary
  **/
  @Schema(description = "None")
  public File getBinary() {
    return binary;
  }

  public void setBinary(File binary) {
    this.binary = binary;
  }

  public FakeBody date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * None
   * @return date
  **/
  @Schema(description = "None")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public FakeBody dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * None
   * @return dateTime
  **/
  @Schema(description = "None")
  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public FakeBody password(String password) {
    this.password = password;
    return this;
  }

   /**
   * None
   * @return password
  **/
  @Schema(description = "None")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public FakeBody callback(String callback) {
    this.callback = callback;
    return this;
  }

   /**
   * None
   * @return callback
  **/
  @Schema(description = "None")
  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FakeBody fakeBody = (FakeBody) o;
    return Objects.equals(this.integer, fakeBody.integer) &&
        Objects.equals(this.int32, fakeBody.int32) &&
        Objects.equals(this.int64, fakeBody.int64) &&
        Objects.equals(this.number, fakeBody.number) &&
        Objects.equals(this._float, fakeBody._float) &&
        Objects.equals(this._double, fakeBody._double) &&
        Objects.equals(this.string, fakeBody.string) &&
        Objects.equals(this.patternWithoutDelimiter, fakeBody.patternWithoutDelimiter) &&
        Arrays.equals(this._byte, fakeBody._byte) &&
        Objects.equals(this.binary, fakeBody.binary) &&
        Objects.equals(this.date, fakeBody.date) &&
        Objects.equals(this.dateTime, fakeBody.dateTime) &&
        Objects.equals(this.password, fakeBody.password) &&
        Objects.equals(this.callback, fakeBody.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, patternWithoutDelimiter, Arrays.hashCode(_byte), Objects.hashCode(binary), date, dateTime, password, callback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FakeBody {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    patternWithoutDelimiter: ").append(toIndentedString(patternWithoutDelimiter)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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
    out.writeValue(integer);
    out.writeValue(int32);
    out.writeValue(int64);
    out.writeValue(number);
    out.writeValue(_float);
    out.writeValue(_double);
    out.writeValue(string);
    out.writeValue(patternWithoutDelimiter);
    out.writeValue(_byte);
    out.writeValue(binary);
    out.writeValue(date);
    out.writeValue(dateTime);
    out.writeValue(password);
    out.writeValue(callback);
  }

  FakeBody(Parcel in) {
    integer = (Integer)in.readValue(null);
    int32 = (Integer)in.readValue(null);
    int64 = (Long)in.readValue(null);
    number = (BigDecimal)in.readValue(BigDecimal.class.getClassLoader());
    _float = (Float)in.readValue(null);
    _double = (Double)in.readValue(null);
    string = (String)in.readValue(null);
    patternWithoutDelimiter = (String)in.readValue(null);
    _byte = (byte[])in.readValue(null);
    binary = (File)in.readValue(File.class.getClassLoader());
    date = (LocalDate)in.readValue(LocalDate.class.getClassLoader());
    dateTime = (OffsetDateTime)in.readValue(OffsetDateTime.class.getClassLoader());
    password = (String)in.readValue(null);
    callback = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<FakeBody> CREATOR = new Parcelable.Creator<FakeBody>() {
    public FakeBody createFromParcel(Parcel in) {
      return new FakeBody(in);
    }
    public FakeBody[] newArray(int size) {
      return new FakeBody[size];
    }
  };
}
