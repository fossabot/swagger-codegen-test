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
    public class AnimalApiController : ControllerBase, IAnimalApiController
    { 
        /// <summary>
        /// Add a new animal to the store
        /// </summary>
        /// <param name="body">Animal object that needs to be added to the store</param>
        /// <response code="405">Invalid input</response>
        [HttpPost]
        [Route("/v3/animal")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("AddAnimal")]
        public virtual IActionResult AddAnimal([FromBody]Animal body)
        { 
            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Deletes a animal
        /// </summary>
        /// <param name="animalId">Animal id to delete</param>
        /// <param name="apiKey"></param>
        /// <response code="400">Invalid animal value</response>
        [HttpDelete]
        [Route("/v3/animal/{animalId}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("DeleteAnimal")]
        public virtual IActionResult DeleteAnimal([FromRoute][Required]long? animalId, [FromHeader]string apiKey)
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Find animal by ID
        /// </summary>
        /// <remarks>Returns a single animal</remarks>
        /// <param name="animalId">ID of pet to return</param>
        /// <response code="200">successful operation</response>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Pet not found</response>
        [HttpGet]
        [Route("/v3/animal/{animalId}")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("GetAnimalById")]
        [SwaggerResponse(statusCode: 200, type: typeof(Animal), description: "successful operation")]
        public virtual IActionResult GetAnimalById([FromRoute][Required]long? animalId)
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Animal));

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"color\" : \"red\",\n  \"className\" : \"className\"\n}";
            
                        var example = exampleJson != null
                        ? JsonConvert.DeserializeObject<Animal>(exampleJson)
                        : default(Animal);            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update an existing animal
        /// </summary>
        /// <param name="body">Animal object that needs to be added.</param>
        /// <response code="400">Invalid ID supplied</response>
        /// <response code="404">Animal not found</response>
        /// <response code="405">Validation exception</response>
        [HttpPut]
        [Route("/v3/animal")]
        [Authorize(AuthenticationSchemes = ApiKeyAuthenticationHandler.SchemeName)]
        [ValidateModelState]
        [SwaggerOperation("UpdateAnimal")]
        public virtual IActionResult UpdateAnimal([FromBody]Animal body)
        { 
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);

            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            //TODO: Uncomment the next line to return response 405 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(405);

            throw new NotImplementedException();
        }

    }
}
