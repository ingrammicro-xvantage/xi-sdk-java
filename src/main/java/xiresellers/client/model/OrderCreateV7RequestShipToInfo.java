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
 * The shipping information provided by the reseller.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-05T05:54:00.257688Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderCreateV7RequestShipToInfo {
  public static final String SERIALIZED_NAME_ADDRESS_ID = "addressId";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ID)
  @javax.annotation.Nullable
  private String addressId;

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

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  @javax.annotation.Nullable
  private String email;

  public static final String SERIALIZED_NAME_SHIPPING_NOTES = "shippingNotes";
  @SerializedName(SERIALIZED_NAME_SHIPPING_NOTES)
  @javax.annotation.Nullable
  private String shippingNotes;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  @javax.annotation.Nullable
  private String phoneNumber;

  public OrderCreateV7RequestShipToInfo() {
  }

  public OrderCreateV7RequestShipToInfo addressId(@javax.annotation.Nullable String addressId) {
    this.addressId = addressId;
    return this;
  }

  /**
   * The ID references the resellers address in Ingram Micro&#39;s system for shipping. Provided to resellers during the onboarding process.
   * @return addressId
   */
  @javax.annotation.Nullable
  public String getAddressId() {
    return addressId;
  }

  public void setAddressId(@javax.annotation.Nullable String addressId) {
    this.addressId = addressId;
  }


  public OrderCreateV7RequestShipToInfo contact(@javax.annotation.Nullable String contact) {
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


  public OrderCreateV7RequestShipToInfo companyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * The reseller&#39;s company name or the End-User&#39;s Name
   * @return companyName
   */
  @javax.annotation.Nullable
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(@javax.annotation.Nullable String companyName) {
    this.companyName = companyName;
  }


  public OrderCreateV7RequestShipToInfo addressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }

  /**
   * The street address and building or house number the order will be shipped to.
   * @return addressLine1
   */
  @javax.annotation.Nullable
  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(@javax.annotation.Nullable String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public OrderCreateV7RequestShipToInfo addressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }

  /**
   * The apartment number the order will be shipped to.
   * @return addressLine2
   */
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(@javax.annotation.Nullable String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public OrderCreateV7RequestShipToInfo city(@javax.annotation.Nullable String city) {
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


  public OrderCreateV7RequestShipToInfo state(@javax.annotation.Nullable String state) {
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


  public OrderCreateV7RequestShipToInfo postalCode(@javax.annotation.Nullable String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * End User Name
   * @return postalCode
   */
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(@javax.annotation.Nullable String postalCode) {
    this.postalCode = postalCode;
  }


  public OrderCreateV7RequestShipToInfo countryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * The zip or postal code the order will be shipped to.
   * @return countryCode
   */
  @javax.annotation.Nullable
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(@javax.annotation.Nullable String countryCode) {
    this.countryCode = countryCode;
  }


  public OrderCreateV7RequestShipToInfo email(@javax.annotation.Nullable String email) {
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


  public OrderCreateV7RequestShipToInfo shippingNotes(@javax.annotation.Nullable String shippingNotes) {
    this.shippingNotes = shippingNotes;
    return this;
  }

  /**
   * 
   * @return shippingNotes
   */
  @javax.annotation.Nullable
  public String getShippingNotes() {
    return shippingNotes;
  }

  public void setShippingNotes(@javax.annotation.Nullable String shippingNotes) {
    this.shippingNotes = shippingNotes;
  }


  public OrderCreateV7RequestShipToInfo phoneNumber(@javax.annotation.Nullable String phoneNumber) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7RequestShipToInfo orderCreateV7RequestShipToInfo = (OrderCreateV7RequestShipToInfo) o;
    return Objects.equals(this.addressId, orderCreateV7RequestShipToInfo.addressId) &&
        Objects.equals(this.contact, orderCreateV7RequestShipToInfo.contact) &&
        Objects.equals(this.companyName, orderCreateV7RequestShipToInfo.companyName) &&
        Objects.equals(this.addressLine1, orderCreateV7RequestShipToInfo.addressLine1) &&
        Objects.equals(this.addressLine2, orderCreateV7RequestShipToInfo.addressLine2) &&
        Objects.equals(this.city, orderCreateV7RequestShipToInfo.city) &&
        Objects.equals(this.state, orderCreateV7RequestShipToInfo.state) &&
        Objects.equals(this.postalCode, orderCreateV7RequestShipToInfo.postalCode) &&
        Objects.equals(this.countryCode, orderCreateV7RequestShipToInfo.countryCode) &&
        Objects.equals(this.email, orderCreateV7RequestShipToInfo.email) &&
        Objects.equals(this.shippingNotes, orderCreateV7RequestShipToInfo.shippingNotes) &&
        Objects.equals(this.phoneNumber, orderCreateV7RequestShipToInfo.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId, contact, companyName, addressLine1, addressLine2, city, state, postalCode, countryCode, email, shippingNotes, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7RequestShipToInfo {\n");
    sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    shippingNotes: ").append(toIndentedString(shippingNotes)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    openapiFields.add("addressId");
    openapiFields.add("contact");
    openapiFields.add("companyName");
    openapiFields.add("addressLine1");
    openapiFields.add("addressLine2");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("postalCode");
    openapiFields.add("countryCode");
    openapiFields.add("email");
    openapiFields.add("shippingNotes");
    openapiFields.add("phoneNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7RequestShipToInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7RequestShipToInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7RequestShipToInfo is not found in the empty JSON string", OrderCreateV7RequestShipToInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7RequestShipToInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7RequestShipToInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("addressId") != null && !jsonObj.get("addressId").isJsonNull()) && !jsonObj.get("addressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addressId").toString()));
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
      if ((jsonObj.get("shippingNotes") != null && !jsonObj.get("shippingNotes").isJsonNull()) && !jsonObj.get("shippingNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shippingNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shippingNotes").toString()));
      }
      if ((jsonObj.get("phoneNumber") != null && !jsonObj.get("phoneNumber").isJsonNull()) && !jsonObj.get("phoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7RequestShipToInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7RequestShipToInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7RequestShipToInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7RequestShipToInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7RequestShipToInfo>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7RequestShipToInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7RequestShipToInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7RequestShipToInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7RequestShipToInfo
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7RequestShipToInfo
   */
  public static OrderCreateV7RequestShipToInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7RequestShipToInfo.class);
  }

  /**
   * Convert an instance of OrderCreateV7RequestShipToInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

