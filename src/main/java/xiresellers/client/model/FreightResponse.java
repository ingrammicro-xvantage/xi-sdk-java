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
import xiresellers.client.model.FreightResponseFreightEstimateResponse;

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
 * FreightResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T05:16:26.828393Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FreightResponse {
  public static final String SERIALIZED_NAME_FREIGHT_ESTIMATE_RESPONSE = "freightEstimateResponse";
  @SerializedName(SERIALIZED_NAME_FREIGHT_ESTIMATE_RESPONSE)
  private FreightResponseFreightEstimateResponse freightEstimateResponse;

  public FreightResponse() {
  }

  public FreightResponse freightEstimateResponse(FreightResponseFreightEstimateResponse freightEstimateResponse) {
    this.freightEstimateResponse = freightEstimateResponse;
    return this;
  }

  /**
   * Get freightEstimateResponse
   * @return freightEstimateResponse
   */
  @javax.annotation.Nullable
  public FreightResponseFreightEstimateResponse getFreightEstimateResponse() {
    return freightEstimateResponse;
  }

  public void setFreightEstimateResponse(FreightResponseFreightEstimateResponse freightEstimateResponse) {
    this.freightEstimateResponse = freightEstimateResponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreightResponse freightResponse = (FreightResponse) o;
    return Objects.equals(this.freightEstimateResponse, freightResponse.freightEstimateResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freightEstimateResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreightResponse {\n");
    sb.append("    freightEstimateResponse: ").append(toIndentedString(freightEstimateResponse)).append("\n");
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
    openapiFields.add("freightEstimateResponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FreightResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreightResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreightResponse is not found in the empty JSON string", FreightResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreightResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreightResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `freightEstimateResponse`
      if (jsonObj.get("freightEstimateResponse") != null && !jsonObj.get("freightEstimateResponse").isJsonNull()) {
        FreightResponseFreightEstimateResponse.validateJsonElement(jsonObj.get("freightEstimateResponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreightResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreightResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreightResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreightResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FreightResponse>() {
           @Override
           public void write(JsonWriter out, FreightResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreightResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FreightResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FreightResponse
   * @throws IOException if the JSON string is invalid with respect to FreightResponse
   */
  public static FreightResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreightResponse.class);
  }

  /**
   * Convert an instance of FreightResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

