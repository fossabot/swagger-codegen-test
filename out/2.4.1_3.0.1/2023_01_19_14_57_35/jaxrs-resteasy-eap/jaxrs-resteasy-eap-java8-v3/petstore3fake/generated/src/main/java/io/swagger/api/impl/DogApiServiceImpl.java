package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Dog;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-19T15:07:26.822Z[Etc/UTC]")public class DogApiServiceImpl implements DogApi {
      public Response addDog(Object body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response deleteDog(Long dogId,String apiKey,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getDogById(Long dogId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateDog(Object body,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateDogWithForm(Long dogId,String name,String status,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
