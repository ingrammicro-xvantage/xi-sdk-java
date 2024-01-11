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
import org.openapitools.client.model.InvoiceDetailResponseServiceresponseInvoicedetailresponse;
import org.openapitools.client.model.InvoiceDetailResponseServiceresponseResponsepreamble;

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
 * InvoiceDetailResponseServiceresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class InvoiceDetailResponseServiceresponse {
  public static final String SERIALIZED_NAME_RESPONSEPREAMBLE = "responsepreamble";
  @SerializedName(SERIALIZED_NAME_RESPONSEPREAMBLE)
  private InvoiceDetailResponseServiceresponseResponsepreamble responsepreamble;

  public static final String SERIALIZED_NAME_INVOICEDETAILRESPONSE = "invoicedetailresponse";
  @SerializedName(SERIALIZED_NAME_INVOICEDETAILRESPONSE)
  private InvoiceDetailResponseServiceresponseInvoicedetailresponse invoicedetailresponse;

  public InvoiceDetailResponseServiceresponse() {
  }

  public InvoiceDetailResponseServiceresponse responsepreamble(InvoiceDetailResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
    return this;
  }

   /**
   * Get responsepreamble
   * @return responsepreamble
  **/
  @javax.annotation.Nullable
  public InvoiceDetailResponseServiceresponseResponsepreamble getResponsepreamble() {
    return responsepreamble;
  }

  public void setResponsepreamble(InvoiceDetailResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
  }


  public InvoiceDetailResponseServiceresponse invoicedetailresponse(InvoiceDetailResponseServiceresponseInvoicedetailresponse invoicedetailresponse) {
    this.invoicedetailresponse = invoicedetailresponse;
    return this;
  }

   /**
   * Get invoicedetailresponse
   * @return invoicedetailresponse
  **/
  @javax.annotation.Nullable
  public InvoiceDetailResponseServiceresponseInvoicedetailresponse getInvoicedetailresponse() {
    return invoicedetailresponse;
  }

  public void setInvoicedetailresponse(InvoiceDetailResponseServiceresponseInvoicedetailresponse invoicedetailresponse) {
    this.invoicedetailresponse = invoicedetailresponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailResponseServiceresponse invoiceDetailResponseServiceresponse = (InvoiceDetailResponseServiceresponse) o;
    return Objects.equals(this.responsepreamble, invoiceDetailResponseServiceresponse.responsepreamble) &&
        Objects.equals(this.invoicedetailresponse, invoiceDetailResponseServiceresponse.invoicedetailresponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsepreamble, invoicedetailresponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDetailResponseServiceresponse {\n");
    sb.append("    responsepreamble: ").append(toIndentedString(responsepreamble)).append("\n");
    sb.append("    invoicedetailresponse: ").append(toIndentedString(invoicedetailresponse)).append("\n");
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
    openapiFields.add("responsepreamble");
    openapiFields.add("invoicedetailresponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailResponseServiceresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailResponseServiceresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailResponseServiceresponse is not found in the empty JSON string", InvoiceDetailResponseServiceresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailResponseServiceresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailResponseServiceresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `responsepreamble`
      if (jsonObj.get("responsepreamble") != null && !jsonObj.get("responsepreamble").isJsonNull()) {
        InvoiceDetailResponseServiceresponseResponsepreamble.validateJsonElement(jsonObj.get("responsepreamble"));
      }
      // validate the optional field `invoicedetailresponse`
      if (jsonObj.get("invoicedetailresponse") != null && !jsonObj.get("invoicedetailresponse").isJsonNull()) {
        InvoiceDetailResponseServiceresponseInvoicedetailresponse.validateJsonElement(jsonObj.get("invoicedetailresponse"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailResponseServiceresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailResponseServiceresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailResponseServiceresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailResponseServiceresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailResponseServiceresponse>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailResponseServiceresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailResponseServiceresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailResponseServiceresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailResponseServiceresponse
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailResponseServiceresponse
  */
  public static InvoiceDetailResponseServiceresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailResponseServiceresponse.class);
  }

 /**
  * Convert an instance of InvoiceDetailResponseServiceresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

