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

  beforeEach(function() {
    instance = new SwaggerPetstore.PetApi();
  });

  describe('(package)', function() {
    describe('PetApi', function() {
      describe('addPet', function() {
        it('should call addPet successfully', function(done) {
          // TODO: uncomment, update parameter values for addPet call
          /*

          instance.addPet(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('deletePet', function() {
        it('should call deletePet successfully', function(done) {
          // TODO: uncomment, update parameter values for deletePet call
          /*
          var opts = {};

          instance.deletePet(petId, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('doCategoryStuff', function() {
        it('should call doCategoryStuff successfully', function(done) {
          // TODO: uncomment, update parameter values for doCategoryStuff call and complete the assertions
          /*
          var opts = {};

          instance.doCategoryStuff(opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstore.ApiResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('findPetsByStatus', function() {
        it('should call findPetsByStatus successfully', function(done) {
          // TODO: uncomment, update parameter values for findPetsByStatus call and complete the assertions
          /*

          instance.findPetsByStatus(status, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(SwaggerPetstore.Pet);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('findPetsByTags', function() {
        it('should call findPetsByTags successfully', function(done) {
          // TODO: uncomment, update parameter values for findPetsByTags call and complete the assertions
          /*

          instance.findPetsByTags(tags, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            let dataCtr = data;
            expect(dataCtr).to.be.an(Array);
            expect(dataCtr).to.not.be.empty();
            for (let p in dataCtr) {
              let data = dataCtr[p];
              expect(data).to.be.a(SwaggerPetstore.Pet);
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getAllPets', function() {
        it('should call getAllPets successfully', function(done) {
          // TODO: uncomment getAllPets call and complete the assertions
          /*

          instance.getAllPets(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstore.AllPetsResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getPetById', function() {
        it('should call getPetById successfully', function(done) {
          // TODO: uncomment, update parameter values for getPetById call and complete the assertions
          /*

          instance.getPetById(petId, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstore.Pet);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getRandomPet', function() {
        it('should call getRandomPet successfully', function(done) {
          // TODO: uncomment getRandomPet call and complete the assertions
          /*

          instance.getRandomPet(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstore.SinglePetResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('updatePet', function() {
        it('should call updatePet successfully', function(done) {
          // TODO: uncomment, update parameter values for updatePet call
          /*

          instance.updatePet(body, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('updatePetWithForm', function() {
        it('should call updatePetWithForm successfully', function(done) {
          // TODO: uncomment, update parameter values for updatePetWithForm call
          /*
          var opts = {};

          instance.updatePetWithForm(petId, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('uploadFile', function() {
        it('should call uploadFile successfully', function(done) {
          // TODO: uncomment, update parameter values for uploadFile call and complete the assertions
          /*
          var opts = {};

          instance.uploadFile(petId, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(SwaggerPetstore.ApiResponse);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
