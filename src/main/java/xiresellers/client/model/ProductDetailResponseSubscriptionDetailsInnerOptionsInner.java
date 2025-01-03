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
 * ProductDetailResponseSubscriptionDetailsInnerOptionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T17:34:44.949460271Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ProductDetailResponseSubscriptionDetailsInnerOptionsInner {
  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  @javax.annotation.Nullable
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  @javax.annotation.Nullable
  private String resourceName;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  @javax.annotation.Nullable
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_MIN_UNITS = "minUnits";
  @SerializedName(SERIALIZED_NAME_MIN_UNITS)
  @javax.annotation.Nullable
  private Integer minUnits;

  public static final String SERIALIZED_NAME_MAX_UNITS = "maxUnits";
  @SerializedName(SERIALIZED_NAME_MAX_UNITS)
  @javax.annotation.Nullable
  private Integer maxUnits;

  public static final String SERIALIZED_NAME_DEPENDS_ON = "dependsOn";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON)
  @javax.annotation.Nullable
  private String dependsOn;

  public ProductDetailResponseSubscriptionDetailsInnerOptionsInner() {
  }

  public ProductDetailResponseSubscriptionDetailsInnerOptionsInner resourceId(@javax.annotation.Nullable String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * ID of the subscription resource
   * @return resourceId
   */
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(@javax.annotation.Nullable String resourceId) {
    this.resourceId = resourceId;
  }


  public ProductDetailResponseSubscriptionDetailsInnerOptionsInner resourceName(@javax.annotation.Nullable String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Name of the subscription resource
   * @return resourceName
   */
  @javax.annotation.Nullable
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(@javax.annotation.Nullable String resourceName) {
    this.resourceName = resourceName;
  }


  public ProductDetailResponseSubscriptionDetailsInnerOptionsInner vendorPartNumber(@javax.annotation.Nullable String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * Vendor’s part number for the product.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(@javax.annotation.Nullable String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public ProductDetailResponseSubscriptionDetailsInnerOptionsInner minUnits(@javax.annotation.Nullable Integer minUnits) {
    this.minUnits = minUnits;
    return this;
  }

  /**
   * Minimum units must be purchased.
   * @return minUnits
   */
  @javax.annotation.Nullable
  public Integer getMinUnits() {
    return minUnits;
  }

  public void setMinUnits(@javax.annotation.Nullable Integer minUnits) {
    this.minUnits = minUnits;
  }


  public ProductDetailResponseSubscriptionDetailsInnerOptionsInner maxUnits(@javax.annotation.Nullable Integer maxUnits) {
    this.maxUnits = maxUnits;
    return this;
  }

  /**
   * Maximum units are available for purchase.
   * @return maxUnits
   */
  @javax.annotation.Nullable
  public Integer getMaxUnits() {
    return maxUnits;
  }

  public void setMaxUnits(@javax.annotation.Nullable Integer maxUnits) {
    this.maxUnits = maxUnits;
  }


  public ProductDetailResponseSubscriptionDetailsInnerOptionsInner dependsOn(@javax.annotation.Nullable String dependsOn) {
    this.dependsOn = dependsOn;
    return this;
  }

  /**
   * The name of the product must be purchased to purchase this product.
   * @return dependsOn
   */
  @javax.annotation.Nullable
  public String getDependsOn() {
    return dependsOn;
  }

  public void setDependsOn(@javax.annotation.Nullable String dependsOn) {
    this.dependsOn = dependsOn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseSubscriptionDetailsInnerOptionsInner productDetailResponseSubscriptionDetailsInnerOptionsInner = (ProductDetailResponseSubscriptionDetailsInnerOptionsInner) o;
    return Objects.equals(this.resourceId, productDetailResponseSubscriptionDetailsInnerOptionsInner.resourceId) &&
        Objects.equals(this.resourceName, productDetailResponseSubscriptionDetailsInnerOptionsInner.resourceName) &&
        Objects.equals(this.vendorPartNumber, productDetailResponseSubscriptionDetailsInnerOptionsInner.vendorPartNumber) &&
        Objects.equals(this.minUnits, productDetailResponseSubscriptionDetailsInnerOptionsInner.minUnits) &&
        Objects.equals(this.maxUnits, productDetailResponseSubscriptionDetailsInnerOptionsInner.maxUnits) &&
        Objects.equals(this.dependsOn, productDetailResponseSubscriptionDetailsInnerOptionsInner.dependsOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceName, vendorPartNumber, minUnits, maxUnits, dependsOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseSubscriptionDetailsInnerOptionsInner {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    minUnits: ").append(toIndentedString(minUnits)).append("\n");
    sb.append("    maxUnits: ").append(toIndentedString(maxUnits)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
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
    openapiFields.add("resourceId");
    openapiFields.add("resourceName");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("minUnits");
    openapiFields.add("maxUnits");
    openapiFields.add("dependsOn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseSubscriptionDetailsInnerOptionsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseSubscriptionDetailsInnerOptionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseSubscriptionDetailsInnerOptionsInner is not found in the empty JSON string", ProductDetailResponseSubscriptionDetailsInnerOptionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseSubscriptionDetailsInnerOptionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseSubscriptionDetailsInnerOptionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("resourceId") != null && !jsonObj.get("resourceId").isJsonNull()) && !jsonObj.get("resourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceId").toString()));
      }
      if ((jsonObj.get("resourceName") != null && !jsonObj.get("resourceName").isJsonNull()) && !jsonObj.get("resourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceName").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("dependsOn") != null && !jsonObj.get("dependsOn").isJsonNull()) && !jsonObj.get("dependsOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dependsOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dependsOn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseSubscriptionDetailsInnerOptionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseSubscriptionDetailsInnerOptionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseSubscriptionDetailsInnerOptionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseSubscriptionDetailsInnerOptionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseSubscriptionDetailsInnerOptionsInner>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseSubscriptionDetailsInnerOptionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseSubscriptionDetailsInnerOptionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDetailResponseSubscriptionDetailsInnerOptionsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDetailResponseSubscriptionDetailsInnerOptionsInner
   * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseSubscriptionDetailsInnerOptionsInner
   */
  public static ProductDetailResponseSubscriptionDetailsInnerOptionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseSubscriptionDetailsInnerOptionsInner.class);
  }

  /**
   * Convert an instance of ProductDetailResponseSubscriptionDetailsInnerOptionsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

