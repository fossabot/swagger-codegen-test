package controllers;

import apimodels.Client;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T17:55:25.505Z")

public class AnotherFakeApiControllerImp implements AnotherFakeApiControllerImpInterface {
    @Override
    public CompletionStage<Client> testSpecialTags(Client body) throws Exception {
        //Do your magic!!!
        return CompletableFuture.supplyAsync(() -> {
           return new Client();
        });
    }

}
