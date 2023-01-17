/**
* Swagger Petstore
* This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
*
* OpenAPI spec version: 1.0.0
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


import io.swagger.server.models.Order

@KtorExperimentalLocationsAPI
fun Route.StoreApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()
    delete<Paths.deleteOrder> {  _: Paths.deleteOrder ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    get<Paths.getInventory> {  _: Paths.getInventory ->
        val principal = call.authentication.principal<ApiPrincipal>()
        if (principal == null) {
            call.respond(HttpStatusCode.Unauthorized)
        } else {
            val exampleContentType = "application/json"
            val exampleContentString = """{
  "key" : 0
}"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }        }
    }
    get<Paths.getOrderById> {  _: Paths.getOrderById ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
  "petId" : 6,
  "quantity" : 1,
  "id" : 0,
  "shipDate" : "2000-01-23T04:56:07.000+00:00",
  "complete" : false,
  "status" : "placed"
}"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }    }
    post<Paths.placeOrder> {  _: Paths.placeOrder ->
        val exampleContentType = "application/json"
        val exampleContentString = """{
  "petId" : 6,
  "quantity" : 1,
  "id" : 0,
  "shipDate" : "2000-01-23T04:56:07.000+00:00",
  "complete" : false,
  "status" : "placed"
}"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }    }
}
