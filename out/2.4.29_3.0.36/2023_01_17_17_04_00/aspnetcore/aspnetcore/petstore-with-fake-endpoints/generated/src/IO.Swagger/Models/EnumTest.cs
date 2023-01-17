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
    /// 
    /// </summary>
    [DataContract]
    public partial class EnumTest : IEquatable<EnumTest>
    { 
        /// <summary>
        /// Gets or Sets EnumString
        /// </summary>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EnumStringEnum
        {
            
            /// <summary>
            /// Enum UPPEREnum for UPPER
            /// </summary>
            [EnumMember(Value = "UPPER")]
            UPPEREnum = 1,
            
            /// <summary>
            /// Enum LowerEnum for lower
            /// </summary>
            [EnumMember(Value = "lower")]
            LowerEnum = 2,
            
            /// <summary>
            /// Enum Empty for 
            /// </summary>
            [EnumMember(Value = "")]
            Empty = 3
        }

        /// <summary>
        /// Gets or Sets EnumString
        /// </summary>

        [DataMember(Name="enum_string")]
        public EnumStringEnum? EnumString { get; set; }

        /// <summary>
        /// Gets or Sets EnumStringRequired
        /// </summary>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EnumStringRequiredEnum
        {
            
            /// <summary>
            /// Enum UPPEREnum for UPPER
            /// </summary>
            [EnumMember(Value = "UPPER")]
            UPPEREnum = 1,
            
            /// <summary>
            /// Enum LowerEnum for lower
            /// </summary>
            [EnumMember(Value = "lower")]
            LowerEnum = 2,
            
            /// <summary>
            /// Enum Empty for 
            /// </summary>
            [EnumMember(Value = "")]
            Empty = 3
        }

        /// <summary>
        /// Gets or Sets EnumStringRequired
        /// </summary>
        [Required]
        
        [DataMember(Name="enum_string_required")]
        public EnumStringRequiredEnum? EnumStringRequired { get; set; }

        /// <summary>
        /// Gets or Sets EnumInteger
        /// </summary>
        
        public enum EnumIntegerEnum
        {
            
            /// <summary>
            /// Enum _1Enum for 1
            /// </summary>
            
            _1Enum = 1,
            
            /// <summary>
            /// Enum _1Enum_2 for -1
            /// </summary>
            
            _1Enum_2 = -1
        }

        /// <summary>
        /// Gets or Sets EnumInteger
        /// </summary>

        [DataMember(Name="enum_integer")]
        public EnumIntegerEnum? EnumInteger { get; set; }

        /// <summary>
        /// Gets or Sets EnumNumber
        /// </summary>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EnumNumberEnum
        {
            
            /// <summary>
            /// Enum _11Enum for 1.1
            /// </summary>
            [EnumMember(Value = "1.1")]
            _11Enum = 1,
            
            /// <summary>
            /// Enum _12Enum for -1.2
            /// </summary>
            [EnumMember(Value = "-1.2")]
            _12Enum = 2
        }

        /// <summary>
        /// Gets or Sets EnumNumber
        /// </summary>

        [DataMember(Name="enum_number")]
        public EnumNumberEnum? EnumNumber { get; set; }

        /// <summary>
        /// Gets or Sets OuterEnum
        /// </summary>

        [DataMember(Name="outerEnum")]
        public OuterEnum? OuterEnum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EnumTest {\n");
            sb.Append("  EnumString: ").Append(EnumString).Append("\n");
            sb.Append("  EnumStringRequired: ").Append(EnumStringRequired).Append("\n");
            sb.Append("  EnumInteger: ").Append(EnumInteger).Append("\n");
            sb.Append("  EnumNumber: ").Append(EnumNumber).Append("\n");
            sb.Append("  OuterEnum: ").Append(OuterEnum).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (ReferenceEquals(null, obj)) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((EnumTest)obj);
        }

        /// <summary>
        /// Returns true if EnumTest instances are equal
        /// </summary>
        /// <param name="other">Instance of EnumTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EnumTest other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    EnumString == other.EnumString ||
                    EnumString != null &&
                    EnumString.Equals(other.EnumString)
                ) && 
                (
                    EnumStringRequired == other.EnumStringRequired ||
                    EnumStringRequired != null &&
                    EnumStringRequired.Equals(other.EnumStringRequired)
                ) && 
                (
                    EnumInteger == other.EnumInteger ||
                    EnumInteger != null &&
                    EnumInteger.Equals(other.EnumInteger)
                ) && 
                (
                    EnumNumber == other.EnumNumber ||
                    EnumNumber != null &&
                    EnumNumber.Equals(other.EnumNumber)
                ) && 
                (
                    OuterEnum == other.OuterEnum ||
                    OuterEnum != null &&
                    OuterEnum.Equals(other.OuterEnum)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (EnumString != null)
                    hashCode = hashCode * 59 + EnumString.GetHashCode();
                    if (EnumStringRequired != null)
                    hashCode = hashCode * 59 + EnumStringRequired.GetHashCode();
                    if (EnumInteger != null)
                    hashCode = hashCode * 59 + EnumInteger.GetHashCode();
                    if (EnumNumber != null)
                    hashCode = hashCode * 59 + EnumNumber.GetHashCode();
                    if (OuterEnum != null)
                    hashCode = hashCode * 59 + OuterEnum.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(EnumTest left, EnumTest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(EnumTest left, EnumTest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
