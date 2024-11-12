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
import java.time.LocalDate;
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
 * PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T05:37:19.764548Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner {
  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discountType";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  private String discountType;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMER = "specialBidNumer";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMER)
  private String specialBidNumer;

  public static final String SERIALIZED_NAME_SPECIAL_PRICING_DISCOUNT = "specialPricingDiscount";
  @SerializedName(SERIALIZED_NAME_SPECIAL_PRICING_DISCOUNT)
  private BigDecimal specialPricingDiscount;

  public static final String SERIALIZED_NAME_SPECIAL_PRICING_EFFECTIVE_DATE = "specialPricingEffectiveDate";
  @SerializedName(SERIALIZED_NAME_SPECIAL_PRICING_EFFECTIVE_DATE)
  private LocalDate specialPricingEffectiveDate;

  public static final String SERIALIZED_NAME_SPECIAL_PRICING_EXPIRATION_DATE = "specialPricingExpirationDate";
  @SerializedName(SERIALIZED_NAME_SPECIAL_PRICING_EXPIRATION_DATE)
  private LocalDate specialPricingExpirationDate;

  public static final String SERIALIZED_NAME_SPECIAL_PRICING_AVAILABLE_QUANTITY = "specialPricingAvailableQuantity";
  @SerializedName(SERIALIZED_NAME_SPECIAL_PRICING_AVAILABLE_QUANTITY)
  private Integer specialPricingAvailableQuantity;

  public static final String SERIALIZED_NAME_SPECIAL_PRICING_MIN_QUANTITY = "specialPricingMinQuantity";
  @SerializedName(SERIALIZED_NAME_SPECIAL_PRICING_MIN_QUANTITY)
  private Integer specialPricingMinQuantity;

  public static final String SERIALIZED_NAME_GOVERNMENT_DISCOUNT_TYPE = "governmentDiscountType";
  @SerializedName(SERIALIZED_NAME_GOVERNMENT_DISCOUNT_TYPE)
  private String governmentDiscountType;

  public static final String SERIALIZED_NAME_GOVERNMENT_DISCOUNTED_CUSTOMER_PRICE = "governmentDiscountedCustomerPrice";
  @SerializedName(SERIALIZED_NAME_GOVERNMENT_DISCOUNTED_CUSTOMER_PRICE)
  private BigDecimal governmentDiscountedCustomerPrice;

  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner() {
  }

  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner discountType(String discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * The type of discount being given to the customer.
   * @return discountType
   */
  @javax.annotation.Nullable
  public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(String discountType) {
    this.discountType = discountType;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner specialBidNumer(String specialBidNumer) {
    this.specialBidNumer = specialBidNumer;
    return this;
  }

  /**
   * Pre-approved special pricing/bid number provided to the reseller by the vendor for special pricing and discounts. Used to track the bid number where different line items have different bid numbers. Line-level bid numbers take precedence over header-level bid numbers.
   * @return specialBidNumer
   */
  @javax.annotation.Nullable
  public String getSpecialBidNumer() {
    return specialBidNumer;
  }

  public void setSpecialBidNumer(String specialBidNumer) {
    this.specialBidNumer = specialBidNumer;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner specialPricingDiscount(BigDecimal specialPricingDiscount) {
    this.specialPricingDiscount = specialPricingDiscount;
    return this;
  }

  /**
   * Special pricing discount amount given to the customer.
   * @return specialPricingDiscount
   */
  @javax.annotation.Nullable
  public BigDecimal getSpecialPricingDiscount() {
    return specialPricingDiscount;
  }

  public void setSpecialPricingDiscount(BigDecimal specialPricingDiscount) {
    this.specialPricingDiscount = specialPricingDiscount;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner specialPricingEffectiveDate(LocalDate specialPricingEffectiveDate) {
    this.specialPricingEffectiveDate = specialPricingEffectiveDate;
    return this;
  }

  /**
   * The effective date of the special pricing available to the customer.
   * @return specialPricingEffectiveDate
   */
  @javax.annotation.Nullable
  public LocalDate getSpecialPricingEffectiveDate() {
    return specialPricingEffectiveDate;
  }

  public void setSpecialPricingEffectiveDate(LocalDate specialPricingEffectiveDate) {
    this.specialPricingEffectiveDate = specialPricingEffectiveDate;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner specialPricingExpirationDate(LocalDate specialPricingExpirationDate) {
    this.specialPricingExpirationDate = specialPricingExpirationDate;
    return this;
  }

  /**
   * The expiration date of the special pricing available to the customer.
   * @return specialPricingExpirationDate
   */
  @javax.annotation.Nullable
  public LocalDate getSpecialPricingExpirationDate() {
    return specialPricingExpirationDate;
  }

  public void setSpecialPricingExpirationDate(LocalDate specialPricingExpirationDate) {
    this.specialPricingExpirationDate = specialPricingExpirationDate;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner specialPricingAvailableQuantity(Integer specialPricingAvailableQuantity) {
    this.specialPricingAvailableQuantity = specialPricingAvailableQuantity;
    return this;
  }

  /**
   * The available quantity of products with discounts.
   * @return specialPricingAvailableQuantity
   */
  @javax.annotation.Nullable
  public Integer getSpecialPricingAvailableQuantity() {
    return specialPricingAvailableQuantity;
  }

  public void setSpecialPricingAvailableQuantity(Integer specialPricingAvailableQuantity) {
    this.specialPricingAvailableQuantity = specialPricingAvailableQuantity;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner specialPricingMinQuantity(Integer specialPricingMinQuantity) {
    this.specialPricingMinQuantity = specialPricingMinQuantity;
    return this;
  }

  /**
   * The minimum quantity of products that have to be purchased to ensure the discount is applied.
   * @return specialPricingMinQuantity
   */
  @javax.annotation.Nullable
  public Integer getSpecialPricingMinQuantity() {
    return specialPricingMinQuantity;
  }

  public void setSpecialPricingMinQuantity(Integer specialPricingMinQuantity) {
    this.specialPricingMinQuantity = specialPricingMinQuantity;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner governmentDiscountType(String governmentDiscountType) {
    this.governmentDiscountType = governmentDiscountType;
    return this;
  }

  /**
   * Type of Government Discount. *Currently, this discount is only available in the USA.
   * @return governmentDiscountType
   */
  @javax.annotation.Nullable
  public String getGovernmentDiscountType() {
    return governmentDiscountType;
  }

  public void setGovernmentDiscountType(String governmentDiscountType) {
    this.governmentDiscountType = governmentDiscountType;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner governmentDiscountedCustomerPrice(BigDecimal governmentDiscountedCustomerPrice) {
    this.governmentDiscountedCustomerPrice = governmentDiscountedCustomerPrice;
    return this;
  }

  /**
   * Government Discounted Customer Price. *Currently, this discount is only available in the USA.
   * @return governmentDiscountedCustomerPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getGovernmentDiscountedCustomerPrice() {
    return governmentDiscountedCustomerPrice;
  }

  public void setGovernmentDiscountedCustomerPrice(BigDecimal governmentDiscountedCustomerPrice) {
    this.governmentDiscountedCustomerPrice = governmentDiscountedCustomerPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner = (PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner) o;
    return Objects.equals(this.discountType, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.discountType) &&
        Objects.equals(this.specialBidNumer, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.specialBidNumer) &&
        Objects.equals(this.specialPricingDiscount, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.specialPricingDiscount) &&
        Objects.equals(this.specialPricingEffectiveDate, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.specialPricingEffectiveDate) &&
        Objects.equals(this.specialPricingExpirationDate, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.specialPricingExpirationDate) &&
        Objects.equals(this.specialPricingAvailableQuantity, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.specialPricingAvailableQuantity) &&
        Objects.equals(this.specialPricingMinQuantity, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.specialPricingMinQuantity) &&
        Objects.equals(this.governmentDiscountType, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.governmentDiscountType) &&
        Objects.equals(this.governmentDiscountedCustomerPrice, priceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.governmentDiscountedCustomerPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountType, specialBidNumer, specialPricingDiscount, specialPricingEffectiveDate, specialPricingExpirationDate, specialPricingAvailableQuantity, specialPricingMinQuantity, governmentDiscountType, governmentDiscountedCustomerPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner {\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    specialBidNumer: ").append(toIndentedString(specialBidNumer)).append("\n");
    sb.append("    specialPricingDiscount: ").append(toIndentedString(specialPricingDiscount)).append("\n");
    sb.append("    specialPricingEffectiveDate: ").append(toIndentedString(specialPricingEffectiveDate)).append("\n");
    sb.append("    specialPricingExpirationDate: ").append(toIndentedString(specialPricingExpirationDate)).append("\n");
    sb.append("    specialPricingAvailableQuantity: ").append(toIndentedString(specialPricingAvailableQuantity)).append("\n");
    sb.append("    specialPricingMinQuantity: ").append(toIndentedString(specialPricingMinQuantity)).append("\n");
    sb.append("    governmentDiscountType: ").append(toIndentedString(governmentDiscountType)).append("\n");
    sb.append("    governmentDiscountedCustomerPrice: ").append(toIndentedString(governmentDiscountedCustomerPrice)).append("\n");
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
    openapiFields.add("discountType");
    openapiFields.add("specialBidNumer");
    openapiFields.add("specialPricingDiscount");
    openapiFields.add("specialPricingEffectiveDate");
    openapiFields.add("specialPricingExpirationDate");
    openapiFields.add("specialPricingAvailableQuantity");
    openapiFields.add("specialPricingMinQuantity");
    openapiFields.add("governmentDiscountType");
    openapiFields.add("governmentDiscountedCustomerPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("discountType") != null && !jsonObj.get("discountType").isJsonNull()) && !jsonObj.get("discountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountType").toString()));
      }
      if ((jsonObj.get("specialBidNumer") != null && !jsonObj.get("specialBidNumer").isJsonNull()) && !jsonObj.get("specialBidNumer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumer").toString()));
      }
      if ((jsonObj.get("governmentDiscountType") != null && !jsonObj.get("governmentDiscountType").isJsonNull()) && !jsonObj.get("governmentDiscountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `governmentDiscountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("governmentDiscountType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner
   */
  public static PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

