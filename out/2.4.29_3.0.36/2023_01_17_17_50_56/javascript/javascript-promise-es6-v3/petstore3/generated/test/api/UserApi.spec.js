/*
 * Swagger Petstore - OpenAPI 3.0
 * This is a sample Pet Store Server based on the OpenAPI 3.0 specification.  You can find out more about Swagger at [http://swagger.io](http://swagger.io). In the third iteration of the pet store, we've switched to the design first approach! You can now help us improve the API whether it's by making changes to the definition itself or to the code. That way, with time, we can improve the API in general, and expose some of the new features in OAS3.  Some useful links: - [The Pet Store repository](https://github.com/swagger-api/swagger-petstore) - [The source API definition for the Pet Store](https://github.com/swagger-api/swagger-petstore/blob/master/src/main/resources/openapi.yaml)
 *
 * OpenAPI spec version: 1.0.5
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
    factory(root.expect, root.SwaggerPetstoreOpenApi30);
  }
}(this, function(expect, SwaggerPetstoreOpenApi30) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SwaggerPetstoreOpenApi30.UserApi();
  });

  describe('(package)', function() {
    describe('UserApi', function() {
      describe('createUser', function() {
        it('should call createUser successfully', function(done) {
          // TODO: uncomment, update parameter values for createUser call and complete the assertions
          /*
          var opts = {};

          instance.createUser(opts).then(function(data) {
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstoreOpenApi30.User);

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('createUsersWithListInput', function() {
        it('should call createUsersWithListInput successfully', function(done) {
          // TODO: uncomment, update parameter values for createUsersWithListInput call and complete the assertions
          /*
          var opts = {};

          instance.createUsersWithListInput(opts).then(function(data) {
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstoreOpenApi30.User);

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('deleteUser', function() {
        it('should call deleteUser successfully', function(done) {
          // TODO: uncomment, update parameter values for deleteUser call
          /*

          instance.deleteUser(username).then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getUserByName', function() {
        it('should call getUserByName successfully', function(done) {
          // TODO: uncomment, update parameter values for getUserByName call and complete the assertions
          /*

          instance.getUserByName(username).then(function(data) {
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstoreOpenApi30.User);

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('loginUser', function() {
        it('should call loginUser successfully', function(done) {
          // TODO: uncomment, update parameter values for loginUser call and complete the assertions
          /*
          var opts = {};

          instance.loginUser(opts).then(function(data) {
            // TODO: update response assertions
            expect(data).to.be.a(&#x27;string&#x27;);
            // expect(data).to.be(null);

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('logoutUser', function() {
        it('should call logoutUser successfully', function(done) {
          // TODO: uncomment logoutUser call
          /*

          instance.logoutUser().then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('updateUser', function() {
        it('should call updateUser successfully', function(done) {
          // TODO: uncomment, update parameter values for updateUser call
          /*
          var opts = {};

          instance.updateUser(username, opts).then(function(data) {

            done();
          }, function(error) {
            done(error);
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
