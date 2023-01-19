/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body1;
import io.swagger.model.InlineResponse200;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:18:04.294Z[Etc/UTC]")

@Api(value = "parrot", description = "the parrot API")
public interface ParrotApi {

    @ApiOperation(value = "Add a new parrow to the store", nickname = "addParrot", notes = "", response = Object.class, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input"),
        @ApiResponse(code = 200, message = "successful operation", response = Object.class) })
    @RequestMapping(value = "/parrot",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Object> addParrot(@ApiParam(value = ""  )  @Valid @RequestBody Object body);


    @ApiOperation(value = "get Parrots", nickname = "getParrots", notes = "", response = Object.class, responseContainer = "List", tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Object.class, responseContainer = "List") })
    @RequestMapping(value = "/parrot",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Object>> getParrots();


    @ApiOperation(value = "update parrots", nickname = "updateParrots", notes = "", response = InlineResponse200.class, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 405, message = "Invalid input"),
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class) })
    @RequestMapping(value = "/parrot",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<InlineResponse200> updateParrots(@ApiParam(value = ""  )  @Valid @RequestBody Body1 body);

}
