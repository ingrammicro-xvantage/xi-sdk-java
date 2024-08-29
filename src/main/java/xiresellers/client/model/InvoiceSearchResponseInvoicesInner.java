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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * InvoiceSearchResponseInvoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T17:32:11.198732Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class InvoiceSearchResponseInvoicesInner {
  public static final String SERIALIZED_NAME_PAYMENT_TERMS_DUE_DATE = "paymentTermsDueDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS_DUE_DATE)
  private String paymentTermsDueDate;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBERS = "specialBidNumbers";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBERS)
  private List<String> specialBidNumbers = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERP_ORDER_NUMBER = "erpOrderNumber";
  @SerializedName(SERIALIZED_NAME_ERP_ORDER_NUMBER)
  private String erpOrderNumber;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoiceStatus";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private String invoiceStatus;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_INVOICE_DUE_DATE = "invoiceDueDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DUE_DATE)
  private String invoiceDueDate;

  public static final String SERIALIZED_NAME_INVOICED_AMOUNT_DUE = "invoicedAmountDue";
  @SerializedName(SERIALIZED_NAME_INVOICED_AMOUNT_DUE)
  private BigDecimal invoicedAmountDue;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER = "endCustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER)
  private String endCustomerOrderNumber;

  public static final String SERIALIZED_NAME_ORDER_CREATE_DATE = "orderCreateDate";
  @SerializedName(SERIALIZED_NAME_ORDER_CREATE_DATE)
  private String orderCreateDate;

  public static final String SERIALIZED_NAME_INVOICE_AMOUNT_INCL_TAX = "invoiceAmountInclTax";
  @SerializedName(SERIALIZED_NAME_INVOICE_AMOUNT_INCL_TAX)
  private BigDecimal invoiceAmountInclTax;

  public static final String SERIALIZED_NAME_FORGNTOTALAMOUNT = "forgntotalamount";
  @SerializedName(SERIALIZED_NAME_FORGNTOTALAMOUNT)
  private BigDecimal forgntotalamount;

  public static final String SERIALIZED_NAME_GST_INVOICE_NUMBER = "gstInvoiceNumber";
  @SerializedName(SERIALIZED_NAME_GST_INVOICE_NUMBER)
  private String gstInvoiceNumber;

  public static final String SERIALIZED_NAME_ISFSECCENABLED = "isfseccenabled";
  @SerializedName(SERIALIZED_NAME_ISFSECCENABLED)
  private Boolean isfseccenabled;

  public InvoiceSearchResponseInvoicesInner() {
  }

  public InvoiceSearchResponseInvoicesInner paymentTermsDueDate(String paymentTermsDueDate) {
    this.paymentTermsDueDate = paymentTermsDueDate;
    return this;
  }

  /**
   * Payment Terms Due date.
   * @return paymentTermsDueDate
   */
  @javax.annotation.Nullable
  public String getPaymentTermsDueDate() {
    return paymentTermsDueDate;
  }

  public void setPaymentTermsDueDate(String paymentTermsDueDate) {
    this.paymentTermsDueDate = paymentTermsDueDate;
  }


  public InvoiceSearchResponseInvoicesInner specialBidNumbers(List<String> specialBidNumbers) {
    this.specialBidNumbers = specialBidNumbers;
    return this;
  }

  public InvoiceSearchResponseInvoicesInner addSpecialBidNumbersItem(String specialBidNumbersItem) {
    if (this.specialBidNumbers == null) {
      this.specialBidNumbers = new ArrayList<>();
    }
    this.specialBidNumbers.add(specialBidNumbersItem);
    return this;
  }

  /**
   * Get specialBidNumbers
   * @return specialBidNumbers
   */
  @javax.annotation.Nullable
  public List<String> getSpecialBidNumbers() {
    return specialBidNumbers;
  }

  public void setSpecialBidNumbers(List<String> specialBidNumbers) {
    this.specialBidNumbers = specialBidNumbers;
  }


  public InvoiceSearchResponseInvoicesInner erpOrderNumber(String erpOrderNumber) {
    this.erpOrderNumber = erpOrderNumber;
    return this;
  }

  /**
   * Order number
   * @return erpOrderNumber
   */
  @javax.annotation.Nullable
  public String getErpOrderNumber() {
    return erpOrderNumber;
  }

  public void setErpOrderNumber(String erpOrderNumber) {
    this.erpOrderNumber = erpOrderNumber;
  }


  public InvoiceSearchResponseInvoicesInner invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

  /**
   * Invoice no.
   * @return invoiceNumber
   */
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public InvoiceSearchResponseInvoicesInner invoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
    return this;
  }

  /**
   * Invoice Status.
   * @return invoiceStatus
   */
  @javax.annotation.Nullable
  public String getInvoiceStatus() {
    return invoiceStatus;
  }

  public void setInvoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public InvoiceSearchResponseInvoicesInner invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  /**
   * Invoice Date.
   * @return invoiceDate
   */
  @javax.annotation.Nullable
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public InvoiceSearchResponseInvoicesInner invoiceDueDate(String invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

  /**
   * Invoice Due Date.
   * @return invoiceDueDate
   */
  @javax.annotation.Nullable
  public String getInvoiceDueDate() {
    return invoiceDueDate;
  }

  public void setInvoiceDueDate(String invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }


  public InvoiceSearchResponseInvoicesInner invoicedAmountDue(BigDecimal invoicedAmountDue) {
    this.invoicedAmountDue = invoicedAmountDue;
    return this;
  }

  /**
   * Invoice Amount.
   * @return invoicedAmountDue
   */
  @javax.annotation.Nullable
  public BigDecimal getInvoicedAmountDue() {
    return invoicedAmountDue;
  }

  public void setInvoicedAmountDue(BigDecimal invoicedAmountDue) {
    this.invoicedAmountDue = invoicedAmountDue;
  }


  public InvoiceSearchResponseInvoicesInner customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

  /**
   * Customer Order No.
   * @return customerOrderNumber
   */
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public InvoiceSearchResponseInvoicesInner endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

  /**
   * End Customer Order number.
   * @return endCustomerOrderNumber
   */
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public InvoiceSearchResponseInvoicesInner orderCreateDate(String orderCreateDate) {
    this.orderCreateDate = orderCreateDate;
    return this;
  }

  /**
   * Order Create Date.
   * @return orderCreateDate
   */
  @javax.annotation.Nullable
  public String getOrderCreateDate() {
    return orderCreateDate;
  }

  public void setOrderCreateDate(String orderCreateDate) {
    this.orderCreateDate = orderCreateDate;
  }


  public InvoiceSearchResponseInvoicesInner invoiceAmountInclTax(BigDecimal invoiceAmountInclTax) {
    this.invoiceAmountInclTax = invoiceAmountInclTax;
    return this;
  }

  /**
   * Invoice Amount Inclusive of Taxes
   * @return invoiceAmountInclTax
   */
  @javax.annotation.Nullable
  public BigDecimal getInvoiceAmountInclTax() {
    return invoiceAmountInclTax;
  }

  public void setInvoiceAmountInclTax(BigDecimal invoiceAmountInclTax) {
    this.invoiceAmountInclTax = invoiceAmountInclTax;
  }


  public InvoiceSearchResponseInvoicesInner forgntotalamount(BigDecimal forgntotalamount) {
    this.forgntotalamount = forgntotalamount;
    return this;
  }

  /**
   * Get forgntotalamount
   * @return forgntotalamount
   */
  @javax.annotation.Nullable
  public BigDecimal getForgntotalamount() {
    return forgntotalamount;
  }

  public void setForgntotalamount(BigDecimal forgntotalamount) {
    this.forgntotalamount = forgntotalamount;
  }


  public InvoiceSearchResponseInvoicesInner gstInvoiceNumber(String gstInvoiceNumber) {
    this.gstInvoiceNumber = gstInvoiceNumber;
    return this;
  }

  /**
   * Get gstInvoiceNumber
   * @return gstInvoiceNumber
   */
  @javax.annotation.Nullable
  public String getGstInvoiceNumber() {
    return gstInvoiceNumber;
  }

  public void setGstInvoiceNumber(String gstInvoiceNumber) {
    this.gstInvoiceNumber = gstInvoiceNumber;
  }


  public InvoiceSearchResponseInvoicesInner isfseccenabled(Boolean isfseccenabled) {
    this.isfseccenabled = isfseccenabled;
    return this;
  }

  /**
   * Get isfseccenabled
   * @return isfseccenabled
   */
  @javax.annotation.Nullable
  public Boolean getIsfseccenabled() {
    return isfseccenabled;
  }

  public void setIsfseccenabled(Boolean isfseccenabled) {
    this.isfseccenabled = isfseccenabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceSearchResponseInvoicesInner invoiceSearchResponseInvoicesInner = (InvoiceSearchResponseInvoicesInner) o;
    return Objects.equals(this.paymentTermsDueDate, invoiceSearchResponseInvoicesInner.paymentTermsDueDate) &&
        Objects.equals(this.specialBidNumbers, invoiceSearchResponseInvoicesInner.specialBidNumbers) &&
        Objects.equals(this.erpOrderNumber, invoiceSearchResponseInvoicesInner.erpOrderNumber) &&
        Objects.equals(this.invoiceNumber, invoiceSearchResponseInvoicesInner.invoiceNumber) &&
        Objects.equals(this.invoiceStatus, invoiceSearchResponseInvoicesInner.invoiceStatus) &&
        Objects.equals(this.invoiceDate, invoiceSearchResponseInvoicesInner.invoiceDate) &&
        Objects.equals(this.invoiceDueDate, invoiceSearchResponseInvoicesInner.invoiceDueDate) &&
        Objects.equals(this.invoicedAmountDue, invoiceSearchResponseInvoicesInner.invoicedAmountDue) &&
        Objects.equals(this.customerOrderNumber, invoiceSearchResponseInvoicesInner.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, invoiceSearchResponseInvoicesInner.endCustomerOrderNumber) &&
        Objects.equals(this.orderCreateDate, invoiceSearchResponseInvoicesInner.orderCreateDate) &&
        Objects.equals(this.invoiceAmountInclTax, invoiceSearchResponseInvoicesInner.invoiceAmountInclTax) &&
        Objects.equals(this.forgntotalamount, invoiceSearchResponseInvoicesInner.forgntotalamount) &&
        Objects.equals(this.gstInvoiceNumber, invoiceSearchResponseInvoicesInner.gstInvoiceNumber) &&
        Objects.equals(this.isfseccenabled, invoiceSearchResponseInvoicesInner.isfseccenabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTermsDueDate, specialBidNumbers, erpOrderNumber, invoiceNumber, invoiceStatus, invoiceDate, invoiceDueDate, invoicedAmountDue, customerOrderNumber, endCustomerOrderNumber, orderCreateDate, invoiceAmountInclTax, forgntotalamount, gstInvoiceNumber, isfseccenabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceSearchResponseInvoicesInner {\n");
    sb.append("    paymentTermsDueDate: ").append(toIndentedString(paymentTermsDueDate)).append("\n");
    sb.append("    specialBidNumbers: ").append(toIndentedString(specialBidNumbers)).append("\n");
    sb.append("    erpOrderNumber: ").append(toIndentedString(erpOrderNumber)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceDueDate: ").append(toIndentedString(invoiceDueDate)).append("\n");
    sb.append("    invoicedAmountDue: ").append(toIndentedString(invoicedAmountDue)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    orderCreateDate: ").append(toIndentedString(orderCreateDate)).append("\n");
    sb.append("    invoiceAmountInclTax: ").append(toIndentedString(invoiceAmountInclTax)).append("\n");
    sb.append("    forgntotalamount: ").append(toIndentedString(forgntotalamount)).append("\n");
    sb.append("    gstInvoiceNumber: ").append(toIndentedString(gstInvoiceNumber)).append("\n");
    sb.append("    isfseccenabled: ").append(toIndentedString(isfseccenabled)).append("\n");
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
    openapiFields.add("paymentTermsDueDate");
    openapiFields.add("specialBidNumbers");
    openapiFields.add("erpOrderNumber");
    openapiFields.add("invoiceNumber");
    openapiFields.add("invoiceStatus");
    openapiFields.add("invoiceDate");
    openapiFields.add("invoiceDueDate");
    openapiFields.add("invoicedAmountDue");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endCustomerOrderNumber");
    openapiFields.add("orderCreateDate");
    openapiFields.add("invoiceAmountInclTax");
    openapiFields.add("forgntotalamount");
    openapiFields.add("gstInvoiceNumber");
    openapiFields.add("isfseccenabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceSearchResponseInvoicesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceSearchResponseInvoicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceSearchResponseInvoicesInner is not found in the empty JSON string", InvoiceSearchResponseInvoicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceSearchResponseInvoicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceSearchResponseInvoicesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("paymentTermsDueDate") != null && !jsonObj.get("paymentTermsDueDate").isJsonNull()) && !jsonObj.get("paymentTermsDueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentTermsDueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentTermsDueDate").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("specialBidNumbers") != null && !jsonObj.get("specialBidNumbers").isJsonNull() && !jsonObj.get("specialBidNumbers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumbers` to be an array in the JSON string but got `%s`", jsonObj.get("specialBidNumbers").toString()));
      }
      if ((jsonObj.get("erpOrderNumber") != null && !jsonObj.get("erpOrderNumber").isJsonNull()) && !jsonObj.get("erpOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `erpOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("erpOrderNumber").toString()));
      }
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      if ((jsonObj.get("invoiceStatus") != null && !jsonObj.get("invoiceStatus").isJsonNull()) && !jsonObj.get("invoiceStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceStatus").toString()));
      }
      if ((jsonObj.get("invoiceDate") != null && !jsonObj.get("invoiceDate").isJsonNull()) && !jsonObj.get("invoiceDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceDate").toString()));
      }
      if ((jsonObj.get("invoiceDueDate") != null && !jsonObj.get("invoiceDueDate").isJsonNull()) && !jsonObj.get("invoiceDueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceDueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceDueDate").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endCustomerOrderNumber") != null && !jsonObj.get("endCustomerOrderNumber").isJsonNull()) && !jsonObj.get("endCustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("orderCreateDate") != null && !jsonObj.get("orderCreateDate").isJsonNull()) && !jsonObj.get("orderCreateDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderCreateDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderCreateDate").toString()));
      }
      if ((jsonObj.get("gstInvoiceNumber") != null && !jsonObj.get("gstInvoiceNumber").isJsonNull()) && !jsonObj.get("gstInvoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gstInvoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gstInvoiceNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceSearchResponseInvoicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceSearchResponseInvoicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceSearchResponseInvoicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceSearchResponseInvoicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceSearchResponseInvoicesInner>() {
           @Override
           public void write(JsonWriter out, InvoiceSearchResponseInvoicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceSearchResponseInvoicesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceSearchResponseInvoicesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceSearchResponseInvoicesInner
   * @throws IOException if the JSON string is invalid with respect to InvoiceSearchResponseInvoicesInner
   */
  public static InvoiceSearchResponseInvoicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceSearchResponseInvoicesInner.class);
  }

  /**
   * Convert an instance of InvoiceSearchResponseInvoicesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

