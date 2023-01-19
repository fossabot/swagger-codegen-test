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


import { BigDecimal } from '../model/bigDecimal';
import { Body2 } from '../model/body2';
import { Body4 } from '../model/body4';
import { Body5 } from '../model/body5';
import { Client } from '../model/client';
import { OuterBoolean } from '../model/outerBoolean';
import { OuterComposite } from '../model/outerComposite';
import { OuterNumber } from '../model/outerNumber';
import { OuterString } from '../model/outerString';


import { Configuration }                                     from '../configuration';


export interface FakeServiceInterface {
    defaultHeaders: HttpHeaders;
    configuration: Configuration;
    

    /**
    * 
    * Test serialization of outer boolean types
    * @param body Input boolean as post body
    */
    fakeOuterBooleanSerialize(body?: boolean, extraHttpRequestParams?: any): Observable<OuterBoolean>;

    /**
    * 
    * Test serialization of object with outer number type
    * @param body Input composite as post body
    */
    fakeOuterCompositeSerialize(body?: OuterComposite, extraHttpRequestParams?: any): Observable<OuterComposite>;

    /**
    * 
    * Test serialization of outer number types
    * @param body Input number as post body
    */
    fakeOuterNumberSerialize(body?: BigDecimal, extraHttpRequestParams?: any): Observable<OuterNumber>;

    /**
    * 
    * Test serialization of outer string types
    * @param body Input string as post body
    */
    fakeOuterStringSerialize(body?: string, extraHttpRequestParams?: any): Observable<OuterString>;

    /**
    * To test \&quot;client\&quot; model
    * To test \&quot;client\&quot; model
    * @param body client model
    */
    testClientModel(body: Client, extraHttpRequestParams?: any): Observable<Client>;

    /**
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
    * @param body 
    */
    testEndpointParameters(body: Body2, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * To test enum parameters
    * To test enum parameters
    * @param enumHeaderStringArray Header parameter enum test (string array)
    * @param enumHeaderString Header parameter enum test (string)
    * @param enumQueryStringArray Query parameter enum test (string array)
    * @param enumQueryString Query parameter enum test (string)
    * @param enumQueryInteger Query parameter enum test (double)
    */
    testEnumParameters(enumHeaderStringArray?: Array<string>, enumHeaderString?: string, enumQueryStringArray?: Array<string>, enumQueryString?: string, enumQueryInteger?: number, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * To test enum parameters
    * To test enum parameters
    * @param body 
    */
    testEnumRequestBody(body?: Body4, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * test inline additionalProperties
    * 
    * @param body request body
    */
    testInlineAdditionalProperties(body: any, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * test json serialization of form data
    * 
    * @param body 
    */
    testJsonFormData(body: Body5, extraHttpRequestParams?: any): Observable<{}>;

}
