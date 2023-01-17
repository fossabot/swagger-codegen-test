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
import Category from './Category';

/**
* The Pup model module.
* @module model/Pup
* @version 1.0.0
*/
export default class Pup {
    /**
    * Constructs a new <code>Pup</code>.
    * @alias module:model/Pup
    * @class
    */

    constructor() {
        
        OneOfPup.call(this);
        
    }

    /**
    * Constructs a <code>Pup</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Pup} obj Optional instance to populate.
    * @return {module:model/Pup} The populated <code>Pup</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Pup();
                        
            
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('category2')) {
                obj['category2'] = Category.constructFromObject(data['category2']);
            }
            if (data.hasOwnProperty('pets')) {
                obj['pets'] = ApiClient.convertToType(data['pets'], [AllOfPupPetsItems]);
            }
        }
        return obj;
    }

    /**
    * @member {Number} id
    */
    'id' = undefined;
    /**
    * @member {module:model/Category} category2
    */
    'category2' = undefined;
    /**
    * @member {Array.<Object>} pets
    */
    'pets' = undefined;

    // Implement OneOfPup interface:
    


}
