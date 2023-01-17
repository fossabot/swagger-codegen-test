/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public interface IUserApiController
    { 
        /// <summary>
        /// Create user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="body">Created user object</param>
        /// <response code="0">successful operation</response>
        IActionResult CreateUser([FromBody]User body);

        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        
        /// <param name="body">List of user object</param>
        /// <response code="0">successful operation</response>
        IActionResult CreateUsersWithArrayInput([FromBody]List<User> body);

        /// <summary>
        /// Creates list of users with given input array
        /// </summary>
        
        /// <param name="body">List of user object</param>
        /// <response code="0">successful operation</response>
        IActionResult CreateUsersWithListInput([FromBody]List<User> body);

        /// <summary>
        /// Delete user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="username">The name that needs to be deleted</param>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        IActionResult DeleteUser([FromRoute][Required]string username);

        /// <summary>
        /// Get user by user name
        /// </summary>
        
        /// <param name="username">The name that needs to be fetched. Use user1 for testing. </param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username supplied</response>
        /// <response code="404">User not found</response>
        IActionResult GetUserByName([FromRoute][Required]string username);

        /// <summary>
        /// Logs user into the system
        /// </summary>
        
        /// <param name="username">The user name for login</param>
        /// <param name="password">The password for login in clear text</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid username/password supplied</response>
        IActionResult LoginUser([FromQuery][Required()]string username, [FromQuery][Required()]string password);

        /// <summary>
        /// Logs out current logged in user session
        /// </summary>
        
        /// <response code="0">successful operation</response>
        IActionResult LogoutUser();

        /// <summary>
        /// Updated user
        /// </summary>
        /// <remarks>This can only be done by the logged in user.</remarks>
        /// <param name="body">Updated user object</param>
        /// <param name="username">name that need to be deleted</param>
        /// <response code="400">Invalid user supplied</response>
        /// <response code="404">User not found</response>
        IActionResult UpdateUser([FromBody]User body, [FromRoute][Required]string username);
    }
}
