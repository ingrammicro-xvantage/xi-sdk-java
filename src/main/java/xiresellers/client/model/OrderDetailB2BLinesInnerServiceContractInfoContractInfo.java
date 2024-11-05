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
 * OrderDetailB2BLinesInnerServiceContractInfoContractInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T09:22:48.202953Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderDetailB2BLinesInnerServiceContractInfoContractInfo {
  public static final String SERIALIZED_NAME_CONTRACT_DESCRIPTION = "contractDescription";
  @SerializedName(SERIALIZED_NAME_CONTRACT_DESCRIPTION)
  private String contractDescription;

  public static final String SERIALIZED_NAME_CONTRACT_NUMBER = "contractNumber";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NUMBER)
  private String contractNumber;

  public static final String SERIALIZED_NAME_CONTRACT_STATUS = "contractStatus";
  @SerializedName(SERIALIZED_NAME_CONTRACT_STATUS)
  private String contractStatus;

  public static final String SERIALIZED_NAME_CONTRACT_START_DATE = "contractStartDate";
  @SerializedName(SERIALIZED_NAME_CONTRACT_START_DATE)
  private String contractStartDate;

  public static final String SERIALIZED_NAME_CONTRACT_END_DATE = "contractEndDate";
  @SerializedName(SERIALIZED_NAME_CONTRACT_END_DATE)
  private String contractEndDate;

  public static final String SERIALIZED_NAME_CONTRACT_DURATION = "contractDuration";
  @SerializedName(SERIALIZED_NAME_CONTRACT_DURATION)
  private String contractDuration;

  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo() {
  }

  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
    return this;
  }

  /**
   * The description of the contract.
   * @return contractDescription
   */
  @javax.annotation.Nullable
  public String getContractDescription() {
    return contractDescription;
  }

  public void setContractDescription(String contractDescription) {
    this.contractDescription = contractDescription;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

  /**
   * Contract number.
   * @return contractNumber
   */
  @javax.annotation.Nullable
  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

  /**
   * The status of the contract.
   * @return contractStatus
   */
  @javax.annotation.Nullable
  public String getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractStartDate(String contractStartDate) {
    this.contractStartDate = contractStartDate;
    return this;
  }

  /**
   * Start date of the contract.
   * @return contractStartDate
   */
  @javax.annotation.Nullable
  public String getContractStartDate() {
    return contractStartDate;
  }

  public void setContractStartDate(String contractStartDate) {
    this.contractStartDate = contractStartDate;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractEndDate(String contractEndDate) {
    this.contractEndDate = contractEndDate;
    return this;
  }

  /**
   * End date of the contract.
   * @return contractEndDate
   */
  @javax.annotation.Nullable
  public String getContractEndDate() {
    return contractEndDate;
  }

  public void setContractEndDate(String contractEndDate) {
    this.contractEndDate = contractEndDate;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoContractInfo contractDuration(String contractDuration) {
    this.contractDuration = contractDuration;
    return this;
  }

  /**
   * The duration of the contract.
   * @return contractDuration
   */
  @javax.annotation.Nullable
  public String getContractDuration() {
    return contractDuration;
  }

  public void setContractDuration(String contractDuration) {
    this.contractDuration = contractDuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerServiceContractInfoContractInfo orderDetailB2BLinesInnerServiceContractInfoContractInfo = (OrderDetailB2BLinesInnerServiceContractInfoContractInfo) o;
    return Objects.equals(this.contractDescription, orderDetailB2BLinesInnerServiceContractInfoContractInfo.contractDescription) &&
        Objects.equals(this.contractNumber, orderDetailB2BLinesInnerServiceContractInfoContractInfo.contractNumber) &&
        Objects.equals(this.contractStatus, orderDetailB2BLinesInnerServiceContractInfoContractInfo.contractStatus) &&
        Objects.equals(this.contractStartDate, orderDetailB2BLinesInnerServiceContractInfoContractInfo.contractStartDate) &&
        Objects.equals(this.contractEndDate, orderDetailB2BLinesInnerServiceContractInfoContractInfo.contractEndDate) &&
        Objects.equals(this.contractDuration, orderDetailB2BLinesInnerServiceContractInfoContractInfo.contractDuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractDescription, contractNumber, contractStatus, contractStartDate, contractEndDate, contractDuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerServiceContractInfoContractInfo {\n");
    sb.append("    contractDescription: ").append(toIndentedString(contractDescription)).append("\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    contractStartDate: ").append(toIndentedString(contractStartDate)).append("\n");
    sb.append("    contractEndDate: ").append(toIndentedString(contractEndDate)).append("\n");
    sb.append("    contractDuration: ").append(toIndentedString(contractDuration)).append("\n");
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
    openapiFields.add("contractDescription");
    openapiFields.add("contractNumber");
    openapiFields.add("contractStatus");
    openapiFields.add("contractStartDate");
    openapiFields.add("contractEndDate");
    openapiFields.add("contractDuration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfoContractInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerServiceContractInfoContractInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerServiceContractInfoContractInfo is not found in the empty JSON string", OrderDetailB2BLinesInnerServiceContractInfoContractInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerServiceContractInfoContractInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerServiceContractInfoContractInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contractDescription") != null && !jsonObj.get("contractDescription").isJsonNull()) && !jsonObj.get("contractDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractDescription").toString()));
      }
      if ((jsonObj.get("contractNumber") != null && !jsonObj.get("contractNumber").isJsonNull()) && !jsonObj.get("contractNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractNumber").toString()));
      }
      if ((jsonObj.get("contractStatus") != null && !jsonObj.get("contractStatus").isJsonNull()) && !jsonObj.get("contractStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractStatus").toString()));
      }
      if ((jsonObj.get("contractStartDate") != null && !jsonObj.get("contractStartDate").isJsonNull()) && !jsonObj.get("contractStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractStartDate").toString()));
      }
      if ((jsonObj.get("contractEndDate") != null && !jsonObj.get("contractEndDate").isJsonNull()) && !jsonObj.get("contractEndDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractEndDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractEndDate").toString()));
      }
      if ((jsonObj.get("contractDuration") != null && !jsonObj.get("contractDuration").isJsonNull()) && !jsonObj.get("contractDuration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractDuration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractDuration").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerServiceContractInfoContractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerServiceContractInfoContractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfoContractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerServiceContractInfoContractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfoContractInfo>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerServiceContractInfoContractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerServiceContractInfoContractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderDetailB2BLinesInnerServiceContractInfoContractInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderDetailB2BLinesInnerServiceContractInfoContractInfo
   * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfoContractInfo
   */
  public static OrderDetailB2BLinesInnerServiceContractInfoContractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerServiceContractInfoContractInfo.class);
  }

  /**
   * Convert an instance of OrderDetailB2BLinesInnerServiceContractInfoContractInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

