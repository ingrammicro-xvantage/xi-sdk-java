/*
 * XI SDK Resellers
 * For Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
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
import xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange;

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
 * OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T05:46:16.662413Z[Etc/UTC]")
public class OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery {
  public static final String SERIALIZED_NAME_DELIVERY_DATE_TYPE = "deliveryDateType";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE_TYPE)
  private String deliveryDateType;

  public static final String SERIALIZED_NAME_DELIVERY_DATE_RANGE = "deliveryDateRange";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DATE_RANGE)
  private OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange deliveryDateRange;

  public static final String SERIALIZED_NAME_DELIVERY_SOURCE = "deliverySource";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SOURCE)
  private String deliverySource;

  public static final String SERIALIZED_NAME_DELIVERY_DESCRIPTION = "deliveryDescription";
  @SerializedName(SERIALIZED_NAME_DELIVERY_DESCRIPTION)
  private String deliveryDescription;

  public static final String SERIALIZED_NAME_DELIVERED_DATE = "deliveredDate";
  @SerializedName(SERIALIZED_NAME_DELIVERED_DATE)
  private String deliveredDate;

  public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery() {
  }

  public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery deliveryDateType(String deliveryDateType) {
    this.deliveryDateType = deliveryDateType;
    return this;
  }

   /**
   * Date type. Example Single or multiple dates.
   * @return deliveryDateType
  **/
  @javax.annotation.Nullable
  public String getDeliveryDateType() {
    return deliveryDateType;
  }

  public void setDeliveryDateType(String deliveryDateType) {
    this.deliveryDateType = deliveryDateType;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery deliveryDateRange(OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange deliveryDateRange) {
    this.deliveryDateRange = deliveryDateRange;
    return this;
  }

   /**
   * Get deliveryDateRange
   * @return deliveryDateRange
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange getDeliveryDateRange() {
    return deliveryDateRange;
  }

  public void setDeliveryDateRange(OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange deliveryDateRange) {
    this.deliveryDateRange = deliveryDateRange;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery deliverySource(String deliverySource) {
    this.deliverySource = deliverySource;
    return this;
  }

   /**
   * Source of the delivery.
   * @return deliverySource
  **/
  @javax.annotation.Nullable
  public String getDeliverySource() {
    return deliverySource;
  }

  public void setDeliverySource(String deliverySource) {
    this.deliverySource = deliverySource;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery deliveryDescription(String deliveryDescription) {
    this.deliveryDescription = deliveryDescription;
    return this;
  }

   /**
   * Delivery description.
   * @return deliveryDescription
  **/
  @javax.annotation.Nullable
  public String getDeliveryDescription() {
    return deliveryDescription;
  }

  public void setDeliveryDescription(String deliveryDescription) {
    this.deliveryDescription = deliveryDescription;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery deliveredDate(String deliveredDate) {
    this.deliveredDate = deliveredDate;
    return this;
  }

   /**
   * Delivery date.
   * @return deliveredDate
  **/
  @javax.annotation.Nullable
  public String getDeliveredDate() {
    return deliveredDate;
  }

  public void setDeliveredDate(String deliveredDate) {
    this.deliveredDate = deliveredDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery orderDetailB2BLinesInnerEstimatedDatesInnerDelivery = (OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery) o;
    return Objects.equals(this.deliveryDateType, orderDetailB2BLinesInnerEstimatedDatesInnerDelivery.deliveryDateType) &&
        Objects.equals(this.deliveryDateRange, orderDetailB2BLinesInnerEstimatedDatesInnerDelivery.deliveryDateRange) &&
        Objects.equals(this.deliverySource, orderDetailB2BLinesInnerEstimatedDatesInnerDelivery.deliverySource) &&
        Objects.equals(this.deliveryDescription, orderDetailB2BLinesInnerEstimatedDatesInnerDelivery.deliveryDescription) &&
        Objects.equals(this.deliveredDate, orderDetailB2BLinesInnerEstimatedDatesInnerDelivery.deliveredDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDateType, deliveryDateRange, deliverySource, deliveryDescription, deliveredDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery {\n");
    sb.append("    deliveryDateType: ").append(toIndentedString(deliveryDateType)).append("\n");
    sb.append("    deliveryDateRange: ").append(toIndentedString(deliveryDateRange)).append("\n");
    sb.append("    deliverySource: ").append(toIndentedString(deliverySource)).append("\n");
    sb.append("    deliveryDescription: ").append(toIndentedString(deliveryDescription)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
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
    openapiFields.add("deliveryDateType");
    openapiFields.add("deliveryDateRange");
    openapiFields.add("deliverySource");
    openapiFields.add("deliveryDescription");
    openapiFields.add("deliveredDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery is not found in the empty JSON string", OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deliveryDateType") != null && !jsonObj.get("deliveryDateType").isJsonNull()) && !jsonObj.get("deliveryDateType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryDateType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryDateType").toString()));
      }
      // validate the optional field `deliveryDateRange`
      if (jsonObj.get("deliveryDateRange") != null && !jsonObj.get("deliveryDateRange").isJsonNull()) {
        OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.validateJsonElement(jsonObj.get("deliveryDateRange"));
      }
      if ((jsonObj.get("deliverySource") != null && !jsonObj.get("deliverySource").isJsonNull()) && !jsonObj.get("deliverySource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliverySource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliverySource").toString()));
      }
      if ((jsonObj.get("deliveryDescription") != null && !jsonObj.get("deliveryDescription").isJsonNull()) && !jsonObj.get("deliveryDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryDescription").toString()));
      }
      if ((jsonObj.get("deliveredDate") != null && !jsonObj.get("deliveredDate").isJsonNull()) && !jsonObj.get("deliveredDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveredDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveredDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery
  */
  public static OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

