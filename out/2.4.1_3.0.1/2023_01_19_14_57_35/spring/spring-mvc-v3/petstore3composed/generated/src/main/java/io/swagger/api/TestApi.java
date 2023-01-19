/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:17:44.712Z[Etc/UTC]")

@Api(value = "test", description = "the test API")
public interface TestApi {

    @ApiOperation(value = "", nickname = "testMethod", notes = "", response = String.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearer")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "peticion realizada con exito", response = String.class, responseContainer = "List") })
    @RequestMapping(value = "/test",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<String>> testMethod();

}
