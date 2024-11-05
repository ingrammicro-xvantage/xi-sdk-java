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
 * OrderCreateV7RequestAdditionalAttributesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T08:54:01.152945Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderCreateV7RequestAdditionalAttributesInner {
  public static final String SERIALIZED_NAME_ATTRIBUTE_NAME = "attributeName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_NAME)
  private String attributeName;

  public static final String SERIALIZED_NAME_ATTRIBUTE_VALUE = "attributeValue";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_VALUE)
  private String attributeValue;

  public OrderCreateV7RequestAdditionalAttributesInner() {
  }

  public OrderCreateV7RequestAdditionalAttributesInner attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * **allowPartialOrder:** Allow orders with failed lines.    **DpasRating:** DX rating by Department of Defense is the highest rating by the highest offices and meant to be top priority. DO any other gov offices at the federal level to priotize.    **DpasProgramId:** Identifies the actual agency that signed off on the DPAS priority.    **allowDuplicateCustomerOrderNumber:** Allow orders with duplicate customer PO numbers. Enables resellers to have the same PO number for multiple orders.     **euDepId:** DEP ID would be the &#39;End User DEP/ABM Organization ID&#39; up to 32 characters and is assigned by Apple.    **depOrderNbr:** depordernbr is &#39;End User PO to reseller&#39; Can appear in message lines or dedicated end user po#.    **govtProgramType:** Program type, “PA” for government orders, “ED” for education order.    **govtEndUserType:** Type of end user of the program. F &#x3D; Federal, S &#x3D; State, E &#x3D; Local, K &#x3D; K-12 school, and H &#x3D; Higher Education    **govtSolicitationNumber:** Education order’s contract number    **govtPublicPrivateCode:** Determines TAX / NO TAX.   &#39;P&#39; PUBLIC SECTOR,   &#39;R&#39; PRIVATE SECTOR.  Value needs only to be provided for EDUCATION order.    **govtEndUserData:** Name of the End user of the program. For example, STATE OF OHIO, CHICAGO SCHOOLDISTRICT etc.    **govtEndUserPostalCode:** 9 CHAR FIELD / Zip Code of the End user of the order.    **dynamicMessageLine1:** Custom Dynamic Message line 1.    **allowOrderOnCustomerHold:** Boolean value flag which allows a customer to create an order with the hold status.
   * @return attributeName
   */
  @javax.annotation.Nullable
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }


  public OrderCreateV7RequestAdditionalAttributesInner attributeValue(String attributeValue) {
    this.attributeValue = attributeValue;
    return this;
  }

  /**
   * The attribute field data.
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
    OrderCreateV7RequestAdditionalAttributesInner orderCreateV7RequestAdditionalAttributesInner = (OrderCreateV7RequestAdditionalAttributesInner) o;
    return Objects.equals(this.attributeName, orderCreateV7RequestAdditionalAttributesInner.attributeName) &&
        Objects.equals(this.attributeValue, orderCreateV7RequestAdditionalAttributesInner.attributeValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, attributeValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7RequestAdditionalAttributesInner {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7RequestAdditionalAttributesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7RequestAdditionalAttributesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7RequestAdditionalAttributesInner is not found in the empty JSON string", OrderCreateV7RequestAdditionalAttributesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7RequestAdditionalAttributesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7RequestAdditionalAttributesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!OrderCreateV7RequestAdditionalAttributesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7RequestAdditionalAttributesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7RequestAdditionalAttributesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7RequestAdditionalAttributesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7RequestAdditionalAttributesInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7RequestAdditionalAttributesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7RequestAdditionalAttributesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7RequestAdditionalAttributesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7RequestAdditionalAttributesInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7RequestAdditionalAttributesInner
   */
  public static OrderCreateV7RequestAdditionalAttributesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7RequestAdditionalAttributesInner.class);
  }

  /**
   * Convert an instance of OrderCreateV7RequestAdditionalAttributesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
