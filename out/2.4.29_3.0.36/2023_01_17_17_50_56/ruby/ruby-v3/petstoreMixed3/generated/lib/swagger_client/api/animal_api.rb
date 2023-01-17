=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.36
=end

module SwaggerClient
  class AnimalApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Add a new animal to the store
    # @param body Animal object that needs to be added to the store
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def add_animal(body, opts = {})
      add_animal_with_http_info(body, opts)
      nil
    end

    # Add a new animal to the store
    # @param body Animal object that needs to be added to the store
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def add_animal_with_http_info(body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AnimalApi.add_animal ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling AnimalApi.add_animal"
      end
      # resource path
      local_var_path = '/animal'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(body) 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['api_key_query']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AnimalApi#add_animal\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Deletes a animal
    # @param animal_id Animal id to delete
    # @param [Hash] opts the optional parameters
    # @option opts [String] :api_key 
    # @return [nil]
    def delete_animal(animal_id, opts = {})
      delete_animal_with_http_info(animal_id, opts)
      nil
    end

    # Deletes a animal
    # @param animal_id Animal id to delete
    # @param [Hash] opts the optional parameters
    # @option opts [String] :api_key 
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def delete_animal_with_http_info(animal_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AnimalApi.delete_animal ...'
      end
      # verify the required parameter 'animal_id' is set
      if @api_client.config.client_side_validation && animal_id.nil?
        fail ArgumentError, "Missing the required parameter 'animal_id' when calling AnimalApi.delete_animal"
      end
      # resource path
      local_var_path = '/animal/{animalId}'.sub('{' + 'animalId' + '}', animal_id.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      header_params[:'api_key'] = opts[:'api_key'] if !opts[:'api_key'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['api_key_query']
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AnimalApi#delete_animal\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Find animal by ID
    # Returns a single animal
    # @param animal_id ID of pet to return
    # @param [Hash] opts the optional parameters
    # @return [Animal]
    def get_animal_by_id(animal_id, opts = {})
      data, _status_code, _headers = get_animal_by_id_with_http_info(animal_id, opts)
      data
    end

    # Find animal by ID
    # Returns a single animal
    # @param animal_id ID of pet to return
    # @param [Hash] opts the optional parameters
    # @return [Array<(Animal, Integer, Hash)>] Animal data, response status code and response headers
    def get_animal_by_id_with_http_info(animal_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AnimalApi.get_animal_by_id ...'
      end
      # verify the required parameter 'animal_id' is set
      if @api_client.config.client_side_validation && animal_id.nil?
        fail ArgumentError, "Missing the required parameter 'animal_id' when calling AnimalApi.get_animal_by_id"
      end
      # resource path
      local_var_path = '/animal/{animalId}'.sub('{' + 'animalId' + '}', animal_id.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/xml', 'application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] || 'Animal' 

      auth_names = opts[:auth_names] || ['api_key_query']
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AnimalApi#get_animal_by_id\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Update an existing animal
    # @param body Animal object that needs to be added.
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def update_animal(body, opts = {})
      update_animal_with_http_info(body, opts)
      nil
    end

    # Update an existing animal
    # @param body Animal object that needs to be added.
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def update_animal_with_http_info(body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AnimalApi.update_animal ...'
      end
      # verify the required parameter 'body' is set
      if @api_client.config.client_side_validation && body.nil?
        fail ArgumentError, "Missing the required parameter 'body' when calling AnimalApi.update_animal"
      end
      # resource path
      local_var_path = '/animal'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json', 'application/xml'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:body] || @api_client.object_to_http_body(body) 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['api_key_query']
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AnimalApi#update_animal\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
    # Updates a animal
    # @param animal_id ID of animal that needs to be updated
    # @param [Hash] opts the optional parameters
    # @option opts [String] :name 
    # @option opts [String] :status 
    # @return [nil]
    def update_animal_with_form(animal_id, opts = {})
      update_animal_with_form_with_http_info(animal_id, opts)
      nil
    end

    # Updates a animal
    # @param animal_id ID of animal that needs to be updated
    # @param [Hash] opts the optional parameters
    # @option opts [String] :name 
    # @option opts [String] :status 
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def update_animal_with_form_with_http_info(animal_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: AnimalApi.update_animal_with_form ...'
      end
      # verify the required parameter 'animal_id' is set
      if @api_client.config.client_side_validation && animal_id.nil?
        fail ArgumentError, "Missing the required parameter 'animal_id' when calling AnimalApi.update_animal_with_form"
      end
      # resource path
      local_var_path = '/animal/{animalId}'.sub('{' + 'animalId' + '}', animal_id.to_s)

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/x-www-form-urlencoded'])

      # form parameters
      form_params = opts[:form_params] || {}
      form_params['name'] = opts[:'name'] if !opts[:'name'].nil?
      form_params['status'] = opts[:'status'] if !opts[:'status'].nil?

      # http body (model)
      post_body = opts[:body] 

      return_type = opts[:return_type] 

      auth_names = opts[:auth_names] || ['api_key_query']
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type)

      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AnimalApi#update_animal_with_form\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
