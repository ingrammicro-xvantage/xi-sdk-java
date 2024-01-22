/*
 * Reseller API
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerLinks;
import xiresellers.client.model.OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInner;

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

import xiresellers.client.JSON;

/**
 * OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner {
  public static final String SERIALIZED_NAME_ORDERNUMBER = "ordernumber";
  @SerializedName(SERIALIZED_NAME_ORDERNUMBER)
  private String ordernumber;

  public static final String SERIALIZED_NAME_ENTRYTIMESTAMP = "entrytimestamp";
  @SerializedName(SERIALIZED_NAME_ENTRYTIMESTAMP)
  private String entrytimestamp;

  public static final String SERIALIZED_NAME_CUSTOMERORDERNUMBER = "customerordernumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERORDERNUMBER)
  private String customerordernumber;

  public static final String SERIALIZED_NAME_SUBORDERS = "suborders";
  @SerializedName(SERIALIZED_NAME_SUBORDERS)
  private List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInner> suborders;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerLinks links;

  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner() {
  }

  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner ordernumber(String ordernumber) {
    this.ordernumber = ordernumber;
    return this;
  }

   /**
   * Ingram micro sales order number
   * @return ordernumber
  **/
  @javax.annotation.Nonnull
  public String getOrdernumber() {
    return ordernumber;
  }

  public void setOrdernumber(String ordernumber) {
    this.ordernumber = ordernumber;
  }


  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner entrytimestamp(String entrytimestamp) {
    this.entrytimestamp = entrytimestamp;
    return this;
  }

   /**
   * The order creation date-time in UTC format
   * @return entrytimestamp
  **/
  @javax.annotation.Nonnull
  public String getEntrytimestamp() {
    return entrytimestamp;
  }

  public void setEntrytimestamp(String entrytimestamp) {
    this.entrytimestamp = entrytimestamp;
  }


  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner customerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
    return this;
  }

   /**
   * PO/Order number submitted while creating the order
   * @return customerordernumber
  **/
  @javax.annotation.Nullable
  public String getCustomerordernumber() {
    return customerordernumber;
  }

  public void setCustomerordernumber(String customerordernumber) {
    this.customerordernumber = customerordernumber;
  }


  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner suborders(List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInner> suborders) {
    this.suborders = suborders;
    return this;
  }

  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner addSubordersItem(OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInner subordersItem) {
    if (this.suborders == null) {
      this.suborders = new ArrayList<>();
    }
    this.suborders.add(subordersItem);
    return this;
  }

   /**
   * An order MAY get divided into various sub orders, for example if the SKUs are being shipped from different warehouse.
   * @return suborders
  **/
  @javax.annotation.Nullable
  public List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInner> getSuborders() {
    return suborders;
  }

  public void setSuborders(List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInner> suborders) {
    this.suborders = suborders;
  }


  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner links(OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerLinks getLinks() {
    return links;
  }

  public void setLinks(OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerLinks links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner orderSearchResponseServiceResponseOrdersearchresponseOrdersInner = (OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner) o;
    return Objects.equals(this.ordernumber, orderSearchResponseServiceResponseOrdersearchresponseOrdersInner.ordernumber) &&
        Objects.equals(this.entrytimestamp, orderSearchResponseServiceResponseOrdersearchresponseOrdersInner.entrytimestamp) &&
        Objects.equals(this.customerordernumber, orderSearchResponseServiceResponseOrdersearchresponseOrdersInner.customerordernumber) &&
        Objects.equals(this.suborders, orderSearchResponseServiceResponseOrdersearchresponseOrdersInner.suborders) &&
        Objects.equals(this.links, orderSearchResponseServiceResponseOrdersearchresponseOrdersInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordernumber, entrytimestamp, customerordernumber, suborders, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner {\n");
    sb.append("    ordernumber: ").append(toIndentedString(ordernumber)).append("\n");
    sb.append("    entrytimestamp: ").append(toIndentedString(entrytimestamp)).append("\n");
    sb.append("    customerordernumber: ").append(toIndentedString(customerordernumber)).append("\n");
    sb.append("    suborders: ").append(toIndentedString(suborders)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("ordernumber");
    openapiFields.add("entrytimestamp");
    openapiFields.add("customerordernumber");
    openapiFields.add("suborders");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ordernumber");
    openapiRequiredFields.add("entrytimestamp");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner is not found in the empty JSON string", OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ordernumber").toString()));
      }
      if (!jsonObj.get("entrytimestamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entrytimestamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entrytimestamp").toString()));
      }
      if ((jsonObj.get("customerordernumber") != null && !jsonObj.get("customerordernumber").isJsonNull()) && !jsonObj.get("customerordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerordernumber").toString()));
      }
      if (jsonObj.get("suborders") != null && !jsonObj.get("suborders").isJsonNull()) {
        JsonArray jsonArraysuborders = jsonObj.getAsJsonArray("suborders");
        if (jsonArraysuborders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("suborders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `suborders` to be an array in the JSON string but got `%s`", jsonObj.get("suborders").toString()));
          }

          // validate the optional field `suborders` (array)
          for (int i = 0; i < jsonArraysuborders.size(); i++) {
            OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInner.validateJsonElement(jsonArraysuborders.get(i));
          };
        }
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerLinks.validateJsonElement(jsonObj.get("links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner>() {
           @Override
           public void write(JsonWriter out, OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner
  * @throws IOException if the JSON string is invalid with respect to OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner
  */
  public static OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.class);
  }

 /**
  * Convert an instance of OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
