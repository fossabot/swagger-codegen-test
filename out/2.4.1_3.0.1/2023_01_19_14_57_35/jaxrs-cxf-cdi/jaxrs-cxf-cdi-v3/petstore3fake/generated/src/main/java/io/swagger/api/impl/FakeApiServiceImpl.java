package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import java.math.BigDecimal;
import io.swagger.model.Body2;
import io.swagger.model.Body4;
import io.swagger.model.Body5;
import io.swagger.model.Client;
import io.swagger.model.OuterComposite;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-19T15:07:35.213Z[Etc/UTC]")public class FakeApiServiceImpl implements FakeApiService {
      @Override
      public Response fakeOuterBooleanSerialize(Boolean body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response fakeOuterCompositeSerialize(OuterComposite body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response fakeOuterNumberSerialize(BigDecimal body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response fakeOuterStringSerialize(String body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response testClientModel(Client body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response testEndpointParameters(Body2 body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response testEnumParameters(List<String> enumHeaderStringArray, String enumHeaderString, List<String> enumQueryStringArray, String enumQueryString, Integer enumQueryInteger, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response testEnumRequestBody(Body4 body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response testInlineAdditionalProperties(Map<String, String> body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response testJsonFormData(Body5 body, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
