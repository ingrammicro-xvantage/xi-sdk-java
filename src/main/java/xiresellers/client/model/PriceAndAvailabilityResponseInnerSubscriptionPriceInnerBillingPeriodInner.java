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
 * PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T09:22:48.202953Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner {
  public static final String SERIALIZED_NAME_BILLING_PERIOD_UNIT = "billingPeriodUnit";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD_UNIT)
  private String billingPeriodUnit;

  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billingPeriod";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  private BigDecimal billingPeriod;

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner() {
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner billingPeriodUnit(String billingPeriodUnit) {
    this.billingPeriodUnit = billingPeriodUnit;
    return this;
  }

  /**
   * The unit of the billing period.
   * @return billingPeriodUnit
   */
  @javax.annotation.Nullable
  public String getBillingPeriodUnit() {
    return billingPeriodUnit;
  }

  public void setBillingPeriodUnit(String billingPeriodUnit) {
    this.billingPeriodUnit = billingPeriodUnit;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner billingPeriod(BigDecimal billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * The billing period value.
   * @return billingPeriod
   */
  @javax.annotation.Nullable
  public BigDecimal getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(BigDecimal billingPeriod) {
    this.billingPeriod = billingPeriod;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner priceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner = (PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner) o;
    return Objects.equals(this.billingPeriodUnit, priceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.billingPeriodUnit) &&
        Objects.equals(this.billingPeriod, priceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.billingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPeriodUnit, billingPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner {\n");
    sb.append("    billingPeriodUnit: ").append(toIndentedString(billingPeriodUnit)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
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
    openapiFields.add("billingPeriodUnit");
    openapiFields.add("billingPeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("billingPeriodUnit") != null && !jsonObj.get("billingPeriodUnit").isJsonNull()) && !jsonObj.get("billingPeriodUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingPeriodUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingPeriodUnit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner
   */
  public static PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriodInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

