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
import xiresellers.client.model.ProductSearchResponseSubscriptionCatalogInnerPlansInner;

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
 * ProductSearchResponseSubscriptionCatalogInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T09:22:48.202953Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductSearchResponseSubscriptionCatalogInner {
  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_GROUP_DESCRIPTION = "groupDescription";
  @SerializedName(SERIALIZED_NAME_GROUP_DESCRIPTION)
  private String groupDescription;

  public static final String SERIALIZED_NAME_NUMBER_OF_PLANS = "numberOfPlans";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PLANS)
  private String numberOfPlans;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_PLANS = "plans";
  @SerializedName(SERIALIZED_NAME_PLANS)
  private List<ProductSearchResponseSubscriptionCatalogInnerPlansInner> plans = new ArrayList<>();

  public ProductSearchResponseSubscriptionCatalogInner() {
  }

  public ProductSearchResponseSubscriptionCatalogInner groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * The name of the group. (The info will shown if searched with showGroupInfo&#x3D;true)
   * @return groupName
   */
  @javax.annotation.Nullable
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public ProductSearchResponseSubscriptionCatalogInner groupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
    return this;
  }

  /**
   * The description of the group. (The info will shown if searched with showGroupInfo&#x3D;true)
   * @return groupDescription
   */
  @javax.annotation.Nullable
  public String getGroupDescription() {
    return groupDescription;
  }

  public void setGroupDescription(String groupDescription) {
    this.groupDescription = groupDescription;
  }


  public ProductSearchResponseSubscriptionCatalogInner numberOfPlans(String numberOfPlans) {
    this.numberOfPlans = numberOfPlans;
    return this;
  }

  /**
   * The number of plans available for the group. (The info will shown if searched with showGroupInfo&#x3D;true)
   * @return numberOfPlans
   */
  @javax.annotation.Nullable
  public String getNumberOfPlans() {
    return numberOfPlans;
  }

  public void setNumberOfPlans(String numberOfPlans) {
    this.numberOfPlans = numberOfPlans;
  }


  public ProductSearchResponseSubscriptionCatalogInner link(String link) {
    this.link = link;
    return this;
  }

  /**
   * URL to access more details about the group. (The info will shown if searched with showGroupInfo&#x3D;true)
   * @return link
   */
  @javax.annotation.Nullable
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  public ProductSearchResponseSubscriptionCatalogInner plans(List<ProductSearchResponseSubscriptionCatalogInnerPlansInner> plans) {
    this.plans = plans;
    return this;
  }

  public ProductSearchResponseSubscriptionCatalogInner addPlansItem(ProductSearchResponseSubscriptionCatalogInnerPlansInner plansItem) {
    if (this.plans == null) {
      this.plans = new ArrayList<>();
    }
    this.plans.add(plansItem);
    return this;
  }

  /**
   * Get plans
   * @return plans
   */
  @javax.annotation.Nullable
  public List<ProductSearchResponseSubscriptionCatalogInnerPlansInner> getPlans() {
    return plans;
  }

  public void setPlans(List<ProductSearchResponseSubscriptionCatalogInnerPlansInner> plans) {
    this.plans = plans;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSearchResponseSubscriptionCatalogInner productSearchResponseSubscriptionCatalogInner = (ProductSearchResponseSubscriptionCatalogInner) o;
    return Objects.equals(this.groupName, productSearchResponseSubscriptionCatalogInner.groupName) &&
        Objects.equals(this.groupDescription, productSearchResponseSubscriptionCatalogInner.groupDescription) &&
        Objects.equals(this.numberOfPlans, productSearchResponseSubscriptionCatalogInner.numberOfPlans) &&
        Objects.equals(this.link, productSearchResponseSubscriptionCatalogInner.link) &&
        Objects.equals(this.plans, productSearchResponseSubscriptionCatalogInner.plans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, groupDescription, numberOfPlans, link, plans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSearchResponseSubscriptionCatalogInner {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupDescription: ").append(toIndentedString(groupDescription)).append("\n");
    sb.append("    numberOfPlans: ").append(toIndentedString(numberOfPlans)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
    openapiFields.add("groupName");
    openapiFields.add("groupDescription");
    openapiFields.add("numberOfPlans");
    openapiFields.add("link");
    openapiFields.add("plans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductSearchResponseSubscriptionCatalogInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductSearchResponseSubscriptionCatalogInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSearchResponseSubscriptionCatalogInner is not found in the empty JSON string", ProductSearchResponseSubscriptionCatalogInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductSearchResponseSubscriptionCatalogInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSearchResponseSubscriptionCatalogInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("groupName") != null && !jsonObj.get("groupName").isJsonNull()) && !jsonObj.get("groupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupName").toString()));
      }
      if ((jsonObj.get("groupDescription") != null && !jsonObj.get("groupDescription").isJsonNull()) && !jsonObj.get("groupDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupDescription").toString()));
      }
      if ((jsonObj.get("numberOfPlans") != null && !jsonObj.get("numberOfPlans").isJsonNull()) && !jsonObj.get("numberOfPlans").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `numberOfPlans` to be a primitive type in the JSON string but got `%s`", jsonObj.get("numberOfPlans").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (jsonObj.get("plans") != null && !jsonObj.get("plans").isJsonNull()) {
        JsonArray jsonArrayplans = jsonObj.getAsJsonArray("plans");
        if (jsonArrayplans != null) {
          // ensure the json data is an array
          if (!jsonObj.get("plans").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `plans` to be an array in the JSON string but got `%s`", jsonObj.get("plans").toString()));
          }

          // validate the optional field `plans` (array)
          for (int i = 0; i < jsonArrayplans.size(); i++) {
            ProductSearchResponseSubscriptionCatalogInnerPlansInner.validateJsonElement(jsonArrayplans.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSearchResponseSubscriptionCatalogInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSearchResponseSubscriptionCatalogInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSearchResponseSubscriptionCatalogInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSearchResponseSubscriptionCatalogInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSearchResponseSubscriptionCatalogInner>() {
           @Override
           public void write(JsonWriter out, ProductSearchResponseSubscriptionCatalogInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSearchResponseSubscriptionCatalogInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductSearchResponseSubscriptionCatalogInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductSearchResponseSubscriptionCatalogInner
   * @throws IOException if the JSON string is invalid with respect to ProductSearchResponseSubscriptionCatalogInner
   */
  public static ProductSearchResponseSubscriptionCatalogInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSearchResponseSubscriptionCatalogInner.class);
  }

  /**
   * Convert an instance of ProductSearchResponseSubscriptionCatalogInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

