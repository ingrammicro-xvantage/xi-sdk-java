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
 * QuoteDetailsResponseProductsInnerBillDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-05T05:54:00.257688Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class QuoteDetailsResponseProductsInnerBillDetailsInner {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  @javax.annotation.Nullable
  private String unit;

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  @javax.annotation.Nullable
  private Integer frequency;

  public static final String SERIALIZED_NAME_UNIT_VALUE = "unitValue";
  @SerializedName(SERIALIZED_NAME_UNIT_VALUE)
  @javax.annotation.Nullable
  private String unitValue;

  public QuoteDetailsResponseProductsInnerBillDetailsInner() {
  }

  public QuoteDetailsResponseProductsInnerBillDetailsInner type(@javax.annotation.Nullable String type) {
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

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public QuoteDetailsResponseProductsInnerBillDetailsInner unit(@javax.annotation.Nullable String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Get unit
   * @return unit
   */
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }

  public void setUnit(@javax.annotation.Nullable String unit) {
    this.unit = unit;
  }


  public QuoteDetailsResponseProductsInnerBillDetailsInner frequency(@javax.annotation.Nullable Integer frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
   */
  @javax.annotation.Nullable
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(@javax.annotation.Nullable Integer frequency) {
    this.frequency = frequency;
  }


  public QuoteDetailsResponseProductsInnerBillDetailsInner unitValue(@javax.annotation.Nullable String unitValue) {
    this.unitValue = unitValue;
    return this;
  }

  /**
   * Get unitValue
   * @return unitValue
   */
  @javax.annotation.Nullable
  public String getUnitValue() {
    return unitValue;
  }

  public void setUnitValue(@javax.annotation.Nullable String unitValue) {
    this.unitValue = unitValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsResponseProductsInnerBillDetailsInner quoteDetailsResponseProductsInnerBillDetailsInner = (QuoteDetailsResponseProductsInnerBillDetailsInner) o;
    return Objects.equals(this.type, quoteDetailsResponseProductsInnerBillDetailsInner.type) &&
        Objects.equals(this.unit, quoteDetailsResponseProductsInnerBillDetailsInner.unit) &&
        Objects.equals(this.frequency, quoteDetailsResponseProductsInnerBillDetailsInner.frequency) &&
        Objects.equals(this.unitValue, quoteDetailsResponseProductsInnerBillDetailsInner.unitValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, unit, frequency, unitValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsResponseProductsInnerBillDetailsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    unitValue: ").append(toIndentedString(unitValue)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("unit");
    openapiFields.add("frequency");
    openapiFields.add("unitValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsResponseProductsInnerBillDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsResponseProductsInnerBillDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsResponseProductsInnerBillDetailsInner is not found in the empty JSON string", QuoteDetailsResponseProductsInnerBillDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsResponseProductsInnerBillDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsResponseProductsInnerBillDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("unit") != null && !jsonObj.get("unit").isJsonNull()) && !jsonObj.get("unit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit").toString()));
      }
      if ((jsonObj.get("unitValue") != null && !jsonObj.get("unitValue").isJsonNull()) && !jsonObj.get("unitValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsResponseProductsInnerBillDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsResponseProductsInnerBillDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsResponseProductsInnerBillDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsResponseProductsInnerBillDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsResponseProductsInnerBillDetailsInner>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsResponseProductsInnerBillDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsResponseProductsInnerBillDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuoteDetailsResponseProductsInnerBillDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuoteDetailsResponseProductsInnerBillDetailsInner
   * @throws IOException if the JSON string is invalid with respect to QuoteDetailsResponseProductsInnerBillDetailsInner
   */
  public static QuoteDetailsResponseProductsInnerBillDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsResponseProductsInnerBillDetailsInner.class);
  }

  /**
   * Convert an instance of QuoteDetailsResponseProductsInnerBillDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

