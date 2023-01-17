=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.29

=end

# Common files
require 'swagger_client/api_client'
require 'swagger_client/api_error'
require 'swagger_client/version'
require 'swagger_client/configuration'

# Models
require 'swagger_client/models/additional_properties_class'
require 'swagger_client/models/animal'
require 'swagger_client/models/animal_farm'
require 'swagger_client/models/api_response'
require 'swagger_client/models/array_of_array_of_number_only'
require 'swagger_client/models/array_of_number_only'
require 'swagger_client/models/array_test'
require 'swagger_client/models/boolean'
require 'swagger_client/models/capitalization'
require 'swagger_client/models/cat'
require 'swagger_client/models/category'
require 'swagger_client/models/class_model'
require 'swagger_client/models/client'
require 'swagger_client/models/dog'
require 'swagger_client/models/enum_arrays'
require 'swagger_client/models/enum_class'
require 'swagger_client/models/enum_test'
require 'swagger_client/models/format_test'
require 'swagger_client/models/has_only_read_only'
require 'swagger_client/models/ints'
require 'swagger_client/models/list'
require 'swagger_client/models/map_test'
require 'swagger_client/models/mixed_properties_and_additional_properties_class'
require 'swagger_client/models/model_200_response'
require 'swagger_client/models/model_return'
require 'swagger_client/models/name'
require 'swagger_client/models/number_only'
require 'swagger_client/models/numbers'
require 'swagger_client/models/order'
require 'swagger_client/models/outer_boolean'
require 'swagger_client/models/outer_composite'
require 'swagger_client/models/outer_enum'
require 'swagger_client/models/outer_number'
require 'swagger_client/models/outer_string'
require 'swagger_client/models/pet'
require 'swagger_client/models/read_only_first'
require 'swagger_client/models/special_model_name'
require 'swagger_client/models/tag'
require 'swagger_client/models/user'

# APIs
require 'swagger_client/api/another_fake_api'
require 'swagger_client/api/fake_api'
require 'swagger_client/api/fake_classname_tags123_api'
require 'swagger_client/api/pet_api'
require 'swagger_client/api/store_api'
require 'swagger_client/api/user_api'

module SwaggerClient
  class << self
    # Customize default settings for the SDK using block.
    #   SwaggerClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
