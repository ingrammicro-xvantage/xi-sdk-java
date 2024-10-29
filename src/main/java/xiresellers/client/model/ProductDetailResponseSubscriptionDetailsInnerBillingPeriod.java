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
 * Details of the subscription billing period. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T04:46:41.573902Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductDetailResponseSubscriptionDetailsInnerBillingPeriod {
  public static final String SERIALIZED_NAME_BILLING_PERIOD_UNIT = "billingPeriodUnit";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD_UNIT)
  private String billingPeriodUnit;

  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billingPeriod";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  private Integer billingPeriod;

  public ProductDetailResponseSubscriptionDetailsInnerBillingPeriod() {
  }

  public ProductDetailResponseSubscriptionDetailsInnerBillingPeriod billingPeriodUnit(String billingPeriodUnit) {
    this.billingPeriodUnit = billingPeriodUnit;
    return this;
  }

  /**
   * Billing unit period of the subscription. Example, Years, Months
   * @return billingPeriodUnit
   */
  @javax.annotation.Nullable
  public String getBillingPeriodUnit() {
    return billingPeriodUnit;
  }

  public void setBillingPeriodUnit(String billingPeriodUnit) {
    this.billingPeriodUnit = billingPeriodUnit;
  }


  public ProductDetailResponseSubscriptionDetailsInnerBillingPeriod billingPeriod(Integer billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * Billing period of the subscription. Example 1, 3
   * @return billingPeriod
   */
  @javax.annotation.Nullable
  public Integer getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(Integer billingPeriod) {
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
    ProductDetailResponseSubscriptionDetailsInnerBillingPeriod productDetailResponseSubscriptionDetailsInnerBillingPeriod = (ProductDetailResponseSubscriptionDetailsInnerBillingPeriod) o;
    return Objects.equals(this.billingPeriodUnit, productDetailResponseSubscriptionDetailsInnerBillingPeriod.billingPeriodUnit) &&
        Objects.equals(this.billingPeriod, productDetailResponseSubscriptionDetailsInnerBillingPeriod.billingPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPeriodUnit, billingPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseSubscriptionDetailsInnerBillingPeriod {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseSubscriptionDetailsInnerBillingPeriod
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseSubscriptionDetailsInnerBillingPeriod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseSubscriptionDetailsInnerBillingPeriod is not found in the empty JSON string", ProductDetailResponseSubscriptionDetailsInnerBillingPeriod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseSubscriptionDetailsInnerBillingPeriod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseSubscriptionDetailsInnerBillingPeriod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!ProductDetailResponseSubscriptionDetailsInnerBillingPeriod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseSubscriptionDetailsInnerBillingPeriod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseSubscriptionDetailsInnerBillingPeriod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseSubscriptionDetailsInnerBillingPeriod.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseSubscriptionDetailsInnerBillingPeriod>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseSubscriptionDetailsInnerBillingPeriod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseSubscriptionDetailsInnerBillingPeriod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDetailResponseSubscriptionDetailsInnerBillingPeriod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDetailResponseSubscriptionDetailsInnerBillingPeriod
   * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseSubscriptionDetailsInnerBillingPeriod
   */
  public static ProductDetailResponseSubscriptionDetailsInnerBillingPeriod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseSubscriptionDetailsInnerBillingPeriod.class);
  }

  /**
   * Convert an instance of ProductDetailResponseSubscriptionDetailsInnerBillingPeriod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

