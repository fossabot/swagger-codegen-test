<?php
/**
 * UserApiInterface
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

namespace Swagger\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use Swagger\Server\Model\User;

/**
 * UserApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  Swagger\Server\Api
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
interface UserApiInterface
{

    /**
     * Operation createUser
     *
     * Create user
     *
     * @param  Swagger\Server\Model\User $body  Created user object (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function createUser(User $body, &$responseCode, array &$responseHeaders);

    /**
     * Operation createUsersWithArrayInput
     *
     * Creates list of users with given input array
     *
     * @param  Swagger\Server\Model\User[] $body  List of user object (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function createUsersWithArrayInput(array $body, &$responseCode, array &$responseHeaders);

    /**
     * Operation createUsersWithListInput
     *
     * Creates list of users with given input array
     *
     * @param  Swagger\Server\Model\User[] $body  List of user object (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function createUsersWithListInput(array $body, &$responseCode, array &$responseHeaders);

    /**
     * Operation deleteUser
     *
     * Delete user
     *
     * @param  string $username  The name that needs to be deleted (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function deleteUser($username, &$responseCode, array &$responseHeaders);

    /**
     * Operation getUserByName
     *
     * Get user by user name
     *
     * @param  string $username  The name that needs to be fetched. Use user1 for testing. (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return Swagger\Server\Model\User[]
     *
     */
    public function getUserByName($username, &$responseCode, array &$responseHeaders);

    /**
     * Operation loginUser
     *
     * Logs user into the system
     *
     * @param  string $username  The user name for login (required)
     * @param  string $password  The password for login in clear text (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return string
     *
     */
    public function loginUser($username, $password, &$responseCode, array &$responseHeaders);

    /**
     * Operation logoutUser
     *
     * Logs out current logged in user session
     *
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function logoutUser(&$responseCode, array &$responseHeaders);

    /**
     * Operation updateUser
     *
     * Updated user
     *
     * @param  string $username  name that need to be deleted (required)
     * @param  Swagger\Server\Model\User $body  Updated user object (required)
     * @param  integer $responseCode     The HTTP response code to return
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return void
     *
     */
    public function updateUser($username, User $body, &$responseCode, array &$responseHeaders);
}
