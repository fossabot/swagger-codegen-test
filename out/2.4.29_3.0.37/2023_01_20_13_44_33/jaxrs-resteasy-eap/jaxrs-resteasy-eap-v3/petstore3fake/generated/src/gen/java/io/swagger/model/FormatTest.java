package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-20T14:02:23.456Z[Etc/UTC]")public class FormatTest   {
  private Integer integer = null;
  private Integer int32 = null;
  private Long int64 = null;
  private BigDecimal number = null;
  private Float _float = null;
  private Double _double = null;
  private String string = null;
  private byte[] _byte = null;
  private File binary = null;
  private Date date = null;
  private Date dateTime = null;
  private UUID uuid = null;
  private String password = null;

  /**
   * minimum: 10
   * maximum: 100
   **/
  
  @Schema(description = "")
  @JsonProperty("integer")
  @Min(10)
  @Max(100)
  public Integer getInteger() {
    return integer;
  }
  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  /**
   * minimum: 20
   * maximum: 200
   **/
  
  @Schema(description = "")
  @JsonProperty("int32")
  @Min(20)
  @Max(200)
  public Integer getInt32() {
    return int32;
  }
  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("int64")
  public Long getInt64() {
    return int64;
  }
  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  /**
   * minimum: 32
   * maximum: 543
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("number")
  @NotNull
  @DecimalMin("32")
  @DecimalMax("543")
  public BigDecimal getNumber() {
    return number;
  }
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  /**
   * minimum: 54
   * maximum: 987
   **/
  
  @Schema(description = "")
  @JsonProperty("float")
  @DecimalMin("54")
  @DecimalMax("987")
  public Float getFloat() {
    return _float;
  }
  public void setFloat(Float _float) {
    this._float = _float;
  }

  /**
   * minimum: 67
   * maximum: 123
   **/
  
  @Schema(description = "")
  @JsonProperty("double")
  @DecimalMin("67")
  @DecimalMax("123")
  public Double getDouble() {
    return _double;
  }
  public void setDouble(Double _double) {
    this._double = _double;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("string")
  @Pattern(regexp="/[a-z]/i")
  public String getString() {
    return string;
  }
  public void setString(String string) {
    this.string = string;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("byte")
  @NotNull
  public byte[] getByte() {
    return _byte;
  }
  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("binary")
  public File getBinary() {
    return binary;
  }
  public void setBinary(File binary) {
    this.binary = binary;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("date")
  @NotNull
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("dateTime")
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   **/
  
  @Schema(description = "")
  @JsonProperty("uuid")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  
  @Schema(required = true, description = "")
  @JsonProperty("password")
  @NotNull
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormatTest formatTest = (FormatTest) o;
    return Objects.equals(integer, formatTest.integer) &&
        Objects.equals(int32, formatTest.int32) &&
        Objects.equals(int64, formatTest.int64) &&
        Objects.equals(number, formatTest.number) &&
        Objects.equals(_float, formatTest._float) &&
        Objects.equals(_double, formatTest._double) &&
        Objects.equals(string, formatTest.string) &&
        Objects.equals(_byte, formatTest._byte) &&
        Objects.equals(binary, formatTest.binary) &&
        Objects.equals(date, formatTest.date) &&
        Objects.equals(dateTime, formatTest.dateTime) &&
        Objects.equals(uuid, formatTest.uuid) &&
        Objects.equals(password, formatTest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, _byte, binary, date, dateTime, uuid, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    
    sb.append("    integer: ").append(toIndentedString(integer)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _float: ").append(toIndentedString(_float)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    _byte: ").append(toIndentedString(_byte)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
