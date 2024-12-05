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
 * Vendor mandatory fields, this is required in case of warranty orders.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-05T05:54:00.257688Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderCreateRequestVmf {
  public static final String SERIALIZED_NAME_VEND_AUTH_NUMBER = "vendAuthNumber";
  @SerializedName(SERIALIZED_NAME_VEND_AUTH_NUMBER)
  @javax.annotation.Nullable
  private String vendAuthNumber;

  public OrderCreateRequestVmf() {
  }

  public OrderCreateRequestVmf vendAuthNumber(@javax.annotation.Nullable String vendAuthNumber) {
    this.vendAuthNumber = vendAuthNumber;
    return this;
  }

  /**
   * Authorization number provided by vendor to Ingram&#39;s reseller. Orders will be placed on hold without this value, vendor specific mandatory field - please reach out Ingram Sales team for list of vendor for whom this is mandatory.
   * @return vendAuthNumber
   */
  @javax.annotation.Nullable
  public String getVendAuthNumber() {
    return vendAuthNumber;
  }

  public void setVendAuthNumber(@javax.annotation.Nullable String vendAuthNumber) {
    this.vendAuthNumber = vendAuthNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateRequestVmf orderCreateRequestVmf = (OrderCreateRequestVmf) o;
    return Objects.equals(this.vendAuthNumber, orderCreateRequestVmf.vendAuthNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendAuthNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRequestVmf {\n");
    sb.append("    vendAuthNumber: ").append(toIndentedString(vendAuthNumber)).append("\n");
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
    openapiFields.add("vendAuthNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateRequestVmf
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateRequestVmf.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateRequestVmf is not found in the empty JSON string", OrderCreateRequestVmf.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateRequestVmf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateRequestVmf` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("vendAuthNumber") != null && !jsonObj.get("vendAuthNumber").isJsonNull()) && !jsonObj.get("vendAuthNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendAuthNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendAuthNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRequestVmf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRequestVmf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRequestVmf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRequestVmf.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRequestVmf>() {
           @Override
           public void write(JsonWriter out, OrderCreateRequestVmf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRequestVmf read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateRequestVmf given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateRequestVmf
   * @throws IOException if the JSON string is invalid with respect to OrderCreateRequestVmf
   */
  public static OrderCreateRequestVmf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRequestVmf.class);
  }

  /**
   * Convert an instance of OrderCreateRequestVmf to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

