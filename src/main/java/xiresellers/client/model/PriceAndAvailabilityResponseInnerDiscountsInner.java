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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner;

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
 * PriceAndAvailabilityResponseInnerDiscountsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T09:55:14.296096519Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class PriceAndAvailabilityResponseInnerDiscountsInner {
  public static final String SERIALIZED_NAME_SPECIAL_PRICING = "specialPricing";
  @SerializedName(SERIALIZED_NAME_SPECIAL_PRICING)
  @javax.annotation.Nullable
  private List<PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner> specialPricing = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUANTITY_DISCOUNTS = "quantityDiscounts";
  @SerializedName(SERIALIZED_NAME_QUANTITY_DISCOUNTS)
  @javax.annotation.Nullable
  private List<PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner> quantityDiscounts;

  public PriceAndAvailabilityResponseInnerDiscountsInner() {
  }

  public PriceAndAvailabilityResponseInnerDiscountsInner specialPricing(@javax.annotation.Nullable List<PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner> specialPricing) {
    this.specialPricing = specialPricing;
    return this;
  }

  public PriceAndAvailabilityResponseInnerDiscountsInner addSpecialPricingItem(PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner specialPricingItem) {
    if (this.specialPricing == null) {
      this.specialPricing = new ArrayList<>();
    }
    this.specialPricing.add(specialPricingItem);
    return this;
  }

  /**
   * Get specialPricing
   * @return specialPricing
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner> getSpecialPricing() {
    return specialPricing;
  }

  public void setSpecialPricing(@javax.annotation.Nullable List<PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner> specialPricing) {
    this.specialPricing = specialPricing;
  }


  public PriceAndAvailabilityResponseInnerDiscountsInner quantityDiscounts(@javax.annotation.Nullable List<PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner> quantityDiscounts) {
    this.quantityDiscounts = quantityDiscounts;
    return this;
  }

  public PriceAndAvailabilityResponseInnerDiscountsInner addQuantityDiscountsItem(PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner quantityDiscountsItem) {
    if (this.quantityDiscounts == null) {
      this.quantityDiscounts = new ArrayList<>();
    }
    this.quantityDiscounts.add(quantityDiscountsItem);
    return this;
  }

  /**
   * Get quantityDiscounts
   * @return quantityDiscounts
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner> getQuantityDiscounts() {
    return quantityDiscounts;
  }

  public void setQuantityDiscounts(@javax.annotation.Nullable List<PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner> quantityDiscounts) {
    this.quantityDiscounts = quantityDiscounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerDiscountsInner priceAndAvailabilityResponseInnerDiscountsInner = (PriceAndAvailabilityResponseInnerDiscountsInner) o;
    return Objects.equals(this.specialPricing, priceAndAvailabilityResponseInnerDiscountsInner.specialPricing) &&
        Objects.equals(this.quantityDiscounts, priceAndAvailabilityResponseInnerDiscountsInner.quantityDiscounts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialPricing, quantityDiscounts);
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
    sb.append("class PriceAndAvailabilityResponseInnerDiscountsInner {\n");
    sb.append("    specialPricing: ").append(toIndentedString(specialPricing)).append("\n");
    sb.append("    quantityDiscounts: ").append(toIndentedString(quantityDiscounts)).append("\n");
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
    openapiFields.add("specialPricing");
    openapiFields.add("quantityDiscounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerDiscountsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerDiscountsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerDiscountsInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerDiscountsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerDiscountsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerDiscountsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("specialPricing") != null && !jsonObj.get("specialPricing").isJsonNull()) {
        JsonArray jsonArrayspecialPricing = jsonObj.getAsJsonArray("specialPricing");
        if (jsonArrayspecialPricing != null) {
          // ensure the json data is an array
          if (!jsonObj.get("specialPricing").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `specialPricing` to be an array in the JSON string but got `%s`", jsonObj.get("specialPricing").toString()));
          }

          // validate the optional field `specialPricing` (array)
          for (int i = 0; i < jsonArrayspecialPricing.size(); i++) {
            PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.validateJsonElement(jsonArrayspecialPricing.get(i));
          };
        }
      }
      if (jsonObj.get("quantityDiscounts") != null && !jsonObj.get("quantityDiscounts").isJsonNull()) {
        JsonArray jsonArrayquantityDiscounts = jsonObj.getAsJsonArray("quantityDiscounts");
        if (jsonArrayquantityDiscounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("quantityDiscounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `quantityDiscounts` to be an array in the JSON string but got `%s`", jsonObj.get("quantityDiscounts").toString()));
          }

          // validate the optional field `quantityDiscounts` (array)
          for (int i = 0; i < jsonArrayquantityDiscounts.size(); i++) {
            PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.validateJsonElement(jsonArrayquantityDiscounts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerDiscountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerDiscountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerDiscountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerDiscountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerDiscountsInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerDiscountsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerDiscountsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerDiscountsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerDiscountsInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerDiscountsInner
   */
  public static PriceAndAvailabilityResponseInnerDiscountsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerDiscountsInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerDiscountsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

