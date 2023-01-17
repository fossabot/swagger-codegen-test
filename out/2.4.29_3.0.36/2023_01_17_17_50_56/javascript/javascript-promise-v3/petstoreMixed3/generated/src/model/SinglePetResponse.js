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

import ApiClient from '../ApiClient';

/**
* The SinglePetResponse model module.
* @module model/SinglePetResponse
* @version 1.0.0
*/
export default class SinglePetResponse {
    /**
    * Constructs a new <code>SinglePetResponse</code>.
    * @alias module:model/SinglePetResponse
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>SinglePetResponse</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/SinglePetResponse} obj Optional instance to populate.
    * @return {module:model/SinglePetResponse} The populated <code>SinglePetResponse</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SinglePetResponse();
                        
            
            if (data.hasOwnProperty('pet')) {
                obj['pet'] = ApiClient.convertToType(data['pet'], Object);
            }
        }
        return obj;
    }

    /**
    * @member {Object} pet
    */
    'pet' = undefined;




}
