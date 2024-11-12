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
 * Shipping details for the order provided by the reseller.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T05:37:19.764548Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderModifyResponseLinesInnerShipmentDetails {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER = "freightAccountNumber";
  @SerializedName(SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER)
  private String freightAccountNumber;

  public OrderModifyResponseLinesInnerShipmentDetails() {
  }

  public OrderModifyResponseLinesInnerShipmentDetails carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

  /**
   * The carrier code for the shipment containing the line item.
   * @return carrierCode
   */
  @javax.annotation.Nullable
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public OrderModifyResponseLinesInnerShipmentDetails carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

  /**
   * The name of the carrier of the shipment containing the line item.
   * @return carrierName
   */
  @javax.annotation.Nullable
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public OrderModifyResponseLinesInnerShipmentDetails freightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
    return this;
  }

  /**
   * The reseller&#39;s shipping account number with carrier. Used to bill the shipping carrier directly from the reseller&#39;s account with the carrier.
   * @return freightAccountNumber
   */
  @javax.annotation.Nullable
  public String getFreightAccountNumber() {
    return freightAccountNumber;
  }

  public void setFreightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyResponseLinesInnerShipmentDetails orderModifyResponseLinesInnerShipmentDetails = (OrderModifyResponseLinesInnerShipmentDetails) o;
    return Objects.equals(this.carrierCode, orderModifyResponseLinesInnerShipmentDetails.carrierCode) &&
        Objects.equals(this.carrierName, orderModifyResponseLinesInnerShipmentDetails.carrierName) &&
        Objects.equals(this.freightAccountNumber, orderModifyResponseLinesInnerShipmentDetails.freightAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, carrierName, freightAccountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyResponseLinesInnerShipmentDetails {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    freightAccountNumber: ").append(toIndentedString(freightAccountNumber)).append("\n");
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
    openapiFields.add("freightAccountNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderModifyResponseLinesInnerShipmentDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyResponseLinesInnerShipmentDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyResponseLinesInnerShipmentDetails is not found in the empty JSON string", OrderModifyResponseLinesInnerShipmentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyResponseLinesInnerShipmentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyResponseLinesInnerShipmentDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("carrierName") != null && !jsonObj.get("carrierName").isJsonNull()) && !jsonObj.get("carrierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierName").toString()));
      }
      if ((jsonObj.get("freightAccountNumber") != null && !jsonObj.get("freightAccountNumber").isJsonNull()) && !jsonObj.get("freightAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freightAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freightAccountNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyResponseLinesInnerShipmentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyResponseLinesInnerShipmentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyResponseLinesInnerShipmentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyResponseLinesInnerShipmentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyResponseLinesInnerShipmentDetails>() {
           @Override
           public void write(JsonWriter out, OrderModifyResponseLinesInnerShipmentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyResponseLinesInnerShipmentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderModifyResponseLinesInnerShipmentDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderModifyResponseLinesInnerShipmentDetails
   * @throws IOException if the JSON string is invalid with respect to OrderModifyResponseLinesInnerShipmentDetails
   */
  public static OrderModifyResponseLinesInnerShipmentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyResponseLinesInnerShipmentDetails.class);
  }

  /**
   * Convert an instance of OrderModifyResponseLinesInnerShipmentDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

