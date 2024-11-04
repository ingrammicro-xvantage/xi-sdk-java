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
import java.math.BigDecimal;
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
 * DealsDetailsResponseProductsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T05:16:26.828393Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DealsDetailsResponseProductsInner {
  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "productDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private BigDecimal msrp;

  public static final String SERIALIZED_NAME_EXTENDED_M_S_R_P = "extendedMSRP";
  @SerializedName(SERIALIZED_NAME_EXTENDED_M_S_R_P)
  private BigDecimal extendedMSRP;

  public static final String SERIALIZED_NAME_STANDARD_PRICE = "standardPrice";
  @SerializedName(SERIALIZED_NAME_STANDARD_PRICE)
  private BigDecimal standardPrice;

  public static final String SERIALIZED_NAME_APPROVED_QUANTITY = "approvedQuantity";
  @SerializedName(SERIALIZED_NAME_APPROVED_QUANTITY)
  private Integer approvedQuantity;

  public static final String SERIALIZED_NAME_REMAINING_QUANTITY = "remainingQuantity";
  @SerializedName(SERIALIZED_NAME_REMAINING_QUANTITY)
  private Integer remainingQuantity;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_SPECIAL_CONDITIONS = "specialConditions";
  @SerializedName(SERIALIZED_NAME_SPECIAL_CONDITIONS)
  private String specialConditions;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_DAYS_REMAINING = "daysRemaining";
  @SerializedName(SERIALIZED_NAME_DAYS_REMAINING)
  private Integer daysRemaining;

  public DealsDetailsResponseProductsInner() {
  }

  public DealsDetailsResponseProductsInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * Unique Ingram part number.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public DealsDetailsResponseProductsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * Vendor Part number for the product.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public DealsDetailsResponseProductsInner upc(String upc) {
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


  public DealsDetailsResponseProductsInner productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Description of the product.
   * @return productDescription
   */
  @javax.annotation.Nullable
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public DealsDetailsResponseProductsInner msrp(BigDecimal msrp) {
    this.msrp = msrp;
    return this;
  }

  /**
   * Manufacturer Suggested Retail Price.
   * @return msrp
   */
  @javax.annotation.Nullable
  public BigDecimal getMsrp() {
    return msrp;
  }

  public void setMsrp(BigDecimal msrp) {
    this.msrp = msrp;
  }


  public DealsDetailsResponseProductsInner extendedMSRP(BigDecimal extendedMSRP) {
    this.extendedMSRP = extendedMSRP;
    return this;
  }

  /**
   * Extended MSRP - Manufacturer Suggested Retail Price X Quantity.
   * @return extendedMSRP
   */
  @javax.annotation.Nullable
  public BigDecimal getExtendedMSRP() {
    return extendedMSRP;
  }

  public void setExtendedMSRP(BigDecimal extendedMSRP) {
    this.extendedMSRP = extendedMSRP;
  }


  public DealsDetailsResponseProductsInner standardPrice(BigDecimal standardPrice) {
    this.standardPrice = standardPrice;
    return this;
  }

  /**
   * Standard price of the line item.
   * @return standardPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getStandardPrice() {
    return standardPrice;
  }

  public void setStandardPrice(BigDecimal standardPrice) {
    this.standardPrice = standardPrice;
  }


  public DealsDetailsResponseProductsInner approvedQuantity(Integer approvedQuantity) {
    this.approvedQuantity = approvedQuantity;
    return this;
  }

  /**
   * Total quantity approved for the deal.
   * @return approvedQuantity
   */
  @javax.annotation.Nullable
  public Integer getApprovedQuantity() {
    return approvedQuantity;
  }

  public void setApprovedQuantity(Integer approvedQuantity) {
    this.approvedQuantity = approvedQuantity;
  }


  public DealsDetailsResponseProductsInner remainingQuantity(Integer remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
    return this;
  }

  /**
   * The quantity remaining as part of the deal for the customer to order.
   * @return remainingQuantity
   */
  @javax.annotation.Nullable
  public Integer getRemainingQuantity() {
    return remainingQuantity;
  }

  public void setRemainingQuantity(Integer remainingQuantity) {
    this.remainingQuantity = remainingQuantity;
  }


  public DealsDetailsResponseProductsInner comments(String comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Comments of the deal.
   * @return comments
   */
  @javax.annotation.Nullable
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }


  public DealsDetailsResponseProductsInner specialConditions(String specialConditions) {
    this.specialConditions = specialConditions;
    return this;
  }

  /**
   * Special conditions of the deal.
   * @return specialConditions
   */
  @javax.annotation.Nullable
  public String getSpecialConditions() {
    return specialConditions;
  }

  public void setSpecialConditions(String specialConditions) {
    this.specialConditions = specialConditions;
  }


  public DealsDetailsResponseProductsInner startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start Date.
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public DealsDetailsResponseProductsInner expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Expiration date.
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public DealsDetailsResponseProductsInner daysRemaining(Integer daysRemaining) {
    this.daysRemaining = daysRemaining;
    return this;
  }

  /**
   * Number of days remaining before the deal expires.
   * @return daysRemaining
   */
  @javax.annotation.Nullable
  public Integer getDaysRemaining() {
    return daysRemaining;
  }

  public void setDaysRemaining(Integer daysRemaining) {
    this.daysRemaining = daysRemaining;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DealsDetailsResponseProductsInner dealsDetailsResponseProductsInner = (DealsDetailsResponseProductsInner) o;
    return Objects.equals(this.ingramPartNumber, dealsDetailsResponseProductsInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, dealsDetailsResponseProductsInner.vendorPartNumber) &&
        Objects.equals(this.upc, dealsDetailsResponseProductsInner.upc) &&
        Objects.equals(this.productDescription, dealsDetailsResponseProductsInner.productDescription) &&
        Objects.equals(this.msrp, dealsDetailsResponseProductsInner.msrp) &&
        Objects.equals(this.extendedMSRP, dealsDetailsResponseProductsInner.extendedMSRP) &&
        Objects.equals(this.standardPrice, dealsDetailsResponseProductsInner.standardPrice) &&
        Objects.equals(this.approvedQuantity, dealsDetailsResponseProductsInner.approvedQuantity) &&
        Objects.equals(this.remainingQuantity, dealsDetailsResponseProductsInner.remainingQuantity) &&
        Objects.equals(this.comments, dealsDetailsResponseProductsInner.comments) &&
        Objects.equals(this.specialConditions, dealsDetailsResponseProductsInner.specialConditions) &&
        Objects.equals(this.startDate, dealsDetailsResponseProductsInner.startDate) &&
        Objects.equals(this.expirationDate, dealsDetailsResponseProductsInner.expirationDate) &&
        Objects.equals(this.daysRemaining, dealsDetailsResponseProductsInner.daysRemaining);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramPartNumber, vendorPartNumber, upc, productDescription, msrp, extendedMSRP, standardPrice, approvedQuantity, remainingQuantity, comments, specialConditions, startDate, expirationDate, daysRemaining);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealsDetailsResponseProductsInner {\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    extendedMSRP: ").append(toIndentedString(extendedMSRP)).append("\n");
    sb.append("    standardPrice: ").append(toIndentedString(standardPrice)).append("\n");
    sb.append("    approvedQuantity: ").append(toIndentedString(approvedQuantity)).append("\n");
    sb.append("    remainingQuantity: ").append(toIndentedString(remainingQuantity)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    specialConditions: ").append(toIndentedString(specialConditions)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    daysRemaining: ").append(toIndentedString(daysRemaining)).append("\n");
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
    openapiFields.add("upc");
    openapiFields.add("productDescription");
    openapiFields.add("msrp");
    openapiFields.add("extendedMSRP");
    openapiFields.add("standardPrice");
    openapiFields.add("approvedQuantity");
    openapiFields.add("remainingQuantity");
    openapiFields.add("comments");
    openapiFields.add("specialConditions");
    openapiFields.add("startDate");
    openapiFields.add("expirationDate");
    openapiFields.add("daysRemaining");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DealsDetailsResponseProductsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DealsDetailsResponseProductsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DealsDetailsResponseProductsInner is not found in the empty JSON string", DealsDetailsResponseProductsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DealsDetailsResponseProductsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DealsDetailsResponseProductsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("productDescription") != null && !jsonObj.get("productDescription").isJsonNull()) && !jsonObj.get("productDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productDescription").toString()));
      }
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
      if ((jsonObj.get("specialConditions") != null && !jsonObj.get("specialConditions").isJsonNull()) && !jsonObj.get("specialConditions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialConditions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialConditions").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) && !jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DealsDetailsResponseProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DealsDetailsResponseProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DealsDetailsResponseProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DealsDetailsResponseProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DealsDetailsResponseProductsInner>() {
           @Override
           public void write(JsonWriter out, DealsDetailsResponseProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DealsDetailsResponseProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DealsDetailsResponseProductsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DealsDetailsResponseProductsInner
   * @throws IOException if the JSON string is invalid with respect to DealsDetailsResponseProductsInner
   */
  public static DealsDetailsResponseProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DealsDetailsResponseProductsInner.class);
  }

  /**
   * Convert an instance of DealsDetailsResponseProductsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

