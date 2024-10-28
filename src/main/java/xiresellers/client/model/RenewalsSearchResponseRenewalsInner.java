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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.RenewalsSearchResponseRenewalsInnerLinksInner;

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
 * RenewalsSearchResponseRenewalsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-28T07:33:14.592758Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RenewalsSearchResponseRenewalsInner {
  public static final String SERIALIZED_NAME_RENEWAL_ID = "renewalId";
  @SerializedName(SERIALIZED_NAME_RENEWAL_ID)
  private Integer renewalId;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_END_USER = "endUser";
  @SerializedName(SERIALIZED_NAME_END_USER)
  private String endUser;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_RENEWAL_VALUE = "renewalValue";
  @SerializedName(SERIALIZED_NAME_RENEWAL_VALUE)
  private Double renewalValue;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<RenewalsSearchResponseRenewalsInnerLinksInner> links = new ArrayList<>();

  public RenewalsSearchResponseRenewalsInner() {
  }

  public RenewalsSearchResponseRenewalsInner renewalId(Integer renewalId) {
    this.renewalId = renewalId;
    return this;
  }

  /**
   * Unique renewal ID.
   * @return renewalId
   */
  @javax.annotation.Nullable
  public Integer getRenewalId() {
    return renewalId;
  }

  public void setRenewalId(Integer renewalId) {
    this.renewalId = renewalId;
  }


  public RenewalsSearchResponseRenewalsInner customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

  /**
   * The reseller&#39;s order number for reference in their system.
   * @return customerOrderNumber
   */
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public RenewalsSearchResponseRenewalsInner referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Renewal reference number. It could be notification id or quote number.
   * @return referenceNumber
   */
  @javax.annotation.Nullable
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public RenewalsSearchResponseRenewalsInner endUser(String endUser) {
    this.endUser = endUser;
    return this;
  }

  /**
   * The company name for the end user/customer.
   * @return endUser
   */
  @javax.annotation.Nullable
  public String getEndUser() {
    return endUser;
  }

  public void setEndUser(String endUser) {
    this.endUser = endUser;
  }


  public RenewalsSearchResponseRenewalsInner vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

  /**
   * The name of the vendor.
   * @return vendor
   */
  @javax.annotation.Nullable
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public RenewalsSearchResponseRenewalsInner expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Renewal expiration date.
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public RenewalsSearchResponseRenewalsInner renewalValue(Double renewalValue) {
    this.renewalValue = renewalValue;
    return this;
  }

  /**
   * The value of the renewal.
   * @return renewalValue
   */
  @javax.annotation.Nullable
  public Double getRenewalValue() {
    return renewalValue;
  }

  public void setRenewalValue(Double renewalValue) {
    this.renewalValue = renewalValue;
  }


  public RenewalsSearchResponseRenewalsInner status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the renewal.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public RenewalsSearchResponseRenewalsInner links(List<RenewalsSearchResponseRenewalsInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public RenewalsSearchResponseRenewalsInner addLinksItem(RenewalsSearchResponseRenewalsInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public List<RenewalsSearchResponseRenewalsInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(List<RenewalsSearchResponseRenewalsInnerLinksInner> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsSearchResponseRenewalsInner renewalsSearchResponseRenewalsInner = (RenewalsSearchResponseRenewalsInner) o;
    return Objects.equals(this.renewalId, renewalsSearchResponseRenewalsInner.renewalId) &&
        Objects.equals(this.customerOrderNumber, renewalsSearchResponseRenewalsInner.customerOrderNumber) &&
        Objects.equals(this.referenceNumber, renewalsSearchResponseRenewalsInner.referenceNumber) &&
        Objects.equals(this.endUser, renewalsSearchResponseRenewalsInner.endUser) &&
        Objects.equals(this.vendor, renewalsSearchResponseRenewalsInner.vendor) &&
        Objects.equals(this.expirationDate, renewalsSearchResponseRenewalsInner.expirationDate) &&
        Objects.equals(this.renewalValue, renewalsSearchResponseRenewalsInner.renewalValue) &&
        Objects.equals(this.status, renewalsSearchResponseRenewalsInner.status) &&
        Objects.equals(this.links, renewalsSearchResponseRenewalsInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renewalId, customerOrderNumber, referenceNumber, endUser, vendor, expirationDate, renewalValue, status, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsSearchResponseRenewalsInner {\n");
    sb.append("    renewalId: ").append(toIndentedString(renewalId)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    endUser: ").append(toIndentedString(endUser)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    renewalValue: ").append(toIndentedString(renewalValue)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("renewalId");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("referenceNumber");
    openapiFields.add("endUser");
    openapiFields.add("vendor");
    openapiFields.add("expirationDate");
    openapiFields.add("renewalValue");
    openapiFields.add("status");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenewalsSearchResponseRenewalsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsSearchResponseRenewalsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsSearchResponseRenewalsInner is not found in the empty JSON string", RenewalsSearchResponseRenewalsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsSearchResponseRenewalsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsSearchResponseRenewalsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("endUser") != null && !jsonObj.get("endUser").isJsonNull()) && !jsonObj.get("endUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUser").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) && !jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            RenewalsSearchResponseRenewalsInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsSearchResponseRenewalsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsSearchResponseRenewalsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsSearchResponseRenewalsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsSearchResponseRenewalsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsSearchResponseRenewalsInner>() {
           @Override
           public void write(JsonWriter out, RenewalsSearchResponseRenewalsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsSearchResponseRenewalsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenewalsSearchResponseRenewalsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenewalsSearchResponseRenewalsInner
   * @throws IOException if the JSON string is invalid with respect to RenewalsSearchResponseRenewalsInner
   */
  public static RenewalsSearchResponseRenewalsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsSearchResponseRenewalsInner.class);
  }

  /**
   * Convert an instance of RenewalsSearchResponseRenewalsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

