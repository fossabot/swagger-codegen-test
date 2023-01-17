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

import io.swagger.client.model.Animal
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

class AnimalApi(
  val defBasePath: String = "https://raw.githubusercontent.com/v3",
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
  val helper = new AnimalApiAsyncHelper(client, config)

  /**
   * Add a new animal to the store
   * 
   *
   * @param body Animal object that needs to be added to the store 
   * @return void
   */
  def addAnimal(body: Animal) = {
    val await = Try(Await.result(addAnimalAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a new animal to the store asynchronously
   * 
   *
   * @param body Animal object that needs to be added to the store 
   * @return Future(void)
   */
  def addAnimalAsync(body: Animal) = {
      helper.addAnimal(body)
  }

  /**
   * Deletes a animal
   * 
   *
   * @param animalId Animal id to delete 
   * @param apiKey  (optional)
   * @return void
   */
  def deleteAnimal(animalId: Long, apiKey: Option[String] = None) = {
    val await = Try(Await.result(deleteAnimalAsync(animalId, apiKey), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Deletes a animal asynchronously
   * 
   *
   * @param animalId Animal id to delete 
   * @param apiKey  (optional)
   * @return Future(void)
   */
  def deleteAnimalAsync(animalId: Long, apiKey: Option[String] = None) = {
      helper.deleteAnimal(animalId, apiKey)
  }

  /**
   * Find animal by ID
   * Returns a single animal
   *
   * @param animalId ID of pet to return 
   * @return Animal
   */
  def getAnimalById(animalId: Long): Option[Animal] = {
    val await = Try(Await.result(getAnimalByIdAsync(animalId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find animal by ID asynchronously
   * Returns a single animal
   *
   * @param animalId ID of pet to return 
   * @return Future(Animal)
   */
  def getAnimalByIdAsync(animalId: Long): Future[Animal] = {
      helper.getAnimalById(animalId)
  }

  /**
   * Update an existing animal
   * 
   *
   * @param body Animal object that needs to be added. 
   * @return void
   */
  def updateAnimal(body: Animal) = {
    val await = Try(Await.result(updateAnimalAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update an existing animal asynchronously
   * 
   *
   * @param body Animal object that needs to be added. 
   * @return Future(void)
   */
  def updateAnimalAsync(body: Animal) = {
      helper.updateAnimal(body)
  }

  /**
   * Updates a animal
   * 
   *
   * @param animalId ID of animal that needs to be updated 
   * @param name  (optional)
   * @param status  (optional)
   * @return void
   */
  def updateAnimalWithForm(animalId: Long, name: Option[String] = None, status: Option[String] = None) = {
    val await = Try(Await.result(updateAnimalWithFormAsync(animalId, name, status), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Updates a animal asynchronously
   * 
   *
   * @param animalId ID of animal that needs to be updated 
   * @param name  (optional)
   * @param status  (optional)
   * @return Future(void)
   */
  def updateAnimalWithFormAsync(animalId: Long, name: Option[String] = None, status: Option[String] = None) = {
      helper.updateAnimalWithForm(animalId, name, status)
  }

}

class AnimalApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addAnimal(body: Animal)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Animal]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/animal"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AnimalApi->addAnimal")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAnimal(animalId: Long,
    apiKey: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/animal/{animalId}")
      replaceAll("\\{" + "animalId" + "\\}", animalId.toString))

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

  def getAnimalById(animalId: Long)(implicit reader: ClientResponseReader[Animal]): Future[Animal] = {
    // create path and map variables
    val path = (addFmt("/animal/{animalId}")
      replaceAll("\\{" + "animalId" + "\\}", animalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateAnimal(body: Animal)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Animal]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/animal"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AnimalApi->updateAnimal")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateAnimalWithForm(animalId: Long,
    name: Option[String] = None,
    status: Option[String] = None
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/animal/{animalId}")
      replaceAll("\\{" + "animalId" + "\\}", animalId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
