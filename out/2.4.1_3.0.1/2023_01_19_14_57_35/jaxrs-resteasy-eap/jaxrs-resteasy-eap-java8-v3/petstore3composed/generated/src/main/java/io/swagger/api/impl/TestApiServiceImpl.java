package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;


import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyEapServerCodegen", date = "2023-01-19T15:17:02.948Z[Etc/UTC]")public class TestApiServiceImpl implements TestApi {
      public Response testMethod(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
