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
 * ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T17:12:54.690986034Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_PERIOD_UNIT = "subscriptionPeriodUnit";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PERIOD_UNIT)
  @javax.annotation.Nullable
  private String subscriptionPeriodUnit;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PERIOD = "subscriptionPeriod";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PERIOD)
  @javax.annotation.Nullable
  private Integer subscriptionPeriod;

  public ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner() {
  }

  public ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner subscriptionPeriodUnit(@javax.annotation.Nullable String subscriptionPeriodUnit) {
    this.subscriptionPeriodUnit = subscriptionPeriodUnit;
    return this;
  }

  /**
   * Unit period of the subscription. Example, Years, Months
   * @return subscriptionPeriodUnit
   */
  @javax.annotation.Nullable
  public String getSubscriptionPeriodUnit() {
    return subscriptionPeriodUnit;
  }

  public void setSubscriptionPeriodUnit(@javax.annotation.Nullable String subscriptionPeriodUnit) {
    this.subscriptionPeriodUnit = subscriptionPeriodUnit;
  }


  public ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner subscriptionPeriod(@javax.annotation.Nullable Integer subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
    return this;
  }

  /**
   * Length of the subscription. Example 1, 3
   * @return subscriptionPeriod
   */
  @javax.annotation.Nullable
  public Integer getSubscriptionPeriod() {
    return subscriptionPeriod;
  }

  public void setSubscriptionPeriod(@javax.annotation.Nullable Integer subscriptionPeriod) {
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
    ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner productDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner = (ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner) o;
    return Objects.equals(this.subscriptionPeriodUnit, productDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.subscriptionPeriodUnit) &&
        Objects.equals(this.subscriptionPeriod, productDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.subscriptionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionPeriodUnit, subscriptionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner {\n");
    sb.append("    subscriptionPeriodUnit: ").append(toIndentedString(subscriptionPeriodUnit)).append("\n");
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
    openapiFields.add("subscriptionPeriodUnit");
    openapiFields.add("subscriptionPeriod");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner is not found in the empty JSON string", ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subscriptionPeriodUnit") != null && !jsonObj.get("subscriptionPeriodUnit").isJsonNull()) && !jsonObj.get("subscriptionPeriodUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionPeriodUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionPeriodUnit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner
   * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner
   */
  public static ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.class);
  }

  /**
   * Convert an instance of ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

