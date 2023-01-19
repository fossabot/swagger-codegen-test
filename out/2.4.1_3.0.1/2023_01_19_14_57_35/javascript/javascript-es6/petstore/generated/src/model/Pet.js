/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */


import ApiClient from '../ApiClient';
import Category from './Category';
import Tag from './Tag';





/**
* The Pet model module.
* @module model/Pet
* @version 1.0.5
*/
export default class Pet {
    /**
    * Constructs a new <code>Pet</code>.
    * @alias module:model/Pet
    * @class
    * @param name {String} 
    * @param photoUrls {Array.<String>} 
    */

    constructor(name, photoUrls) {
        

        
        

        this['name'] = name;this['photoUrls'] = photoUrls;

        
    }

    /**
    * Constructs a <code>Pet</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Pet} obj Optional instance to populate.
    * @return {module:model/Pet} The populated <code>Pet</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Pet();

            
            
            

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = Category.constructFromObject(data['category']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('photoUrls')) {
                obj['photoUrls'] = ApiClient.convertToType(data['photoUrls'], ['String']);
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], [Tag]);
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
        }
        return obj;
    }

    /**
    * @member {Number} id
    */
    id = undefined;
    /**
    * @member {module:model/Category} category
    */
    category = undefined;
    /**
    * @member {String} name
    */
    name = undefined;
    /**
    * @member {Array.<String>} photoUrls
    */
    photoUrls = undefined;
    /**
    * @member {Array.<module:model/Tag>} tags
    */
    tags = undefined;
    /**
    * pet status in the store
    * @member {module:model/Pet.StatusEnum} status
    */
    status = undefined;






    /**
    * Allowed values for the <code>status</code> property.
    * @enum {String}
    * @readonly
    */
    static StatusEnum = {
    
        /**
         * value: "available"
         * @const
         */
        "available": "available",
    
        /**
         * value: "pending"
         * @const
         */
        "pending": "pending",
    
        /**
         * value: "sold"
         * @const
         */
        "sold": "sold"    
    };



}


