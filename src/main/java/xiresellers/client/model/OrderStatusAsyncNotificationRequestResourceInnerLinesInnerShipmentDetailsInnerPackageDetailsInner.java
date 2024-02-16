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
 * OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T05:46:16.662413Z[Etc/UTC]")
public class OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner {
  public static final String SERIALIZED_NAME_CARTON_NUMBER = "cartonNumber";
  @SerializedName(SERIALIZED_NAME_CARTON_NUMBER)
  private String cartonNumber;

  public static final String SERIALIZED_NAME_QUANTITY_INBOX = "quantityInbox";
  @SerializedName(SERIALIZED_NAME_QUANTITY_INBOX)
  private String quantityInbox;

  public static final String SERIALIZED_NAME_TRACKING_NUMBER = "trackingNumber";
  @SerializedName(SERIALIZED_NAME_TRACKING_NUMBER)
  private String trackingNumber;

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner() {
  }

  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner cartonNumber(String cartonNumber) {
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


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner quantityInbox(String quantityInbox) {
    this.quantityInbox = quantityInbox;
    return this;
  }

   /**
   * The quantity of line items in the box.
   * @return quantityInbox
  **/
  @javax.annotation.Nullable
  public String getQuantityInbox() {
    return quantityInbox;
  }

  public void setQuantityInbox(String quantityInbox) {
    this.quantityInbox = quantityInbox;
  }


  public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner trackingNumber(String trackingNumber) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner = (OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner) o;
    return Objects.equals(this.cartonNumber, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.cartonNumber) &&
        Objects.equals(this.quantityInbox, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.quantityInbox) &&
        Objects.equals(this.trackingNumber, orderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.trackingNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartonNumber, quantityInbox, trackingNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner {\n");
    sb.append("    cartonNumber: ").append(toIndentedString(cartonNumber)).append("\n");
    sb.append("    quantityInbox: ").append(toIndentedString(quantityInbox)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
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
    openapiFields.add("cartonNumber");
    openapiFields.add("quantityInbox");
    openapiFields.add("trackingNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner is not found in the empty JSON string", OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("cartonNumber") != null && !jsonObj.get("cartonNumber").isJsonNull()) && !jsonObj.get("cartonNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cartonNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cartonNumber").toString()));
      }
      if ((jsonObj.get("quantityInbox") != null && !jsonObj.get("quantityInbox").isJsonNull()) && !jsonObj.get("quantityInbox").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantityInbox` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantityInbox").toString()));
      }
      if ((jsonObj.get("trackingNumber") != null && !jsonObj.get("trackingNumber").isJsonNull()) && !jsonObj.get("trackingNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trackingNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner
  */
  public static OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.class);
  }

 /**
  * Convert an instance of OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

