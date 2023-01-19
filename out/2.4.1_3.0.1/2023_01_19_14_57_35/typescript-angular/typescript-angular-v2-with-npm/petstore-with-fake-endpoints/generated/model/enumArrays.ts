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


export interface EnumArrays { 
    justSymbol?: EnumArrays.JustSymbolEnum;
    arrayEnum?: Array<EnumArrays.ArrayEnumEnum>;
}
export namespace EnumArrays {
    export type JustSymbolEnum = '>=' | '$';
    export const JustSymbolEnum = {
        GreaterThanOrEqualTo: '>=' as JustSymbolEnum,
        Dollar: '$' as JustSymbolEnum
    };
    export type ArrayEnumEnum = 'fish' | 'crab';
    export const ArrayEnumEnum = {
        Fish: 'fish' as ArrayEnumEnum,
        Crab: 'crab' as ArrayEnumEnum
    };
}
