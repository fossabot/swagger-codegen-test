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
* The AnimalAnimalIdBody model module.
* @module model/AnimalAnimalIdBody
* @version 1.0.0
*/
export default class AnimalAnimalIdBody {
    /**
    * Constructs a new <code>AnimalAnimalIdBody</code>.
    * @alias module:model/AnimalAnimalIdBody
    * @class
    */

    constructor() {
        
        
        
    }

    /**
    * Constructs a <code>AnimalAnimalIdBody</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/AnimalAnimalIdBody} obj Optional instance to populate.
    * @return {module:model/AnimalAnimalIdBody} The populated <code>AnimalAnimalIdBody</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AnimalAnimalIdBody();
                        
            
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }

    /**
    * Updated name of the animal
    * @member {String} name
    */
    'name' = undefined;
    /**
    * Updated status of the animal
    * @member {String} status
    */
    'status' = undefined;




}
