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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.ReturnsCreateRequestListInnerShipFromInfoInner;

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
 * ReturnsCreateRequestListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T09:04:53.013432Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ReturnsCreateRequestListInner {
  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private LocalDate invoiceDate;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_PRIMARY_REASON = "primaryReason";
  @SerializedName(SERIALIZED_NAME_PRIMARY_REASON)
  private String primaryReason;

  public static final String SERIALIZED_NAME_SECONDARY_REASON = "secondaryReason";
  @SerializedName(SERIALIZED_NAME_SECONDARY_REASON)
  private String secondaryReason;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

  public static final String SERIALIZED_NAME_SHIP_FROM_INFO = "shipFromInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_INFO)
  private List<ReturnsCreateRequestListInnerShipFromInfoInner> shipFromInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_NUMBER_OF_BOXES = "numberOfBoxes";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_BOXES)
  private Integer numberOfBoxes;

  public ReturnsCreateRequestListInner() {
  }

  public ReturnsCreateRequestListInner invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * The Invoice number of the order.
   * @return invoiceNumber
   */
  @javax.annotation.Nonnull
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public ReturnsCreateRequestListInner invoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  /**
   * Date of an Invoice.
   * @return invoiceDate
   */
  @javax.annotation.Nonnull
  public LocalDate getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(LocalDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public ReturnsCreateRequestListInner customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

  /**
   * The reseller&#39;s order number for reference in their system.
   * @return customerOrderNumber
   */
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public ReturnsCreateRequestListInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * Unique line number from Ingram.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public ReturnsCreateRequestListInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * Vendor Part Number.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public ReturnsCreateRequestListInner serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Serial number of the product.
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public ReturnsCreateRequestListInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Return quantity of the product.
   * @return quantity
   */
  @javax.annotation.Nonnull
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public ReturnsCreateRequestListInner primaryReason(String primaryReason) {
    this.primaryReason = primaryReason;
    return this;
  }

  /**
   * Primary reason to return the product.
   * @return primaryReason
   */
  @javax.annotation.Nonnull
  public String getPrimaryReason() {
    return primaryReason;
  }

  public void setPrimaryReason(String primaryReason) {
    this.primaryReason = primaryReason;
  }


  public ReturnsCreateRequestListInner secondaryReason(String secondaryReason) {
    this.secondaryReason = secondaryReason;
    return this;
  }

  /**
   * Secondary reason to return the product.
   * @return secondaryReason
   */
  @javax.annotation.Nonnull
  public String getSecondaryReason() {
    return secondaryReason;
  }

  public void setSecondaryReason(String secondaryReason) {
    this.secondaryReason = secondaryReason;
  }


  public ReturnsCreateRequestListInner notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Return notes.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public ReturnsCreateRequestListInner referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Reference number to return the product.
   * @return referenceNumber
   */
  @javax.annotation.Nullable
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public ReturnsCreateRequestListInner billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

  /**
   * Suffix used to identify billing address.
   * @return billToAddressId
   */
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public ReturnsCreateRequestListInner shipFromInfo(List<ReturnsCreateRequestListInnerShipFromInfoInner> shipFromInfo) {
    this.shipFromInfo = shipFromInfo;
    return this;
  }

  public ReturnsCreateRequestListInner addShipFromInfoItem(ReturnsCreateRequestListInnerShipFromInfoInner shipFromInfoItem) {
    if (this.shipFromInfo == null) {
      this.shipFromInfo = new ArrayList<>();
    }
    this.shipFromInfo.add(shipFromInfoItem);
    return this;
  }

  /**
   * Get shipFromInfo
   * @return shipFromInfo
   */
  @javax.annotation.Nonnull
  public List<ReturnsCreateRequestListInnerShipFromInfoInner> getShipFromInfo() {
    return shipFromInfo;
  }

  public void setShipFromInfo(List<ReturnsCreateRequestListInnerShipFromInfoInner> shipFromInfo) {
    this.shipFromInfo = shipFromInfo;
  }


  public ReturnsCreateRequestListInner numberOfBoxes(Integer numberOfBoxes) {
    this.numberOfBoxes = numberOfBoxes;
    return this;
  }

  /**
   * Number of boxes to return.
   * @return numberOfBoxes
   */
  @javax.annotation.Nonnull
  public Integer getNumberOfBoxes() {
    return numberOfBoxes;
  }

  public void setNumberOfBoxes(Integer numberOfBoxes) {
    this.numberOfBoxes = numberOfBoxes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnsCreateRequestListInner returnsCreateRequestListInner = (ReturnsCreateRequestListInner) o;
    return Objects.equals(this.invoiceNumber, returnsCreateRequestListInner.invoiceNumber) &&
        Objects.equals(this.invoiceDate, returnsCreateRequestListInner.invoiceDate) &&
        Objects.equals(this.customerOrderNumber, returnsCreateRequestListInner.customerOrderNumber) &&
        Objects.equals(this.ingramPartNumber, returnsCreateRequestListInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, returnsCreateRequestListInner.vendorPartNumber) &&
        Objects.equals(this.serialNumber, returnsCreateRequestListInner.serialNumber) &&
        Objects.equals(this.quantity, returnsCreateRequestListInner.quantity) &&
        Objects.equals(this.primaryReason, returnsCreateRequestListInner.primaryReason) &&
        Objects.equals(this.secondaryReason, returnsCreateRequestListInner.secondaryReason) &&
        Objects.equals(this.notes, returnsCreateRequestListInner.notes) &&
        Objects.equals(this.referenceNumber, returnsCreateRequestListInner.referenceNumber) &&
        Objects.equals(this.billToAddressId, returnsCreateRequestListInner.billToAddressId) &&
        Objects.equals(this.shipFromInfo, returnsCreateRequestListInner.shipFromInfo) &&
        Objects.equals(this.numberOfBoxes, returnsCreateRequestListInner.numberOfBoxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, invoiceDate, customerOrderNumber, ingramPartNumber, vendorPartNumber, serialNumber, quantity, primaryReason, secondaryReason, notes, referenceNumber, billToAddressId, shipFromInfo, numberOfBoxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsCreateRequestListInner {\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    primaryReason: ").append(toIndentedString(primaryReason)).append("\n");
    sb.append("    secondaryReason: ").append(toIndentedString(secondaryReason)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    shipFromInfo: ").append(toIndentedString(shipFromInfo)).append("\n");
    sb.append("    numberOfBoxes: ").append(toIndentedString(numberOfBoxes)).append("\n");
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
    openapiFields.add("invoiceNumber");
    openapiFields.add("invoiceDate");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("serialNumber");
    openapiFields.add("quantity");
    openapiFields.add("primaryReason");
    openapiFields.add("secondaryReason");
    openapiFields.add("notes");
    openapiFields.add("referenceNumber");
    openapiFields.add("billToAddressId");
    openapiFields.add("shipFromInfo");
    openapiFields.add("numberOfBoxes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("invoiceNumber");
    openapiRequiredFields.add("invoiceDate");
    openapiRequiredFields.add("quantity");
    openapiRequiredFields.add("primaryReason");
    openapiRequiredFields.add("secondaryReason");
    openapiRequiredFields.add("shipFromInfo");
    openapiRequiredFields.add("numberOfBoxes");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReturnsCreateRequestListInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnsCreateRequestListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnsCreateRequestListInner is not found in the empty JSON string", ReturnsCreateRequestListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnsCreateRequestListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnsCreateRequestListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReturnsCreateRequestListInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      if (!jsonObj.get("primaryReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primaryReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primaryReason").toString()));
      }
      if (!jsonObj.get("secondaryReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondaryReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondaryReason").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("shipFromInfo").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromInfo` to be an array in the JSON string but got `%s`", jsonObj.get("shipFromInfo").toString()));
      }

      JsonArray jsonArrayshipFromInfo = jsonObj.getAsJsonArray("shipFromInfo");
      // validate the required field `shipFromInfo` (array)
      for (int i = 0; i < jsonArrayshipFromInfo.size(); i++) {
        ReturnsCreateRequestListInnerShipFromInfoInner.validateJsonElement(jsonArrayshipFromInfo.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnsCreateRequestListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnsCreateRequestListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnsCreateRequestListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnsCreateRequestListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnsCreateRequestListInner>() {
           @Override
           public void write(JsonWriter out, ReturnsCreateRequestListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnsCreateRequestListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReturnsCreateRequestListInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReturnsCreateRequestListInner
   * @throws IOException if the JSON string is invalid with respect to ReturnsCreateRequestListInner
   */
  public static ReturnsCreateRequestListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnsCreateRequestListInner.class);
  }

  /**
   * Convert an instance of ReturnsCreateRequestListInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

