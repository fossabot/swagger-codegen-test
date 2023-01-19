/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.AllPetsResponse;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:18:14.381Z[Etc/UTC]")

@Api(value = "allPets", description = "the allPets API")
public interface AllPetsApi {

    @ApiOperation(value = "", nickname = "getAllPets", notes = "", response = AllPetsResponse.class, authorizations = {
        @Authorization(value = "http_basic_test")
    }, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a single random pet", response = AllPetsResponse.class) })
    @RequestMapping(value = "/allPets",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AllPetsResponse> getAllPets();

}
