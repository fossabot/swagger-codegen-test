/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */

package io.swagger.server.model

case class Pet(
  id: Option[Long],
    category: Option[Category],
    name: String,
    photoUrls: List[String],
    tags: Option[List[Tag]],
  /* pet status in the store */
  status: Option[String]
  )
