/*
 * XI Sdk Resellers
 * For Resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
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
 * OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T17:34:44.949460271Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  @javax.annotation.Nullable
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  @javax.annotation.Nullable
  private String carrierName;

  public static final String SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID = "shipFromWarehouseId";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID)
  @javax.annotation.Nullable
  private String shipFromWarehouseId;

  public static final String SERIALIZED_NAME_SHIP_FROM_LOCATION = "shipFromLocation";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_LOCATION)
  @javax.annotation.Nullable
  private String shipFromLocation;

  public OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner() {
  }

  public OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner carrierCode(@javax.annotation.Nullable String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

  /**
   * The code for the shipping carrier for the line item.
   * @return carrierCode
   */
  @javax.annotation.Nullable
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(@javax.annotation.Nullable String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner carrierName(@javax.annotation.Nullable String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

  /**
   * The name of the shipping carrier for the line item.
   * @return carrierName
   */
  @javax.annotation.Nullable
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(@javax.annotation.Nullable String carrierName) {
    this.carrierName = carrierName;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner shipFromWarehouseId(@javax.annotation.Nullable String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
    return this;
  }

  /**
   * The ID of the warehouse the line item will ship from.
   * @return shipFromWarehouseId
   */
  @javax.annotation.Nullable
  public String getShipFromWarehouseId() {
    return shipFromWarehouseId;
  }

  public void setShipFromWarehouseId(@javax.annotation.Nullable String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner shipFromLocation(@javax.annotation.Nullable String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
    return this;
  }

  /**
   * Location from which order is shipped.
   * @return shipFromLocation
   */
  @javax.annotation.Nullable
  public String getShipFromLocation() {
    return shipFromLocation;
  }

  public void setShipFromLocation(@javax.annotation.Nullable String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner orderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner = (OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner) o;
    return Objects.equals(this.carrierCode, orderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.carrierCode) &&
        Objects.equals(this.carrierName, orderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.carrierName) &&
        Objects.equals(this.shipFromWarehouseId, orderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.shipFromWarehouseId) &&
        Objects.equals(this.shipFromLocation, orderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.shipFromLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, carrierName, shipFromWarehouseId, shipFromLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    shipFromWarehouseId: ").append(toIndentedString(shipFromWarehouseId)).append("\n");
    sb.append("    shipFromLocation: ").append(toIndentedString(shipFromLocation)).append("\n");
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
    openapiFields.add("carrierCode");
    openapiFields.add("carrierName");
    openapiFields.add("shipFromWarehouseId");
    openapiFields.add("shipFromLocation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner is not found in the empty JSON string", OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("carrierName") != null && !jsonObj.get("carrierName").isJsonNull()) && !jsonObj.get("carrierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierName").toString()));
      }
      if ((jsonObj.get("shipFromWarehouseId") != null && !jsonObj.get("shipFromWarehouseId").isJsonNull()) && !jsonObj.get("shipFromWarehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromWarehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromWarehouseId").toString()));
      }
      if ((jsonObj.get("shipFromLocation") != null && !jsonObj.get("shipFromLocation").isJsonNull()) && !jsonObj.get("shipFromLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromLocation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner
   */
  public static OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.class);
  }

  /**
   * Convert an instance of OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

