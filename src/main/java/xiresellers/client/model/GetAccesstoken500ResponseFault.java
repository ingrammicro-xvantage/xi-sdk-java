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
import xiresellers.client.model.GetAccesstoken500ResponseFaultDetail;

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
 * GetAccesstoken500ResponseFault
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T11:27:04.886246725Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class GetAccesstoken500ResponseFault {
  public static final String SERIALIZED_NAME_FAULTSTRING = "faultstring";
  @SerializedName(SERIALIZED_NAME_FAULTSTRING)
  @javax.annotation.Nullable
  private String faultstring;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  @javax.annotation.Nullable
  private GetAccesstoken500ResponseFaultDetail detail;

  public GetAccesstoken500ResponseFault() {
  }

  public GetAccesstoken500ResponseFault faultstring(@javax.annotation.Nullable String faultstring) {
    this.faultstring = faultstring;
    return this;
  }

  /**
   * Get faultstring
   * @return faultstring
   */
  @javax.annotation.Nullable
  public String getFaultstring() {
    return faultstring;
  }

  public void setFaultstring(@javax.annotation.Nullable String faultstring) {
    this.faultstring = faultstring;
  }


  public GetAccesstoken500ResponseFault detail(@javax.annotation.Nullable GetAccesstoken500ResponseFaultDetail detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   * @return detail
   */
  @javax.annotation.Nullable
  public GetAccesstoken500ResponseFaultDetail getDetail() {
    return detail;
  }

  public void setDetail(@javax.annotation.Nullable GetAccesstoken500ResponseFaultDetail detail) {
    this.detail = detail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccesstoken500ResponseFault getAccesstoken500ResponseFault = (GetAccesstoken500ResponseFault) o;
    return Objects.equals(this.faultstring, getAccesstoken500ResponseFault.faultstring) &&
        Objects.equals(this.detail, getAccesstoken500ResponseFault.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faultstring, detail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccesstoken500ResponseFault {\n");
    sb.append("    faultstring: ").append(toIndentedString(faultstring)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
    openapiFields.add("faultstring");
    openapiFields.add("detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAccesstoken500ResponseFault
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAccesstoken500ResponseFault.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAccesstoken500ResponseFault is not found in the empty JSON string", GetAccesstoken500ResponseFault.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAccesstoken500ResponseFault.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAccesstoken500ResponseFault` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("faultstring") != null && !jsonObj.get("faultstring").isJsonNull()) && !jsonObj.get("faultstring").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `faultstring` to be a primitive type in the JSON string but got `%s`", jsonObj.get("faultstring").toString()));
      }
      // validate the optional field `detail`
      if (jsonObj.get("detail") != null && !jsonObj.get("detail").isJsonNull()) {
        GetAccesstoken500ResponseFaultDetail.validateJsonElement(jsonObj.get("detail"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAccesstoken500ResponseFault.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAccesstoken500ResponseFault' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAccesstoken500ResponseFault> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAccesstoken500ResponseFault.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAccesstoken500ResponseFault>() {
           @Override
           public void write(JsonWriter out, GetAccesstoken500ResponseFault value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAccesstoken500ResponseFault read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAccesstoken500ResponseFault given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAccesstoken500ResponseFault
   * @throws IOException if the JSON string is invalid with respect to GetAccesstoken500ResponseFault
   */
  public static GetAccesstoken500ResponseFault fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAccesstoken500ResponseFault.class);
  }

  /**
   * Convert an instance of GetAccesstoken500ResponseFault to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

