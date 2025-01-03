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
import xiresellers.client.model.ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner;
import xiresellers.client.model.ProductSearchResponseSubscriptionCatalogInnerPlansInnerSubscriptionPeriodSummaryInner;

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
 * ProductSearchResponseSubscriptionCatalogInnerPlansInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T11:27:04.886246725Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ProductSearchResponseSubscriptionCatalogInnerPlansInner {
  public static final String SERIALIZED_NAME_PLAN_ID = "planId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  @javax.annotation.Nullable
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "planName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  @javax.annotation.Nullable
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_DESCRIPTION = "planDescription";
  @SerializedName(SERIALIZED_NAME_PLAN_DESCRIPTION)
  @javax.annotation.Nullable
  private String planDescription;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PERIOD_SUMMARY = "subscriptionPeriodSummary";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PERIOD_SUMMARY)
  @javax.annotation.Nullable
  private List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerSubscriptionPeriodSummaryInner> subscriptionPeriodSummary = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  @javax.annotation.Nullable
  private List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner> links = new ArrayList<>();

  public ProductSearchResponseSubscriptionCatalogInnerPlansInner() {
  }

  public ProductSearchResponseSubscriptionCatalogInnerPlansInner planId(@javax.annotation.Nullable String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * ID of the Plan.
   * @return planId
   */
  @javax.annotation.Nullable
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(@javax.annotation.Nullable String planId) {
    this.planId = planId;
  }


  public ProductSearchResponseSubscriptionCatalogInnerPlansInner planName(@javax.annotation.Nullable String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Name of the Plan.
   * @return planName
   */
  @javax.annotation.Nullable
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(@javax.annotation.Nullable String planName) {
    this.planName = planName;
  }


  public ProductSearchResponseSubscriptionCatalogInnerPlansInner planDescription(@javax.annotation.Nullable String planDescription) {
    this.planDescription = planDescription;
    return this;
  }

  /**
   * The description of the Plan
   * @return planDescription
   */
  @javax.annotation.Nullable
  public String getPlanDescription() {
    return planDescription;
  }

  public void setPlanDescription(@javax.annotation.Nullable String planDescription) {
    this.planDescription = planDescription;
  }


  public ProductSearchResponseSubscriptionCatalogInnerPlansInner subscriptionPeriodSummary(@javax.annotation.Nullable List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerSubscriptionPeriodSummaryInner> subscriptionPeriodSummary) {
    this.subscriptionPeriodSummary = subscriptionPeriodSummary;
    return this;
  }

  public ProductSearchResponseSubscriptionCatalogInnerPlansInner addSubscriptionPeriodSummaryItem(ProductSearchResponseSubscriptionCatalogInnerPlansInnerSubscriptionPeriodSummaryInner subscriptionPeriodSummaryItem) {
    if (this.subscriptionPeriodSummary == null) {
      this.subscriptionPeriodSummary = new ArrayList<>();
    }
    this.subscriptionPeriodSummary.add(subscriptionPeriodSummaryItem);
    return this;
  }

  /**
   * Get subscriptionPeriodSummary
   * @return subscriptionPeriodSummary
   */
  @javax.annotation.Nullable
  public List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerSubscriptionPeriodSummaryInner> getSubscriptionPeriodSummary() {
    return subscriptionPeriodSummary;
  }

  public void setSubscriptionPeriodSummary(@javax.annotation.Nullable List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerSubscriptionPeriodSummaryInner> subscriptionPeriodSummary) {
    this.subscriptionPeriodSummary = subscriptionPeriodSummary;
  }


  public ProductSearchResponseSubscriptionCatalogInnerPlansInner links(@javax.annotation.Nullable List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public ProductSearchResponseSubscriptionCatalogInnerPlansInner addLinksItem(ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(@javax.annotation.Nullable List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSearchResponseSubscriptionCatalogInnerPlansInner productSearchResponseSubscriptionCatalogInnerPlansInner = (ProductSearchResponseSubscriptionCatalogInnerPlansInner) o;
    return Objects.equals(this.planId, productSearchResponseSubscriptionCatalogInnerPlansInner.planId) &&
        Objects.equals(this.planName, productSearchResponseSubscriptionCatalogInnerPlansInner.planName) &&
        Objects.equals(this.planDescription, productSearchResponseSubscriptionCatalogInnerPlansInner.planDescription) &&
        Objects.equals(this.subscriptionPeriodSummary, productSearchResponseSubscriptionCatalogInnerPlansInner.subscriptionPeriodSummary) &&
        Objects.equals(this.links, productSearchResponseSubscriptionCatalogInnerPlansInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, planName, planDescription, subscriptionPeriodSummary, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSearchResponseSubscriptionCatalogInnerPlansInner {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planDescription: ").append(toIndentedString(planDescription)).append("\n");
    sb.append("    subscriptionPeriodSummary: ").append(toIndentedString(subscriptionPeriodSummary)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("planId");
    openapiFields.add("planName");
    openapiFields.add("planDescription");
    openapiFields.add("subscriptionPeriodSummary");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductSearchResponseSubscriptionCatalogInnerPlansInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductSearchResponseSubscriptionCatalogInnerPlansInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSearchResponseSubscriptionCatalogInnerPlansInner is not found in the empty JSON string", ProductSearchResponseSubscriptionCatalogInnerPlansInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductSearchResponseSubscriptionCatalogInnerPlansInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSearchResponseSubscriptionCatalogInnerPlansInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("planId") != null && !jsonObj.get("planId").isJsonNull()) && !jsonObj.get("planId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planId").toString()));
      }
      if ((jsonObj.get("planName") != null && !jsonObj.get("planName").isJsonNull()) && !jsonObj.get("planName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planName").toString()));
      }
      if ((jsonObj.get("planDescription") != null && !jsonObj.get("planDescription").isJsonNull()) && !jsonObj.get("planDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planDescription").toString()));
      }
      if (jsonObj.get("subscriptionPeriodSummary") != null && !jsonObj.get("subscriptionPeriodSummary").isJsonNull()) {
        JsonArray jsonArraysubscriptionPeriodSummary = jsonObj.getAsJsonArray("subscriptionPeriodSummary");
        if (jsonArraysubscriptionPeriodSummary != null) {
          // ensure the json data is an array
          if (!jsonObj.get("subscriptionPeriodSummary").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `subscriptionPeriodSummary` to be an array in the JSON string but got `%s`", jsonObj.get("subscriptionPeriodSummary").toString()));
          }

          // validate the optional field `subscriptionPeriodSummary` (array)
          for (int i = 0; i < jsonArraysubscriptionPeriodSummary.size(); i++) {
            ProductSearchResponseSubscriptionCatalogInnerPlansInnerSubscriptionPeriodSummaryInner.validateJsonElement(jsonArraysubscriptionPeriodSummary.get(i));
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSearchResponseSubscriptionCatalogInnerPlansInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSearchResponseSubscriptionCatalogInnerPlansInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSearchResponseSubscriptionCatalogInnerPlansInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSearchResponseSubscriptionCatalogInnerPlansInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSearchResponseSubscriptionCatalogInnerPlansInner>() {
           @Override
           public void write(JsonWriter out, ProductSearchResponseSubscriptionCatalogInnerPlansInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSearchResponseSubscriptionCatalogInnerPlansInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductSearchResponseSubscriptionCatalogInnerPlansInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductSearchResponseSubscriptionCatalogInnerPlansInner
   * @throws IOException if the JSON string is invalid with respect to ProductSearchResponseSubscriptionCatalogInnerPlansInner
   */
  public static ProductSearchResponseSubscriptionCatalogInnerPlansInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSearchResponseSubscriptionCatalogInnerPlansInner.class);
  }

  /**
   * Convert an instance of ProductSearchResponseSubscriptionCatalogInnerPlansInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

