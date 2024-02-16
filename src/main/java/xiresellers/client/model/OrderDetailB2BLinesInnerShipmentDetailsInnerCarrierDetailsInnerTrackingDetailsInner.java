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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner;

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
 * OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T05:46:16.662413Z[Etc/UTC]")
public class OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner {
  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "trackingNumber";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public static final String SERIALIZED_NAME_TRACKING_URL = "trackingUrl";
  @SerializedName(SERIALIZED_NAME_TRACKING_URL)
  private String trackingUrl;

  public static final String SERIALIZED_NAME_PACKAGE_WEIGHT = "packageWeight";
  @SerializedName(SERIALIZED_NAME_PACKAGE_WEIGHT)
  private String packageWeight;

  public static final String SERIALIZED_NAME_CARTON_NUMBER = "cartonNumber";
  @SerializedName(SERIALIZED_NAME_CARTON_NUMBER)
  private String cartonNumber;

  public static final String SERIALIZED_NAME_QUANTITY_IN_BOX = "quantityInBox";
  @SerializedName(SERIALIZED_NAME_QUANTITY_IN_BOX)
  private String quantityInBox;

  public static final String SERIALIZED_NAME_SERIAL_NUMBERS = "serialNumbers";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBERS)
  private List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner> serialNumbers;

  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner() {
  }

  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * The tracking number for the shipment containing the line item.
   * @return trackingNumber
  **/
  @javax.annotation.Nullable
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * The tracking URL for the shipment containing the line item.
   * @return trackingUrl
  **/
  @javax.annotation.Nullable
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner packageWeight(String packageWeight) {
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * The weight of the package for the line item.
   * @return packageWeight
  **/
  @javax.annotation.Nullable
  public String getPackageWeight() {
    return packageWeight;
  }

  public void setPackageWeight(String packageWeight) {
    this.packageWeight = packageWeight;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner cartonNumber(String cartonNumber) {
    this.cartonNumber = cartonNumber;
    return this;
  }

   /**
   * The shipment carton number that contains the line item.
   * @return cartonNumber
  **/
  @javax.annotation.Nullable
  public String getCartonNumber() {
    return cartonNumber;
  }

  public void setCartonNumber(String cartonNumber) {
    this.cartonNumber = cartonNumber;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner quantityInBox(String quantityInBox) {
    this.quantityInBox = quantityInBox;
    return this;
  }

   /**
   * The quantity of line items in the box.
   * @return quantityInBox
  **/
  @javax.annotation.Nullable
  public String getQuantityInBox() {
    return quantityInBox;
  }

  public void setQuantityInBox(String quantityInBox) {
    this.quantityInBox = quantityInBox;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner serialNumbers(List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner> serialNumbers) {
    this.serialNumbers = serialNumbers;
    return this;
  }

  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner addSerialNumbersItem(OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner serialNumbersItem) {
    if (this.serialNumbers == null) {
      this.serialNumbers = new ArrayList<>();
    }
    this.serialNumbers.add(serialNumbersItem);
    return this;
  }

   /**
   * A list of serial numbers of the line items contained in the shipment.
   * @return serialNumbers
  **/
  @javax.annotation.Nullable
  public List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner> getSerialNumbers() {
    return serialNumbers;
  }

  public void setSerialNumbers(List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner> serialNumbers) {
    this.serialNumbers = serialNumbers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner = (OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner) o;
    return Objects.equals(this.trackingNumber, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.trackingNumber) &&
        Objects.equals(this.trackingUrl, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.trackingUrl) &&
        Objects.equals(this.packageWeight, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.packageWeight) &&
        Objects.equals(this.cartonNumber, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.cartonNumber) &&
        Objects.equals(this.quantityInBox, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.quantityInBox) &&
        Objects.equals(this.serialNumbers, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.serialNumbers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingNumber, trackingUrl, packageWeight, cartonNumber, quantityInBox, serialNumbers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner {\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    packageWeight: ").append(toIndentedString(packageWeight)).append("\n");
    sb.append("    cartonNumber: ").append(toIndentedString(cartonNumber)).append("\n");
    sb.append("    quantityInBox: ").append(toIndentedString(quantityInBox)).append("\n");
    sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
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
    openapiFields.add("trackingNumber");
    openapiFields.add("trackingUrl");
    openapiFields.add("packageWeight");
    openapiFields.add("cartonNumber");
    openapiFields.add("quantityInBox");
    openapiFields.add("serialNumbers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner is not found in the empty JSON string", OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("trackingNumber") != null && !jsonObj.get("trackingNumber").isJsonNull()) && !jsonObj.get("trackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingNumber").toString()));
      }
      if ((jsonObj.get("trackingUrl") != null && !jsonObj.get("trackingUrl").isJsonNull()) && !jsonObj.get("trackingUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingUrl").toString()));
      }
      if ((jsonObj.get("packageWeight") != null && !jsonObj.get("packageWeight").isJsonNull()) && !jsonObj.get("packageWeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `packageWeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("packageWeight").toString()));
      }
      if ((jsonObj.get("cartonNumber") != null && !jsonObj.get("cartonNumber").isJsonNull()) && !jsonObj.get("cartonNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cartonNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cartonNumber").toString()));
      }
      if ((jsonObj.get("quantityInBox") != null && !jsonObj.get("quantityInBox").isJsonNull()) && !jsonObj.get("quantityInBox").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantityInBox` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantityInBox").toString()));
      }
      if (jsonObj.get("serialNumbers") != null && !jsonObj.get("serialNumbers").isJsonNull()) {
        JsonArray jsonArrayserialNumbers = jsonObj.getAsJsonArray("serialNumbers");
        if (jsonArrayserialNumbers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serialNumbers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serialNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("serialNumbers").toString()));
          }

          // validate the optional field `serialNumbers` (array)
          for (int i = 0; i < jsonArrayserialNumbers.size(); i++) {
            OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner.validateJsonElement(jsonArrayserialNumbers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner
  */
  public static OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

