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
 * PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T09:39:11.793223Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private BigDecimal msrp;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_MARGIN = "margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private BigDecimal margin;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PERIOD = "subscriptionPeriod";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PERIOD)
  private String subscriptionPeriod;

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner() {
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the type of pricing.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the line item.
   * @return quantity
   */
  @javax.annotation.Nullable
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner msrp(BigDecimal msrp) {
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


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The unit price of the line item.
   * @return unitPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner margin(BigDecimal margin) {
    this.margin = margin;
    return this;
  }

  /**
   * Reseller’s margin percentage
   * @return margin
   */
  @javax.annotation.Nullable
  public BigDecimal getMargin() {
    return margin;
  }

  public void setMargin(BigDecimal margin) {
    this.margin = margin;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner currencyCode(String currencyCode) {
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

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner subscriptionPeriod(String subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
    return this;
  }

  /**
   * The subscription period of the line item.
   * @return subscriptionPeriod
   */
  @javax.annotation.Nullable
  public String getSubscriptionPeriod() {
    return subscriptionPeriod;
  }

  public void setSubscriptionPeriod(String subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner = (PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner) o;
    return Objects.equals(this.name, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.name) &&
        Objects.equals(this.quantity, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.quantity) &&
        Objects.equals(this.msrp, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.msrp) &&
        Objects.equals(this.unitPrice, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.unitPrice) &&
        Objects.equals(this.margin, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.margin) &&
        Objects.equals(this.currencyCode, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.currencyCode) &&
        Objects.equals(this.subscriptionPeriod, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.subscriptionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, quantity, msrp, unitPrice, margin, currencyCode, subscriptionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    subscriptionPeriod: ").append(toIndentedString(subscriptionPeriod)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("quantity");
    openapiFields.add("msrp");
    openapiFields.add("unitPrice");
    openapiFields.add("margin");
    openapiFields.add("currencyCode");
    openapiFields.add("subscriptionPeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull()) && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if ((jsonObj.get("subscriptionPeriod") != null && !jsonObj.get("subscriptionPeriod").isJsonNull()) && !jsonObj.get("subscriptionPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionPeriod").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner
   */
  public static PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

