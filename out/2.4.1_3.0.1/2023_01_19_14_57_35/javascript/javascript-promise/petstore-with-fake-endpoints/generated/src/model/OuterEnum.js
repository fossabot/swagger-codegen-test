/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.1
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SwaggerPetstore) {
      root.SwaggerPetstore = {};
    }
    root.SwaggerPetstore.OuterEnum = factory(root.SwaggerPetstore.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class OuterEnum.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "placed"
     * @const
     */
    "placed": "placed",
    /**
     * value: "approved"
     * @const
     */
    "approved": "approved",
    /**
     * value: "delivered"
     * @const
     */
    "delivered": "delivered"  };

  /**
   * Returns a <code>OuterEnum</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/OuterEnum} The enum <code>OuterEnum</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));


