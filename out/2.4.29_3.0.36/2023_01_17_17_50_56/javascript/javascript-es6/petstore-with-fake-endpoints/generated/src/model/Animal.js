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
 * The Animal model module.
 * @module model/Animal
 * @version 1.0.0
 */
export class Animal {
  /**
   * Constructs a new <code>Animal</code>.
   * @alias module:model/Animal
   * @class
   * @param className {String} 
   */
  constructor(className) {
    this.className = className;
  }

  /**
   * Constructs a <code>Animal</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Animal} obj Optional instance to populate.
   * @return {module:model/Animal} The populated <code>Animal</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Animal();
      if (data.hasOwnProperty('className'))
        obj.className = ApiClient.convertToType(data['className'], 'String');
      if (data.hasOwnProperty('color'))
        obj.color = ApiClient.convertToType(data['color'], 'String');
    }
    return obj;
  }
}

/**
 * @member {String} className
 */
Animal.prototype.className = undefined;

/**
 * @member {String} color
 * @default 'red'
 */
Animal.prototype.color = 'red';


