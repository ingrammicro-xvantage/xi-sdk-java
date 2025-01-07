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
 * InvoiceDetailsv61ResponseSummaryMiscChargesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T09:55:14.296096519Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class InvoiceDetailsv61ResponseSummaryMiscChargesInner {
  public static final String SERIALIZED_NAME_CHARGE_DESCRIPTION = "chargeDescription";
  @SerializedName(SERIALIZED_NAME_CHARGE_DESCRIPTION)
  @javax.annotation.Nullable
  private String chargeDescription;

  public static final String SERIALIZED_NAME_MISC_CHARGE_LINE_COUNT = "miscChargeLineCount";
  @SerializedName(SERIALIZED_NAME_MISC_CHARGE_LINE_COUNT)
  @javax.annotation.Nullable
  private Integer miscChargeLineCount;

  public static final String SERIALIZED_NAME_MISC_CHARGE_LINE_TOTAL = "miscChargeLineTotal";
  @SerializedName(SERIALIZED_NAME_MISC_CHARGE_LINE_TOTAL)
  @javax.annotation.Nullable
  private Double miscChargeLineTotal;

  public static final String SERIALIZED_NAME_CHARGE_LINE_REFERENCE = "chargeLineReference";
  @SerializedName(SERIALIZED_NAME_CHARGE_LINE_REFERENCE)
  @javax.annotation.Nullable
  private String chargeLineReference;

  public static final String SERIALIZED_NAME_IS_NON_MISC = "isNonMisc";
  @SerializedName(SERIALIZED_NAME_IS_NON_MISC)
  @javax.annotation.Nullable
  private String isNonMisc;

  public InvoiceDetailsv61ResponseSummaryMiscChargesInner() {
  }

  public InvoiceDetailsv61ResponseSummaryMiscChargesInner chargeDescription(@javax.annotation.Nullable String chargeDescription) {
    this.chargeDescription = chargeDescription;
    return this;
  }

  /**
   * Description of the charge.
   * @return chargeDescription
   */
  @javax.annotation.Nullable
  public String getChargeDescription() {
    return chargeDescription;
  }

  public void setChargeDescription(@javax.annotation.Nullable String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }


  public InvoiceDetailsv61ResponseSummaryMiscChargesInner miscChargeLineCount(@javax.annotation.Nullable Integer miscChargeLineCount) {
    this.miscChargeLineCount = miscChargeLineCount;
    return this;
  }

  /**
   * The number of lines for which miscellaneous charges are applicable.
   * @return miscChargeLineCount
   */
  @javax.annotation.Nullable
  public Integer getMiscChargeLineCount() {
    return miscChargeLineCount;
  }

  public void setMiscChargeLineCount(@javax.annotation.Nullable Integer miscChargeLineCount) {
    this.miscChargeLineCount = miscChargeLineCount;
  }


  public InvoiceDetailsv61ResponseSummaryMiscChargesInner miscChargeLineTotal(@javax.annotation.Nullable Double miscChargeLineTotal) {
    this.miscChargeLineTotal = miscChargeLineTotal;
    return this;
  }

  /**
   * Miscellaneous charge amount.
   * @return miscChargeLineTotal
   */
  @javax.annotation.Nullable
  public Double getMiscChargeLineTotal() {
    return miscChargeLineTotal;
  }

  public void setMiscChargeLineTotal(@javax.annotation.Nullable Double miscChargeLineTotal) {
    this.miscChargeLineTotal = miscChargeLineTotal;
  }


  public InvoiceDetailsv61ResponseSummaryMiscChargesInner chargeLineReference(@javax.annotation.Nullable String chargeLineReference) {
    this.chargeLineReference = chargeLineReference;
    return this;
  }

  /**
   * Reference of the chargeLine.
   * @return chargeLineReference
   */
  @javax.annotation.Nullable
  public String getChargeLineReference() {
    return chargeLineReference;
  }

  public void setChargeLineReference(@javax.annotation.Nullable String chargeLineReference) {
    this.chargeLineReference = chargeLineReference;
  }


  public InvoiceDetailsv61ResponseSummaryMiscChargesInner isNonMisc(@javax.annotation.Nullable String isNonMisc) {
    this.isNonMisc = isNonMisc;
    return this;
  }

  /**
   * Is charge non miscellaneous.
   * @return isNonMisc
   */
  @javax.annotation.Nullable
  public String getIsNonMisc() {
    return isNonMisc;
  }

  public void setIsNonMisc(@javax.annotation.Nullable String isNonMisc) {
    this.isNonMisc = isNonMisc;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponseSummaryMiscChargesInner invoiceDetailsv61ResponseSummaryMiscChargesInner = (InvoiceDetailsv61ResponseSummaryMiscChargesInner) o;
    return Objects.equals(this.chargeDescription, invoiceDetailsv61ResponseSummaryMiscChargesInner.chargeDescription) &&
        Objects.equals(this.miscChargeLineCount, invoiceDetailsv61ResponseSummaryMiscChargesInner.miscChargeLineCount) &&
        Objects.equals(this.miscChargeLineTotal, invoiceDetailsv61ResponseSummaryMiscChargesInner.miscChargeLineTotal) &&
        Objects.equals(this.chargeLineReference, invoiceDetailsv61ResponseSummaryMiscChargesInner.chargeLineReference) &&
        Objects.equals(this.isNonMisc, invoiceDetailsv61ResponseSummaryMiscChargesInner.isNonMisc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeDescription, miscChargeLineCount, miscChargeLineTotal, chargeLineReference, isNonMisc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailsv61ResponseSummaryMiscChargesInner {\n");
    sb.append("    chargeDescription: ").append(toIndentedString(chargeDescription)).append("\n");
    sb.append("    miscChargeLineCount: ").append(toIndentedString(miscChargeLineCount)).append("\n");
    sb.append("    miscChargeLineTotal: ").append(toIndentedString(miscChargeLineTotal)).append("\n");
    sb.append("    chargeLineReference: ").append(toIndentedString(chargeLineReference)).append("\n");
    sb.append("    isNonMisc: ").append(toIndentedString(isNonMisc)).append("\n");
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
    openapiFields.add("chargeDescription");
    openapiFields.add("miscChargeLineCount");
    openapiFields.add("miscChargeLineTotal");
    openapiFields.add("chargeLineReference");
    openapiFields.add("isNonMisc");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponseSummaryMiscChargesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponseSummaryMiscChargesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponseSummaryMiscChargesInner is not found in the empty JSON string", InvoiceDetailsv61ResponseSummaryMiscChargesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponseSummaryMiscChargesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponseSummaryMiscChargesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chargeDescription") != null && !jsonObj.get("chargeDescription").isJsonNull()) && !jsonObj.get("chargeDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeDescription").toString()));
      }
      if ((jsonObj.get("chargeLineReference") != null && !jsonObj.get("chargeLineReference").isJsonNull()) && !jsonObj.get("chargeLineReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeLineReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeLineReference").toString()));
      }
      if ((jsonObj.get("isNonMisc") != null && !jsonObj.get("isNonMisc").isJsonNull()) && !jsonObj.get("isNonMisc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isNonMisc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isNonMisc").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponseSummaryMiscChargesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponseSummaryMiscChargesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponseSummaryMiscChargesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponseSummaryMiscChargesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponseSummaryMiscChargesInner>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponseSummaryMiscChargesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponseSummaryMiscChargesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceDetailsv61ResponseSummaryMiscChargesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceDetailsv61ResponseSummaryMiscChargesInner
   * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponseSummaryMiscChargesInner
   */
  public static InvoiceDetailsv61ResponseSummaryMiscChargesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponseSummaryMiscChargesInner.class);
  }

  /**
   * Convert an instance of InvoiceDetailsv61ResponseSummaryMiscChargesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

