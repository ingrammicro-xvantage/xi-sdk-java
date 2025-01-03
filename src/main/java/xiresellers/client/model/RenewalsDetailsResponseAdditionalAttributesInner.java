/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package xiresellers.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * RenewalsDetailsResponseAdditionalAttributesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T17:12:54.690986034Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class RenewalsDetailsResponseAdditionalAttributesInner {
  public static final String SERIALIZED_NAME_ATTRIBUTE_DESCRIPTION = "attributeDescription";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DESCRIPTION)
  @javax.annotation.Nullable
  private String attributeDescription;

  public static final String SERIALIZED_NAME_ATTRIBUTE_VALUE = "attributeValue";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_VALUE)
  @javax.annotation.Nullable
  private String attributeValue;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  @javax.annotation.Nullable
  private String expirationDate;

  public static final String SERIALIZED_NAME_IS_CONSOLIDATED = "isConsolidated";
  @SerializedName(SERIALIZED_NAME_IS_CONSOLIDATED)
  @javax.annotation.Nullable
  private String isConsolidated;

  public RenewalsDetailsResponseAdditionalAttributesInner() {
  }

  public RenewalsDetailsResponseAdditionalAttributesInner attributeDescription(@javax.annotation.Nullable String attributeDescription) {
    this.attributeDescription = attributeDescription;
    return this;
  }

  /**
   * The description of the additional attribute.
   * @return attributeDescription
   */
  @javax.annotation.Nullable
  public String getAttributeDescription() {
    return attributeDescription;
  }

  public void setAttributeDescription(@javax.annotation.Nullable String attributeDescription) {
    this.attributeDescription = attributeDescription;
  }


  public RenewalsDetailsResponseAdditionalAttributesInner attributeValue(@javax.annotation.Nullable String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * The value of the additional attribute.
   * @return attributeValue
   */
  @javax.annotation.Nullable
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(@javax.annotation.Nullable String attributeValue) {
    this.attributeValue = attributeValue;
  }


  public RenewalsDetailsResponseAdditionalAttributesInner startDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The attribute start date.
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }


  public RenewalsDetailsResponseAdditionalAttributesInner expirationDate(@javax.annotation.Nullable String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The attribute expiration date.
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(@javax.annotation.Nullable String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public RenewalsDetailsResponseAdditionalAttributesInner isConsolidated(@javax.annotation.Nullable String isConsolidated) {
    this.isConsolidated = isConsolidated;
    return this;
  }

  /**
   * Is the line item consolidated? Yes or No.
   * @return isConsolidated
   */
  @javax.annotation.Nullable
  public String getIsConsolidated() {
    return isConsolidated;
  }

  public void setIsConsolidated(@javax.annotation.Nullable String isConsolidated) {
    this.isConsolidated = isConsolidated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsDetailsResponseAdditionalAttributesInner renewalsDetailsResponseAdditionalAttributesInner = (RenewalsDetailsResponseAdditionalAttributesInner) o;
    return Objects.equals(this.attributeDescription, renewalsDetailsResponseAdditionalAttributesInner.attributeDescription) &&
        Objects.equals(this.attributeValue, renewalsDetailsResponseAdditionalAttributesInner.attributeValue) &&
        Objects.equals(this.startDate, renewalsDetailsResponseAdditionalAttributesInner.startDate) &&
        Objects.equals(this.expirationDate, renewalsDetailsResponseAdditionalAttributesInner.expirationDate) &&
        Objects.equals(this.isConsolidated, renewalsDetailsResponseAdditionalAttributesInner.isConsolidated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeDescription, attributeValue, startDate, expirationDate, isConsolidated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsDetailsResponseAdditionalAttributesInner {\n");
    sb.append("    attributeDescription: ").append(toIndentedString(attributeDescription)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    isConsolidated: ").append(toIndentedString(isConsolidated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("attributeDescription");
    openapiFields.add("attributeValue");
    openapiFields.add("startDate");
    openapiFields.add("expirationDate");
    openapiFields.add("isConsolidated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenewalsDetailsResponseAdditionalAttributesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsDetailsResponseAdditionalAttributesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsDetailsResponseAdditionalAttributesInner is not found in the empty JSON string", RenewalsDetailsResponseAdditionalAttributesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsDetailsResponseAdditionalAttributesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsDetailsResponseAdditionalAttributesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attributeDescription") != null && !jsonObj.get("attributeDescription").isJsonNull()) && !jsonObj.get("attributeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeDescription").toString()));
      }
      if ((jsonObj.get("attributeValue") != null && !jsonObj.get("attributeValue").isJsonNull()) && !jsonObj.get("attributeValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeValue").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) && !jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      if ((jsonObj.get("isConsolidated") != null && !jsonObj.get("isConsolidated").isJsonNull()) && !jsonObj.get("isConsolidated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isConsolidated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isConsolidated").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsDetailsResponseAdditionalAttributesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsDetailsResponseAdditionalAttributesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsDetailsResponseAdditionalAttributesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsDetailsResponseAdditionalAttributesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsDetailsResponseAdditionalAttributesInner>() {
           @Override
           public void write(JsonWriter out, RenewalsDetailsResponseAdditionalAttributesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsDetailsResponseAdditionalAttributesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenewalsDetailsResponseAdditionalAttributesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenewalsDetailsResponseAdditionalAttributesInner
   * @throws IOException if the JSON string is invalid with respect to RenewalsDetailsResponseAdditionalAttributesInner
   */
  public static RenewalsDetailsResponseAdditionalAttributesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsDetailsResponseAdditionalAttributesInner.class);
  }

  /**
   * Convert an instance of RenewalsDetailsResponseAdditionalAttributesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

