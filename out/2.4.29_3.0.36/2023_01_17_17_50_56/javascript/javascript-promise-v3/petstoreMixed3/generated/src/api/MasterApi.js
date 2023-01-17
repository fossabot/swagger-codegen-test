/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

import ApiClient from "../ApiClient";
import PartMaster from '../model/PartMaster';

/**
* Master service.
* @module api/MasterApi
* @version 1.0.0
*/
export default class MasterApi {

    /**
    * Constructs a new MasterApi. 
    * @alias module:api/MasterApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }



    /**
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/PartMaster>} and HTTP response
     */
    masterOperationWithHttpInfo() {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['http_bearer_test'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [PartMaster];

      return this.apiClient.callApi(
        '/master', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PartMaster>}
     */
    masterOperation() {
      return this.masterOperationWithHttpInfo()
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }

}
