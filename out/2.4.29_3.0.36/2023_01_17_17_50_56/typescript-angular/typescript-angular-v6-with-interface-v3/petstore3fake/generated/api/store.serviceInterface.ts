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
import { HttpHeaders }                                       from '@angular/common/http';

import { Observable }                                        from 'rxjs/Observable';


import { Order } from '../model/order';


import { Configuration }                                     from '../configuration';


export interface StoreServiceInterface {
    defaultHeaders: HttpHeaders;
    configuration: Configuration;
    

    /**
    * Delete purchase order by ID
    * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
    * @param orderId ID of the order that needs to be deleted
    */
    deleteOrder(orderId: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Returns pet inventories by status
    * Returns a map of status codes to quantities
    */
    getInventory(extraHttpRequestParams?: any): Observable<{ [key: string]: number; }>;

    /**
    * Find purchase order by ID
    * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
    * @param orderId ID of pet that needs to be fetched
    */
    getOrderById(orderId: number, extraHttpRequestParams?: any): Observable<Order>;

    /**
    * Place an order for a pet
    * 
    * @param body order placed for purchasing the pet
    */
    placeOrder(body: Order, extraHttpRequestParams?: any): Observable<Order>;

}
