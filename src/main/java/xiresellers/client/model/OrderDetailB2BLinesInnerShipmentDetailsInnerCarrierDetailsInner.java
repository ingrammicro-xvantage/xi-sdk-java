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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner;

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
 * OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-09T07:08:41.679399Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_CARRIER_NAME = "carrierName";
  @SerializedName(SERIALIZED_NAME_CARRIER_NAME)
  private String carrierName;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_SHIPPED_DATE = "shippedDate";
  @SerializedName(SERIALIZED_NAME_SHIPPED_DATE)
  private String shippedDate;

  public static final String SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE = "estimatedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE)
  private String estimatedDeliveryDate;

  public static final String SERIALIZED_NAME_DELIVERED_DATE = "deliveredDate";
  @SerializedName(SERIALIZED_NAME_DELIVERED_DATE)
  private String deliveredDate;

  public static final String SERIALIZED_NAME_CARRIER_PICKUP_DATE = "carrierPickupDate";
  @SerializedName(SERIALIZED_NAME_CARRIER_PICKUP_DATE)
  private String carrierPickupDate;

  public static final String SERIALIZED_NAME_TRACKING_DETAILS = "trackingDetails";
  @SerializedName(SERIALIZED_NAME_TRACKING_DETAILS)
  private List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner> trackingDetails;

  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner() {
  }

  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner carrierCode(String carrierCode) {
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


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner carrierName(String carrierName) {
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


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity shipped of the line item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner shippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }

   /**
   * The actual date when line item shipped.
   * @return shippedDate
  **/
  @javax.annotation.Nullable
  public String getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner estimatedDeliveryDate(String estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

   /**
   * The date the line item is expected to be delivered.
   * @return estimatedDeliveryDate
  **/
  @javax.annotation.Nullable
  public String getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner deliveredDate(String deliveredDate) {
    this.deliveredDate = deliveredDate;
    return this;
  }

   /**
   * The actual date of delivery of the line item.
   * @return deliveredDate
  **/
  @javax.annotation.Nullable
  public String getDeliveredDate() {
    return deliveredDate;
  }

  public void setDeliveredDate(String deliveredDate) {
    this.deliveredDate = deliveredDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner carrierPickupDate(String carrierPickupDate) {
    this.carrierPickupDate = carrierPickupDate;
    return this;
  }

   /**
   * The actual date when carrier picked up line item.
   * @return carrierPickupDate
  **/
  @javax.annotation.Nullable
  public String getCarrierPickupDate() {
    return carrierPickupDate;
  }

  public void setCarrierPickupDate(String carrierPickupDate) {
    this.carrierPickupDate = carrierPickupDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner trackingDetails(List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner> trackingDetails) {
    this.trackingDetails = trackingDetails;
    return this;
  }

  public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner addTrackingDetailsItem(OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner trackingDetailsItem) {
    if (this.trackingDetails == null) {
      this.trackingDetails = new ArrayList<>();
    }
    this.trackingDetails.add(trackingDetailsItem);
    return this;
  }

   /**
   * The tracking details for the shipment containing the line item.
   * @return trackingDetails
  **/
  @javax.annotation.Nullable
  public List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner> getTrackingDetails() {
    return trackingDetails;
  }

  public void setTrackingDetails(List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner> trackingDetails) {
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
    OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner = (OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner) o;
    return Objects.equals(this.carrierCode, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.carrierCode) &&
        Objects.equals(this.carrierName, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.carrierName) &&
        Objects.equals(this.quantity, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.quantity) &&
        Objects.equals(this.shippedDate, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.shippedDate) &&
        Objects.equals(this.estimatedDeliveryDate, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.estimatedDeliveryDate) &&
        Objects.equals(this.deliveredDate, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.deliveredDate) &&
        Objects.equals(this.carrierPickupDate, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.carrierPickupDate) &&
        Objects.equals(this.trackingDetails, orderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.trackingDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, carrierName, quantity, shippedDate, estimatedDeliveryDate, deliveredDate, carrierPickupDate, trackingDetails);
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
    sb.append("class OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    carrierName: ").append(toIndentedString(carrierName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    carrierPickupDate: ").append(toIndentedString(carrierPickupDate)).append("\n");
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
    openapiFields.add("quantity");
    openapiFields.add("shippedDate");
    openapiFields.add("estimatedDeliveryDate");
    openapiFields.add("deliveredDate");
    openapiFields.add("carrierPickupDate");
    openapiFields.add("trackingDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner is not found in the empty JSON string", OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("carrierName") != null && !jsonObj.get("carrierName").isJsonNull()) && !jsonObj.get("carrierName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierName").toString()));
      }
      if ((jsonObj.get("shippedDate") != null && !jsonObj.get("shippedDate").isJsonNull()) && !jsonObj.get("shippedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippedDate").toString()));
      }
      if ((jsonObj.get("estimatedDeliveryDate") != null && !jsonObj.get("estimatedDeliveryDate").isJsonNull()) && !jsonObj.get("estimatedDeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimatedDeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimatedDeliveryDate").toString()));
      }
      if ((jsonObj.get("deliveredDate") != null && !jsonObj.get("deliveredDate").isJsonNull()) && !jsonObj.get("deliveredDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveredDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveredDate").toString()));
      }
      if ((jsonObj.get("carrierPickupDate") != null && !jsonObj.get("carrierPickupDate").isJsonNull()) && !jsonObj.get("carrierPickupDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierPickupDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierPickupDate").toString()));
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
            OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.validateJsonElement(jsonArraytrackingDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner
  */
  public static OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

