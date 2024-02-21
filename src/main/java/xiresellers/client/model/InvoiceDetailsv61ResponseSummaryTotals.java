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
 * InvoiceDetailsv61ResponseSummaryTotals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T08:44:05.228708Z[Etc/UTC]")
public class InvoiceDetailsv61ResponseSummaryTotals {
  public static final String SERIALIZED_NAME_NET_INVOICE_AMOUNT = "netInvoiceAmount";
  @SerializedName(SERIALIZED_NAME_NET_INVOICE_AMOUNT)
  private Double netInvoiceAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discountAmount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Double discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discountType";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private String discountType;

  public static final String SERIALIZED_NAME_TOTAL_TAX_AMOUNT = "totalTaxAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_AMOUNT)
  private Double totalTaxAmount;

  public static final String SERIALIZED_NAME_INVOICED_AMOUNT_DUE = "invoicedAmountDue";
  @SerializedName(SERIALIZED_NAME_INVOICED_AMOUNT_DUE)
  private Double invoicedAmountDue;

  public static final String SERIALIZED_NAME_FREIGHT_AMOUNT = "freightAmount";
  @SerializedName(SERIALIZED_NAME_FREIGHT_AMOUNT)
  private Double freightAmount;

  public InvoiceDetailsv61ResponseSummaryTotals() {
  }

  public InvoiceDetailsv61ResponseSummaryTotals netInvoiceAmount(Double netInvoiceAmount) {
    this.netInvoiceAmount = netInvoiceAmount;
    return this;
  }

   /**
   * Net Invoice amount.
   * @return netInvoiceAmount
  **/
  @javax.annotation.Nullable
  public Double getNetInvoiceAmount() {
    return netInvoiceAmount;
  }

  public void setNetInvoiceAmount(Double netInvoiceAmount) {
    this.netInvoiceAmount = netInvoiceAmount;
  }


  public InvoiceDetailsv61ResponseSummaryTotals discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Discount amount.
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  public Double getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public InvoiceDetailsv61ResponseSummaryTotals discountType(String discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * Type of discount.
   * @return discountType
  **/
  @javax.annotation.Nullable
  public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }


  public InvoiceDetailsv61ResponseSummaryTotals totalTaxAmount(Double totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

   /**
   * Total Tax amount.
   * @return totalTaxAmount
  **/
  @javax.annotation.Nullable
  public Double getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(Double totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }


  public InvoiceDetailsv61ResponseSummaryTotals invoicedAmountDue(Double invoicedAmountDue) {
    this.invoicedAmountDue = invoicedAmountDue;
    return this;
  }

   /**
   * Total amount due for the invoice.
   * @return invoicedAmountDue
  **/
  @javax.annotation.Nullable
  public Double getInvoicedAmountDue() {
    return invoicedAmountDue;
  }

  public void setInvoicedAmountDue(Double invoicedAmountDue) {
    this.invoicedAmountDue = invoicedAmountDue;
  }


  public InvoiceDetailsv61ResponseSummaryTotals freightAmount(Double freightAmount) {
    this.freightAmount = freightAmount;
    return this;
  }

   /**
   * Freight amount
   * @return freightAmount
  **/
  @javax.annotation.Nullable
  public Double getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(Double freightAmount) {
    this.freightAmount = freightAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponseSummaryTotals invoiceDetailsv61ResponseSummaryTotals = (InvoiceDetailsv61ResponseSummaryTotals) o;
    return Objects.equals(this.netInvoiceAmount, invoiceDetailsv61ResponseSummaryTotals.netInvoiceAmount) &&
        Objects.equals(this.discountAmount, invoiceDetailsv61ResponseSummaryTotals.discountAmount) &&
        Objects.equals(this.discountType, invoiceDetailsv61ResponseSummaryTotals.discountType) &&
        Objects.equals(this.totalTaxAmount, invoiceDetailsv61ResponseSummaryTotals.totalTaxAmount) &&
        Objects.equals(this.invoicedAmountDue, invoiceDetailsv61ResponseSummaryTotals.invoicedAmountDue) &&
        Objects.equals(this.freightAmount, invoiceDetailsv61ResponseSummaryTotals.freightAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netInvoiceAmount, discountAmount, discountType, totalTaxAmount, invoicedAmountDue, freightAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsv61ResponseSummaryTotals {\n");
    sb.append("    netInvoiceAmount: ").append(toIndentedString(netInvoiceAmount)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    invoicedAmountDue: ").append(toIndentedString(invoicedAmountDue)).append("\n");
    sb.append("    freightAmount: ").append(toIndentedString(freightAmount)).append("\n");
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
    openapiFields.add("netInvoiceAmount");
    openapiFields.add("discountAmount");
    openapiFields.add("discountType");
    openapiFields.add("totalTaxAmount");
    openapiFields.add("invoicedAmountDue");
    openapiFields.add("freightAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponseSummaryTotals
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponseSummaryTotals.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponseSummaryTotals is not found in the empty JSON string", InvoiceDetailsv61ResponseSummaryTotals.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponseSummaryTotals.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponseSummaryTotals` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("discountType") != null && !jsonObj.get("discountType").isJsonNull()) && !jsonObj.get("discountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponseSummaryTotals.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponseSummaryTotals' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponseSummaryTotals> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponseSummaryTotals.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponseSummaryTotals>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponseSummaryTotals value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponseSummaryTotals read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailsv61ResponseSummaryTotals given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailsv61ResponseSummaryTotals
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponseSummaryTotals
  */
  public static InvoiceDetailsv61ResponseSummaryTotals fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponseSummaryTotals.class);
  }

 /**
  * Convert an instance of InvoiceDetailsv61ResponseSummaryTotals to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

