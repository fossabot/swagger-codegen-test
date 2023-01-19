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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.File;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Body3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-19T15:30:31.011Z[Etc/UTC]")public class Body3 {

  @JsonProperty("integer")

  private Integer integer = null;

  @JsonProperty("int32")

  private Integer int32 = null;

  @JsonProperty("int64")

  private Long int64 = null;

  @JsonProperty("number")

  private BigDecimal number = null;

  @JsonProperty("float")

  private Float _float = null;

  @JsonProperty("double")

  private Double _double = null;

  @JsonProperty("string")

  private String string = null;

  @JsonProperty("pattern_without_delimiter")

  private String patternWithoutDelimiter = null;

  @JsonProperty("byte")

  private byte[] _byte = null;

  @JsonProperty("binary")

  private File binary = null;

  @JsonProperty("date")

  private LocalDate date = null;

  @JsonProperty("dateTime")

  private OffsetDateTime dateTime = null;

  @JsonProperty("password")

  private String password = null;

  @JsonProperty("callback")

  private String callback = null;
  public Body3 integer(Integer integer) {
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
  public Body3 int32(Integer int32) {
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
  public Body3 int64(Long int64) {
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
  public Body3 number(BigDecimal number) {
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
  public Body3 _float(Float _float) {
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
  public Body3 _double(Double _double) {
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
  public Body3 string(String string) {
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
  public Body3 patternWithoutDelimiter(String patternWithoutDelimiter) {
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
  public Body3 _byte(byte[] _byte) {
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
  public Body3 binary(File binary) {
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
  public Body3 date(LocalDate date) {
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
  public Body3 dateTime(OffsetDateTime dateTime) {
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
  public Body3 password(String password) {
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
  public Body3 callback(String callback) {
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
    Body3 body3 = (Body3) o;
    return Objects.equals(this.integer, body3.integer) &&
        Objects.equals(this.int32, body3.int32) &&
        Objects.equals(this.int64, body3.int64) &&
        Objects.equals(this.number, body3.number) &&
        Objects.equals(this._float, body3._float) &&
        Objects.equals(this._double, body3._double) &&
        Objects.equals(this.string, body3.string) &&
        Objects.equals(this.patternWithoutDelimiter, body3.patternWithoutDelimiter) &&
        Objects.equals(this._byte, body3._byte) &&
        Objects.equals(this.binary, body3.binary) &&
        Objects.equals(this.date, body3.date) &&
        Objects.equals(this.dateTime, body3.dateTime) &&
        Objects.equals(this.password, body3.password) &&
        Objects.equals(this.callback, body3.callback);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(integer, int32, int64, number, _float, _double, string, patternWithoutDelimiter, _byte, binary, date, dateTime, password, callback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
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

}
