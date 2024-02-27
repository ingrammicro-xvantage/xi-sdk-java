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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.InvoiceDetailsv61ResponseBillToInfo;
import xiresellers.client.model.InvoiceDetailsv61ResponseFxRateInfo;
import xiresellers.client.model.InvoiceDetailsv61ResponseLinesInner;
import xiresellers.client.model.InvoiceDetailsv61ResponsePaymentTermsInfo;
import xiresellers.client.model.InvoiceDetailsv61ResponseShipToInfo;
import xiresellers.client.model.InvoiceDetailsv61ResponseSummary;

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
 * InvoiceDetailsv61Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-27T08:54:45.542575Z[Etc/UTC]")
public class InvoiceDetailsv61Response {
  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_INVOICE_STATUS = "invoiceStatus";
  @SerializedName(SERIALIZED_NAME_INVOICE_STATUS)
  private String invoiceStatus;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER = "endCustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER)
  private String endCustomerOrderNumber;

  public static final String SERIALIZED_NAME_ORDER_NUMBER = "orderNumber";
  @SerializedName(SERIALIZED_NAME_ORDER_NUMBER)
  private String orderNumber;

  public static final String SERIALIZED_NAME_ORDER_DATE = "orderDate";
  @SerializedName(SERIALIZED_NAME_ORDER_DATE)
  private String orderDate;

  public static final String SERIALIZED_NAME_BILL_TO_I_D = "billToID";
  @SerializedName(SERIALIZED_NAME_BILL_TO_I_D)
  private String billToID;

  public static final String SERIALIZED_NAME_INVOICE_TYPE = "invoiceType";
  @SerializedName(SERIALIZED_NAME_INVOICE_TYPE)
  private String invoiceType;

  public static final String SERIALIZED_NAME_INVOICE_DUE_DATE = "invoiceDueDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DUE_DATE)
  private String invoiceDueDate;

