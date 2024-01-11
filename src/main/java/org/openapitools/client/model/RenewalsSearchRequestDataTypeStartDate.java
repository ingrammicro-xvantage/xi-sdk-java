/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * RenewalsSearchRequestDataTypeStartDate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class RenewalsSearchRequestDataTypeStartDate {
  public static final String SERIALIZED_NAME_CUSTOM_START_DATE = "customStartDate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_START_DATE)
  private String customStartDate;

  public static final String SERIALIZED_NAME_CUSTOM_END_DATE = "customEndDate";
  @SerializedName(SERIALIZED_NAME_CUSTOM_END_DATE)
  private String customEndDate;

  public RenewalsSearchRequestDataTypeStartDate() {
  }

  public RenewalsSearchRequestDataTypeStartDate customStartDate(String customStartDate) {
    this.customStartDate = customStartDate;
    return this;
  }

   /**
   * Custom from date for Renewal Start date.
   * @return customStartDate
  **/
  @javax.annotation.Nullable
  public String getCustomStartDate() {
    return customStartDate;
  }

  public void setCustomStartDate(String customStartDate) {
    this.customStartDate = customStartDate;
  }


  public RenewalsSearchRequestDataTypeStartDate customEndDate(String customEndDate) {
    this.customEndDate = customEndDate;
    return this;
  }

   /**
   * Custom to date for Renewal Start date.
   * @return customEndDate
  **/
  @javax.annotation.Nullable
  public String getCustomEndDate() {
    return customEndDate;
  }

  public void setCustomEndDate(String customEndDate) {
    this.customEndDate = customEndDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsSearchRequestDataTypeStartDate renewalsSearchRequestDataTypeStartDate = (RenewalsSearchRequestDataTypeStartDate) o;
    return Objects.equals(this.customStartDate, renewalsSearchRequestDataTypeStartDate.customStartDate) &&
        Objects.equals(this.customEndDate, renewalsSearchRequestDataTypeStartDate.customEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customStartDate, customEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsSearchRequestDataTypeStartDate {\n");
    sb.append("    customStartDate: ").append(toIndentedString(customStartDate)).append("\n");
    sb.append("    customEndDate: ").append(toIndentedString(customEndDate)).append("\n");
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
    openapiFields.add("customStartDate");
    openapiFields.add("customEndDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RenewalsSearchRequestDataTypeStartDate
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsSearchRequestDataTypeStartDate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsSearchRequestDataTypeStartDate is not found in the empty JSON string", RenewalsSearchRequestDataTypeStartDate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsSearchRequestDataTypeStartDate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsSearchRequestDataTypeStartDate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customStartDate") != null && !jsonObj.get("customStartDate").isJsonNull()) && !jsonObj.get("customStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customStartDate").toString()));
      }
      if ((jsonObj.get("customEndDate") != null && !jsonObj.get("customEndDate").isJsonNull()) && !jsonObj.get("customEndDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customEndDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customEndDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsSearchRequestDataTypeStartDate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsSearchRequestDataTypeStartDate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsSearchRequestDataTypeStartDate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsSearchRequestDataTypeStartDate.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsSearchRequestDataTypeStartDate>() {
           @Override
           public void write(JsonWriter out, RenewalsSearchRequestDataTypeStartDate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsSearchRequestDataTypeStartDate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RenewalsSearchRequestDataTypeStartDate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RenewalsSearchRequestDataTypeStartDate
  * @throws IOException if the JSON string is invalid with respect to RenewalsSearchRequestDataTypeStartDate
  */
  public static RenewalsSearchRequestDataTypeStartDate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsSearchRequestDataTypeStartDate.class);
  }

 /**
  * Convert an instance of RenewalsSearchRequestDataTypeStartDate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

