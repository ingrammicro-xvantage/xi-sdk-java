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
import xiresellers.client.model.ProductDetailResponseSubscriptionDetailsInnerBillingPeriod;
import xiresellers.client.model.ProductDetailResponseSubscriptionDetailsInnerGroupsInner;
import xiresellers.client.model.ProductDetailResponseSubscriptionDetailsInnerOptionsInner;
import xiresellers.client.model.ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner;
import xiresellers.client.model.ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner;

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
 * ProductDetailResponseSubscriptionDetailsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T05:37:19.764548Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductDetailResponseSubscriptionDetailsInner {
  public static final String SERIALIZED_NAME_PLAN_ID = "planId";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_NAME = "planName";
  @SerializedName(SERIALIZED_NAME_PLAN_NAME)
  private String planName;

  public static final String SERIALIZED_NAME_PLAN_DESCRIPTION = "planDescription";
  @SerializedName(SERIALIZED_NAME_PLAN_DESCRIPTION)
  private String planDescription;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<ProductDetailResponseSubscriptionDetailsInnerGroupsInner> groups = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBSCRIPTION_PERIOD = "subscriptionPeriod";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_PERIOD)
  private List<ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner> subscriptionPeriod = new ArrayList<>();

  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billingPeriod";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  private ProductDetailResponseSubscriptionDetailsInnerBillingPeriod billingPeriod;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private List<ProductDetailResponseSubscriptionDetailsInnerOptionsInner> options = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner> links = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public ProductDetailResponseSubscriptionDetailsInner() {
  }

  public ProductDetailResponseSubscriptionDetailsInner planId(String planId) {
    this.planId = planId;
    return this;
  }

  /**
   * ID of the subscription plan.
   * @return planId
   */
  @javax.annotation.Nullable
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public ProductDetailResponseSubscriptionDetailsInner planName(String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * Name of the subscription plan.
   * @return planName
   */
  @javax.annotation.Nullable
  public String getPlanName() {
    return planName;
  }

  public void setPlanName(String planName) {
    this.planName = planName;
  }


  public ProductDetailResponseSubscriptionDetailsInner planDescription(String planDescription) {
    this.planDescription = planDescription;
    return this;
  }

  /**
   * Description of the subscription plan.
   * @return planDescription
   */
  @javax.annotation.Nullable
  public String getPlanDescription() {
    return planDescription;
  }

  public void setPlanDescription(String planDescription) {
    this.planDescription = planDescription;
  }


  public ProductDetailResponseSubscriptionDetailsInner groups(List<ProductDetailResponseSubscriptionDetailsInnerGroupsInner> groups) {
    this.groups = groups;
    return this;
  }

  public ProductDetailResponseSubscriptionDetailsInner addGroupsItem(ProductDetailResponseSubscriptionDetailsInnerGroupsInner groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Details of the groups subscription product part of.
   * @return groups
   */
  @javax.annotation.Nullable
  public List<ProductDetailResponseSubscriptionDetailsInnerGroupsInner> getGroups() {
    return groups;
  }

  public void setGroups(List<ProductDetailResponseSubscriptionDetailsInnerGroupsInner> groups) {
    this.groups = groups;
  }


  public ProductDetailResponseSubscriptionDetailsInner subscriptionPeriod(List<ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner> subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
    return this;
  }

  public ProductDetailResponseSubscriptionDetailsInner addSubscriptionPeriodItem(ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner subscriptionPeriodItem) {
    if (this.subscriptionPeriod == null) {
      this.subscriptionPeriod = new ArrayList<>();
    }
    this.subscriptionPeriod.add(subscriptionPeriodItem);
    return this;
  }

  /**
   * Details of the subscription period.
   * @return subscriptionPeriod
   */
  @javax.annotation.Nullable
  public List<ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner> getSubscriptionPeriod() {
    return subscriptionPeriod;
  }

  public void setSubscriptionPeriod(List<ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner> subscriptionPeriod) {
    this.subscriptionPeriod = subscriptionPeriod;
  }


  public ProductDetailResponseSubscriptionDetailsInner billingPeriod(ProductDetailResponseSubscriptionDetailsInnerBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * Get billingPeriod
   * @return billingPeriod
   */
  @javax.annotation.Nullable
  public ProductDetailResponseSubscriptionDetailsInnerBillingPeriod getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(ProductDetailResponseSubscriptionDetailsInnerBillingPeriod billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  public ProductDetailResponseSubscriptionDetailsInner options(List<ProductDetailResponseSubscriptionDetailsInnerOptionsInner> options) {
    this.options = options;
    return this;
  }

  public ProductDetailResponseSubscriptionDetailsInner addOptionsItem(ProductDetailResponseSubscriptionDetailsInnerOptionsInner optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Details of the resources available.
   * @return options
   */
  @javax.annotation.Nullable
  public List<ProductDetailResponseSubscriptionDetailsInnerOptionsInner> getOptions() {
    return options;
  }

  public void setOptions(List<ProductDetailResponseSubscriptionDetailsInnerOptionsInner> options) {
    this.options = options;
  }


  public ProductDetailResponseSubscriptionDetailsInner links(List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public ProductDetailResponseSubscriptionDetailsInner addLinksItem(ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner linksItem) {
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

  public void setLinks(List<ProductSearchResponseSubscriptionCatalogInnerPlansInnerLinksInner> links) {
    this.links = links;
  }


  public ProductDetailResponseSubscriptionDetailsInner nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * link/URL for accessing next page.
   * @return nextPage
   */
  @javax.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public ProductDetailResponseSubscriptionDetailsInner previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }

  /**
   * link/URL for accessing previous page.
   * @return previousPage
   */
  @javax.annotation.Nullable
  public String getPreviousPage() {
    return previousPage;
  }

  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseSubscriptionDetailsInner productDetailResponseSubscriptionDetailsInner = (ProductDetailResponseSubscriptionDetailsInner) o;
    return Objects.equals(this.planId, productDetailResponseSubscriptionDetailsInner.planId) &&
        Objects.equals(this.planName, productDetailResponseSubscriptionDetailsInner.planName) &&
        Objects.equals(this.planDescription, productDetailResponseSubscriptionDetailsInner.planDescription) &&
        Objects.equals(this.groups, productDetailResponseSubscriptionDetailsInner.groups) &&
        Objects.equals(this.subscriptionPeriod, productDetailResponseSubscriptionDetailsInner.subscriptionPeriod) &&
        Objects.equals(this.billingPeriod, productDetailResponseSubscriptionDetailsInner.billingPeriod) &&
        Objects.equals(this.options, productDetailResponseSubscriptionDetailsInner.options) &&
        Objects.equals(this.links, productDetailResponseSubscriptionDetailsInner.links) &&
        Objects.equals(this.nextPage, productDetailResponseSubscriptionDetailsInner.nextPage) &&
        Objects.equals(this.previousPage, productDetailResponseSubscriptionDetailsInner.previousPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, planName, planDescription, groups, subscriptionPeriod, billingPeriod, options, links, nextPage, previousPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseSubscriptionDetailsInner {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planName: ").append(toIndentedString(planName)).append("\n");
    sb.append("    planDescription: ").append(toIndentedString(planDescription)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    subscriptionPeriod: ").append(toIndentedString(subscriptionPeriod)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
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
    openapiFields.add("groups");
    openapiFields.add("subscriptionPeriod");
    openapiFields.add("billingPeriod");
    openapiFields.add("options");
    openapiFields.add("links");
    openapiFields.add("nextPage");
    openapiFields.add("previousPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseSubscriptionDetailsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseSubscriptionDetailsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseSubscriptionDetailsInner is not found in the empty JSON string", ProductDetailResponseSubscriptionDetailsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseSubscriptionDetailsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseSubscriptionDetailsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            ProductDetailResponseSubscriptionDetailsInnerGroupsInner.validateJsonElement(jsonArraygroups.get(i));
          };
        }
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
            ProductDetailResponseSubscriptionDetailsInnerSubscriptionPeriodInner.validateJsonElement(jsonArraysubscriptionPeriod.get(i));
          };
        }
      }
      // validate the optional field `billingPeriod`
      if (jsonObj.get("billingPeriod") != null && !jsonObj.get("billingPeriod").isJsonNull()) {
        ProductDetailResponseSubscriptionDetailsInnerBillingPeriod.validateJsonElement(jsonObj.get("billingPeriod"));
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
            ProductDetailResponseSubscriptionDetailsInnerOptionsInner.validateJsonElement(jsonArrayoptions.get(i));
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
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if ((jsonObj.get("previousPage") != null && !jsonObj.get("previousPage").isJsonNull()) && !jsonObj.get("previousPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseSubscriptionDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseSubscriptionDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseSubscriptionDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseSubscriptionDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseSubscriptionDetailsInner>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseSubscriptionDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseSubscriptionDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDetailResponseSubscriptionDetailsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDetailResponseSubscriptionDetailsInner
   * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseSubscriptionDetailsInner
   */
  public static ProductDetailResponseSubscriptionDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseSubscriptionDetailsInner.class);
  }

  /**
   * Convert an instance of ProductDetailResponseSubscriptionDetailsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

