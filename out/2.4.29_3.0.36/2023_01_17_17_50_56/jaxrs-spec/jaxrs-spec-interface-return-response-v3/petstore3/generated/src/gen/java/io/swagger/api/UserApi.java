package io.swagger.api;

import io.swagger.model.User;

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

@Path("/user")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-01-17T18:04:17.142Z[Etc/UTC]")
public interface UserApi {

    @POST
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))) })
    Response createUser(@Valid User body);
    @POST
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Produces({ "application/json", "application/xml" })
    @Operation(summary = "Create user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))) })
    Response createUser(@FormParam(value = "id")  Long id,@FormParam(value = "username")  String username,@FormParam(value = "firstName")  String firstName,@FormParam(value = "lastName")  String lastName,@FormParam(value = "email")  String email,@FormParam(value = "password")  String password,@FormParam(value = "phone")  String phone,@FormParam(value = "userStatus")  Integer userStatus);
    @POST
    @Path("/createWithList")
    @Consumes({ "application/json" })
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Creates list of users with given input array", description = "Creates list of users with given input array", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "200", description = "successful operation") })
    Response createUsersWithListInput(@Valid List<User> body);
    @DELETE
    @Path("/{username}")
    @Operation(summary = "Delete user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        @ApiResponse(responseCode = "404", description = "User not found") })
    Response deleteUser( @PathParam("username")

 @Parameter(description = "The name that needs to be deleted") String username
);
    @GET
    @Path("/{username}")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Get user by user name", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))),
        @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
        @ApiResponse(responseCode = "404", description = "User not found") })
    Response getUserByName( @PathParam("username")

 @Parameter(description = "The name that needs to be fetched. Use user1 for testing. ") String username
);
    @GET
    @Path("/login")
    @Produces({ "application/xml", "application/json" })
    @Operation(summary = "Logs user into the system", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = String.class))),
        @ApiResponse(responseCode = "400", description = "Invalid username/password supplied") })
    Response loginUser(  @QueryParam("username") 

 @Parameter(description = "The user name for login")  String username
,  @QueryParam("password") 

 @Parameter(description = "The password for login in clear text")  String password
);
    @GET
    @Path("/logout")
    @Operation(summary = "Logs out current logged in user session", description = "", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    Response logoutUser();
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    Response updateUser( @PathParam("username")

 @Parameter(description = "name that need to be deleted") String username
,@Valid User body);
    @PUT
    @Path("/{username}")
    @Consumes({ "application/json", "application/xml", "application/x-www-form-urlencoded" })
    @Operation(summary = "Update user", description = "This can only be done by the logged in user.", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation") })
    Response updateUser( @PathParam("username")

 @Parameter(description = "name that need to be deleted") String username
,@FormParam(value = "id")  Long id,@FormParam(value = "username")  String username2,@FormParam(value = "firstName")  String firstName,@FormParam(value = "lastName")  String lastName,@FormParam(value = "email")  String email,@FormParam(value = "password")  String password,@FormParam(value = "phone")  String phone,@FormParam(value = "userStatus")  Integer userStatus);}
