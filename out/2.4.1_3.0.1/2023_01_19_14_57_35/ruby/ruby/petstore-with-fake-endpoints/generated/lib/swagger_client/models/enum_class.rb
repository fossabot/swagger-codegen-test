=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.1

=end

require 'date'

module SwaggerClient
  class EnumClass
    
    ABC = '_abc'.freeze
    EFG = '-efg'.freeze
    XYZ = '(xyz)'.freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = EnumClass.constants.select { |c| EnumClass::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #EnumClass" if constantValues.empty?
      value
    end
  end
end
