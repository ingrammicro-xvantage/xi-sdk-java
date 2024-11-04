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
 * OrderDetailB2BLinesInnerScheduleLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T09:04:53.013432Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderDetailB2BLinesInnerScheduleLinesInner {
  public static final String SERIALIZED_NAME_LINE_NUMBER = "lineNumber";
  @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
  private String lineNumber;

  public static final String SERIALIZED_NAME_SCHEDULE_LINE_DATE = "scheduleLineDate";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_LINE_DATE)
  private String scheduleLineDate;

  public static final String SERIALIZED_NAME_REQUESTED_QUANTITY = "requestedQuantity";
  @SerializedName(SERIALIZED_NAME_REQUESTED_QUANTITY)
  private String requestedQuantity;

  public static final String SERIALIZED_NAME_CONFIRMED_QUANTITY = "confirmedQuantity";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_QUANTITY)
  private String confirmedQuantity;

  public static final String SERIALIZED_NAME_GOODS_ISSUE_DATE = "goodsIssueDate";
  @SerializedName(SERIALIZED_NAME_GOODS_ISSUE_DATE)
  private String goodsIssueDate;

  public OrderDetailB2BLinesInnerScheduleLinesInner() {
  }

  public OrderDetailB2BLinesInnerScheduleLinesInner lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Line number.
   * @return lineNumber
   */
  @javax.annotation.Nullable
  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }


  public OrderDetailB2BLinesInnerScheduleLinesInner scheduleLineDate(String scheduleLineDate) {
    this.scheduleLineDate = scheduleLineDate;
    return this;
  }

  /**
   * schedule Line Date.
   * @return scheduleLineDate
   */
  @javax.annotation.Nullable
  public String getScheduleLineDate() {
    return scheduleLineDate;
  }

  public void setScheduleLineDate(String scheduleLineDate) {
    this.scheduleLineDate = scheduleLineDate;
  }


  public OrderDetailB2BLinesInnerScheduleLinesInner requestedQuantity(String requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
    return this;
  }

  /**
   * Requested quantity.
   * @return requestedQuantity
   */
  @javax.annotation.Nullable
  public String getRequestedQuantity() {
    return requestedQuantity;
  }

  public void setRequestedQuantity(String requestedQuantity) {
    this.requestedQuantity = requestedQuantity;
  }


  public OrderDetailB2BLinesInnerScheduleLinesInner confirmedQuantity(String confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
    return this;
  }

  /**
   * Confirmed quantity.
   * @return confirmedQuantity
   */
  @javax.annotation.Nullable
  public String getConfirmedQuantity() {
    return confirmedQuantity;
  }

  public void setConfirmedQuantity(String confirmedQuantity) {
    this.confirmedQuantity = confirmedQuantity;
  }


  public OrderDetailB2BLinesInnerScheduleLinesInner goodsIssueDate(String goodsIssueDate) {
    this.goodsIssueDate = goodsIssueDate;
    return this;
  }

  /**
   * Date when good issued.
   * @return goodsIssueDate
   */
  @javax.annotation.Nullable
  public String getGoodsIssueDate() {
    return goodsIssueDate;
  }

  public void setGoodsIssueDate(String goodsIssueDate) {
    this.goodsIssueDate = goodsIssueDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerScheduleLinesInner orderDetailB2BLinesInnerScheduleLinesInner = (OrderDetailB2BLinesInnerScheduleLinesInner) o;
    return Objects.equals(this.lineNumber, orderDetailB2BLinesInnerScheduleLinesInner.lineNumber) &&
        Objects.equals(this.scheduleLineDate, orderDetailB2BLinesInnerScheduleLinesInner.scheduleLineDate) &&
        Objects.equals(this.requestedQuantity, orderDetailB2BLinesInnerScheduleLinesInner.requestedQuantity) &&
        Objects.equals(this.confirmedQuantity, orderDetailB2BLinesInnerScheduleLinesInner.confirmedQuantity) &&
        Objects.equals(this.goodsIssueDate, orderDetailB2BLinesInnerScheduleLinesInner.goodsIssueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineNumber, scheduleLineDate, requestedQuantity, confirmedQuantity, goodsIssueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerScheduleLinesInner {\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    scheduleLineDate: ").append(toIndentedString(scheduleLineDate)).append("\n");
    sb.append("    requestedQuantity: ").append(toIndentedString(requestedQuantity)).append("\n");
    sb.append("    confirmedQuantity: ").append(toIndentedString(confirmedQuantity)).append("\n");
    sb.append("    goodsIssueDate: ").append(toIndentedString(goodsIssueDate)).append("\n");
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
    openapiFields.add("lineNumber");
    openapiFields.add("scheduleLineDate");
    openapiFields.add("requestedQuantity");
    openapiFields.add("confirmedQuantity");
    openapiFields.add("goodsIssueDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerScheduleLinesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerScheduleLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerScheduleLinesInner is not found in the empty JSON string", OrderDetailB2BLinesInnerScheduleLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerScheduleLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerScheduleLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("lineNumber") != null && !jsonObj.get("lineNumber").isJsonNull()) && !jsonObj.get("lineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineNumber").toString()));
      }
      if ((jsonObj.get("scheduleLineDate") != null && !jsonObj.get("scheduleLineDate").isJsonNull()) && !jsonObj.get("scheduleLineDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduleLineDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduleLineDate").toString()));
      }
      if ((jsonObj.get("requestedQuantity") != null && !jsonObj.get("requestedQuantity").isJsonNull()) && !jsonObj.get("requestedQuantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedQuantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedQuantity").toString()));
      }
      if ((jsonObj.get("confirmedQuantity") != null && !jsonObj.get("confirmedQuantity").isJsonNull()) && !jsonObj.get("confirmedQuantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmedQuantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmedQuantity").toString()));
      }
      if ((jsonObj.get("goodsIssueDate") != null && !jsonObj.get("goodsIssueDate").isJsonNull()) && !jsonObj.get("goodsIssueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `goodsIssueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("goodsIssueDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerScheduleLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerScheduleLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerScheduleLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerScheduleLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerScheduleLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerScheduleLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerScheduleLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderDetailB2BLinesInnerScheduleLinesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderDetailB2BLinesInnerScheduleLinesInner
   * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerScheduleLinesInner
   */
  public static OrderDetailB2BLinesInnerScheduleLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerScheduleLinesInner.class);
  }

  /**
   * Convert an instance of OrderDetailB2BLinesInnerScheduleLinesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

