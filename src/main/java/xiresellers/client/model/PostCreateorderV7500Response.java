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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PostCreateorderV7500Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T09:22:48.202953Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PostCreateorderV7500Response {
  public static final String SERIALIZED_NAME_TRACEID = "traceid";
  @SerializedName(SERIALIZED_NAME_TRACEID)
  private String traceid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<Object> fields = new ArrayList<>();

  public PostCreateorderV7500Response() {
  }

  public PostCreateorderV7500Response traceid(String traceid) {
    this.traceid = traceid;
    return this;
  }

  /**
   * Unique Id to identify error.
   * @return traceid
   */
  @javax.annotation.Nullable
  public String getTraceid() {
    return traceid;
  }

  public void setTraceid(String traceid) {
    this.traceid = traceid;
  }


  public PostCreateorderV7500Response type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Describes the type of the error.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public PostCreateorderV7500Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Describes the error message.
   * @return message
   */
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public PostCreateorderV7500Response fields(List<Object> fields) {
    this.fields = fields;
    return this;
  }

  public PostCreateorderV7500Response addFieldsItem(Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * Get fields
   * @return fields
   */
  @javax.annotation.Nullable
  public List<Object> getFields() {
    return fields;
  }

  public void setFields(List<Object> fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCreateorderV7500Response postCreateorderV7500Response = (PostCreateorderV7500Response) o;
    return Objects.equals(this.traceid, postCreateorderV7500Response.traceid) &&
        Objects.equals(this.type, postCreateorderV7500Response.type) &&
        Objects.equals(this.message, postCreateorderV7500Response.message) &&
        Objects.equals(this.fields, postCreateorderV7500Response.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceid, type, message, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCreateorderV7500Response {\n");
    sb.append("    traceid: ").append(toIndentedString(traceid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("traceid");
    openapiFields.add("type");
    openapiFields.add("message");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PostCreateorderV7500Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostCreateorderV7500Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostCreateorderV7500Response is not found in the empty JSON string", PostCreateorderV7500Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostCreateorderV7500Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostCreateorderV7500Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("traceid") != null && !jsonObj.get("traceid").isJsonNull()) && !jsonObj.get("traceid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `traceid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("traceid").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull() && !jsonObj.get("fields").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostCreateorderV7500Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostCreateorderV7500Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostCreateorderV7500Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostCreateorderV7500Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PostCreateorderV7500Response>() {
           @Override
           public void write(JsonWriter out, PostCreateorderV7500Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostCreateorderV7500Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PostCreateorderV7500Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PostCreateorderV7500Response
   * @throws IOException if the JSON string is invalid with respect to PostCreateorderV7500Response
   */
  public static PostCreateorderV7500Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostCreateorderV7500Response.class);
  }

  /**
   * Convert an instance of PostCreateorderV7500Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

