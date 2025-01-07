/*
 * XI Sdk Resellers
 * For Resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
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
import xiresellers.client.model.OrderCreateV7ResponseResource;

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
 * OrderCreateV7Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T05:01:51.614791330Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderCreateV7Response {
  public static final String SERIALIZED_NAME_TOPIC = "topic";
  @SerializedName(SERIALIZED_NAME_TOPIC)
  @javax.annotation.Nullable
  private String topic;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  @javax.annotation.Nullable
  private String event;

  public static final String SERIALIZED_NAME_EVENT_TIME_STAMP = "eventTimeStamp";
  @SerializedName(SERIALIZED_NAME_EVENT_TIME_STAMP)
  @javax.annotation.Nullable
  private String eventTimeStamp;

  public static final String SERIALIZED_NAME_EVENT_ID = "eventId";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  @javax.annotation.Nullable
  private String eventId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  @javax.annotation.Nullable
  private String eventType;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  @javax.annotation.Nullable
  private OrderCreateV7ResponseResource resource;

  public OrderCreateV7Response() {
  }

  public OrderCreateV7Response topic(@javax.annotation.Nullable String topic) {
    this.topic = topic;
    return this;
  }

  /**
   * Field for identifying whether it is a reseller or vendor event. For eg, resellers/orders
   * @return topic
   */
  @javax.annotation.Nullable
  public String getTopic() {
    return topic;
  }

  public void setTopic(@javax.annotation.Nullable String topic) {
    this.topic = topic;
  }


  public OrderCreateV7Response event(@javax.annotation.Nullable String event) {
    this.event = event;
    return this;
  }

  /**
   * The event sent in the request. For eg, im::create.
   * @return event
   */
  @javax.annotation.Nullable
  public String getEvent() {
    return event;
  }

  public void setEvent(@javax.annotation.Nullable String event) {
    this.event = event;
  }


  public OrderCreateV7Response eventTimeStamp(@javax.annotation.Nullable String eventTimeStamp) {
    this.eventTimeStamp = eventTimeStamp;
    return this;
  }

  /**
   * The timestamp at which the event was sent.
   * @return eventTimeStamp
   */
  @javax.annotation.Nullable
  public String getEventTimeStamp() {
    return eventTimeStamp;
  }

  public void setEventTimeStamp(@javax.annotation.Nullable String eventTimeStamp) {
    this.eventTimeStamp = eventTimeStamp;
  }


  public OrderCreateV7Response eventId(@javax.annotation.Nullable String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * A unique id used as identifier for the sepcific event and used for generating the x-hub signature.
   * @return eventId
   */
  @javax.annotation.Nullable
  public String getEventId() {
    return eventId;
  }

  public void setEventId(@javax.annotation.Nullable String eventId) {
    this.eventId = eventId;
  }


  public OrderCreateV7Response eventType(@javax.annotation.Nullable String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The event name sent in the event request.
   * @return eventType
   */
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }

  public void setEventType(@javax.annotation.Nullable String eventType) {
    this.eventType = eventType;
  }


  public OrderCreateV7Response resource(@javax.annotation.Nullable OrderCreateV7ResponseResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
   */
  @javax.annotation.Nullable
  public OrderCreateV7ResponseResource getResource() {
    return resource;
  }

  public void setResource(@javax.annotation.Nullable OrderCreateV7ResponseResource resource) {
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
    OrderCreateV7Response orderCreateV7Response = (OrderCreateV7Response) o;
    return Objects.equals(this.topic, orderCreateV7Response.topic) &&
        Objects.equals(this.event, orderCreateV7Response.event) &&
        Objects.equals(this.eventTimeStamp, orderCreateV7Response.eventTimeStamp) &&
        Objects.equals(this.eventId, orderCreateV7Response.eventId) &&
        Objects.equals(this.eventType, orderCreateV7Response.eventType) &&
        Objects.equals(this.resource, orderCreateV7Response.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, event, eventTimeStamp, eventId, eventType, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7Response {\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    eventTimeStamp: ").append(toIndentedString(eventTimeStamp)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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
    openapiFields.add("eventType");
    openapiFields.add("resource");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7Response is not found in the empty JSON string", OrderCreateV7Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      // validate the optional field `resource`
      if (jsonObj.get("resource") != null && !jsonObj.get("resource").isJsonNull()) {
        OrderCreateV7ResponseResource.validateJsonElement(jsonObj.get("resource"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7Response.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7Response>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7Response
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7Response
   */
  public static OrderCreateV7Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7Response.class);
  }

  /**
   * Convert an instance of OrderCreateV7Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

