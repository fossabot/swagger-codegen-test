package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.PartMaster;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-17T18:07:48.325Z[Etc/UTC]")public interface MasterApiService {
      Response masterOperation(SecurityContext securityContext)
      throws NotFoundException;
}
