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
 * OrderSearchRequestServicerequestRequestpreamble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class OrderSearchRequestServicerequestRequestpreamble {
  public static final String SERIALIZED_NAME_ISO_COUNTRY_CODE = "isoCountryCode";
  @SerializedName(SERIALIZED_NAME_ISO_COUNTRY_CODE)
  private String isoCountryCode;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private String customerNumber;

  public OrderSearchRequestServicerequestRequestpreamble() {
  }

  public OrderSearchRequestServicerequestRequestpreamble isoCountryCode(String isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
    return this;
  }

   /**
   * Get isoCountryCode
   * @return isoCountryCode
  **/
  @javax.annotation.Nonnull
  public String getIsoCountryCode() {
    return isoCountryCode;
  }

  public void setIsoCountryCode(String isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
  }


  public OrderSearchRequestServicerequestRequestpreamble customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Get customerNumber
   * @return customerNumber
  **/
  @javax.annotation.Nonnull
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSearchRequestServicerequestRequestpreamble orderSearchRequestServicerequestRequestpreamble = (OrderSearchRequestServicerequestRequestpreamble) o;
    return Objects.equals(this.isoCountryCode, orderSearchRequestServicerequestRequestpreamble.isoCountryCode) &&
        Objects.equals(this.customerNumber, orderSearchRequestServicerequestRequestpreamble.customerNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCountryCode, customerNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchRequestServicerequestRequestpreamble {\n");
    sb.append("    isoCountryCode: ").append(toIndentedString(isoCountryCode)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
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
    openapiFields.add("isoCountryCode");
    openapiFields.add("customerNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("isoCountryCode");
    openapiRequiredFields.add("customerNumber");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchRequestServicerequestRequestpreamble
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchRequestServicerequestRequestpreamble.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchRequestServicerequestRequestpreamble is not found in the empty JSON string", OrderSearchRequestServicerequestRequestpreamble.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchRequestServicerequestRequestpreamble.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchRequestServicerequestRequestpreamble` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderSearchRequestServicerequestRequestpreamble.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("isoCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isoCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isoCountryCode").toString()));
      }
      if (!jsonObj.get("customerNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchRequestServicerequestRequestpreamble.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchRequestServicerequestRequestpreamble' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchRequestServicerequestRequestpreamble> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchRequestServicerequestRequestpreamble.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchRequestServicerequestRequestpreamble>() {
           @Override
           public void write(JsonWriter out, OrderSearchRequestServicerequestRequestpreamble value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchRequestServicerequestRequestpreamble read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchRequestServicerequestRequestpreamble given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchRequestServicerequestRequestpreamble
  * @throws IOException if the JSON string is invalid with respect to OrderSearchRequestServicerequestRequestpreamble
  */
  public static OrderSearchRequestServicerequestRequestpreamble fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchRequestServicerequestRequestpreamble.class);
  }

 /**
  * Convert an instance of OrderSearchRequestServicerequestRequestpreamble to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

