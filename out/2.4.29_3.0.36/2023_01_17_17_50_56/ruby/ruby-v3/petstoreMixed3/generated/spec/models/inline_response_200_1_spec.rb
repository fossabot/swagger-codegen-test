=begin
#Swagger Petstore

#This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 3.0.36
=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::InlineResponse2001
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'InlineResponse2001' do
  before do
    # run before each test
    @instance = SwaggerClient::InlineResponse2001.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of InlineResponse2001' do
    it 'should create an instance of InlineResponse2001' do
      expect(@instance).to be_instance_of(SwaggerClient::InlineResponse2001)
    end
  end
end