  public static final String SERIALIZED_NAME_CUSTOMER_COUNTRY_CODE = "customerCountryCode";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_COUNTRY_CODE)
  private String customerCountryCode;

  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private String customerNumber;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_NUMBER = "ingramOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_NUMBER)
  private String ingramOrderNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS_INFO = "paymentTermsInfo";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS_INFO)
  private InvoiceDetailsv61ResponsePaymentTermsInfo paymentTermsInfo;

  public static final String SERIALIZED_NAME_BILL_TO_INFO = "billToInfo";
  @SerializedName(SERIALIZED_NAME_BILL_TO_INFO)
  private InvoiceDetailsv61ResponseBillToInfo billToInfo;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private InvoiceDetailsv61ResponseShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<InvoiceDetailsv61ResponseLinesInner> lines;

  public static final String SERIALIZED_NAME_FX_RATE_INFO = "fxRateInfo";
  @SerializedName(SERIALIZED_NAME_FX_RATE_INFO)
  private InvoiceDetailsv61ResponseFxRateInfo fxRateInfo;

  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private InvoiceDetailsv61ResponseSummary summary;

  public InvoiceDetailsv61Response() {
  }

  public InvoiceDetailsv61Response invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The Invoice number for the order.
   * @return invoiceNumber
  **/
  @javax.annotation.Nullable
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }


  public InvoiceDetailsv61Response invoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
    return this;
  }

   /**
   * Status of the invoice.
   * @return invoiceStatus
  **/
  @javax.annotation.Nullable
  public String getInvoiceStatus() {
    return invoiceStatus;
  }

  public void setInvoiceStatus(String invoiceStatus) {
    this.invoiceStatus = invoiceStatus;
  }


  public InvoiceDetailsv61Response invoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Date of an Invoice.
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  public String getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public InvoiceDetailsv61Response customerOrderNumber(String customerOrderNumber) {
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


  public InvoiceDetailsv61Response endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

   /**
   * The end customer&#39;s order number for reference in their system.
   * @return endCustomerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public InvoiceDetailsv61Response orderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
    return this;
  }

   /**
   * The end customer&#39;s order number for reference in their system.
   * @return orderNumber
  **/
  @javax.annotation.Nullable
  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public InvoiceDetailsv61Response orderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * The date and time in UTC format that the order was created.
   * @return orderDate
  **/
  @javax.annotation.Nullable
  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }


  public InvoiceDetailsv61Response billToID(String billToID) {
    this.billToID = billToID;
    return this;
  }

   /**
   * Bill to party
   * @return billToID
  **/
  @javax.annotation.Nullable
  public String getBillToID() {
    return billToID;
  }

  public void setBillToID(String billToID) {
    this.billToID = billToID;
  }


  public InvoiceDetailsv61Response invoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * Type of the Invoice
   * @return invoiceType
  **/
  @javax.annotation.Nullable
  public String getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(String invoiceType) {
    this.invoiceType = invoiceType;
  }


  public InvoiceDetailsv61Response invoiceDueDate(String invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
    return this;
  }

   /**
   * Date when the invoice is due.
   * @return invoiceDueDate
  **/
  @javax.annotation.Nullable
  public String getInvoiceDueDate() {
    return invoiceDueDate;
  }

  public void setInvoiceDueDate(String invoiceDueDate) {
    this.invoiceDueDate = invoiceDueDate;
  }


  public InvoiceDetailsv61Response customerCountryCode(String customerCountryCode) {
    this.customerCountryCode = customerCountryCode;
    return this;
  }

   /**
   * Customer country code.
   * @return customerCountryCode
  **/
  @javax.annotation.Nullable
  public String getCustomerCountryCode() {
    return customerCountryCode;
  }

  public void setCustomerCountryCode(String customerCountryCode) {
    this.customerCountryCode = customerCountryCode;
  }


  public InvoiceDetailsv61Response customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Unique customer number in Ingram&#39;s system.
   * @return customerNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }


  public InvoiceDetailsv61Response ingramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
    return this;
  }

   /**
   * The IngramMicro sales order number.
   * @return ingramOrderNumber
  **/
  @javax.annotation.Nullable
  public String getIngramOrderNumber() {
    return ingramOrderNumber;
  }

  public void setIngramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
  }


  public InvoiceDetailsv61Response notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes for the invoice.
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public InvoiceDetailsv61Response paymentTermsInfo(InvoiceDetailsv61ResponsePaymentTermsInfo paymentTermsInfo) {
    this.paymentTermsInfo = paymentTermsInfo;
    return this;
  }

   /**
   * Get paymentTermsInfo
   * @return paymentTermsInfo
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponsePaymentTermsInfo getPaymentTermsInfo() {
    return paymentTermsInfo;
  }

  public void setPaymentTermsInfo(InvoiceDetailsv61ResponsePaymentTermsInfo paymentTermsInfo) {
    this.paymentTermsInfo = paymentTermsInfo;
  }


  public InvoiceDetailsv61Response billToInfo(InvoiceDetailsv61ResponseBillToInfo billToInfo) {
    this.billToInfo = billToInfo;
    return this;
  }

   /**
   * Get billToInfo
   * @return billToInfo
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponseBillToInfo getBillToInfo() {
    return billToInfo;
  }

  public void setBillToInfo(InvoiceDetailsv61ResponseBillToInfo billToInfo) {
    this.billToInfo = billToInfo;
  }


  public InvoiceDetailsv61Response shipToInfo(InvoiceDetailsv61ResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

   /**
   * Get shipToInfo
   * @return shipToInfo
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponseShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(InvoiceDetailsv61ResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public InvoiceDetailsv61Response lines(List<InvoiceDetailsv61ResponseLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public InvoiceDetailsv61Response addLinesItem(InvoiceDetailsv61ResponseLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nullable
  public List<InvoiceDetailsv61ResponseLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<InvoiceDetailsv61ResponseLinesInner> lines) {
    this.lines = lines;
  }


  public InvoiceDetailsv61Response fxRateInfo(InvoiceDetailsv61ResponseFxRateInfo fxRateInfo) {
    this.fxRateInfo = fxRateInfo;
    return this;
  }

   /**
   * Get fxRateInfo
   * @return fxRateInfo
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponseFxRateInfo getFxRateInfo() {
    return fxRateInfo;
  }

  public void setFxRateInfo(InvoiceDetailsv61ResponseFxRateInfo fxRateInfo) {
    this.fxRateInfo = fxRateInfo;
  }


  public InvoiceDetailsv61Response summary(InvoiceDetailsv61ResponseSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponseSummary getSummary() {
    return summary;
  }

  public void setSummary(InvoiceDetailsv61ResponseSummary summary) {
    this.summary = summary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61Response invoiceDetailsv61Response = (InvoiceDetailsv61Response) o;
    return Objects.equals(this.invoiceNumber, invoiceDetailsv61Response.invoiceNumber) &&
        Objects.equals(this.invoiceStatus, invoiceDetailsv61Response.invoiceStatus) &&
        Objects.equals(this.invoiceDate, invoiceDetailsv61Response.invoiceDate) &&
        Objects.equals(this.customerOrderNumber, invoiceDetailsv61Response.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, invoiceDetailsv61Response.endCustomerOrderNumber) &&
        Objects.equals(this.orderNumber, invoiceDetailsv61Response.orderNumber) &&
        Objects.equals(this.orderDate, invoiceDetailsv61Response.orderDate) &&
        Objects.equals(this.billToID, invoiceDetailsv61Response.billToID) &&
        Objects.equals(this.invoiceType, invoiceDetailsv61Response.invoiceType) &&
        Objects.equals(this.invoiceDueDate, invoiceDetailsv61Response.invoiceDueDate) &&
        Objects.equals(this.customerCountryCode, invoiceDetailsv61Response.customerCountryCode) &&
        Objects.equals(this.customerNumber, invoiceDetailsv61Response.customerNumber) &&
        Objects.equals(this.ingramOrderNumber, invoiceDetailsv61Response.ingramOrderNumber) &&
        Objects.equals(this.notes, invoiceDetailsv61Response.notes) &&
        Objects.equals(this.paymentTermsInfo, invoiceDetailsv61Response.paymentTermsInfo) &&
        Objects.equals(this.billToInfo, invoiceDetailsv61Response.billToInfo) &&
        Objects.equals(this.shipToInfo, invoiceDetailsv61Response.shipToInfo) &&
        Objects.equals(this.lines, invoiceDetailsv61Response.lines) &&
        Objects.equals(this.fxRateInfo, invoiceDetailsv61Response.fxRateInfo) &&
        Objects.equals(this.summary, invoiceDetailsv61Response.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, invoiceStatus, invoiceDate, customerOrderNumber, endCustomerOrderNumber, orderNumber, orderDate, billToID, invoiceType, invoiceDueDate, customerCountryCode, customerNumber, ingramOrderNumber, notes, paymentTermsInfo, billToInfo, shipToInfo, lines, fxRateInfo, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsv61Response {\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceStatus: ").append(toIndentedString(invoiceStatus)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    billToID: ").append(toIndentedString(billToID)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    invoiceDueDate: ").append(toIndentedString(invoiceDueDate)).append("\n");
    sb.append("    customerCountryCode: ").append(toIndentedString(customerCountryCode)).append("\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    ingramOrderNumber: ").append(toIndentedString(ingramOrderNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    paymentTermsInfo: ").append(toIndentedString(paymentTermsInfo)).append("\n");
    sb.append("    billToInfo: ").append(toIndentedString(billToInfo)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    fxRateInfo: ").append(toIndentedString(fxRateInfo)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
    openapiFields.add("invoiceStatus");
    openapiFields.add("invoiceDate");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endCustomerOrderNumber");
    openapiFields.add("orderNumber");
    openapiFields.add("orderDate");
    openapiFields.add("billToID");
    openapiFields.add("invoiceType");
    openapiFields.add("invoiceDueDate");
    openapiFields.add("customerCountryCode");
    openapiFields.add("customerNumber");
    openapiFields.add("ingramOrderNumber");
    openapiFields.add("notes");
    openapiFields.add("paymentTermsInfo");
    openapiFields.add("billToInfo");
    openapiFields.add("shipToInfo");
    openapiFields.add("lines");
    openapiFields.add("fxRateInfo");
    openapiFields.add("summary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61Response is not found in the empty JSON string", InvoiceDetailsv61Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("invoiceNumber") != null && !jsonObj.get("invoiceNumber").isJsonNull()) && !jsonObj.get("invoiceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceNumber").toString()));
      }
      if ((jsonObj.get("invoiceStatus") != null && !jsonObj.get("invoiceStatus").isJsonNull()) && !jsonObj.get("invoiceStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceStatus").toString()));
      }
      if ((jsonObj.get("invoiceDate") != null && !jsonObj.get("invoiceDate").isJsonNull()) && !jsonObj.get("invoiceDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceDate").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endCustomerOrderNumber") != null && !jsonObj.get("endCustomerOrderNumber").isJsonNull()) && !jsonObj.get("endCustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("orderNumber") != null && !jsonObj.get("orderNumber").isJsonNull()) && !jsonObj.get("orderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderNumber").toString()));
      }
      if ((jsonObj.get("orderDate") != null && !jsonObj.get("orderDate").isJsonNull()) && !jsonObj.get("orderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderDate").toString()));
      }
      if ((jsonObj.get("billToID") != null && !jsonObj.get("billToID").isJsonNull()) && !jsonObj.get("billToID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToID").toString()));
      }
      if ((jsonObj.get("invoiceType") != null && !jsonObj.get("invoiceType").isJsonNull()) && !jsonObj.get("invoiceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceType").toString()));
      }
      if ((jsonObj.get("invoiceDueDate") != null && !jsonObj.get("invoiceDueDate").isJsonNull()) && !jsonObj.get("invoiceDueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceDueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceDueDate").toString()));
      }
      if ((jsonObj.get("customerCountryCode") != null && !jsonObj.get("customerCountryCode").isJsonNull()) && !jsonObj.get("customerCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerCountryCode").toString()));
      }
      if ((jsonObj.get("customerNumber") != null && !jsonObj.get("customerNumber").isJsonNull()) && !jsonObj.get("customerNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerNumber").toString()));
      }
      if ((jsonObj.get("ingramOrderNumber") != null && !jsonObj.get("ingramOrderNumber").isJsonNull()) && !jsonObj.get("ingramOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      // validate the optional field `paymentTermsInfo`
      if (jsonObj.get("paymentTermsInfo") != null && !jsonObj.get("paymentTermsInfo").isJsonNull()) {
        InvoiceDetailsv61ResponsePaymentTermsInfo.validateJsonElement(jsonObj.get("paymentTermsInfo"));
      }
      // validate the optional field `billToInfo`
      if (jsonObj.get("billToInfo") != null && !jsonObj.get("billToInfo").isJsonNull()) {
        InvoiceDetailsv61ResponseBillToInfo.validateJsonElement(jsonObj.get("billToInfo"));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        InvoiceDetailsv61ResponseShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
        if (jsonArraylines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
          }

          // validate the optional field `lines` (array)
          for (int i = 0; i < jsonArraylines.size(); i++) {
            InvoiceDetailsv61ResponseLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      // validate the optional field `fxRateInfo`
      if (jsonObj.get("fxRateInfo") != null && !jsonObj.get("fxRateInfo").isJsonNull()) {
        InvoiceDetailsv61ResponseFxRateInfo.validateJsonElement(jsonObj.get("fxRateInfo"));
      }
      // validate the optional field `summary`
      if (jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) {
        InvoiceDetailsv61ResponseSummary.validateJsonElement(jsonObj.get("summary"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61Response.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61Response>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailsv61Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailsv61Response
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61Response
  */
  public static InvoiceDetailsv61Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61Response.class);
  }

 /**
  * Convert an instance of InvoiceDetailsv61Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

