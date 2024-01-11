/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

import org.openapitools.client.JSON;

/**
 * QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser {
  public static final String SERIALIZED_NAME_END_USER_NAME = "endUserName";
  @SerializedName(SERIALIZED_NAME_END_USER_NAME)
  private String endUserName;

  public static final String SERIALIZED_NAME_END_USER_ADDRESS = "endUserAddress";
  @SerializedName(SERIALIZED_NAME_END_USER_ADDRESS)
  private String endUserAddress;

  public static final String SERIALIZED_NAME_END_USER_ADDRESS2 = "endUserAddress2";
  @SerializedName(SERIALIZED_NAME_END_USER_ADDRESS2)
  private String endUserAddress2;

  public static final String SERIALIZED_NAME_END_USER_ADDRESS3 = "endUserAddress3";
  @SerializedName(SERIALIZED_NAME_END_USER_ADDRESS3)
  private String endUserAddress3;

  public static final String SERIALIZED_NAME_END_USER_CITY = "endUserCity";
  @SerializedName(SERIALIZED_NAME_END_USER_CITY)
  private String endUserCity;

  public static final String SERIALIZED_NAME_END_USER_STATE = "endUserState";
  @SerializedName(SERIALIZED_NAME_END_USER_STATE)
  private String endUserState;

  public static final String SERIALIZED_NAME_END_USER_EMAIL = "endUserEmail";
  @SerializedName(SERIALIZED_NAME_END_USER_EMAIL)
  private String endUserEmail;

  public static final String SERIALIZED_NAME_END_USER_PHONE = "endUserPhone";
  @SerializedName(SERIALIZED_NAME_END_USER_PHONE)
  private String endUserPhone;

  public static final String SERIALIZED_NAME_END_USER_ZIP_CODE = "endUserZipCode";
  @SerializedName(SERIALIZED_NAME_END_USER_ZIP_CODE)
  private String endUserZipCode;

  public static final String SERIALIZED_NAME_END_USER_CONTACT_NAME = "endUserContactName";
  @SerializedName(SERIALIZED_NAME_END_USER_CONTACT_NAME)
  private String endUserContactName;

  public static final String SERIALIZED_NAME_END_USER_MARKET_SEGMENT = "endUserMarketSegment";
  @SerializedName(SERIALIZED_NAME_END_USER_MARKET_SEGMENT)
  private String endUserMarketSegment;

  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser() {
  }

  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserName(String endUserName) {
    this.endUserName = endUserName;
    return this;
  }

   /**
   * Get endUserName
   * @return endUserName
  **/
  @javax.annotation.Nullable
  public String getEndUserName() {
    return endUserName;
  }

  public void setEndUserName(String endUserName) {
    this.endUserName = endUserName;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserAddress(String endUserAddress) {
    this.endUserAddress = endUserAddress;
    return this;
  }

   /**
   * Get endUserAddress
   * @return endUserAddress
  **/
  @javax.annotation.Nullable
  public String getEndUserAddress() {
    return endUserAddress;
  }

  public void setEndUserAddress(String endUserAddress) {
    this.endUserAddress = endUserAddress;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserAddress2(String endUserAddress2) {
    this.endUserAddress2 = endUserAddress2;
    return this;
  }

   /**
   * Get endUserAddress2
   * @return endUserAddress2
  **/
  @javax.annotation.Nullable
  public String getEndUserAddress2() {
    return endUserAddress2;
  }

  public void setEndUserAddress2(String endUserAddress2) {
    this.endUserAddress2 = endUserAddress2;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserAddress3(String endUserAddress3) {
    this.endUserAddress3 = endUserAddress3;
    return this;
  }

   /**
   * Get endUserAddress3
   * @return endUserAddress3
  **/
  @javax.annotation.Nullable
  public String getEndUserAddress3() {
    return endUserAddress3;
  }

  public void setEndUserAddress3(String endUserAddress3) {
    this.endUserAddress3 = endUserAddress3;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserCity(String endUserCity) {
    this.endUserCity = endUserCity;
    return this;
  }

   /**
   * Get endUserCity
   * @return endUserCity
  **/
  @javax.annotation.Nullable
  public String getEndUserCity() {
    return endUserCity;
  }

  public void setEndUserCity(String endUserCity) {
    this.endUserCity = endUserCity;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserState(String endUserState) {
    this.endUserState = endUserState;
    return this;
  }

   /**
   * Get endUserState
   * @return endUserState
  **/
  @javax.annotation.Nullable
  public String getEndUserState() {
    return endUserState;
  }

  public void setEndUserState(String endUserState) {
    this.endUserState = endUserState;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserEmail(String endUserEmail) {
    this.endUserEmail = endUserEmail;
    return this;
  }

   /**
   * Get endUserEmail
   * @return endUserEmail
  **/
  @javax.annotation.Nullable
  public String getEndUserEmail() {
    return endUserEmail;
  }

  public void setEndUserEmail(String endUserEmail) {
    this.endUserEmail = endUserEmail;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserPhone(String endUserPhone) {
    this.endUserPhone = endUserPhone;
    return this;
  }

   /**
   * Get endUserPhone
   * @return endUserPhone
  **/
  @javax.annotation.Nullable
  public String getEndUserPhone() {
    return endUserPhone;
  }

  public void setEndUserPhone(String endUserPhone) {
    this.endUserPhone = endUserPhone;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserZipCode(String endUserZipCode) {
    this.endUserZipCode = endUserZipCode;
    return this;
  }

   /**
   * Get endUserZipCode
   * @return endUserZipCode
  **/
  @javax.annotation.Nullable
  public String getEndUserZipCode() {
    return endUserZipCode;
  }

  public void setEndUserZipCode(String endUserZipCode) {
    this.endUserZipCode = endUserZipCode;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserContactName(String endUserContactName) {
    this.endUserContactName = endUserContactName;
    return this;
  }

   /**
   * Get endUserContactName
   * @return endUserContactName
  **/
  @javax.annotation.Nullable
  public String getEndUserContactName() {
    return endUserContactName;
  }

  public void setEndUserContactName(String endUserContactName) {
    this.endUserContactName = endUserContactName;
  }


  public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser endUserMarketSegment(String endUserMarketSegment) {
    this.endUserMarketSegment = endUserMarketSegment;
    return this;
  }

   /**
   * Get endUserMarketSegment
   * @return endUserMarketSegment
  **/
  @javax.annotation.Nullable
  public String getEndUserMarketSegment() {
    return endUserMarketSegment;
  }

  public void setEndUserMarketSegment(String endUserMarketSegment) {
    this.endUserMarketSegment = endUserMarketSegment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser = (QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser) o;
    return Objects.equals(this.endUserName, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserName) &&
        Objects.equals(this.endUserAddress, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserAddress) &&
        Objects.equals(this.endUserAddress2, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserAddress2) &&
        Objects.equals(this.endUserAddress3, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserAddress3) &&
        Objects.equals(this.endUserCity, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserCity) &&
        Objects.equals(this.endUserState, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserState) &&
        Objects.equals(this.endUserEmail, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserEmail) &&
        Objects.equals(this.endUserPhone, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserPhone) &&
        Objects.equals(this.endUserZipCode, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserZipCode) &&
        Objects.equals(this.endUserContactName, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserContactName) &&
        Objects.equals(this.endUserMarketSegment, quoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.endUserMarketSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endUserName, endUserAddress, endUserAddress2, endUserAddress3, endUserCity, endUserState, endUserEmail, endUserPhone, endUserZipCode, endUserContactName, endUserMarketSegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser {\n");
    sb.append("    endUserName: ").append(toIndentedString(endUserName)).append("\n");
    sb.append("    endUserAddress: ").append(toIndentedString(endUserAddress)).append("\n");
    sb.append("    endUserAddress2: ").append(toIndentedString(endUserAddress2)).append("\n");
    sb.append("    endUserAddress3: ").append(toIndentedString(endUserAddress3)).append("\n");
    sb.append("    endUserCity: ").append(toIndentedString(endUserCity)).append("\n");
    sb.append("    endUserState: ").append(toIndentedString(endUserState)).append("\n");
    sb.append("    endUserEmail: ").append(toIndentedString(endUserEmail)).append("\n");
    sb.append("    endUserPhone: ").append(toIndentedString(endUserPhone)).append("\n");
    sb.append("    endUserZipCode: ").append(toIndentedString(endUserZipCode)).append("\n");
    sb.append("    endUserContactName: ").append(toIndentedString(endUserContactName)).append("\n");
    sb.append("    endUserMarketSegment: ").append(toIndentedString(endUserMarketSegment)).append("\n");
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
    openapiFields.add("endUserName");
    openapiFields.add("endUserAddress");
    openapiFields.add("endUserAddress2");
    openapiFields.add("endUserAddress3");
    openapiFields.add("endUserCity");
    openapiFields.add("endUserState");
    openapiFields.add("endUserEmail");
    openapiFields.add("endUserPhone");
    openapiFields.add("endUserZipCode");
    openapiFields.add("endUserContactName");
    openapiFields.add("endUserMarketSegment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser is not found in the empty JSON string", QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("endUserName") != null && !jsonObj.get("endUserName").isJsonNull()) && !jsonObj.get("endUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserName").toString()));
      }
      if ((jsonObj.get("endUserAddress") != null && !jsonObj.get("endUserAddress").isJsonNull()) && !jsonObj.get("endUserAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserAddress").toString()));
      }
      if ((jsonObj.get("endUserAddress2") != null && !jsonObj.get("endUserAddress2").isJsonNull()) && !jsonObj.get("endUserAddress2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserAddress2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserAddress2").toString()));
      }
      if ((jsonObj.get("endUserAddress3") != null && !jsonObj.get("endUserAddress3").isJsonNull()) && !jsonObj.get("endUserAddress3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserAddress3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserAddress3").toString()));
      }
      if ((jsonObj.get("endUserCity") != null && !jsonObj.get("endUserCity").isJsonNull()) && !jsonObj.get("endUserCity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserCity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserCity").toString()));
      }
      if ((jsonObj.get("endUserState") != null && !jsonObj.get("endUserState").isJsonNull()) && !jsonObj.get("endUserState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserState").toString()));
      }
      if ((jsonObj.get("endUserEmail") != null && !jsonObj.get("endUserEmail").isJsonNull()) && !jsonObj.get("endUserEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserEmail").toString()));
      }
      if ((jsonObj.get("endUserPhone") != null && !jsonObj.get("endUserPhone").isJsonNull()) && !jsonObj.get("endUserPhone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserPhone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserPhone").toString()));
      }
      if ((jsonObj.get("endUserZipCode") != null && !jsonObj.get("endUserZipCode").isJsonNull()) && !jsonObj.get("endUserZipCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserZipCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserZipCode").toString()));
      }
      if ((jsonObj.get("endUserContactName") != null && !jsonObj.get("endUserContactName").isJsonNull()) && !jsonObj.get("endUserContactName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserContactName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserContactName").toString()));
      }
      if ((jsonObj.get("endUserMarketSegment") != null && !jsonObj.get("endUserMarketSegment").isJsonNull()) && !jsonObj.get("endUserMarketSegment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserMarketSegment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserMarketSegment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser
  */
  public static QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser.class);
  }

 /**
  * Convert an instance of QuoteDetailsQuoteDetailResponseRetrieveQuoteResponseEndUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

