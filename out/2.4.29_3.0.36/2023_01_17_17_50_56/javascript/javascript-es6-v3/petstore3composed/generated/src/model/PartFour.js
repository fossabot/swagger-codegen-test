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
 * The PartFour model module.
 * @module model/PartFour
 * @version 1.0.0
 */
export class PartFour {
  /**
   * Constructs a new <code>PartFour</code>.
   * @alias module:model/PartFour
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PartFour</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PartFour} obj Optional instance to populate.
   * @return {module:model/PartFour} The populated <code>PartFour</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PartFour();
      if (data.hasOwnProperty('otherIdPart'))
        obj.otherIdPart = ApiClient.convertToType(data['otherIdPart'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} otherIdPart
 */
PartFour.prototype.otherIdPart = undefined;

// Implement OneOfPartMasterOrigin interface:
