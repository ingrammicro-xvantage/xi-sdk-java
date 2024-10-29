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
import xiresellers.client.model.OrderModifyResponseLinesInnerAdditionalAttributesInner;
import xiresellers.client.model.OrderModifyResponseLinesInnerShipmentDetails;

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
 * OrderModifyResponseLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T04:46:41.573902Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderModifyResponseLinesInner {
  public static final String SERIALIZED_NAME_SUB_ORDER_NUMBER = "subOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_NUMBER)
  private String subOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_LINE_NUMBER = "ingramLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_LINE_NUMBER)
  private String ingramLineNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_QUANTITY_CONFIRMED = "quantityConfirmed";
  @SerializedName(SERIALIZED_NAME_QUANTITY_CONFIRMED)
  private Integer quantityConfirmed;

  public static final String SERIALIZED_NAME_QUANTITY_BACK_ORDERED = "quantityBackOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_BACK_ORDERED)
  private Integer quantityBackOrdered;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private OrderModifyResponseLinesInnerShipmentDetails shipmentDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderModifyResponseLinesInnerAdditionalAttributesInner> additionalAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public OrderModifyResponseLinesInner() {
  }

  public OrderModifyResponseLinesInner subOrderNumber(String subOrderNumber) {
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

  public void setSubOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
  }


  public OrderModifyResponseLinesInner ingramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
    return this;
  }

  /**
   * The IngramMicro line number.
   * @return ingramLineNumber
   */
  @javax.annotation.Nullable
  public String getIngramLineNumber() {
    return ingramLineNumber;
  }

  public void setIngramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
  }


  public OrderModifyResponseLinesInner customerLineNumber(String customerLineNumber) {
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

  public void setCustomerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public OrderModifyResponseLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * The unique IngramMicro part number for the line item.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderModifyResponseLinesInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * The vendor&#39;s part number for the line item.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public OrderModifyResponseLinesInner quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

  /**
   * The quantity ordered of the line item.
   * @return quantityOrdered
   */
  @javax.annotation.Nullable
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public OrderModifyResponseLinesInner quantityConfirmed(Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
    return this;
  }

  /**
   * The quantity confirmed of the line item.
   * @return quantityConfirmed
   */
  @javax.annotation.Nullable
  public Integer getQuantityConfirmed() {
    return quantityConfirmed;
  }

  public void setQuantityConfirmed(Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
  }


  public OrderModifyResponseLinesInner quantityBackOrdered(Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
    return this;
  }

  /**
   * The quantity backordered of the line item.
   * @return quantityBackOrdered
   */
  @javax.annotation.Nullable
  public Integer getQuantityBackOrdered() {
    return quantityBackOrdered;
  }

  public void setQuantityBackOrdered(Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
  }


  public OrderModifyResponseLinesInner shipmentDetails(OrderModifyResponseLinesInnerShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  /**
   * Get shipmentDetails
   * @return shipmentDetails
   */
  @javax.annotation.Nullable
  public OrderModifyResponseLinesInnerShipmentDetails getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(OrderModifyResponseLinesInnerShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public OrderModifyResponseLinesInner additionalAttributes(List<OrderModifyResponseLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderModifyResponseLinesInner addAdditionalAttributesItem(OrderModifyResponseLinesInnerAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

  /**
   * SAP requested and country-specific line level details.
   * @return additionalAttributes
   */
  @javax.annotation.Nullable
  public List<OrderModifyResponseLinesInnerAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderModifyResponseLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  public OrderModifyResponseLinesInner notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Line-level notes for the order.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyResponseLinesInner orderModifyResponseLinesInner = (OrderModifyResponseLinesInner) o;
    return Objects.equals(this.subOrderNumber, orderModifyResponseLinesInner.subOrderNumber) &&
        Objects.equals(this.ingramLineNumber, orderModifyResponseLinesInner.ingramLineNumber) &&
        Objects.equals(this.customerLineNumber, orderModifyResponseLinesInner.customerLineNumber) &&
        Objects.equals(this.ingramPartNumber, orderModifyResponseLinesInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, orderModifyResponseLinesInner.vendorPartNumber) &&
        Objects.equals(this.quantityOrdered, orderModifyResponseLinesInner.quantityOrdered) &&
        Objects.equals(this.quantityConfirmed, orderModifyResponseLinesInner.quantityConfirmed) &&
        Objects.equals(this.quantityBackOrdered, orderModifyResponseLinesInner.quantityBackOrdered) &&
        Objects.equals(this.shipmentDetails, orderModifyResponseLinesInner.shipmentDetails) &&
        Objects.equals(this.additionalAttributes, orderModifyResponseLinesInner.additionalAttributes) &&
        Objects.equals(this.notes, orderModifyResponseLinesInner.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subOrderNumber, ingramLineNumber, customerLineNumber, ingramPartNumber, vendorPartNumber, quantityOrdered, quantityConfirmed, quantityBackOrdered, shipmentDetails, additionalAttributes, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyResponseLinesInner {\n");
    sb.append("    subOrderNumber: ").append(toIndentedString(subOrderNumber)).append("\n");
    sb.append("    ingramLineNumber: ").append(toIndentedString(ingramLineNumber)).append("\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityConfirmed: ").append(toIndentedString(quantityConfirmed)).append("\n");
    sb.append("    quantityBackOrdered: ").append(toIndentedString(quantityBackOrdered)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("quantityOrdered");
    openapiFields.add("quantityConfirmed");
    openapiFields.add("quantityBackOrdered");
    openapiFields.add("shipmentDetails");
    openapiFields.add("additionalAttributes");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderModifyResponseLinesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyResponseLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyResponseLinesInner is not found in the empty JSON string", OrderModifyResponseLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyResponseLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyResponseLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      // validate the optional field `shipmentDetails`
      if (jsonObj.get("shipmentDetails") != null && !jsonObj.get("shipmentDetails").isJsonNull()) {
        OrderModifyResponseLinesInnerShipmentDetails.validateJsonElement(jsonObj.get("shipmentDetails"));
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            OrderModifyResponseLinesInnerAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyResponseLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyResponseLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyResponseLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyResponseLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyResponseLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderModifyResponseLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyResponseLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderModifyResponseLinesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderModifyResponseLinesInner
   * @throws IOException if the JSON string is invalid with respect to OrderModifyResponseLinesInner
   */
  public static OrderModifyResponseLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyResponseLinesInner.class);
  }

  /**
   * Convert an instance of OrderModifyResponseLinesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

