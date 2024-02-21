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
 * InvoiceDetailsv61ResponseSummaryForeignFxTotals
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T08:44:05.228708Z[Etc/UTC]")
public class InvoiceDetailsv61ResponseSummaryForeignFxTotals {
  public static final String SERIALIZED_NAME_FOREIGN_CURRENCY_CODE = "foreignCurrencyCode";
  @SerializedName(SERIALIZED_NAME_FOREIGN_CURRENCY_CODE)
  private String foreignCurrencyCode;

  public static final String SERIALIZED_NAME_FOREIGN_CURRENCY_FX_RATE = "foreignCurrencyFxRate";
  @SerializedName(SERIALIZED_NAME_FOREIGN_CURRENCY_FX_RATE)
  private Double foreignCurrencyFxRate;

  public static final String SERIALIZED_NAME_FOREIGN_TOTAL_TAXABLE_AMOUNT = "foreignTotalTaxableAmount";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TOTAL_TAXABLE_AMOUNT)
  private String foreignTotalTaxableAmount;

  public static final String SERIALIZED_NAME_FOREIGN_TOTAL_TAX_AMOUNT = "foreignTotalTaxAmount";
  @SerializedName(SERIALIZED_NAME_FOREIGN_TOTAL_TAX_AMOUNT)
  private Double foreignTotalTaxAmount;

  public static final String SERIALIZED_NAME_FOREIGN_INVOICE_AMOUNT_DUE = "foreignInvoiceAmountDue";
  @SerializedName(SERIALIZED_NAME_FOREIGN_INVOICE_AMOUNT_DUE)
  private String foreignInvoiceAmountDue;

  public InvoiceDetailsv61ResponseSummaryForeignFxTotals() {
  }

  public InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignCurrencyCode(String foreignCurrencyCode) {
    this.foreignCurrencyCode = foreignCurrencyCode;
    return this;
  }

   /**
   * Foreign Currency Code.
   * @return foreignCurrencyCode
  **/
  @javax.annotation.Nullable
  public String getForeignCurrencyCode() {
    return foreignCurrencyCode;
  }

  public void setForeignCurrencyCode(String foreignCurrencyCode) {
    this.foreignCurrencyCode = foreignCurrencyCode;
  }


  public InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignCurrencyFxRate(Double foreignCurrencyFxRate) {
    this.foreignCurrencyFxRate = foreignCurrencyFxRate;
    return this;
  }

   /**
   * Foreign rate.
   * @return foreignCurrencyFxRate
  **/
  @javax.annotation.Nullable
  public Double getForeignCurrencyFxRate() {
    return foreignCurrencyFxRate;
  }

  public void setForeignCurrencyFxRate(Double foreignCurrencyFxRate) {
    this.foreignCurrencyFxRate = foreignCurrencyFxRate;
  }


  public InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignTotalTaxableAmount(String foreignTotalTaxableAmount) {
    this.foreignTotalTaxableAmount = foreignTotalTaxableAmount;
    return this;
  }

   /**
   * Foreign amount.
   * @return foreignTotalTaxableAmount
  **/
  @javax.annotation.Nullable
  public String getForeignTotalTaxableAmount() {
    return foreignTotalTaxableAmount;
  }

  public void setForeignTotalTaxableAmount(String foreignTotalTaxableAmount) {
    this.foreignTotalTaxableAmount = foreignTotalTaxableAmount;
  }


  public InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignTotalTaxAmount(Double foreignTotalTaxAmount) {
    this.foreignTotalTaxAmount = foreignTotalTaxAmount;
    return this;
  }

   /**
   * Foreign amount.
   * @return foreignTotalTaxAmount
  **/
  @javax.annotation.Nullable
  public Double getForeignTotalTaxAmount() {
    return foreignTotalTaxAmount;
  }

  public void setForeignTotalTaxAmount(Double foreignTotalTaxAmount) {
    this.foreignTotalTaxAmount = foreignTotalTaxAmount;
  }


  public InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignInvoiceAmountDue(String foreignInvoiceAmountDue) {
    this.foreignInvoiceAmountDue = foreignInvoiceAmountDue;
    return this;
  }

   /**
   * Foreign due.
   * @return foreignInvoiceAmountDue
  **/
  @javax.annotation.Nullable
  public String getForeignInvoiceAmountDue() {
    return foreignInvoiceAmountDue;
  }

  public void setForeignInvoiceAmountDue(String foreignInvoiceAmountDue) {
    this.foreignInvoiceAmountDue = foreignInvoiceAmountDue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponseSummaryForeignFxTotals invoiceDetailsv61ResponseSummaryForeignFxTotals = (InvoiceDetailsv61ResponseSummaryForeignFxTotals) o;
    return Objects.equals(this.foreignCurrencyCode, invoiceDetailsv61ResponseSummaryForeignFxTotals.foreignCurrencyCode) &&
        Objects.equals(this.foreignCurrencyFxRate, invoiceDetailsv61ResponseSummaryForeignFxTotals.foreignCurrencyFxRate) &&
        Objects.equals(this.foreignTotalTaxableAmount, invoiceDetailsv61ResponseSummaryForeignFxTotals.foreignTotalTaxableAmount) &&
        Objects.equals(this.foreignTotalTaxAmount, invoiceDetailsv61ResponseSummaryForeignFxTotals.foreignTotalTaxAmount) &&
        Objects.equals(this.foreignInvoiceAmountDue, invoiceDetailsv61ResponseSummaryForeignFxTotals.foreignInvoiceAmountDue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreignCurrencyCode, foreignCurrencyFxRate, foreignTotalTaxableAmount, foreignTotalTaxAmount, foreignInvoiceAmountDue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsv61ResponseSummaryForeignFxTotals {\n");
    sb.append("    foreignCurrencyCode: ").append(toIndentedString(foreignCurrencyCode)).append("\n");
    sb.append("    foreignCurrencyFxRate: ").append(toIndentedString(foreignCurrencyFxRate)).append("\n");
    sb.append("    foreignTotalTaxableAmount: ").append(toIndentedString(foreignTotalTaxableAmount)).append("\n");
    sb.append("    foreignTotalTaxAmount: ").append(toIndentedString(foreignTotalTaxAmount)).append("\n");
    sb.append("    foreignInvoiceAmountDue: ").append(toIndentedString(foreignInvoiceAmountDue)).append("\n");
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
    openapiFields.add("foreignCurrencyCode");
    openapiFields.add("foreignCurrencyFxRate");
    openapiFields.add("foreignTotalTaxableAmount");
    openapiFields.add("foreignTotalTaxAmount");
    openapiFields.add("foreignInvoiceAmountDue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponseSummaryForeignFxTotals
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponseSummaryForeignFxTotals.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponseSummaryForeignFxTotals is not found in the empty JSON string", InvoiceDetailsv61ResponseSummaryForeignFxTotals.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponseSummaryForeignFxTotals.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponseSummaryForeignFxTotals` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("foreignCurrencyCode") != null && !jsonObj.get("foreignCurrencyCode").isJsonNull()) && !jsonObj.get("foreignCurrencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignCurrencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignCurrencyCode").toString()));
      }
      if ((jsonObj.get("foreignTotalTaxableAmount") != null && !jsonObj.get("foreignTotalTaxableAmount").isJsonNull()) && !jsonObj.get("foreignTotalTaxableAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignTotalTaxableAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignTotalTaxableAmount").toString()));
      }
      if ((jsonObj.get("foreignInvoiceAmountDue") != null && !jsonObj.get("foreignInvoiceAmountDue").isJsonNull()) && !jsonObj.get("foreignInvoiceAmountDue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignInvoiceAmountDue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignInvoiceAmountDue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponseSummaryForeignFxTotals.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponseSummaryForeignFxTotals' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponseSummaryForeignFxTotals> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponseSummaryForeignFxTotals.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponseSummaryForeignFxTotals>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponseSummaryForeignFxTotals value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponseSummaryForeignFxTotals read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailsv61ResponseSummaryForeignFxTotals given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailsv61ResponseSummaryForeignFxTotals
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponseSummaryForeignFxTotals
  */
  public static InvoiceDetailsv61ResponseSummaryForeignFxTotals fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponseSummaryForeignFxTotals.class);
  }

 /**
  * Convert an instance of InvoiceDetailsv61ResponseSummaryForeignFxTotals to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

