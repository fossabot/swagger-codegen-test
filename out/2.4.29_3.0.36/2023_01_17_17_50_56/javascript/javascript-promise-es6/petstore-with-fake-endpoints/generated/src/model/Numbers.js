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
 * Enum class Numbers.
 * @enum {Number}
 * @readonly
 */
const Numbers = {
  /**
   * value: 7
   * @const
   */
  _7: 7,

  /**
   * value: 8
   * @const
   */
  _8: 8,

  /**
   * value: 9
   * @const
   */
  _9: 9,

  /**
   * value: 10
   * @const
   */
  _10: 10,

  /**
   * Returns a <code>Numbers</code> enum value from a JavaScript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/Numbers} The enum <code>Numbers</code> value.
   */
  constructFromObject: function(object) {
    return object;
  }
};

export {Numbers};
