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
 * QuoteListRequestQuoteSearchRequestRequestPreamble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class QuoteListRequestQuoteSearchRequestRequestPreamble {
  public static final String SERIALIZED_NAME_CUSTOMER_NUMBER = "customerNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NUMBER)
  private String customerNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_CONTACT = "customerContact";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_CONTACT)
  private String customerContact;

  public static final String SERIALIZED_NAME_ISO_COUNTRY_CODE = "isoCountryCode";
  @SerializedName(SERIALIZED_NAME_ISO_COUNTRY_CODE)
  private String isoCountryCode;

  public QuoteListRequestQuoteSearchRequestRequestPreamble() {
  }

  public QuoteListRequestQuoteSearchRequestRequestPreamble customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

   /**
   * Reseller Number (referred to as the account BCN) is the unique identifier for an Ingram Micro customer account.
   * @return customerNumber
  **/
  @javax.annotation.Nonnull
  public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }


  public QuoteListRequestQuoteSearchRequestRequestPreamble customerContact(String customerContact) {
    this.customerContact = customerContact;
    return this;
  }

   /**
   * Logged in User&#39;s email address.
   * @return customerContact
  **/
  @javax.annotation.Nullable
  public String getCustomerContact() {
    return customerContact;
  }

  public void setCustomerContact(String customerContact) {
    this.customerContact = customerContact;
  }


  public QuoteListRequestQuoteSearchRequestRequestPreamble isoCountryCode(String isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
    return this;
  }

   /**
   * The ISO country codes are internationally recognized codes designated for each country represented by a two-letter combination (alpha-2).
   * @return isoCountryCode
  **/
  @javax.annotation.Nonnull
  public String getIsoCountryCode() {
    return isoCountryCode;
  }

  public void setIsoCountryCode(String isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteListRequestQuoteSearchRequestRequestPreamble quoteListRequestQuoteSearchRequestRequestPreamble = (QuoteListRequestQuoteSearchRequestRequestPreamble) o;
    return Objects.equals(this.customerNumber, quoteListRequestQuoteSearchRequestRequestPreamble.customerNumber) &&
        Objects.equals(this.customerContact, quoteListRequestQuoteSearchRequestRequestPreamble.customerContact) &&
        Objects.equals(this.isoCountryCode, quoteListRequestQuoteSearchRequestRequestPreamble.isoCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, customerContact, isoCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteListRequestQuoteSearchRequestRequestPreamble {\n");
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    customerContact: ").append(toIndentedString(customerContact)).append("\n");
    sb.append("    isoCountryCode: ").append(toIndentedString(isoCountryCode)).append("\n");
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
    openapiFields.add("customerNumber");
    openapiFields.add("customerContact");
    openapiFields.add("isoCountryCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customerNumber");
    openapiRequiredFields.add("isoCountryCode");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteListRequestQuoteSearchRequestRequestPreamble
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteListRequestQuoteSearchRequestRequestPreamble.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteListRequestQuoteSearchRequestRequestPreamble is not found in the empty JSON string", QuoteListRequestQuoteSearchRequestRequestPreamble.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteListRequestQuoteSearchRequestRequestPreamble.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteListRequestQuoteSearchRequestRequestPreamble` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : QuoteListRequestQuoteSearchRequestRequestPreamble.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customerNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerNumber").toString()));
      }
      if ((jsonObj.get("customerContact") != null && !jsonObj.get("customerContact").isJsonNull()) && !jsonObj.get("customerContact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerContact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerContact").toString()));
      }
      if (!jsonObj.get("isoCountryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isoCountryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isoCountryCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteListRequestQuoteSearchRequestRequestPreamble.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteListRequestQuoteSearchRequestRequestPreamble' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteListRequestQuoteSearchRequestRequestPreamble> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteListRequestQuoteSearchRequestRequestPreamble.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteListRequestQuoteSearchRequestRequestPreamble>() {
           @Override
           public void write(JsonWriter out, QuoteListRequestQuoteSearchRequestRequestPreamble value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteListRequestQuoteSearchRequestRequestPreamble read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteListRequestQuoteSearchRequestRequestPreamble given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteListRequestQuoteSearchRequestRequestPreamble
  * @throws IOException if the JSON string is invalid with respect to QuoteListRequestQuoteSearchRequestRequestPreamble
  */
  public static QuoteListRequestQuoteSearchRequestRequestPreamble fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteListRequestQuoteSearchRequestRequestPreamble.class);
  }

 /**
  * Convert an instance of QuoteListRequestQuoteSearchRequestRequestPreamble to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
