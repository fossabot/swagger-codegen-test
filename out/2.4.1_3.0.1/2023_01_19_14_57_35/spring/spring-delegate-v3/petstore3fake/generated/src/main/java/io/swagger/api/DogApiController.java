package io.swagger.api;

import io.swagger.model.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-19T15:07:28.703Z[Etc/UTC]")

@Controller
public class DogApiController implements DogApi {

    private static final Logger log = LoggerFactory.getLogger(DogApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DogApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addDog(@ApiParam(value = "Dog object that needs to be added to the store" ,required=true )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteDog(@ApiParam(value = "Dog id to delete",required=true) @PathVariable("dogId") Long dogId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Dog> getDogById(@ApiParam(value = "ID of dog to return",required=true) @PathVariable("dogId") Long dogId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Dog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDog(@ApiParam(value = "Dog object that needs to be added." ,required=true )  @Valid @RequestBody Object body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateDogWithForm(@ApiParam(value = "ID of dog that needs to be updated",required=true) @PathVariable("dogId") Long dogId,@ApiParam(value = "") @RequestParam(value="name", required=false)  String name,@ApiParam(value = "") @RequestParam(value="status", required=false)  String status) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
