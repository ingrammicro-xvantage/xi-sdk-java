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
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner;

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
 * InvoiceDetailsv61ResponseLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class InvoiceDetailsv61ResponseLinesInner {
  public static final String SERIALIZED_NAME_INGRAM_LINE_NUMBER = "ingramLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_LINE_NUMBER)
  private String ingramLineNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber = "0";

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_PART_NUMBER = "customerPartNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PART_NUMBER)
  private String customerPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "productDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  public static final String SERIALIZED_NAME_UNIT_WEIGHT = "unitWeight";
  @SerializedName(SERIALIZED_NAME_UNIT_WEIGHT)
  private String unitWeight;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private Double unitPrice;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE = "unitOfMeasure";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE)
  private String unitOfMeasure;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_EXTENDED_PRICE = "extendedPrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_PRICE)
  private Double extendedPrice;

  public static final String SERIALIZED_NAME_TAX_PERCENTAGE = "taxPercentage";
  @SerializedName(SERIALIZED_NAME_TAX_PERCENTAGE)
  private Double taxPercentage;

  public static final String SERIALIZED_NAME_TAX_RATE = "taxRate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private Double taxRate;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "taxAmount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Double taxAmount;

  public static final String SERIALIZED_NAME_SERIAL_NUMBERS = "serialNumbers";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBERS)
  private List<InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner> serialNumbers;

  public static final String SERIALIZED_NAME_QUANTITY_ORDERED = "quantityOrdered";
  @SerializedName(SERIALIZED_NAME_QUANTITY_ORDERED)
  private Integer quantityOrdered;

  public static final String SERIALIZED_NAME_QUANTITY_SHIPPED = "quantityShipped";
  @SerializedName(SERIALIZED_NAME_QUANTITY_SHIPPED)
  private Integer quantityShipped;

  public InvoiceDetailsv61ResponseLinesInner() {
  }

  public InvoiceDetailsv61ResponseLinesInner ingramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
    return this;
  }

   /**
   * Unique line number from Ingram.
   * @return ingramLineNumber
  **/
  @javax.annotation.Nullable
  public String getIngramLineNumber() {
    return ingramLineNumber;
  }

  public void setIngramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
  }


  public InvoiceDetailsv61ResponseLinesInner customerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

   /**
   * Line number passes by customer while creating an order.
   * @return customerLineNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public InvoiceDetailsv61ResponseLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * Ingram Micro SKU (stock keeping unit). An identification, usually alphanumeric, of a particular product that allows it to be tracked for inventory purposes.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public InvoiceDetailsv61ResponseLinesInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * Vendor Part Number.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public InvoiceDetailsv61ResponseLinesInner customerPartNumber(String customerPartNumber) {
    this.customerPartNumber = customerPartNumber;
    return this;
  }

   /**
   * Part number from customer&#39;s system.
   * @return customerPartNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerPartNumber() {
    return customerPartNumber;
  }

  public void setCustomerPartNumber(String customerPartNumber) {
    this.customerPartNumber = customerPartNumber;
  }


  public InvoiceDetailsv61ResponseLinesInner vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Name of the vendor.
   * @return vendorName
  **/
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public InvoiceDetailsv61ResponseLinesInner productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

   /**
   * Description of the product.
   * @return productDescription
  **/
  @javax.annotation.Nullable
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public InvoiceDetailsv61ResponseLinesInner unitWeight(String unitWeight) {
    this.unitWeight = unitWeight;
    return this;
  }

   /**
   * Weight of the product.
   * @return unitWeight
  **/
  @javax.annotation.Nullable
  public String getUnitWeight() {
    return unitWeight;
  }

  public void setUnitWeight(String unitWeight) {
    this.unitWeight = unitWeight;
  }


  public InvoiceDetailsv61ResponseLinesInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of the product.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public InvoiceDetailsv61ResponseLinesInner unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Unit price of the product.
   * @return unitPrice
  **/
  @javax.annotation.Nullable
  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  public InvoiceDetailsv61ResponseLinesInner unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Unit of measure of the product.
   * @return unitOfMeasure
  **/
  @javax.annotation.Nullable
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  public InvoiceDetailsv61ResponseLinesInner currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public InvoiceDetailsv61ResponseLinesInner extendedPrice(Double extendedPrice) {
    this.extendedPrice = extendedPrice;
    return this;
  }

   /**
   * Extended price of the product.
   * @return extendedPrice
  **/
  @javax.annotation.Nullable
  public Double getExtendedPrice() {
    return extendedPrice;
  }

  public void setExtendedPrice(Double extendedPrice) {
    this.extendedPrice = extendedPrice;
  }


  public InvoiceDetailsv61ResponseLinesInner taxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
    return this;
  }

   /**
   * Tax percentage
   * @return taxPercentage
  **/
  @javax.annotation.Nullable
  public Double getTaxPercentage() {
    return taxPercentage;
  }

  public void setTaxPercentage(Double taxPercentage) {
    this.taxPercentage = taxPercentage;
  }


  public InvoiceDetailsv61ResponseLinesInner taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax rate
   * @return taxRate
  **/
  @javax.annotation.Nullable
  public Double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }


  public InvoiceDetailsv61ResponseLinesInner taxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Line level tax amount.
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  public Double getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }


  public InvoiceDetailsv61ResponseLinesInner serialNumbers(List<InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner> serialNumbers) {
    this.serialNumbers = serialNumbers;
    return this;
  }

  public InvoiceDetailsv61ResponseLinesInner addSerialNumbersItem(InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner serialNumbersItem) {
    if (this.serialNumbers == null) {
      this.serialNumbers = new ArrayList<>();
    }
    this.serialNumbers.add(serialNumbersItem);
    return this;
  }

   /**
   * Get serialNumbers
   * @return serialNumbers
  **/
  @javax.annotation.Nullable
  public List<InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner> getSerialNumbers() {
    return serialNumbers;
  }

  public void setSerialNumbers(List<InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner> serialNumbers) {
    this.serialNumbers = serialNumbers;
  }


  public InvoiceDetailsv61ResponseLinesInner quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * Quantity ordered by the customer.
   * @return quantityOrdered
  **/
  @javax.annotation.Nullable
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }


  public InvoiceDetailsv61ResponseLinesInner quantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
    return this;
  }

   /**
   * Quantity shipped to the customer.
   * @return quantityShipped
  **/
  @javax.annotation.Nullable
  public Integer getQuantityShipped() {
    return quantityShipped;
  }

  public void setQuantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponseLinesInner invoiceDetailsv61ResponseLinesInner = (InvoiceDetailsv61ResponseLinesInner) o;
    return Objects.equals(this.ingramLineNumber, invoiceDetailsv61ResponseLinesInner.ingramLineNumber) &&
        Objects.equals(this.customerLineNumber, invoiceDetailsv61ResponseLinesInner.customerLineNumber) &&
        Objects.equals(this.ingramPartNumber, invoiceDetailsv61ResponseLinesInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, invoiceDetailsv61ResponseLinesInner.vendorPartNumber) &&
        Objects.equals(this.customerPartNumber, invoiceDetailsv61ResponseLinesInner.customerPartNumber) &&
        Objects.equals(this.vendorName, invoiceDetailsv61ResponseLinesInner.vendorName) &&
        Objects.equals(this.productDescription, invoiceDetailsv61ResponseLinesInner.productDescription) &&
        Objects.equals(this.unitWeight, invoiceDetailsv61ResponseLinesInner.unitWeight) &&
        Objects.equals(this.quantity, invoiceDetailsv61ResponseLinesInner.quantity) &&
        Objects.equals(this.unitPrice, invoiceDetailsv61ResponseLinesInner.unitPrice) &&
        Objects.equals(this.unitOfMeasure, invoiceDetailsv61ResponseLinesInner.unitOfMeasure) &&
        Objects.equals(this.currencyCode, invoiceDetailsv61ResponseLinesInner.currencyCode) &&
        Objects.equals(this.extendedPrice, invoiceDetailsv61ResponseLinesInner.extendedPrice) &&
        Objects.equals(this.taxPercentage, invoiceDetailsv61ResponseLinesInner.taxPercentage) &&
        Objects.equals(this.taxRate, invoiceDetailsv61ResponseLinesInner.taxRate) &&
        Objects.equals(this.taxAmount, invoiceDetailsv61ResponseLinesInner.taxAmount) &&
        Objects.equals(this.serialNumbers, invoiceDetailsv61ResponseLinesInner.serialNumbers) &&
        Objects.equals(this.quantityOrdered, invoiceDetailsv61ResponseLinesInner.quantityOrdered) &&
        Objects.equals(this.quantityShipped, invoiceDetailsv61ResponseLinesInner.quantityShipped);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramLineNumber, customerLineNumber, ingramPartNumber, vendorPartNumber, customerPartNumber, vendorName, productDescription, unitWeight, quantity, unitPrice, unitOfMeasure, currencyCode, extendedPrice, taxPercentage, taxRate, taxAmount, serialNumbers, quantityOrdered, quantityShipped);
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
    sb.append("class InvoiceDetailsv61ResponseLinesInner {\n");
    sb.append("    ingramLineNumber: ").append(toIndentedString(ingramLineNumber)).append("\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    customerPartNumber: ").append(toIndentedString(customerPartNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    unitWeight: ").append(toIndentedString(unitWeight)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    extendedPrice: ").append(toIndentedString(extendedPrice)).append("\n");
    sb.append("    taxPercentage: ").append(toIndentedString(taxPercentage)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityShipped: ").append(toIndentedString(quantityShipped)).append("\n");
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
    openapiFields.add("customerLineNumber");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("customerPartNumber");
    openapiFields.add("vendorName");
    openapiFields.add("productDescription");
    openapiFields.add("unitWeight");
    openapiFields.add("quantity");
    openapiFields.add("unitPrice");
    openapiFields.add("unitOfMeasure");
    openapiFields.add("currencyCode");
    openapiFields.add("extendedPrice");
    openapiFields.add("taxPercentage");
    openapiFields.add("taxRate");
    openapiFields.add("taxAmount");
    openapiFields.add("serialNumbers");
    openapiFields.add("quantityOrdered");
    openapiFields.add("quantityShipped");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponseLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponseLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponseLinesInner is not found in the empty JSON string", InvoiceDetailsv61ResponseLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponseLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponseLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      if ((jsonObj.get("customerPartNumber") != null && !jsonObj.get("customerPartNumber").isJsonNull()) && !jsonObj.get("customerPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerPartNumber").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("productDescription") != null && !jsonObj.get("productDescription").isJsonNull()) && !jsonObj.get("productDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productDescription").toString()));
      }
      if ((jsonObj.get("unitWeight") != null && !jsonObj.get("unitWeight").isJsonNull()) && !jsonObj.get("unitWeight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitWeight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitWeight").toString()));
      }
      if ((jsonObj.get("unitOfMeasure") != null && !jsonObj.get("unitOfMeasure").isJsonNull()) && !jsonObj.get("unitOfMeasure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitOfMeasure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitOfMeasure").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
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
            InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner.validateJsonElement(jsonArrayserialNumbers.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponseLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponseLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponseLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponseLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponseLinesInner>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponseLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponseLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailsv61ResponseLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailsv61ResponseLinesInner
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponseLinesInner
  */
  public static InvoiceDetailsv61ResponseLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponseLinesInner.class);
  }

 /**
  * Convert an instance of InvoiceDetailsv61ResponseLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
