<?php

/**
 * FakeClassnameTags123Controller
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Server\Controller
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Server\Controller;

use \Exception;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpKernel\Exception\HttpException;
use Symfony\Component\Validator\Constraints as Assert;
use Swagger\Server\Api\FakeClassnameTags123ApiInterface;
use Swagger\Server\Model\Client;

/**
 * FakeClassnameTags123Controller Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Server\Controller
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FakeClassnameTags123Controller extends Controller
{

    /**
     * Operation testClassname
     *
     * To test class name in snake case
     *
     * @param Request $request The Symfony request to handle.
     * @return Response The Symfony response.
     */
    public function testClassnameAction(Request $request)
    {
        // Make sure that the client is providing something that we can consume
        $consumes = ['application/json'];
        $inputFormat = $request->headers->has('Content-Type')?$request->headers->get('Content-Type'):$consumes[0];
        if (!in_array($inputFormat, $consumes)) {
            // We can't consume the content that the client is sending us
            return new Response('', 415);
        }

        // Figure out what data format to return to the client
        $produces = ['application/json'];
        // Figure out what the client accepts
        $clientAccepts = $request->headers->has('Accept')?$request->headers->get('Accept'):'*/*';
        $responseFormat = $this->getOutputFormat($clientAccepts, $produces);
        if ($responseFormat === null) {
            return new Response('', 406);
        }

        // Handle authentication
        // Authentication 'api_key_query' required
        // Set key with prefix in query string
        $securityapi_key_query = $request->query->get('api_key_query');

        // Read out all input parameter values into variables
        $body = $request->getContent();

        // Use the default value if no value was provided

        // Deserialize the input values that needs it
        $body = $this->deserialize($body, 'Swagger\Server\Model\Client', $inputFormat);

        // Validate the input values
        $asserts = [];
        $asserts[] = new Assert\NotNull();
        $asserts[] = new Assert\Type("Swagger\Server\Model\Client");
        $response = $this->validate($body, $asserts);
        if ($response instanceof Response) {
            return $response;
        }


        try {
            $handler = $this->getApiHandler();

            // Set authentication method 'api_key_query'
            $handler->setapi_key_query($securityapi_key_query);
            
            // Make the call to the business logic
            $responseCode = 200;
            $responseHeaders = [];
            $result = $handler->testClassname($body, $responseCode, $responseHeaders);

            // Find default response message
            $message = 'successful operation';

            // Find a more specific message, if available
            switch ($responseCode) {
                case 200:
                    $message = 'successful operation';
                    break;
            }

            return new Response(
                $result?$this->serialize($result, $responseFormat):'',
                $responseCode,
                array_merge(
                    $responseHeaders,
                    [
                        'Content-Type' => $responseFormat,
                        'X-Swagger-Message' => $message
                    ]
                )
            );
        } catch (Exception $fallthrough) {
            return $this->createErrorResponse(new HttpException(500, 'An unsuspected error occurred.', $fallthrough));
        }
    }

    /**
     * Returns the handler for this API controller.
     * @return FakeClassnameTags123ApiInterface
     */
    public function getApiHandler()
    {
        return $this->apiServer->getApiHandler('fakeClassnameTags123');
    }
}
