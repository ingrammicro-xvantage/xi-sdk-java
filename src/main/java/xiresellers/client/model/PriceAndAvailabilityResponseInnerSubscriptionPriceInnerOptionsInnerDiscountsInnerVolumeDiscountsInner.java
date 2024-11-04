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
 * PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T05:16:26.828393Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_MSRP = "msrp";
  @SerializedName(SERIALIZED_NAME_MSRP)
  private BigDecimal msrp;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_MARGIN = "margin";
  @SerializedName(SERIALIZED_NAME_MARGIN)
  private BigDecimal margin;

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner() {
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner currencyCode(String currencyCode) {
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


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the line item.
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner msrp(BigDecimal msrp) {
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


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner unitPrice(BigDecimal unitPrice) {
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


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner margin(BigDecimal margin) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner = (PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner) o;
    return Objects.equals(this.currencyCode, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.currencyCode) &&
        Objects.equals(this.quantity, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.quantity) &&
        Objects.equals(this.msrp, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.msrp) &&
        Objects.equals(this.unitPrice, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.unitPrice) &&
        Objects.equals(this.margin, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.margin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, quantity, msrp, unitPrice, margin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    msrp: ").append(toIndentedString(msrp)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
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
    openapiFields.add("quantity");
    openapiFields.add("msrp");
    openapiFields.add("unitPrice");
    openapiFields.add("margin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner
   */
  public static PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInnerVolumeDiscountsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

