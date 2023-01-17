/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.36
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from "../ApiClient";
import {ApiResponse} from '../model/ApiResponse';
import {InlineResponse200} from '../model/InlineResponse200';
import {InlineResponse2001} from '../model/InlineResponse2001';
import {ParrotBody} from '../model/ParrotBody';
import {ParrotBody1} from '../model/ParrotBody1';
import {Pet} from '../model/Pet';
import {SubCategory} from '../model/SubCategory';

/**
* Pet service.
* @module api/PetApi
* @version 1.0.0
*/
export class PetApi {

    /**
    * Constructs a new PetApi. 
    * @alias module:api/PetApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }

    /**
     * Callback function to receive the result of the addParrot operation.
     * @callback moduleapi/PetApi~addParrotCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse2001{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a new parrow to the store
     * @param {Object} opts Optional parameters
     * @param {module:model/ParrotBody1} opts.body 
     * @param {module:api/PetApi~addParrotCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    addParrot(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse2001;

      return this.apiClient.callApi(
        '/parrot', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the addPet operation.
     * @callback moduleapi/PetApi~addPetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Add a new pet to the store
     * @param {module:model/Pet} body Pet object that needs to be added to the store
     * @param {module:api/PetApi~addPetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    addPet(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling addPet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['petstore_auth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/pet', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the deletePet operation.
     * @callback moduleapi/PetApi~deletePetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Deletes a pet
     * @param {Number} petId Pet id to delete
     * @param {Object} opts Optional parameters
     * @param {String} opts.apiKey 
     * @param {module:api/PetApi~deletePetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    deletePet(petId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling deletePet");
      }

      let pathParams = {
        'petId': petId
      };
      let queryParams = {
        
      };
      let headerParams = {
        'api_key': opts['apiKey']
      };
      let formParams = {
        
      };

      let authNames = ['petstore_auth'];
      let contentTypes = [];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/pet/{petId}', 'DELETE',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the doCategoryStuff operation.
     * @callback moduleapi/PetApi~doCategoryStuffCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ApiResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {module:model/SubCategory} opts.body 
     * @param {module:api/PetApi~doCategoryStuffCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    doCategoryStuff(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = ApiResponse;

      return this.apiClient.callApi(
        '/pet/category', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the feedPet operation.
     * @callback moduleapi/PetApi~feedPetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Find pet by ID
     * schedule pet feeding
     * @param {module:model/Pet} body Pet object that needs to be added to the store
     * @param {Number} petId ID of pet to return
     * @param {String} petType type of food
     * @param {String} status status
     * @param {String} sessionId session id
     * @param {String} token status
     * @param {module:api/PetApi~feedPetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    feedPet(body, petId, petType, status, sessionId, token, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling feedPet");
      }
      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling feedPet");
      }
      // verify the required parameter 'petType' is set
      if (petType === undefined || petType === null) {
        throw new Error("Missing the required parameter 'petType' when calling feedPet");
      }
      // verify the required parameter 'status' is set
      if (status === undefined || status === null) {
        throw new Error("Missing the required parameter 'status' when calling feedPet");
      }
      // verify the required parameter 'sessionId' is set
      if (sessionId === undefined || sessionId === null) {
        throw new Error("Missing the required parameter 'sessionId' when calling feedPet");
      }
      // verify the required parameter 'token' is set
      if (token === undefined || token === null) {
        throw new Error("Missing the required parameter 'token' when calling feedPet");
      }

      let pathParams = {
        'petId': petId
      };
      let queryParams = {
        'petType': petType,'status': status
      };
      let headerParams = {
        'token': token
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/pet/feed/{petId}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the findPetsByStatus operation.
     * @callback moduleapi/PetApi~findPetsByStatusCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Pet>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param {Array.<module:model/String>} status Status values that need to be considered for filter
     * @param {module:api/PetApi~findPetsByStatusCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    findPetsByStatus(status, callback) {
      
      let postBody = null;
      // verify the required parameter 'status' is set
      if (status === undefined || status === null) {
        throw new Error("Missing the required parameter 'status' when calling findPetsByStatus");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'status': this.apiClient.buildCollectionParam(status, 'multi')
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['petstore_auth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [Pet];

      return this.apiClient.callApi(
        '/pet/findByStatus', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the findPetsByTags operation.
     * @callback moduleapi/PetApi~findPetsByTagsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Pet>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Finds Pets by tags
     * Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing.
     * @param {Array.<String>} tags Tags to filter by
     * @param {module:api/PetApi~findPetsByTagsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    findPetsByTags(tags, callback) {
      
      let postBody = null;
      // verify the required parameter 'tags' is set
      if (tags === undefined || tags === null) {
        throw new Error("Missing the required parameter 'tags' when calling findPetsByTags");
      }

      let pathParams = {
        
      };
      let queryParams = {
        'tags': this.apiClient.buildCollectionParam(tags, 'multi')
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['petstore_auth'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = [Pet];

      return this.apiClient.callApi(
        '/pet/findByTags', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getParrots operation.
     * @callback moduleapi/PetApi~getParrotsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<Object>{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * get Parrots
     * @param {module:api/PetApi~getParrotsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    getParrots(callback) {
      
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Object];

      return this.apiClient.callApi(
        '/parrot', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the getPetById operation.
     * @callback moduleapi/PetApi~getPetByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Pet{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Find pet by ID
     * Returns a single pet
     * @param {Number} petId ID of pet to return
     * @param {module:api/PetApi~getPetByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    getPetById(petId, callback) {
      
      let postBody = null;
      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling getPetById");
      }

      let pathParams = {
        'petId': petId
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['api_key'];
      let contentTypes = [];
      let accepts = ['application/json', 'application/xml'];
      let returnType = Pet;

      return this.apiClient.callApi(
        '/pet/{petId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the updateParrots operation.
     * @callback moduleapi/PetApi~updateParrotsCallback
     * @param {String} error Error message, if any.
     * @param {module:model/InlineResponse200{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * update parrots
     * @param {Object} opts Optional parameters
     * @param {module:model/ParrotBody} opts.body 
     * @param {module:api/PetApi~updateParrotsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    updateParrots(opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = [];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/parrot', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the updatePet operation.
     * @callback moduleapi/PetApi~updatePetCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Update an existing pet
     * @param {module:model/Pet} body Pet object that needs to be added to the store
     * @param {module:api/PetApi~updatePetCallback} callback The callback function, accepting three arguments: error, data, response
     */
    updatePet(body, callback) {
      
      let postBody = body;
      // verify the required parameter 'body' is set
      if (body === undefined || body === null) {
        throw new Error("Missing the required parameter 'body' when calling updatePet");
      }

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['petstore_auth'];
      let contentTypes = ['application/json', 'application/xml'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/pet', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the updatePetWithForm operation.
     * @callback moduleapi/PetApi~updatePetWithFormCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Updates a pet in the store with form data
     * @param {Number} petId ID of pet that needs to be updated
     * @param {Object} opts Optional parameters
     * @param {String} opts.name 
     * @param {String} opts.status 
     * @param {module:api/PetApi~updatePetWithFormCallback} callback The callback function, accepting three arguments: error, data, response
     */
    updatePetWithForm(petId, opts, callback) {
      opts = opts || {};
      let postBody = null;
      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling updatePetWithForm");
      }

      let pathParams = {
        'petId': petId
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        'name': opts['name'],'status': opts['status']
      };

      let authNames = ['petstore_auth'];
      let contentTypes = ['application/x-www-form-urlencoded'];
      let accepts = [];
      let returnType = null;

      return this.apiClient.callApi(
        '/pet/{petId}', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
    /**
     * Callback function to receive the result of the uploadFile operation.
     * @callback moduleapi/PetApi~uploadFileCallback
     * @param {String} error Error message, if any.
     * @param {module:model/ApiResponse{ data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * uploads an image
     * @param {Number} petId ID of pet to update
     * @param {Object} opts Optional parameters
     * @param {Object} opts.body 
     * @param {module:api/PetApi~uploadFileCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link <&vendorExtensions.x-jsdoc-type>}
     */
    uploadFile(petId, opts, callback) {
      opts = opts || {};
      let postBody = opts['body'];
      // verify the required parameter 'petId' is set
      if (petId === undefined || petId === null) {
        throw new Error("Missing the required parameter 'petId' when calling uploadFile");
      }

      let pathParams = {
        'petId': petId
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['petstore_auth'];
      let contentTypes = ['application/octet-stream'];
      let accepts = ['application/json'];
      let returnType = ApiResponse;

      return this.apiClient.callApi(
        '/pet/{petId}/uploadImage', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

}