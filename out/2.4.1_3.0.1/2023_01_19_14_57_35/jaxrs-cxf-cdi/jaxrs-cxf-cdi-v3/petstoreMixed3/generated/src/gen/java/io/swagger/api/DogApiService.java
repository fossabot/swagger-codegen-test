package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.Dog;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSCXFCDIServerCodegen", date = "2023-01-19T15:18:01.081Z[Etc/UTC]")public interface DogApiService {
      public Response addDog(Object body, SecurityContext securityContext);
      public Response deleteDog(Long dogId, String apiKey, SecurityContext securityContext);
      public Response getDogById(Long dogId, SecurityContext securityContext);
      public Response updateDog(Object body, SecurityContext securityContext);
      public Response updateDogWithForm(Long dogId, String name, String status, SecurityContext securityContext);
}
