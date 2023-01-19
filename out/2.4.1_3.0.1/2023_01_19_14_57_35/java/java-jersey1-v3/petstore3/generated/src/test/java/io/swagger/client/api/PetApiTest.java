/*
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Category;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.Pet;
import io.swagger.client.model.Tag;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PetApi
 */
@Ignore
public class PetApiTest {

    private final PetApi api = new PetApi();

    /**
     * Add a new pet to the store
     *
     * Add a new pet to the store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPetTest() throws ApiException {
        Long id = null;
        String name = null;
        Category category = null;
        List<String> photoUrls = null;
        List<Tag> tags = null;
        String status = null;
        Pet response = api.addPet(id, name, category, photoUrls, tags, status);

        // TODO: test validations
    }
    /**
     * Deletes a pet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() throws ApiException {
        Long petId = null;
        String apiKey = null;
        api.deletePet(petId, apiKey);

        // TODO: test validations
    }
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws ApiException {
        String status = null;
        List<Pet> response = api.findPetsByStatus(status);

        // TODO: test validations
    }
    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws ApiException {
        List<String> tags = null;
        List<Pet> response = api.findPetsByTags(tags);

        // TODO: test validations
    }
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws ApiException {
        Long petId = null;
        Pet response = api.getPetById(petId);

        // TODO: test validations
    }
    /**
     * Update an existing pet
     *
     * Update an existing pet by Id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() throws ApiException {
        Long id = null;
        String name = null;
        Category category = null;
        List<String> photoUrls = null;
        List<Tag> tags = null;
        String status = null;
        Pet response = api.updatePet(id, name, category, photoUrls, tags, status);

        // TODO: test validations
    }
    /**
     * Updates a pet in the store with form data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() throws ApiException {
        Long petId = null;
        String name = null;
        String status = null;
        api.updatePetWithForm(petId, name, status);

        // TODO: test validations
    }
    /**
     * uploads an image
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        Long petId = null;
        Object body = null;
        String additionalMetadata = null;
        ModelApiResponse response = api.uploadFile(petId, body, additionalMetadata);

        // TODO: test validations
    }
}
