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
import xiresellers.client.model.OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner;

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
 * OrderDetailB2BLinesInnerShipmentDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T08:54:01.152945Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderDetailB2BLinesInnerShipmentDetailsInner {
  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_DELIVERY_NUMBER = "deliveryNumber";
  @SerializedName(SERIALIZED_NAME_DELIVERY_NUMBER)
  private String deliveryNumber;

  public static final String SERIALIZED_NAME_ESTIMATED_SHIP_DATE = "estimatedShipDate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_SHIP_DATE)
  private String estimatedShipDate;

  public static final String SERIALIZED_NAME_SHIPPED_DATE = "shippedDate";
  @SerializedName(SERIALIZED_NAME_SHIPPED_DATE)
  private String shippedDate;

  public static final String SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE = "estimatedDeliveryDate";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DELIVERY_DATE)
  private String estimatedDeliveryDate;

  public static final String SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID = "shipFromWarehouseId";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_WAREHOUSE_ID)
  private String shipFromWarehouseId;

  public static final String SERIALIZED_NAME_SHIP_FROM_LOCATION = "shipFromLocation";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_LOCATION)
  private String shipFromLocation;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_CARRIER_DETAILS = "carrierDetails";
  @SerializedName(SERIALIZED_NAME_CARRIER_DETAILS)
  private List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner> carrierDetails;

  public OrderDetailB2BLinesInnerShipmentDetailsInner() {
  }

  public OrderDetailB2BLinesInnerShipmentDetailsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity shipped of the line item.
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner deliveryNumber(String deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
    return this;
  }

  /**
   * The actual date of delivery of the line item.
   * @return deliveryNumber
   */
  @javax.annotation.Nullable
  public String getDeliveryNumber() {
    return deliveryNumber;
  }

  public void setDeliveryNumber(String deliveryNumber) {
    this.deliveryNumber = deliveryNumber;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner estimatedShipDate(String estimatedShipDate) {
    this.estimatedShipDate = estimatedShipDate;
    return this;
  }

  /**
   * The date the line item is expected to be shipped.
   * @return estimatedShipDate
   */
  @javax.annotation.Nullable
  public String getEstimatedShipDate() {
    return estimatedShipDate;
  }

  public void setEstimatedShipDate(String estimatedShipDate) {
    this.estimatedShipDate = estimatedShipDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner shippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }

  /**
   * Get shippedDate
   * @return shippedDate
   */
  @javax.annotation.Nullable
  public String getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner estimatedDeliveryDate(String estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
    return this;
  }

  /**
   * Get estimatedDeliveryDate
   * @return estimatedDeliveryDate
   */
  @javax.annotation.Nullable
  public String getEstimatedDeliveryDate() {
    return estimatedDeliveryDate;
  }

  public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
    this.estimatedDeliveryDate = estimatedDeliveryDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner shipFromWarehouseId(String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
    return this;
  }

  /**
   * The ID of the warehouse the product will ship from.
   * @return shipFromWarehouseId
   */
  @javax.annotation.Nullable
  public String getShipFromWarehouseId() {
    return shipFromWarehouseId;
  }

  public void setShipFromWarehouseId(String shipFromWarehouseId) {
    this.shipFromWarehouseId = shipFromWarehouseId;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner shipFromLocation(String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
    return this;
  }

  /**
   * The city and state the line item ships from.
   * @return shipFromLocation
   */
  @javax.annotation.Nullable
  public String getShipFromLocation() {
    return shipFromLocation;
  }

  public void setShipFromLocation(String shipFromLocation) {
    this.shipFromLocation = shipFromLocation;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * The Ingram Micro invoice number for the line item.
   * @return invoiceNumber
   */
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  /**
   * The date the IngramMicro invoice was created for the line item.
   * @return invoiceDate
   */
  @javax.annotation.Nullable
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public OrderDetailB2BLinesInnerShipmentDetailsInner carrierDetails(List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner> carrierDetails) {
    this.carrierDetails = carrierDetails;
    return this;
  }

  public OrderDetailB2BLinesInnerShipmentDetailsInner addCarrierDetailsItem(OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner carrierDetailsItem) {
    if (this.carrierDetails == null) {
      this.carrierDetails = new ArrayList<>();
    }
    this.carrierDetails.add(carrierDetailsItem);
    return this;
  }

  /**
   * The shipment carrier details for the line item.
   * @return carrierDetails
   */
  @javax.annotation.Nullable
  public List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner> getCarrierDetails() {
    return carrierDetails;
  }

  public void setCarrierDetails(List<OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner> carrierDetails) {
    this.carrierDetails = carrierDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerShipmentDetailsInner orderDetailB2BLinesInnerShipmentDetailsInner = (OrderDetailB2BLinesInnerShipmentDetailsInner) o;
    return Objects.equals(this.quantity, orderDetailB2BLinesInnerShipmentDetailsInner.quantity) &&
        Objects.equals(this.deliveryNumber, orderDetailB2BLinesInnerShipmentDetailsInner.deliveryNumber) &&
        Objects.equals(this.estimatedShipDate, orderDetailB2BLinesInnerShipmentDetailsInner.estimatedShipDate) &&
        Objects.equals(this.shippedDate, orderDetailB2BLinesInnerShipmentDetailsInner.shippedDate) &&
        Objects.equals(this.estimatedDeliveryDate, orderDetailB2BLinesInnerShipmentDetailsInner.estimatedDeliveryDate) &&
        Objects.equals(this.shipFromWarehouseId, orderDetailB2BLinesInnerShipmentDetailsInner.shipFromWarehouseId) &&
        Objects.equals(this.shipFromLocation, orderDetailB2BLinesInnerShipmentDetailsInner.shipFromLocation) &&
        Objects.equals(this.invoiceNumber, orderDetailB2BLinesInnerShipmentDetailsInner.invoiceNumber) &&
        Objects.equals(this.invoiceDate, orderDetailB2BLinesInnerShipmentDetailsInner.invoiceDate) &&
        Objects.equals(this.carrierDetails, orderDetailB2BLinesInnerShipmentDetailsInner.carrierDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, deliveryNumber, estimatedShipDate, shippedDate, estimatedDeliveryDate, shipFromWarehouseId, shipFromLocation, invoiceNumber, invoiceDate, carrierDetails);
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
    sb.append("class OrderDetailB2BLinesInnerShipmentDetailsInner {\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    deliveryNumber: ").append(toIndentedString(deliveryNumber)).append("\n");
    sb.append("    estimatedShipDate: ").append(toIndentedString(estimatedShipDate)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    estimatedDeliveryDate: ").append(toIndentedString(estimatedDeliveryDate)).append("\n");
    sb.append("    shipFromWarehouseId: ").append(toIndentedString(shipFromWarehouseId)).append("\n");
    sb.append("    shipFromLocation: ").append(toIndentedString(shipFromLocation)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    carrierDetails: ").append(toIndentedString(carrierDetails)).append("\n");
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
    openapiFields.add("quantity");
    openapiFields.add("deliveryNumber");
    openapiFields.add("estimatedShipDate");
    openapiFields.add("shippedDate");
    openapiFields.add("estimatedDeliveryDate");
    openapiFields.add("shipFromWarehouseId");
    openapiFields.add("shipFromLocation");
    openapiFields.add("invoiceNumber");
    openapiFields.add("invoiceDate");
    openapiFields.add("carrierDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerShipmentDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerShipmentDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerShipmentDetailsInner is not found in the empty JSON string", OrderDetailB2BLinesInnerShipmentDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerShipmentDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerShipmentDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("deliveryNumber") != null && !jsonObj.get("deliveryNumber").isJsonNull()) && !jsonObj.get("deliveryNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deliveryNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deliveryNumber").toString()));
      }
      if ((jsonObj.get("estimatedShipDate") != null && !jsonObj.get("estimatedShipDate").isJsonNull()) && !jsonObj.get("estimatedShipDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimatedShipDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimatedShipDate").toString()));
      }
      if ((jsonObj.get("shippedDate") != null && !jsonObj.get("shippedDate").isJsonNull()) && !jsonObj.get("shippedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippedDate").toString()));
      }
      if ((jsonObj.get("estimatedDeliveryDate") != null && !jsonObj.get("estimatedDeliveryDate").isJsonNull()) && !jsonObj.get("estimatedDeliveryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimatedDeliveryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimatedDeliveryDate").toString()));
      }
      if ((jsonObj.get("shipFromWarehouseId") != null && !jsonObj.get("shipFromWarehouseId").isJsonNull()) && !jsonObj.get("shipFromWarehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromWarehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromWarehouseId").toString()));
      }
      if ((jsonObj.get("shipFromLocation") != null && !jsonObj.get("shipFromLocation").isJsonNull()) && !jsonObj.get("shipFromLocation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromLocation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromLocation").toString()));
      }
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      if ((jsonObj.get("invoiceDate") != null && !jsonObj.get("invoiceDate").isJsonNull()) && !jsonObj.get("invoiceDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceDate").toString()));
      }
      if (jsonObj.get("carrierDetails") != null && !jsonObj.get("carrierDetails").isJsonNull()) {
        JsonArray jsonArraycarrierDetails = jsonObj.getAsJsonArray("carrierDetails");
        if (jsonArraycarrierDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("carrierDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `carrierDetails` to be an array in the JSON string but got `%s`", jsonObj.get("carrierDetails").toString()));
          }

          // validate the optional field `carrierDetails` (array)
          for (int i = 0; i < jsonArraycarrierDetails.size(); i++) {
            OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.validateJsonElement(jsonArraycarrierDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerShipmentDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerShipmentDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerShipmentDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerShipmentDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerShipmentDetailsInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerShipmentDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerShipmentDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderDetailB2BLinesInnerShipmentDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderDetailB2BLinesInnerShipmentDetailsInner
   * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerShipmentDetailsInner
   */
  public static OrderDetailB2BLinesInnerShipmentDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerShipmentDetailsInner.class);
  }

  /**
   * Convert an instance of OrderDetailB2BLinesInnerShipmentDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

