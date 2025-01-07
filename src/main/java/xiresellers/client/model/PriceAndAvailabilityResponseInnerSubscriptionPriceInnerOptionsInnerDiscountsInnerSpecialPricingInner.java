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
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T08:16:24.530377484Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  @javax.annotation.Nullable
  private String currencyCode;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  @javax.annotation.Nullable
  private BigDecimal discount;

  public static final String SERIALIZED_NAME_DISCOUNT_TYPE = "discountType";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_TYPE)
  @javax.annotation.Nullable
  private String discountType;

  public static final String SERIALIZED_NAME_DISCOUNT_QTY_LIMIT = "discountQtyLimit";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_QTY_LIMIT)
  @javax.annotation.Nullable
  private Integer discountQtyLimit;

  public static final String SERIALIZED_NAME_DISCOUNT_EXPIRY_DATE = "discountExpiryDate";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_EXPIRY_DATE)
  @javax.annotation.Nullable
  private String discountExpiryDate;

  public static final String SERIALIZED_NAME_VENDOR_PROGRAM_NAME = "vendorProgramName";
  @SerializedName(SERIALIZED_NAME_VENDOR_PROGRAM_NAME)
  @javax.annotation.Nullable
  private String vendorProgramName;

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner() {
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner currencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The 3-digit ISO currency code.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@javax.annotation.Nullable String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner discount(@javax.annotation.Nullable BigDecimal discount) {
    this.discount = discount;
    return this;
  }

  /**
   * The discount for the line item.
   * @return discount
   */
  @javax.annotation.Nullable
  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(@javax.annotation.Nullable BigDecimal discount) {
    this.discount = discount;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner discountType(@javax.annotation.Nullable String discountType) {
    this.discountType = discountType;
    return this;
  }

  /**
   * The type of the discount
   * @return discountType
   */
  @javax.annotation.Nullable
  public String getDiscountType() {
    return discountType;
  }

  public void setDiscountType(@javax.annotation.Nullable String discountType) {
    this.discountType = discountType;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner discountQtyLimit(@javax.annotation.Nullable Integer discountQtyLimit) {
    this.discountQtyLimit = discountQtyLimit;
    return this;
  }

  /**
   * The quantity available at the discounted price
   * @return discountQtyLimit
   */
  @javax.annotation.Nullable
  public Integer getDiscountQtyLimit() {
    return discountQtyLimit;
  }

  public void setDiscountQtyLimit(@javax.annotation.Nullable Integer discountQtyLimit) {
    this.discountQtyLimit = discountQtyLimit;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner discountExpiryDate(@javax.annotation.Nullable String discountExpiryDate) {
    this.discountExpiryDate = discountExpiryDate;
    return this;
  }

  /**
   * The date when discount expires.
   * @return discountExpiryDate
   */
  @javax.annotation.Nullable
  public String getDiscountExpiryDate() {
    return discountExpiryDate;
  }

  public void setDiscountExpiryDate(@javax.annotation.Nullable String discountExpiryDate) {
    this.discountExpiryDate = discountExpiryDate;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner vendorProgramName(@javax.annotation.Nullable String vendorProgramName) {
    this.vendorProgramName = vendorProgramName;
    return this;
  }

  /**
   * The vendors discount program name.
   * @return vendorProgramName
   */
  @javax.annotation.Nullable
  public String getVendorProgramName() {
    return vendorProgramName;
  }

  public void setVendorProgramName(@javax.annotation.Nullable String vendorProgramName) {
    this.vendorProgramName = vendorProgramName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner = (PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner) o;
    return Objects.equals(this.currencyCode, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.currencyCode) &&
        Objects.equals(this.discount, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.discount) &&
        Objects.equals(this.discountType, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.discountType) &&
        Objects.equals(this.discountQtyLimit, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.discountQtyLimit) &&
        Objects.equals(this.discountExpiryDate, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.discountExpiryDate) &&
        Objects.equals(this.vendorProgramName, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.vendorProgramName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, discount, discountType, discountQtyLimit, discountExpiryDate, vendorProgramName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountQtyLimit: ").append(toIndentedString(discountQtyLimit)).append("\n");
    sb.append("    discountExpiryDate: ").append(toIndentedString(discountExpiryDate)).append("\n");
    sb.append("    vendorProgramName: ").append(toIndentedString(vendorProgramName)).append("\n");
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
    openapiFields.add("currencyCode");
    openapiFields.add("discount");
    openapiFields.add("discountType");
    openapiFields.add("discountQtyLimit");
    openapiFields.add("discountExpiryDate");
    openapiFields.add("vendorProgramName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("discountType") != null && !jsonObj.get("discountType").isJsonNull()) && !jsonObj.get("discountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountType").toString()));
      }
      if ((jsonObj.get("discountExpiryDate") != null && !jsonObj.get("discountExpiryDate").isJsonNull()) && !jsonObj.get("discountExpiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountExpiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountExpiryDate").toString()));
      }
      if ((jsonObj.get("vendorProgramName") != null && !jsonObj.get("vendorProgramName").isJsonNull()) && !jsonObj.get("vendorProgramName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorProgramName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorProgramName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner
   */
  public static PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerSpecialPricingInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

