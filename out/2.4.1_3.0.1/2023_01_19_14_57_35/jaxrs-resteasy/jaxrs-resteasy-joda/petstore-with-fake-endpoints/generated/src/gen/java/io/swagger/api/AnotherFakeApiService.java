package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Client;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2023-01-19T15:11:46.930Z")
public interface AnotherFakeApiService {
      Response testSpecialTags(Client body,SecurityContext securityContext)
      throws NotFoundException;
}
