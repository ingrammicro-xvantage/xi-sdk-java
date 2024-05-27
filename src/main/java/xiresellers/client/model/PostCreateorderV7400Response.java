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
import xiresellers.client.model.PostCreateorderV7400ResponseFieldsInner;

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
 * PostCreateorderV7400Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-27T10:12:59.005193Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class PostCreateorderV7400Response {
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
  private List<PostCreateorderV7400ResponseFieldsInner> fields = new ArrayList<>();

  public PostCreateorderV7400Response() {
  }

  public PostCreateorderV7400Response traceid(String traceid) {
    this.traceid = traceid;
    return this;
  }

   /**
   * A unique trace id to identify the issue.
   * @return traceid
  **/
  @javax.annotation.Nullable
  public String getTraceid() {
    return traceid;
  }

  public void setTraceid(String traceid) {
    this.traceid = traceid;
  }


  public PostCreateorderV7400Response type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the error message.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public PostCreateorderV7400Response message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A detailed error message.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public PostCreateorderV7400Response fields(List<PostCreateorderV7400ResponseFieldsInner> fields) {
    this.fields = fields;
    return this;
  }

  public PostCreateorderV7400Response addFieldsItem(PostCreateorderV7400ResponseFieldsInner fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  public List<PostCreateorderV7400ResponseFieldsInner> getFields() {
    return fields;
  }

  public void setFields(List<PostCreateorderV7400ResponseFieldsInner> fields) {
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
    PostCreateorderV7400Response postCreateorderV7400Response = (PostCreateorderV7400Response) o;
    return Objects.equals(this.traceid, postCreateorderV7400Response.traceid) &&
        Objects.equals(this.type, postCreateorderV7400Response.type) &&
        Objects.equals(this.message, postCreateorderV7400Response.message) &&
        Objects.equals(this.fields, postCreateorderV7400Response.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceid, type, message, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCreateorderV7400Response {\n");
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
  * @throws IOException if the JSON Element is invalid with respect to PostCreateorderV7400Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostCreateorderV7400Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostCreateorderV7400Response is not found in the empty JSON string", PostCreateorderV7400Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostCreateorderV7400Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostCreateorderV7400Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            PostCreateorderV7400ResponseFieldsInner.validateJsonElement(jsonArrayfields.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostCreateorderV7400Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostCreateorderV7400Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostCreateorderV7400Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostCreateorderV7400Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PostCreateorderV7400Response>() {
           @Override
           public void write(JsonWriter out, PostCreateorderV7400Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostCreateorderV7400Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostCreateorderV7400Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostCreateorderV7400Response
  * @throws IOException if the JSON string is invalid with respect to PostCreateorderV7400Response
  */
  public static PostCreateorderV7400Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostCreateorderV7400Response.class);
  }

 /**
  * Convert an instance of PostCreateorderV7400Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
