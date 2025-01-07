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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderModifyRequestAdditionalAttributesInner;
import xiresellers.client.model.OrderModifyRequestLinesInner;
import xiresellers.client.model.OrderModifyRequestShipToInfo;

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
 * OrderModifyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T06:06:56.528081668Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderModifyRequest {
  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  @javax.annotation.Nullable
  private String notes;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  @javax.annotation.Nullable
  private OrderModifyRequestShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  @javax.annotation.Nullable
  private List<OrderModifyRequestLinesInner> lines = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  @javax.annotation.Nullable
  private List<OrderModifyRequestAdditionalAttributesInner> additionalAttributes = new ArrayList<>();

  public OrderModifyRequest() {
  }

  public OrderModifyRequest notes(@javax.annotation.Nullable String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Shipment-level notes.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(@javax.annotation.Nullable String notes) {
    this.notes = notes;
  }


  public OrderModifyRequest shipToInfo(@javax.annotation.Nullable OrderModifyRequestShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

  /**
   * Get shipToInfo
   * @return shipToInfo
   */
  @javax.annotation.Nullable
  public OrderModifyRequestShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(@javax.annotation.Nullable OrderModifyRequestShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderModifyRequest lines(@javax.annotation.Nullable List<OrderModifyRequestLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderModifyRequest addLinesItem(OrderModifyRequestLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * The order line items.
   * @return lines
   */
  @javax.annotation.Nullable
  public List<OrderModifyRequestLinesInner> getLines() {
    return lines;
  }

  public void setLines(@javax.annotation.Nullable List<OrderModifyRequestLinesInner> lines) {
    this.lines = lines;
  }


  public OrderModifyRequest additionalAttributes(@javax.annotation.Nullable List<OrderModifyRequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderModifyRequest addAdditionalAttributesItem(OrderModifyRequestAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

  /**
   * Header-level additional attributes.
   * @return additionalAttributes
   */
  @javax.annotation.Nullable
  public List<OrderModifyRequestAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(@javax.annotation.Nullable List<OrderModifyRequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyRequest orderModifyRequest = (OrderModifyRequest) o;
    return Objects.equals(this.notes, orderModifyRequest.notes) &&
        Objects.equals(this.shipToInfo, orderModifyRequest.shipToInfo) &&
        Objects.equals(this.lines, orderModifyRequest.lines) &&
        Objects.equals(this.additionalAttributes, orderModifyRequest.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, shipToInfo, lines, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyRequest {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
    openapiFields.add("notes");
    openapiFields.add("shipToInfo");
    openapiFields.add("lines");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderModifyRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyRequest is not found in the empty JSON string", OrderModifyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderModifyRequestShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
        if (jsonArraylines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
          }

          // validate the optional field `lines` (array)
          for (int i = 0; i < jsonArraylines.size(); i++) {
            OrderModifyRequestLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            OrderModifyRequestAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyRequest>() {
           @Override
           public void write(JsonWriter out, OrderModifyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderModifyRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderModifyRequest
   * @throws IOException if the JSON string is invalid with respect to OrderModifyRequest
   */
  public static OrderModifyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyRequest.class);
  }

  /**
   * Convert an instance of OrderModifyRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

