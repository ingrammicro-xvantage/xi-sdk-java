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
import xiresellers.client.model.RenewalsDetailsResponseAdditionalAttributesInner;
import xiresellers.client.model.RenewalsDetailsResponseEndUserInfo;
import xiresellers.client.model.RenewalsDetailsResponseProductsInner;
import xiresellers.client.model.RenewalsDetailsResponseReferenceNumber;

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
 * RenewalsDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T08:54:01.152945Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RenewalsDetailsResponse {
  public static final String SERIALIZED_NAME_RENEWAL_ID = "renewalId";
  @SerializedName(SERIALIZED_NAME_RENEWAL_ID)
  private String renewalId;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_NUMBER = "ingramOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_NUMBER)
  private String ingramOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_DATE = "ingramOrderDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_DATE)
  private String ingramOrderDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_INGRAM_PURCHASE_ORDER_NUMBER = "ingramPurchaseOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PURCHASE_ORDER_NUMBER)
  private String ingramPurchaseOrderNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER = "endCustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER)
  private String endCustomerOrderNumber;

  public static final String SERIALIZED_NAME_RENEWAL_VALUE = "renewalValue";
  @SerializedName(SERIALIZED_NAME_RENEWAL_VALUE)
  private String renewalValue;

  public static final String SERIALIZED_NAME_END_USER = "endUser";
  @SerializedName(SERIALIZED_NAME_END_USER)
  private String endUser;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private RenewalsDetailsResponseEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private RenewalsDetailsResponseReferenceNumber referenceNumber;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<RenewalsDetailsResponseProductsInner> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<RenewalsDetailsResponseAdditionalAttributesInner> additionalAttributes = new ArrayList<>();

  public RenewalsDetailsResponse() {
  }

  public RenewalsDetailsResponse renewalId(String renewalId) {
    this.renewalId = renewalId;
    return this;
  }

  /**
   * Unique Ingram renewal ID.
   * @return renewalId
   */
  @javax.annotation.Nullable
  public String getRenewalId() {
    return renewalId;
  }

  public void setRenewalId(String renewalId) {
    this.renewalId = renewalId;
  }


  public RenewalsDetailsResponse ingramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
    return this;
  }

  /**
   * The IngramMicro sales order number.
   * @return ingramOrderNumber
   */
  @javax.annotation.Nullable
  public String getIngramOrderNumber() {
    return ingramOrderNumber;
  }

  public void setIngramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
  }


  public RenewalsDetailsResponse ingramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
    return this;
  }

  /**
   * The IngramMicro sales order date.
   * @return ingramOrderDate
   */
  @javax.annotation.Nullable
  public String getIngramOrderDate() {
    return ingramOrderDate;
  }

  public void setIngramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
  }


  public RenewalsDetailsResponse expirationDate(String expirationDate) {
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


  public RenewalsDetailsResponse ingramPurchaseOrderNumber(String ingramPurchaseOrderNumber) {
    this.ingramPurchaseOrderNumber = ingramPurchaseOrderNumber;
    return this;
  }

  /**
   * Ingram purchase order number.
   * @return ingramPurchaseOrderNumber
   */
  @javax.annotation.Nullable
  public String getIngramPurchaseOrderNumber() {
    return ingramPurchaseOrderNumber;
  }

  public void setIngramPurchaseOrderNumber(String ingramPurchaseOrderNumber) {
    this.ingramPurchaseOrderNumber = ingramPurchaseOrderNumber;
  }


  public RenewalsDetailsResponse customerOrderNumber(String customerOrderNumber) {
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


  public RenewalsDetailsResponse endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

  /**
   * The end customer&#39;s order number for reference in their system.
   * @return endCustomerOrderNumber
   */
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public RenewalsDetailsResponse renewalValue(String renewalValue) {
    this.renewalValue = renewalValue;
    return this;
  }

  /**
   * The value of the renewal.
   * @return renewalValue
   */
  @javax.annotation.Nullable
  public String getRenewalValue() {
    return renewalValue;
  }

  public void setRenewalValue(String renewalValue) {
    this.renewalValue = renewalValue;
  }


  public RenewalsDetailsResponse endUser(String endUser) {
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


  public RenewalsDetailsResponse vendor(String vendor) {
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


  public RenewalsDetailsResponse status(String status) {
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


  public RenewalsDetailsResponse endUserInfo(RenewalsDetailsResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

  /**
   * Get endUserInfo
   * @return endUserInfo
   */
  @javax.annotation.Nullable
  public RenewalsDetailsResponseEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(RenewalsDetailsResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public RenewalsDetailsResponse referenceNumber(RenewalsDetailsResponseReferenceNumber referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * Get referenceNumber
   * @return referenceNumber
   */
  @javax.annotation.Nullable
  public RenewalsDetailsResponseReferenceNumber getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(RenewalsDetailsResponseReferenceNumber referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public RenewalsDetailsResponse products(List<RenewalsDetailsResponseProductsInner> products) {
    this.products = products;
    return this;
  }

  public RenewalsDetailsResponse addProductsItem(RenewalsDetailsResponseProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
   */
  @javax.annotation.Nullable
  public List<RenewalsDetailsResponseProductsInner> getProducts() {
    return products;
  }

  public void setProducts(List<RenewalsDetailsResponseProductsInner> products) {
    this.products = products;
  }


  public RenewalsDetailsResponse additionalAttributes(List<RenewalsDetailsResponseAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public RenewalsDetailsResponse addAdditionalAttributesItem(RenewalsDetailsResponseAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

  /**
   * Get additionalAttributes
   * @return additionalAttributes
   */
  @javax.annotation.Nullable
  public List<RenewalsDetailsResponseAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<RenewalsDetailsResponseAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsDetailsResponse renewalsDetailsResponse = (RenewalsDetailsResponse) o;
    return Objects.equals(this.renewalId, renewalsDetailsResponse.renewalId) &&
        Objects.equals(this.ingramOrderNumber, renewalsDetailsResponse.ingramOrderNumber) &&
        Objects.equals(this.ingramOrderDate, renewalsDetailsResponse.ingramOrderDate) &&
        Objects.equals(this.expirationDate, renewalsDetailsResponse.expirationDate) &&
        Objects.equals(this.ingramPurchaseOrderNumber, renewalsDetailsResponse.ingramPurchaseOrderNumber) &&
        Objects.equals(this.customerOrderNumber, renewalsDetailsResponse.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, renewalsDetailsResponse.endCustomerOrderNumber) &&
        Objects.equals(this.renewalValue, renewalsDetailsResponse.renewalValue) &&
        Objects.equals(this.endUser, renewalsDetailsResponse.endUser) &&
        Objects.equals(this.vendor, renewalsDetailsResponse.vendor) &&
        Objects.equals(this.status, renewalsDetailsResponse.status) &&
        Objects.equals(this.endUserInfo, renewalsDetailsResponse.endUserInfo) &&
        Objects.equals(this.referenceNumber, renewalsDetailsResponse.referenceNumber) &&
        Objects.equals(this.products, renewalsDetailsResponse.products) &&
        Objects.equals(this.additionalAttributes, renewalsDetailsResponse.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renewalId, ingramOrderNumber, ingramOrderDate, expirationDate, ingramPurchaseOrderNumber, customerOrderNumber, endCustomerOrderNumber, renewalValue, endUser, vendor, status, endUserInfo, referenceNumber, products, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsDetailsResponse {\n");
    sb.append("    renewalId: ").append(toIndentedString(renewalId)).append("\n");
    sb.append("    ingramOrderNumber: ").append(toIndentedString(ingramOrderNumber)).append("\n");
    sb.append("    ingramOrderDate: ").append(toIndentedString(ingramOrderDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    ingramPurchaseOrderNumber: ").append(toIndentedString(ingramPurchaseOrderNumber)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    renewalValue: ").append(toIndentedString(renewalValue)).append("\n");
    sb.append("    endUser: ").append(toIndentedString(endUser)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
    openapiFields.add("ingramOrderNumber");
    openapiFields.add("ingramOrderDate");
    openapiFields.add("expirationDate");
    openapiFields.add("ingramPurchaseOrderNumber");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endCustomerOrderNumber");
    openapiFields.add("renewalValue");
    openapiFields.add("endUser");
    openapiFields.add("vendor");
    openapiFields.add("status");
    openapiFields.add("endUserInfo");
    openapiFields.add("referenceNumber");
    openapiFields.add("products");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenewalsDetailsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsDetailsResponse is not found in the empty JSON string", RenewalsDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("renewalId") != null && !jsonObj.get("renewalId").isJsonNull()) && !jsonObj.get("renewalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renewalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renewalId").toString()));
      }
      if ((jsonObj.get("ingramOrderNumber") != null && !jsonObj.get("ingramOrderNumber").isJsonNull()) && !jsonObj.get("ingramOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramOrderDate") != null && !jsonObj.get("ingramOrderDate").isJsonNull()) && !jsonObj.get("ingramOrderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderDate").toString()));
      }
      if ((jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) && !jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      if ((jsonObj.get("ingramPurchaseOrderNumber") != null && !jsonObj.get("ingramPurchaseOrderNumber").isJsonNull()) && !jsonObj.get("ingramPurchaseOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPurchaseOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPurchaseOrderNumber").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endCustomerOrderNumber") != null && !jsonObj.get("endCustomerOrderNumber").isJsonNull()) && !jsonObj.get("endCustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("renewalValue") != null && !jsonObj.get("renewalValue").isJsonNull()) && !jsonObj.get("renewalValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renewalValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renewalValue").toString()));
      }
      if ((jsonObj.get("endUser") != null && !jsonObj.get("endUser").isJsonNull()) && !jsonObj.get("endUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUser").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        RenewalsDetailsResponseEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      // validate the optional field `referenceNumber`
      if (jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) {
        RenewalsDetailsResponseReferenceNumber.validateJsonElement(jsonObj.get("referenceNumber"));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            RenewalsDetailsResponseProductsInner.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            RenewalsDetailsResponseAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsDetailsResponse>() {
           @Override
           public void write(JsonWriter out, RenewalsDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenewalsDetailsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenewalsDetailsResponse
   * @throws IOException if the JSON string is invalid with respect to RenewalsDetailsResponse
   */
  public static RenewalsDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsDetailsResponse.class);
  }

  /**
   * Convert an instance of RenewalsDetailsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

