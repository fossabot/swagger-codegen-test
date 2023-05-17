# FakeApi

All URIs are relative to *http://petstore.swagger.io:80/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fakeOuterBooleanSerialize**](FakeApi.md#fakeOuterBooleanSerialize) | **POST** /fake/outer/boolean | 
[**fakeOuterCompositeSerialize**](FakeApi.md#fakeOuterCompositeSerialize) | **POST** /fake/outer/composite | 
[**fakeOuterNumberSerialize**](FakeApi.md#fakeOuterNumberSerialize) | **POST** /fake/outer/number | 
[**fakeOuterStringSerialize**](FakeApi.md#fakeOuterStringSerialize) | **POST** /fake/outer/string | 
[**testBodyWithQueryParams**](FakeApi.md#testBodyWithQueryParams) | **PUT** /fake/body-with-query-params | 
[**testClientModel**](FakeApi.md#testClientModel) | **PATCH** /fake | To test \&quot;client\&quot; model
[**testEndpointParameters**](FakeApi.md#testEndpointParameters) | **POST** /fake | Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
[**testEnumParameters**](FakeApi.md#testEnumParameters) | **GET** /fake | To test enum parameters
[**testInlineAdditionalProperties**](FakeApi.md#testInlineAdditionalProperties) | **POST** /fake/inline-additionalProperties | test inline additionalProperties
[**testJsonFormData**](FakeApi.md#testJsonFormData) | **GET** /fake/jsonFormData | test json serialization of form data


<a name="fakeOuterBooleanSerialize"></a>
# **fakeOuterBooleanSerialize**
> OuterBoolean fakeOuterBooleanSerialize(body)



Test serialization of outer boolean types

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val body : OuterBoolean =  // OuterBoolean | Input boolean as post body
try {
    val result : OuterBoolean = apiInstance.fakeOuterBooleanSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterBooleanSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterBooleanSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterBoolean**](OuterBoolean.md)| Input boolean as post body | [optional]

### Return type

[**OuterBoolean**](OuterBoolean.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fakeOuterCompositeSerialize"></a>
# **fakeOuterCompositeSerialize**
> OuterComposite fakeOuterCompositeSerialize(body)



Test serialization of object with outer number type

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val body : OuterComposite =  // OuterComposite | Input composite as post body
try {
    val result : OuterComposite = apiInstance.fakeOuterCompositeSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterCompositeSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterCompositeSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterComposite**](OuterComposite.md)| Input composite as post body | [optional]

### Return type

[**OuterComposite**](OuterComposite.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fakeOuterNumberSerialize"></a>
# **fakeOuterNumberSerialize**
> OuterNumber fakeOuterNumberSerialize(body)



Test serialization of outer number types

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val body : OuterNumber =  // OuterNumber | Input number as post body
try {
    val result : OuterNumber = apiInstance.fakeOuterNumberSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterNumberSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterNumberSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterNumber**](OuterNumber.md)| Input number as post body | [optional]

### Return type

[**OuterNumber**](OuterNumber.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="fakeOuterStringSerialize"></a>
# **fakeOuterStringSerialize**
> OuterString fakeOuterStringSerialize(body)



Test serialization of outer string types

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val body : OuterString =  // OuterString | Input string as post body
try {
    val result : OuterString = apiInstance.fakeOuterStringSerialize(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#fakeOuterStringSerialize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#fakeOuterStringSerialize")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OuterString**](OuterString.md)| Input string as post body | [optional]

### Return type

[**OuterString**](OuterString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="testBodyWithQueryParams"></a>
# **testBodyWithQueryParams**
> testBodyWithQueryParams(body, query)



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val body : User =  // User | 
val query : kotlin.String = query_example // kotlin.String | 
try {
    apiInstance.testBodyWithQueryParams(body, query)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testBodyWithQueryParams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testBodyWithQueryParams")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**User**](User.md)|  |
 **query** | **kotlin.String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testClientModel"></a>
# **testClientModel**
> Client testClientModel(body)

To test \&quot;client\&quot; model

To test \&quot;client\&quot; model

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val body : Client =  // Client | client model
try {
    val result : Client = apiInstance.testClientModel(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testClientModel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testClientModel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Client**](Client.md)| client model |

### Return type

[**Client**](Client.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="testEndpointParameters"></a>
# **testEndpointParameters**
> testEndpointParameters(number, double, patternWithoutDelimiter, byte, integer, int32, int64, float, string, binary, date, dateTime, password, callback)

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val number : java.math.BigDecimal = 8.14 // java.math.BigDecimal | None
val double : kotlin.Double = 1.2 // kotlin.Double | None
val patternWithoutDelimiter : kotlin.String = patternWithoutDelimiter_example // kotlin.String | None
val byte : kotlin.ByteArray = B // kotlin.ByteArray | None
val integer : kotlin.Int = 56 // kotlin.Int | None
val int32 : kotlin.Int = 56 // kotlin.Int | None
val int64 : kotlin.Long = 789 // kotlin.Long | None
val float : kotlin.Float = 3.4 // kotlin.Float | None
val string : kotlin.String = string_example // kotlin.String | None
val binary : kotlin.Array<kotlin.Byte> = B // kotlin.Array<kotlin.Byte> | None
val date : java.time.LocalDateTime = 2013-10-20 // java.time.LocalDateTime | None
val dateTime : java.time.LocalDateTime = 2013-10-20T19:20:30+01:00 // java.time.LocalDateTime | None
val password : kotlin.String = password_example // kotlin.String | None
val callback : kotlin.String = callback_example // kotlin.String | None
try {
    apiInstance.testEndpointParameters(number, double, patternWithoutDelimiter, byte, integer, int32, int64, float, string, binary, date, dateTime, password, callback)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testEndpointParameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testEndpointParameters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **number** | **java.math.BigDecimal**| None |
 **double** | **kotlin.Double**| None |
 **patternWithoutDelimiter** | **kotlin.String**| None |
 **byte** | **kotlin.ByteArray**| None |
 **integer** | **kotlin.Int**| None | [optional]
 **int32** | **kotlin.Int**| None | [optional]
 **int64** | **kotlin.Long**| None | [optional]
 **float** | **kotlin.Float**| None | [optional]
 **string** | **kotlin.String**| None | [optional]
 **binary** | **kotlin.Array&lt;kotlin.Byte&gt;**| None | [optional]
 **date** | **java.time.LocalDateTime**| None | [optional]
 **dateTime** | **java.time.LocalDateTime**| None | [optional]
 **password** | **kotlin.String**| None | [optional]
 **callback** | **kotlin.String**| None | [optional]

### Return type

null (empty response body)

### Authorization

[http_basic_test](../README.md#http_basic_test)

### HTTP request headers

 - **Content-Type**: application/xml; charset=utf-8, application/json; charset=utf-8
 - **Accept**: application/xml; charset=utf-8, application/json; charset=utf-8

<a name="testEnumParameters"></a>
# **testEnumParameters**
> testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble)

To test enum parameters

To test enum parameters

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val enumFormStringArray : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Form parameter enum test (string array)
val enumFormString : kotlin.String = enumFormString_example // kotlin.String | Form parameter enum test (string)
val enumHeaderStringArray : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Header parameter enum test (string array)
val enumHeaderString : kotlin.String = enumHeaderString_example // kotlin.String | Header parameter enum test (string)
val enumQueryStringArray : kotlin.Array<kotlin.String> =  // kotlin.Array<kotlin.String> | Query parameter enum test (string array)
val enumQueryString : kotlin.String = enumQueryString_example // kotlin.String | Query parameter enum test (string)
val enumQueryInteger : kotlin.Int = 56 // kotlin.Int | Query parameter enum test (double)
val enumQueryDouble : kotlin.Double = 1.2 // kotlin.Double | Query parameter enum test (double)
try {
    apiInstance.testEnumParameters(enumFormStringArray, enumFormString, enumHeaderStringArray, enumHeaderString, enumQueryStringArray, enumQueryString, enumQueryInteger, enumQueryDouble)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testEnumParameters")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testEnumParameters")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enumFormStringArray** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Form parameter enum test (string array) | [optional] [enum: >, $]
 **enumFormString** | **kotlin.String**| Form parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumHeaderStringArray** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Header parameter enum test (string array) | [optional] [enum: >, $]
 **enumHeaderString** | **kotlin.String**| Header parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryStringArray** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.String.md)| Query parameter enum test (string array) | [optional] [enum: >, $]
 **enumQueryString** | **kotlin.String**| Query parameter enum test (string) | [optional] [default to -efg] [enum: _abc, -efg, (xyz)]
 **enumQueryInteger** | **kotlin.Int**| Query parameter enum test (double) | [optional] [enum: 1, -2]
 **enumQueryDouble** | **kotlin.Double**| Query parameter enum test (double) | [optional] [enum: 1.1, -1.2]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

<a name="testInlineAdditionalProperties"></a>
# **testInlineAdditionalProperties**
> testInlineAdditionalProperties(param)

test inline additionalProperties



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val param : kotlin.Any =  // kotlin.Any | request body
try {
    apiInstance.testInlineAdditionalProperties(param)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testInlineAdditionalProperties")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testInlineAdditionalProperties")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | [**kotlin.Any**](kotlin.Any.md)| request body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="testJsonFormData"></a>
# **testJsonFormData**
> testJsonFormData(param, param2)

test json serialization of form data



### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*

val apiInstance = FakeApi()
val param : kotlin.String = param_example // kotlin.String | field1
val param2 : kotlin.String = param2_example // kotlin.String | field2
try {
    apiInstance.testJsonFormData(param, param2)
} catch (e: ClientException) {
    println("4xx response calling FakeApi#testJsonFormData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FakeApi#testJsonFormData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **param** | **kotlin.String**| field1 |
 **param2** | **kotlin.String**| field2 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

