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
 * The OneOfSinglePetResponsePet model module.
 * @module model/OneOfSinglePetResponsePet
 * @version 1.0.0
 */
export class OneOfSinglePetResponsePet {
  /**
   * Constructs a new <code>OneOfSinglePetResponsePet</code>.
   * @alias module:model/OneOfSinglePetResponsePet
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>OneOfSinglePetResponsePet</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/OneOfSinglePetResponsePet} obj Optional instance to populate.
   * @return {module:model/OneOfSinglePetResponsePet} The populated <code>OneOfSinglePetResponsePet</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new OneOfSinglePetResponsePet();
    }
    return obj;
  }
}
