/*
 * Swagger Petstore
 *
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
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
    public class PetApiController : ControllerBase
    { 
        /// <summary>
        /// Add a new parrow to the store
        /// </summary>
        /// <param name="body"></param>
        /// <response code="405">Invalid input</response>
        /// <response code="200">successful operation</response>
        [HttpPost]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/parrot")]
        [ValidateModelState]
        [SwaggerOperation("AddParrot")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse2001), description: "successful operation")]
        public virtual IActionResult AddParrot([FromBody]ParrotBody1 body)
        { 
            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse2001));
            string exampleJson = null;
            exampleJson = "\"\"";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<InlineResponse2001>(exampleJson)
                        : default(InlineResponse2001);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Add a new pet to the store
        /// </summary>
        /// <param name="body">Pet object that needs to be added to the store</param>
        /// <response code="405">Invalid input</response>
        [HttpPost]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet")]
        [ValidateModelState]
        [SwaggerOperation("AddPet")]
        public virtual IActionResult AddPet([FromBody]Pet body)
        { 
            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Deletes a pet
        /// </summary>
        /// <param name="petId">Pet id to delete</param>
        /// <param name="apiKey"></param>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        [HttpDelete]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/{petId}")]
        [ValidateModelState]
        [SwaggerOperation("DeletePet")]
        public virtual IActionResult DeletePet([FromRoute][Required]long? petId, [FromHeader]string apiKey)
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="body"></param>
        /// <response code="200">successful operation</response>
        [HttpPost]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/category")]
        [ValidateModelState]
        [SwaggerOperation("DoCategoryStuff")]
        [SwaggerResponse(statusCode: 200, type: typeof(ModelApiResponse), description: "successful operation")]
        public virtual IActionResult DoCategoryStuff([FromBody]SubCategory body)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ModelApiResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<ModelApiResponse>(exampleJson)
                        : default(ModelApiResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Find pet by ID
        /// </summary>
        /// <remarks>schedule pet feeding</remarks>
        /// <param name="body">Pet object that needs to be added to the store</param>
        /// <param name="token">status</param>
        /// <param name="petType">type of food</param>
        /// <param name="status">status</param>
        /// <param name="petId">ID of pet to return</param>
        /// <response code="200">successful operation</response>
        [HttpPost]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/feed/{petId}")]
        [ValidateModelState]
        [SwaggerOperation("FeedPet")]
        public virtual IActionResult FeedPet([FromBody]Pet body, [FromHeader][Required()]string token, [FromQuery][Required()]string petType, [FromQuery][Required()]string status, [FromRoute][Required]long? petId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Finds Pets by status
        /// </summary>
        /// <remarks>Multiple status values can be provided with comma separated strings</remarks>
        /// <param name="status">Status values that need to be considered for filter</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid status value</response>
        [HttpGet]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/findByStatus")]
        [ValidateModelState]
        [SwaggerOperation("FindPetsByStatus")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Pet>), description: "successful operation")]
        public virtual IActionResult FindPetsByStatus([FromQuery][Required()]List<string> status)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Pet>));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "[ {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n}, {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n} ]";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<List<Pet>>(exampleJson)
                        : default(List<Pet>);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Finds Pets by tags
        /// </summary>
        /// <remarks>Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing.</remarks>
        /// <param name="tags">Tags to filter by</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid tag value</response>
        [HttpGet]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/findByTags")]
        [ValidateModelState]
        [SwaggerOperation("FindPetsByTags")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Pet>), description: "successful operation")]
        public virtual IActionResult FindPetsByTags([FromQuery][Required()]List<string> tags)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Pet>));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "[ {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n}, {\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n} ]";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<List<Pet>>(exampleJson)
                        : default(List<Pet>);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// get Parrots
        /// </summary>
        /// <response code="200">successful operation</response>
        [HttpGet]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/parrot")]
        [ValidateModelState]
        [SwaggerOperation("GetParrots")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Object>), description: "successful operation")]
        public virtual IActionResult GetParrots()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Object>));
            string exampleJson = null;
            exampleJson = "[ \"\", \"\" ]";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<List<Object>>(exampleJson)
                        : default(List<Object>);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Find pet by ID
        /// </summary>
        /// <remarks>Returns a single pet</remarks>
        /// <param name="petId">ID of pet to return</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        [HttpGet]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/{petId}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("GetPetById")]
        [SwaggerResponse(statusCode: 200, type: typeof(Pet), description: "successful operation")]
        public virtual IActionResult GetPetById([FromRoute][Required]long? petId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Pet));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"part\" : [ \"\", \"\" ],\n  \"name\" : \"doggie\",\n  \"id\" : 0,\n  \"status\" : \"available\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<Pet>(exampleJson)
                        : default(Pet);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// update parrots
        /// </summary>
        /// <param name="body"></param>
        /// <response code="405">Invalid input</response>
        /// <response code="200">successful operation</response>
        [HttpPut]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/parrot")]
        [ValidateModelState]
        [SwaggerOperation("UpdateParrots")]
        [SwaggerResponse(statusCode: 200, type: typeof(InlineResponse200), description: "successful operation")]
        public virtual IActionResult UpdateParrots([FromBody]ParrotBody body)
        { 
            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(InlineResponse200));
            string exampleJson = null;
            exampleJson = "{\n  \"parrots\" : [ \"\", \"\" ]\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<InlineResponse200>(exampleJson)
                        : default(InlineResponse200);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update an existing pet
        /// </summary>
        /// <param name="body">Pet object that needs to be added to the store</param>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        /// <response code="405">Validation exception</response>
        [HttpPut]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet")]
        [ValidateModelState]
        [SwaggerOperation("UpdatePet")]
        public virtual IActionResult UpdatePet([FromBody]Pet body)
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);

            throw new NotImplementedException();
        }


        /// <summary>
        /// uploads an image
        /// </summary>
        /// <param name="petId">ID of pet to update</param>
        /// <param name="body"></param>
        /// <response code="200">successful operation</response>
        [HttpPost]
        [Route("/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/{petId}/uploadImage")]
        [ValidateModelState]
        [SwaggerOperation("UploadFile")]
        [SwaggerResponse(statusCode: 200, type: typeof(ModelApiResponse), description: "successful operation")]
        public virtual IActionResult UploadFile([FromRoute][Required]long? petId, [FromBody]Object body)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ModelApiResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"code\" : 0,\n  \"type\" : \"type\",\n  \"message\" : \"message\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<ModelApiResponse>(exampleJson)
                        : default(ModelApiResponse);            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
