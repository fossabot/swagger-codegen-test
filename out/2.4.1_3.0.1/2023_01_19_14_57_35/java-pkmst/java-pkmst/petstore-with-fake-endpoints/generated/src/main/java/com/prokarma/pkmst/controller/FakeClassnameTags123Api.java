/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Client;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2023-01-19T15:02:23.912Z")

@Api(value = "FakeClassnameTags123", description = "the FakeClassnameTags123 API")
public interface FakeClassnameTags123Api {

    @ApiOperation(value = "To test class name in snake case", notes = "To test class name in snake case", response = Client.class, authorizations = {
        @Authorization(value = "api_key_query")
    }, tags={ "fake_classname_tags 123#$%^", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Client.class) })
    @RequestMapping(value = "/fake_classname_test",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Client> testClassname(@ApiParam(value = "client model" ,required=true )   @RequestBody Client body, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
