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
 * OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T10:02:29.305984Z[Etc/UTC]")
public class OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner {
  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner() {
  }

  public OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * For orders or invoices. For orders the link provides details of the order. For invoices the link provides details of the invoice.
   * @return topic
  **/
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The URL endpoint for accessing the relevant data.
   * @return href
  **/
  @javax.annotation.Nullable
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of call that can be made to the href link (GET, POST, Etc.).
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner orderSearchResponseOrdersInnerSubOrdersInnerLinksInner = (OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner) o;
    return Objects.equals(this.topic, orderSearchResponseOrdersInnerSubOrdersInnerLinksInner.topic) &&
        Objects.equals(this.href, orderSearchResponseOrdersInnerSubOrdersInnerLinksInner.href) &&
        Objects.equals(this.type, orderSearchResponseOrdersInnerSubOrdersInnerLinksInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, href, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner {\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("topic");
    openapiFields.add("href");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner is not found in the empty JSON string", OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("topic") != null && !jsonObj.get("topic").isJsonNull()) && !jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner>() {
           @Override
           public void write(JsonWriter out, OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner
  * @throws IOException if the JSON string is invalid with respect to OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner
  */
  public static OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.class);
  }

 /**
  * Convert an instance of OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

