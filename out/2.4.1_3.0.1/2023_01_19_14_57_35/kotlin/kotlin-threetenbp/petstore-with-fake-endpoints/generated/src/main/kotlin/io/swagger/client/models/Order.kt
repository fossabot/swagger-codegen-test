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
package io.swagger.client.models

import org.threeten.bp.LocalDateTime

import com.squareup.moshi.Json
/**
 * 
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */
data class Order (
    val id: kotlin.Long? = null,
    val petId: kotlin.Long? = null,
    val quantity: kotlin.Int? = null,
    val shipDate: org.threeten.bp.LocalDateTime? = null,
    /* Order Status */
    val status: Order.Status? = null,
    val complete: kotlin.Boolean? = null
) {

    /**
    * Order Status
    * Values: placed,approved,delivered
    */
    enum class Status(val value: kotlin.String){
    
        @Json(name = "placed") placed("placed"),
    
        @Json(name = "approved") approved("approved"),
    
        @Json(name = "delivered") delivered("delivered");
    
    }

}

