/*
 * XI Sdk Resellers
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner;
import xiresellers.client.model.OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner;

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
 * OrderCreateResponseOrdersInnerLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T08:44:05.228708Z[Etc/UTC]")
public class OrderCreateResponseOrdersInnerLinesInner {
  public static final String SERIALIZED_NAME_SUB_ORDER_NUMBER = "subOrderNumber";
  @SerializedName(SERIALIZED_NAME_SUB_ORDER_NUMBER)
  private String subOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_LINE_NUMBER = "ingramLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_LINE_NUMBER)
  private String ingramLineNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber;

  public static final String SERIALIZED_NAME_LINE_STATUS = "lineStatus";
  @SerializedName(SERIALIZED_NAME_LINE_STATUS)
  private String lineStatus;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_EXTENDED_UNIT_PRICE = "extendedUnitPrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_UNIT_PRICE)
  private BigDecimal extendedUnitPrice;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_QUANTITY_CONFIRMED = "quantityConfirmed";
  @SerializedName(SERIALIZED_NAME_QUANTITY_CONFIRMED)
  private Integer quantityConfirmed;

  public static final String SERIALIZED_NAME_QUANTITY_BACK_ORDERED = "quantityBackOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_BACK_ORDERED)
  private Integer quantityBackOrdered;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private List<OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner> shipmentDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner> additionalAttributes;

  public OrderCreateResponseOrdersInnerLinesInner() {
  }

  public OrderCreateResponseOrdersInnerLinesInner subOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
    return this;
  }

   /**
   * The sub order number. The two-digit prefix is the warehouse code of the warehouse nearest the reseller. The middle number is the order number. The two-digit suffix is the sub order number.
   * @return subOrderNumber
  **/
  @javax.annotation.Nullable
  public String getSubOrderNumber() {
    return subOrderNumber;
  }

  public void setSubOrderNumber(String subOrderNumber) {
    this.subOrderNumber = subOrderNumber;
  }


  public OrderCreateResponseOrdersInnerLinesInner ingramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
    return this;
  }

   /**
   * The Ingram Micro line number for the product.
   * @return ingramLineNumber
  **/
  @javax.annotation.Nullable
  public String getIngramLineNumber() {
    return ingramLineNumber;
  }

  public void setIngramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
  }


  public OrderCreateResponseOrdersInnerLinesInner customerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

   /**
   * The reseller&#39;s line number for reference in their system.
   * @return customerLineNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public OrderCreateResponseOrdersInnerLinesInner lineStatus(String lineStatus) {
    this.lineStatus = lineStatus;
    return this;
  }

   /**
   * The status for the line item in the order. One of: Backordered, Open
   * @return lineStatus
  **/
  @javax.annotation.Nullable
  public String getLineStatus() {
    return lineStatus;
  }

  public void setLineStatus(String lineStatus) {
    this.lineStatus = lineStatus;
  }


  public OrderCreateResponseOrdersInnerLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * The Ingram Micro part number for the line item.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderCreateResponseOrdersInnerLinesInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * The vendor part number for the line item.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public OrderCreateResponseOrdersInnerLinesInner unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The unit price for the line item.
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderCreateResponseOrdersInnerLinesInner extendedUnitPrice(BigDecimal extendedUnitPrice) {
    this.extendedUnitPrice = extendedUnitPrice;
    return this;
  }

   /**
   * The extended list price (unit price X quantity) for the line item.
   * @return extendedUnitPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedUnitPrice() {
    return extendedUnitPrice;
  }

  public void setExtendedUnitPrice(BigDecimal extendedUnitPrice) {
    this.extendedUnitPrice = extendedUnitPrice;
  }


  public OrderCreateResponseOrdersInnerLinesInner quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The quantity of the line item ordered.
   * @return quantityOrdered
  **/
  @javax.annotation.Nullable
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public OrderCreateResponseOrdersInnerLinesInner quantityConfirmed(Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
    return this;
  }

   /**
   * The quantity of the line item that has been confirmed.
   * @return quantityConfirmed
  **/
  @javax.annotation.Nullable
  public Integer getQuantityConfirmed() {
    return quantityConfirmed;
  }

  public void setQuantityConfirmed(Integer quantityConfirmed) {
    this.quantityConfirmed = quantityConfirmed;
  }


  public OrderCreateResponseOrdersInnerLinesInner quantityBackOrdered(Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
    return this;
  }

   /**
   * The quantity of the line item that is backordered.
   * @return quantityBackOrdered
  **/
  @javax.annotation.Nullable
  public Integer getQuantityBackOrdered() {
    return quantityBackOrdered;
  }

  public void setQuantityBackOrdered(Integer quantityBackOrdered) {
    this.quantityBackOrdered = quantityBackOrdered;
  }


  public OrderCreateResponseOrdersInnerLinesInner specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * The bid number for the line item provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers.
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public OrderCreateResponseOrdersInnerLinesInner notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Line-level notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderCreateResponseOrdersInnerLinesInner shipmentDetails(List<OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  public OrderCreateResponseOrdersInnerLinesInner addShipmentDetailsItem(OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner shipmentDetailsItem) {
    if (this.shipmentDetails == null) {
      this.shipmentDetails = new ArrayList<>();
    }
    this.shipmentDetails.add(shipmentDetailsItem);
    return this;
  }

   /**
   * The shipment details for the line item.
   * @return shipmentDetails
  **/
  @javax.annotation.Nullable
  public List<OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner> getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(List<OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner> shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public OrderCreateResponseOrdersInnerLinesInner additionalAttributes(List<OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderCreateResponseOrdersInnerLinesInner addAdditionalAttributesItem(OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * SAP requested and country-specific line level details.
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  public List<OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponseOrdersInnerLinesInner orderCreateResponseOrdersInnerLinesInner = (OrderCreateResponseOrdersInnerLinesInner) o;
    return Objects.equals(this.subOrderNumber, orderCreateResponseOrdersInnerLinesInner.subOrderNumber) &&
        Objects.equals(this.ingramLineNumber, orderCreateResponseOrdersInnerLinesInner.ingramLineNumber) &&
        Objects.equals(this.customerLineNumber, orderCreateResponseOrdersInnerLinesInner.customerLineNumber) &&
        Objects.equals(this.lineStatus, orderCreateResponseOrdersInnerLinesInner.lineStatus) &&
        Objects.equals(this.ingramPartNumber, orderCreateResponseOrdersInnerLinesInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, orderCreateResponseOrdersInnerLinesInner.vendorPartNumber) &&
        Objects.equals(this.unitPrice, orderCreateResponseOrdersInnerLinesInner.unitPrice) &&
        Objects.equals(this.extendedUnitPrice, orderCreateResponseOrdersInnerLinesInner.extendedUnitPrice) &&
        Objects.equals(this.quantityOrdered, orderCreateResponseOrdersInnerLinesInner.quantityOrdered) &&
        Objects.equals(this.quantityConfirmed, orderCreateResponseOrdersInnerLinesInner.quantityConfirmed) &&
        Objects.equals(this.quantityBackOrdered, orderCreateResponseOrdersInnerLinesInner.quantityBackOrdered) &&
        Objects.equals(this.specialBidNumber, orderCreateResponseOrdersInnerLinesInner.specialBidNumber) &&
        Objects.equals(this.notes, orderCreateResponseOrdersInnerLinesInner.notes) &&
        Objects.equals(this.shipmentDetails, orderCreateResponseOrdersInnerLinesInner.shipmentDetails) &&
        Objects.equals(this.additionalAttributes, orderCreateResponseOrdersInnerLinesInner.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subOrderNumber, ingramLineNumber, customerLineNumber, lineStatus, ingramPartNumber, vendorPartNumber, unitPrice, extendedUnitPrice, quantityOrdered, quantityConfirmed, quantityBackOrdered, specialBidNumber, notes, shipmentDetails, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponseOrdersInnerLinesInner {\n");
    sb.append("    subOrderNumber: ").append(toIndentedString(subOrderNumber)).append("\n");
    sb.append("    ingramLineNumber: ").append(toIndentedString(ingramLineNumber)).append("\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    lineStatus: ").append(toIndentedString(lineStatus)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    extendedUnitPrice: ").append(toIndentedString(extendedUnitPrice)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityConfirmed: ").append(toIndentedString(quantityConfirmed)).append("\n");
    sb.append("    quantityBackOrdered: ").append(toIndentedString(quantityBackOrdered)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
    openapiFields.add("vendorPartNumber");
    openapiFields.add("unitPrice");
    openapiFields.add("extendedUnitPrice");
    openapiFields.add("quantityOrdered");
    openapiFields.add("quantityConfirmed");
    openapiFields.add("quantityBackOrdered");
    openapiFields.add("specialBidNumber");
    openapiFields.add("notes");
    openapiFields.add("shipmentDetails");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponseOrdersInnerLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponseOrdersInnerLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponseOrdersInnerLinesInner is not found in the empty JSON string", OrderCreateResponseOrdersInnerLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponseOrdersInnerLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponseOrdersInnerLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
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
            OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.validateJsonElement(jsonArrayshipmentDetails.get(i));
          };
        }
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
            OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponseOrdersInnerLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponseOrdersInnerLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponseOrdersInnerLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponseOrdersInnerLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponseOrdersInnerLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponseOrdersInnerLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponseOrdersInnerLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateResponseOrdersInnerLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateResponseOrdersInnerLinesInner
  * @throws IOException if the JSON string is invalid with respect to OrderCreateResponseOrdersInnerLinesInner
  */
  public static OrderCreateResponseOrdersInnerLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponseOrdersInnerLinesInner.class);
  }

 /**
  * Convert an instance of OrderCreateResponseOrdersInnerLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

