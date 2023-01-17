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

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.ApiResponse
import java.io.File
import io.swagger.client.model.Pet
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class PetApi(
  val defBasePath: String = "http://petstore.swagger.io:80/v2",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new PetApiAsyncHelper(client, config)

  /**
   * Add a new pet to the store
   * 
   *
   * @param body Pet object that needs to be added to the store 
   * @return void
   */
  def addPet(body: Pet) = {
    val await = Try(Await.result(addPetAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a new pet to the store asynchronously
   * 
   *
   * @param body Pet object that needs to be added to the store 
   * @return Future(void)
   */
  def addPetAsync(body: Pet) = {
      helper.addPet(body)
  }

  /**
   * Deletes a pet
   * 
   *
   * @param petId Pet id to delete 
   * @param apiKey  (optional)
   * @return void
   */
  def deletePet(petId: Long, apiKey: Option[String] = None) = {
    val await = Try(Await.result(deletePetAsync(petId, apiKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Deletes a pet asynchronously
   * 
   *
   * @param petId Pet id to delete 
   * @param apiKey  (optional)
   * @return Future(void)
   */
  def deletePetAsync(petId: Long, apiKey: Option[String] = None) = {
      helper.deletePet(petId, apiKey)
  }

  /**
   * Finds Pets by status
   * Multiple status values can be provided with comma separated strings
   *
   * @param status Status values that need to be considered for filter 
   * @return List[Pet]
   */
  def findPetsByStatus(status: List[String]): Option[List[Pet]] = {
    val await = Try(Await.result(findPetsByStatusAsync(status), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Finds Pets by status asynchronously
   * Multiple status values can be provided with comma separated strings
   *
   * @param status Status values that need to be considered for filter 
   * @return Future(List[Pet])
   */
  def findPetsByStatusAsync(status: List[String]): Future[List[Pet]] = {
      helper.findPetsByStatus(status)
  }

  /**
   * Finds Pets by tags
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   *
   * @param tags Tags to filter by 
   * @return List[Pet]
   */
  def findPetsByTags(tags: List[String]): Option[List[Pet]] = {
    val await = Try(Await.result(findPetsByTagsAsync(tags), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Finds Pets by tags asynchronously
   * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
   *
   * @param tags Tags to filter by 
   * @return Future(List[Pet])
   */
  def findPetsByTagsAsync(tags: List[String]): Future[List[Pet]] = {
      helper.findPetsByTags(tags)
  }

  /**
   * Find pet by ID
   * Returns a single pet
   *
   * @param petId ID of pet to return 
   * @return Pet
   */
  def getPetById(petId: Long): Option[Pet] = {
    val await = Try(Await.result(getPetByIdAsync(petId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find pet by ID asynchronously
   * Returns a single pet
   *
   * @param petId ID of pet to return 
   * @return Future(Pet)
   */
  def getPetByIdAsync(petId: Long): Future[Pet] = {
      helper.getPetById(petId)
  }

  /**
   * Update an existing pet
   * 
   *
   * @param body Pet object that needs to be added to the store 
   * @return void
   */
  def updatePet(body: Pet) = {
    val await = Try(Await.result(updatePetAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an existing pet asynchronously
   * 
   *
   * @param body Pet object that needs to be added to the store 
   * @return Future(void)
   */
  def updatePetAsync(body: Pet) = {
      helper.updatePet(body)
  }

  /**
   * Updates a pet in the store with form data
   * 
   *
   * @param petId ID of pet that needs to be updated 
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @return void
   */
  def updatePetWithForm(petId: Long, name: Option[String] = None, status: Option[String] = None) = {
    val await = Try(Await.result(updatePetWithFormAsync(petId, name, status), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Updates a pet in the store with form data asynchronously
   * 
   *
   * @param petId ID of pet that needs to be updated 
   * @param name Updated name of the pet (optional)
   * @param status Updated status of the pet (optional)
   * @return Future(void)
   */
  def updatePetWithFormAsync(petId: Long, name: Option[String] = None, status: Option[String] = None) = {
      helper.updatePetWithForm(petId, name, status)
  }

  /**
   * uploads an image
   * 
   *
   * @param petId ID of pet to update 
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return ApiResponse
   */
  def uploadFile(petId: Long, additionalMetadata: Option[String] = None, file: Option[File] = None): Option[ApiResponse] = {
    val await = Try(Await.result(uploadFileAsync(petId, additionalMetadata, file), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * uploads an image asynchronously
   * 
   *
   * @param petId ID of pet to update 
   * @param additionalMetadata Additional data to pass to server (optional)
   * @param file file to upload (optional)
   * @return Future(ApiResponse)
   */
  def uploadFileAsync(petId: Long, additionalMetadata: Option[String] = None, file: Option[File] = None): Future[ApiResponse] = {
      helper.uploadFile(petId, additionalMetadata, file)
  }

}

class PetApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addPet(body: Pet)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Pet]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/pet"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling PetApi->addPet")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deletePet(petId: Long,
    apiKey: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/pet/{petId}")
      replaceAll("\\{" + "petId" + "\\}", petId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    apiKey match {
      case Some(param) => headerParams += "api_key" -> param.toString
      case _ => headerParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def findPetsByStatus(status: List[String])(implicit reader: ClientResponseReader[List[Pet]]): Future[List[Pet]] = {
    // create path and map variables
    val path = (addFmt("/pet/findByStatus"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (status == null) throw new Exception("Missing required parameter 'status' when calling PetApi->findPetsByStatus")
    queryParams += "status" -> status.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def findPetsByTags(tags: List[String])(implicit reader: ClientResponseReader[List[Pet]]): Future[List[Pet]] = {
    // create path and map variables
    val path = (addFmt("/pet/findByTags"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (tags == null) throw new Exception("Missing required parameter 'tags' when calling PetApi->findPetsByTags")
    queryParams += "tags" -> tags.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getPetById(petId: Long)(implicit reader: ClientResponseReader[Pet]): Future[Pet] = {
    // create path and map variables
    val path = (addFmt("/pet/{petId}")
      replaceAll("\\{" + "petId" + "\\}", petId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updatePet(body: Pet)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Pet]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/pet"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling PetApi->updatePet")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updatePetWithForm(petId: Long,
    name: Option[String] = None,
    status: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/pet/{petId}")
      replaceAll("\\{" + "petId" + "\\}", petId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def uploadFile(petId: Long,
    additionalMetadata: Option[String] = None,
    file: Option[File] = None
    )(implicit reader: ClientResponseReader[ApiResponse]): Future[ApiResponse] = {
    // create path and map variables
    val path = (addFmt("/pet/{petId}/uploadImage")
      replaceAll("\\{" + "petId" + "\\}", petId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
