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
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class EnumTest (
  enumString: Option[EnumTestEnums.EnumString] = None,
  enumStringRequired: EnumTestEnums.EnumStringRequired,
  enumInteger: Option[EnumTestEnums.EnumInteger] = None,
  enumNumber: Option[EnumTestEnums.EnumNumber] = None,
  outerEnum: Option[OuterEnum] = None
) extends ApiModel

object EnumTestEnums {

  type EnumString = EnumString.Value
  type EnumStringRequired = EnumStringRequired.Value
  type EnumInteger = EnumInteger.Value
  type EnumNumber = EnumNumber.Value
  object EnumString extends Enumeration {
    val UPPER = Value("UPPER")
    val Lower = Value("lower")
    val `` = Value("")
  }

  object EnumStringRequired extends Enumeration {
    val UPPER = Value("UPPER")
    val Lower = Value("lower")
    val `` = Value("")
  }

  object EnumInteger extends Enumeration {
    val `1` = Value("1")
    val `1` = Value("-1")
  }

  object EnumNumber extends Enumeration {
    val `11` = Value("1.1")
    val `12` = Value("-1.2")
  }

}

