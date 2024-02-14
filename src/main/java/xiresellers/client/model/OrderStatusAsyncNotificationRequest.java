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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInner;

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
 * OrderStatusAsyncNotificationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class OrderStatusAsyncNotificationRequest {
  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  private String topic;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event;

  public static final String SERIALIZED_NAME_EVENT_TIME_STAMP = "eventTimeStamp";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME_STAMP)
  private String eventTimeStamp;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private List<OrderStatusAsyncNotificationRequestResourceInner> resource;

  public OrderStatusAsyncNotificationRequest() {
  }

  public OrderStatusAsyncNotificationRequest topic(String topic) {
    this.topic = topic;
    return this;
  }

   /**
   * Field for identifying whether it is a reseller or vendor event. For eg, resellers/orders
   * @return topic
  **/
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }


  public OrderStatusAsyncNotificationRequest event(String event) {
    this.event = event;
    return this;
  }

   /**
   * The event sent in the request. For eg, im::create.
   * @return event
  **/
  @javax.annotation.Nullable
  public String getEvent() {
    return event;
  }

  public void setEvent(String event) {
    this.event = event;
  }


  public OrderStatusAsyncNotificationRequest eventTimeStamp(String eventTimeStamp) {
    this.eventTimeStamp = eventTimeStamp;
    return this;
  }

   /**
   * The timestamp at which the event was sent.
   * @return eventTimeStamp
  **/
  @javax.annotation.Nullable
  public String getEventTimeStamp() {
    return eventTimeStamp;
  }

  public void setEventTimeStamp(String eventTimeStamp) {
    this.eventTimeStamp = eventTimeStamp;
  }


  public OrderStatusAsyncNotificationRequest eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * A unique id used as identifier for the sepcific event and used for generating the x-hub signature.
   * @return eventId
  **/
  @javax.annotation.Nullable
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  public OrderStatusAsyncNotificationRequest resource(List<OrderStatusAsyncNotificationRequestResourceInner> resource) {
    this.resource = resource;
    return this;
  }

  public OrderStatusAsyncNotificationRequest addResourceItem(OrderStatusAsyncNotificationRequestResourceInner resourceItem) {
    if (this.resource == null) {
      this.resource = new ArrayList<>();
    }
    this.resource.add(resourceItem);
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  public List<OrderStatusAsyncNotificationRequestResourceInner> getResource() {
    return resource;
  }

  public void setResource(List<OrderStatusAsyncNotificationRequestResourceInner> resource) {
    this.resource = resource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest = (OrderStatusAsyncNotificationRequest) o;
    return Objects.equals(this.topic, orderStatusAsyncNotificationRequest.topic) &&
        Objects.equals(this.event, orderStatusAsyncNotificationRequest.event) &&
        Objects.equals(this.eventTimeStamp, orderStatusAsyncNotificationRequest.eventTimeStamp) &&
        Objects.equals(this.eventId, orderStatusAsyncNotificationRequest.eventId) &&
        Objects.equals(this.resource, orderStatusAsyncNotificationRequest.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, event, eventTimeStamp, eventId, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusAsyncNotificationRequest {\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventTimeStamp: ").append(toIndentedString(eventTimeStamp)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
    openapiFields.add("event");
    openapiFields.add("eventTimeStamp");
    openapiFields.add("eventId");
    openapiFields.add("resource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderStatusAsyncNotificationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderStatusAsyncNotificationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderStatusAsyncNotificationRequest is not found in the empty JSON string", OrderStatusAsyncNotificationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderStatusAsyncNotificationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderStatusAsyncNotificationRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("topic") != null && !jsonObj.get("topic").isJsonNull()) && !jsonObj.get("topic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic").toString()));
      }
      if ((jsonObj.get("event") != null && !jsonObj.get("event").isJsonNull()) && !jsonObj.get("event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event").toString()));
      }
      if ((jsonObj.get("eventTimeStamp") != null && !jsonObj.get("eventTimeStamp").isJsonNull()) && !jsonObj.get("eventTimeStamp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventTimeStamp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventTimeStamp").toString()));
      }
      if ((jsonObj.get("eventId") != null && !jsonObj.get("eventId").isJsonNull()) && !jsonObj.get("eventId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventId").toString()));
      }
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        JsonArray jsonArrayresource = jsonObj.getAsJsonArray("resource");
        if (jsonArrayresource != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resource").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resource` to be an array in the JSON string but got `%s`", jsonObj.get("resource").toString()));
          }

          // validate the optional field `resource` (array)
          for (int i = 0; i < jsonArrayresource.size(); i++) {
            OrderStatusAsyncNotificationRequestResourceInner.validateJsonElement(jsonArrayresource.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderStatusAsyncNotificationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderStatusAsyncNotificationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderStatusAsyncNotificationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderStatusAsyncNotificationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderStatusAsyncNotificationRequest>() {
           @Override
           public void write(JsonWriter out, OrderStatusAsyncNotificationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderStatusAsyncNotificationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderStatusAsyncNotificationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderStatusAsyncNotificationRequest
  * @throws IOException if the JSON string is invalid with respect to OrderStatusAsyncNotificationRequest
  */
  public static OrderStatusAsyncNotificationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderStatusAsyncNotificationRequest.class);
  }

 /**
  * Convert an instance of OrderStatusAsyncNotificationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

