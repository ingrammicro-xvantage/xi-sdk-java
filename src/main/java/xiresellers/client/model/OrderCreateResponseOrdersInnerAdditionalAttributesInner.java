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
 * OrderCreateResponseOrdersInnerAdditionalAttributesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T08:55:15.048117Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderCreateResponseOrdersInnerAdditionalAttributesInner {
  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "attributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_ATTRIBUTE_VALUE = "attributeValue";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_VALUE)
  private String attributeValue;

  public OrderCreateResponseOrdersInnerAdditionalAttributesInner() {
  }

  public OrderCreateResponseOrdersInnerAdditionalAttributesInner attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   *  allowPartialOrder: Allow orders with failed lines. (SAP) Depends on backorder settings.   dpasRating: DX rating by Department of Defense is the highest rating by the highest offices and meant to be top priority. DO any other gov offices at the federal level to priotize.   dpasProgramId: Identifies the actual agency that signed off on the DPAS priority.   storageLocation: Determine the location of the product stock in SAP for Marketplaces.  soldTo: To be used in cases when Sold-To is different than Customer ID.  Z101: Used for end customer details such as name, address, phone, etc. This information flows to SAP and is used by warehouse.  euDepId: DEP ID would be the &#39;End User DEP/ABM Organization ID&#39; up to 32 characters and is assigned by Apple.  depOrderNbr: depordernbr is &#39;End User PO to reseller&#39; Can appear in message lines or dedicated end user po#.  
   * @return attributeName
   */
  @javax.annotation.Nullable
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  public OrderCreateResponseOrdersInnerAdditionalAttributesInner attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * Attribute value
   * @return attributeValue
   */
  @javax.annotation.Nullable
  public String getAttributeValue() {
    return attributeValue;
  }

  public void setAttributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponseOrdersInnerAdditionalAttributesInner orderCreateResponseOrdersInnerAdditionalAttributesInner = (OrderCreateResponseOrdersInnerAdditionalAttributesInner) o;
    return Objects.equals(this.attributeName, orderCreateResponseOrdersInnerAdditionalAttributesInner.attributeName) &&
        Objects.equals(this.attributeValue, orderCreateResponseOrdersInnerAdditionalAttributesInner.attributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponseOrdersInnerAdditionalAttributesInner {\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    attributeValue: ").append(toIndentedString(attributeValue)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponseOrdersInnerAdditionalAttributesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponseOrdersInnerAdditionalAttributesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponseOrdersInnerAdditionalAttributesInner is not found in the empty JSON string", OrderCreateResponseOrdersInnerAdditionalAttributesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponseOrdersInnerAdditionalAttributesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponseOrdersInnerAdditionalAttributesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("attributeName") != null && !jsonObj.get("attributeName").isJsonNull()) && !jsonObj.get("attributeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeName").toString()));
      }
      if ((jsonObj.get("attributeValue") != null && !jsonObj.get("attributeValue").isJsonNull()) && !jsonObj.get("attributeValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributeValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attributeValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponseOrdersInnerAdditionalAttributesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponseOrdersInnerAdditionalAttributesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponseOrdersInnerAdditionalAttributesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponseOrdersInnerAdditionalAttributesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponseOrdersInnerAdditionalAttributesInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponseOrdersInnerAdditionalAttributesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponseOrdersInnerAdditionalAttributesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateResponseOrdersInnerAdditionalAttributesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateResponseOrdersInnerAdditionalAttributesInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateResponseOrdersInnerAdditionalAttributesInner
   */
  public static OrderCreateResponseOrdersInnerAdditionalAttributesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponseOrdersInnerAdditionalAttributesInner.class);
  }

  /**
   * Convert an instance of OrderCreateResponseOrdersInnerAdditionalAttributesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

