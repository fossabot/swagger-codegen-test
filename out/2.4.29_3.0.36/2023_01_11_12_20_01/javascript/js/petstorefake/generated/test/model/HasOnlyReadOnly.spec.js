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
 * Swagger Codegen version: 2.4.29
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
    describe('HasOnlyReadOnly', function() {
      beforeEach(function() {
        instance = new SwaggerPetstore.HasOnlyReadOnly();
      });

      it('should create an instance of HasOnlyReadOnly', function() {
        // TODO: update the code to test HasOnlyReadOnly
        expect(instance).to.be.a(SwaggerPetstore.HasOnlyReadOnly);
      });

      it('should have the property bar (base name: "bar")', function() {
        // TODO: update the code to test the property bar
        expect(instance).to.have.property('bar');
        // expect(instance.bar).to.be(expectedValueLiteral);
      });

      it('should have the property foo (base name: "foo")', function() {
        // TODO: update the code to test the property foo
        expect(instance).to.have.property('foo');
        // expect(instance.foo).to.be(expectedValueLiteral);
      });

    });
  });

}));
