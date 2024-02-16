/*
 * XI SDK Resellers
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
 * InvoiceDetailResponseServiceresponseResponsepreamble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T05:46:16.662413Z[Etc/UTC]")
public class InvoiceDetailResponseServiceresponseResponsepreamble {
  public static final String SERIALIZED_NAME_RESPONSESTATUS = "responsestatus";
  @SerializedName(SERIALIZED_NAME_RESPONSESTATUS)
  private String responsestatus;

  public static final String SERIALIZED_NAME_STATUSCODE = "statuscode";
  @SerializedName(SERIALIZED_NAME_STATUSCODE)
  private String statuscode;

  public static final String SERIALIZED_NAME_RESPONSEMESSAGE = "responsemessage";
  @SerializedName(SERIALIZED_NAME_RESPONSEMESSAGE)
  private String responsemessage;

  public InvoiceDetailResponseServiceresponseResponsepreamble() {
  }

  public InvoiceDetailResponseServiceresponseResponsepreamble responsestatus(String responsestatus) {
    this.responsestatus = responsestatus;
    return this;
  }

   /**
   * Get responsestatus
   * @return responsestatus
  **/
  @javax.annotation.Nullable
  public String getResponsestatus() {
    return responsestatus;
  }

  public void setResponsestatus(String responsestatus) {
    this.responsestatus = responsestatus;
  }


  public InvoiceDetailResponseServiceresponseResponsepreamble statuscode(String statuscode) {
    this.statuscode = statuscode;
    return this;
  }

   /**
   * Get statuscode
   * @return statuscode
  **/
  @javax.annotation.Nullable
  public String getStatuscode() {
    return statuscode;
  }

  public void setStatuscode(String statuscode) {
    this.statuscode = statuscode;
  }


  public InvoiceDetailResponseServiceresponseResponsepreamble responsemessage(String responsemessage) {
    this.responsemessage = responsemessage;
    return this;
  }

   /**
   * Get responsemessage
   * @return responsemessage
  **/
  @javax.annotation.Nullable
  public String getResponsemessage() {
    return responsemessage;
  }

  public void setResponsemessage(String responsemessage) {
    this.responsemessage = responsemessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailResponseServiceresponseResponsepreamble invoiceDetailResponseServiceresponseResponsepreamble = (InvoiceDetailResponseServiceresponseResponsepreamble) o;
    return Objects.equals(this.responsestatus, invoiceDetailResponseServiceresponseResponsepreamble.responsestatus) &&
        Objects.equals(this.statuscode, invoiceDetailResponseServiceresponseResponsepreamble.statuscode) &&
        Objects.equals(this.responsemessage, invoiceDetailResponseServiceresponseResponsepreamble.responsemessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsestatus, statuscode, responsemessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailResponseServiceresponseResponsepreamble {\n");
    sb.append("    responsestatus: ").append(toIndentedString(responsestatus)).append("\n");
    sb.append("    statuscode: ").append(toIndentedString(statuscode)).append("\n");
    sb.append("    responsemessage: ").append(toIndentedString(responsemessage)).append("\n");
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
    openapiFields.add("responsestatus");
    openapiFields.add("statuscode");
    openapiFields.add("responsemessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailResponseServiceresponseResponsepreamble
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailResponseServiceresponseResponsepreamble.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailResponseServiceresponseResponsepreamble is not found in the empty JSON string", InvoiceDetailResponseServiceresponseResponsepreamble.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailResponseServiceresponseResponsepreamble.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailResponseServiceresponseResponsepreamble` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("responsestatus") != null && !jsonObj.get("responsestatus").isJsonNull()) && !jsonObj.get("responsestatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responsestatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responsestatus").toString()));
      }
      if ((jsonObj.get("statuscode") != null && !jsonObj.get("statuscode").isJsonNull()) && !jsonObj.get("statuscode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuscode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statuscode").toString()));
      }
      if ((jsonObj.get("responsemessage") != null && !jsonObj.get("responsemessage").isJsonNull()) && !jsonObj.get("responsemessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responsemessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responsemessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailResponseServiceresponseResponsepreamble.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailResponseServiceresponseResponsepreamble' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailResponseServiceresponseResponsepreamble> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailResponseServiceresponseResponsepreamble.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailResponseServiceresponseResponsepreamble>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailResponseServiceresponseResponsepreamble value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailResponseServiceresponseResponsepreamble read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailResponseServiceresponseResponsepreamble given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailResponseServiceresponseResponsepreamble
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailResponseServiceresponseResponsepreamble
  */
  public static InvoiceDetailResponseServiceresponseResponsepreamble fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailResponseServiceresponseResponsepreamble.class);
  }

 /**
  * Convert an instance of InvoiceDetailResponseServiceresponseResponsepreamble to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

