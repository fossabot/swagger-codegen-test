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
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using IO.Swagger.Attributes;
using IO.Swagger.Security;
using Microsoft.AspNetCore.Authorization;
using IO.Swagger.Models;

namespace IO.Swagger.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class StoreApiController : ControllerBase, IStoreApiController
    { 
        /// <summary>
        /// Delete purchase order by ID
        /// </summary>
        /// <remarks>For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors</remarks>
        /// <param name="orderId">ID of the order that needs to be deleted</param>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Order not found</response>
        [HttpDelete]
        [Route("/v2/store/order/{order_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteOrder")]
        public virtual IActionResult DeleteOrder([FromRoute][Required]string orderId)
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);


            throw new NotImplementedException();
        }

        /// <summary>
        /// Returns pet inventories by status
        /// </summary>
        /// <remarks>Returns a map of status codes to quantities</remarks>
        /// <response code="200">successful operation</response>
        [HttpGet]
        [Route("/v2/store/inventory")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("GetInventory")]
        [SwaggerResponse(statusCode: 200, type: typeof(Dictionary<string, int?>), description: "successful operation")]
        public virtual IActionResult GetInventory()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Dictionary<string, int?>));

            string exampleJson = null;
            exampleJson = "{\"empty\": false}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Dictionary<string, int?>>(exampleJson)
            : default(Dictionary<string, int?>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Find purchase order by ID
        /// </summary>
        /// <remarks>For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions</remarks>
        /// <param name="orderId">ID of pet that needs to be fetched</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Order not found</response>
        [HttpGet]
        [Route("/v2/store/order/{order_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetOrderById")]
        [SwaggerResponse(statusCode: 200, type: typeof(Order), description: "successful operation")]
        public virtual IActionResult GetOrderById([FromRoute][Required][Range(1, 5)]long? orderId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Order));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            string exampleJson = null;
            exampleJson = "<Order>\n  <id>123456789</id>\n  <petId>123456789</petId>\n  <quantity>123</quantity>\n  <shipDate>2000-01-23T04:56:07.000Z</shipDate>\n  <status>aeiou</status>\n  <complete>true</complete>\n</Order>";
            exampleJson = "{\"empty\": false}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Order>(exampleJson)
            : default(Order);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Place an order for a pet
        /// </summary>
        
        /// <param name="body">order placed for purchasing the pet</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid Order</response>
        [HttpPost]
        [Route("/v2/store/order")]
        [ValidateModelState]
        [SwaggerOperation("PlaceOrder")]
        [SwaggerResponse(statusCode: 200, type: typeof(Order), description: "successful operation")]
        public virtual IActionResult PlaceOrder([FromBody]Order body)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Order));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            string exampleJson = null;
            exampleJson = "<Order>\n  <id>123456789</id>\n  <petId>123456789</petId>\n  <quantity>123</quantity>\n  <shipDate>2000-01-23T04:56:07.000Z</shipDate>\n  <status>aeiou</status>\n  <complete>true</complete>\n</Order>";
            exampleJson = "{\"empty\": false}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Order>(exampleJson)
            : default(Order);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
