/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Dog;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-17T18:08:00.983Z[Etc/UTC]")
@Validated
@Api(value = "Dog", description = "the Dog API")
public interface DogApi {

    @ApiOperation(value = "Add a new dog to the store", nickname = "addDog", notes = "", authorizations = {
        @Authorization(value = "http_bearer_test")    }, tags={ "dog", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/dog",
        consumes = "application/json",
        method = RequestMethod.POST)
    com.netflix.hystrix.HystrixCommand<ResponseEntity<Void>> addDog(@ApiParam(value = "Dog object that needs to be added to the store", required=true ) @Valid @RequestBody Dog body);


    @ApiOperation(value = "Deletes a dog", nickname = "deleteDog", notes = "", authorizations = {
        @Authorization(value = "http_bearer_test")    }, tags={ "dog", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid dog value") })
    @RequestMapping(value = "/dog/{dogId}",
        method = RequestMethod.DELETE)
    com.netflix.hystrix.HystrixCommand<ResponseEntity<Void>> deleteDog(@ApiParam(value = "Dog id to delete", required=true) @PathVariable("dogId") Long dogId, @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey);


    @ApiOperation(value = "Find dog by ID", nickname = "getDogById", notes = "Returns a single dog", response = Dog.class, authorizations = {
        @Authorization(value = "http_bearer_test")    }, tags={ "dog", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Dog.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/dog/{dogId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    com.netflix.hystrix.HystrixCommand<ResponseEntity<Dog>> getDogById(@ApiParam(value = "ID of dog to return", required=true) @PathVariable("dogId") Long dogId);


    @ApiOperation(value = "Update an existing dog", nickname = "updateDog", notes = "", authorizations = {
        @Authorization(value = "http_bearer_test")    }, tags={ "dog", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Animal not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/dog",
        consumes = "application/json",
        method = RequestMethod.PUT)
    com.netflix.hystrix.HystrixCommand<ResponseEntity<Void>> updateDog(@ApiParam(value = "Dog object that needs to be added.", required=true ) @Valid @RequestBody Dog body);


    @ApiOperation(value = "Updates a dog", nickname = "updateDogWithForm", notes = "", authorizations = {
        @Authorization(value = "http_bearer_test")    }, tags={ "dog", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/dog/{dogId}",
        consumes = "application/x-www-form-urlencoded",
        method = RequestMethod.POST)
    com.netflix.hystrix.HystrixCommand<ResponseEntity<Void>> updateDogWithForm(@ApiParam(value = "ID of dog that needs to be updated", required=true) @PathVariable("dogId") Long dogId, @ApiParam(value = "") @RequestParam(value="name", required=false)  String name, @ApiParam(value = "") @RequestParam(value="status", required=false)  String status);

}

