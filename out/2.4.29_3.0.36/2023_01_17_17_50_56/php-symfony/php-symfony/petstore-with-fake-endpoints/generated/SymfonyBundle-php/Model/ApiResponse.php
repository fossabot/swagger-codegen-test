<?php
/**
 * ApiResponse
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
 * Class representing the ApiResponse model.
 *
 * @package Swagger\Server\Model
 * @author  Swagger Codegen team
 */
class ApiResponse 
{
        /**
     * @var int|null
     * @SerializedName("code")
     * @Assert\Type("int")
     * @Type("int")
     */
    protected $code;

    /**
     * @var string|null
     * @SerializedName("type")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $type;

    /**
     * @var string|null
     * @SerializedName("message")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $message;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->code = isset($data['code']) ? $data['code'] : null;
        $this->type = isset($data['type']) ? $data['type'] : null;
        $this->message = isset($data['message']) ? $data['message'] : null;
    }

    /**
     * Gets code.
     *
     * @return int|null
     */
    public function getCode()
    {
        return $this->code;
    }

    /**
     * Sets code.
     *
     * @param int|null $code
     *
     * @return $this
     */
    public function setCode($code = null)
    {
        $this->code = $code;

        return $this;
    }

    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Sets type.
     *
     * @param string|null $type
     *
     * @return $this
     */
    public function setType($type = null)
    {
        $this->type = $type;

        return $this;
    }

    /**
     * Gets message.
     *
     * @return string|null
     */
    public function getMessage()
    {
        return $this->message;
    }

    /**
     * Sets message.
     *
     * @param string|null $message
     *
     * @return $this
     */
    public function setMessage($message = null)
    {
        $this->message = $message;

        return $this;
    }
}


