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
import {ApiClient} from './ApiClient';
import {AdditionalPropertiesClass} from './model/AdditionalPropertiesClass';
import {AllOfPupPetsItems} from './model/AllOfPupPetsItems';
import {AllOfSubCategoryCategory} from './model/AllOfSubCategoryCategory';
import {AllOfSubCategoryPetsItems} from './model/AllOfSubCategoryPetsItems';
import {AllPetsResponse} from './model/AllPetsResponse';
import {Animal} from './model/Animal';
import {AnimalAnimalIdBody} from './model/AnimalAnimalIdBody';
import {AnimalFarm} from './model/AnimalFarm';
import {AnyOfparrotBodyParrotsItems} from './model/AnyOfparrotBodyParrotsItems';
import {ApiResponse} from './model/ApiResponse';
import {ArrayOfArrayOfNumberOnly} from './model/ArrayOfArrayOfNumberOnly';
import {ArrayOfNumberOnly} from './model/ArrayOfNumberOnly';
import {ArrayTest} from './model/ArrayTest';
import {Capitalization} from './model/Capitalization';
import {Cat} from './model/Cat';
import {Category} from './model/Category';
import {ClassModel} from './model/ClassModel';
import {Client} from './model/Client';
import {Dog} from './model/Dog';
import {DogDogIdBody} from './model/DogDogIdBody';
import {EnumArrays} from './model/EnumArrays';
import {EnumClass} from './model/EnumClass';
import {EnumFormBody} from './model/EnumFormBody';
import {EnumTest} from './model/EnumTest';
import {FakeBody} from './model/FakeBody';
import {FakeBody1} from './model/FakeBody1';
import {FakeJsonFormDataBody} from './model/FakeJsonFormDataBody';
import {FormatTest} from './model/FormatTest';
import {HasOnlyReadOnly} from './model/HasOnlyReadOnly';
import {InlineResponse200} from './model/InlineResponse200';
import {InlineResponse2001} from './model/InlineResponse2001';
import {List} from './model/List';
import {Macaw} from './model/Macaw';
import {MapTest} from './model/MapTest';
import {MixedPropertiesAndAdditionalPropertiesClass} from './model/MixedPropertiesAndAdditionalPropertiesClass';
import {Model200Response} from './model/Model200Response';
import {ModelReturn} from './model/ModelReturn';
import {Name} from './model/Name';
import {NullableEnumModel} from './model/NullableEnumModel';
import {NumberOnly} from './model/NumberOnly';
import {OneOfAllPetsResponseItems} from './model/OneOfAllPetsResponseItems';
import {OneOfPartMasterDestination} from './model/OneOfPartMasterDestination';
import {OneOfPartMasterOrigin} from './model/OneOfPartMasterOrigin';
import {OneOfPup} from './model/OneOfPup';
import {OneOfSinglePetResponsePet} from './model/OneOfSinglePetResponsePet';
import {OneOfinlineResponse200ParrotsItems} from './model/OneOfinlineResponse200ParrotsItems';
import {OneOfvalMembersValMemberItems} from './model/OneOfvalMembersValMemberItems';
import {Order} from './model/Order';
import {OuterBoolean} from './model/OuterBoolean';
import {OuterComposite} from './model/OuterComposite';
import {OuterEnum} from './model/OuterEnum';
import {OuterNumber} from './model/OuterNumber';
import {OuterString} from './model/OuterString';
import {Parakeet} from './model/Parakeet';
import {ParrotBody} from './model/ParrotBody';
import {ParrotBody1} from './model/ParrotBody1';
import {PartFour} from './model/PartFour';
import {PartMaster} from './model/PartMaster';
import {PartOne} from './model/PartOne';
import {PartThree} from './model/PartThree';
import {PartTwo} from './model/PartTwo';
import {Pet} from './model/Pet';
import {PetIdUploadImageBody} from './model/PetIdUploadImageBody';
import {PetPetIdBody} from './model/PetPetIdBody';
import {Pup} from './model/Pup';
import {ReadOnlyFirst} from './model/ReadOnlyFirst';
import {SinglePetResponse} from './model/SinglePetResponse';
import {SpecialModelName} from './model/SpecialModelName';
import {SubCategory} from './model/SubCategory';
import {Tag} from './model/Tag';
import {User} from './model/User';
import {UserWrapper} from './model/UserWrapper';
import {Users} from './model/Users';
import {ValMemberChoice1} from './model/ValMemberChoice1';
import {ValMemberChoice2} from './model/ValMemberChoice2';
import {ValMembers} from './model/ValMembers';
import {AnimalApi} from './api/AnimalApi';
import {AnotherFakeApi} from './api/AnotherFakeApi';
import {DogApi} from './api/DogApi';
import {FakeApi} from './api/FakeApi';
import {FakeClassnameTags123Api} from './api/FakeClassnameTags123Api';
import {MasterApi} from './api/MasterApi';
import {ParrotApi} from './api/ParrotApi';
import {PetApi} from './api/PetApi';
import {StoreApi} from './api/StoreApi';
import {UserApi} from './api/UserApi';

