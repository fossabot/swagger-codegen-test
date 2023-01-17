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
 * The OneOfPartMasterDestination model module.
 * @module model/OneOfPartMasterDestination
 * @version 1.0.0
 */
export class OneOfPartMasterDestination {
  /**
   * Constructs a new <code>OneOfPartMasterDestination</code>.
   * @alias module:model/OneOfPartMasterDestination
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OneOfPartMasterDestination</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OneOfPartMasterDestination} obj Optional instance to populate.
   * @return {module:model/OneOfPartMasterDestination} The populated <code>OneOfPartMasterDestination</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OneOfPartMasterDestination();
    }
    return obj;
  }
}
