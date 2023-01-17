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
 * The OuterString model module.
 * @module model/OuterString
 * @version 1.0.0
 */
export class OuterString {
  /**
   * Constructs a new <code>OuterString</code>.
   * @alias module:model/OuterString
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OuterString</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OuterString} obj Optional instance to populate.
   * @return {module:model/OuterString} The populated <code>OuterString</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OuterString();
    }
    return obj;
  }
}

