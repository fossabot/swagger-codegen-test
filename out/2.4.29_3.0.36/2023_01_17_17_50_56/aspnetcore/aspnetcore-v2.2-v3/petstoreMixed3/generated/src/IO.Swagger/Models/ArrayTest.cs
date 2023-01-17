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
    public partial class ArrayTest : IEquatable<ArrayTest>
    { 
        /// <summary>
        /// Gets or Sets ArrayOfString
        /// </summary>

        [DataMember(Name="array_of_string")]
        public List<string> ArrayOfString { get; set; }

        /// <summary>
        /// Gets or Sets ArrayArrayOfInteger
        /// </summary>

        [DataMember(Name="array_array_of_integer")]
        public List<List<long?>> ArrayArrayOfInteger { get; set; }

        /// <summary>
        /// Gets or Sets ArrayArrayOfModel
        /// </summary>

        [DataMember(Name="array_array_of_model")]
        public List<List<ReadOnlyFirst>> ArrayArrayOfModel { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ArrayTest {\n");
            sb.Append("  ArrayOfString: ").Append(ArrayOfString).Append("\n");
            sb.Append("  ArrayArrayOfInteger: ").Append(ArrayArrayOfInteger).Append("\n");
            sb.Append("  ArrayArrayOfModel: ").Append(ArrayArrayOfModel).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ArrayTest)obj);
        }

        /// <summary>
        /// Returns true if ArrayTest instances are equal
        /// </summary>
        /// <param name="other">Instance of ArrayTest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ArrayTest other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ArrayOfString == other.ArrayOfString ||
                    ArrayOfString != null &&
                    ArrayOfString.SequenceEqual(other.ArrayOfString)
                ) && 
                (
                    ArrayArrayOfInteger == other.ArrayArrayOfInteger ||
                    ArrayArrayOfInteger != null &&
                    ArrayArrayOfInteger.SequenceEqual(other.ArrayArrayOfInteger)
                ) && 
                (
                    ArrayArrayOfModel == other.ArrayArrayOfModel ||
                    ArrayArrayOfModel != null &&
                    ArrayArrayOfModel.SequenceEqual(other.ArrayArrayOfModel)
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
                    if (ArrayOfString != null)
                    hashCode = hashCode * 59 + ArrayOfString.GetHashCode();
                    if (ArrayArrayOfInteger != null)
                    hashCode = hashCode * 59 + ArrayArrayOfInteger.GetHashCode();
                    if (ArrayArrayOfModel != null)
                    hashCode = hashCode * 59 + ArrayArrayOfModel.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ArrayTest left, ArrayTest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ArrayTest left, ArrayTest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
