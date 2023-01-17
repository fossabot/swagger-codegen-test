package io.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(contextId="AnimalApiClient", name="${swaggerPetstore.name:swaggerPetstore}", url="${swaggerPetstore.url:http://petstore.swagger.io:80/v2}", configuration = ClientConfiguration.class)
public interface AnimalApiClient extends AnimalApi {
}
