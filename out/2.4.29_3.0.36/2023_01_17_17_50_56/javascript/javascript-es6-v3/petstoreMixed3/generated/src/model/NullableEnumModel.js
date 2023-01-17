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
 * Swagger Codegen version: 3.0.36
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The NullableEnumModel model module.
 * @module model/NullableEnumModel
 * @version 1.0.0
 */
export class NullableEnumModel {
  /**
   * Constructs a new <code>NullableEnumModel</code>.
   * @alias module:model/NullableEnumModel
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>NullableEnumModel</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/NullableEnumModel} obj Optional instance to populate.
   * @return {module:model/NullableEnumModel} The populated <code>NullableEnumModel</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new NullableEnumModel();
      if (data.hasOwnProperty('enumProp'))
        obj.enumProp = ApiClient.convertToType(data['enumProp'], 'String');
    }
    return obj;
  }
}

/**
 * Allowed values for the <code>enumProp</code> property.
 * @enum {String}
 * @readonly
 */
NullableEnumModel.EnumPropEnum = {
  /**
   * value: "a"
   * @const
   */
  a: "a",

  /**
   * value: "b"
   * @const
   */
  b: "b",

  /**
   * value: "null"
   * @const
   */
  _null: "null"
};
/**
 * @member {module:model/NullableEnumModel.EnumPropEnum} enumProp
 */
NullableEnumModel.prototype.enumProp = undefined;

