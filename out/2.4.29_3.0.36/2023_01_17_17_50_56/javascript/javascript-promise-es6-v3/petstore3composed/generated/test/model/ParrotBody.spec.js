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
    describe('ParrotBody', function() {
      beforeEach(function() {
        instance = new SwaggerPetstore.ParrotBody();
      });

      it('should create an instance of ParrotBody', function() {
        // TODO: update the code to test ParrotBody
        expect(instance).to.be.a(SwaggerPetstore.ParrotBody);
      });

      it('should have the property parrots (base name: "parrots")', function() {
        // TODO: update the code to test the property parrots
        expect(instance).to.have.property('parrots');
        // expect(instance.parrots).to.be(expectedValueLiteral);
      });

    });
  });

}));
