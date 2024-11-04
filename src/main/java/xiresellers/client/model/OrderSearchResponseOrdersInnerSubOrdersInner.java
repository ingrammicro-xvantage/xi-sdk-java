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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner;

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
 * OrderSearchResponseOrdersInnerSubOrdersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T09:04:53.013432Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderSearchResponseOrdersInnerSubOrdersInner {
  public static final String SERIALIZED_NAME_SUB_ORDER_NUMBER = "subOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_NUMBER)
  private String subOrderNumber;

  public static final String SERIALIZED_NAME_SUB_ORDER_TOTAL = "subOrderTotal";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_TOTAL)
  private BigDecimal subOrderTotal;

  public static final String SERIALIZED_NAME_SUB_ORDER_STATUS = "subOrderStatus";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_STATUS)
  private String subOrderStatus;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner> links = new ArrayList<>();

  public OrderSearchResponseOrdersInnerSubOrdersInner() {
  }

  public OrderSearchResponseOrdersInnerSubOrdersInner subOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
    return this;
  }

  /**
   * The sub order number. The two-digit prefix is the warehouse code of the warehouse nearest to the reseller. The middle number is the order number. The two-digit suffix is the sub order number.
   * @return subOrderNumber
   */
  @javax.annotation.Nullable
  public String getSubOrderNumber() {
    return subOrderNumber;
  }

  public void setSubOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
  }


  public OrderSearchResponseOrdersInnerSubOrdersInner subOrderTotal(BigDecimal subOrderTotal) {
    this.subOrderTotal = subOrderTotal;
    return this;
  }

  /**
   * The total for the suborder.
   * @return subOrderTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getSubOrderTotal() {
    return subOrderTotal;
  }

  public void setSubOrderTotal(BigDecimal subOrderTotal) {
    this.subOrderTotal = subOrderTotal;
  }


  public OrderSearchResponseOrdersInnerSubOrdersInner subOrderStatus(String subOrderStatus) {
    this.subOrderStatus = subOrderStatus;
    return this;
  }

  /**
   * The status of the suborder. One of:- Shipped, Canceled, Backordered, Processing, On Hold, Delivered
   * @return subOrderStatus
   */
  @javax.annotation.Nullable
  public String getSubOrderStatus() {
    return subOrderStatus;
  }

  public void setSubOrderStatus(String subOrderStatus) {
    this.subOrderStatus = subOrderStatus;
  }


  public OrderSearchResponseOrdersInnerSubOrdersInner links(List<OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public OrderSearchResponseOrdersInnerSubOrdersInner addLinksItem(OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Link to Order Details for the sub order(s).
   * @return links
   */
  @javax.annotation.Nullable
  public List<OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(List<OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner> links) {
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
    OrderSearchResponseOrdersInnerSubOrdersInner orderSearchResponseOrdersInnerSubOrdersInner = (OrderSearchResponseOrdersInnerSubOrdersInner) o;
    return Objects.equals(this.subOrderNumber, orderSearchResponseOrdersInnerSubOrdersInner.subOrderNumber) &&
        Objects.equals(this.subOrderTotal, orderSearchResponseOrdersInnerSubOrdersInner.subOrderTotal) &&
        Objects.equals(this.subOrderStatus, orderSearchResponseOrdersInnerSubOrdersInner.subOrderStatus) &&
        Objects.equals(this.links, orderSearchResponseOrdersInnerSubOrdersInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subOrderNumber, subOrderTotal, subOrderStatus, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchResponseOrdersInnerSubOrdersInner {\n");
    sb.append("    subOrderNumber: ").append(toIndentedString(subOrderNumber)).append("\n");
    sb.append("    subOrderTotal: ").append(toIndentedString(subOrderTotal)).append("\n");
    sb.append("    subOrderStatus: ").append(toIndentedString(subOrderStatus)).append("\n");
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
    openapiFields.add("subOrderNumber");
    openapiFields.add("subOrderTotal");
    openapiFields.add("subOrderStatus");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderSearchResponseOrdersInnerSubOrdersInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchResponseOrdersInnerSubOrdersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchResponseOrdersInnerSubOrdersInner is not found in the empty JSON string", OrderSearchResponseOrdersInnerSubOrdersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchResponseOrdersInnerSubOrdersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchResponseOrdersInnerSubOrdersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subOrderNumber") != null && !jsonObj.get("subOrderNumber").isJsonNull()) && !jsonObj.get("subOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subOrderNumber").toString()));
      }
      if ((jsonObj.get("subOrderStatus") != null && !jsonObj.get("subOrderStatus").isJsonNull()) && !jsonObj.get("subOrderStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subOrderStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subOrderStatus").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchResponseOrdersInnerSubOrdersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchResponseOrdersInnerSubOrdersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchResponseOrdersInnerSubOrdersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchResponseOrdersInnerSubOrdersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchResponseOrdersInnerSubOrdersInner>() {
           @Override
           public void write(JsonWriter out, OrderSearchResponseOrdersInnerSubOrdersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchResponseOrdersInnerSubOrdersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderSearchResponseOrdersInnerSubOrdersInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderSearchResponseOrdersInnerSubOrdersInner
   * @throws IOException if the JSON string is invalid with respect to OrderSearchResponseOrdersInnerSubOrdersInner
   */
  public static OrderSearchResponseOrdersInnerSubOrdersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchResponseOrdersInnerSubOrdersInner.class);
  }

  /**
   * Convert an instance of OrderSearchResponseOrdersInnerSubOrdersInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

