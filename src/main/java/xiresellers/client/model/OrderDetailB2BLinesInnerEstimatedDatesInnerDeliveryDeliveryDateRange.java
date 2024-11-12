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
 * Delivery date range.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T05:37:19.764548Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange() {
  }

  public OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start Date.
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End Date.
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange orderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange = (OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange) o;
    return Objects.equals(this.startDate, orderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.startDate) &&
        Objects.equals(this.endDate, orderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange is not found in the empty JSON string", OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange
   * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange
   */
  public static OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.class);
  }

  /**
   * Convert an instance of OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

