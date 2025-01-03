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
 * PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T17:12:54.690986034Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner {
  public static final String SERIALIZED_NAME_QUANTITY_RESERVED = "quantityReserved";
  @SerializedName(SERIALIZED_NAME_QUANTITY_RESERVED)
  @javax.annotation.Nullable
  private Integer quantityReserved;

  public static final String SERIALIZED_NAME_QUANTITY_AVAILABLE = "quantityAvailable";
  @SerializedName(SERIALIZED_NAME_QUANTITY_AVAILABLE)
  @javax.annotation.Nullable
  private Integer quantityAvailable;

  public static final String SERIALIZED_NAME_EFFECTIVEDATE = "effectivedate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVEDATE)
  @javax.annotation.Nullable
  private String effectivedate;

  public static final String SERIALIZED_NAME_EXPIRYDATE = "expirydate";
  @SerializedName(SERIALIZED_NAME_EXPIRYDATE)
  @javax.annotation.Nullable
  private String expirydate;

  public PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner() {
  }

  public PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner quantityReserved(@javax.annotation.Nullable Integer quantityReserved) {
    this.quantityReserved = quantityReserved;
    return this;
  }

  /**
   * The quantity of the product reserved for the customer.
   * @return quantityReserved
   */
  @javax.annotation.Nullable
  public Integer getQuantityReserved() {
    return quantityReserved;
  }

  public void setQuantityReserved(@javax.annotation.Nullable Integer quantityReserved) {
    this.quantityReserved = quantityReserved;
  }


  public PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner quantityAvailable(@javax.annotation.Nullable Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
    return this;
  }

  /**
   * The availability of the product reserved.
   * @return quantityAvailable
   */
  @javax.annotation.Nullable
  public Integer getQuantityAvailable() {
    return quantityAvailable;
  }

  public void setQuantityAvailable(@javax.annotation.Nullable Integer quantityAvailable) {
    this.quantityAvailable = quantityAvailable;
  }


  public PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner effectivedate(@javax.annotation.Nullable String effectivedate) {
    this.effectivedate = effectivedate;
    return this;
  }

  /**
   * The reservation date for the product in UTC format.
   * @return effectivedate
   */
  @javax.annotation.Nullable
  public String getEffectivedate() {
    return effectivedate;
  }

  public void setEffectivedate(@javax.annotation.Nullable String effectivedate) {
    this.effectivedate = effectivedate;
  }


  public PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner expirydate(@javax.annotation.Nullable String expirydate) {
    this.expirydate = expirydate;
    return this;
  }

  /**
   * The expiration date for the reservation of the product in UTC format.
   * @return expirydate
   */
  @javax.annotation.Nullable
  public String getExpirydate() {
    return expirydate;
  }

  public void setExpirydate(@javax.annotation.Nullable String expirydate) {
    this.expirydate = expirydate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner priceAndAvailabilityResponseInnerReserveInventoryDetailsInner = (PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner) o;
    return Objects.equals(this.quantityReserved, priceAndAvailabilityResponseInnerReserveInventoryDetailsInner.quantityReserved) &&
        Objects.equals(this.quantityAvailable, priceAndAvailabilityResponseInnerReserveInventoryDetailsInner.quantityAvailable) &&
        Objects.equals(this.effectivedate, priceAndAvailabilityResponseInnerReserveInventoryDetailsInner.effectivedate) &&
        Objects.equals(this.expirydate, priceAndAvailabilityResponseInnerReserveInventoryDetailsInner.expirydate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantityReserved, quantityAvailable, effectivedate, expirydate);
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
    sb.append("class PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner {\n");
    sb.append("    quantityReserved: ").append(toIndentedString(quantityReserved)).append("\n");
    sb.append("    quantityAvailable: ").append(toIndentedString(quantityAvailable)).append("\n");
    sb.append("    effectivedate: ").append(toIndentedString(effectivedate)).append("\n");
    sb.append("    expirydate: ").append(toIndentedString(expirydate)).append("\n");
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
    openapiFields.add("quantityReserved");
    openapiFields.add("quantityAvailable");
    openapiFields.add("effectivedate");
    openapiFields.add("expirydate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("effectivedate") != null && !jsonObj.get("effectivedate").isJsonNull()) && !jsonObj.get("effectivedate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effectivedate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effectivedate").toString()));
      }
      if ((jsonObj.get("expirydate") != null && !jsonObj.get("expirydate").isJsonNull()) && !jsonObj.get("expirydate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirydate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirydate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner
   */
  public static PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

