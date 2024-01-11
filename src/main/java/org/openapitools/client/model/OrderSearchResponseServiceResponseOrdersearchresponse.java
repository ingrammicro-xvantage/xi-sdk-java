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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner;

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
 * OrderSearchResponseServiceResponseOrdersearchresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class OrderSearchResponseServiceResponseOrdersearchresponse {
  public static final String SERIALIZED_NAME_ORDERSFOUND = "ordersfound";
  @SerializedName(SERIALIZED_NAME_ORDERSFOUND)
  private String ordersfound;

  public static final String SERIALIZED_NAME_PAGESIZE = "pagesize";
  @SerializedName(SERIALIZED_NAME_PAGESIZE)
  private String pagesize;

  public static final String SERIALIZED_NAME_PAGENUMBER = "pagenumber";
  @SerializedName(SERIALIZED_NAME_PAGENUMBER)
  private String pagenumber;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner> orders;

  public OrderSearchResponseServiceResponseOrdersearchresponse() {
  }

  public OrderSearchResponseServiceResponseOrdersearchresponse ordersfound(String ordersfound) {
    this.ordersfound = ordersfound;
    return this;
  }

   /**
   * Number of records found in the search result
   * @return ordersfound
  **/
  @javax.annotation.Nonnull
  public String getOrdersfound() {
    return ordersfound;
  }

  public void setOrdersfound(String ordersfound) {
    this.ordersfound = ordersfound;
  }


  public OrderSearchResponseServiceResponseOrdersearchresponse pagesize(String pagesize) {
    this.pagesize = pagesize;
    return this;
  }

   /**
   * The submitted pagesize, default is 25
   * @return pagesize
  **/
  @javax.annotation.Nullable
  public String getPagesize() {
    return pagesize;
  }

  public void setPagesize(String pagesize) {
    this.pagesize = pagesize;
  }


  public OrderSearchResponseServiceResponseOrdersearchresponse pagenumber(String pagenumber) {
    this.pagenumber = pagenumber;
    return this;
  }

   /**
   * The submitted pager number, default is 1
   * @return pagenumber
  **/
  @javax.annotation.Nullable
  public String getPagenumber() {
    return pagenumber;
  }

  public void setPagenumber(String pagenumber) {
    this.pagenumber = pagenumber;
  }


  public OrderSearchResponseServiceResponseOrdersearchresponse orders(List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner> orders) {
    this.orders = orders;
    return this;
  }

  public OrderSearchResponseServiceResponseOrdersearchresponse addOrdersItem(OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * An array of orders in the search result
   * @return orders
  **/
  @javax.annotation.Nullable
  public List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner> orders) {
    this.orders = orders;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSearchResponseServiceResponseOrdersearchresponse orderSearchResponseServiceResponseOrdersearchresponse = (OrderSearchResponseServiceResponseOrdersearchresponse) o;
    return Objects.equals(this.ordersfound, orderSearchResponseServiceResponseOrdersearchresponse.ordersfound) &&
        Objects.equals(this.pagesize, orderSearchResponseServiceResponseOrdersearchresponse.pagesize) &&
        Objects.equals(this.pagenumber, orderSearchResponseServiceResponseOrdersearchresponse.pagenumber) &&
        Objects.equals(this.orders, orderSearchResponseServiceResponseOrdersearchresponse.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordersfound, pagesize, pagenumber, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchResponseServiceResponseOrdersearchresponse {\n");
    sb.append("    ordersfound: ").append(toIndentedString(ordersfound)).append("\n");
    sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
    sb.append("    pagenumber: ").append(toIndentedString(pagenumber)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
    openapiFields.add("ordersfound");
    openapiFields.add("pagesize");
    openapiFields.add("pagenumber");
    openapiFields.add("orders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ordersfound");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchResponseServiceResponseOrdersearchresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchResponseServiceResponseOrdersearchresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchResponseServiceResponseOrdersearchresponse is not found in the empty JSON string", OrderSearchResponseServiceResponseOrdersearchresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchResponseServiceResponseOrdersearchresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchResponseServiceResponseOrdersearchresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderSearchResponseServiceResponseOrdersearchresponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("ordersfound").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ordersfound` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ordersfound").toString()));
      }
      if ((jsonObj.get("pagesize") != null && !jsonObj.get("pagesize").isJsonNull()) && !jsonObj.get("pagesize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pagesize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pagesize").toString()));
      }
      if ((jsonObj.get("pagenumber") != null && !jsonObj.get("pagenumber").isJsonNull()) && !jsonObj.get("pagenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pagenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pagenumber").toString()));
      }
      if (jsonObj.get("orders") != null && !jsonObj.get("orders").isJsonNull()) {
        JsonArray jsonArrayorders = jsonObj.getAsJsonArray("orders");
        if (jsonArrayorders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orders` to be an array in the JSON string but got `%s`", jsonObj.get("orders").toString()));
          }

          // validate the optional field `orders` (array)
          for (int i = 0; i < jsonArrayorders.size(); i++) {
            OrderSearchResponseServiceResponseOrdersearchresponseOrdersInner.validateJsonElement(jsonArrayorders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchResponseServiceResponseOrdersearchresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchResponseServiceResponseOrdersearchresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchResponseServiceResponseOrdersearchresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchResponseServiceResponseOrdersearchresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchResponseServiceResponseOrdersearchresponse>() {
           @Override
           public void write(JsonWriter out, OrderSearchResponseServiceResponseOrdersearchresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchResponseServiceResponseOrdersearchresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchResponseServiceResponseOrdersearchresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchResponseServiceResponseOrdersearchresponse
  * @throws IOException if the JSON string is invalid with respect to OrderSearchResponseServiceResponseOrdersearchresponse
  */
  public static OrderSearchResponseServiceResponseOrdersearchresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchResponseServiceResponseOrdersearchresponse.class);
  }

 /**
  * Convert an instance of OrderSearchResponseServiceResponseOrdersearchresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

