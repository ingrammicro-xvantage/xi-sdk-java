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
 * GetAccesstoken500ResponseFaultDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T04:46:41.573902Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetAccesstoken500ResponseFaultDetail {
  public static final String SERIALIZED_NAME_ERRORCODE = "errorcode";
  @SerializedName(SERIALIZED_NAME_ERRORCODE)
  private String errorcode;

  public GetAccesstoken500ResponseFaultDetail() {
  }

  public GetAccesstoken500ResponseFaultDetail errorcode(String errorcode) {
    this.errorcode = errorcode;
    return this;
  }

  /**
   * Get errorcode
   * @return errorcode
   */
  @javax.annotation.Nullable
  public String getErrorcode() {
    return errorcode;
  }

  public void setErrorcode(String errorcode) {
    this.errorcode = errorcode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccesstoken500ResponseFaultDetail getAccesstoken500ResponseFaultDetail = (GetAccesstoken500ResponseFaultDetail) o;
    return Objects.equals(this.errorcode, getAccesstoken500ResponseFaultDetail.errorcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccesstoken500ResponseFaultDetail {\n");
    sb.append("    errorcode: ").append(toIndentedString(errorcode)).append("\n");
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
    openapiFields.add("errorcode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAccesstoken500ResponseFaultDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAccesstoken500ResponseFaultDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccesstoken500ResponseFaultDetail is not found in the empty JSON string", GetAccesstoken500ResponseFaultDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAccesstoken500ResponseFaultDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAccesstoken500ResponseFaultDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("errorcode") != null && !jsonObj.get("errorcode").isJsonNull()) && !jsonObj.get("errorcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorcode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccesstoken500ResponseFaultDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccesstoken500ResponseFaultDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccesstoken500ResponseFaultDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccesstoken500ResponseFaultDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccesstoken500ResponseFaultDetail>() {
           @Override
           public void write(JsonWriter out, GetAccesstoken500ResponseFaultDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAccesstoken500ResponseFaultDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAccesstoken500ResponseFaultDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAccesstoken500ResponseFaultDetail
   * @throws IOException if the JSON string is invalid with respect to GetAccesstoken500ResponseFaultDetail
   */
  public static GetAccesstoken500ResponseFaultDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccesstoken500ResponseFaultDetail.class);
  }

  /**
   * Convert an instance of GetAccesstoken500ResponseFaultDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

