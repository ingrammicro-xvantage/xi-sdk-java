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
 * Shipping details for the order provided by the customer.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T08:55:15.048117Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AsyncOrderCreateDTOShipmentDetails {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_REQUESTED_DELIVERY_DATE = "requestedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DELIVERY_DATE)
  private String requestedDeliveryDate;

  public static final String SERIALIZED_NAME_SHIP_COMPLETE = "shipComplete";
  @SerializedName(SERIALIZED_NAME_SHIP_COMPLETE)
  private String shipComplete;

  public static final String SERIALIZED_NAME_SHIPPING_INSTRUCTIONS = "shippingInstructions";
  @SerializedName(SERIALIZED_NAME_SHIPPING_INSTRUCTIONS)
  private String shippingInstructions;

  public static final String SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER = "freightAccountNumber";
  @SerializedName(SERIALIZED_NAME_FREIGHT_ACCOUNT_NUMBER)
  private String freightAccountNumber;

  public static final String SERIALIZED_NAME_SIGNATURE_REQUIRED = "signatureRequired";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_REQUIRED)
  private Boolean signatureRequired;

  public AsyncOrderCreateDTOShipmentDetails() {
  }

  public AsyncOrderCreateDTOShipmentDetails carrierCode(String carrierCode) {
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

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public AsyncOrderCreateDTOShipmentDetails requestedDeliveryDate(String requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
    return this;
  }

  /**
   * The reseller-requested delivery date in UTC format. Delivery date is not guaranteed.
   * @return requestedDeliveryDate
   */
  @javax.annotation.Nullable
  public String getRequestedDeliveryDate() {
    return requestedDeliveryDate;
  }

  public void setRequestedDeliveryDate(String requestedDeliveryDate) {
    this.requestedDeliveryDate = requestedDeliveryDate;
  }


  public AsyncOrderCreateDTOShipmentDetails shipComplete(String shipComplete) {
    this.shipComplete = shipComplete;
    return this;
  }

  /**
   * Specifies whether the shipment will be shipped only when all products are fulfilled. The value of this field along with acceptBackOrder field decides the value of backorderflag. If this field is set, acceptBackOrder field is ignored. Possible values for this field are true, C, P, E.
   * @return shipComplete
   */
  @javax.annotation.Nullable
  public String getShipComplete() {
    return shipComplete;
  }

  public void setShipComplete(String shipComplete) {
    this.shipComplete = shipComplete;
  }


  public AsyncOrderCreateDTOShipmentDetails shippingInstructions(String shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
    return this;
  }

  /**
   * Any special shipping instructions for the order.
   * @return shippingInstructions
   */
  @javax.annotation.Nullable
  public String getShippingInstructions() {
    return shippingInstructions;
  }

  public void setShippingInstructions(String shippingInstructions) {
    this.shippingInstructions = shippingInstructions;
  }


  public AsyncOrderCreateDTOShipmentDetails freightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
    return this;
  }

  /**
   * The reseller &#39;s shipping account number with carrier. Used to bill the shipping carrier directly from the reseller&#39;s account with the carrier.
   * @return freightAccountNumber
   */
  @javax.annotation.Nullable
  public String getFreightAccountNumber() {
    return freightAccountNumber;
  }

  public void setFreightAccountNumber(String freightAccountNumber) {
    this.freightAccountNumber = freightAccountNumber;
  }


  public AsyncOrderCreateDTOShipmentDetails signatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
    return this;
  }

  /**
   * Specifies whether a signature is required for delivery. Default is False.
   * @return signatureRequired
   */
  @javax.annotation.Nullable
  public Boolean getSignatureRequired() {
    return signatureRequired;
  }

  public void setSignatureRequired(Boolean signatureRequired) {
    this.signatureRequired = signatureRequired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncOrderCreateDTOShipmentDetails asyncOrderCreateDTOShipmentDetails = (AsyncOrderCreateDTOShipmentDetails) o;
    return Objects.equals(this.carrierCode, asyncOrderCreateDTOShipmentDetails.carrierCode) &&
        Objects.equals(this.requestedDeliveryDate, asyncOrderCreateDTOShipmentDetails.requestedDeliveryDate) &&
        Objects.equals(this.shipComplete, asyncOrderCreateDTOShipmentDetails.shipComplete) &&
        Objects.equals(this.shippingInstructions, asyncOrderCreateDTOShipmentDetails.shippingInstructions) &&
        Objects.equals(this.freightAccountNumber, asyncOrderCreateDTOShipmentDetails.freightAccountNumber) &&
        Objects.equals(this.signatureRequired, asyncOrderCreateDTOShipmentDetails.signatureRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, requestedDeliveryDate, shipComplete, shippingInstructions, freightAccountNumber, signatureRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncOrderCreateDTOShipmentDetails {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    requestedDeliveryDate: ").append(toIndentedString(requestedDeliveryDate)).append("\n");
    sb.append("    shipComplete: ").append(toIndentedString(shipComplete)).append("\n");
    sb.append("    shippingInstructions: ").append(toIndentedString(shippingInstructions)).append("\n");
    sb.append("    freightAccountNumber: ").append(toIndentedString(freightAccountNumber)).append("\n");
    sb.append("    signatureRequired: ").append(toIndentedString(signatureRequired)).append("\n");
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
    openapiFields.add("requestedDeliveryDate");
    openapiFields.add("shipComplete");
    openapiFields.add("shippingInstructions");
    openapiFields.add("freightAccountNumber");
    openapiFields.add("signatureRequired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AsyncOrderCreateDTOShipmentDetails
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AsyncOrderCreateDTOShipmentDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsyncOrderCreateDTOShipmentDetails is not found in the empty JSON string", AsyncOrderCreateDTOShipmentDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AsyncOrderCreateDTOShipmentDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AsyncOrderCreateDTOShipmentDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("requestedDeliveryDate") != null && !jsonObj.get("requestedDeliveryDate").isJsonNull()) && !jsonObj.get("requestedDeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedDeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedDeliveryDate").toString()));
      }
      if ((jsonObj.get("shipComplete") != null && !jsonObj.get("shipComplete").isJsonNull()) && !jsonObj.get("shipComplete").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipComplete` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipComplete").toString()));
      }
      if ((jsonObj.get("shippingInstructions") != null && !jsonObj.get("shippingInstructions").isJsonNull()) && !jsonObj.get("shippingInstructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingInstructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippingInstructions").toString()));
      }
      if ((jsonObj.get("freightAccountNumber") != null && !jsonObj.get("freightAccountNumber").isJsonNull()) && !jsonObj.get("freightAccountNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `freightAccountNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("freightAccountNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncOrderCreateDTOShipmentDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncOrderCreateDTOShipmentDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncOrderCreateDTOShipmentDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncOrderCreateDTOShipmentDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncOrderCreateDTOShipmentDetails>() {
           @Override
           public void write(JsonWriter out, AsyncOrderCreateDTOShipmentDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncOrderCreateDTOShipmentDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AsyncOrderCreateDTOShipmentDetails given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AsyncOrderCreateDTOShipmentDetails
   * @throws IOException if the JSON string is invalid with respect to AsyncOrderCreateDTOShipmentDetails
   */
  public static AsyncOrderCreateDTOShipmentDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncOrderCreateDTOShipmentDetails.class);
  }

  /**
   * Convert an instance of AsyncOrderCreateDTOShipmentDetails to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

