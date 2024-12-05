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
 * Payment terms is the agreement between Ingram and the customer by what period they should pay the invoice by
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-05T05:54:00.257688Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class InvoiceDetailsv61ResponsePaymentTermsInfo {
  public static final String SERIALIZED_NAME_PAYMENT_TERMS_CODE = "paymentTermsCode";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS_CODE)
  @javax.annotation.Nullable
  private String paymentTermsCode;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS_DESCRIPTION = "paymentTermsDescription";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS_DESCRIPTION)
  @javax.annotation.Nullable
  private String paymentTermsDescription;

  public static final String SERIALIZED_NAME_PAYMENT_TERMS_DUE_DATE = "paymentTermsDueDate";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERMS_DUE_DATE)
  @javax.annotation.Nullable
  private String paymentTermsDueDate;

  public InvoiceDetailsv61ResponsePaymentTermsInfo() {
  }

  public InvoiceDetailsv61ResponsePaymentTermsInfo paymentTermsCode(@javax.annotation.Nullable String paymentTermsCode) {
    this.paymentTermsCode = paymentTermsCode;
    return this;
  }

  /**
   * Code of the payment terms.
   * @return paymentTermsCode
   */
  @javax.annotation.Nullable
  public String getPaymentTermsCode() {
    return paymentTermsCode;
  }

  public void setPaymentTermsCode(@javax.annotation.Nullable String paymentTermsCode) {
    this.paymentTermsCode = paymentTermsCode;
  }


  public InvoiceDetailsv61ResponsePaymentTermsInfo paymentTermsDescription(@javax.annotation.Nullable String paymentTermsDescription) {
    this.paymentTermsDescription = paymentTermsDescription;
    return this;
  }

  /**
   * Description of the payment terms.
   * @return paymentTermsDescription
   */
  @javax.annotation.Nullable
  public String getPaymentTermsDescription() {
    return paymentTermsDescription;
  }

  public void setPaymentTermsDescription(@javax.annotation.Nullable String paymentTermsDescription) {
    this.paymentTermsDescription = paymentTermsDescription;
  }


  public InvoiceDetailsv61ResponsePaymentTermsInfo paymentTermsDueDate(@javax.annotation.Nullable String paymentTermsDueDate) {
    this.paymentTermsDueDate = paymentTermsDueDate;
    return this;
  }

  /**
   * Due date of the payment terms.
   * @return paymentTermsDueDate
   */
  @javax.annotation.Nullable
  public String getPaymentTermsDueDate() {
    return paymentTermsDueDate;
  }

  public void setPaymentTermsDueDate(@javax.annotation.Nullable String paymentTermsDueDate) {
    this.paymentTermsDueDate = paymentTermsDueDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponsePaymentTermsInfo invoiceDetailsv61ResponsePaymentTermsInfo = (InvoiceDetailsv61ResponsePaymentTermsInfo) o;
    return Objects.equals(this.paymentTermsCode, invoiceDetailsv61ResponsePaymentTermsInfo.paymentTermsCode) &&
        Objects.equals(this.paymentTermsDescription, invoiceDetailsv61ResponsePaymentTermsInfo.paymentTermsDescription) &&
        Objects.equals(this.paymentTermsDueDate, invoiceDetailsv61ResponsePaymentTermsInfo.paymentTermsDueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentTermsCode, paymentTermsDescription, paymentTermsDueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsv61ResponsePaymentTermsInfo {\n");
    sb.append("    paymentTermsCode: ").append(toIndentedString(paymentTermsCode)).append("\n");
    sb.append("    paymentTermsDescription: ").append(toIndentedString(paymentTermsDescription)).append("\n");
    sb.append("    paymentTermsDueDate: ").append(toIndentedString(paymentTermsDueDate)).append("\n");
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
    openapiFields.add("paymentTermsCode");
    openapiFields.add("paymentTermsDescription");
    openapiFields.add("paymentTermsDueDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponsePaymentTermsInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponsePaymentTermsInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponsePaymentTermsInfo is not found in the empty JSON string", InvoiceDetailsv61ResponsePaymentTermsInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponsePaymentTermsInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponsePaymentTermsInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("paymentTermsCode") != null && !jsonObj.get("paymentTermsCode").isJsonNull()) && !jsonObj.get("paymentTermsCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentTermsCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentTermsCode").toString()));
      }
      if ((jsonObj.get("paymentTermsDescription") != null && !jsonObj.get("paymentTermsDescription").isJsonNull()) && !jsonObj.get("paymentTermsDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentTermsDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentTermsDescription").toString()));
      }
      if ((jsonObj.get("paymentTermsDueDate") != null && !jsonObj.get("paymentTermsDueDate").isJsonNull()) && !jsonObj.get("paymentTermsDueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentTermsDueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentTermsDueDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponsePaymentTermsInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponsePaymentTermsInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponsePaymentTermsInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponsePaymentTermsInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponsePaymentTermsInfo>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponsePaymentTermsInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponsePaymentTermsInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceDetailsv61ResponsePaymentTermsInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceDetailsv61ResponsePaymentTermsInfo
   * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponsePaymentTermsInfo
   */
  public static InvoiceDetailsv61ResponsePaymentTermsInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponsePaymentTermsInfo.class);
  }

  /**
   * Convert an instance of InvoiceDetailsv61ResponsePaymentTermsInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

