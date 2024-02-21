/*
 * XI Sdk Resellers
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
import xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange;

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
 * OrderDetailB2BLinesInnerEstimatedDatesInnerShip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T07:08:49.827408Z[Etc/UTC]")
public class OrderDetailB2BLinesInnerEstimatedDatesInnerShip {
  public static final String SERIALIZED_NAME_SHIP_DATE_TYPE = "shipDateType";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE_TYPE)
  private String shipDateType;

  public static final String SERIALIZED_NAME_SHIP_DATE_RANGE = "shipDateRange";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE_RANGE)
  private OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange shipDateRange;

  public static final String SERIALIZED_NAME_SHIP_SOURCE = "shipSource";
  @SerializedName(SERIALIZED_NAME_SHIP_SOURCE)
  private String shipSource;

  public static final String SERIALIZED_NAME_SHIP_DESCRIPTION = "shipDescription";
  @SerializedName(SERIALIZED_NAME_SHIP_DESCRIPTION)
  private String shipDescription;

  public static final String SERIALIZED_NAME_SHIP_DATE = "shipDate";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE)
  private String shipDate;

  public OrderDetailB2BLinesInnerEstimatedDatesInnerShip() {
  }

  public OrderDetailB2BLinesInnerEstimatedDatesInnerShip shipDateType(String shipDateType) {
    this.shipDateType = shipDateType;
    return this;
  }

   /**
   * Date type. Example Single or multiple dates.
   * @return shipDateType
  **/
  @javax.annotation.Nullable
  public String getShipDateType() {
    return shipDateType;
  }

  public void setShipDateType(String shipDateType) {
    this.shipDateType = shipDateType;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerShip shipDateRange(OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange shipDateRange) {
    this.shipDateRange = shipDateRange;
    return this;
  }

   /**
   * Get shipDateRange
   * @return shipDateRange
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange getShipDateRange() {
    return shipDateRange;
  }

  public void setShipDateRange(OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange shipDateRange) {
    this.shipDateRange = shipDateRange;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerShip shipSource(String shipSource) {
    this.shipSource = shipSource;
    return this;
  }

   /**
   * Source of the shipment.
   * @return shipSource
  **/
  @javax.annotation.Nullable
  public String getShipSource() {
    return shipSource;
  }

  public void setShipSource(String shipSource) {
    this.shipSource = shipSource;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerShip shipDescription(String shipDescription) {
    this.shipDescription = shipDescription;
    return this;
  }

   /**
   * Shipment description.
   * @return shipDescription
  **/
  @javax.annotation.Nullable
  public String getShipDescription() {
    return shipDescription;
  }

  public void setShipDescription(String shipDescription) {
    this.shipDescription = shipDescription;
  }


  public OrderDetailB2BLinesInnerEstimatedDatesInnerShip shipDate(String shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * Ship date.
   * @return shipDate
  **/
  @javax.annotation.Nullable
  public String getShipDate() {
    return shipDate;
  }

  public void setShipDate(String shipDate) {
    this.shipDate = shipDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerEstimatedDatesInnerShip orderDetailB2BLinesInnerEstimatedDatesInnerShip = (OrderDetailB2BLinesInnerEstimatedDatesInnerShip) o;
    return Objects.equals(this.shipDateType, orderDetailB2BLinesInnerEstimatedDatesInnerShip.shipDateType) &&
        Objects.equals(this.shipDateRange, orderDetailB2BLinesInnerEstimatedDatesInnerShip.shipDateRange) &&
        Objects.equals(this.shipSource, orderDetailB2BLinesInnerEstimatedDatesInnerShip.shipSource) &&
        Objects.equals(this.shipDescription, orderDetailB2BLinesInnerEstimatedDatesInnerShip.shipDescription) &&
        Objects.equals(this.shipDate, orderDetailB2BLinesInnerEstimatedDatesInnerShip.shipDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipDateType, shipDateRange, shipSource, shipDescription, shipDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerEstimatedDatesInnerShip {\n");
    sb.append("    shipDateType: ").append(toIndentedString(shipDateType)).append("\n");
    sb.append("    shipDateRange: ").append(toIndentedString(shipDateRange)).append("\n");
    sb.append("    shipSource: ").append(toIndentedString(shipSource)).append("\n");
    sb.append("    shipDescription: ").append(toIndentedString(shipDescription)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
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
    openapiFields.add("shipDateType");
    openapiFields.add("shipDateRange");
    openapiFields.add("shipSource");
    openapiFields.add("shipDescription");
    openapiFields.add("shipDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInnerShip
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInnerShip.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerEstimatedDatesInnerShip is not found in the empty JSON string", OrderDetailB2BLinesInnerEstimatedDatesInnerShip.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerEstimatedDatesInnerShip.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerEstimatedDatesInnerShip` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("shipDateType") != null && !jsonObj.get("shipDateType").isJsonNull()) && !jsonObj.get("shipDateType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipDateType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipDateType").toString()));
      }
      // validate the optional field `shipDateRange`
      if (jsonObj.get("shipDateRange") != null && !jsonObj.get("shipDateRange").isJsonNull()) {
        OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange.validateJsonElement(jsonObj.get("shipDateRange"));
      }
      if ((jsonObj.get("shipSource") != null && !jsonObj.get("shipSource").isJsonNull()) && !jsonObj.get("shipSource").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipSource` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipSource").toString()));
      }
      if ((jsonObj.get("shipDescription") != null && !jsonObj.get("shipDescription").isJsonNull()) && !jsonObj.get("shipDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipDescription").toString()));
      }
      if ((jsonObj.get("shipDate") != null && !jsonObj.get("shipDate").isJsonNull()) && !jsonObj.get("shipDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerEstimatedDatesInnerShip.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerEstimatedDatesInnerShip' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInnerShip> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerEstimatedDatesInnerShip.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerEstimatedDatesInnerShip>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerEstimatedDatesInnerShip value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerEstimatedDatesInnerShip read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerEstimatedDatesInnerShip given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerEstimatedDatesInnerShip
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerEstimatedDatesInnerShip
  */
  public static OrderDetailB2BLinesInnerEstimatedDatesInnerShip fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerEstimatedDatesInnerShip.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerEstimatedDatesInnerShip to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

