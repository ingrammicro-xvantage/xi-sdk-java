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
 * PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T10:15:50.038455601Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod {
  public static final String SERIALIZED_NAME_BILLING_PERIOD_UNIT = "billingPeriodUnit";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD_UNIT)
  @javax.annotation.Nullable
  private String billingPeriodUnit;

  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billingPeriod";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  @javax.annotation.Nullable
  private BigDecimal billingPeriod;

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod() {
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod billingPeriodUnit(@javax.annotation.Nullable String billingPeriodUnit) {
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

  public void setBillingPeriodUnit(@javax.annotation.Nullable String billingPeriodUnit) {
    this.billingPeriodUnit = billingPeriodUnit;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod billingPeriod(@javax.annotation.Nullable BigDecimal billingPeriod) {
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

  public void setBillingPeriod(@javax.annotation.Nullable BigDecimal billingPeriod) {
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
    PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod priceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod = (PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod) o;
    return Objects.equals(this.billingPeriodUnit, priceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.billingPeriodUnit) &&
        Objects.equals(this.billingPeriod, priceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.billingPeriod);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPeriodUnit, billingPeriod);
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
    sb.append("class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod is not found in the empty JSON string", PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod
   */
  public static PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

