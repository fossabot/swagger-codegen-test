/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Category;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.Tag;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:16:02.905Z[Etc/UTC]")

@Api(value = "pet", description = "the pet API")
public interface PetApi {

    @ApiOperation(value = "Add a new pet to the store", nickname = "addPet", notes = "Add a new pet to the store", response = Pet.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Pet.class),
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/pet",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Pet> addPet(@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="category", required=false)  Category category,@ApiParam(value = "") @RequestParam(value="photoUrls", required=false)  List<String> photoUrls,@ApiParam(value = "") @RequestParam(value="tags", required=false)  List<Tag> tags,@ApiParam(value = "", allowableValues="available, pending, sold") @RequestParam(value="status", required=false)  String status);


    @ApiOperation(value = "Deletes a pet", nickname = "deletePet", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid pet value") })
    @RequestMapping(value = "/pet/{petId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey);


    @ApiOperation(value = "Finds Pets by status", nickname = "findPetsByStatus", notes = "Multiple status values can be provided with comma separated strings", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid status value") })
    @RequestMapping(value = "/pet/findByStatus",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Pet>> findPetsByStatus(@ApiParam(value = "Status values that need to be considered for filter", allowableValues = "available, pending, sold") @Valid @RequestParam(value = "status", required = false) String status);


    @ApiOperation(value = "Finds Pets by tags", nickname = "findPetsByTags", notes = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.", response = Pet.class, responseContainer = "List", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid tag value") })
    @RequestMapping(value = "/pet/findByTags",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Pet>> findPetsByTags(@ApiParam(value = "Tags to filter by") @Valid @RequestParam(value = "tags", required = false) List<String> tags);


    @ApiOperation(value = "Find pet by ID", nickname = "getPetById", notes = "Returns a single pet", response = Pet.class, authorizations = {
        @Authorization(value = "api_key"),
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found") })
    @RequestMapping(value = "/pet/{petId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return",required=true) @PathVariable("petId") Long petId);


    @ApiOperation(value = "Update an existing pet", nickname = "updatePet", notes = "Update an existing pet by Id", response = Pet.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = Pet.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied"),
        @ApiResponse(code = 404, message = "Pet not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/pet",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<Pet> updatePet(@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="category", required=false)  Category category,@ApiParam(value = "") @RequestParam(value="photoUrls", required=false)  List<String> photoUrls,@ApiParam(value = "") @RequestParam(value="tags", required=false)  List<Tag> tags,@ApiParam(value = "", allowableValues="available, pending, sold") @RequestParam(value="status", required=false)  String status);


    @ApiOperation(value = "Updates a pet in the store with form data", nickname = "updatePetWithForm", notes = "", authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input") })
    @RequestMapping(value = "/pet/{petId}",
        method = RequestMethod.POST)
    ResponseEntity<Void> updatePetWithForm(@ApiParam(value = "ID of pet that needs to be updated",required=true) @PathVariable("petId") Long petId,@ApiParam(value = "Name of pet that needs to be updated") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "Status of pet that needs to be updated") @Valid @RequestParam(value = "status", required = false) String status);


    @ApiOperation(value = "uploads an image", nickname = "uploadFile", notes = "", response = ModelApiResponse.class, authorizations = {
        @Authorization(value = "petstore_auth", scopes = {
            @AuthorizationScope(scope = "", description = "")
            })
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ModelApiResponse.class) })
    @RequestMapping(value = "/pet/{petId}/uploadImage",
        produces = { "application/json" }, 
        consumes = { "application/octet-stream" },
        method = RequestMethod.POST)
    ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update",required=true) @PathVariable("petId") Long petId,@ApiParam(value = ""  )  @Valid @RequestBody Object body,@ApiParam(value = "Additional Metadata") @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata);

}
