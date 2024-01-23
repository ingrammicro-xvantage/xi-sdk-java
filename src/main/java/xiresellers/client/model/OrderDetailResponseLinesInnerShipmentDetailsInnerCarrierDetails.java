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
import xiresellers.client.model.OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetailsTrackingDetailsInner;

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
 * The shipment carrier details for the line item.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T11:06:29.712836Z[Etc/UTC]")
public class OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_TRACKING_DETAILS = "trackingDetails";
  @SerializedName(SERIALIZED_NAME_TRACKING_DETAILS)
  private List<OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetailsTrackingDetailsInner> trackingDetails;

  public OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails() {
  }

  public OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * The carrier code for the shipment containing the line item.
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails carrierName(String carrierName) {
    this.carrierName = carrierName;
    return this;
  }

   /**
   * The name of the carrier of the shipment containing the line item.
   * @return carrierName
  **/
  @javax.annotation.Nullable
  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails trackingDetails(List<OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetailsTrackingDetailsInner> trackingDetails) {
    this.trackingDetails = trackingDetails;
    return this;
  }

  public OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails addTrackingDetailsItem(OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetailsTrackingDetailsInner trackingDetailsItem) {
    if (this.trackingDetails == null) {
      this.trackingDetails = new ArrayList<>();
    }
    this.trackingDetails.add(trackingDetailsItem);
    return this;
  }

   /**
   * Get trackingDetails
   * @return trackingDetails
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetailsTrackingDetailsInner> getTrackingDetails() {
    return trackingDetails;
  }

  public void setTrackingDetails(List<OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetailsTrackingDetailsInner> trackingDetails) {
    this.trackingDetails = trackingDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails orderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails = (OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails) o;
    return Objects.equals(this.carrierCode, orderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.carrierCode) &&
        Objects.equals(this.carrierName, orderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.carrierName) &&
        Objects.equals(this.trackingDetails, orderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.trackingDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, carrierName, trackingDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    trackingDetails: ").append(toIndentedString(trackingDetails)).append("\n");
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
    openapiFields.add("trackingDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails is not found in the empty JSON string", OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("carrierName") != null && !jsonObj.get("carrierName").isJsonNull()) && !jsonObj.get("carrierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierName").toString()));
      }
      if (jsonObj.get("trackingDetails") != null && !jsonObj.get("trackingDetails").isJsonNull()) {
        JsonArray jsonArraytrackingDetails = jsonObj.getAsJsonArray("trackingDetails");
        if (jsonArraytrackingDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("trackingDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `trackingDetails` to be an array in the JSON string but got `%s`", jsonObj.get("trackingDetails").toString()));
          }

          // validate the optional field `trackingDetails` (array)
          for (int i = 0; i < jsonArraytrackingDetails.size(); i++) {
            OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetailsTrackingDetailsInner.validateJsonElement(jsonArraytrackingDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails>() {
           @Override
           public void write(JsonWriter out, OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails
  * @throws IOException if the JSON string is invalid with respect to OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails
  */
  public static OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.class);
  }

 /**
  * Convert an instance of OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

