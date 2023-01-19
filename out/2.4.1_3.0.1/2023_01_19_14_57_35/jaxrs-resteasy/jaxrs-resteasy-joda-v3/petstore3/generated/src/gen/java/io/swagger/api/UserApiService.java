package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.User;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:15:46.379Z[Etc/UTC]")public abstract class UserApiService {
    public abstract Response createUser(Long id,String username,String firstName,String lastName,String email,String password,String phone,Integer userStatus,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createUsersWithListInput(List<User> body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteUser(String username,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserByName(String username,SecurityContext securityContext) throws NotFoundException;
    public abstract Response loginUser( String username, String password,SecurityContext securityContext) throws NotFoundException;
    public abstract Response logoutUser(SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateUser(String username2,Long id,String username,String firstName,String lastName,String email,String password,String phone,Integer userStatus,SecurityContext securityContext) throws NotFoundException;
}
