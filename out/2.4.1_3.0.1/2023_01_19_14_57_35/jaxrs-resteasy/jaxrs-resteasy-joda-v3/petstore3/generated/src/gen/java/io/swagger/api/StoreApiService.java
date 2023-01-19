package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.joda.time.DateTime;
import java.util.Map;
import io.swagger.model.Order;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaResteasyServerCodegen", date = "2023-01-19T15:15:46.379Z[Etc/UTC]")public abstract class StoreApiService {
    public abstract Response deleteOrder(Long orderId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getInventory(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrderById(Long orderId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response placeOrder(Long id,Long petId,Integer quantity,DateTime shipDate,String status,Boolean complete,SecurityContext securityContext) throws NotFoundException;
}
