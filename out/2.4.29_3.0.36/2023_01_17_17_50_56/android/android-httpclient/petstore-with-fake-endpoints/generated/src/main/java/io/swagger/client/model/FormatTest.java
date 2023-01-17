package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class FormatTest  {
  
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
  @SerializedName("byte")
  private byte[] _byte = null;
  @SerializedName("binary")
  private byte[] binary = null;
  @SerializedName("date")
  private Date date = null;
  @SerializedName("dateTime")
  private Date dateTime = null;
  @SerializedName("uuid")
  private UUID uuid = null;
  @SerializedName("password")
  private String password = null;

  /**
   * minimum: 10
   * maximum: 100
   **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public Integer getInt32() {
    return int32;
  }
  public void setInt32(Integer int32) {
    this.int32 = int32;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getInt64() {
    return int64;
  }
  public void setInt64(Long int64) {
    this.int64 = int64;
  }

  /**
   * minimum: 32.1
   * maximum: 543.2
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getNumber() {
    return number;
  }
  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  /**
   * minimum: 54.3
   * maximum: 987.6
   **/
  @ApiModelProperty(value = "")
  public Float getFloat() {
    return _float;
  }
  public void setFloat(Float _float) {
    this._float = _float;
  }

  /**
   * minimum: 67.8
   * maximum: 123.4
   **/
  @ApiModelProperty(value = "")
  public Double getDouble() {
    return _double;
  }
  public void setDouble(Double _double) {
    this._double = _double;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getString() {
    return string;
  }
  public void setString(String string) {
    this.string = string;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public byte[] getByte() {
    return _byte;
  }
  public void setByte(byte[] _byte) {
    this._byte = _byte;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public byte[] getBinary() {
    return binary;
  }
  public void setBinary(byte[] binary) {
    this.binary = binary;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    return (this.integer == null ? formatTest.integer == null : this.integer.equals(formatTest.integer)) &&
        (this.int32 == null ? formatTest.int32 == null : this.int32.equals(formatTest.int32)) &&
        (this.int64 == null ? formatTest.int64 == null : this.int64.equals(formatTest.int64)) &&
        (this.number == null ? formatTest.number == null : this.number.equals(formatTest.number)) &&
        (this._float == null ? formatTest._float == null : this._float.equals(formatTest._float)) &&
        (this._double == null ? formatTest._double == null : this._double.equals(formatTest._double)) &&
        (this.string == null ? formatTest.string == null : this.string.equals(formatTest.string)) &&
        (this._byte == null ? formatTest._byte == null : this._byte.equals(formatTest._byte)) &&
        (this.binary == null ? formatTest.binary == null : this.binary.equals(formatTest.binary)) &&
        (this.date == null ? formatTest.date == null : this.date.equals(formatTest.date)) &&
        (this.dateTime == null ? formatTest.dateTime == null : this.dateTime.equals(formatTest.dateTime)) &&
        (this.uuid == null ? formatTest.uuid == null : this.uuid.equals(formatTest.uuid)) &&
        (this.password == null ? formatTest.password == null : this.password.equals(formatTest.password));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.integer == null ? 0: this.integer.hashCode());
    result = 31 * result + (this.int32 == null ? 0: this.int32.hashCode());
    result = 31 * result + (this.int64 == null ? 0: this.int64.hashCode());
    result = 31 * result + (this.number == null ? 0: this.number.hashCode());
    result = 31 * result + (this._float == null ? 0: this._float.hashCode());
    result = 31 * result + (this._double == null ? 0: this._double.hashCode());
    result = 31 * result + (this.string == null ? 0: this.string.hashCode());
    result = 31 * result + (this._byte == null ? 0: this._byte.hashCode());
    result = 31 * result + (this.binary == null ? 0: this.binary.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.dateTime == null ? 0: this.dateTime.hashCode());
    result = 31 * result + (this.uuid == null ? 0: this.uuid.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormatTest {\n");
    
    sb.append("  integer: ").append(integer).append("\n");
    sb.append("  int32: ").append(int32).append("\n");
    sb.append("  int64: ").append(int64).append("\n");
    sb.append("  number: ").append(number).append("\n");
    sb.append("  _float: ").append(_float).append("\n");
    sb.append("  _double: ").append(_double).append("\n");
    sb.append("  string: ").append(string).append("\n");
    sb.append("  _byte: ").append(_byte).append("\n");
    sb.append("  binary: ").append(binary).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  dateTime: ").append(dateTime).append("\n");
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
