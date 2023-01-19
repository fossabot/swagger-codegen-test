=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::EnumTest
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'EnumTest' do
  before do
    # run before each test
    @instance = SwaggerClient::EnumTest.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EnumTest' do
    it 'should create an instance of EnumTest' do
      expect(@instance).to be_instance_of(SwaggerClient::EnumTest)
    end
  end
  describe 'test attribute "enum_string"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["UPPER", "lower", ""])
      # validator.allowable_values.each do |value|
      #   expect { @instance.enum_string = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "enum_string_required"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["UPPER", "lower", ""])
      # validator.allowable_values.each do |value|
      #   expect { @instance.enum_string_required = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "enum_integer"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('Integer', ["1", "-1"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.enum_integer = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "enum_number"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('Float', ["1.1", "-1.2"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.enum_number = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "outer_enum"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
