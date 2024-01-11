/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.client.model.MultiSKUPriceAndStockRequestServicerequestPriceandstockrequest;
import org.openapitools.client.model.MultiSKUPriceAndStockRequestServicerequestRequestpreamble;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * MultiSKUPriceAndStockRequestServicerequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class MultiSKUPriceAndStockRequestServicerequest {
  public static final String SERIALIZED_NAME_REQUESTPREAMBLE = "requestpreamble";
  @SerializedName(SERIALIZED_NAME_REQUESTPREAMBLE)
  private MultiSKUPriceAndStockRequestServicerequestRequestpreamble requestpreamble;

  public static final String SERIALIZED_NAME_PRICEANDSTOCKREQUEST = "priceandstockrequest";
  @SerializedName(SERIALIZED_NAME_PRICEANDSTOCKREQUEST)
  private MultiSKUPriceAndStockRequestServicerequestPriceandstockrequest priceandstockrequest;

  public MultiSKUPriceAndStockRequestServicerequest() {
  }

  public MultiSKUPriceAndStockRequestServicerequest requestpreamble(MultiSKUPriceAndStockRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
    return this;
  }

   /**
   * Get requestpreamble
   * @return requestpreamble
  **/
  @javax.annotation.Nullable
  public MultiSKUPriceAndStockRequestServicerequestRequestpreamble getRequestpreamble() {
    return requestpreamble;
  }

  public void setRequestpreamble(MultiSKUPriceAndStockRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
  }


  public MultiSKUPriceAndStockRequestServicerequest priceandstockrequest(MultiSKUPriceAndStockRequestServicerequestPriceandstockrequest priceandstockrequest) {
    this.priceandstockrequest = priceandstockrequest;
    return this;
  }

   /**
   * Get priceandstockrequest
   * @return priceandstockrequest
  **/
  @javax.annotation.Nullable
  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequest getPriceandstockrequest() {
    return priceandstockrequest;
  }

  public void setPriceandstockrequest(MultiSKUPriceAndStockRequestServicerequestPriceandstockrequest priceandstockrequest) {
    this.priceandstockrequest = priceandstockrequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiSKUPriceAndStockRequestServicerequest multiSKUPriceAndStockRequestServicerequest = (MultiSKUPriceAndStockRequestServicerequest) o;
    return Objects.equals(this.requestpreamble, multiSKUPriceAndStockRequestServicerequest.requestpreamble) &&
        Objects.equals(this.priceandstockrequest, multiSKUPriceAndStockRequestServicerequest.priceandstockrequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestpreamble, priceandstockrequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiSKUPriceAndStockRequestServicerequest {\n");
    sb.append("    requestpreamble: ").append(toIndentedString(requestpreamble)).append("\n");
    sb.append("    priceandstockrequest: ").append(toIndentedString(priceandstockrequest)).append("\n");
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
    openapiFields.add("requestpreamble");
    openapiFields.add("priceandstockrequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultiSKUPriceAndStockRequestServicerequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultiSKUPriceAndStockRequestServicerequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiSKUPriceAndStockRequestServicerequest is not found in the empty JSON string", MultiSKUPriceAndStockRequestServicerequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultiSKUPriceAndStockRequestServicerequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultiSKUPriceAndStockRequestServicerequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `requestpreamble`
      if (jsonObj.get("requestpreamble") != null && !jsonObj.get("requestpreamble").isJsonNull()) {
        MultiSKUPriceAndStockRequestServicerequestRequestpreamble.validateJsonElement(jsonObj.get("requestpreamble"));
      }
      // validate the optional field `priceandstockrequest`
      if (jsonObj.get("priceandstockrequest") != null && !jsonObj.get("priceandstockrequest").isJsonNull()) {
        MultiSKUPriceAndStockRequestServicerequestPriceandstockrequest.validateJsonElement(jsonObj.get("priceandstockrequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiSKUPriceAndStockRequestServicerequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiSKUPriceAndStockRequestServicerequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiSKUPriceAndStockRequestServicerequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiSKUPriceAndStockRequestServicerequest.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiSKUPriceAndStockRequestServicerequest>() {
           @Override
           public void write(JsonWriter out, MultiSKUPriceAndStockRequestServicerequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiSKUPriceAndStockRequestServicerequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultiSKUPriceAndStockRequestServicerequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultiSKUPriceAndStockRequestServicerequest
  * @throws IOException if the JSON string is invalid with respect to MultiSKUPriceAndStockRequestServicerequest
  */
  public static MultiSKUPriceAndStockRequestServicerequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiSKUPriceAndStockRequestServicerequest.class);
  }

 /**
  * Convert an instance of MultiSKUPriceAndStockRequestServicerequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

