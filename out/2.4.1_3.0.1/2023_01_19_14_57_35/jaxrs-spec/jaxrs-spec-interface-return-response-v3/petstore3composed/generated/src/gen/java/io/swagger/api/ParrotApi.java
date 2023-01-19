package io.swagger.api;

import io.swagger.model.Body1;
import io.swagger.model.InlineResponse200;

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

@Path("/parrot")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2023-01-19T15:16:58.904Z[Etc/UTC]")
public interface ParrotApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "Add a new parrow to the store", description = "", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Object.class))) })
    Response addParrot(@Valid Object body);
    @GET
    @Produces({ "application/json" })
    @Operation(summary = "get Parrots", description = "", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Object.class)))) })
    Response getParrots();
    @PUT
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @Operation(summary = "update parrots", description = "", tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input"),
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = InlineResponse200.class))) })
    Response updateParrots(@Valid Body1 body);}
