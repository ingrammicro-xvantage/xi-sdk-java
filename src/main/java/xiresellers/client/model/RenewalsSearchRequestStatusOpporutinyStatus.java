/*
 * XI Sdk Resellers
 * For Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * RenewalsSearchRequestStatusOpporutinyStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T11:34:45.471304Z[Etc/UTC]")
public class RenewalsSearchRequestStatusOpporutinyStatus {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_SUB_STATUS = "subStatus";
  @SerializedName(SERIALIZED_NAME_SUB_STATUS)
  private String subStatus;

  public RenewalsSearchRequestStatusOpporutinyStatus() {
  }

  public RenewalsSearchRequestStatusOpporutinyStatus value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of opportunity status, it can be either Open or Closed.
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public RenewalsSearchRequestStatusOpporutinyStatus subStatus(String subStatus) {
    this.subStatus = subStatus;
    return this;
  }

   /**
   * The sub-status of Opportunity status. Possible sub-status values for Open opportunity status are Ready to order, Quote pending, Notification sent, Future, and Quote requested. Possible sub-status values for Closed opportunity status are All, Ordered, Quote closed-contract sales desk, Expired, Transition to new/upsell, Lost to competitior, Consolidated, Transitioned to cloud, Renewal went direct, EOL, End user out of business, Void, Other, and Cancelled.
   * @return subStatus
  **/
  @javax.annotation.Nullable
  public String getSubStatus() {
    return subStatus;
  }

  public void setSubStatus(String subStatus) {
    this.subStatus = subStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsSearchRequestStatusOpporutinyStatus renewalsSearchRequestStatusOpporutinyStatus = (RenewalsSearchRequestStatusOpporutinyStatus) o;
    return Objects.equals(this.value, renewalsSearchRequestStatusOpporutinyStatus.value) &&
        Objects.equals(this.subStatus, renewalsSearchRequestStatusOpporutinyStatus.subStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, subStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsSearchRequestStatusOpporutinyStatus {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("subStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RenewalsSearchRequestStatusOpporutinyStatus
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsSearchRequestStatusOpporutinyStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsSearchRequestStatusOpporutinyStatus is not found in the empty JSON string", RenewalsSearchRequestStatusOpporutinyStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsSearchRequestStatusOpporutinyStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsSearchRequestStatusOpporutinyStatus` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("subStatus") != null && !jsonObj.get("subStatus").isJsonNull()) && !jsonObj.get("subStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsSearchRequestStatusOpporutinyStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsSearchRequestStatusOpporutinyStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsSearchRequestStatusOpporutinyStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsSearchRequestStatusOpporutinyStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsSearchRequestStatusOpporutinyStatus>() {
           @Override
           public void write(JsonWriter out, RenewalsSearchRequestStatusOpporutinyStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsSearchRequestStatusOpporutinyStatus read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RenewalsSearchRequestStatusOpporutinyStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RenewalsSearchRequestStatusOpporutinyStatus
  * @throws IOException if the JSON string is invalid with respect to RenewalsSearchRequestStatusOpporutinyStatus
  */
  public static RenewalsSearchRequestStatusOpporutinyStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsSearchRequestStatusOpporutinyStatus.class);
  }

 /**
  * Convert an instance of RenewalsSearchRequestStatusOpporutinyStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

