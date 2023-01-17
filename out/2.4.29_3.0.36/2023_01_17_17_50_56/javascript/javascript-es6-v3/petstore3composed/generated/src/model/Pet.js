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
import {ApiClient} from '../ApiClient';

/**
 * The Pet model module.
 * @module model/Pet
 * @version 1.0.0
 */
export class Pet {
  /**
   * Constructs a new <code>Pet</code>.
   * @alias module:model/Pet
   * @class
   * @param name {String} 
   */
  constructor(name) {
    this.name = name;
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
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('status'))
        obj.status = ApiClient.convertToType(data['status'], 'String');
      if (data.hasOwnProperty('part'))
        obj.part = ApiClient.convertToType(data['part'], [OneOfPetPartItems]);
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
Pet.prototype.id = undefined;

/**
 * @member {String} name
 */
Pet.prototype.name = undefined;

/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
Pet.StatusEnum = {
  /**
   * value: "available"
   * @const
   */
  available: "available",

  /**
   * value: "pending"
   * @const
   */
  pending: "pending",

  /**
   * value: "sold"
   * @const
   */
  sold: "sold"
};
/**
 * pet status in the store
 * @member {module:model/Pet.StatusEnum} status
 */
Pet.prototype.status = undefined;

/**
 * @member {Array.<Object>} part
 */
Pet.prototype.part = undefined;

