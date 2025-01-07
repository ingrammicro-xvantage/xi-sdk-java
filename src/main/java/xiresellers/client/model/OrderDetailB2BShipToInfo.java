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
 * The shipping information provided by the reseller for order delivery.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T06:06:56.528081668Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderDetailB2BShipToInfo {
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

  public static final String SERIALIZED_NAME_ADDRESS_LINE3 = "addressLine3";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE3)
  @javax.annotation.Nullable
  private String addressLine3;

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
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public OrderDetailB2BShipToInfo() {
  }

  public OrderDetailB2BShipToInfo contact(@javax.annotation.Nullable String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * The company contact provided by the reseller.
   * @return contact
   */
  @javax.annotation.Nullable
  public String getContact() {
    return contact;
  }

  public void setContact(@javax.annotation.Nullable String contact) {
    this.contact = contact;
  }


  public OrderDetailB2BShipToInfo companyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * The name of the company the order will be shipped to.
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
  }


  public OrderDetailB2BShipToInfo addressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * The address line 1 the order will be shipped to.
   * @return addressLine1
   */
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public OrderDetailB2BShipToInfo addressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * The address line 2 the order will be shipped to.
   * @return addressLine2
   */
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public OrderDetailB2BShipToInfo addressLine3(@javax.annotation.Nullable String addressLine3) {
    this.addressLine3 = addressLine3;
    return this;
  }

  /**
   * The address line 3 the order will be shipped to.
   * @return addressLine3
   */
  @javax.annotation.Nullable
  public String getAddressLine3() {
    return addressLine3;
  }

  public void setAddressLine3(@javax.annotation.Nullable String addressLine3) {
    this.addressLine3 = addressLine3;
  }


  public OrderDetailB2BShipToInfo city(@javax.annotation.Nullable String city) {
    this.city = city;
    return this;
  }

  /**
   * The city the order will be shipped to.
   * @return city
   */
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }

  public void setCity(@javax.annotation.Nullable String city) {
    this.city = city;
  }


  public OrderDetailB2BShipToInfo state(@javax.annotation.Nullable String state) {
    this.state = state;
    return this;
  }

  /**
   * The state the order will be shipped to.
   * @return state
   */
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }

  public void setState(@javax.annotation.Nullable String state) {
    this.state = state;
  }


  public OrderDetailB2BShipToInfo postalCode(@javax.annotation.Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * The zip or postal code the order will be shipped to.
   * @return postalCode
   */
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(@javax.annotation.Nullable String postalCode) {
    this.postalCode = postalCode;
  }


  public OrderDetailB2BShipToInfo countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The two-character ISO country code the order will be shipped to.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }


  public OrderDetailB2BShipToInfo phoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * The company contact phone number.
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@javax.annotation.Nullable String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public OrderDetailB2BShipToInfo email(@javax.annotation.Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * The company contact email address.
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
    OrderDetailB2BShipToInfo orderDetailB2BShipToInfo = (OrderDetailB2BShipToInfo) o;
    return Objects.equals(this.contact, orderDetailB2BShipToInfo.contact) &&
        Objects.equals(this.companyName, orderDetailB2BShipToInfo.companyName) &&
        Objects.equals(this.addressLine1, orderDetailB2BShipToInfo.addressLine1) &&
        Objects.equals(this.addressLine2, orderDetailB2BShipToInfo.addressLine2) &&
        Objects.equals(this.addressLine3, orderDetailB2BShipToInfo.addressLine3) &&
        Objects.equals(this.city, orderDetailB2BShipToInfo.city) &&
        Objects.equals(this.state, orderDetailB2BShipToInfo.state) &&
        Objects.equals(this.postalCode, orderDetailB2BShipToInfo.postalCode) &&
        Objects.equals(this.countryCode, orderDetailB2BShipToInfo.countryCode) &&
        Objects.equals(this.phoneNumber, orderDetailB2BShipToInfo.phoneNumber) &&
        Objects.equals(this.email, orderDetailB2BShipToInfo.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, companyName, addressLine1, addressLine2, addressLine3, city, state, postalCode, countryCode, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BShipToInfo {\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressLine3: ").append(toIndentedString(addressLine3)).append("\n");
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
    openapiFields.add("contact");
    openapiFields.add("companyName");
    openapiFields.add("addressLine1");
    openapiFields.add("addressLine2");
    openapiFields.add("addressLine3");
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
   * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BShipToInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BShipToInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BShipToInfo is not found in the empty JSON string", OrderDetailB2BShipToInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BShipToInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BShipToInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("postalCode") != null && !jsonObj.get("postalCode").isJsonNull()) && !jsonObj.get("postalCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postalCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postalCode").toString()));
      }
      if ((jsonObj.get("countryCode") != null && !jsonObj.get("countryCode").isJsonNull()) && !jsonObj.get("countryCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `countryCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("countryCode").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BShipToInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BShipToInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BShipToInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BShipToInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BShipToInfo>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BShipToInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BShipToInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderDetailB2BShipToInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderDetailB2BShipToInfo
   * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BShipToInfo
   */
  public static OrderDetailB2BShipToInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BShipToInfo.class);
  }

  /**
   * Convert an instance of OrderDetailB2BShipToInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

