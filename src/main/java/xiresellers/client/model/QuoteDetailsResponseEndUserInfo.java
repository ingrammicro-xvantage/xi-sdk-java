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
 * QuoteDetailsResponseEndUserInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class QuoteDetailsResponseEndUserInfo {
  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private String contact;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_LINE3 = "addressLine3";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE3)
  private String addressLine3;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_MARKET_SEGMENT = "marketSegment";
  @SerializedName(SERIALIZED_NAME_MARKET_SEGMENT)
  private String marketSegment;

  public QuoteDetailsResponseEndUserInfo() {
  }

  public QuoteDetailsResponseEndUserInfo contact(String contact) {
    this.contact = contact;
    return this;
  }

   /**
   * End User Name
   * @return contact
  **/
  @javax.annotation.Nullable
  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }


  public QuoteDetailsResponseEndUserInfo companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Contact name  of end user associated with the quote.
   * @return companyName
  **/
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public QuoteDetailsResponseEndUserInfo addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Address line 1 for end user associated with the quote
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public QuoteDetailsResponseEndUserInfo addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Address line 2 for end user associated with the quote.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public QuoteDetailsResponseEndUserInfo addressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

   /**
   * Address line 3 for end user associated with the quote.
   * @return addressLine3
  **/
  @javax.annotation.Nullable
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public QuoteDetailsResponseEndUserInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City for end user associated with the quote
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public QuoteDetailsResponseEndUserInfo state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Two letter state abreviation for end user associated with the quote
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public QuoteDetailsResponseEndUserInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of end user the quote associated with the quote.
   * @return email
  **/
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public QuoteDetailsResponseEndUserInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number of end user associated with the quote.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public QuoteDetailsResponseEndUserInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Zip code of end user associated with the quote.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public QuoteDetailsResponseEndUserInfo marketSegment(String marketSegment) {
    this.marketSegment = marketSegment;
    return this;
  }

   /**
   * Market Segment of end user associated with the quote. End user market segment is included when end user is included in specific market segments like Educational, Government, Military, Medical - that may receive special pricing due to their segmentation.
   * @return marketSegment
  **/
  @javax.annotation.Nullable
  public String getMarketSegment() {
    return marketSegment;
  }

  public void setMarketSegment(String marketSegment) {
    this.marketSegment = marketSegment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsResponseEndUserInfo quoteDetailsResponseEndUserInfo = (QuoteDetailsResponseEndUserInfo) o;
    return Objects.equals(this.contact, quoteDetailsResponseEndUserInfo.contact) &&
        Objects.equals(this.companyName, quoteDetailsResponseEndUserInfo.companyName) &&
        Objects.equals(this.addressLine1, quoteDetailsResponseEndUserInfo.addressLine1) &&
        Objects.equals(this.addressLine2, quoteDetailsResponseEndUserInfo.addressLine2) &&
        Objects.equals(this.addressLine3, quoteDetailsResponseEndUserInfo.addressLine3) &&
        Objects.equals(this.city, quoteDetailsResponseEndUserInfo.city) &&
        Objects.equals(this.state, quoteDetailsResponseEndUserInfo.state) &&
        Objects.equals(this.email, quoteDetailsResponseEndUserInfo.email) &&
        Objects.equals(this.phoneNumber, quoteDetailsResponseEndUserInfo.phoneNumber) &&
        Objects.equals(this.postalCode, quoteDetailsResponseEndUserInfo.postalCode) &&
        Objects.equals(this.marketSegment, quoteDetailsResponseEndUserInfo.marketSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, companyName, addressLine1, addressLine2, addressLine3, city, state, email, phoneNumber, postalCode, marketSegment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsResponseEndUserInfo {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    marketSegment: ").append(toIndentedString(marketSegment)).append("\n");
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
    openapiFields.add("contact");
    openapiFields.add("companyName");
    openapiFields.add("addressLine1");
    openapiFields.add("addressLine2");
    openapiFields.add("addressLine3");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("email");
    openapiFields.add("phoneNumber");
    openapiFields.add("postalCode");
    openapiFields.add("marketSegment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsResponseEndUserInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsResponseEndUserInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsResponseEndUserInfo is not found in the empty JSON string", QuoteDetailsResponseEndUserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsResponseEndUserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsResponseEndUserInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contact") != null && !jsonObj.get("contact").isJsonNull()) && !jsonObj.get("contact").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact").toString()));
      }
      if ((jsonObj.get("companyName") != null && !jsonObj.get("companyName").isJsonNull()) && !jsonObj.get("companyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyName").toString()));
      }
      if ((jsonObj.get("addressLine1") != null && !jsonObj.get("addressLine1").isJsonNull()) && !jsonObj.get("addressLine1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine1").toString()));
      }
      if ((jsonObj.get("addressLine2") != null && !jsonObj.get("addressLine2").isJsonNull()) && !jsonObj.get("addressLine2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine2").toString()));
      }
      if ((jsonObj.get("addressLine3") != null && !jsonObj.get("addressLine3").isJsonNull()) && !jsonObj.get("addressLine3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressLine3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressLine3").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("marketSegment") != null && !jsonObj.get("marketSegment").isJsonNull()) && !jsonObj.get("marketSegment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketSegment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketSegment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsResponseEndUserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsResponseEndUserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsResponseEndUserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsResponseEndUserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsResponseEndUserInfo>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsResponseEndUserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsResponseEndUserInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsResponseEndUserInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsResponseEndUserInfo
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsResponseEndUserInfo
  */
  public static QuoteDetailsResponseEndUserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsResponseEndUserInfo.class);
  }

 /**
  * Convert an instance of QuoteDetailsResponseEndUserInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

