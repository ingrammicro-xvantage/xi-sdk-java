/*
 * XI SDK Resellers
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
 * QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T05:46:16.662413Z[Etc/UTC]")
public class QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_NAME = "accountName";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NAME)
  private String accountName;

  public static final String SERIALIZED_NAME_BCN = "bcn";
  @SerializedName(SERIALIZED_NAME_BCN)
  private String bcn;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo() {
  }

  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * Get accountName
   * @return accountName
  **/
  @javax.annotation.Nullable
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo bcn(String bcn) {
    this.bcn = bcn;
    return this;
  }

   /**
   * Get bcn
   * @return bcn
  **/
  @javax.annotation.Nullable
  public String getBcn() {
    return bcn;
  }

  public void setBcn(String bcn) {
    this.bcn = bcn;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo quoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo = (QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo) o;
    return Objects.equals(this.accountName, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.accountName) &&
        Objects.equals(this.bcn, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.bcn) &&
        Objects.equals(this.phone, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, bcn, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    bcn: ").append(toIndentedString(bcn)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("accountName");
    openapiFields.add("bcn");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo is not found in the empty JSON string", QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accountName") != null && !jsonObj.get("accountName").isJsonNull()) && !jsonObj.get("accountName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountName").toString()));
      }
      if ((jsonObj.get("bcn") != null && !jsonObj.get("bcn").isJsonNull()) && !jsonObj.get("bcn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bcn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bcn").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo
  */
  public static QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo.class);
  }

 /**
  * Convert an instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseAccountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