/**
* This_spec_is_mainly_for_testing_Petstore_server_and_contains_fake_endpoints_models__Please_do_not_use_this_for_any_other_purpose__Special_characters__.<br>
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
     * The AdditionalPropertiesClass model constructor.
     * @property {module:model/AdditionalPropertiesClass}
     */
    AdditionalPropertiesClass,

    /**
     * The AllOfPupPetsItems model constructor.
     * @property {module:model/AllOfPupPetsItems}
     */
    AllOfPupPetsItems,

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
     * The Animal model constructor.
     * @property {module:model/Animal}
     */
    Animal,

    /**
     * The AnimalAnimalIdBody model constructor.
     * @property {module:model/AnimalAnimalIdBody}
     */
    AnimalAnimalIdBody,

    /**
     * The AnimalFarm model constructor.
     * @property {module:model/AnimalFarm}
     */
    AnimalFarm,

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
     * The ArrayOfArrayOfNumberOnly model constructor.
     * @property {module:model/ArrayOfArrayOfNumberOnly}
     */
    ArrayOfArrayOfNumberOnly,

    /**
     * The ArrayOfNumberOnly model constructor.
     * @property {module:model/ArrayOfNumberOnly}
     */
    ArrayOfNumberOnly,

    /**
     * The ArrayTest model constructor.
     * @property {module:model/ArrayTest}
     */
    ArrayTest,

    /**
     * The Capitalization model constructor.
     * @property {module:model/Capitalization}
     */
    Capitalization,

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
     * The ClassModel model constructor.
     * @property {module:model/ClassModel}
     */
    ClassModel,

    /**
     * The Client model constructor.
     * @property {module:model/Client}
     */
    Client,

    /**
     * The Dog model constructor.
     * @property {module:model/Dog}
     */
    Dog,

    /**
     * The DogDogIdBody model constructor.
     * @property {module:model/DogDogIdBody}
     */
    DogDogIdBody,

    /**
     * The EnumArrays model constructor.
     * @property {module:model/EnumArrays}
     */
    EnumArrays,

    /**
     * The EnumClass model constructor.
     * @property {module:model/EnumClass}
     */
    EnumClass,

    /**
     * The EnumFormBody model constructor.
     * @property {module:model/EnumFormBody}
     */
    EnumFormBody,

    /**
     * The EnumTest model constructor.
     * @property {module:model/EnumTest}
     */
    EnumTest,

    /**
     * The FakeBody model constructor.
     * @property {module:model/FakeBody}
     */
    FakeBody,

    /**
     * The FakeBody1 model constructor.
     * @property {module:model/FakeBody1}
     */
    FakeBody1,

    /**
     * The FakeJsonFormDataBody model constructor.
     * @property {module:model/FakeJsonFormDataBody}
     */
    FakeJsonFormDataBody,

    /**
     * The FormatTest model constructor.
     * @property {module:model/FormatTest}
     */
    FormatTest,

    /**
     * The HasOnlyReadOnly model constructor.
     * @property {module:model/HasOnlyReadOnly}
     */
    HasOnlyReadOnly,

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
     * The List model constructor.
     * @property {module:model/List}
     */
    List,

    /**
     * The Macaw model constructor.
     * @property {module:model/Macaw}
     */
    Macaw,

    /**
     * The MapTest model constructor.
     * @property {module:model/MapTest}
     */
    MapTest,

    /**
     * The MixedPropertiesAndAdditionalPropertiesClass model constructor.
     * @property {module:model/MixedPropertiesAndAdditionalPropertiesClass}
     */
    MixedPropertiesAndAdditionalPropertiesClass,

    /**
     * The Model200Response model constructor.
     * @property {module:model/Model200Response}
     */
    Model200Response,

    /**
     * The ModelReturn model constructor.
     * @property {module:model/ModelReturn}
     */
    ModelReturn,

    /**
     * The Name model constructor.
     * @property {module:model/Name}
     */
    Name,

    /**
     * The NullableEnumModel model constructor.
     * @property {module:model/NullableEnumModel}
     */
    NullableEnumModel,

    /**
     * The NumberOnly model constructor.
     * @property {module:model/NumberOnly}
     */
    NumberOnly,

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
     * The OneOfPup model constructor.
     * @property {module:model/OneOfPup}
     */
    OneOfPup,

    /**
     * The OneOfSinglePetResponsePet model constructor.
     * @property {module:model/OneOfSinglePetResponsePet}
     */
    OneOfSinglePetResponsePet,

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
     * The OuterBoolean model constructor.
     * @property {module:model/OuterBoolean}
     */
    OuterBoolean,

    /**
     * The OuterComposite model constructor.
     * @property {module:model/OuterComposite}
     */
    OuterComposite,

    /**
     * The OuterEnum model constructor.
     * @property {module:model/OuterEnum}
     */
    OuterEnum,

    /**
     * The OuterNumber model constructor.
     * @property {module:model/OuterNumber}
     */
    OuterNumber,

    /**
     * The OuterString model constructor.
     * @property {module:model/OuterString}
     */
    OuterString,

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
     * The PetIdUploadImageBody model constructor.
     * @property {module:model/PetIdUploadImageBody}
     */
    PetIdUploadImageBody,

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
     * The ReadOnlyFirst model constructor.
     * @property {module:model/ReadOnlyFirst}
     */
    ReadOnlyFirst,

    /**
     * The SinglePetResponse model constructor.
     * @property {module:model/SinglePetResponse}
     */
    SinglePetResponse,

    /**
     * The SpecialModelName model constructor.
     * @property {module:model/SpecialModelName}
     */
    SpecialModelName,

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
     * The User model constructor.
     * @property {module:model/User}
     */
    User,

    /**
     * The UserWrapper model constructor.
     * @property {module:model/UserWrapper}
     */
    UserWrapper,

    /**
     * The Users model constructor.
     * @property {module:model/Users}
     */
    Users,

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
    * The AnimalApi service constructor.
    * @property {module:api/AnimalApi}
    */
    AnimalApi,

    /**
    * The AnotherFakeApi service constructor.
    * @property {module:api/AnotherFakeApi}
    */
    AnotherFakeApi,

    /**
    * The DogApi service constructor.
    * @property {module:api/DogApi}
    */
    DogApi,

    /**
    * The FakeApi service constructor.
    * @property {module:api/FakeApi}
    */
    FakeApi,

    /**
    * The FakeClassnameTags123Api service constructor.
    * @property {module:api/FakeClassnameTags123Api}
    */
    FakeClassnameTags123Api,

    /**
    * The MasterApi service constructor.
    * @property {module:api/MasterApi}
    */
    MasterApi,

    /**
    * The ParrotApi service constructor.
    * @property {module:api/ParrotApi}
    */
    ParrotApi,

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
