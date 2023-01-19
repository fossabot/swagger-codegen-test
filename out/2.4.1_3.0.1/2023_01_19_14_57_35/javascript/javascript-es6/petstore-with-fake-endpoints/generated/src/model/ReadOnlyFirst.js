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
* The ReadOnlyFirst model module.
* @module model/ReadOnlyFirst
* @version 1.0.0
*/
export default class ReadOnlyFirst {
    /**
    * Constructs a new <code>ReadOnlyFirst</code>.
    * @alias module:model/ReadOnlyFirst
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>ReadOnlyFirst</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ReadOnlyFirst} obj Optional instance to populate.
    * @return {module:model/ReadOnlyFirst} The populated <code>ReadOnlyFirst</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReadOnlyFirst();

            
            
            

            if (data.hasOwnProperty('bar')) {
                obj['bar'] = ApiClient.convertToType(data['bar'], 'String');
            }
            if (data.hasOwnProperty('baz')) {
                obj['baz'] = ApiClient.convertToType(data['baz'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {String} bar
    */
    bar = undefined;
    /**
    * @member {String} baz
    */
    baz = undefined;








}


