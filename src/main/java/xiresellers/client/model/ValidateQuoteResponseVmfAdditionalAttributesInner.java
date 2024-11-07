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
 * ValidateQuoteResponseVmfAdditionalAttributesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:47:59.759396Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ValidateQuoteResponseVmfAdditionalAttributesInner {
  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "attributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_ATTRIBUTE_VALUE = "attributeValue";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_VALUE)
  private String attributeValue;

  public static final String SERIALIZED_NAME_ATTRIBUTE_DESCRIPTION = "attributeDescription";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_DESCRIPTION)
  private String attributeDescription;

  public ValidateQuoteResponseVmfAdditionalAttributesInner() {
  }

  public ValidateQuoteResponseVmfAdditionalAttributesInner attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * The name of the header level field.
   * @return attributeName
   */
  @javax.annotation.Nullable
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  public ValidateQuoteResponseVmfAdditionalAttributesInner attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * The value of the header level field.
   * @return attributeValue
   */
  @javax.annotation.Nullable
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }


  public ValidateQuoteResponseVmfAdditionalAttributesInner attributeDescription(String attributeDescription) {
    this.attributeDescription = attributeDescription;
    return this;
  }

  /**
   * The description of the header level field.
   * @return attributeDescription
   */
  @javax.annotation.Nullable
  public String getAttributeDescription() {
    return attributeDescription;
  }

  public void setAttributeDescription(String attributeDescription) {
    this.attributeDescription = attributeDescription;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateQuoteResponseVmfAdditionalAttributesInner validateQuoteResponseVmfAdditionalAttributesInner = (ValidateQuoteResponseVmfAdditionalAttributesInner) o;
    return Objects.equals(this.attributeName, validateQuoteResponseVmfAdditionalAttributesInner.attributeName) &&
        Objects.equals(this.attributeValue, validateQuoteResponseVmfAdditionalAttributesInner.attributeValue) &&
        Objects.equals(this.attributeDescription, validateQuoteResponseVmfAdditionalAttributesInner.attributeDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValue, attributeDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateQuoteResponseVmfAdditionalAttributesInner {\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
    sb.append("    attributeDescription: ").append(toIndentedString(attributeDescription)).append("\n");
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
    openapiFields.add("attributeName");
    openapiFields.add("attributeValue");
    openapiFields.add("attributeDescription");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ValidateQuoteResponseVmfAdditionalAttributesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValidateQuoteResponseVmfAdditionalAttributesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidateQuoteResponseVmfAdditionalAttributesInner is not found in the empty JSON string", ValidateQuoteResponseVmfAdditionalAttributesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValidateQuoteResponseVmfAdditionalAttributesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidateQuoteResponseVmfAdditionalAttributesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attributeName") != null && !jsonObj.get("attributeName").isJsonNull()) && !jsonObj.get("attributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeName").toString()));
      }
      if ((jsonObj.get("attributeValue") != null && !jsonObj.get("attributeValue").isJsonNull()) && !jsonObj.get("attributeValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeValue").toString()));
      }
      if ((jsonObj.get("attributeDescription") != null && !jsonObj.get("attributeDescription").isJsonNull()) && !jsonObj.get("attributeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidateQuoteResponseVmfAdditionalAttributesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidateQuoteResponseVmfAdditionalAttributesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidateQuoteResponseVmfAdditionalAttributesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidateQuoteResponseVmfAdditionalAttributesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidateQuoteResponseVmfAdditionalAttributesInner>() {
           @Override
           public void write(JsonWriter out, ValidateQuoteResponseVmfAdditionalAttributesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidateQuoteResponseVmfAdditionalAttributesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ValidateQuoteResponseVmfAdditionalAttributesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValidateQuoteResponseVmfAdditionalAttributesInner
   * @throws IOException if the JSON string is invalid with respect to ValidateQuoteResponseVmfAdditionalAttributesInner
   */
  public static ValidateQuoteResponseVmfAdditionalAttributesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidateQuoteResponseVmfAdditionalAttributesInner.class);
  }

  /**
   * Convert an instance of ValidateQuoteResponseVmfAdditionalAttributesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

