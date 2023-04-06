package io.swagger.api;

import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import io.swagger.model.SubCategory;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pet")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-04-06T09:18:13.932Z[Etc/UTC]")
public interface PetApi {

    @POST
    @Consumes({ "application/json", "application/xml" })
    @Operation(summary = "Add a new pet to the store", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    Response addPet(@Valid Pet body);
    @DELETE
    @Path("/{petId}")
    @Operation(summary = "Deletes a pet", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    Response deletePet( @PathParam("petId")

 @Parameter(description = "Pet id to delete") Long petId
,  @HeaderParam("api_key") 

 String apiKey
);
    @POST
    @Path("/category")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    Response doCategoryStuff(@Valid SubCategory body);
    @POST
    @Path("/feed/{petId}")
    @Consumes({ "application/json", "application/xml" })
    @Operation(summary = "Find pet by ID", description = "schedule pet feeding", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    Response feedPet(@Valid Pet body, @NotNull  @HeaderParam("token") 

 @Parameter(description = "status") String token
, @NotNull  @QueryParam("petType") 

 @Parameter(description = "type of food")  String petType
, @NotNull  @QueryParam("status") 

 @Parameter(description = "status")  String status
, @PathParam("petId")

 @Parameter(description = "ID of pet to return") Long petId
,);
    @GET
    @Path("/findByStatus")
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Finds Pets by status", description = "Multiple status values can be provided with comma separated strings", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid status value") })
    Response findPetsByStatus( @NotNull  @QueryParam("status") 

 @Parameter(description = "Status values that need to be considered for filter")  List<String> status
);
    @GET
    @Path("/findByTags")
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Finds Pets by tags", description = "Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing.", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Pet.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid tag value") })
    Response findPetsByTags( @NotNull  @QueryParam("tags") 

 @Parameter(description = "Tags to filter by")  List<String> tags
);
    @GET
    @Path("/{petId}")
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Find pet by ID", description = "Returns a single pet", security = {
        @SecurityRequirement(name = "api_key")    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Pet.class))),
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    Response getPetById( @PathParam("petId")

 @Parameter(description = "ID of pet to return") Long petId
);
    @PUT
    @Consumes({ "application/json", "application/xml" })
    @Operation(summary = "Update an existing pet", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        @ApiResponse(responseCode = "404", description = "Pet not found"),
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    Response updatePet(@Valid Pet body);
    @POST
    @Path("/{petId}")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Operation(summary = "Updates a pet in the store with form data", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    Response updatePetWithForm( @PathParam("petId")

 @Parameter(description = "ID of pet that needs to be updated") Long petId
,@FormParam(value = "name")  String name,@FormParam(value = "status")  String status);
    @POST
    @Path("/{petId}/uploadImage")
    @Consumes({ "application/octet-stream" })
    @Produces({ "application/json" })
    @Operation(summary = "uploads an image", description = "", security = {
        @SecurityRequirement(name = "petstore_auth", scopes = {
            "write:pets",
"read:pets"        })    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))) })
    Response uploadFile( @PathParam("petId")

 @Parameter(description = "ID of pet to update") Long petId
,@Valid Object body);}
