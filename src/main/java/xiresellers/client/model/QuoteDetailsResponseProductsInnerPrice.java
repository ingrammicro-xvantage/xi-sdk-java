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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.QuoteDetailsResponseProductsInnerPriceDiscountsInner;
import xiresellers.client.model.QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner;

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
 * QuoteDetailsResponseProductsInnerPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T09:04:53.013432Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class QuoteDetailsResponseProductsInnerPrice {
  public static final String SERIALIZED_NAME_QUOTE_PRICE = "quotePrice";
  @SerializedName(SERIALIZED_NAME_QUOTE_PRICE)
  private BigDecimal quotePrice;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private BigDecimal msrp;

  public static final String SERIALIZED_NAME_EXTENDED_MSRP = "extendedMsrp";
  @SerializedName(SERIALIZED_NAME_EXTENDED_MSRP)
  private BigDecimal extendedMsrp;

  public static final String SERIALIZED_NAME_EXTENDED_QUOTE_PRICE = "extendedQuotePrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_QUOTE_PRICE)
  private BigDecimal extendedQuotePrice;

  public static final String SERIALIZED_NAME_REMAINING_QUANTITY_EXTENDED_MSRP = "remainingQuantityExtendedMsrp";
  @SerializedName(SERIALIZED_NAME_REMAINING_QUANTITY_EXTENDED_MSRP)
  private BigDecimal remainingQuantityExtendedMsrp;

  public static final String SERIALIZED_NAME_REMAINING_QUANTITY_EXTENDED_QUOTE_PRICE = "remainingQuantityExtendedQuotePrice";
  @SerializedName(SERIALIZED_NAME_REMAINING_QUANTITY_EXTENDED_QUOTE_PRICE)
  private BigDecimal remainingQuantityExtendedQuotePrice;

  public static final String SERIALIZED_NAME_DISCOUNT_OFF_LIST = "discountOffList";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_OFF_LIST)
  private String discountOffList;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_RECURRING_PRICE_MODEL = "recurringPriceModel";
  @SerializedName(SERIALIZED_NAME_RECURRING_PRICE_MODEL)
  private String recurringPriceModel;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE = "unitOfMeasure";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE)
  private String unitOfMeasure;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private BigDecimal tax;

  public static final String SERIALIZED_NAME_EXTRAFEES = "extrafees";
  @SerializedName(SERIALIZED_NAME_EXTRAFEES)
  private BigDecimal extrafees;

  public static final String SERIALIZED_NAME_EXTRA_FEES_DETAILS = "extraFeesDetails";
  @SerializedName(SERIALIZED_NAME_EXTRA_FEES_DETAILS)
  private List<QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner> extraFeesDetails = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<QuoteDetailsResponseProductsInnerPriceDiscountsInner> discounts = new ArrayList<>();

  public QuoteDetailsResponseProductsInnerPrice() {
  }

  public QuoteDetailsResponseProductsInnerPrice quotePrice(BigDecimal quotePrice) {
    this.quotePrice = quotePrice;
    return this;
  }

  /**
   * Ingram Micro quoted price specific to the reseller and quote.
   * @return quotePrice
   */
  @javax.annotation.Nullable
  public BigDecimal getQuotePrice() {
    return quotePrice;
  }

  public void setQuotePrice(BigDecimal quotePrice) {
    this.quotePrice = quotePrice;
  }


  public QuoteDetailsResponseProductsInnerPrice msrp(BigDecimal msrp) {
    this.msrp = msrp;
    return this;
  }

  /**
   * Manufacturer Suggested Retail Price
   * @return msrp
   */
  @javax.annotation.Nullable
  public BigDecimal getMsrp() {
    return msrp;
  }

  public void setMsrp(BigDecimal msrp) {
    this.msrp = msrp;
  }


  public QuoteDetailsResponseProductsInnerPrice extendedMsrp(BigDecimal extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
    return this;
  }

  /**
   * Extended MSRP - Manufacturer Suggested Retail Price X Quantity
   * @return extendedMsrp
   */
  @javax.annotation.Nullable
  public BigDecimal getExtendedMsrp() {
    return extendedMsrp;
  }

  public void setExtendedMsrp(BigDecimal extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
  }


  public QuoteDetailsResponseProductsInnerPrice extendedQuotePrice(BigDecimal extendedQuotePrice) {
    this.extendedQuotePrice = extendedQuotePrice;
    return this;
  }

  /**
   * Extended reseller quoted price (cost to reseller) X Quantity
   * @return extendedQuotePrice
   */
  @javax.annotation.Nullable
  public BigDecimal getExtendedQuotePrice() {
    return extendedQuotePrice;
  }

  public void setExtendedQuotePrice(BigDecimal extendedQuotePrice) {
    this.extendedQuotePrice = extendedQuotePrice;
  }


  public QuoteDetailsResponseProductsInnerPrice remainingQuantityExtendedMsrp(BigDecimal remainingQuantityExtendedMsrp) {
    this.remainingQuantityExtendedMsrp = remainingQuantityExtendedMsrp;
    return this;
  }

  /**
   * Get remainingQuantityExtendedMsrp
   * @return remainingQuantityExtendedMsrp
   */
  @javax.annotation.Nullable
  public BigDecimal getRemainingQuantityExtendedMsrp() {
    return remainingQuantityExtendedMsrp;
  }

  public void setRemainingQuantityExtendedMsrp(BigDecimal remainingQuantityExtendedMsrp) {
    this.remainingQuantityExtendedMsrp = remainingQuantityExtendedMsrp;
  }


  public QuoteDetailsResponseProductsInnerPrice remainingQuantityExtendedQuotePrice(BigDecimal remainingQuantityExtendedQuotePrice) {
    this.remainingQuantityExtendedQuotePrice = remainingQuantityExtendedQuotePrice;
    return this;
  }

  /**
   * Get remainingQuantityExtendedQuotePrice
   * @return remainingQuantityExtendedQuotePrice
   */
  @javax.annotation.Nullable
  public BigDecimal getRemainingQuantityExtendedQuotePrice() {
    return remainingQuantityExtendedQuotePrice;
  }

  public void setRemainingQuantityExtendedQuotePrice(BigDecimal remainingQuantityExtendedQuotePrice) {
    this.remainingQuantityExtendedQuotePrice = remainingQuantityExtendedQuotePrice;
  }


  public QuoteDetailsResponseProductsInnerPrice discountOffList(String discountOffList) {
    this.discountOffList = discountOffList;
    return this;
  }

  /**
   * Discount off list percentage extended
   * @return discountOffList
   */
  @javax.annotation.Nullable
  public String getDiscountOffList() {
    return discountOffList;
  }

  public void setDiscountOffList(String discountOffList) {
    this.discountOffList = discountOffList;
  }


  public QuoteDetailsResponseProductsInnerPrice type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public QuoteDetailsResponseProductsInnerPrice recurringPriceModel(String recurringPriceModel) {
    this.recurringPriceModel = recurringPriceModel;
    return this;
  }

  /**
   * Get recurringPriceModel
   * @return recurringPriceModel
   */
  @javax.annotation.Nullable
  public String getRecurringPriceModel() {
    return recurringPriceModel;
  }

  public void setRecurringPriceModel(String recurringPriceModel) {
    this.recurringPriceModel = recurringPriceModel;
  }


  public QuoteDetailsResponseProductsInnerPrice unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Get unitOfMeasure
   * @return unitOfMeasure
   */
  @javax.annotation.Nullable
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  public QuoteDetailsResponseProductsInnerPrice tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
   */
  @javax.annotation.Nullable
  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }


  public QuoteDetailsResponseProductsInnerPrice extrafees(BigDecimal extrafees) {
    this.extrafees = extrafees;
    return this;
  }

  /**
   * Get extrafees
   * @return extrafees
   */
  @javax.annotation.Nullable
  public BigDecimal getExtrafees() {
    return extrafees;
  }

  public void setExtrafees(BigDecimal extrafees) {
    this.extrafees = extrafees;
  }


  public QuoteDetailsResponseProductsInnerPrice extraFeesDetails(List<QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner> extraFeesDetails) {
    this.extraFeesDetails = extraFeesDetails;
    return this;
  }

  public QuoteDetailsResponseProductsInnerPrice addExtraFeesDetailsItem(QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner extraFeesDetailsItem) {
    if (this.extraFeesDetails == null) {
      this.extraFeesDetails = new ArrayList<>();
    }
    this.extraFeesDetails.add(extraFeesDetailsItem);
    return this;
  }

  /**
   * Get extraFeesDetails
   * @return extraFeesDetails
   */
  @javax.annotation.Nullable
  public List<QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner> getExtraFeesDetails() {
    return extraFeesDetails;
  }

  public void setExtraFeesDetails(List<QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner> extraFeesDetails) {
    this.extraFeesDetails = extraFeesDetails;
  }


  public QuoteDetailsResponseProductsInnerPrice discounts(List<QuoteDetailsResponseProductsInnerPriceDiscountsInner> discounts) {
    this.discounts = discounts;
    return this;
  }

  public QuoteDetailsResponseProductsInnerPrice addDiscountsItem(QuoteDetailsResponseProductsInnerPriceDiscountsInner discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * Get discounts
   * @return discounts
   */
  @javax.annotation.Nullable
  public List<QuoteDetailsResponseProductsInnerPriceDiscountsInner> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<QuoteDetailsResponseProductsInnerPriceDiscountsInner> discounts) {
    this.discounts = discounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsResponseProductsInnerPrice quoteDetailsResponseProductsInnerPrice = (QuoteDetailsResponseProductsInnerPrice) o;
    return Objects.equals(this.quotePrice, quoteDetailsResponseProductsInnerPrice.quotePrice) &&
        Objects.equals(this.msrp, quoteDetailsResponseProductsInnerPrice.msrp) &&
        Objects.equals(this.extendedMsrp, quoteDetailsResponseProductsInnerPrice.extendedMsrp) &&
        Objects.equals(this.extendedQuotePrice, quoteDetailsResponseProductsInnerPrice.extendedQuotePrice) &&
        Objects.equals(this.remainingQuantityExtendedMsrp, quoteDetailsResponseProductsInnerPrice.remainingQuantityExtendedMsrp) &&
        Objects.equals(this.remainingQuantityExtendedQuotePrice, quoteDetailsResponseProductsInnerPrice.remainingQuantityExtendedQuotePrice) &&
        Objects.equals(this.discountOffList, quoteDetailsResponseProductsInnerPrice.discountOffList) &&
        Objects.equals(this.type, quoteDetailsResponseProductsInnerPrice.type) &&
        Objects.equals(this.recurringPriceModel, quoteDetailsResponseProductsInnerPrice.recurringPriceModel) &&
        Objects.equals(this.unitOfMeasure, quoteDetailsResponseProductsInnerPrice.unitOfMeasure) &&
        Objects.equals(this.tax, quoteDetailsResponseProductsInnerPrice.tax) &&
        Objects.equals(this.extrafees, quoteDetailsResponseProductsInnerPrice.extrafees) &&
        Objects.equals(this.extraFeesDetails, quoteDetailsResponseProductsInnerPrice.extraFeesDetails) &&
        Objects.equals(this.discounts, quoteDetailsResponseProductsInnerPrice.discounts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotePrice, msrp, extendedMsrp, extendedQuotePrice, remainingQuantityExtendedMsrp, remainingQuantityExtendedQuotePrice, discountOffList, type, recurringPriceModel, unitOfMeasure, tax, extrafees, extraFeesDetails, discounts);
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
    sb.append("class QuoteDetailsResponseProductsInnerPrice {\n");
    sb.append("    quotePrice: ").append(toIndentedString(quotePrice)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    extendedMsrp: ").append(toIndentedString(extendedMsrp)).append("\n");
    sb.append("    extendedQuotePrice: ").append(toIndentedString(extendedQuotePrice)).append("\n");
    sb.append("    remainingQuantityExtendedMsrp: ").append(toIndentedString(remainingQuantityExtendedMsrp)).append("\n");
    sb.append("    remainingQuantityExtendedQuotePrice: ").append(toIndentedString(remainingQuantityExtendedQuotePrice)).append("\n");
    sb.append("    discountOffList: ").append(toIndentedString(discountOffList)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recurringPriceModel: ").append(toIndentedString(recurringPriceModel)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    extrafees: ").append(toIndentedString(extrafees)).append("\n");
    sb.append("    extraFeesDetails: ").append(toIndentedString(extraFeesDetails)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
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
    openapiFields.add("quotePrice");
    openapiFields.add("msrp");
    openapiFields.add("extendedMsrp");
    openapiFields.add("extendedQuotePrice");
    openapiFields.add("remainingQuantityExtendedMsrp");
    openapiFields.add("remainingQuantityExtendedQuotePrice");
    openapiFields.add("discountOffList");
    openapiFields.add("type");
    openapiFields.add("recurringPriceModel");
    openapiFields.add("unitOfMeasure");
    openapiFields.add("tax");
    openapiFields.add("extrafees");
    openapiFields.add("extraFeesDetails");
    openapiFields.add("discounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsResponseProductsInnerPrice
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsResponseProductsInnerPrice.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsResponseProductsInnerPrice is not found in the empty JSON string", QuoteDetailsResponseProductsInnerPrice.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsResponseProductsInnerPrice.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsResponseProductsInnerPrice` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("discountOffList") != null && !jsonObj.get("discountOffList").isJsonNull()) && !jsonObj.get("discountOffList").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discountOffList` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discountOffList").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("recurringPriceModel") != null && !jsonObj.get("recurringPriceModel").isJsonNull()) && !jsonObj.get("recurringPriceModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringPriceModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringPriceModel").toString()));
      }
      if ((jsonObj.get("unitOfMeasure") != null && !jsonObj.get("unitOfMeasure").isJsonNull()) && !jsonObj.get("unitOfMeasure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitOfMeasure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitOfMeasure").toString()));
      }
      if (jsonObj.get("extraFeesDetails") != null && !jsonObj.get("extraFeesDetails").isJsonNull()) {
        JsonArray jsonArrayextraFeesDetails = jsonObj.getAsJsonArray("extraFeesDetails");
        if (jsonArrayextraFeesDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extraFeesDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extraFeesDetails` to be an array in the JSON string but got `%s`", jsonObj.get("extraFeesDetails").toString()));
          }

          // validate the optional field `extraFeesDetails` (array)
          for (int i = 0; i < jsonArrayextraFeesDetails.size(); i++) {
            QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.validateJsonElement(jsonArrayextraFeesDetails.get(i));
          };
        }
      }
      if (jsonObj.get("discounts") != null && !jsonObj.get("discounts").isJsonNull()) {
        JsonArray jsonArraydiscounts = jsonObj.getAsJsonArray("discounts");
        if (jsonArraydiscounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("discounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `discounts` to be an array in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
          }

          // validate the optional field `discounts` (array)
          for (int i = 0; i < jsonArraydiscounts.size(); i++) {
            QuoteDetailsResponseProductsInnerPriceDiscountsInner.validateJsonElement(jsonArraydiscounts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsResponseProductsInnerPrice.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsResponseProductsInnerPrice' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsResponseProductsInnerPrice> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsResponseProductsInnerPrice.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsResponseProductsInnerPrice>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsResponseProductsInnerPrice value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsResponseProductsInnerPrice read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuoteDetailsResponseProductsInnerPrice given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuoteDetailsResponseProductsInnerPrice
   * @throws IOException if the JSON string is invalid with respect to QuoteDetailsResponseProductsInnerPrice
   */
  public static QuoteDetailsResponseProductsInnerPrice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsResponseProductsInnerPrice.class);
  }

  /**
   * Convert an instance of QuoteDetailsResponseProductsInnerPrice to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

