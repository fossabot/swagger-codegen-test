/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.36
 *
 * Do not edit the class manually.
 *
 */
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SwaggerPetstore);
  }
}(this, function(expect, SwaggerPetstore) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('EnumFormBody', function() {
      beforeEach(function() {
        instance = new SwaggerPetstore.EnumFormBody();
      });

      it('should create an instance of EnumFormBody', function() {
        // TODO: update the code to test EnumFormBody
        expect(instance).to.be.a(SwaggerPetstore.EnumFormBody);
      });

      it('should have the property enumFormStringArray (base name: "enum_form_string_array")', function() {
        // TODO: update the code to test the property enumFormStringArray
        expect(instance).to.have.property('enumFormStringArray');
        // expect(instance.enumFormStringArray).to.be(expectedValueLiteral);
      });

      it('should have the property enumFormString (base name: "enum_form_string")', function() {
        // TODO: update the code to test the property enumFormString
        expect(instance).to.have.property('enumFormString');
        // expect(instance.enumFormString).to.be(expectedValueLiteral);
      });

      it('should have the property enumQueryDouble (base name: "enum_query_double")', function() {
        // TODO: update the code to test the property enumQueryDouble
        expect(instance).to.have.property('enumQueryDouble');
        // expect(instance.enumQueryDouble).to.be(expectedValueLiteral);
      });

    });
  });

}));
