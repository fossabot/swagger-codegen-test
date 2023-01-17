<?php
/**
 * Dog
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
 * Class representing the Dog model.
 *
 * @package Swagger\Server\Model
 * @author  Swagger Codegen team
 */
class Dog extends Animal 
{
        /**
     * @var string|null
     * @SerializedName("breed")
     * @Assert\Type("string")
     * @Type("string")
     */
    protected $breed;

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        parent::__construct($data);

        $this->breed = isset($data['breed']) ? $data['breed'] : null;
    }

    /**
     * Gets breed.
     *
     * @return string|null
     */
    public function getBreed()
    {
        return $this->breed;
    }

    /**
     * Sets breed.
     *
     * @param string|null $breed
     *
     * @return $this
     */
    public function setBreed($breed = null)
    {
        $this->breed = $breed;

        return $this;
    }
}


