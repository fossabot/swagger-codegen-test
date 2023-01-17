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

# Unit tests for SwaggerClient::PartOne
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PartOne' do
  before do
    # run before each test
    @instance = SwaggerClient::PartOne.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PartOne' do
    it 'should create an instance of PartOne' do
      expect(@instance).to be_instance_of(SwaggerClient::PartOne)
    end
  end
  describe 'test attribute "name"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
