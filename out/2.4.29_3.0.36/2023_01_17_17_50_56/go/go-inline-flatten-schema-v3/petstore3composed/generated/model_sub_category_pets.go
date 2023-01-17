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

type SubCategoryPets struct {
	Id int64 `json:"id,omitempty"`
	Name string `json:"name"`
	// pet status in the store
	Status string `json:"status,omitempty"`
	Part []PetPart `json:"part,omitempty"`
}
