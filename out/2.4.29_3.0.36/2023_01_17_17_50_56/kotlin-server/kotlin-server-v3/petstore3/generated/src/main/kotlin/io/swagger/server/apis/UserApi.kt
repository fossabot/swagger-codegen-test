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
*/package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.authenticate
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.delete
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.locations.put
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.route

import io.swagger.server.Paths
import io.swagger.server.infrastructure.ApiPrincipal


import io.swagger.server.models.User

@KtorExperimentalLocationsAPI
fun Route.UserApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    post<Paths.createUser> {  _: Paths.createUser ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
  "firstName" : "John",
  "lastName" : "James",
  "password" : "12345",
  "userStatus" : 1,
  "phone" : "12345",
  "id" : 10,
  "email" : "john@email.com",
  "username" : "theUser"
}"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }    }
    post<Paths.createUsersWithListInput> {  _: Paths.createUsersWithListInput ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
  "firstName" : "John",
  "lastName" : "James",
  "password" : "12345",
  "userStatus" : 1,
  "phone" : "12345",
  "id" : 10,
  "email" : "john@email.com",
  "username" : "theUser"
}"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }    }
    delete<Paths.deleteUser> {  _: Paths.deleteUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    get<Paths.getUserByName> {  _: Paths.getUserByName ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
  "firstName" : "John",
  "lastName" : "James",
  "password" : "12345",
  "userStatus" : 1,
  "phone" : "12345",
  "id" : 10,
  "email" : "john@email.com",
  "username" : "theUser"
}"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }    }
    get<Paths.loginUser> {  _: Paths.loginUser ->
        val exampleContentType = "application/json"
        val exampleContentString = """"""""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }    }
    get<Paths.logoutUser> {  _: Paths.logoutUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    put<Paths.updateUser> {  _: Paths.updateUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }
}
