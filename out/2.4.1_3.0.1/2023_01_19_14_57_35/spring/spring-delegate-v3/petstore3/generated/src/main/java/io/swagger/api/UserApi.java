/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
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

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Create user", nickname = "createUser", notes = "This can only be done by the logged in user.", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class) })
    @RequestMapping(value = "/user",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<User> createUser(@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="username", required=false)  String username,@ApiParam(value = "") @RequestParam(value="firstName", required=false)  String firstName,@ApiParam(value = "") @RequestParam(value="lastName", required=false)  String lastName,@ApiParam(value = "") @RequestParam(value="email", required=false)  String email,@ApiParam(value = "") @RequestParam(value="password", required=false)  String password,@ApiParam(value = "") @RequestParam(value="phone", required=false)  String phone,@ApiParam(value = "") @RequestParam(value="userStatus", required=false)  Integer userStatus);


    @ApiOperation(value = "Creates list of users with given input array", nickname = "createUsersWithListInput", notes = "Creates list of users with given input array", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful operation", response = User.class),
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/createWithList",
        produces = { "application/xml", "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<User> createUsersWithListInput(@ApiParam(value = ""  )  @Valid @RequestBody List<User> body);


    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@ApiParam(value = "The name that needs to be deleted",required=true) @PathVariable("username") String username);


    @ApiOperation(value = "Get user by user name", nickname = "getUserByName", notes = "", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    @RequestMapping(value = "/user/{username}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserByName(@ApiParam(value = "The name that needs to be fetched. Use user1 for testing. ",required=true) @PathVariable("username") String username);


    @ApiOperation(value = "Logs user into the system", nickname = "loginUser", notes = "", response = String.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class),
        @ApiResponse(code = 400, message = "Invalid username/password supplied") })
    @RequestMapping(value = "/user/login",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<String> loginUser(@ApiParam(value = "The user name for login") @Valid @RequestParam(value = "username", required = false) String username,@ApiParam(value = "The password for login in clear text") @Valid @RequestParam(value = "password", required = false) String password);


    @ApiOperation(value = "Logs out current logged in user session", nickname = "logoutUser", notes = "", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/logout",
        method = RequestMethod.GET)
    ResponseEntity<Void> logoutUser();


    @ApiOperation(value = "Update user", nickname = "updateUser", notes = "This can only be done by the logged in user.", tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    @RequestMapping(value = "/user/{username}",
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateUser(@ApiParam(value = "name that need to be deleted",required=true) @PathVariable("username") String username2,@ApiParam(value = "") @RequestParam(value="id", required=false)  Long id,@ApiParam(value = "") @RequestParam(value="username", required=false)  String username,@ApiParam(value = "") @RequestParam(value="firstName", required=false)  String firstName,@ApiParam(value = "") @RequestParam(value="lastName", required=false)  String lastName,@ApiParam(value = "") @RequestParam(value="email", required=false)  String email,@ApiParam(value = "") @RequestParam(value="password", required=false)  String password,@ApiParam(value = "") @RequestParam(value="phone", required=false)  String phone,@ApiParam(value = "") @RequestParam(value="userStatus", required=false)  Integer userStatus);

}
