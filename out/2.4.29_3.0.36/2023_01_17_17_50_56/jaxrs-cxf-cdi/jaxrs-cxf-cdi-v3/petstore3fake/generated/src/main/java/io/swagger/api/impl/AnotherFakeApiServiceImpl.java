package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.model.Client;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-17T18:05:39.236Z[Etc/UTC]")public class AnotherFakeApiServiceImpl implements AnotherFakeApiService {
      @Override
      public Response testSpecialTags(Client body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
