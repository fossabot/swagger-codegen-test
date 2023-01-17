/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package swagger

// Business Term: Scheme Members Definition: Information about the Members of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
type ValMembers struct {
	// Business Term: Scheme Member Definition: Information about a Member of the Scheme. Purpose: To have enough information to be able to produce a Statement of Account indicating premium due.
	ValMember []OneOfvalMembersValMemberItems `json:"val_member"`
}
