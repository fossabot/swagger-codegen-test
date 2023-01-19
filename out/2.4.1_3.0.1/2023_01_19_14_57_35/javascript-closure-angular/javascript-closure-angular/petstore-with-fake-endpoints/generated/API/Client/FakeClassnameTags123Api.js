/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.FakeClassnameTags123Api.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \&quot; \\
 * Version: 1.0.0
 * Generated by: io.swagger.codegen.languages.JavascriptClosureAngularClientCodegen
 */
/**
 * @license Apache-2.0
 * http://www.apache.org/licenses/LICENSE-2.0.html
 */

goog.provide('API.Client.FakeClassnameTags123Api');

goog.require('API.Client.Client');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.FakeClassnameTags123Api = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('FakeClassnameTags123ApiBasePath') ?
                   /** @type {!string} */ ($injector.get('FakeClassnameTags123ApiBasePath')) :
                   'http://petstore.swagger.io:80/v2';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('FakeClassnameTags123ApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('FakeClassnameTags123ApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.FakeClassnameTags123Api.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * To test class name in snake case
 * To test class name in snake case
 * @param {!Client} body client model
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.Client>}
 */
API.Client.FakeClassnameTags123Api.prototype.testClassname = function(body, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/fake_classname_test';

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'body' is set
  if (!body) {
    throw new Error('Missing required parameter body when calling testClassname');
  }
  /** @type {!Object} */
  var httpRequestParams = {
    method: 'PATCH',
    url: path,
    json: true,
    data: body,
        params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}
