/*
 * XI Sdk Resellers
 * For Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * QuoteDetailsResponseProductsInnerPrice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-27T08:54:45.542575Z[Etc/UTC]")
public class QuoteDetailsResponseProductsInnerPrice {
  public static final String SERIALIZED_NAME_QUOTE_PRICE = "quotePrice";
  @SerializedName(SERIALIZED_NAME_QUOTE_PRICE)
  private Integer quotePrice;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private Integer msrp;

  public static final String SERIALIZED_NAME_EXTENDED_MSRP = "extendedMsrp";
  @SerializedName(SERIALIZED_NAME_EXTENDED_MSRP)
  private Integer extendedMsrp;

  public static final String SERIALIZED_NAME_EXTENDED_QUOTE_PRICE = "extendedQuotePrice";
  @SerializedName(SERIALIZED_NAME_EXTENDED_QUOTE_PRICE)
  private Integer extendedQuotePrice;

  public static final String SERIALIZED_NAME_DISCOUNT_OFF_LIST = "discountOffList";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_OFF_LIST)
  private String discountOffList;

  public static final String SERIALIZED_NAME_VENDORPRICE = "vendorprice";
  @SerializedName(SERIALIZED_NAME_VENDORPRICE)
  private BigDecimal vendorprice;

  public static final String SERIALIZED_NAME_EXTENDEDVENDORPRICE = "extendedvendorprice";
  @SerializedName(SERIALIZED_NAME_EXTENDEDVENDORPRICE)
  private BigDecimal extendedvendorprice;

  public static final String SERIALIZED_NAME_TOTAL_VISIBLE_RESERVE_QUANTITY = "totalVisibleReserveQuantity";
  @SerializedName(SERIALIZED_NAME_TOTAL_VISIBLE_RESERVE_QUANTITY)
  private Integer totalVisibleReserveQuantity;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_RECURRING_PRICE_MODEL = "recurringPriceModel";
  @SerializedName(SERIALIZED_NAME_RECURRING_PRICE_MODEL)
  private String recurringPriceModel;

  public QuoteDetailsResponseProductsInnerPrice() {
  }

  public QuoteDetailsResponseProductsInnerPrice quotePrice(Integer quotePrice) {
    this.quotePrice = quotePrice;
    return this;
  }

   /**
   * Ingram Micro quoted price specific to the reseller and quote.
   * @return quotePrice
  **/
  @javax.annotation.Nullable
  public Integer getQuotePrice() {
    return quotePrice;
  }

  public void setQuotePrice(Integer quotePrice) {
    this.quotePrice = quotePrice;
  }


  public QuoteDetailsResponseProductsInnerPrice msrp(Integer msrp) {
    this.msrp = msrp;
    return this;
  }

   /**
   * Manufacturer Suggested Retail Price
   * @return msrp
  **/
  @javax.annotation.Nullable
  public Integer getMsrp() {
    return msrp;
  }

  public void setMsrp(Integer msrp) {
    this.msrp = msrp;
  }


  public QuoteDetailsResponseProductsInnerPrice extendedMsrp(Integer extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
    return this;
  }

   /**
   * Extended MSRP - Manufacturer Suggested Retail Price X Quantity
   * @return extendedMsrp
  **/
  @javax.annotation.Nullable
  public Integer getExtendedMsrp() {
    return extendedMsrp;
  }

  public void setExtendedMsrp(Integer extendedMsrp) {
    this.extendedMsrp = extendedMsrp;
  }


  public QuoteDetailsResponseProductsInnerPrice extendedQuotePrice(Integer extendedQuotePrice) {
    this.extendedQuotePrice = extendedQuotePrice;
    return this;
  }

   /**
   * Extended reseller quoted price (cost to reseller) X Quantity
   * @return extendedQuotePrice
  **/
  @javax.annotation.Nullable
  public Integer getExtendedQuotePrice() {
    return extendedQuotePrice;
  }

  public void setExtendedQuotePrice(Integer extendedQuotePrice) {
    this.extendedQuotePrice = extendedQuotePrice;
  }


  public QuoteDetailsResponseProductsInnerPrice discountOffList(String discountOffList) {
    this.discountOffList = discountOffList;
    return this;
  }

   /**
   * Discount off list percentage extended
   * @return discountOffList
  **/
  @javax.annotation.Nullable
  public String getDiscountOffList() {
    return discountOffList;
  }

  public void setDiscountOffList(String discountOffList) {
    this.discountOffList = discountOffList;
  }


  public QuoteDetailsResponseProductsInnerPrice vendorprice(BigDecimal vendorprice) {
    this.vendorprice = vendorprice;
    return this;
  }

   /**
   * Get vendorprice
   * @return vendorprice
  **/
  @javax.annotation.Nullable
  public BigDecimal getVendorprice() {
    return vendorprice;
  }

  public void setVendorprice(BigDecimal vendorprice) {
    this.vendorprice = vendorprice;
  }


  public QuoteDetailsResponseProductsInnerPrice extendedvendorprice(BigDecimal extendedvendorprice) {
    this.extendedvendorprice = extendedvendorprice;
    return this;
  }

   /**
   * Get extendedvendorprice
   * @return extendedvendorprice
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedvendorprice() {
    return extendedvendorprice;
  }

  public void setExtendedvendorprice(BigDecimal extendedvendorprice) {
    this.extendedvendorprice = extendedvendorprice;
  }


  public QuoteDetailsResponseProductsInnerPrice totalVisibleReserveQuantity(Integer totalVisibleReserveQuantity) {
    this.totalVisibleReserveQuantity = totalVisibleReserveQuantity;
    return this;
  }

   /**
   * Get totalVisibleReserveQuantity
   * @return totalVisibleReserveQuantity
  **/
  @javax.annotation.Nullable
  public Integer getTotalVisibleReserveQuantity() {
    return totalVisibleReserveQuantity;
  }

  public void setTotalVisibleReserveQuantity(Integer totalVisibleReserveQuantity) {
    this.totalVisibleReserveQuantity = totalVisibleReserveQuantity;
  }


  public QuoteDetailsResponseProductsInnerPrice type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
  **/
  @javax.annotation.Nullable
  public String getRecurringPriceModel() {
    return recurringPriceModel;
  }

  public void setRecurringPriceModel(String recurringPriceModel) {
    this.recurringPriceModel = recurringPriceModel;
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
        Objects.equals(this.discountOffList, quoteDetailsResponseProductsInnerPrice.discountOffList) &&
        Objects.equals(this.vendorprice, quoteDetailsResponseProductsInnerPrice.vendorprice) &&
        Objects.equals(this.extendedvendorprice, quoteDetailsResponseProductsInnerPrice.extendedvendorprice) &&
        Objects.equals(this.totalVisibleReserveQuantity, quoteDetailsResponseProductsInnerPrice.totalVisibleReserveQuantity) &&
        Objects.equals(this.type, quoteDetailsResponseProductsInnerPrice.type) &&
        Objects.equals(this.recurringPriceModel, quoteDetailsResponseProductsInnerPrice.recurringPriceModel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quotePrice, msrp, extendedMsrp, extendedQuotePrice, discountOffList, vendorprice, extendedvendorprice, totalVisibleReserveQuantity, type, recurringPriceModel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsResponseProductsInnerPrice {\n");
    sb.append("    quotePrice: ").append(toIndentedString(quotePrice)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    extendedMsrp: ").append(toIndentedString(extendedMsrp)).append("\n");
    sb.append("    extendedQuotePrice: ").append(toIndentedString(extendedQuotePrice)).append("\n");
    sb.append("    discountOffList: ").append(toIndentedString(discountOffList)).append("\n");
    sb.append("    vendorprice: ").append(toIndentedString(vendorprice)).append("\n");
    sb.append("    extendedvendorprice: ").append(toIndentedString(extendedvendorprice)).append("\n");
    sb.append("    totalVisibleReserveQuantity: ").append(toIndentedString(totalVisibleReserveQuantity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    recurringPriceModel: ").append(toIndentedString(recurringPriceModel)).append("\n");
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
    openapiFields.add("discountOffList");
    openapiFields.add("vendorprice");
    openapiFields.add("extendedvendorprice");
    openapiFields.add("totalVisibleReserveQuantity");
    openapiFields.add("type");
    openapiFields.add("recurringPriceModel");

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

