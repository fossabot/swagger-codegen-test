=begin
Swagger Petstore

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

OpenAPI spec version: 1.0.0
Contact: apiteam@swagger.io
Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

class InitTables < ActiveRecord::Migration
  def change
    create_table "__special[model/name]".pluralize.to_sym, id: false do |t|
      t.integer :__special[property/name]

      t.timestamps
    end

    create_table "200_response".pluralize.to_sym, id: false do |t|
      t.integer :name
      t.string :_class

      t.timestamps
    end

    create_table "additional_properties_class".pluralize.to_sym, id: false do |t|
      t.string :map_property
      t.string :map_of_map_property

      t.timestamps
    end

    create_table "animal".pluralize.to_sym, id: false do |t|
      t.string :class_name
      t.string :color

      t.timestamps
    end

    create_table "animal_farm".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "api_response".pluralize.to_sym, id: false do |t|
      t.integer :code
      t.string :type
      t.string :message

      t.timestamps
    end

    create_table "array_of_array_of_number_only".pluralize.to_sym, id: false do |t|
      t.string :array_array_number

      t.timestamps
    end

    create_table "array_of_number_only".pluralize.to_sym, id: false do |t|
      t.string :array_number

      t.timestamps
    end

    create_table "array_test".pluralize.to_sym, id: false do |t|
      t.string :array_of_string
      t.string :array_array_of_integer
      t.string :array_array_of_model

      t.timestamps
    end

    create_table "boolean".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "capitalization".pluralize.to_sym, id: false do |t|
      t.string :small_camel
      t.string :capital_camel
      t.string :small_snake
      t.string :capital_snake
      t.string :sca_eth_flow_points
      t.string :att_name

      t.timestamps
    end

    create_table "cat".pluralize.to_sym, id: false do |t|
      t.string :class_name
      t.string :color
      t.boolean :declawed

      t.timestamps
    end

    create_table "category".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "class_model".pluralize.to_sym, id: false do |t|
      t.string :_class

      t.timestamps
    end

    create_table "client".pluralize.to_sym, id: false do |t|
      t.string :client

      t.timestamps
    end

    create_table "dog".pluralize.to_sym, id: false do |t|
      t.string :class_name
      t.string :color
      t.string :breed

      t.timestamps
    end

    create_table "enum_arrays".pluralize.to_sym, id: false do |t|
      t.string :just_symbol
      t.string :array_enum

      t.timestamps
    end

    create_table "enum_class".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "enum_test".pluralize.to_sym, id: false do |t|
      t.string :enum_string
      t.string :enum_string_required
      t.integer :enum_integer
      t.decimal :enum_number
      t.string :outer_enum

      t.timestamps
    end

    create_table "format_test".pluralize.to_sym, id: false do |t|
      t.integer :integer
      t.integer :int32
      t.integer :int64
      t.float :number
      t.float :float
      t.decimal :double
      t.string :string
      t.string :byte
      t.string :binary
      t.date :date
      t.datetime :date_time
      t.string :uuid
      t.string :password

      t.timestamps
    end

    create_table "has_only_read_only".pluralize.to_sym, id: false do |t|
      t.string :bar
      t.string :foo

      t.timestamps
    end

    create_table "ints".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "map_test".pluralize.to_sym, id: false do |t|
      t.string :map_map_of_string
      t.string :map_of_enum_string

      t.timestamps
    end

    create_table "mixed_properties_and_additional_properties_class".pluralize.to_sym, id: false do |t|
      t.string :uuid
      t.datetime :date_time
      t.string :map

      t.timestamps
    end

    create_table "model_return".pluralize.to_sym, id: false do |t|
      t.integer :_return

      t.timestamps
    end

    create_table "name".pluralize.to_sym, id: false do |t|
      t.integer :name
      t.integer :snake_case
      t.string :property
      t.integer :_123_number

      t.timestamps
    end

    create_table "number_only".pluralize.to_sym, id: false do |t|
      t.float :just_number

      t.timestamps
    end

    create_table "numbers".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "order".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.integer :pet_id
      t.integer :quantity
      t.datetime :ship_date
      t.string :status
      t.boolean :complete

      t.timestamps
    end

    create_table "outer_boolean".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "outer_composite".pluralize.to_sym, id: false do |t|
      t.string :my_number
      t.string :my_string
      t.string :my_boolean

      t.timestamps
    end

    create_table "outer_enum".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "outer_number".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "outer_string".pluralize.to_sym, id: false do |t|

      t.timestamps
    end

    create_table "pet".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :category
      t.string :name
      t.string :photo_urls
      t.string :tags
      t.string :status

      t.timestamps
    end

    create_table "read_only_first".pluralize.to_sym, id: false do |t|
      t.string :bar
      t.string :baz

      t.timestamps
    end

    create_table "tag".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :name

      t.timestamps
    end

    create_table "user".pluralize.to_sym, id: false do |t|
      t.integer :id
      t.string :username
      t.string :first_name
      t.string :last_name
      t.string :email
      t.string :password
      t.string :phone
      t.integer :user_status

      t.timestamps
    end

  end
end
