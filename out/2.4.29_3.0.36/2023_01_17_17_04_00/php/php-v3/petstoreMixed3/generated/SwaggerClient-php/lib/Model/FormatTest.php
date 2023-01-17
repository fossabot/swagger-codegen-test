<?php
/**
 * FormatTest
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
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
 * Swagger Codegen version: 3.0.36
 */
/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;
use \Swagger\Client\ObjectSerializer;

/**
 * FormatTest Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FormatTest implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $swaggerModelName = 'format_test';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerTypes = [
        'integer' => 'int',
'int32' => 'int',
'int64' => 'int',
'number' => 'float',
'float' => 'float',
'double' => 'double',
'string' => 'string',
'byte' => 'string',
'binary' => 'string',
'date' => '\DateTime',
'date_time' => '\DateTime',
'uuid' => 'string',
'password' => 'string'    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $swaggerFormats = [
        'integer' => null,
'int32' => 'int32',
'int64' => 'int64',
'number' => null,
'float' => 'float',
'double' => 'double',
'string' => null,
'byte' => 'byte',
'binary' => 'binary',
'date' => 'date',
'date_time' => 'date-time',
'uuid' => 'uuid',
'password' => 'password'    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function swaggerFormats()
    {
        return self::$swaggerFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'integer' => 'integer',
'int32' => 'int32',
'int64' => 'int64',
'number' => 'number',
'float' => 'float',
'double' => 'double',
'string' => 'string',
'byte' => 'byte',
'binary' => 'binary',
'date' => 'date',
'date_time' => 'dateTime',
'uuid' => 'uuid',
'password' => 'password'    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'integer' => 'setInteger',
'int32' => 'setInt32',
'int64' => 'setInt64',
'number' => 'setNumber',
'float' => 'setFloat',
'double' => 'setDouble',
'string' => 'setString',
'byte' => 'setByte',
'binary' => 'setBinary',
'date' => 'setDate',
'date_time' => 'setDateTime',
'uuid' => 'setUuid',
'password' => 'setPassword'    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'integer' => 'getInteger',
'int32' => 'getInt32',
'int64' => 'getInt64',
'number' => 'getNumber',
'float' => 'getFloat',
'double' => 'getDouble',
'string' => 'getString',
'byte' => 'getByte',
'binary' => 'getBinary',
'date' => 'getDate',
'date_time' => 'getDateTime',
'uuid' => 'getUuid',
'password' => 'getPassword'    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$swaggerModelName;
    }

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['integer'] = isset($data['integer']) ? $data['integer'] : null;
        $this->container['int32'] = isset($data['int32']) ? $data['int32'] : null;
        $this->container['int64'] = isset($data['int64']) ? $data['int64'] : null;
        $this->container['number'] = isset($data['number']) ? $data['number'] : null;
        $this->container['float'] = isset($data['float']) ? $data['float'] : null;
        $this->container['double'] = isset($data['double']) ? $data['double'] : null;
        $this->container['string'] = isset($data['string']) ? $data['string'] : null;
        $this->container['byte'] = isset($data['byte']) ? $data['byte'] : null;
        $this->container['binary'] = isset($data['binary']) ? $data['binary'] : null;
        $this->container['date'] = isset($data['date']) ? $data['date'] : null;
        $this->container['date_time'] = isset($data['date_time']) ? $data['date_time'] : null;
        $this->container['uuid'] = isset($data['uuid']) ? $data['uuid'] : null;
        $this->container['password'] = isset($data['password']) ? $data['password'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['number'] === null) {
            $invalidProperties[] = "'number' can't be null";
        }
        if ($this->container['byte'] === null) {
            $invalidProperties[] = "'byte' can't be null";
        }
        if ($this->container['date'] === null) {
            $invalidProperties[] = "'date' can't be null";
        }
        if ($this->container['password'] === null) {
            $invalidProperties[] = "'password' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets integer
     *
     * @return int
     */
    public function getInteger()
    {
        return $this->container['integer'];
    }

    /**
     * Sets integer
     *
     * @param int $integer integer
     *
     * @return $this
     */
    public function setInteger($integer)
    {
        $this->container['integer'] = $integer;

        return $this;
    }

    /**
     * Gets int32
     *
     * @return int
     */
    public function getInt32()
    {
        return $this->container['int32'];
    }

    /**
     * Sets int32
     *
     * @param int $int32 int32
     *
     * @return $this
     */
    public function setInt32($int32)
    {
        $this->container['int32'] = $int32;

        return $this;
    }

    /**
     * Gets int64
     *
     * @return int
     */
    public function getInt64()
    {
        return $this->container['int64'];
    }

    /**
     * Sets int64
     *
     * @param int $int64 int64
     *
     * @return $this
     */
    public function setInt64($int64)
    {
        $this->container['int64'] = $int64;

        return $this;
    }

    /**
     * Gets number
     *
     * @return float
     */
    public function getNumber()
    {
        return $this->container['number'];
    }

    /**
     * Sets number
     *
     * @param float $number number
     *
     * @return $this
     */
    public function setNumber($number)
    {
        $this->container['number'] = $number;

        return $this;
    }

    /**
     * Gets float
     *
     * @return float
     */
    public function getFloat()
    {
        return $this->container['float'];
    }

    /**
     * Sets float
     *
     * @param float $float float
     *
     * @return $this
     */
    public function setFloat($float)
    {
        $this->container['float'] = $float;

        return $this;
    }

    /**
     * Gets double
     *
     * @return double
     */
    public function getDouble()
    {
        return $this->container['double'];
    }

    /**
     * Sets double
     *
     * @param double $double double
     *
     * @return $this
     */
    public function setDouble($double)
    {
        $this->container['double'] = $double;

        return $this;
    }

    /**
     * Gets string
     *
     * @return string
     */
    public function getString()
    {
        return $this->container['string'];
    }

    /**
     * Sets string
     *
     * @param string $string string
     *
     * @return $this
     */
    public function setString($string)
    {
        $this->container['string'] = $string;

        return $this;
    }

    /**
     * Gets byte
     *
     * @return string
     */
    public function getByte()
    {
        return $this->container['byte'];
    }

    /**
     * Sets byte
     *
     * @param string $byte byte
     *
     * @return $this
     */
    public function setByte($byte)
    {
        $this->container['byte'] = $byte;

        return $this;
    }

    /**
     * Gets binary
     *
     * @return string
     */
    public function getBinary()
    {
        return $this->container['binary'];
    }

    /**
     * Sets binary
     *
     * @param string $binary binary
     *
     * @return $this
     */
    public function setBinary($binary)
    {
        $this->container['binary'] = $binary;

        return $this;
    }

    /**
     * Gets date
     *
     * @return \DateTime
     */
    public function getDate()
    {
        return $this->container['date'];
    }

    /**
     * Sets date
     *
     * @param \DateTime $date date
     *
     * @return $this
     */
    public function setDate($date)
    {
        $this->container['date'] = $date;

        return $this;
    }

    /**
     * Gets date_time
     *
     * @return \DateTime
     */
    public function getDateTime()
    {
        return $this->container['date_time'];
    }

    /**
     * Sets date_time
     *
     * @param \DateTime $date_time date_time
     *
     * @return $this
     */
    public function setDateTime($date_time)
    {
        $this->container['date_time'] = $date_time;

        return $this;
    }

    /**
     * Gets uuid
     *
     * @return string
     */
    public function getUuid()
    {
        return $this->container['uuid'];
    }

    /**
     * Sets uuid
     *
     * @param string $uuid uuid
     *
     * @return $this
     */
    public function setUuid($uuid)
    {
        $this->container['uuid'] = $uuid;

        return $this;
    }

    /**
     * Gets password
     *
     * @return string
     */
    public function getPassword()
    {
        return $this->container['password'];
    }

    /**
     * Sets password
     *
     * @param string $password password
     *
     * @return $this
     */
    public function setPassword($password)
    {
        $this->container['password'] = $password;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    #[\ReturnTypeWillChange] 
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    #[\ReturnTypeWillChange] 
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    #[\ReturnTypeWillChange] 
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    #[\ReturnTypeWillChange] 
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(
                ObjectSerializer::sanitizeForSerialization($this),
                JSON_PRETTY_PRINT
            );
        }

        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}
