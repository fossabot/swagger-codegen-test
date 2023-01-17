/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
* The ValMemberChoice2 model module.
* @module model/ValMemberChoice2
* @version 1.0.0
*/
export default class ValMemberChoice2 {
    /**
    * Constructs a new <code>ValMemberChoice2</code>.
    * Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
    * @alias module:model/ValMemberChoice2
    * @class
    */

    constructor() {
        
        OneOfvalMembersValMemberItems.call(this);
        
    }

    /**
    * Constructs a <code>ValMemberChoice2</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/ValMemberChoice2} obj Optional instance to populate.
    * @return {module:model/ValMemberChoice2} The populated <code>ValMemberChoice2</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ValMemberChoice2();
                        
            
            if (data.hasOwnProperty('val_leaving_date')) {
                obj['val_leaving_date'] = ApiClient.convertToType(data['val_leaving_date'], 'Date');
            }
        }
        return obj;
    }

    /**
    * Business Term: Leaving Date Definition: The date the member left/is due to leave the scheme. Purpose: To identify those members that have left or are due to leave the scheme. To be able to calculate the benefit insured/premium payable in respect of the member/category.
    * @member {Date} val_leaving_date
    */
    'val_leaving_date' = undefined;

    // Implement OneOfvalMembersValMemberItems interface:
    


}
