=begin
Swagger Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git

=end


class ArrayTest < ApplicationRecord

  serialize :array_of_string, Array
  serialize :array_array_of_integer, Array
  serialize :array_array_of_model, Array
end
