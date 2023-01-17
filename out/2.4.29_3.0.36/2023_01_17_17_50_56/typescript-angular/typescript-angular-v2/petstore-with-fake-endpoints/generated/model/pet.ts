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
 */
import { Category } from './category';
import { Tag } from './tag';


export interface Pet { 
    id?: number;
    category?: Category;
    name: string;
    photoUrls: Array<string>;
    tags?: Array<Tag>;
    /**
     * pet status in the store
     */
    status?: Pet.StatusEnum;
}
export namespace Pet {
    export type StatusEnum = 'available' | 'pending' | 'sold';
    export const StatusEnum = {
        Available: 'available' as StatusEnum,
        Pending: 'pending' as StatusEnum,
        Sold: 'sold' as StatusEnum
    };
}
