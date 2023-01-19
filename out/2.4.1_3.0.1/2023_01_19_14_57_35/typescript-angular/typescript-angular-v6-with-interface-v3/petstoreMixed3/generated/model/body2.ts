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
 */import { BigDecimal } from './bigDecimal';


export interface Body2 { 
    /**
     * None
     */
    integer?: number;
    /**
     * None
     */
    int32?: number;
    /**
     * None
     */
    int64?: number;
    /**
     * None
     */
    number: BigDecimal;
    /**
     * None
     */
    _float?: number;
    /**
     * None
     */
    _double: number;
    /**
     * None
     */
    string?: string;
    /**
     * None
     */
    patternWithoutDelimiter: string;
    /**
     * None
     */
    _byte: string;
    /**
     * None
     */
    binary?: string;
    /**
     * None
     */
    date?: string;
    /**
     * None
     */
    dateTime?: Date;
    /**
     * None
     */
    password?: string;
    /**
     * None
     */
    callback?: string;
}