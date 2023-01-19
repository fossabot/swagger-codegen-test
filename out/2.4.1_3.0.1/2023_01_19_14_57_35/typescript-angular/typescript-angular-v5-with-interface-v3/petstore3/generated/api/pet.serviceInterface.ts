/**
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { HttpHeaders }                                       from '@angular/common/http';

import { Observable }                                        from 'rxjs/Observable';


import { ApiResponse } from '../model/apiResponse';
import { Category } from '../model/category';
import { Pet } from '../model/pet';
import { Tag } from '../model/tag';


import { Configuration }                                     from '../configuration';


export interface PetServiceInterface {
    defaultHeaders: HttpHeaders;
    configuration: Configuration;
    

    /**
    * Add a new pet to the store
    * Add a new pet to the store
    * @param id 
    * @param name 
    * @param category 
    * @param photoUrls 
    * @param tags 
    * @param status 
    */
    addPet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, extraHttpRequestParams?: any): Observable<Pet>;

    /**
    * Deletes a pet
    * 
    * @param petId Pet id to delete
    * @param apiKey 
    */
    deletePet(petId: number, apiKey?: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Finds Pets by status
    * Multiple status values can be provided with comma separated strings
    * @param status Status values that need to be considered for filter
    */
    findPetsByStatus(status?: string, extraHttpRequestParams?: any): Observable<Array<Pet>>;

    /**
    * Finds Pets by tags
    * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
    * @param tags Tags to filter by
    */
    findPetsByTags(tags?: Array<string>, extraHttpRequestParams?: any): Observable<Array<Pet>>;

    /**
    * Find pet by ID
    * Returns a single pet
    * @param petId ID of pet to return
    */
    getPetById(petId: number, extraHttpRequestParams?: any): Observable<Pet>;

    /**
    * Update an existing pet
    * Update an existing pet by Id
    * @param id 
    * @param name 
    * @param category 
    * @param photoUrls 
    * @param tags 
    * @param status 
    */
    updatePet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, extraHttpRequestParams?: any): Observable<Pet>;

    /**
    * Updates a pet in the store with form data
    * 
    * @param petId ID of pet that needs to be updated
    * @param name Name of pet that needs to be updated
    * @param status Status of pet that needs to be updated
    */
    updatePetWithForm(petId: number, name?: string, status?: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * uploads an image
    * 
    * @param petId ID of pet to update
    * @param body 
    * @param additionalMetadata Additional Metadata
    */
    uploadFile(petId: number, body?: Object, additionalMetadata?: string, extraHttpRequestParams?: any): Observable<ApiResponse>;

}
