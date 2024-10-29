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
import xiresellers.client.model.ProductDetailResponseAdditionalInformation;
import xiresellers.client.model.ProductDetailResponseCiscoFieldsInner;
import xiresellers.client.model.ProductDetailResponseIndicatorsInner;
import xiresellers.client.model.ProductDetailResponseSubscriptionDetailsInner;

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
 * ProductDetailResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T04:33:02.050337Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductDetailResponse {
  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_PRODUCT_AUTHORIZED = "productAuthorized";
  @SerializedName(SERIALIZED_NAME_PRODUCT_AUTHORIZED)
  private Boolean productAuthorized;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORY = "productCategory";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORY)
  private String productCategory;

  public static final String SERIALIZED_NAME_PRODUCT_SUBCATEGORY = "productSubcategory";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SUBCATEGORY)
  private String productSubcategory;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_VENDOR_NUMBER = "vendorNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_NUMBER)
  private String vendorNumber;

  public static final String SERIALIZED_NAME_PRODUCT_STATUS_CODE = "productStatusCode";
  @SerializedName(SERIALIZED_NAME_PRODUCT_STATUS_CODE)
  private String productStatusCode;

  public static final String SERIALIZED_NAME_PRODUCT_CLASS = "productClass";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CLASS)
  private String productClass;

  public static final String SERIALIZED_NAME_CUSTOMER_PART_NUMBER = "customerPartNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PART_NUMBER)
  private String customerPartNumber;

  public static final String SERIALIZED_NAME_INDICATORS = "indicators";
  @SerializedName(SERIALIZED_NAME_INDICATORS)
  private List<ProductDetailResponseIndicatorsInner> indicators = new ArrayList<>();

  public static final String SERIALIZED_NAME_CISCO_FIELDS = "ciscoFields";
  @SerializedName(SERIALIZED_NAME_CISCO_FIELDS)
  private List<ProductDetailResponseCiscoFieldsInner> ciscoFields = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARRANTY_INFORMATION = "warrantyInformation";
  @SerializedName(SERIALIZED_NAME_WARRANTY_INFORMATION)
  private List<Object> warrantyInformation = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_INFORMATION = "additionalInformation";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INFORMATION)
  private ProductDetailResponseAdditionalInformation additionalInformation;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_DETAILS = "subscriptionDetails";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_DETAILS)
  private List<ProductDetailResponseSubscriptionDetailsInner> subscriptionDetails = new ArrayList<>();

  public ProductDetailResponse() {
  }

  public ProductDetailResponse ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * Ingram Micro unique part number for the product.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public ProductDetailResponse vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * Vendor’s part number for the product.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public ProductDetailResponse productAuthorized(Boolean productAuthorized) {
    this.productAuthorized = productAuthorized;
    return this;
  }

  /**
   * Boolean that indicates whether a product is authorized.
   * @return productAuthorized
   */
  @javax.annotation.Nullable
  public Boolean getProductAuthorized() {
    return productAuthorized;
  }

  public void setProductAuthorized(Boolean productAuthorized) {
    this.productAuthorized = productAuthorized;
  }


  public ProductDetailResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description given for the product.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public ProductDetailResponse upc(String upc) {
    this.upc = upc;
    return this;
  }

  /**
   * The UPC code for the product. Consists of 12 numeric digits that are uniquely assigned to each trade item.
   * @return upc
   */
  @javax.annotation.Nullable
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }


  public ProductDetailResponse productCategory(String productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  /**
   * The category of the product.
   * @return productCategory
   */
  @javax.annotation.Nullable
  public String getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(String productCategory) {
    this.productCategory = productCategory;
  }


  public ProductDetailResponse productSubcategory(String productSubcategory) {
    this.productSubcategory = productSubcategory;
    return this;
  }

  /**
   * The sub-category of the product.
   * @return productSubcategory
   */
  @javax.annotation.Nullable
  public String getProductSubcategory() {
    return productSubcategory;
  }

  public void setProductSubcategory(String productSubcategory) {
    this.productSubcategory = productSubcategory;
  }


  public ProductDetailResponse vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  /**
   * Vendor name for the order.
   * @return vendorName
   */
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public ProductDetailResponse vendorNumber(String vendorNumber) {
    this.vendorNumber = vendorNumber;
    return this;
  }

  /**
   * Vendor number that identifies the product.
   * @return vendorNumber
   */
  @javax.annotation.Nullable
  public String getVendorNumber() {
    return vendorNumber;
  }

  public void setVendorNumber(String vendorNumber) {
    this.vendorNumber = vendorNumber;
  }


  public ProductDetailResponse productStatusCode(String productStatusCode) {
    this.productStatusCode = productStatusCode;
    return this;
  }

  /**
   * Status code of the product.
   * @return productStatusCode
   */
  @javax.annotation.Nullable
  public String getProductStatusCode() {
    return productStatusCode;
  }

  public void setProductStatusCode(String productStatusCode) {
    this.productStatusCode = productStatusCode;
  }


  public ProductDetailResponse productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Indicates whether the product is directly shipped from the vendor’s warehouse or if the product ships from Ingram Micro’s warehouse. Class Codes are Ingram classifications on how skus are stocked A &#x3D; Product that is stocked usually in all IM warehouses and replenished on a regular basis. B &#x3D; Product that is stocked in limited IM warehouses and replenished on a regular basis C &#x3D; Product that is stocked in fewer IM warehouses and replenished on a regular basis. D &#x3D; Product that Ingram Micro has elected to discontinue. E &#x3D; Product that will be phased out later, according to the vendor. You may not want to replenish this product, but instead sell down what is in stock. F &#x3D; Product that we carry for a specific customer or supplier under a contractual agreement. N &#x3D; New Sku. Classification before first receipt O &#x3D; Discontinued product to be liquidated S&#x3D; Order for Specialized Demand (Order to backorder) X&#x3D; direct ship from Vendor V &#x3D; product that vendor has elected to discontinue.
   * @return productClass
   */
  @javax.annotation.Nullable
  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }


  public ProductDetailResponse customerPartNumber(String customerPartNumber) {
    this.customerPartNumber = customerPartNumber;
    return this;
  }

  /**
   * Reseller / end-user’s part number for the product.
   * @return customerPartNumber
   */
  @javax.annotation.Nullable
  public String getCustomerPartNumber() {
    return customerPartNumber;
  }

  public void setCustomerPartNumber(String customerPartNumber) {
    this.customerPartNumber = customerPartNumber;
  }


  public ProductDetailResponse indicators(List<ProductDetailResponseIndicatorsInner> indicators) {
    this.indicators = indicators;
    return this;
  }

  public ProductDetailResponse addIndicatorsItem(ProductDetailResponseIndicatorsInner indicatorsItem) {
    if (this.indicators == null) {
      this.indicators = new ArrayList<>();
    }
    this.indicators.add(indicatorsItem);
    return this;
  }

  /**
   * Indicators of the Product
   * @return indicators
   */
  @javax.annotation.Nullable
  public List<ProductDetailResponseIndicatorsInner> getIndicators() {
    return indicators;
  }

  public void setIndicators(List<ProductDetailResponseIndicatorsInner> indicators) {
    this.indicators = indicators;
  }


  public ProductDetailResponse ciscoFields(List<ProductDetailResponseCiscoFieldsInner> ciscoFields) {
    this.ciscoFields = ciscoFields;
    return this;
  }

  public ProductDetailResponse addCiscoFieldsItem(ProductDetailResponseCiscoFieldsInner ciscoFieldsItem) {
    if (this.ciscoFields == null) {
      this.ciscoFields = new ArrayList<>();
    }
    this.ciscoFields.add(ciscoFieldsItem);
    return this;
  }

  /**
   * Cisco product related information.
   * @return ciscoFields
   */
  @javax.annotation.Nullable
  public List<ProductDetailResponseCiscoFieldsInner> getCiscoFields() {
    return ciscoFields;
  }

  public void setCiscoFields(List<ProductDetailResponseCiscoFieldsInner> ciscoFields) {
    this.ciscoFields = ciscoFields;
  }


  public ProductDetailResponse warrantyInformation(List<Object> warrantyInformation) {
    this.warrantyInformation = warrantyInformation;
    return this;
  }

  public ProductDetailResponse addWarrantyInformationItem(Object warrantyInformationItem) {
    if (this.warrantyInformation == null) {
      this.warrantyInformation = new ArrayList<>();
    }
    this.warrantyInformation.add(warrantyInformationItem);
    return this;
  }

  /**
   * Warranty information related to the product.
   * @return warrantyInformation
   */
  @javax.annotation.Nullable
  public List<Object> getWarrantyInformation() {
    return warrantyInformation;
  }

  public void setWarrantyInformation(List<Object> warrantyInformation) {
    this.warrantyInformation = warrantyInformation;
  }


  public ProductDetailResponse additionalInformation(ProductDetailResponseAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  /**
   * Get additionalInformation
   * @return additionalInformation
   */
  @javax.annotation.Nullable
  public ProductDetailResponseAdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(ProductDetailResponseAdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  public ProductDetailResponse subscriptionDetails(List<ProductDetailResponseSubscriptionDetailsInner> subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
    return this;
  }

  public ProductDetailResponse addSubscriptionDetailsItem(ProductDetailResponseSubscriptionDetailsInner subscriptionDetailsItem) {
    if (this.subscriptionDetails == null) {
      this.subscriptionDetails = new ArrayList<>();
    }
    this.subscriptionDetails.add(subscriptionDetailsItem);
    return this;
  }

  /**
   * Subscription product Details
   * @return subscriptionDetails
   */
  @javax.annotation.Nullable
  public List<ProductDetailResponseSubscriptionDetailsInner> getSubscriptionDetails() {
    return subscriptionDetails;
  }

  public void setSubscriptionDetails(List<ProductDetailResponseSubscriptionDetailsInner> subscriptionDetails) {
    this.subscriptionDetails = subscriptionDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponse productDetailResponse = (ProductDetailResponse) o;
    return Objects.equals(this.ingramPartNumber, productDetailResponse.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, productDetailResponse.vendorPartNumber) &&
        Objects.equals(this.productAuthorized, productDetailResponse.productAuthorized) &&
        Objects.equals(this.description, productDetailResponse.description) &&
        Objects.equals(this.upc, productDetailResponse.upc) &&
        Objects.equals(this.productCategory, productDetailResponse.productCategory) &&
        Objects.equals(this.productSubcategory, productDetailResponse.productSubcategory) &&
        Objects.equals(this.vendorName, productDetailResponse.vendorName) &&
        Objects.equals(this.vendorNumber, productDetailResponse.vendorNumber) &&
        Objects.equals(this.productStatusCode, productDetailResponse.productStatusCode) &&
        Objects.equals(this.productClass, productDetailResponse.productClass) &&
        Objects.equals(this.customerPartNumber, productDetailResponse.customerPartNumber) &&
        Objects.equals(this.indicators, productDetailResponse.indicators) &&
        Objects.equals(this.ciscoFields, productDetailResponse.ciscoFields) &&
        Objects.equals(this.warrantyInformation, productDetailResponse.warrantyInformation) &&
        Objects.equals(this.additionalInformation, productDetailResponse.additionalInformation) &&
        Objects.equals(this.subscriptionDetails, productDetailResponse.subscriptionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramPartNumber, vendorPartNumber, productAuthorized, description, upc, productCategory, productSubcategory, vendorName, vendorNumber, productStatusCode, productClass, customerPartNumber, indicators, ciscoFields, warrantyInformation, additionalInformation, subscriptionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponse {\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    productAuthorized: ").append(toIndentedString(productAuthorized)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productSubcategory: ").append(toIndentedString(productSubcategory)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorNumber: ").append(toIndentedString(vendorNumber)).append("\n");
    sb.append("    productStatusCode: ").append(toIndentedString(productStatusCode)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    customerPartNumber: ").append(toIndentedString(customerPartNumber)).append("\n");
    sb.append("    indicators: ").append(toIndentedString(indicators)).append("\n");
    sb.append("    ciscoFields: ").append(toIndentedString(ciscoFields)).append("\n");
    sb.append("    warrantyInformation: ").append(toIndentedString(warrantyInformation)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    subscriptionDetails: ").append(toIndentedString(subscriptionDetails)).append("\n");
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
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("productAuthorized");
    openapiFields.add("description");
    openapiFields.add("upc");
    openapiFields.add("productCategory");
    openapiFields.add("productSubcategory");
    openapiFields.add("vendorName");
    openapiFields.add("vendorNumber");
    openapiFields.add("productStatusCode");
    openapiFields.add("productClass");
    openapiFields.add("customerPartNumber");
    openapiFields.add("indicators");
    openapiFields.add("ciscoFields");
    openapiFields.add("warrantyInformation");
    openapiFields.add("additionalInformation");
    openapiFields.add("subscriptionDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponse is not found in the empty JSON string", ProductDetailResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("productCategory") != null && !jsonObj.get("productCategory").isJsonNull()) && !jsonObj.get("productCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productCategory").toString()));
      }
      if ((jsonObj.get("productSubcategory") != null && !jsonObj.get("productSubcategory").isJsonNull()) && !jsonObj.get("productSubcategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productSubcategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productSubcategory").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("vendorNumber") != null && !jsonObj.get("vendorNumber").isJsonNull()) && !jsonObj.get("vendorNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorNumber").toString()));
      }
      if ((jsonObj.get("productStatusCode") != null && !jsonObj.get("productStatusCode").isJsonNull()) && !jsonObj.get("productStatusCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productStatusCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productStatusCode").toString()));
      }
      if ((jsonObj.get("productClass") != null && !jsonObj.get("productClass").isJsonNull()) && !jsonObj.get("productClass").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productClass` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productClass").toString()));
      }
      if ((jsonObj.get("customerPartNumber") != null && !jsonObj.get("customerPartNumber").isJsonNull()) && !jsonObj.get("customerPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerPartNumber").toString()));
      }
      if (jsonObj.get("indicators") != null && !jsonObj.get("indicators").isJsonNull()) {
        JsonArray jsonArrayindicators = jsonObj.getAsJsonArray("indicators");
        if (jsonArrayindicators != null) {
          // ensure the json data is an array
          if (!jsonObj.get("indicators").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `indicators` to be an array in the JSON string but got `%s`", jsonObj.get("indicators").toString()));
          }

          // validate the optional field `indicators` (array)
          for (int i = 0; i < jsonArrayindicators.size(); i++) {
            ProductDetailResponseIndicatorsInner.validateJsonElement(jsonArrayindicators.get(i));
          };
        }
      }
      if (jsonObj.get("ciscoFields") != null && !jsonObj.get("ciscoFields").isJsonNull()) {
        JsonArray jsonArrayciscoFields = jsonObj.getAsJsonArray("ciscoFields");
        if (jsonArrayciscoFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ciscoFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ciscoFields` to be an array in the JSON string but got `%s`", jsonObj.get("ciscoFields").toString()));
          }

          // validate the optional field `ciscoFields` (array)
          for (int i = 0; i < jsonArrayciscoFields.size(); i++) {
            ProductDetailResponseCiscoFieldsInner.validateJsonElement(jsonArrayciscoFields.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("warrantyInformation") != null && !jsonObj.get("warrantyInformation").isJsonNull() && !jsonObj.get("warrantyInformation").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warrantyInformation` to be an array in the JSON string but got `%s`", jsonObj.get("warrantyInformation").toString()));
      }
      // validate the optional field `additionalInformation`
      if (jsonObj.get("additionalInformation") != null && !jsonObj.get("additionalInformation").isJsonNull()) {
        ProductDetailResponseAdditionalInformation.validateJsonElement(jsonObj.get("additionalInformation"));
      }
      if (jsonObj.get("subscriptionDetails") != null && !jsonObj.get("subscriptionDetails").isJsonNull()) {
        JsonArray jsonArraysubscriptionDetails = jsonObj.getAsJsonArray("subscriptionDetails");
        if (jsonArraysubscriptionDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscriptionDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscriptionDetails` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptionDetails").toString()));
          }

          // validate the optional field `subscriptionDetails` (array)
          for (int i = 0; i < jsonArraysubscriptionDetails.size(); i++) {
            ProductDetailResponseSubscriptionDetailsInner.validateJsonElement(jsonArraysubscriptionDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponse>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDetailResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDetailResponse
   * @throws IOException if the JSON string is invalid with respect to ProductDetailResponse
   */
  public static ProductDetailResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponse.class);
  }

  /**
   * Convert an instance of ProductDetailResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

