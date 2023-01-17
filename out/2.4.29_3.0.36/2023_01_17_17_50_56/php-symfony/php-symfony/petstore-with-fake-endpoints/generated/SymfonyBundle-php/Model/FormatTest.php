<?php
/**
 * FormatTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Server\Model
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the FormatTest model.
 *
 * @package Swagger\Server\Model
 * @author  Swagger Codegen team
 */
class FormatTest 
{
        /**
     * @var int|null
     * @SerializedName("integer")
     * @Assert\Type("int")
     * @Type("int")
     * @Assert\GreaterThanOrEqual(10)
     * @Assert\LessThanOrEqual(100)
     */
    protected $integer;

    /**
     * @var int|null
     * @SerializedName("int32")
     * @Assert\Type("int")
     * @Type("int")
     * @Assert\GreaterThanOrEqual(20)
     * @Assert\LessThanOrEqual(200)
     */
    protected $int32;

    /**
     * @var int|null
     * @SerializedName("int64")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $int64;

    /**
     * @var float
     * @SerializedName("number")
     * @Assert\NotNull()
     * @Assert\Type("float")
     * @Type("float")
     * @Assert\GreaterThanOrEqual(32.1)
     * @Assert\LessThanOrEqual(543.2)
     */
    protected $number;

    /**
     * @var float|null
     * @SerializedName("float")
     * @Assert\Type("float")
     * @Type("float")
     * @Assert\GreaterThanOrEqual(54.3)
     * @Assert\LessThanOrEqual(987.6)
     */
    protected $float;

    /**
     * @var double|null
     * @SerializedName("double")
     * @Assert\Type("double")
     * @Type("double")
     * @Assert\GreaterThanOrEqual(67.8)
     * @Assert\LessThanOrEqual(123.4)
     */
    protected $double;

    /**
     * @var string|null
     * @SerializedName("string")
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Regex("//[a-z]/i/")
     */
    protected $string;

    /**
     * @var string
     * @SerializedName("byte")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Regex("/^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}&#x3D;&#x3D;|[A-Za-z0-9+/]{3}&#x3D;)?$/")
     */
    protected $byte;

    /**
     * @var string|null
     * @SerializedName("binary")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $binary;

    /**
     * @var \DateTime
     * @SerializedName("date")
     * @Assert\NotNull()
     * @Assert\Date()
     * @Type("DateTime")
     */
    protected $date;

    /**
     * @var \DateTime|null
     * @SerializedName("dateTime")
     * @Assert\DateTime()
     * @Type("DateTime")
     */
    protected $dateTime;

