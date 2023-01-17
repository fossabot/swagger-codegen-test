/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PartMaster;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-17T17:07:09.567Z[Etc/UTC]")
@Validated
@Api(value = "Master", description = "the Master API")
public interface MasterApi {

    @ApiOperation(value = "", nickname = "masterOperation", notes = "", response = PartMaster.class, responseContainer = "List", authorizations = {
        @Authorization(value = "http_bearer_test")    }, tags={ "master", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "peticion realizada con exito", response = PartMaster.class, responseContainer = "List") })
    @RequestMapping(value = "/master",
        produces = "application/json", 
        method = RequestMethod.GET)
    com.netflix.hystrix.HystrixCommand<ResponseEntity<List<PartMaster>>> masterOperation();

}

