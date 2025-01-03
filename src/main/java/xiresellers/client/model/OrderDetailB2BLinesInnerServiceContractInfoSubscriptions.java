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
 * OrderDetailB2BLinesInnerServiceContractInfoSubscriptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T17:12:54.690986034Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderDetailB2BLinesInnerServiceContractInfoSubscriptions {
  public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
  @javax.annotation.Nullable
  private String subscriptionId;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_TERM = "subscriptionTerm";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_TERM)
  @javax.annotation.Nullable
  private String subscriptionTerm;

  public static final String SERIALIZED_NAME_RENEWAL_TERM = "renewalTerm";
  @SerializedName(SERIALIZED_NAME_RENEWAL_TERM)
  @javax.annotation.Nullable
  private String renewalTerm;

  public static final String SERIALIZED_NAME_BILLING_MODEL = "billingModel";
  @SerializedName(SERIALIZED_NAME_BILLING_MODEL)
  @javax.annotation.Nullable
  private String billingModel;

  public static final String SERIALIZED_NAME_SUBCRIPTION_START_DATE = "subcriptionStartDate";
  @SerializedName(SERIALIZED_NAME_SUBCRIPTION_START_DATE)
  @javax.annotation.Nullable
  private String subcriptionStartDate;

  public static final String SERIALIZED_NAME_SUBCRIPTION_END_DATE = "subcriptionEndDate";
  @SerializedName(SERIALIZED_NAME_SUBCRIPTION_END_DATE)
  @javax.annotation.Nullable
  private String subcriptionEndDate;

  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions() {
  }

  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions subscriptionId(@javax.annotation.Nullable String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * The ID of the subscription.
   * @return subscriptionId
   */
  @javax.annotation.Nullable
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(@javax.annotation.Nullable String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions subscriptionTerm(@javax.annotation.Nullable String subscriptionTerm) {
    this.subscriptionTerm = subscriptionTerm;
    return this;
  }

  /**
   * The term of the subscription.
   * @return subscriptionTerm
   */
  @javax.annotation.Nullable
  public String getSubscriptionTerm() {
    return subscriptionTerm;
  }

  public void setSubscriptionTerm(@javax.annotation.Nullable String subscriptionTerm) {
    this.subscriptionTerm = subscriptionTerm;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions renewalTerm(@javax.annotation.Nullable String renewalTerm) {
    this.renewalTerm = renewalTerm;
    return this;
  }

  /**
   * The renewal term of the subscription.
   * @return renewalTerm
   */
  @javax.annotation.Nullable
  public String getRenewalTerm() {
    return renewalTerm;
  }

  public void setRenewalTerm(@javax.annotation.Nullable String renewalTerm) {
    this.renewalTerm = renewalTerm;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions billingModel(@javax.annotation.Nullable String billingModel) {
    this.billingModel = billingModel;
    return this;
  }

  /**
   * The billing model of the billing.
   * @return billingModel
   */
  @javax.annotation.Nullable
  public String getBillingModel() {
    return billingModel;
  }

  public void setBillingModel(@javax.annotation.Nullable String billingModel) {
    this.billingModel = billingModel;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions subcriptionStartDate(@javax.annotation.Nullable String subcriptionStartDate) {
    this.subcriptionStartDate = subcriptionStartDate;
    return this;
  }

  /**
   * Start date of the subcription.
   * @return subcriptionStartDate
   */
  @javax.annotation.Nullable
  public String getSubcriptionStartDate() {
    return subcriptionStartDate;
  }

  public void setSubcriptionStartDate(@javax.annotation.Nullable String subcriptionStartDate) {
    this.subcriptionStartDate = subcriptionStartDate;
  }


  public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions subcriptionEndDate(@javax.annotation.Nullable String subcriptionEndDate) {
    this.subcriptionEndDate = subcriptionEndDate;
    return this;
  }

  /**
   * End date of the subcription.
   * @return subcriptionEndDate
   */
  @javax.annotation.Nullable
  public String getSubcriptionEndDate() {
    return subcriptionEndDate;
  }

  public void setSubcriptionEndDate(@javax.annotation.Nullable String subcriptionEndDate) {
    this.subcriptionEndDate = subcriptionEndDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailB2BLinesInnerServiceContractInfoSubscriptions orderDetailB2BLinesInnerServiceContractInfoSubscriptions = (OrderDetailB2BLinesInnerServiceContractInfoSubscriptions) o;
    return Objects.equals(this.subscriptionId, orderDetailB2BLinesInnerServiceContractInfoSubscriptions.subscriptionId) &&
        Objects.equals(this.subscriptionTerm, orderDetailB2BLinesInnerServiceContractInfoSubscriptions.subscriptionTerm) &&
        Objects.equals(this.renewalTerm, orderDetailB2BLinesInnerServiceContractInfoSubscriptions.renewalTerm) &&
        Objects.equals(this.billingModel, orderDetailB2BLinesInnerServiceContractInfoSubscriptions.billingModel) &&
        Objects.equals(this.subcriptionStartDate, orderDetailB2BLinesInnerServiceContractInfoSubscriptions.subcriptionStartDate) &&
        Objects.equals(this.subcriptionEndDate, orderDetailB2BLinesInnerServiceContractInfoSubscriptions.subcriptionEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, subscriptionTerm, renewalTerm, billingModel, subcriptionStartDate, subcriptionEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailB2BLinesInnerServiceContractInfoSubscriptions {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionTerm: ").append(toIndentedString(subscriptionTerm)).append("\n");
    sb.append("    renewalTerm: ").append(toIndentedString(renewalTerm)).append("\n");
    sb.append("    billingModel: ").append(toIndentedString(billingModel)).append("\n");
    sb.append("    subcriptionStartDate: ").append(toIndentedString(subcriptionStartDate)).append("\n");
    sb.append("    subcriptionEndDate: ").append(toIndentedString(subcriptionEndDate)).append("\n");
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
    openapiFields.add("subscriptionId");
    openapiFields.add("subscriptionTerm");
    openapiFields.add("renewalTerm");
    openapiFields.add("billingModel");
    openapiFields.add("subcriptionStartDate");
    openapiFields.add("subcriptionEndDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfoSubscriptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailB2BLinesInnerServiceContractInfoSubscriptions is not found in the empty JSON string", OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailB2BLinesInnerServiceContractInfoSubscriptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subscriptionId") != null && !jsonObj.get("subscriptionId").isJsonNull()) && !jsonObj.get("subscriptionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionId").toString()));
      }
      if ((jsonObj.get("subscriptionTerm") != null && !jsonObj.get("subscriptionTerm").isJsonNull()) && !jsonObj.get("subscriptionTerm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscriptionTerm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscriptionTerm").toString()));
      }
      if ((jsonObj.get("renewalTerm") != null && !jsonObj.get("renewalTerm").isJsonNull()) && !jsonObj.get("renewalTerm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renewalTerm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renewalTerm").toString()));
      }
      if ((jsonObj.get("billingModel") != null && !jsonObj.get("billingModel").isJsonNull()) && !jsonObj.get("billingModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingModel").toString()));
      }
      if ((jsonObj.get("subcriptionStartDate") != null && !jsonObj.get("subcriptionStartDate").isJsonNull()) && !jsonObj.get("subcriptionStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subcriptionStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subcriptionStartDate").toString()));
      }
      if ((jsonObj.get("subcriptionEndDate") != null && !jsonObj.get("subcriptionEndDate").isJsonNull()) && !jsonObj.get("subcriptionEndDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subcriptionEndDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subcriptionEndDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailB2BLinesInnerServiceContractInfoSubscriptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfoSubscriptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailB2BLinesInnerServiceContractInfoSubscriptions>() {
           @Override
           public void write(JsonWriter out, OrderDetailB2BLinesInnerServiceContractInfoSubscriptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailB2BLinesInnerServiceContractInfoSubscriptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderDetailB2BLinesInnerServiceContractInfoSubscriptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderDetailB2BLinesInnerServiceContractInfoSubscriptions
   * @throws IOException if the JSON string is invalid with respect to OrderDetailB2BLinesInnerServiceContractInfoSubscriptions
   */
  public static OrderDetailB2BLinesInnerServiceContractInfoSubscriptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.class);
  }

  /**
   * Convert an instance of OrderDetailB2BLinesInnerServiceContractInfoSubscriptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

