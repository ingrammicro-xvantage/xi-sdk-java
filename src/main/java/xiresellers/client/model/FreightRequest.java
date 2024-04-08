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
import xiresellers.client.model.FreightRequestLinesInner;
import xiresellers.client.model.FreightRequestShipToAddressInner;

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
 * FreightRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T10:59:03.033551Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FreightRequest {
  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

  public static final String SERIALIZED_NAME_SHIP_TO_ADDRESS_ID = "shipToAddressId";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_ADDRESS_ID)
  private String shipToAddressId;

  public static final String SERIALIZED_NAME_SHIP_TO_ADDRESS = "shipToAddress";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_ADDRESS)
  private List<FreightRequestShipToAddressInner> shipToAddress;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<FreightRequestLinesInner> lines;

  public FreightRequest() {
  }

  public FreightRequest billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

   /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit.
   * @return billToAddressId
  **/
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public FreightRequest shipToAddressId(String shipToAddressId) {
    this.shipToAddressId = shipToAddressId;
    return this;
  }

   /**
   * The ID references the reseller&#39;s address in Ingram Micro&#39;s system for shipping. Provided to resellers during the onboarding process.
   * @return shipToAddressId
  **/
  @javax.annotation.Nullable
  public String getShipToAddressId() {
    return shipToAddressId;
  }

  public void setShipToAddressId(String shipToAddressId) {
    this.shipToAddressId = shipToAddressId;
  }


  public FreightRequest shipToAddress(List<FreightRequestShipToAddressInner> shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }

  public FreightRequest addShipToAddressItem(FreightRequestShipToAddressInner shipToAddressItem) {
    if (this.shipToAddress == null) {
      this.shipToAddress = new ArrayList<>();
    }
    this.shipToAddress.add(shipToAddressItem);
    return this;
  }

   /**
   * The shipping information.
   * @return shipToAddress
  **/
  @javax.annotation.Nullable
  public List<FreightRequestShipToAddressInner> getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(List<FreightRequestShipToAddressInner> shipToAddress) {
    this.shipToAddress = shipToAddress;
  }


  public FreightRequest lines(List<FreightRequestLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public FreightRequest addLinesItem(FreightRequestLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nullable
  public List<FreightRequestLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<FreightRequestLinesInner> lines) {
    this.lines = lines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreightRequest freightRequest = (FreightRequest) o;
    return Objects.equals(this.billToAddressId, freightRequest.billToAddressId) &&
        Objects.equals(this.shipToAddressId, freightRequest.shipToAddressId) &&
        Objects.equals(this.shipToAddress, freightRequest.shipToAddress) &&
        Objects.equals(this.lines, freightRequest.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billToAddressId, shipToAddressId, shipToAddress, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreightRequest {\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    shipToAddressId: ").append(toIndentedString(shipToAddressId)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
    openapiFields.add("billToAddressId");
    openapiFields.add("shipToAddressId");
    openapiFields.add("shipToAddress");
    openapiFields.add("lines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FreightRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreightRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreightRequest is not found in the empty JSON string", FreightRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreightRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreightRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
      }
      if ((jsonObj.get("shipToAddressId") != null && !jsonObj.get("shipToAddressId").isJsonNull()) && !jsonObj.get("shipToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipToAddressId").toString()));
      }
      if (jsonObj.get("shipToAddress") != null && !jsonObj.get("shipToAddress").isJsonNull()) {
        JsonArray jsonArrayshipToAddress = jsonObj.getAsJsonArray("shipToAddress");
        if (jsonArrayshipToAddress != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipToAddress").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipToAddress` to be an array in the JSON string but got `%s`", jsonObj.get("shipToAddress").toString()));
          }

          // validate the optional field `shipToAddress` (array)
          for (int i = 0; i < jsonArrayshipToAddress.size(); i++) {
            FreightRequestShipToAddressInner.validateJsonElement(jsonArrayshipToAddress.get(i));
          };
        }
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
            FreightRequestLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreightRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreightRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreightRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreightRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FreightRequest>() {
           @Override
           public void write(JsonWriter out, FreightRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreightRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FreightRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FreightRequest
  * @throws IOException if the JSON string is invalid with respect to FreightRequest
  */
  public static FreightRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreightRequest.class);
  }

 /**
  * Convert an instance of FreightRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

