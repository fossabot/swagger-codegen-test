package io.swagger.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(name="${swaggerPetstore.name:swaggerPetstore}", url="${swaggerPetstore.url:https://petstore.swagger.io}", configuration = ClientConfiguration.class)
public interface PetApiClient extends PetApi {
}