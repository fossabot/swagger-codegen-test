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

# Unit tests for SwaggerClient::FakeClassnameTags123Api
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'FakeClassnameTags123Api' do
  before do
    # run before each test
    @instance = SwaggerClient::FakeClassnameTags123Api.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of FakeClassnameTags123Api' do
    it 'should create an instance of FakeClassnameTags123Api' do
      expect(@instance).to be_instance_of(SwaggerClient::FakeClassnameTags123Api)
    end
  end

  # unit tests for test_classname
  # To test class name in snake case
  # To test class name in snake case
  # @param body client model
  # @param [Hash] opts the optional parameters
  # @return [Client]
  describe 'test_classname test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
