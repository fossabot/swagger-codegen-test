part of swagger.api;



class UserApi {
  final ApiClient apiClient;

  UserApi([ApiClient apiClient]) : apiClient = apiClient ?? defaultApiClient;

  /// Create user
  ///
  /// This can only be done by the logged in user.
  Future<User> createUser({ User body }) async {
    Object postBody = body;

    // verify required params are set

    // create path and map variables
    String path = "/user".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json","application/xml","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (id != null) {
        hasFields = true;
        mp.fields['id'] = parameterToString(id);
      }
      if (username != null) {
        hasFields = true;
        mp.fields['username'] = parameterToString(username);
      }
      if (firstName != null) {
        hasFields = true;
        mp.fields['firstName'] = parameterToString(firstName);
      }
      if (lastName != null) {
        hasFields = true;
        mp.fields['lastName'] = parameterToString(lastName);
      }
      if (email != null) {
        hasFields = true;
        mp.fields['email'] = parameterToString(email);
      }
      if (password != null) {
        hasFields = true;
        mp.fields['password'] = parameterToString(password);
      }
      if (phone != null) {
        hasFields = true;
        mp.fields['phone'] = parameterToString(phone);
      }
      if (userStatus != null) {
        hasFields = true;
        mp.fields['userStatus'] = parameterToString(userStatus);
      }
      if(hasFields)
        postBody = mp;
    }
    else {
      if (id != null)
        formParams['id'] = parameterToString(id);
if (username != null)
        formParams['username'] = parameterToString(username);
if (firstName != null)
        formParams['firstName'] = parameterToString(firstName);
if (lastName != null)
        formParams['lastName'] = parameterToString(lastName);
if (email != null)
        formParams['email'] = parameterToString(email);
if (password != null)
        formParams['password'] = parameterToString(password);
if (phone != null)
        formParams['phone'] = parameterToString(phone);
if (userStatus != null)
        formParams['userStatus'] = parameterToString(userStatus);
    }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          apiClient.deserialize(response.body, 'User') as User ;
    } else {
      return null;
    }
  }
  /// Creates list of users with given input array
  ///
  /// Creates list of users with given input array
  Future<User> createUsersWithListInput({ List<User> body }) async {
    Object postBody = body;

    // verify required params are set

    // create path and map variables
    String path = "/user/createWithList".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'POST',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          apiClient.deserialize(response.body, 'User') as User ;
    } else {
      return null;
    }
  }
  /// Delete user
  ///
  /// This can only be done by the logged in user.
  Future deleteUser(String username) async {
    Object postBody = null;

    // verify required params are set
    if(username == null) {
     throw new ApiException(400, "Missing required param: username");
    }

    // create path and map variables
    String path = "/user/{username}".replaceAll("{format}","json").replaceAll("{" + "username" + "}", username.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'DELETE',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          ;
    } else {
      return ;
    }
  }
  /// Get user by user name
  ///
  /// 
  Future<User> getUserByName(String username) async {
    Object postBody = null;

    // verify required params are set
    if(username == null) {
     throw new ApiException(400, "Missing required param: username");
    }

    // create path and map variables
    String path = "/user/{username}".replaceAll("{format}","json").replaceAll("{" + "username" + "}", username.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          apiClient.deserialize(response.body, 'User') as User ;
    } else {
      return null;
    }
  }
  /// Logs user into the system
  ///
  /// 
  Future<String> loginUser({ String username, String password }) async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/user/login".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    if(username != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "username", username));
    }
    if(password != null) {
      queryParams.addAll(_convertParametersForCollectionFormat("", "password", password));
    }
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          apiClient.deserialize(response.body, 'String') as String ;
    } else {
      return null;
    }
  }
  /// Logs out current logged in user session
  ///
  /// 
  Future logoutUser() async {
    Object postBody = null;

    // verify required params are set

    // create path and map variables
    String path = "/user/logout".replaceAll("{format}","json");

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = [];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if(hasFields)
        postBody = mp;
    }
    else {
          }

    var response = await apiClient.invokeAPI(path,
                                             'GET',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          ;
    } else {
      return ;
    }
  }
  /// Update user
  ///
  /// This can only be done by the logged in user.
  Future updateUser(String username, { User body }) async {
    Object postBody = body;

    // verify required params are set
    if(username == null) {
     throw new ApiException(400, "Missing required param: username");
    }

    // create path and map variables
    String path = "/user/{username}".replaceAll("{format}","json").replaceAll("{" + "username" + "}", username.toString());

    // query params
    List<QueryParam> queryParams = [];
    Map<String, String> headerParams = {};
    Map<String, String> formParams = {};
    
    List<String> contentTypes = ["application/json","application/xml","application/x-www-form-urlencoded"];

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";
    List<String> authNames = [];

    if(contentType.startsWith("multipart/form-data")) {
      bool hasFields = false;
      MultipartRequest mp = new MultipartRequest(null, null);
      if (id != null) {
        hasFields = true;
        mp.fields['id'] = parameterToString(id);
      }
      if (username != null) {
        hasFields = true;
        mp.fields['username'] = parameterToString(username);
      }
      if (firstName != null) {
        hasFields = true;
        mp.fields['firstName'] = parameterToString(firstName);
      }
      if (lastName != null) {
        hasFields = true;
        mp.fields['lastName'] = parameterToString(lastName);
      }
      if (email != null) {
        hasFields = true;
        mp.fields['email'] = parameterToString(email);
      }
      if (password != null) {
        hasFields = true;
        mp.fields['password'] = parameterToString(password);
      }
      if (phone != null) {
        hasFields = true;
        mp.fields['phone'] = parameterToString(phone);
      }
      if (userStatus != null) {
        hasFields = true;
        mp.fields['userStatus'] = parameterToString(userStatus);
      }
      if(hasFields)
        postBody = mp;
    }
    else {
      if (id != null)
        formParams['id'] = parameterToString(id);
if (username != null)
        formParams['username'] = parameterToString(username);
if (firstName != null)
        formParams['firstName'] = parameterToString(firstName);
if (lastName != null)
        formParams['lastName'] = parameterToString(lastName);
if (email != null)
        formParams['email'] = parameterToString(email);
if (password != null)
        formParams['password'] = parameterToString(password);
if (phone != null)
        formParams['phone'] = parameterToString(phone);
if (userStatus != null)
        formParams['userStatus'] = parameterToString(userStatus);
    }

    var response = await apiClient.invokeAPI(path,
                                             'PUT',
                                             queryParams,
                                             postBody,
                                             headerParams,
                                             formParams,
                                             contentType,
                                             authNames);

    if(response.statusCode >= 400) {
      throw new ApiException(response.statusCode, response.body);
    } else if(response.body != null) {
      return
          ;
    } else {
      return ;
    }
  }
}
