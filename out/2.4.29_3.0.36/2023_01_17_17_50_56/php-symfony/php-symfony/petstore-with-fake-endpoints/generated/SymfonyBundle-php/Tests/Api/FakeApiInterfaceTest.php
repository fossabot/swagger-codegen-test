<?php
/**
 * FakeApiInterfaceTest
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Server\Tests\Api
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
 * Please update the test case below to test the endpoint.
 */

namespace Swagger\Server\Tests\Api;

use Swagger\Server\Configuration;
use Swagger\Server\ApiClient;
use Swagger\Server\ApiException;
use Swagger\Server\ObjectSerializer;
use Symfony\Bundle\FrameworkBundle\Test\WebTestCase;

/**
 * FakeApiInterfaceTest Class Doc Comment
 *
 * @category Class
 * @package  Swagger\Server\Tests\Api
 * @author   Swagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */
class FakeApiInterfaceTest extends WebTestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass()
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp()
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown()
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass()
    {
    }

    /**
     * Test case for fakeOuterBooleanSerialize
     *
     * .
     *
     */
    public function testFakeOuterBooleanSerialize()
    {
        $client = static::createClient();

        $path = '/fake/outer/boolean';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for fakeOuterCompositeSerialize
     *
     * .
     *
     */
    public function testFakeOuterCompositeSerialize()
    {
        $client = static::createClient();

        $path = '/fake/outer/composite';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for fakeOuterNumberSerialize
     *
     * .
     *
     */
    public function testFakeOuterNumberSerialize()
    {
        $client = static::createClient();

        $path = '/fake/outer/number';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for fakeOuterStringSerialize
     *
     * .
     *
     */
    public function testFakeOuterStringSerialize()
    {
        $client = static::createClient();

        $path = '/fake/outer/string';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for testBodyWithQueryParams
     *
     * .
     *
     */
    public function testTestBodyWithQueryParams()
    {
        $client = static::createClient();

        $path = '/fake/body-with-query-params';

        $crawler = $client->request('PUT', $path);
    }

    /**
     * Test case for testClientModel
     *
     * To test \"client\" model.
     *
     */
    public function testTestClientModel()
    {
        $client = static::createClient();

        $path = '/fake';

        $crawler = $client->request('PATCH', $path);
    }

    /**
     * Test case for testEndpointParameters
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트.
     *
     */
    public function testTestEndpointParameters()
    {
        $client = static::createClient();

        $path = '/fake';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for testEnumParameters
     *
     * To test enum parameters.
     *
     */
    public function testTestEnumParameters()
    {
        $client = static::createClient();

        $path = '/fake';

        $crawler = $client->request('GET', $path);
    }

    /**
     * Test case for testInlineAdditionalProperties
     *
     * test inline additionalProperties.
     *
     */
    public function testTestInlineAdditionalProperties()
    {
        $client = static::createClient();

        $path = '/fake/inline-additionalProperties';

        $crawler = $client->request('POST', $path);
    }

    /**
     * Test case for testJsonFormData
     *
     * test json serialization of form data.
     *
     */
    public function testTestJsonFormData()
    {
        $client = static::createClient();

        $path = '/fake/jsonFormData';

        $crawler = $client->request('GET', $path);
    }

    protected function genTestData($regexp)
    {
        $grammar  = new \Hoa\File\Read('hoa://Library/Regex/Grammar.pp');
        $compiler = \Hoa\Compiler\Llk\Llk::load($grammar);
        $ast      = $compiler->parse($regexp);
        $generator = new \Hoa\Regex\Visitor\Isotropic(new \Hoa\Math\Sampler\Random());

        return $generator->visit($ast); 
    }
}
