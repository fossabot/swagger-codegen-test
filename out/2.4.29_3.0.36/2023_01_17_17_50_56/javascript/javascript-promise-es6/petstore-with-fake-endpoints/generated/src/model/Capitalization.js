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
 * Swagger Codegen version: 2.4.29
 *
 * Do not edit the class manually.
 *
 */

import {ApiClient} from '../ApiClient';

/**
 * The Capitalization model module.
 * @module model/Capitalization
 * @version 1.0.0
 */
export class Capitalization {
  /**
   * Constructs a new <code>Capitalization</code>.
   * @alias module:model/Capitalization
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>Capitalization</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Capitalization} obj Optional instance to populate.
   * @return {module:model/Capitalization} The populated <code>Capitalization</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Capitalization();
      if (data.hasOwnProperty('smallCamel'))
        obj.smallCamel = ApiClient.convertToType(data['smallCamel'], 'String');
      if (data.hasOwnProperty('CapitalCamel'))
        obj.capitalCamel = ApiClient.convertToType(data['CapitalCamel'], 'String');
      if (data.hasOwnProperty('small_Snake'))
        obj.smallSnake = ApiClient.convertToType(data['small_Snake'], 'String');
      if (data.hasOwnProperty('Capital_Snake'))
        obj.capitalSnake = ApiClient.convertToType(data['Capital_Snake'], 'String');
      if (data.hasOwnProperty('SCA_ETH_Flow_Points'))
        obj.sCAETHFlowPoints = ApiClient.convertToType(data['SCA_ETH_Flow_Points'], 'String');
      if (data.hasOwnProperty('ATT_NAME'))
        obj.ATT_NAME = ApiClient.convertToType(data['ATT_NAME'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} smallCamel
 */
Capitalization.prototype.smallCamel = undefined;

/**
 * @member {String} capitalCamel
 */
Capitalization.prototype.capitalCamel = undefined;

/**
 * @member {String} smallSnake
 */
Capitalization.prototype.smallSnake = undefined;

/**
 * @member {String} capitalSnake
 */
Capitalization.prototype.capitalSnake = undefined;

/**
 * @member {String} sCAETHFlowPoints
 */
Capitalization.prototype.sCAETHFlowPoints = undefined;

/**
 * Name of the pet 
 * @member {String} ATT_NAME
 */
Capitalization.prototype.ATT_NAME = undefined;


