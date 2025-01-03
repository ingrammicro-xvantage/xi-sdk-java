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
import xiresellers.client.model.ReturnsCreateRequestListInner;

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
 * ReturnsCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T11:27:04.886246725Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ReturnsCreateRequest {
  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  @javax.annotation.Nullable
  private List<ReturnsCreateRequestListInner> _list = new ArrayList<>();

  public ReturnsCreateRequest() {
  }

  public ReturnsCreateRequest _list(@javax.annotation.Nullable List<ReturnsCreateRequestListInner> _list) {
    this._list = _list;
    return this;
  }

  public ReturnsCreateRequest addListItem(ReturnsCreateRequestListInner _listItem) {
    if (this._list == null) {
      this._list = new ArrayList<>();
    }
    this._list.add(_listItem);
    return this;
  }

  /**
   * Get _list
   * @return _list
   */
  @javax.annotation.Nullable
  public List<ReturnsCreateRequestListInner> getList() {
    return _list;
  }

  public void setList(@javax.annotation.Nullable List<ReturnsCreateRequestListInner> _list) {
    this._list = _list;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnsCreateRequest returnsCreateRequest = (ReturnsCreateRequest) o;
    return Objects.equals(this._list, returnsCreateRequest._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsCreateRequest {\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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
    openapiFields.add("list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReturnsCreateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnsCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnsCreateRequest is not found in the empty JSON string", ReturnsCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnsCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnsCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("list") != null && !jsonObj.get("list").isJsonNull()) {
        JsonArray jsonArray_list = jsonObj.getAsJsonArray("list");
        if (jsonArray_list != null) {
          // ensure the json data is an array
          if (!jsonObj.get("list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `list` to be an array in the JSON string but got `%s`", jsonObj.get("list").toString()));
          }

          // validate the optional field `list` (array)
          for (int i = 0; i < jsonArray_list.size(); i++) {
            ReturnsCreateRequestListInner.validateJsonElement(jsonArray_list.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnsCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnsCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnsCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnsCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnsCreateRequest>() {
           @Override
           public void write(JsonWriter out, ReturnsCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnsCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReturnsCreateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReturnsCreateRequest
   * @throws IOException if the JSON string is invalid with respect to ReturnsCreateRequest
   */
  public static ReturnsCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnsCreateRequest.class);
  }

  /**
   * Convert an instance of ReturnsCreateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

