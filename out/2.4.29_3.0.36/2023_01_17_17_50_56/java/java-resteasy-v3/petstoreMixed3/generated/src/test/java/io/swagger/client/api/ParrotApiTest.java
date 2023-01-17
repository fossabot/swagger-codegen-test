/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.InlineResponse2001;
import io.swagger.client.model.ParrotBody;
import io.swagger.client.model.ParrotBody1;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ParrotApi
 */
@Ignore
public class ParrotApiTest {

    private final ParrotApi api = new ParrotApi();

    /**
     * Add a new parrow to the store
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addParrotTest() throws Exception {
        ParrotBody1 body = null;
        InlineResponse2001 response = api.addParrot(body);

        // TODO: test validations
    }
    /**
     * get Parrots
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getParrotsTest() throws Exception {
        List<Object> response = api.getParrots();

        // TODO: test validations
    }
    /**
     * update parrots
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateParrotsTest() throws Exception {
        ParrotBody body = null;
        InlineResponse200 response = api.updateParrots(body);

        // TODO: test validations
    }
}
