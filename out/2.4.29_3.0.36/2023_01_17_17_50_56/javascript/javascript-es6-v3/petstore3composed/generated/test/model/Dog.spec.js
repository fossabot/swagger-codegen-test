/*
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
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
    describe('Dog', function() {
      beforeEach(function() {
        instance = new SwaggerPetstore.Dog();
      });

      it('should create an instance of Dog', function() {
        // TODO: update the code to test Dog
        expect(instance).to.be.a(SwaggerPetstore.Dog);
      });

      it('should have the property bark (base name: "bark")', function() {
        // TODO: update the code to test the property bark
        expect(instance).to.have.property('bark');
        // expect(instance.bark).to.be(expectedValueLiteral);
      });

      it('should have the property breed (base name: "breed")', function() {
        // TODO: update the code to test the property breed
        expect(instance).to.have.property('breed');
        // expect(instance.breed).to.be(expectedValueLiteral);
      });

    });
  });

}));
