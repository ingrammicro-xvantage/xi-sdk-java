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
 * The contact information for the end user/customer provided by the reseller. Used to determine pricing and discounts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T05:01:51.614791330Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderCreateV7RequestEndUserInfo {
  public static final String SERIALIZED_NAME_END_USER_ID = "endUserId";
  @SerializedName(SERIALIZED_NAME_END_USER_ID)
  @javax.annotation.Nullable
  private String endUserId;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  @javax.annotation.Nullable
  private String contact;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "companyName";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  @javax.annotation.Nullable
  private String companyName;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "addressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  @javax.annotation.Nullable
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "addressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  @javax.annotation.Nullable
  private String addressLine2;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  @javax.annotation.Nullable
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  @javax.annotation.Nullable
  private String state;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  @javax.annotation.Nullable
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  @javax.annotation.Nullable
  private String countryCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nullable
  private Integer phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public OrderCreateV7RequestEndUserInfo() {
  }

  public OrderCreateV7RequestEndUserInfo endUserId(@javax.annotation.Nullable String endUserId) {
    this.endUserId = endUserId;
    return this;
  }

  /**
   * ID for the end user/customer in Ingram Micro&#39;s system.
   * @return endUserId
   */
  @javax.annotation.Nullable
  public String getEndUserId() {
    return endUserId;
  }

  public void setEndUserId(@javax.annotation.Nullable String endUserId) {
    this.endUserId = endUserId;
  }


  public OrderCreateV7RequestEndUserInfo contact(@javax.annotation.Nullable String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * The contact name for the end user/customer.
   * @return contact
   */
  @javax.annotation.Nullable
  public String getContact() {
    return contact;
  }

  public void setContact(@javax.annotation.Nullable String contact) {
    this.contact = contact;
  }


  public OrderCreateV7RequestEndUserInfo companyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * The company name for the end user/customer. Required for Impulse countries.
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
  }


  public OrderCreateV7RequestEndUserInfo addressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * The end user/customer&#39;s street address and building or house number. Required for Impulse countries.
   * @return addressLine1
   */
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public OrderCreateV7RequestEndUserInfo addressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * The end user/customer&#39;s apartment number.
   * @return addressLine2
   */
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public OrderCreateV7RequestEndUserInfo city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * The end user/customer&#39;s city. Required for Impulse countries.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public OrderCreateV7RequestEndUserInfo state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The end user/customer&#39;s state. Required for Impulse countries but optional for EMEA countries.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public OrderCreateV7RequestEndUserInfo postalCode(@javax.annotation.Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The end user/customer&#39;s zip or postal code. Required for Impulse countries.
   * @return postalCode
   */
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(@javax.annotation.Nullable String postalCode) {
    this.postalCode = postalCode;
  }


  public OrderCreateV7RequestEndUserInfo countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The end user/customer&#39;s two-character ISO country code.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }


  public OrderCreateV7RequestEndUserInfo phoneNumber(@javax.annotation.Nullable Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The end user/customer&#39;s phone number.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public Integer getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable Integer phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public OrderCreateV7RequestEndUserInfo email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The end user/customer&#39;s email.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(@javax.annotation.Nullable String email) {
    this.email = email;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7RequestEndUserInfo orderCreateV7RequestEndUserInfo = (OrderCreateV7RequestEndUserInfo) o;
    return Objects.equals(this.endUserId, orderCreateV7RequestEndUserInfo.endUserId) &&
        Objects.equals(this.contact, orderCreateV7RequestEndUserInfo.contact) &&
        Objects.equals(this.companyName, orderCreateV7RequestEndUserInfo.companyName) &&
        Objects.equals(this.addressLine1, orderCreateV7RequestEndUserInfo.addressLine1) &&
        Objects.equals(this.addressLine2, orderCreateV7RequestEndUserInfo.addressLine2) &&
        Objects.equals(this.city, orderCreateV7RequestEndUserInfo.city) &&
        Objects.equals(this.state, orderCreateV7RequestEndUserInfo.state) &&
        Objects.equals(this.postalCode, orderCreateV7RequestEndUserInfo.postalCode) &&
        Objects.equals(this.countryCode, orderCreateV7RequestEndUserInfo.countryCode) &&
        Objects.equals(this.phoneNumber, orderCreateV7RequestEndUserInfo.phoneNumber) &&
        Objects.equals(this.email, orderCreateV7RequestEndUserInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endUserId, contact, companyName, addressLine1, addressLine2, city, state, postalCode, countryCode, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7RequestEndUserInfo {\n");
    sb.append("    endUserId: ").append(toIndentedString(endUserId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
    openapiFields.add("endUserId");
    openapiFields.add("contact");
    openapiFields.add("companyName");
    openapiFields.add("addressLine1");
    openapiFields.add("addressLine2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("postalCode");
    openapiFields.add("countryCode");
    openapiFields.add("phoneNumber");
    openapiFields.add("email");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7RequestEndUserInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7RequestEndUserInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7RequestEndUserInfo is not found in the empty JSON string", OrderCreateV7RequestEndUserInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7RequestEndUserInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7RequestEndUserInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("endUserId") != null && !jsonObj.get("endUserId").isJsonNull()) && !jsonObj.get("endUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUserId").toString()));
      }
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
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7RequestEndUserInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7RequestEndUserInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7RequestEndUserInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7RequestEndUserInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7RequestEndUserInfo>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7RequestEndUserInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7RequestEndUserInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7RequestEndUserInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7RequestEndUserInfo
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7RequestEndUserInfo
   */
  public static OrderCreateV7RequestEndUserInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7RequestEndUserInfo.class);
  }

  /**
   * Convert an instance of OrderCreateV7RequestEndUserInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

