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

# Unit tests for SwaggerClient::PetIdUploadImageBody
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PetIdUploadImageBody' do
  before do
    # run before each test
    @instance = SwaggerClient::PetIdUploadImageBody.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PetIdUploadImageBody' do
    it 'should create an instance of PetIdUploadImageBody' do
      expect(@instance).to be_instance_of(SwaggerClient::PetIdUploadImageBody)
    end
  end
  describe 'test attribute "additional_metadata"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "file"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
