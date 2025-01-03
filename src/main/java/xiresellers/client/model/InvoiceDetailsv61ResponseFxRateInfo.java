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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * InvoiceDetailsv61ResponseFxRateInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T17:34:44.949460271Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class InvoiceDetailsv61ResponseFxRateInfo {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nullable
  private String currencyCode;

  public static final String SERIALIZED_NAME_COMPANY_CURRENCY = "companyCurrency";
  @SerializedName(SERIALIZED_NAME_COMPANY_CURRENCY)
  @javax.annotation.Nullable
  private String companyCurrency;

  public static final String SERIALIZED_NAME_INVOICE_CURRENCY = "invoiceCurrency";
  @SerializedName(SERIALIZED_NAME_INVOICE_CURRENCY)
  @javax.annotation.Nullable
  private String invoiceCurrency;

  public static final String SERIALIZED_NAME_CURRENCY_FX_RATE = "currencyFxRate";
  @SerializedName(SERIALIZED_NAME_CURRENCY_FX_RATE)
  @javax.annotation.Nullable
  private Double currencyFxRate;

  public InvoiceDetailsv61ResponseFxRateInfo() {
  }

  public InvoiceDetailsv61ResponseFxRateInfo currencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Currency code.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public InvoiceDetailsv61ResponseFxRateInfo companyCurrency(@javax.annotation.Nullable String companyCurrency) {
    this.companyCurrency = companyCurrency;
    return this;
  }

  /**
   * Company currency code.
   * @return companyCurrency
   */
  @javax.annotation.Nullable
  public String getCompanyCurrency() {
    return companyCurrency;
  }

  public void setCompanyCurrency(@javax.annotation.Nullable String companyCurrency) {
    this.companyCurrency = companyCurrency;
  }


  public InvoiceDetailsv61ResponseFxRateInfo invoiceCurrency(@javax.annotation.Nullable String invoiceCurrency) {
    this.invoiceCurrency = invoiceCurrency;
    return this;
  }

  /**
   * Invoice currency.
   * @return invoiceCurrency
   */
  @javax.annotation.Nullable
  public String getInvoiceCurrency() {
    return invoiceCurrency;
  }

  public void setInvoiceCurrency(@javax.annotation.Nullable String invoiceCurrency) {
    this.invoiceCurrency = invoiceCurrency;
  }


  public InvoiceDetailsv61ResponseFxRateInfo currencyFxRate(@javax.annotation.Nullable Double currencyFxRate) {
    this.currencyFxRate = currencyFxRate;
    return this;
  }

  /**
   * Currency FX rate.
   * @return currencyFxRate
   */
  @javax.annotation.Nullable
  public Double getCurrencyFxRate() {
    return currencyFxRate;
  }

  public void setCurrencyFxRate(@javax.annotation.Nullable Double currencyFxRate) {
    this.currencyFxRate = currencyFxRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponseFxRateInfo invoiceDetailsv61ResponseFxRateInfo = (InvoiceDetailsv61ResponseFxRateInfo) o;
    return Objects.equals(this.currencyCode, invoiceDetailsv61ResponseFxRateInfo.currencyCode) &&
        Objects.equals(this.companyCurrency, invoiceDetailsv61ResponseFxRateInfo.companyCurrency) &&
        Objects.equals(this.invoiceCurrency, invoiceDetailsv61ResponseFxRateInfo.invoiceCurrency) &&
        Objects.equals(this.currencyFxRate, invoiceDetailsv61ResponseFxRateInfo.currencyFxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, companyCurrency, invoiceCurrency, currencyFxRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsv61ResponseFxRateInfo {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    companyCurrency: ").append(toIndentedString(companyCurrency)).append("\n");
    sb.append("    invoiceCurrency: ").append(toIndentedString(invoiceCurrency)).append("\n");
    sb.append("    currencyFxRate: ").append(toIndentedString(currencyFxRate)).append("\n");
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
    openapiFields.add("currencyCode");
    openapiFields.add("companyCurrency");
    openapiFields.add("invoiceCurrency");
    openapiFields.add("currencyFxRate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponseFxRateInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponseFxRateInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponseFxRateInfo is not found in the empty JSON string", InvoiceDetailsv61ResponseFxRateInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponseFxRateInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponseFxRateInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("companyCurrency") != null && !jsonObj.get("companyCurrency").isJsonNull()) && !jsonObj.get("companyCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyCurrency").toString()));
      }
      if ((jsonObj.get("invoiceCurrency") != null && !jsonObj.get("invoiceCurrency").isJsonNull()) && !jsonObj.get("invoiceCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoiceCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoiceCurrency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponseFxRateInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponseFxRateInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponseFxRateInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponseFxRateInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponseFxRateInfo>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponseFxRateInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponseFxRateInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceDetailsv61ResponseFxRateInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceDetailsv61ResponseFxRateInfo
   * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponseFxRateInfo
   */
  public static InvoiceDetailsv61ResponseFxRateInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponseFxRateInfo.class);
  }

  /**
   * Convert an instance of InvoiceDetailsv61ResponseFxRateInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

