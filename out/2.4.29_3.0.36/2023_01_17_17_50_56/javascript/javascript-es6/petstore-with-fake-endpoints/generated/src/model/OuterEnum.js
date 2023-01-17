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
 * Enum class OuterEnum.
 * @enum {String}
 * @readonly
 */
const OuterEnum = {
  /**
   * value: "placed"
   * @const
   */
  placed: "placed",

  /**
   * value: "approved"
   * @const
   */
  approved: "approved",

  /**
   * value: "delivered"
   * @const
   */
  delivered: "delivered",

  /**
   * Returns a <code>OuterEnum</code> enum value from a JavaScript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/OuterEnum} The enum <code>OuterEnum</code> value.
   */
  constructFromObject: function(object) {
    return object;
  }
};

export {OuterEnum};
