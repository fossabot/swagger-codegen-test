/*
 * Swagger Petstore
 *
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

import (
	"fmt"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/",
		Index,
	},

	Route{
		"TestMethod",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/test",
		TestMethod,
	},

	Route{
		"AddParrot",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/parrot",
		AddParrot,
	},

	Route{
		"AddPet",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet",
		AddPet,
	},

	Route{
		"DeletePet",
		strings.ToUpper("Delete"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/{petId}",
		DeletePet,
	},

	Route{
		"DoCategoryStuff",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/category",
		DoCategoryStuff,
	},

	Route{
		"FeedPet",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/feed/{petId}",
		FeedPet,
	},

	Route{
		"FindPetsByStatus",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/findByStatus",
		FindPetsByStatus,
	},

	Route{
		"FindPetsByTags",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/findByTags",
		FindPetsByTags,
	},

	Route{
		"GetParrots",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/parrot",
		GetParrots,
	},

	Route{
		"GetPetById",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/{petId}",
		GetPetById,
	},

	Route{
		"UpdateParrots",
		strings.ToUpper("Put"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/parrot",
		UpdateParrots,
	},

	Route{
		"UpdatePet",
		strings.ToUpper("Put"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet",
		UpdatePet,
	},

	Route{
		"UpdatePetWithForm",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/{petId}",
		UpdatePetWithForm,
	},

	Route{
		"UploadFile",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/pet/{petId}/uploadImage",
		UploadFile,
	},

	Route{
		"DeleteOrder",
		strings.ToUpper("Delete"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/store/order/{orderId}",
		DeleteOrder,
	},

	Route{
		"GetInventory",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/store/inventory",
		GetInventory,
	},

	Route{
		"GetOrderById",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/store/order/{orderId}",
		GetOrderById,
	},

	Route{
		"PlaceOrder",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/store/order",
		PlaceOrder,
	},

	Route{
		"CreateUser",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user",
		CreateUser,
	},

	Route{
		"CreateUsersWithArrayInput",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user/createWithArray",
		CreateUsersWithArrayInput,
	},

	Route{
		"CreateUsersWithListInput",
		strings.ToUpper("Post"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user/createWithList",
		CreateUsersWithListInput,
	},

	Route{
		"DeleteUser",
		strings.ToUpper("Delete"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user/{username}",
		DeleteUser,
	},

	Route{
		"GetUserByName",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user/{username}",
		GetUserByName,
	},

	Route{
		"LoginUser",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user/login",
		LoginUser,
	},

	Route{
		"LogoutUser",
		strings.ToUpper("Get"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user/logout",
		LogoutUser,
	},

	Route{
		"UserUsernamePut",
		strings.ToUpper("Put"),
		"/swagger-api/swagger-codegen/d7d5b9a97447f40e130e132cdf0cf7ee7c626cb8/fixtures/immutable/specifications/v3/petstore3composed.yaml/user/{username}",
		UserUsernamePut,
	},
}
