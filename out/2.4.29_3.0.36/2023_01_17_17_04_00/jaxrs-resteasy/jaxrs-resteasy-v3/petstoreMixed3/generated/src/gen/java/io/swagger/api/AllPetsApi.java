package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AllPetsApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import io.swagger.model.AllPetsResponse;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
@Path("/allPets")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-17T17:07:07.380Z[Etc/UTC]")public class AllPetsApi  {

    @Inject AllPetsApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @Operation(summary = "", description = "", security = {
        @SecurityRequirement(name = "http_basic_test")
    }, tags={ "pet" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "a single random pet", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AllPetsResponse.class))) })
    public Response getAllPets(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAllPets(securityContext);
    }
}
