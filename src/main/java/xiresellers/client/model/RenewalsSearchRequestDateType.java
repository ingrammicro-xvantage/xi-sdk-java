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
import xiresellers.client.model.RenewalsSearchRequestDateTypeEndDate;
import xiresellers.client.model.RenewalsSearchRequestDateTypeExpirationDate;
import xiresellers.client.model.RenewalsSearchRequestDateTypeInvoiceDate;
import xiresellers.client.model.RenewalsSearchRequestDateTypeStartDate;

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
 * RenewalsSearchRequestDateType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:47:59.759396Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RenewalsSearchRequestDateType {
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private RenewalsSearchRequestDateTypeStartDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private RenewalsSearchRequestDateTypeEndDate endDate;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoiceDate";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private RenewalsSearchRequestDateTypeInvoiceDate invoiceDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private RenewalsSearchRequestDateTypeExpirationDate expirationDate;

  public RenewalsSearchRequestDateType() {
  }

  public RenewalsSearchRequestDateType startDate(RenewalsSearchRequestDateTypeStartDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nullable
  public RenewalsSearchRequestDateTypeStartDate getStartDate() {
    return startDate;
  }

  public void setStartDate(RenewalsSearchRequestDateTypeStartDate startDate) {
    this.startDate = startDate;
  }


  public RenewalsSearchRequestDateType endDate(RenewalsSearchRequestDateTypeEndDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public RenewalsSearchRequestDateTypeEndDate getEndDate() {
    return endDate;
  }

  public void setEndDate(RenewalsSearchRequestDateTypeEndDate endDate) {
    this.endDate = endDate;
  }


  public RenewalsSearchRequestDateType invoiceDate(RenewalsSearchRequestDateTypeInvoiceDate invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

  /**
   * Get invoiceDate
   * @return invoiceDate
   */
  @javax.annotation.Nullable
  public RenewalsSearchRequestDateTypeInvoiceDate getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(RenewalsSearchRequestDateTypeInvoiceDate invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public RenewalsSearchRequestDateType expirationDate(RenewalsSearchRequestDateTypeExpirationDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public RenewalsSearchRequestDateTypeExpirationDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(RenewalsSearchRequestDateTypeExpirationDate expirationDate) {
    this.expirationDate = expirationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsSearchRequestDateType renewalsSearchRequestDateType = (RenewalsSearchRequestDateType) o;
    return Objects.equals(this.startDate, renewalsSearchRequestDateType.startDate) &&
        Objects.equals(this.endDate, renewalsSearchRequestDateType.endDate) &&
        Objects.equals(this.invoiceDate, renewalsSearchRequestDateType.invoiceDate) &&
        Objects.equals(this.expirationDate, renewalsSearchRequestDateType.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, invoiceDate, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsSearchRequestDateType {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("invoiceDate");
    openapiFields.add("expirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenewalsSearchRequestDateType
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsSearchRequestDateType.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsSearchRequestDateType is not found in the empty JSON string", RenewalsSearchRequestDateType.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsSearchRequestDateType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsSearchRequestDateType` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `startDate`
      if (jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) {
        RenewalsSearchRequestDateTypeStartDate.validateJsonElement(jsonObj.get("startDate"));
      }
      // validate the optional field `endDate`
      if (jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) {
        RenewalsSearchRequestDateTypeEndDate.validateJsonElement(jsonObj.get("endDate"));
      }
      // validate the optional field `invoiceDate`
      if (jsonObj.get("invoiceDate") != null && !jsonObj.get("invoiceDate").isJsonNull()) {
        RenewalsSearchRequestDateTypeInvoiceDate.validateJsonElement(jsonObj.get("invoiceDate"));
      }
      // validate the optional field `expirationDate`
      if (jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) {
        RenewalsSearchRequestDateTypeExpirationDate.validateJsonElement(jsonObj.get("expirationDate"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsSearchRequestDateType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsSearchRequestDateType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsSearchRequestDateType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsSearchRequestDateType.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsSearchRequestDateType>() {
           @Override
           public void write(JsonWriter out, RenewalsSearchRequestDateType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsSearchRequestDateType read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenewalsSearchRequestDateType given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenewalsSearchRequestDateType
   * @throws IOException if the JSON string is invalid with respect to RenewalsSearchRequestDateType
   */
  public static RenewalsSearchRequestDateType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsSearchRequestDateType.class);
  }

  /**
   * Convert an instance of RenewalsSearchRequestDateType to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

