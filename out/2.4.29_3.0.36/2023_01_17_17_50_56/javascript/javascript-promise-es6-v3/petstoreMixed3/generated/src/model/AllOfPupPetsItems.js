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
import {Category} from './Category';
import {Pet} from './Pet';
import {Tag} from './Tag';

/**
 * The AllOfPupPetsItems model module.
 * @module model/AllOfPupPetsItems
 * @version 1.0.0
 */
export class AllOfPupPetsItems extends Pet {
  /**
   * Constructs a new <code>AllOfPupPetsItems</code>.
   * @alias module:model/AllOfPupPetsItems
   * @class
   * @extends module:model/Pet
   * @param name {} 
   * @param photoUrls {} 
   */
  constructor(name, photoUrls) {
    super(name, photoUrls);
  }

  /**
   * Constructs a <code>AllOfPupPetsItems</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AllOfPupPetsItems} obj Optional instance to populate.
   * @return {module:model/AllOfPupPetsItems} The populated <code>AllOfPupPetsItems</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new AllOfPupPetsItems();
      Pet.constructFromObject(data, obj);
    }
    return obj;
  }
}
