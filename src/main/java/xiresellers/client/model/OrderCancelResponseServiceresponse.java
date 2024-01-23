/*
 * Reseller API
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
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
import xiresellers.client.model.OrderCancelResponseServiceresponseResponsepreamble;

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
 * OrderCancelResponseServiceresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T11:06:29.712836Z[Etc/UTC]")
public class OrderCancelResponseServiceresponse {
  public static final String SERIALIZED_NAME_RESPONSEPREAMBLE = "responsepreamble";
  @SerializedName(SERIALIZED_NAME_RESPONSEPREAMBLE)
  private OrderCancelResponseServiceresponseResponsepreamble responsepreamble;

  public OrderCancelResponseServiceresponse() {
  }

  public OrderCancelResponseServiceresponse responsepreamble(OrderCancelResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
    return this;
  }

   /**
   * Get responsepreamble
   * @return responsepreamble
  **/
  @javax.annotation.Nullable
  public OrderCancelResponseServiceresponseResponsepreamble getResponsepreamble() {
    return responsepreamble;
  }

  public void setResponsepreamble(OrderCancelResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCancelResponseServiceresponse orderCancelResponseServiceresponse = (OrderCancelResponseServiceresponse) o;
    return Objects.equals(this.responsepreamble, orderCancelResponseServiceresponse.responsepreamble);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsepreamble);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCancelResponseServiceresponse {\n");
    sb.append("    responsepreamble: ").append(toIndentedString(responsepreamble)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCancelResponseServiceresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCancelResponseServiceresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCancelResponseServiceresponse is not found in the empty JSON string", OrderCancelResponseServiceresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCancelResponseServiceresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCancelResponseServiceresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `responsepreamble`
      if (jsonObj.get("responsepreamble") != null && !jsonObj.get("responsepreamble").isJsonNull()) {
        OrderCancelResponseServiceresponseResponsepreamble.validateJsonElement(jsonObj.get("responsepreamble"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCancelResponseServiceresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCancelResponseServiceresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCancelResponseServiceresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCancelResponseServiceresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCancelResponseServiceresponse>() {
           @Override
           public void write(JsonWriter out, OrderCancelResponseServiceresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCancelResponseServiceresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCancelResponseServiceresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCancelResponseServiceresponse
  * @throws IOException if the JSON string is invalid with respect to OrderCancelResponseServiceresponse
  */
  public static OrderCancelResponseServiceresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCancelResponseServiceresponse.class);
  }

 /**
  * Convert an instance of OrderCancelResponseServiceresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

