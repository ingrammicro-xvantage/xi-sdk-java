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
import xiresellers.client.model.OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner;

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
 * OrderCreateV7RequestLinesInnerWarrantyInfoInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T08:54:01.152945Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderCreateV7RequestLinesInnerWarrantyInfoInner {
  public static final String SERIALIZED_NAME_HARDWARE_LINE_LINK = "hardwareLineLink";
  @SerializedName(SERIALIZED_NAME_HARDWARE_LINE_LINK)
  private String hardwareLineLink;

  public static final String SERIALIZED_NAME_WARRANTY_LINE_LINK = "warrantyLineLink";
  @SerializedName(SERIALIZED_NAME_WARRANTY_LINE_LINK)
  private String warrantyLineLink;

  public static final String SERIALIZED_NAME_DIRECT_LINE_LINK = "directLineLink";
  @SerializedName(SERIALIZED_NAME_DIRECT_LINE_LINK)
  private String directLineLink;

  public static final String SERIALIZED_NAME_SERIAL_INFO = "serialInfo";
  @SerializedName(SERIALIZED_NAME_SERIAL_INFO)
  private List<OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner> serialInfo = new ArrayList<>();

  public OrderCreateV7RequestLinesInnerWarrantyInfoInner() {
  }

  public OrderCreateV7RequestLinesInnerWarrantyInfoInner hardwareLineLink(String hardwareLineLink) {
    this.hardwareLineLink = hardwareLineLink;
    return this;
  }

  /**
   * Customer line number of the warranty product in this request for linkage, either hardwareLineLink or warrantyLineLink can be used in a line
   * @return hardwareLineLink
   */
  @javax.annotation.Nullable
  public String getHardwareLineLink() {
    return hardwareLineLink;
  }

  public void setHardwareLineLink(String hardwareLineLink) {
    this.hardwareLineLink = hardwareLineLink;
  }


  public OrderCreateV7RequestLinesInnerWarrantyInfoInner warrantyLineLink(String warrantyLineLink) {
    this.warrantyLineLink = warrantyLineLink;
    return this;
  }

  /**
   * Customer line number of the hardware product in this request for linkage, either hardwareLineLink or warrantyLineLink can be used in a line.
   * @return warrantyLineLink
   */
  @javax.annotation.Nullable
  public String getWarrantyLineLink() {
    return warrantyLineLink;
  }

  public void setWarrantyLineLink(String warrantyLineLink) {
    this.warrantyLineLink = warrantyLineLink;
  }


  public OrderCreateV7RequestLinesInnerWarrantyInfoInner directLineLink(String directLineLink) {
    this.directLineLink = directLineLink;
    return this;
  }

  /**
   * Unique value to link hardware and warranty lines. Should be used only when products are purchased from both Ingram and/or vendor but the warranty is purchased through Ingram for them.
   * @return directLineLink
   */
  @javax.annotation.Nullable
  public String getDirectLineLink() {
    return directLineLink;
  }

  public void setDirectLineLink(String directLineLink) {
    this.directLineLink = directLineLink;
  }


  public OrderCreateV7RequestLinesInnerWarrantyInfoInner serialInfo(List<OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner> serialInfo) {
    this.serialInfo = serialInfo;
    return this;
  }

  public OrderCreateV7RequestLinesInnerWarrantyInfoInner addSerialInfoItem(OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner serialInfoItem) {
    if (this.serialInfo == null) {
      this.serialInfo = new ArrayList<>();
    }
    this.serialInfo.add(serialInfoItem);
    return this;
  }

  /**
   * Get serialInfo
   * @return serialInfo
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner> getSerialInfo() {
    return serialInfo;
  }

  public void setSerialInfo(List<OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner> serialInfo) {
    this.serialInfo = serialInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7RequestLinesInnerWarrantyInfoInner orderCreateV7RequestLinesInnerWarrantyInfoInner = (OrderCreateV7RequestLinesInnerWarrantyInfoInner) o;
    return Objects.equals(this.hardwareLineLink, orderCreateV7RequestLinesInnerWarrantyInfoInner.hardwareLineLink) &&
        Objects.equals(this.warrantyLineLink, orderCreateV7RequestLinesInnerWarrantyInfoInner.warrantyLineLink) &&
        Objects.equals(this.directLineLink, orderCreateV7RequestLinesInnerWarrantyInfoInner.directLineLink) &&
        Objects.equals(this.serialInfo, orderCreateV7RequestLinesInnerWarrantyInfoInner.serialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hardwareLineLink, warrantyLineLink, directLineLink, serialInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7RequestLinesInnerWarrantyInfoInner {\n");
    sb.append("    hardwareLineLink: ").append(toIndentedString(hardwareLineLink)).append("\n");
    sb.append("    warrantyLineLink: ").append(toIndentedString(warrantyLineLink)).append("\n");
    sb.append("    directLineLink: ").append(toIndentedString(directLineLink)).append("\n");
    sb.append("    serialInfo: ").append(toIndentedString(serialInfo)).append("\n");
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
    openapiFields.add("hardwareLineLink");
    openapiFields.add("warrantyLineLink");
    openapiFields.add("directLineLink");
    openapiFields.add("serialInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7RequestLinesInnerWarrantyInfoInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7RequestLinesInnerWarrantyInfoInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7RequestLinesInnerWarrantyInfoInner is not found in the empty JSON string", OrderCreateV7RequestLinesInnerWarrantyInfoInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7RequestLinesInnerWarrantyInfoInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7RequestLinesInnerWarrantyInfoInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("hardwareLineLink") != null && !jsonObj.get("hardwareLineLink").isJsonNull()) && !jsonObj.get("hardwareLineLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hardwareLineLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hardwareLineLink").toString()));
      }
      if ((jsonObj.get("warrantyLineLink") != null && !jsonObj.get("warrantyLineLink").isJsonNull()) && !jsonObj.get("warrantyLineLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warrantyLineLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warrantyLineLink").toString()));
      }
      if ((jsonObj.get("directLineLink") != null && !jsonObj.get("directLineLink").isJsonNull()) && !jsonObj.get("directLineLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `directLineLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("directLineLink").toString()));
      }
      if (jsonObj.get("serialInfo") != null && !jsonObj.get("serialInfo").isJsonNull()) {
        JsonArray jsonArrayserialInfo = jsonObj.getAsJsonArray("serialInfo");
        if (jsonArrayserialInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serialInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serialInfo` to be an array in the JSON string but got `%s`", jsonObj.get("serialInfo").toString()));
          }

          // validate the optional field `serialInfo` (array)
          for (int i = 0; i < jsonArrayserialInfo.size(); i++) {
            OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.validateJsonElement(jsonArrayserialInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7RequestLinesInnerWarrantyInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7RequestLinesInnerWarrantyInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7RequestLinesInnerWarrantyInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7RequestLinesInnerWarrantyInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7RequestLinesInnerWarrantyInfoInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7RequestLinesInnerWarrantyInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7RequestLinesInnerWarrantyInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7RequestLinesInnerWarrantyInfoInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7RequestLinesInnerWarrantyInfoInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7RequestLinesInnerWarrantyInfoInner
   */
  public static OrderCreateV7RequestLinesInnerWarrantyInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7RequestLinesInnerWarrantyInfoInner.class);
  }

  /**
   * Convert an instance of OrderCreateV7RequestLinesInnerWarrantyInfoInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
