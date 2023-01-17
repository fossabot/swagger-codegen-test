package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.EncodingUtils;

import io.swagger.client.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-01-17T17:58:11.559Z[Etc/UTC]")public interface StoreApi extends ApiClient.Api {

  /**
   * Delete purchase order by ID
   * For valid response try integer IDs with positive integer value.\\ \\ Negative or non-integer values will generate API errors
   * @param orderId ID of the order that needs to be deleted (required)
   */
  @RequestLine("DELETE /store/order/{orderId}")
  @Headers({
      "Content-Type: application/json",
      "Accept: */*",
  })
  void deleteOrder(@Param("orderId") Long orderId);
  /**
   * Returns pet inventories by status
   * Returns a map of status codes to quantities
   * @return Map&lt;String, Integer&gt;
   */
  @RequestLine("GET /store/inventory")
  @Headers({
      "Accept: application/json",
  })
  Map<String, Integer> getInventory();
  /**
   * Find purchase order by ID
   * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10.\\ \\ Other values will generated exceptions
   * @param orderId ID of pet that needs to be fetched (required)
   * @return Order
   */
  @RequestLine("GET /store/order/{orderId}")
  @Headers({
      "Accept: application/json",
  })
  Order getOrderById(@Param("orderId") Long orderId);
  /**
   * Place an order for a pet
   * 
   * @param body order placed for purchasing the pet (required)
   * @return Order
   */
  @RequestLine("POST /store/order")
  @Headers({
      "Content-Type: application/json",
      "Accept: application/json",
  })
  Order placeOrder(Order body);
}
