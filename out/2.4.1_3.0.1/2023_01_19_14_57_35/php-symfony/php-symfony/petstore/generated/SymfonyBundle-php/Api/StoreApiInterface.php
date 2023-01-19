<?php
/**
 * StoreApiInterface
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Server
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use Swagger\Server\Model\Order;

/**
 * StoreApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  Swagger\Server\Api
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
interface StoreApiInterface
{

    /**
     * Sets authentication method api_key
     *
     * @param string $value Value of the api_key authentication method.
     *
     * @return void
     */
    public function setapi_key($value);

    /**
     * Operation deleteOrder
     *
     * Delete purchase order by ID
     *
     * @param  int $orderId  ID of the order that needs to be deleted (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function deleteOrder($orderId, &$responseCode, array &$responseHeaders);

    /**
     * Operation getInventory
     *
     * Returns pet inventories by status
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return int
     *
     */
    public function getInventory(&$responseCode, array &$responseHeaders);

    /**
     * Operation getOrderById
     *
     * Find purchase order by ID
     *
     * @param  int $orderId  ID of pet that needs to be fetched (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return Swagger\Server\Model\Order[]
     *
     */
    public function getOrderById($orderId, &$responseCode, array &$responseHeaders);

    /**
     * Operation placeOrder
     *
     * Place an order for a pet
     *
     * @param  Swagger\Server\Model\Order $body  order placed for purchasing the pet (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return Swagger\Server\Model\Order[]
     *
     */
    public function placeOrder(Order $body, &$responseCode, array &$responseHeaders);
}
