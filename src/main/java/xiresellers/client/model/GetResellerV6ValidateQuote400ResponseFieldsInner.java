/*
 * XI Sdk Resellers
 * For Resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
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
 * GetResellerV6ValidateQuote400ResponseFieldsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T08:16:24.530377484Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class GetResellerV6ValidateQuote400ResponseFieldsInner {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  @javax.annotation.Nullable
  private String field;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  @javax.annotation.Nullable
  private String message;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @javax.annotation.Nullable
  private String value;

  public GetResellerV6ValidateQuote400ResponseFieldsInner() {
  }

  public GetResellerV6ValidateQuote400ResponseFieldsInner field(@javax.annotation.Nullable String field) {
    this.field = field;
    return this;
  }

  /**
   * Contains the name of the field.
   * @return field
   */
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }

  public void setField(@javax.annotation.Nullable String field) {
    this.field = field;
  }


  public GetResellerV6ValidateQuote400ResponseFieldsInner message(@javax.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Gives the description of the field message.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(@javax.annotation.Nullable String message) {
    this.message = message;
  }


  public GetResellerV6ValidateQuote400ResponseFieldsInner value(@javax.annotation.Nullable String value) {
    this.value = value;
    return this;
  }

  /**
   * Value sent in the input for the specific field.
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(@javax.annotation.Nullable String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetResellerV6ValidateQuote400ResponseFieldsInner getResellerV6ValidateQuote400ResponseFieldsInner = (GetResellerV6ValidateQuote400ResponseFieldsInner) o;
    return Objects.equals(this.field, getResellerV6ValidateQuote400ResponseFieldsInner.field) &&
        Objects.equals(this.message, getResellerV6ValidateQuote400ResponseFieldsInner.message) &&
        Objects.equals(this.value, getResellerV6ValidateQuote400ResponseFieldsInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, message, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetResellerV6ValidateQuote400ResponseFieldsInner {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("message");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetResellerV6ValidateQuote400ResponseFieldsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetResellerV6ValidateQuote400ResponseFieldsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetResellerV6ValidateQuote400ResponseFieldsInner is not found in the empty JSON string", GetResellerV6ValidateQuote400ResponseFieldsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetResellerV6ValidateQuote400ResponseFieldsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetResellerV6ValidateQuote400ResponseFieldsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) && !jsonObj.get("field").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetResellerV6ValidateQuote400ResponseFieldsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetResellerV6ValidateQuote400ResponseFieldsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetResellerV6ValidateQuote400ResponseFieldsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetResellerV6ValidateQuote400ResponseFieldsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetResellerV6ValidateQuote400ResponseFieldsInner>() {
           @Override
           public void write(JsonWriter out, GetResellerV6ValidateQuote400ResponseFieldsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetResellerV6ValidateQuote400ResponseFieldsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetResellerV6ValidateQuote400ResponseFieldsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetResellerV6ValidateQuote400ResponseFieldsInner
   * @throws IOException if the JSON string is invalid with respect to GetResellerV6ValidateQuote400ResponseFieldsInner
   */
  public static GetResellerV6ValidateQuote400ResponseFieldsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetResellerV6ValidateQuote400ResponseFieldsInner.class);
  }

  /**
   * Convert an instance of GetResellerV6ValidateQuote400ResponseFieldsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

