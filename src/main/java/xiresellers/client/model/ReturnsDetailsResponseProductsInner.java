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
 * ReturnsDetailsResponseProductsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T09:00:28.102704Z[Etc/UTC]")
public class ReturnsDetailsResponseProductsInner {
  public static final String SERIALIZED_NAME_INGRAM_LINE_NUMBER = "ingramLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_LINE_NUMBER)
  private Integer ingramLineNumber;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private BigDecimal quantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_EXTENDED_PRICE = "extendedPrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PRICE)
  private BigDecimal extendedPrice;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_RETURN_BRANCH = "returnBranch";
  @SerializedName(SERIALIZED_NAME_RETURN_BRANCH)
  private String returnBranch;

  public static final String SERIALIZED_NAME_SHIP_FROM_BRANCH = "shipFromBranch";
  @SerializedName(SERIALIZED_NAME_SHIP_FROM_BRANCH)
  private String shipFromBranch;

  public static final String SERIALIZED_NAME_REQUEST_DETAILS = "requestDetails";
  @SerializedName(SERIALIZED_NAME_REQUEST_DETAILS)
  private String requestDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_DETAILS = "additionalDetails";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DETAILS)
  private String additionalDetails;

  public ReturnsDetailsResponseProductsInner() {
  }

  public ReturnsDetailsResponseProductsInner ingramLineNumber(Integer ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
    return this;
  }

   /**
   * Unique Ingram Micro line number.
   * @return ingramLineNumber
  **/
  @javax.annotation.Nullable
  public Integer getIngramLineNumber() {
    return ingramLineNumber;
  }

  public void setIngramLineNumber(Integer ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
  }


  public ReturnsDetailsResponseProductsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the line item product.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ReturnsDetailsResponseProductsInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * Unique IngramMicro part number.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public ReturnsDetailsResponseProductsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * The vendor&#39;s part number for the line item.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public ReturnsDetailsResponseProductsInner upc(String upc) {
    this.upc = upc;
    return this;
  }

   /**
   * The UPC code of a product.
   * @return upc
  **/
  @javax.annotation.Nullable
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }


  public ReturnsDetailsResponseProductsInner invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * The date of the invoice.
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public ReturnsDetailsResponseProductsInner invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Ingram micro Invoice number.
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public ReturnsDetailsResponseProductsInner customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

   /**
   * The reseller&#39;s order number for reference in their system.
   * @return customerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public ReturnsDetailsResponseProductsInner quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of the line item.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }


  public ReturnsDetailsResponseProductsInner unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * The unit price of the line item.
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public ReturnsDetailsResponseProductsInner extendedPrice(BigDecimal extendedPrice) {
    this.extendedPrice = extendedPrice;
    return this;
  }

   /**
   * Unit price X quantity for the line item.
   * @return extendedPrice
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedPrice() {
    return extendedPrice;
  }

  public void setExtendedPrice(BigDecimal extendedPrice) {
    this.extendedPrice = extendedPrice;
  }


  public ReturnsDetailsResponseProductsInner status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the line item.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ReturnsDetailsResponseProductsInner returnBranch(String returnBranch) {
    this.returnBranch = returnBranch;
    return this;
  }

   /**
   * The code of the return branch.
   * @return returnBranch
  **/
  @javax.annotation.Nullable
  public String getReturnBranch() {
    return returnBranch;
  }

  public void setReturnBranch(String returnBranch) {
    this.returnBranch = returnBranch;
  }


  public ReturnsDetailsResponseProductsInner shipFromBranch(String shipFromBranch) {
    this.shipFromBranch = shipFromBranch;
    return this;
  }

   /**
   * The code of the ship from branch.
   * @return shipFromBranch
  **/
  @javax.annotation.Nullable
  public String getShipFromBranch() {
    return shipFromBranch;
  }

  public void setShipFromBranch(String shipFromBranch) {
    this.shipFromBranch = shipFromBranch;
  }


  public ReturnsDetailsResponseProductsInner requestDetails(String requestDetails) {
    this.requestDetails = requestDetails;
    return this;
  }

   /**
   * Request details.
   * @return requestDetails
  **/
  @javax.annotation.Nullable
  public String getRequestDetails() {
    return requestDetails;
  }

  public void setRequestDetails(String requestDetails) {
    this.requestDetails = requestDetails;
  }


  public ReturnsDetailsResponseProductsInner additionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Get additionalDetails
   * @return additionalDetails
  **/
  @javax.annotation.Nullable
  public String getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(String additionalDetails) {
    this.additionalDetails = additionalDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnsDetailsResponseProductsInner returnsDetailsResponseProductsInner = (ReturnsDetailsResponseProductsInner) o;
    return Objects.equals(this.ingramLineNumber, returnsDetailsResponseProductsInner.ingramLineNumber) &&
        Objects.equals(this.description, returnsDetailsResponseProductsInner.description) &&
        Objects.equals(this.ingramPartNumber, returnsDetailsResponseProductsInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, returnsDetailsResponseProductsInner.vendorPartNumber) &&
        Objects.equals(this.upc, returnsDetailsResponseProductsInner.upc) &&
        Objects.equals(this.invoiceDate, returnsDetailsResponseProductsInner.invoiceDate) &&
        Objects.equals(this.invoiceNumber, returnsDetailsResponseProductsInner.invoiceNumber) &&
        Objects.equals(this.customerOrderNumber, returnsDetailsResponseProductsInner.customerOrderNumber) &&
        Objects.equals(this.quantity, returnsDetailsResponseProductsInner.quantity) &&
        Objects.equals(this.unitPrice, returnsDetailsResponseProductsInner.unitPrice) &&
        Objects.equals(this.extendedPrice, returnsDetailsResponseProductsInner.extendedPrice) &&
        Objects.equals(this.status, returnsDetailsResponseProductsInner.status) &&
        Objects.equals(this.returnBranch, returnsDetailsResponseProductsInner.returnBranch) &&
        Objects.equals(this.shipFromBranch, returnsDetailsResponseProductsInner.shipFromBranch) &&
        Objects.equals(this.requestDetails, returnsDetailsResponseProductsInner.requestDetails) &&
        Objects.equals(this.additionalDetails, returnsDetailsResponseProductsInner.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramLineNumber, description, ingramPartNumber, vendorPartNumber, upc, invoiceDate, invoiceNumber, customerOrderNumber, quantity, unitPrice, extendedPrice, status, returnBranch, shipFromBranch, requestDetails, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsDetailsResponseProductsInner {\n");
    sb.append("    ingramLineNumber: ").append(toIndentedString(ingramLineNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    extendedPrice: ").append(toIndentedString(extendedPrice)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    returnBranch: ").append(toIndentedString(returnBranch)).append("\n");
    sb.append("    shipFromBranch: ").append(toIndentedString(shipFromBranch)).append("\n");
    sb.append("    requestDetails: ").append(toIndentedString(requestDetails)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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
    openapiFields.add("ingramLineNumber");
    openapiFields.add("description");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("upc");
    openapiFields.add("invoiceDate");
    openapiFields.add("invoiceNumber");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("quantity");
    openapiFields.add("unitPrice");
    openapiFields.add("extendedPrice");
    openapiFields.add("status");
    openapiFields.add("returnBranch");
    openapiFields.add("shipFromBranch");
    openapiFields.add("requestDetails");
    openapiFields.add("additionalDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReturnsDetailsResponseProductsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnsDetailsResponseProductsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnsDetailsResponseProductsInner is not found in the empty JSON string", ReturnsDetailsResponseProductsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnsDetailsResponseProductsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnsDetailsResponseProductsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("invoiceDate") != null && !jsonObj.get("invoiceDate").isJsonNull()) && !jsonObj.get("invoiceDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceDate").toString()));
      }
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("returnBranch") != null && !jsonObj.get("returnBranch").isJsonNull()) && !jsonObj.get("returnBranch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnBranch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnBranch").toString()));
      }
      if ((jsonObj.get("shipFromBranch") != null && !jsonObj.get("shipFromBranch").isJsonNull()) && !jsonObj.get("shipFromBranch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipFromBranch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipFromBranch").toString()));
      }
      if ((jsonObj.get("requestDetails") != null && !jsonObj.get("requestDetails").isJsonNull()) && !jsonObj.get("requestDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestDetails").toString()));
      }
      if ((jsonObj.get("additionalDetails") != null && !jsonObj.get("additionalDetails").isJsonNull()) && !jsonObj.get("additionalDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additionalDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additionalDetails").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnsDetailsResponseProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnsDetailsResponseProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnsDetailsResponseProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnsDetailsResponseProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnsDetailsResponseProductsInner>() {
           @Override
           public void write(JsonWriter out, ReturnsDetailsResponseProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnsDetailsResponseProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReturnsDetailsResponseProductsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReturnsDetailsResponseProductsInner
  * @throws IOException if the JSON string is invalid with respect to ReturnsDetailsResponseProductsInner
  */
  public static ReturnsDetailsResponseProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnsDetailsResponseProductsInner.class);
  }

 /**
  * Convert an instance of ReturnsDetailsResponseProductsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

