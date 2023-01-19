package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:18:26.458Z[Etc/UTC]")

public class Body2   {
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

  public Body2 integer(Integer integer) {
    this.integer = integer;
    return this;
  }

  /**
   * None
   * minimum: 10
   * maximum: 100
   * @return integer
  **/
  @ApiModelProperty(value = "None")

@Min(10) @Max(100) 
  public Integer getInteger() {
    return integer;
  }

  public void setInteger(Integer integer) {
    this.integer = integer;
  }

  public Body2 int32(Integer int32) {
    this.int32 = int32;
    return this;
  }

  /**
   * None
   * minimum: 20
   * maximum: 200
   * @return int32
  **/
  @ApiModelProperty(value = "None")

@Min(20) @Max(200) 
  public Integer getInt32() {
    return int32;
  }

  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  public Body2 int64(Long int64) {
    this.int64 = int64;
    return this;
  }

  /**
   * None
   * @return int64
  **/
  @ApiModelProperty(value = "None")


  public Long getInt64() {
    return int64;
  }

  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  public Body2 number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * None
   * minimum: 32
   * maximum: 543
   * @return number
  **/
  @ApiModelProperty(required = true, value = "None")
  @NotNull

  @Valid
@DecimalMin("32") @DecimalMax("543") 
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public Body2 _float(Float _float) {
    this._float = _float;
    return this;
  }

  /**
   * None
   * maximum: 987
   * @return _float
  **/
  @ApiModelProperty(value = "None")

 @DecimalMax("987") 
  public Float getFloat() {
    return _float;
  }

  public void setFloat(Float _float) {
    this._float = _float;
  }

  public Body2 _double(Double _double) {
    this._double = _double;
    return this;
  }

  /**
   * None
   * minimum: 67
   * maximum: 123
   * @return _double
  **/
  @ApiModelProperty(required = true, value = "None")
  @NotNull

@DecimalMin("67") @DecimalMax("123") 
  public Double getDouble() {
    return _double;
  }

  public void setDouble(Double _double) {
    this._double = _double;
  }

  public Body2 string(String string) {
    this.string = string;
    return this;
  }

  /**
   * None
   * @return string
  **/
  @ApiModelProperty(value = "None")

@Pattern(regexp="/[a-z]/i") 
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public Body2 patternWithoutDelimiter(String patternWithoutDelimiter) {
    this.patternWithoutDelimiter = patternWithoutDelimiter;
    return this;
  }

  /**
   * None
   * @return patternWithoutDelimiter
  **/
  @ApiModelProperty(required = true, value = "None")
  @NotNull

@Pattern(regexp="^[A-Z].*") 
  public String getPatternWithoutDelimiter() {
    return patternWithoutDelimiter;
  }

  public void setPatternWithoutDelimiter(String patternWithoutDelimiter) {
    this.patternWithoutDelimiter = patternWithoutDelimiter;
  }

  public Body2 _byte(byte[] _byte) {
    this._byte = _byte;
    return this;
  }

  /**
   * None
   * @return _byte
  **/
  @ApiModelProperty(required = true, value = "None")
  @NotNull


  public byte[] getByte() {
    return _byte;
  }

  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  public Body2 binary(File binary) {
    this.binary = binary;
    return this;
  }

  /**
   * None
   * @return binary
  **/
  @ApiModelProperty(value = "None")

  @Valid

  public File getBinary() {
    return binary;
  }

  public void setBinary(File binary) {
    this.binary = binary;
  }

  public Body2 date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * None
   * @return date
  **/
  @ApiModelProperty(value = "None")

  @Valid

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Body2 dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * None
   * @return dateTime
  **/
  @ApiModelProperty(value = "None")

  @Valid

  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public Body2 password(String password) {
    this.password = password;
    return this;
  }

  /**
   * None
   * @return password
  **/
  @ApiModelProperty(value = "None")


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Body2 callback(String callback) {
    this.callback = callback;
    return this;
  }

  /**
   * None
   * @return callback
  **/
  @ApiModelProperty(value = "None")


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
    Body2 body2 = (Body2) o;
    return Objects.equals(this.integer, body2.integer) &&
        Objects.equals(this.int32, body2.int32) &&
        Objects.equals(this.int64, body2.int64) &&
        Objects.equals(this.number, body2.number) &&
        Objects.equals(this._float, body2._float) &&
        Objects.equals(this._double, body2._double) &&
        Objects.equals(this.string, body2.string) &&
        Objects.equals(this.patternWithoutDelimiter, body2.patternWithoutDelimiter) &&
        Objects.equals(this._byte, body2._byte) &&
        Objects.equals(this.binary, body2.binary) &&
        Objects.equals(this.date, body2.date) &&
        Objects.equals(this.dateTime, body2.dateTime) &&
        Objects.equals(this.password, body2.password) &&
        Objects.equals(this.callback, body2.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integer, int32, int64, number, _float, _double, string, patternWithoutDelimiter, _byte, binary, date, dateTime, password, callback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
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

