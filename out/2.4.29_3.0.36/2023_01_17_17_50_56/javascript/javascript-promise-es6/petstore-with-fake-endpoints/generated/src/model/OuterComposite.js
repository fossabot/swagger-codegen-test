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
import {OuterBoolean} from './OuterBoolean';
import {OuterNumber} from './OuterNumber';
import {OuterString} from './OuterString';

/**
 * The OuterComposite model module.
 * @module model/OuterComposite
 * @version 1.0.0
 */
export class OuterComposite {
  /**
   * Constructs a new <code>OuterComposite</code>.
   * @alias module:model/OuterComposite
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OuterComposite</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OuterComposite} obj Optional instance to populate.
   * @return {module:model/OuterComposite} The populated <code>OuterComposite</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OuterComposite();
      if (data.hasOwnProperty('my_number'))
        obj.myNumber = OuterNumber.constructFromObject(data['my_number']);
      if (data.hasOwnProperty('my_string'))
        obj.myString = OuterString.constructFromObject(data['my_string']);
      if (data.hasOwnProperty('my_boolean'))
        obj.myBoolean = OuterBoolean.constructFromObject(data['my_boolean']);
    }
    return obj;
  }
}

/**
 * @member {module:model/OuterNumber} myNumber
 */
OuterComposite.prototype.myNumber = undefined;

/**
 * @member {module:model/OuterString} myString
 */
OuterComposite.prototype.myString = undefined;

/**
 * @member {module:model/OuterBoolean} myBoolean
 */
OuterComposite.prototype.myBoolean = undefined;