    /**
     * @var string|null
     * @SerializedName("uuid")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $uuid;

    /**
     * @var string
     * @SerializedName("password")
     * @Assert\NotNull()
     * @Assert\Type("string")
     * @Type("string")
     * @Assert\Length(
     *   max = 64
     * )
     * @Assert\Length(
     *   min = 10
     * )
     */
    protected $password;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->integer = isset($data['integer']) ? $data['integer'] : null;
        $this->int32 = isset($data['int32']) ? $data['int32'] : null;
        $this->int64 = isset($data['int64']) ? $data['int64'] : null;
        $this->number = isset($data['number']) ? $data['number'] : null;
        $this->float = isset($data['float']) ? $data['float'] : null;
        $this->double = isset($data['double']) ? $data['double'] : null;
        $this->string = isset($data['string']) ? $data['string'] : null;
        $this->byte = isset($data['byte']) ? $data['byte'] : null;
        $this->binary = isset($data['binary']) ? $data['binary'] : null;
        $this->date = isset($data['date']) ? $data['date'] : null;
        $this->dateTime = isset($data['dateTime']) ? $data['dateTime'] : null;
        $this->uuid = isset($data['uuid']) ? $data['uuid'] : null;
        $this->password = isset($data['password']) ? $data['password'] : null;
    }

    /**
     * Gets integer.
     *
     * @return int|null
     */
    public function getInteger()
    {
        return $this->integer;
    }

    /**
     * Sets integer.
     *
     * @param int|null $integer
     *
     * @return $this
     */
    public function setInteger($integer = null)
    {
        $this->integer = $integer;

        return $this;
    }

    /**
     * Gets int32.
     *
     * @return int|null
     */
    public function getInt32()
    {
        return $this->int32;
    }

    /**
     * Sets int32.
     *
     * @param int|null $int32
     *
     * @return $this
     */
    public function setInt32($int32 = null)
    {
        $this->int32 = $int32;

        return $this;
    }

    /**
     * Gets int64.
     *
     * @return int|null
     */
    public function getInt64()
    {
        return $this->int64;
    }

    /**
     * Sets int64.
     *
     * @param int|null $int64
     *
     * @return $this
     */
    public function setInt64($int64 = null)
    {
        $this->int64 = $int64;

        return $this;
    }

    /**
     * Gets number.
     *
     * @return float
     */
    public function getNumber()
    {
        return $this->number;
    }

    /**
     * Sets number.
     *
     * @param float $number
     *
     * @return $this
     */
    public function setNumber($number)
    {
        $this->number = $number;

        return $this;
    }

    /**
     * Gets float.
     *
     * @return float|null
     */
    public function getFloat()
    {
        return $this->float;
    }

    /**
     * Sets float.
     *
     * @param float|null $float
     *
     * @return $this
     */
    public function setFloat($float = null)
    {
        $this->float = $float;

        return $this;
    }

    /**
     * Gets double.
     *
     * @return double|null
     */
    public function getDouble()
    {
        return $this->double;
    }

    /**
     * Sets double.
     *
     * @param double|null $double
     *
     * @return $this
     */
    public function setDouble($double = null)
    {
        $this->double = $double;

        return $this;
    }

    /**
     * Gets string.
     *
     * @return string|null
     */
    public function getString()
    {
        return $this->string;
    }

    /**
     * Sets string.
     *
     * @param string|null $string
     *
     * @return $this
     */
    public function setString($string = null)
    {
        $this->string = $string;

        return $this;
    }

    /**
     * Gets byte.
     *
     * @return string
     */
    public function getByte()
    {
        return $this->byte;
    }

    /**
     * Sets byte.
     *
     * @param string $byte
     *
     * @return $this
     */
    public function setByte($byte)
    {
        $this->byte = $byte;

        return $this;
    }

    /**
     * Gets binary.
     *
     * @return string|null
     */
    public function getBinary()
    {
        return $this->binary;
    }

    /**
     * Sets binary.
     *
     * @param string|null $binary
     *
     * @return $this
     */
    public function setBinary($binary = null)
    {
        $this->binary = $binary;

        return $this;
    }

    /**
     * Gets date.
     *
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->date;
    }

    /**
     * Sets date.
     *
     * @param \DateTime $date
     *
     * @return $this
     */
    public function setDate(\DateTime $date)
    {
        $this->date = $date;

        return $this;
    }

    /**
     * Gets dateTime.
     *
     * @return \DateTime|null
     */
    public function getDateTime()
    {
        return $this->dateTime;
    }

    /**
     * Sets dateTime.
     *
     * @param \DateTime|null $dateTime
     *
     * @return $this
     */
    public function setDateTime(\DateTime $dateTime = null)
    {
        $this->dateTime = $dateTime;

        return $this;
    }

    /**
     * Gets uuid.
     *
     * @return string|null
     */
    public function getUuid()
    {
        return $this->uuid;
    }

    /**
     * Sets uuid.
     *
     * @param string|null $uuid
     *
     * @return $this
     */
    public function setUuid($uuid = null)
    {
        $this->uuid = $uuid;

        return $this;
    }

    /**
     * Gets password.
     *
     * @return string
     */
    public function getPassword()
    {
        return $this->password;
    }

    /**
     * Sets password.
     *
     * @param string $password
     *
     * @return $this
     */
    public function setPassword($password)
    {
        $this->password = $password;

        return $this;
    }
}


