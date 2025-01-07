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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner;

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
 * OrderCreateV7ResponseResourceOrdersInnerLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T05:01:51.614791330Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderCreateV7ResponseResourceOrdersInnerLinesInner {
  public static final String SERIALIZED_NAME_SUB_ORDER_NUMBER = "subOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_NUMBER)
  @javax.annotation.Nullable
  private String subOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_LINE_NUMBER = "ingramLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_LINE_NUMBER)
  @javax.annotation.Nullable
  private String ingramLineNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  @javax.annotation.Nullable
  private String customerLineNumber;

  public static final String SERIALIZED_NAME_LINE_STATUS = "lineStatus";
  @SerializedName(SERIALIZED_NAME_LINE_STATUS)
  @javax.annotation.Nullable
  private String lineStatus;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  @javax.annotation.Nullable
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  @javax.annotation.Nullable
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_EXTENDED_UNIT_PRICE = "extendedUnitPrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_UNIT_PRICE)
  @javax.annotation.Nullable
  private BigDecimal extendedUnitPrice;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  @javax.annotation.Nullable
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_QUANTITY_CONFIRMED = "quantityConfirmed";
  @SerializedName(SERIALIZED_NAME_QUANTITY_CONFIRMED)
  @javax.annotation.Nullable
  private Integer quantityConfirmed;

  public static final String SERIALIZED_NAME_QUANTITY_BACK_ORDERED = "quantityBackOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_BACK_ORDERED)
  @javax.annotation.Nullable
  private Integer quantityBackOrdered;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  @javax.annotation.Nullable
  private String notes;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  @javax.annotation.Nullable
  private List<OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner> shipmentDetails = new ArrayList<>();

  public OrderCreateV7ResponseResourceOrdersInnerLinesInner() {
  }

  public OrderCreateV7ResponseResourceOrdersInnerLinesInner subOrderNumber(@javax.annotation.Nullable String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
    return this;
  }

  /**
   * The sub order number. The two-digit prefix is the warehouse code of the warehouse nearest the reseller. The middle number is the order number. The two-digit suffix is the sub order number.
   * @return subOrderNumber
   */
  @javax.annotation.Nullable
  public String getSubOrderNumber() {
    return subOrderNumber;
  }

  public void setSubOrderNumber(@javax.annotation.Nullable String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner ingramLineNumber(@javax.annotation.Nullable String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
    return this;
  }

  /**
   * The Ingram Micro line number for the product.
   * @return ingramLineNumber
   */
  @javax.annotation.Nullable
  public String getIngramLineNumber() {
    return ingramLineNumber;
  }

  public void setIngramLineNumber(@javax.annotation.Nullable String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner customerLineNumber(@javax.annotation.Nullable String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

  /**
   * The reseller&#39;s line number for reference in their system.
   * @return customerLineNumber
   */
  @javax.annotation.Nullable
  public String getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(@javax.annotation.Nullable String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner lineStatus(@javax.annotation.Nullable String lineStatus) {
    this.lineStatus = lineStatus;
    return this;
  }

  /**
   * The status for the line item in the order. One of: Backordered, Open
   * @return lineStatus
   */
  @javax.annotation.Nullable
  public String getLineStatus() {
    return lineStatus;
  }

  public void setLineStatus(@javax.annotation.Nullable String lineStatus) {
    this.lineStatus = lineStatus;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner ingramPartNumber(@javax.annotation.Nullable String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * The Ingram Micro part number for the line item.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(@javax.annotation.Nullable String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner unitPrice(@javax.annotation.Nullable BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The unit price for the line item.
   * @return unitPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(@javax.annotation.Nullable BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner extendedUnitPrice(@javax.annotation.Nullable BigDecimal extendedUnitPrice) {
    this.extendedUnitPrice = extendedUnitPrice;
    return this;
  }

  /**
   * The extended list price (unit price X quantity) for the line item.
   * @return extendedUnitPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getExtendedUnitPrice() {
    return extendedUnitPrice;
  }

  public void setExtendedUnitPrice(@javax.annotation.Nullable BigDecimal extendedUnitPrice) {
    this.extendedUnitPrice = extendedUnitPrice;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner quantityOrdered(@javax.annotation.Nullable Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

  /**
   * The quantity of the line item ordered.
   * @return quantityOrdered
   */
  @javax.annotation.Nullable
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(@javax.annotation.Nullable Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner quantityConfirmed(@javax.annotation.Nullable Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
    return this;
  }

  /**
   * The quantity of the line item that has been confirmed.
   * @return quantityConfirmed
   */
  @javax.annotation.Nullable
  public Integer getQuantityConfirmed() {
    return quantityConfirmed;
  }

  public void setQuantityConfirmed(@javax.annotation.Nullable Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner quantityBackOrdered(@javax.annotation.Nullable Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
    return this;
  }

  /**
   * The quantity of the line item that is backordered.
   * @return quantityBackOrdered
   */
  @javax.annotation.Nullable
  public Integer getQuantityBackOrdered() {
    return quantityBackOrdered;
  }

  public void setQuantityBackOrdered(@javax.annotation.Nullable Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner notes(@javax.annotation.Nullable String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Line-level notes.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(@javax.annotation.Nullable String notes) {
    this.notes = notes;
  }


  public OrderCreateV7ResponseResourceOrdersInnerLinesInner shipmentDetails(@javax.annotation.Nullable List<OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  public OrderCreateV7ResponseResourceOrdersInnerLinesInner addShipmentDetailsItem(OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner shipmentDetailsItem) {
    if (this.shipmentDetails == null) {
      this.shipmentDetails = new ArrayList<>();
    }
    this.shipmentDetails.add(shipmentDetailsItem);
    return this;
  }

  /**
   * The shipment details for the line item.
   * @return shipmentDetails
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner> getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(@javax.annotation.Nullable List<OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7ResponseResourceOrdersInnerLinesInner orderCreateV7ResponseResourceOrdersInnerLinesInner = (OrderCreateV7ResponseResourceOrdersInnerLinesInner) o;
    return Objects.equals(this.subOrderNumber, orderCreateV7ResponseResourceOrdersInnerLinesInner.subOrderNumber) &&
        Objects.equals(this.ingramLineNumber, orderCreateV7ResponseResourceOrdersInnerLinesInner.ingramLineNumber) &&
        Objects.equals(this.customerLineNumber, orderCreateV7ResponseResourceOrdersInnerLinesInner.customerLineNumber) &&
        Objects.equals(this.lineStatus, orderCreateV7ResponseResourceOrdersInnerLinesInner.lineStatus) &&
        Objects.equals(this.ingramPartNumber, orderCreateV7ResponseResourceOrdersInnerLinesInner.ingramPartNumber) &&
        Objects.equals(this.unitPrice, orderCreateV7ResponseResourceOrdersInnerLinesInner.unitPrice) &&
        Objects.equals(this.extendedUnitPrice, orderCreateV7ResponseResourceOrdersInnerLinesInner.extendedUnitPrice) &&
        Objects.equals(this.quantityOrdered, orderCreateV7ResponseResourceOrdersInnerLinesInner.quantityOrdered) &&
        Objects.equals(this.quantityConfirmed, orderCreateV7ResponseResourceOrdersInnerLinesInner.quantityConfirmed) &&
        Objects.equals(this.quantityBackOrdered, orderCreateV7ResponseResourceOrdersInnerLinesInner.quantityBackOrdered) &&
        Objects.equals(this.notes, orderCreateV7ResponseResourceOrdersInnerLinesInner.notes) &&
        Objects.equals(this.shipmentDetails, orderCreateV7ResponseResourceOrdersInnerLinesInner.shipmentDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subOrderNumber, ingramLineNumber, customerLineNumber, lineStatus, ingramPartNumber, unitPrice, extendedUnitPrice, quantityOrdered, quantityConfirmed, quantityBackOrdered, notes, shipmentDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7ResponseResourceOrdersInnerLinesInner {\n");
    sb.append("    subOrderNumber: ").append(toIndentedString(subOrderNumber)).append("\n");
    sb.append("    ingramLineNumber: ").append(toIndentedString(ingramLineNumber)).append("\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    lineStatus: ").append(toIndentedString(lineStatus)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    extendedUnitPrice: ").append(toIndentedString(extendedUnitPrice)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityConfirmed: ").append(toIndentedString(quantityConfirmed)).append("\n");
    sb.append("    quantityBackOrdered: ").append(toIndentedString(quantityBackOrdered)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
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
    openapiFields.add("subOrderNumber");
    openapiFields.add("ingramLineNumber");
    openapiFields.add("customerLineNumber");
    openapiFields.add("lineStatus");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("unitPrice");
    openapiFields.add("extendedUnitPrice");
    openapiFields.add("quantityOrdered");
    openapiFields.add("quantityConfirmed");
    openapiFields.add("quantityBackOrdered");
    openapiFields.add("notes");
    openapiFields.add("shipmentDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7ResponseResourceOrdersInnerLinesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7ResponseResourceOrdersInnerLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7ResponseResourceOrdersInnerLinesInner is not found in the empty JSON string", OrderCreateV7ResponseResourceOrdersInnerLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7ResponseResourceOrdersInnerLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7ResponseResourceOrdersInnerLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subOrderNumber") != null && !jsonObj.get("subOrderNumber").isJsonNull()) && !jsonObj.get("subOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramLineNumber") != null && !jsonObj.get("ingramLineNumber").isJsonNull()) && !jsonObj.get("ingramLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramLineNumber").toString()));
      }
      if ((jsonObj.get("customerLineNumber") != null && !jsonObj.get("customerLineNumber").isJsonNull()) && !jsonObj.get("customerLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLineNumber").toString()));
      }
      if ((jsonObj.get("lineStatus") != null && !jsonObj.get("lineStatus").isJsonNull()) && !jsonObj.get("lineStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineStatus").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (jsonObj.get("shipmentDetails") != null && !jsonObj.get("shipmentDetails").isJsonNull()) {
        JsonArray jsonArrayshipmentDetails = jsonObj.getAsJsonArray("shipmentDetails");
        if (jsonArrayshipmentDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipmentDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipmentDetails` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentDetails").toString()));
          }

          // validate the optional field `shipmentDetails` (array)
          for (int i = 0; i < jsonArrayshipmentDetails.size(); i++) {
            OrderCreateV7ResponseResourceOrdersInnerLinesInnerShipmentDetailsInner.validateJsonElement(jsonArrayshipmentDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7ResponseResourceOrdersInnerLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7ResponseResourceOrdersInnerLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7ResponseResourceOrdersInnerLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7ResponseResourceOrdersInnerLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7ResponseResourceOrdersInnerLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7ResponseResourceOrdersInnerLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7ResponseResourceOrdersInnerLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7ResponseResourceOrdersInnerLinesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7ResponseResourceOrdersInnerLinesInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7ResponseResourceOrdersInnerLinesInner
   */
  public static OrderCreateV7ResponseResourceOrdersInnerLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7ResponseResourceOrdersInnerLinesInner.class);
  }

  /**
   * Convert an instance of OrderCreateV7ResponseResourceOrdersInnerLinesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

