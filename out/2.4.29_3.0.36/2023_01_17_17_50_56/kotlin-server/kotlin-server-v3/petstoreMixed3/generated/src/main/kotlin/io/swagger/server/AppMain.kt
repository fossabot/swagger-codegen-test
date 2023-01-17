package io.swagger.server

import com.codahale.metrics.Slf4jReporter
import com.typesafe.config.ConfigFactory
import io.ktor.application.Application
import io.ktor.application.ApplicationStopping
import io.ktor.application.install
import io.ktor.application.log
import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import io.ktor.config.HoconApplicationConfig
import io.ktor.features.AutoHeadResponse
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders
import io.ktor.features.HSTS
import io.ktor.gson.GsonConverter
import io.ktor.http.ContentType
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Locations
import io.ktor.routing.Routing
import java.util.concurrent.TimeUnit
import io.ktor.util.KtorExperimentalAPI
import io.ktor.auth.Authentication
import io.ktor.auth.oauth
import io.ktor.metrics.dropwizard.DropwizardMetrics
import io.swagger.server.infrastructure.ApiKeyCredential
import io.swagger.server.infrastructure.ApiPrincipal
import io.swagger.server.infrastructure.apiKeyAuth
import io.swagger.server.apis.AnimalApi
import io.swagger.server.apis.AnotherFakeApi
import io.swagger.server.apis.DogApi
import io.swagger.server.apis.FakeApi
import io.swagger.server.apis.FakeClassnameTags123Api
import io.swagger.server.apis.MasterApi
import io.swagger.server.apis.ParrotApi
import io.swagger.server.apis.PetApi
import io.swagger.server.apis.StoreApi
import io.swagger.server.apis.UserApi

@KtorExperimentalAPI
internal val settings = HoconApplicationConfig(ConfigFactory.defaultApplication(HTTP::class.java.classLoader))

object HTTP {
    val client = HttpClient(Apache)
}

@KtorExperimentalAPI
@KtorExperimentalLocationsAPI
fun Application.main() {
    install(DefaultHeaders)
    install(DropwizardMetrics) {
        val reporter = Slf4jReporter.forRegistry(registry)
                .outputTo(log)
                .convertRatesTo(TimeUnit.SECONDS)
                .convertDurationsTo(TimeUnit.MILLISECONDS)
                .build()
        reporter.start(10, TimeUnit.SECONDS)
    }
    install(ContentNegotiation) {
        register(ContentType.Application.Json, GsonConverter())
    }
    install(AutoHeadResponse) // see http://ktor.io/features/autoheadresponse.html
    install(HSTS, ApplicationHstsConfiguration()) // see http://ktor.io/features/hsts.html
    install(Compression, ApplicationCompressionConfiguration()) // see http://ktor.io/features/compression.html
    install(Locations) // see http://ktor.io/features/locations.html
    install(Authentication) {
        // "Implement API key auth (api_key) for parameter name 'api_key'."
        apiKeyAuth("api_key") {
            validate { apikeyCredential: ApiKeyCredential ->
                when {
                    apikeyCredential.value == "keyboardcat" -> ApiPrincipal(apikeyCredential)
                    else -> null
                }
            }
        }
        // "Implement API key auth (api_key_query) for parameter name 'api_key_query'."
        apiKeyAuth("api_key_query") {
            validate { apikeyCredential: ApiKeyCredential ->
                when {
                    apikeyCredential.value == "keyboardcat" -> ApiPrincipal(apikeyCredential)
                    else -> null
                }
            }
        }
        basic("http_basic_test") {
        validate { credentials ->
            // TODO: "Apply your basic authentication functionality."
            // Accessible in-method via call.principal<UserIdPrincipal>()
            if (credentials.name == "Swagger" && "Codegen" == credentials.password) {
                UserIdPrincipal(credentials.name)
            } else {
                null
            }
        }
        oauth("petstore_auth") {
            client = HttpClient(Apache)
            providerLookup = { ApplicationAuthProviders["petstore_auth"] }
            urlProvider = { _ ->
            // TODO: define a callback url here.
            "/"
            }
        }
    }
    install(Routing) {
        AnimalApi()
        AnotherFakeApi()
        DogApi()
        FakeApi()
        FakeClassnameTags123Api()
        MasterApi()
        ParrotApi()
        PetApi()
        StoreApi()
        UserApi()
    }


    environment.monitor.subscribe(ApplicationStopping)
    {
        HTTP.client.close()
    }
}
