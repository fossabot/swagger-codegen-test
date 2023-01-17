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
    public partial class MixedPropertiesAndAdditionalPropertiesClass : IEquatable<MixedPropertiesAndAdditionalPropertiesClass>
    { 
        /// <summary>
        /// Gets or Sets Uuid
        /// </summary>

        [DataMember(Name="uuid")]
        public Guid? Uuid { get; set; }

        /// <summary>
        /// Gets or Sets DateTime
        /// </summary>

        [DataMember(Name="dateTime")]
        public DateTime? DateTime { get; set; }

        /// <summary>
        /// Gets or Sets Map
        /// </summary>

        [DataMember(Name="map")]
        public Dictionary<string, Animal> Map { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class MixedPropertiesAndAdditionalPropertiesClass {\n");
            sb.Append("  Uuid: ").Append(Uuid).Append("\n");
            sb.Append("  DateTime: ").Append(DateTime).Append("\n");
            sb.Append("  Map: ").Append(Map).Append("\n");
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
            return obj.GetType() == GetType() && Equals((MixedPropertiesAndAdditionalPropertiesClass)obj);
        }

        /// <summary>
        /// Returns true if MixedPropertiesAndAdditionalPropertiesClass instances are equal
        /// </summary>
        /// <param name="other">Instance of MixedPropertiesAndAdditionalPropertiesClass to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(MixedPropertiesAndAdditionalPropertiesClass other)
        {
            if (ReferenceEquals(null, other)) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Uuid == other.Uuid ||
                    Uuid != null &&
                    Uuid.Equals(other.Uuid)
                ) && 
                (
                    DateTime == other.DateTime ||
                    DateTime != null &&
                    DateTime.Equals(other.DateTime)
                ) && 
                (
                    Map == other.Map ||
                    Map != null &&
                    Map.SequenceEqual(other.Map)
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
                    if (Uuid != null)
                    hashCode = hashCode * 59 + Uuid.GetHashCode();
                    if (DateTime != null)
                    hashCode = hashCode * 59 + DateTime.GetHashCode();
                    if (Map != null)
                    hashCode = hashCode * 59 + Map.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(MixedPropertiesAndAdditionalPropertiesClass left, MixedPropertiesAndAdditionalPropertiesClass right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(MixedPropertiesAndAdditionalPropertiesClass left, MixedPropertiesAndAdditionalPropertiesClass right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
