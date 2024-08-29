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
import xiresellers.client.model.RenewalsSearchRequestStatusOpporutinyStatus;

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
 * RenewalsSearchRequestStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T17:32:11.198732Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RenewalsSearchRequestStatus {
  public static final String SERIALIZED_NAME_OPPORUTINY_STATUS = "OpporutinyStatus";
  @SerializedName(SERIALIZED_NAME_OPPORUTINY_STATUS)
  private RenewalsSearchRequestStatusOpporutinyStatus opporutinyStatus;

  public RenewalsSearchRequestStatus() {
  }

  public RenewalsSearchRequestStatus opporutinyStatus(RenewalsSearchRequestStatusOpporutinyStatus opporutinyStatus) {
    this.opporutinyStatus = opporutinyStatus;
    return this;
  }

  /**
   * Get opporutinyStatus
   * @return opporutinyStatus
   */
  @javax.annotation.Nullable
  public RenewalsSearchRequestStatusOpporutinyStatus getOpporutinyStatus() {
    return opporutinyStatus;
  }

  public void setOpporutinyStatus(RenewalsSearchRequestStatusOpporutinyStatus opporutinyStatus) {
    this.opporutinyStatus = opporutinyStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsSearchRequestStatus renewalsSearchRequestStatus = (RenewalsSearchRequestStatus) o;
    return Objects.equals(this.opporutinyStatus, renewalsSearchRequestStatus.opporutinyStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opporutinyStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsSearchRequestStatus {\n");
    sb.append("    opporutinyStatus: ").append(toIndentedString(opporutinyStatus)).append("\n");
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
    openapiFields.add("OpporutinyStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenewalsSearchRequestStatus
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsSearchRequestStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsSearchRequestStatus is not found in the empty JSON string", RenewalsSearchRequestStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsSearchRequestStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsSearchRequestStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `OpporutinyStatus`
      if (jsonObj.get("OpporutinyStatus") != null && !jsonObj.get("OpporutinyStatus").isJsonNull()) {
        RenewalsSearchRequestStatusOpporutinyStatus.validateJsonElement(jsonObj.get("OpporutinyStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsSearchRequestStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsSearchRequestStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsSearchRequestStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsSearchRequestStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsSearchRequestStatus>() {
           @Override
           public void write(JsonWriter out, RenewalsSearchRequestStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsSearchRequestStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenewalsSearchRequestStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenewalsSearchRequestStatus
   * @throws IOException if the JSON string is invalid with respect to RenewalsSearchRequestStatus
   */
  public static RenewalsSearchRequestStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsSearchRequestStatus.class);
  }

  /**
   * Convert an instance of RenewalsSearchRequestStatus to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

