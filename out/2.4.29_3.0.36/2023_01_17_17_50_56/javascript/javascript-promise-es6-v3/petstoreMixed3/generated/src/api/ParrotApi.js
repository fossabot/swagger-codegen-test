/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
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
import {InlineResponse200} from '../model/InlineResponse200';
import {InlineResponse2001} from '../model/InlineResponse2001';
import {ParrotBody} from '../model/ParrotBody';
import {ParrotBody1} from '../model/ParrotBody1';

/**
* Parrot service.
* @module api/ParrotApi
* @version 1.0.0
*/
export class ParrotApi {

    /**
    * Constructs a new ParrotApi. 
    * @alias module:api/ParrotApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instanc
    e} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * Add a new parrow to the store
     * @param {Object} opts Optional parameters
     * @param {module:model/ParrotBody1} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse2001} and HTTP response
     */
    addParrotWithHttpInfo(opts) {
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

      let authNames = ['jwt'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse2001;

      return this.apiClient.callApi(
        '/parrot', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Add a new parrow to the store
     * @param {Object} opts Optional parameters
     * @param {module:model/ParrotBody1} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/InlineResponse2001}
     */
    addParrot(opts) {
      return this.addParrotWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * get Parrots
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<Object>} and HTTP response
     */
    getParrotsWithHttpInfo() {
      
      let postBody = null;

      let pathParams = {
        
      };
      let queryParams = {
        
      };
      let headerParams = {
        
      };
      let formParams = {
        
      };

      let authNames = ['jwt'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Object];

      return this.apiClient.callApi(
        '/parrot', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * get Parrots
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<Object>}
     */
    getParrots() {
      return this.getParrotsWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * update parrots
     * @param {Object} opts Optional parameters
     * @param {module:model/ParrotBody} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/InlineResponse200} and HTTP response
     */
    updateParrotsWithHttpInfo(opts) {
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

      let authNames = ['jwt'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = InlineResponse200;

      return this.apiClient.callApi(
        '/parrot', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * update parrots
     * @param {Object} opts Optional parameters
     * @param {module:model/ParrotBody} opts.body 
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/InlineResponse200}
     */
    updateParrots(opts) {
      return this.updateParrotsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}