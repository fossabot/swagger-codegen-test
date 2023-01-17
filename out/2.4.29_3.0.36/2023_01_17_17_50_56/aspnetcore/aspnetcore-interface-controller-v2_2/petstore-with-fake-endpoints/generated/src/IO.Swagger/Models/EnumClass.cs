/*
 * Swagger Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Models
{ 
        /// <summary>
        /// Gets or Sets EnumClass
        /// </summary>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EnumClass
        {
            
            /// <summary>
            /// Enum AbcEnum for _abc
            /// </summary>
            [EnumMember(Value = "_abc")]
            AbcEnum = 1,
            
            /// <summary>
            /// Enum EfgEnum for -efg
            /// </summary>
            [EnumMember(Value = "-efg")]
            EfgEnum = 2,
            
            /// <summary>
            /// Enum XyzEnum for (xyz)
            /// </summary>
            [EnumMember(Value = "(xyz)")]
            XyzEnum = 3
        }
}
