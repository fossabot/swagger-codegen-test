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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs/Observable';

import { ApiResponse } from '../model/apiResponse';
import { Category } from '../model/category';
import { Pet } from '../model/pet';
import { Tag } from '../model/tag';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class PetService {

    protected basePath = 'https://raw.githubusercontent.com/api/v3';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
            this.basePath = basePath || configuration.basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * Add a new pet to the store
     * Add a new pet to the store
     * @param id 
     * @param name 
     * @param category 
     * @param photoUrls 
     * @param tags 
     * @param status 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public addPet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe?: 'body', reportProgress?: boolean): Observable<Pet>;
    public addPet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Pet>>;
    public addPet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Pet>>;
    public addPet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/xml',
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json',
            'application/xml',
            'application/x-www-form-urlencoded'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): void; };
        let useForm = false;
        let convertFormParamsToString = false;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        }

        if (id !== undefined) {
            formParams = formParams.append('id', <any>id) || formParams;
        }
        if (name !== undefined) {
            formParams = formParams.append('name', <any>name) || formParams;
        }
        if (category !== undefined) {
            formParams = formParams.append('category', <any>category) || formParams;
        }
        if (photoUrls) {
            formParams = formParams.append('photoUrls', photoUrls.join(COLLECTION_FORMATS[''])) || formParams;
        }
        if (tags) {
            formParams = formParams.append('tags', tags.join(COLLECTION_FORMATS[''])) || formParams;
        }
        if (status !== undefined) {
            formParams = formParams.append('status', <any>status) || formParams;
        }

        return this.httpClient.post(`${this.basePath}/pet`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete
     * @param apiKey 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deletePet(petId: number, apiKey?: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deletePet(petId: number, apiKey?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deletePet(petId: number, apiKey?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deletePet(petId: number, apiKey?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling deletePet.');
        }

        let headers = this.defaultHeaders;
        if (apiKey !== undefined && apiKey !== null) {
            headers = headers.set('api_key', String(apiKey));
        }

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.delete(`${this.basePath}/pet/${encodeURIComponent(String(petId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public findPetsByStatus(status?: string, observe?: 'body', reportProgress?: boolean): Observable<Array<Pet>>;
    public findPetsByStatus(status?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<Pet>>>;
    public findPetsByStatus(status?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<Pet>>>;
    public findPetsByStatus(status?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (status !== undefined && status !== null) {
            queryParameters = queryParameters.set('status', <any>status);
        }

        let headers = this.defaultHeaders;

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/xml',
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get(`${this.basePath}/pet/findByStatus`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public findPetsByTags(tags?: Array<string>, observe?: 'body', reportProgress?: boolean): Observable<Array<Pet>>;
    public findPetsByTags(tags?: Array<string>, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<Pet>>>;
    public findPetsByTags(tags?: Array<string>, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<Pet>>>;
    public findPetsByTags(tags?: Array<string>, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (tags) {
            queryParameters = queryParameters.set('tags', tags.join(COLLECTION_FORMATS['csv']));
        }

        let headers = this.defaultHeaders;

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/xml',
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get(`${this.basePath}/pet/findByTags`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getPetById(petId: number, observe?: 'body', reportProgress?: boolean): Observable<Pet>;
    public getPetById(petId: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Pet>>;
    public getPetById(petId: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Pet>>;
    public getPetById(petId: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling getPetById.');
        }

        let headers = this.defaultHeaders;

        // authentication (api_key) required
        if (this.configuration.apiKeys["api_key"]) {
            headers = headers.set('api_key', this.configuration.apiKeys["api_key"]);
        }

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/xml',
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.get(`${this.basePath}/pet/${encodeURIComponent(String(petId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Update an existing pet
     * Update an existing pet by Id
     * @param id 
     * @param name 
     * @param category 
     * @param photoUrls 
     * @param tags 
     * @param status 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updatePet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe?: 'body', reportProgress?: boolean): Observable<Pet>;
    public updatePet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Pet>>;
    public updatePet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Pet>>;
    public updatePet(id?: number, name?: string, category?: Category, photoUrls?: Array<string>, tags?: Array<Tag>, status?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/xml',
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json',
            'application/xml',
            'application/x-www-form-urlencoded'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): void; };
        let useForm = false;
        let convertFormParamsToString = false;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        }

        if (id !== undefined) {
            formParams = formParams.append('id', <any>id) || formParams;
        }
        if (name !== undefined) {
            formParams = formParams.append('name', <any>name) || formParams;
        }
        if (category !== undefined) {
            formParams = formParams.append('category', <any>category) || formParams;
        }
        if (photoUrls) {
            formParams = formParams.append('photoUrls', photoUrls.join(COLLECTION_FORMATS[''])) || formParams;
        }
        if (tags) {
            formParams = formParams.append('tags', tags.join(COLLECTION_FORMATS[''])) || formParams;
        }
        if (status !== undefined) {
            formParams = formParams.append('status', <any>status) || formParams;
        }

        return this.httpClient.put(`${this.basePath}/pet`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated
     * @param name Name of pet that needs to be updated
     * @param status Status of pet that needs to be updated
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public updatePetWithForm(petId: number, name?: string, status?: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public updatePetWithForm(petId: number, name?: string, status?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public updatePetWithForm(petId: number, name?: string, status?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public updatePetWithForm(petId: number, name?: string, status?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling updatePetWithForm.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (name !== undefined && name !== null) {
            queryParameters = queryParameters.set('name', <any>name);
        }
        if (status !== undefined && status !== null) {
            queryParameters = queryParameters.set('status', <any>status);
        }

        let headers = this.defaultHeaders;

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];

        return this.httpClient.post(`${this.basePath}/pet/${encodeURIComponent(String(petId))}`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * uploads an image
     * 
     * @param petId ID of pet to update
     * @param body 
     * @param additionalMetadata Additional Metadata
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public uploadFile(petId: number, body?: Object, additionalMetadata?: string, observe?: 'body', reportProgress?: boolean): Observable<ApiResponse>;
    public uploadFile(petId: number, body?: Object, additionalMetadata?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<ApiResponse>>;
    public uploadFile(petId: number, body?: Object, additionalMetadata?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<ApiResponse>>;
    public uploadFile(petId: number, body?: Object, additionalMetadata?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling uploadFile.');
        }

        let queryParameters = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        if (additionalMetadata !== undefined && additionalMetadata !== null) {
            queryParameters = queryParameters.set('additionalMetadata', <any>additionalMetadata);
        }

        let headers = this.defaultHeaders;

        // authentication (petstore_auth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/octet-stream'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post(`${this.basePath}/pet/${encodeURIComponent(String(petId))}/uploadImage`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

