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
*/package io.swagger.server.models


/**
 *  * @param id  * @param username  * @param firstName  * @param lastName  * @param email  * @param password  * @param phone  * @param userStatus User Status*/
data class User (    val id: kotlin.Long? = null,    val username: kotlin.String? = null,    val firstName: kotlin.String? = null,    val lastName: kotlin.String? = null,    val email: kotlin.String? = null,    val password: kotlin.String? = null,    val phone: kotlin.String? = null,    /* User Status */    val userStatus: kotlin.Int? = null
) {
}
