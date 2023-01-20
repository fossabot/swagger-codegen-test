# SwaggerClient::StoreApi

All URIs are relative to *https://raw.githubusercontent.com/api/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_order**](StoreApi.md#delete_order) | **DELETE** /store/order/{orderId} | Delete purchase order by ID
[**get_inventory**](StoreApi.md#get_inventory) | **GET** /store/inventory | Returns pet inventories by status
[**get_order_by_id**](StoreApi.md#get_order_by_id) | **GET** /store/order/{orderId} | Find purchase order by ID
[**place_order**](StoreApi.md#place_order) | **POST** /store/order | Place an order for a pet
[**place_order**](StoreApi.md#place_order) | **POST** /store/order | Place an order for a pet

# **delete_order**
> delete_order(order_id)

Delete purchase order by ID

For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StoreApi.new
order_id = 789 # Integer | ID of the order that needs to be deleted


begin
  #Delete purchase order by ID
  api_instance.delete_order(order_id)
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StoreApi->delete_order: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **Integer**| ID of the order that needs to be deleted | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined



# **get_inventory**
> Hash&lt;String, Integer&gt; get_inventory

Returns pet inventories by status

Returns a map of status codes to quantities

### Example
```ruby
# load the gem
require 'swagger_client'
# setup authorization
SwaggerClient.configure do |config|
  # Configure API key authorization: api_key
  config.api_key['api_key'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  #config.api_key_prefix['api_key'] = 'Bearer'
end

api_instance = SwaggerClient::StoreApi.new

begin
  #Returns pet inventories by status
  result = api_instance.get_inventory
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StoreApi->get_inventory: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Hash&lt;String, Integer&gt;**

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_order_by_id**
> Order get_order_by_id(order_id)

Find purchase order by ID

For valid response try integer IDs with value <= 5 or > 10. Other values will generated exceptions

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StoreApi.new
order_id = 789 # Integer | ID of order that needs to be fetched


begin
  #Find purchase order by ID
  result = api_instance.get_order_by_id(order_id)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StoreApi->get_order_by_id: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_id** | **Integer**| ID of order that needs to be fetched | 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json



# **place_order**
> Order place_order(opts)

Place an order for a pet

Place a new order in the store

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StoreApi.new
opts = { 
  body: SwaggerClient::Order.new # Order | 
}

begin
  #Place an order for a pet
  result = api_instance.place_order(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StoreApi->place_order: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Order**](Order.md)|  | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json



# **place_order**
> Order place_order(opts)

Place an order for a pet

Place a new order in the store

### Example
```ruby
# load the gem
require 'swagger_client'

api_instance = SwaggerClient::StoreApi.new
opts = { 
  id: 789 # Integer | 
  pet_id: 789 # Integer | 
  quantity: 56 # Integer | 
  ship_date: DateTime.parse('2013-10-20T19:20:30+01:00') # DateTime | 
  status: 'status_example' # String | 
  complete: true # BOOLEAN | 
}

begin
  #Place an order for a pet
  result = api_instance.place_order(opts)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling StoreApi->place_order: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  | [optional] 
 **pet_id** | **Integer**|  | [optional] 
 **quantity** | **Integer**|  | [optional] 
 **ship_date** | **DateTime**|  | [optional] 
 **status** | **String**|  | [optional] 
 **complete** | **BOOLEAN**|  | [optional] 

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
 - **Accept**: application/json



