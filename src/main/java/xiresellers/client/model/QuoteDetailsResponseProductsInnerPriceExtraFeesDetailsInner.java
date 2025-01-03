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
 * QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T11:27:04.886246725Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner {
  public static final String SERIALIZED_NAME_EXTRA_FEES_DESCRIPTION = "extraFeesDescription";
  @SerializedName(SERIALIZED_NAME_EXTRA_FEES_DESCRIPTION)
  @javax.annotation.Nullable
  private String extraFeesDescription;

  public static final String SERIALIZED_NAME_EXTRA_FEES_AMOUNT = "extraFeesAmount";
  @SerializedName(SERIALIZED_NAME_EXTRA_FEES_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal extraFeesAmount;

  public QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner() {
  }

  public QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner extraFeesDescription(@javax.annotation.Nullable String extraFeesDescription) {
    this.extraFeesDescription = extraFeesDescription;
    return this;
  }

  /**
   * Get extraFeesDescription
   * @return extraFeesDescription
   */
  @javax.annotation.Nullable
  public String getExtraFeesDescription() {
    return extraFeesDescription;
  }

  public void setExtraFeesDescription(@javax.annotation.Nullable String extraFeesDescription) {
    this.extraFeesDescription = extraFeesDescription;
  }


  public QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner extraFeesAmount(@javax.annotation.Nullable BigDecimal extraFeesAmount) {
    this.extraFeesAmount = extraFeesAmount;
    return this;
  }

  /**
   * Get extraFeesAmount
   * @return extraFeesAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getExtraFeesAmount() {
    return extraFeesAmount;
  }

  public void setExtraFeesAmount(@javax.annotation.Nullable BigDecimal extraFeesAmount) {
    this.extraFeesAmount = extraFeesAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner quoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner = (QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner) o;
    return Objects.equals(this.extraFeesDescription, quoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.extraFeesDescription) &&
        Objects.equals(this.extraFeesAmount, quoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.extraFeesAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraFeesDescription, extraFeesAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner {\n");
    sb.append("    extraFeesDescription: ").append(toIndentedString(extraFeesDescription)).append("\n");
    sb.append("    extraFeesAmount: ").append(toIndentedString(extraFeesAmount)).append("\n");
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
    openapiFields.add("extraFeesDescription");
    openapiFields.add("extraFeesAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner is not found in the empty JSON string", QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("extraFeesDescription") != null && !jsonObj.get("extraFeesDescription").isJsonNull()) && !jsonObj.get("extraFeesDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extraFeesDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extraFeesDescription").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner
   * @throws IOException if the JSON string is invalid with respect to QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner
   */
  public static QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner.class);
  }

  /**
   * Convert an instance of QuoteDetailsResponseProductsInnerPriceExtraFeesDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

