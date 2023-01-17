/**
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

import ApiClient from './ApiClient';
import AllOfSubCategoryCategory from './model/AllOfSubCategoryCategory';
import AllOfSubCategoryPetsItems from './model/AllOfSubCategoryPetsItems';
import AllPetsResponse from './model/AllPetsResponse';
import AnyOfparrotBodyParrotsItems from './model/AnyOfparrotBodyParrotsItems';
import ApiResponse from './model/ApiResponse';
import Cat from './model/Cat';
import Category from './model/Category';
import Dog from './model/Dog';
import InlineResponse200 from './model/InlineResponse200';
import InlineResponse2001 from './model/InlineResponse2001';
import Macaw from './model/Macaw';
import NullableEnumModel from './model/NullableEnumModel';
import OneOfAllPetsResponseItems from './model/OneOfAllPetsResponseItems';
import OneOfPartMasterDestination from './model/OneOfPartMasterDestination';
import OneOfPartMasterOrigin from './model/OneOfPartMasterOrigin';
import OneOfPetPartItems from './model/OneOfPetPartItems';
import OneOfPup from './model/OneOfPup';
import OneOfinlineResponse200ParrotsItems from './model/OneOfinlineResponse200ParrotsItems';
import OneOfvalMembersValMemberItems from './model/OneOfvalMembersValMemberItems';
import Order from './model/Order';
import Parakeet from './model/Parakeet';
import ParrotBody from './model/ParrotBody';
import ParrotBody1 from './model/ParrotBody1';
import PartFour from './model/PartFour';
import PartMaster from './model/PartMaster';
import PartOne from './model/PartOne';
import PartThree from './model/PartThree';
import PartTwo from './model/PartTwo';
import Pet from './model/Pet';
import PetPetIdBody from './model/PetPetIdBody';
import Pup from './model/Pup';
import SubCategory from './model/SubCategory';
import Tag from './model/Tag';
import Test from './model/Test';
import User from './model/User';
import ValMemberChoice1 from './model/ValMemberChoice1';
import ValMemberChoice2 from './model/ValMemberChoice2';
import ValMembers from './model/ValMembers';
import DefaultApi from './api/DefaultApi';
import PetApi from './api/PetApi';
import StoreApi from './api/StoreApi';
import UserApi from './api/UserApi';

/**
* This_is_a_sample_Petstore_server___You_can_findout_more_about_Swagger_at_httpswagger_io_httpswagger_io_or_on_irc_freenode_net_swagger_httpswagger_ioirc_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var SwaggerPetstore = require('index'); // See note below*.
* var xxxSvc = new SwaggerPetstore.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new SwaggerPetstore.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new SwaggerPetstore.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new SwaggerPetstore.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0.0
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The AllOfSubCategoryCategory model constructor.
     * @property {module:model/AllOfSubCategoryCategory}
     */
    AllOfSubCategoryCategory,

    /**
     * The AllOfSubCategoryPetsItems model constructor.
     * @property {module:model/AllOfSubCategoryPetsItems}
     */
    AllOfSubCategoryPetsItems,

    /**
     * The AllPetsResponse model constructor.
     * @property {module:model/AllPetsResponse}
     */
    AllPetsResponse,

    /**
     * The AnyOfparrotBodyParrotsItems model constructor.
     * @property {module:model/AnyOfparrotBodyParrotsItems}
     */
    AnyOfparrotBodyParrotsItems,

    /**
     * The ApiResponse model constructor.
     * @property {module:model/ApiResponse}
     */
    ApiResponse,

    /**
     * The Cat model constructor.
     * @property {module:model/Cat}
     */
    Cat,

    /**
     * The Category model constructor.
     * @property {module:model/Category}
     */
    Category,

    /**
     * The Dog model constructor.
     * @property {module:model/Dog}
     */
    Dog,

    /**
     * The InlineResponse200 model constructor.
     * @property {module:model/InlineResponse200}
     */
    InlineResponse200,

    /**
     * The InlineResponse2001 model constructor.
     * @property {module:model/InlineResponse2001}
     */
    InlineResponse2001,

    /**
     * The Macaw model constructor.
     * @property {module:model/Macaw}
     */
    Macaw,

    /**
     * The NullableEnumModel model constructor.
     * @property {module:model/NullableEnumModel}
     */
    NullableEnumModel,

    /**
     * The OneOfAllPetsResponseItems model constructor.
     * @property {module:model/OneOfAllPetsResponseItems}
     */
    OneOfAllPetsResponseItems,

    /**
     * The OneOfPartMasterDestination model constructor.
     * @property {module:model/OneOfPartMasterDestination}
     */
    OneOfPartMasterDestination,

    /**
     * The OneOfPartMasterOrigin model constructor.
     * @property {module:model/OneOfPartMasterOrigin}
     */
    OneOfPartMasterOrigin,

    /**
     * The OneOfPetPartItems model constructor.
     * @property {module:model/OneOfPetPartItems}
     */
    OneOfPetPartItems,

    /**
     * The OneOfPup model constructor.
     * @property {module:model/OneOfPup}
     */
    OneOfPup,

    /**
     * The OneOfinlineResponse200ParrotsItems model constructor.
     * @property {module:model/OneOfinlineResponse200ParrotsItems}
     */
    OneOfinlineResponse200ParrotsItems,

    /**
     * The OneOfvalMembersValMemberItems model constructor.
     * @property {module:model/OneOfvalMembersValMemberItems}
     */
    OneOfvalMembersValMemberItems,

    /**
     * The Order model constructor.
     * @property {module:model/Order}
     */
    Order,

    /**
     * The Parakeet model constructor.
     * @property {module:model/Parakeet}
     */
    Parakeet,

    /**
     * The ParrotBody model constructor.
     * @property {module:model/ParrotBody}
     */
    ParrotBody,

    /**
     * The ParrotBody1 model constructor.
     * @property {module:model/ParrotBody1}
     */
    ParrotBody1,

    /**
     * The PartFour model constructor.
     * @property {module:model/PartFour}
     */
    PartFour,

    /**
     * The PartMaster model constructor.
     * @property {module:model/PartMaster}
     */
    PartMaster,

    /**
     * The PartOne model constructor.
     * @property {module:model/PartOne}
     */
    PartOne,

    /**
     * The PartThree model constructor.
     * @property {module:model/PartThree}
     */
    PartThree,

    /**
     * The PartTwo model constructor.
     * @property {module:model/PartTwo}
     */
    PartTwo,

    /**
     * The Pet model constructor.
     * @property {module:model/Pet}
     */
    Pet,

    /**
     * The PetPetIdBody model constructor.
     * @property {module:model/PetPetIdBody}
     */
    PetPetIdBody,

    /**
     * The Pup model constructor.
     * @property {module:model/Pup}
     */
    Pup,

    /**
     * The SubCategory model constructor.
     * @property {module:model/SubCategory}
     */
    SubCategory,

    /**
     * The Tag model constructor.
     * @property {module:model/Tag}
     */
    Tag,

    /**
     * The Test model constructor.
     * @property {module:model/Test}
     */
    Test,

    /**
     * The User model constructor.
     * @property {module:model/User}
     */
    User,

    /**
     * The ValMemberChoice1 model constructor.
     * @property {module:model/ValMemberChoice1}
     */
    ValMemberChoice1,

    /**
     * The ValMemberChoice2 model constructor.
     * @property {module:model/ValMemberChoice2}
     */
    ValMemberChoice2,

    /**
     * The ValMembers model constructor.
     * @property {module:model/ValMembers}
     */
    ValMembers,

    /**
    * The DefaultApi service constructor.
    * @property {module:api/DefaultApi}
    */
    DefaultApi,

    /**
    * The PetApi service constructor.
    * @property {module:api/PetApi}
    */
    PetApi,

    /**
    * The StoreApi service constructor.
    * @property {module:api/StoreApi}
    */
    StoreApi,

    /**
    * The UserApi service constructor.
    * @property {module:api/UserApi}
    */
    UserApi
};
