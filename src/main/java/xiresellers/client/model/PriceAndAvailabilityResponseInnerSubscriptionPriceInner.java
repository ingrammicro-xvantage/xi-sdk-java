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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerSubscriptionPriceInnerGroupsInner;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerSubscriptionPriceInnerSubscriptionPeriodInner;

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
 * PriceAndAvailabilityResponseInnerSubscriptionPriceInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-11T10:16:59.765249Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PriceAndAvailabilityResponseInnerSubscriptionPriceInner {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private BigDecimal index;

  public static final String SERIALIZED_NAME_PLAN_ID = "planId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_U_ID = "planUId";
  @SerializedName(SERIALIZED_NAME_PLAN_U_ID)
  private String planUId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "planName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_DESCRIPTION = "planDescription";
  @SerializedName(SERIALIZED_NAME_PLAN_DESCRIPTION)
  private String planDescription;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerGroupsInner> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billingPeriod";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  private PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod billingPeriod;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PERIOD = "subscriptionPeriod";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PERIOD)
  private List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerSubscriptionPeriodInner> subscriptionPeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner> options = new ArrayList<>();

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner() {
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner index(BigDecimal index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * @return index
   */
  @javax.annotation.Nullable
  public BigDecimal getIndex() {
    return index;
  }

  public void setIndex(BigDecimal index) {
    this.index = index;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * Id of the plan.
   * @return planId
   */
  @javax.annotation.Nullable
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner planUId(String planUId) {
    this.planUId = planUId;
    return this;
  }

  /**
   * Get planUId
   * @return planUId
   */
  @javax.annotation.Nullable
  public String getPlanUId() {
    return planUId;
  }

  public void setPlanUId(String planUId) {
    this.planUId = planUId;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Name of the plan.
   * @return planName
   */
  @javax.annotation.Nullable
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner planDescription(String planDescription) {
    this.planDescription = planDescription;
    return this;
  }

  /**
   * The description of the plan.
   * @return planDescription
   */
  @javax.annotation.Nullable
  public String getPlanDescription() {
    return planDescription;
  }

  public void setPlanDescription(String planDescription) {
    this.planDescription = planDescription;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner groups(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner addGroupsItem(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Get groups
   * @return groups
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerGroupsInner> getGroups() {
    return groups;
  }

  public void setGroups(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerGroupsInner> groups) {
    this.groups = groups;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner billingPeriod(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * Get billingPeriod
   * @return billingPeriod
   */
  @javax.annotation.Nullable
  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner subscriptionPeriod(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerSubscriptionPeriodInner> subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
    return this;
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner addSubscriptionPeriodItem(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerSubscriptionPeriodInner subscriptionPeriodItem) {
    if (this.subscriptionPeriod == null) {
      this.subscriptionPeriod = new ArrayList<>();
    }
    this.subscriptionPeriod.add(subscriptionPeriodItem);
    return this;
  }

  /**
   * Get subscriptionPeriod
   * @return subscriptionPeriod
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerSubscriptionPeriodInner> getSubscriptionPeriod() {
    return subscriptionPeriod;
  }

  public void setSubscriptionPeriod(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerSubscriptionPeriodInner> subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner options(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner> options) {
    this.options = options;
    return this;
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInner addOptionsItem(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner> getOptions() {
    return options;
  }

  public void setOptions(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner> options) {
    this.options = options;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerSubscriptionPriceInner priceAndAvailabilityResponseInnerSubscriptionPriceInner = (PriceAndAvailabilityResponseInnerSubscriptionPriceInner) o;
    return Objects.equals(this.index, priceAndAvailabilityResponseInnerSubscriptionPriceInner.index) &&
        Objects.equals(this.planId, priceAndAvailabilityResponseInnerSubscriptionPriceInner.planId) &&
        Objects.equals(this.planUId, priceAndAvailabilityResponseInnerSubscriptionPriceInner.planUId) &&
        Objects.equals(this.planName, priceAndAvailabilityResponseInnerSubscriptionPriceInner.planName) &&
        Objects.equals(this.planDescription, priceAndAvailabilityResponseInnerSubscriptionPriceInner.planDescription) &&
        Objects.equals(this.groups, priceAndAvailabilityResponseInnerSubscriptionPriceInner.groups) &&
        Objects.equals(this.billingPeriod, priceAndAvailabilityResponseInnerSubscriptionPriceInner.billingPeriod) &&
        Objects.equals(this.subscriptionPeriod, priceAndAvailabilityResponseInnerSubscriptionPriceInner.subscriptionPeriod) &&
        Objects.equals(this.options, priceAndAvailabilityResponseInnerSubscriptionPriceInner.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, planId, planUId, planName, planDescription, groups, billingPeriod, subscriptionPeriod, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerSubscriptionPriceInner {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planUId: ").append(toIndentedString(planUId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planDescription: ").append(toIndentedString(planDescription)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    subscriptionPeriod: ").append(toIndentedString(subscriptionPeriod)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("planId");
    openapiFields.add("planUId");
    openapiFields.add("planName");
    openapiFields.add("planDescription");
    openapiFields.add("groups");
    openapiFields.add("billingPeriod");
    openapiFields.add("subscriptionPeriod");
    openapiFields.add("options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerSubscriptionPriceInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerSubscriptionPriceInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerSubscriptionPriceInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("planId") != null && !jsonObj.get("planId").isJsonNull()) && !jsonObj.get("planId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planId").toString()));
      }
      if ((jsonObj.get("planUId") != null && !jsonObj.get("planUId").isJsonNull()) && !jsonObj.get("planUId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planUId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planUId").toString()));
      }
      if ((jsonObj.get("planName") != null && !jsonObj.get("planName").isJsonNull()) && !jsonObj.get("planName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planName").toString()));
      }
      if ((jsonObj.get("planDescription") != null && !jsonObj.get("planDescription").isJsonNull()) && !jsonObj.get("planDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planDescription").toString()));
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            PriceAndAvailabilityResponseInnerSubscriptionPriceInnerGroupsInner.validateJsonElement(jsonArraygroups.get(i));
          };
        }
      }
      // validate the optional field `billingPeriod`
      if (jsonObj.get("billingPeriod") != null && !jsonObj.get("billingPeriod").isJsonNull()) {
        PriceAndAvailabilityResponseInnerSubscriptionPriceInnerBillingPeriod.validateJsonElement(jsonObj.get("billingPeriod"));
      }
      if (jsonObj.get("subscriptionPeriod") != null && !jsonObj.get("subscriptionPeriod").isJsonNull()) {
        JsonArray jsonArraysubscriptionPeriod = jsonObj.getAsJsonArray("subscriptionPeriod");
        if (jsonArraysubscriptionPeriod != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscriptionPeriod").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscriptionPeriod` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptionPeriod").toString()));
          }

          // validate the optional field `subscriptionPeriod` (array)
          for (int i = 0; i < jsonArraysubscriptionPeriod.size(); i++) {
            PriceAndAvailabilityResponseInnerSubscriptionPriceInnerSubscriptionPeriodInner.validateJsonElement(jsonArraysubscriptionPeriod.get(i));
          };
        }
      }
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
        if (jsonArrayoptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `options` to be an array in the JSON string but got `%s`", jsonObj.get("options").toString()));
          }

          // validate the optional field `options` (array)
          for (int i = 0; i < jsonArrayoptions.size(); i++) {
            PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.validateJsonElement(jsonArrayoptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerSubscriptionPriceInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerSubscriptionPriceInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerSubscriptionPriceInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerSubscriptionPriceInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInner
   */
  public static PriceAndAvailabilityResponseInnerSubscriptionPriceInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerSubscriptionPriceInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

