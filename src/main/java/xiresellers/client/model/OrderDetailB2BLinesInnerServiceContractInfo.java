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
import java.util.Arrays;
import xiresellers.client.model.OrderDetailB2BLinesInnerServiceContractInfoContractInfo;
import xiresellers.client.model.OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo;
import xiresellers.client.model.OrderDetailB2BLinesInnerServiceContractInfoSubscriptions;

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
 * OrderDetailB2BLinesInnerServiceContractInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T10:59:03.033551Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderDetailB2BLinesInnerServiceContractInfo {
  public static final String SERIALIZED_NAME_CONTRACT_INFO = "contractInfo";
  @SerializedName(SERIALIZED_NAME_CONTRACT_INFO)
  private OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractInfo;

  public static final String SERIALIZED_NAME_SUBSCRIPTIONS = "subscriptions";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTIONS)
  private OrderDetailB2BLinesInnerServiceContractInfoSubscriptions subscriptions;

  public static final String SERIALIZED_NAME_LICENSE_INFO = "licenseInfo";
  @SerializedName(SERIALIZED_NAME_LICENSE_INFO)
  private OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo licenseInfo;

  public OrderDetailB2BLinesInnerServiceContractInfo() {
  }

  public OrderDetailB2BLinesInnerServiceContractInfo contractInfo(OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractInfo) {
    this.contractInfo = contractInfo;
    return this;
  }

   /**
   * Get contractInfo
   * @return contractInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo getContractInfo() {
    return contractInfo;
  }

  public void setContractInfo(OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractInfo) {
    this.contractInfo = contractInfo;
  }


  public OrderDetailB2BLinesInnerServiceContractInfo subscriptions(OrderDetailB2BLinesInnerServiceContractInfoSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(OrderDetailB2BLinesInnerServiceContractInfoSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }


  public OrderDetailB2BLinesInnerServiceContractInfo licenseInfo(OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo licenseInfo) {
    this.licenseInfo = licenseInfo;
    return this;
  }

   /**
   * Get licenseInfo
   * @return licenseInfo
  **/
  @javax.annotation.Nullable
  public OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo getLicenseInfo() {
    return licenseInfo;
  }

  public void setLicenseInfo(OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo licenseInfo) {
    this.licenseInfo = licenseInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerServiceContractInfo orderDetailB2BLinesInnerServiceContractInfo = (OrderDetailB2BLinesInnerServiceContractInfo) o;
    return Objects.equals(this.contractInfo, orderDetailB2BLinesInnerServiceContractInfo.contractInfo) &&
        Objects.equals(this.subscriptions, orderDetailB2BLinesInnerServiceContractInfo.subscriptions) &&
        Objects.equals(this.licenseInfo, orderDetailB2BLinesInnerServiceContractInfo.licenseInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractInfo, subscriptions, licenseInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerServiceContractInfo {\n");
    sb.append("    contractInfo: ").append(toIndentedString(contractInfo)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    licenseInfo: ").append(toIndentedString(licenseInfo)).append("\n");
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
    openapiFields.add("contractInfo");
    openapiFields.add("subscriptions");
    openapiFields.add("licenseInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfo
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerServiceContractInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerServiceContractInfo is not found in the empty JSON string", OrderDetailB2BLinesInnerServiceContractInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerServiceContractInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerServiceContractInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `contractInfo`
      if (jsonObj.get("contractInfo") != null && !jsonObj.get("contractInfo").isJsonNull()) {
        OrderDetailB2BLinesInnerServiceContractInfoContractInfo.validateJsonElement(jsonObj.get("contractInfo"));
      }
      // validate the optional field `subscriptions`
      if (jsonObj.get("subscriptions") != null && !jsonObj.get("subscriptions").isJsonNull()) {
        OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.validateJsonElement(jsonObj.get("subscriptions"));
      }
      // validate the optional field `licenseInfo`
      if (jsonObj.get("licenseInfo") != null && !jsonObj.get("licenseInfo").isJsonNull()) {
        OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.validateJsonElement(jsonObj.get("licenseInfo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerServiceContractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerServiceContractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerServiceContractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfo>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerServiceContractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerServiceContractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailB2BLinesInnerServiceContractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailB2BLinesInnerServiceContractInfo
  * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfo
  */
  public static OrderDetailB2BLinesInnerServiceContractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerServiceContractInfo.class);
  }

 /**
  * Convert an instance of OrderDetailB2BLinesInnerServiceContractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

