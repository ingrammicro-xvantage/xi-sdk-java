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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * Cisco product related information.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-09T07:08:41.679399Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class ProductDetailResponseCiscoFields {
  public static final String SERIALIZED_NAME_PRODUCT_SUB_GROUP = "productSubGroup";
  @SerializedName(SERIALIZED_NAME_PRODUCT_SUB_GROUP)
  private String productSubGroup;

  public static final String SERIALIZED_NAME_SERVICE_PROGRAM_NAME = "serviceProgramName";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROGRAM_NAME)
  private String serviceProgramName;

  public static final String SERIALIZED_NAME_ITEM_CATALOG_CATEGORY = "itemCatalogCategory";
  @SerializedName(SERIALIZED_NAME_ITEM_CATALOG_CATEGORY)
  private String itemCatalogCategory;

  public static final String SERIALIZED_NAME_CONFIGURATION_INDICATOR = "configurationIndicator";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_INDICATOR)
  private String configurationIndicator;

  public static final String SERIALIZED_NAME_INTERNAL_BUSINESS_ENTITY = "internalBusinessEntity";
  @SerializedName(SERIALIZED_NAME_INTERNAL_BUSINESS_ENTITY)
  private String internalBusinessEntity;

  public static final String SERIALIZED_NAME_ITEM_TYPE = "itemType";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private String itemType;

  public static final String SERIALIZED_NAME_GLOBAL_LIST_PRICE = "globalListPrice";
  @SerializedName(SERIALIZED_NAME_GLOBAL_LIST_PRICE)
  private String globalListPrice;

  public ProductDetailResponseCiscoFields() {
  }

  public ProductDetailResponseCiscoFields productSubGroup(String productSubGroup) {
    this.productSubGroup = productSubGroup;
    return this;
  }

   /**
   * Cisco product sub-group
   * @return productSubGroup
  **/
  @javax.annotation.Nullable
  public String getProductSubGroup() {
    return productSubGroup;
  }

  public void setProductSubGroup(String productSubGroup) {
    this.productSubGroup = productSubGroup;
  }


  public ProductDetailResponseCiscoFields serviceProgramName(String serviceProgramName) {
    this.serviceProgramName = serviceProgramName;
    return this;
  }

   /**
   * Cisco service program name
   * @return serviceProgramName
  **/
  @javax.annotation.Nullable
  public String getServiceProgramName() {
    return serviceProgramName;
  }

  public void setServiceProgramName(String serviceProgramName) {
    this.serviceProgramName = serviceProgramName;
  }


  public ProductDetailResponseCiscoFields itemCatalogCategory(String itemCatalogCategory) {
    this.itemCatalogCategory = itemCatalogCategory;
    return this;
  }

   /**
   * Cisco item catalog category
   * @return itemCatalogCategory
  **/
  @javax.annotation.Nullable
  public String getItemCatalogCategory() {
    return itemCatalogCategory;
  }

  public void setItemCatalogCategory(String itemCatalogCategory) {
    this.itemCatalogCategory = itemCatalogCategory;
  }


  public ProductDetailResponseCiscoFields configurationIndicator(String configurationIndicator) {
    this.configurationIndicator = configurationIndicator;
    return this;
  }

   /**
   * Cisco configuration indicator
   * @return configurationIndicator
  **/
  @javax.annotation.Nullable
  public String getConfigurationIndicator() {
    return configurationIndicator;
  }

  public void setConfigurationIndicator(String configurationIndicator) {
    this.configurationIndicator = configurationIndicator;
  }


  public ProductDetailResponseCiscoFields internalBusinessEntity(String internalBusinessEntity) {
    this.internalBusinessEntity = internalBusinessEntity;
    return this;
  }

   /**
   * Cisco internal business entity
   * @return internalBusinessEntity
  **/
  @javax.annotation.Nullable
  public String getInternalBusinessEntity() {
    return internalBusinessEntity;
  }

  public void setInternalBusinessEntity(String internalBusinessEntity) {
    this.internalBusinessEntity = internalBusinessEntity;
  }


  public ProductDetailResponseCiscoFields itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Cisco item type
   * @return itemType
  **/
  @javax.annotation.Nullable
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }


  public ProductDetailResponseCiscoFields globalListPrice(String globalListPrice) {
    this.globalListPrice = globalListPrice;
    return this;
  }

   /**
   * Cisco global list price
   * @return globalListPrice
  **/
  @javax.annotation.Nullable
  public String getGlobalListPrice() {
    return globalListPrice;
  }

  public void setGlobalListPrice(String globalListPrice) {
    this.globalListPrice = globalListPrice;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseCiscoFields productDetailResponseCiscoFields = (ProductDetailResponseCiscoFields) o;
    return Objects.equals(this.productSubGroup, productDetailResponseCiscoFields.productSubGroup) &&
        Objects.equals(this.serviceProgramName, productDetailResponseCiscoFields.serviceProgramName) &&
        Objects.equals(this.itemCatalogCategory, productDetailResponseCiscoFields.itemCatalogCategory) &&
        Objects.equals(this.configurationIndicator, productDetailResponseCiscoFields.configurationIndicator) &&
        Objects.equals(this.internalBusinessEntity, productDetailResponseCiscoFields.internalBusinessEntity) &&
        Objects.equals(this.itemType, productDetailResponseCiscoFields.itemType) &&
        Objects.equals(this.globalListPrice, productDetailResponseCiscoFields.globalListPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productSubGroup, serviceProgramName, itemCatalogCategory, configurationIndicator, internalBusinessEntity, itemType, globalListPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseCiscoFields {\n");
    sb.append("    productSubGroup: ").append(toIndentedString(productSubGroup)).append("\n");
    sb.append("    serviceProgramName: ").append(toIndentedString(serviceProgramName)).append("\n");
    sb.append("    itemCatalogCategory: ").append(toIndentedString(itemCatalogCategory)).append("\n");
    sb.append("    configurationIndicator: ").append(toIndentedString(configurationIndicator)).append("\n");
    sb.append("    internalBusinessEntity: ").append(toIndentedString(internalBusinessEntity)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    globalListPrice: ").append(toIndentedString(globalListPrice)).append("\n");
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
    openapiFields.add("productSubGroup");
    openapiFields.add("serviceProgramName");
    openapiFields.add("itemCatalogCategory");
    openapiFields.add("configurationIndicator");
    openapiFields.add("internalBusinessEntity");
    openapiFields.add("itemType");
    openapiFields.add("globalListPrice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseCiscoFields
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseCiscoFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseCiscoFields is not found in the empty JSON string", ProductDetailResponseCiscoFields.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseCiscoFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseCiscoFields` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("productSubGroup") != null && !jsonObj.get("productSubGroup").isJsonNull()) && !jsonObj.get("productSubGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productSubGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productSubGroup").toString()));
      }
      if ((jsonObj.get("serviceProgramName") != null && !jsonObj.get("serviceProgramName").isJsonNull()) && !jsonObj.get("serviceProgramName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceProgramName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceProgramName").toString()));
      }
      if ((jsonObj.get("itemCatalogCategory") != null && !jsonObj.get("itemCatalogCategory").isJsonNull()) && !jsonObj.get("itemCatalogCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemCatalogCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemCatalogCategory").toString()));
      }
      if ((jsonObj.get("configurationIndicator") != null && !jsonObj.get("configurationIndicator").isJsonNull()) && !jsonObj.get("configurationIndicator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configurationIndicator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configurationIndicator").toString()));
      }
      if ((jsonObj.get("internalBusinessEntity") != null && !jsonObj.get("internalBusinessEntity").isJsonNull()) && !jsonObj.get("internalBusinessEntity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalBusinessEntity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalBusinessEntity").toString()));
      }
      if ((jsonObj.get("itemType") != null && !jsonObj.get("itemType").isJsonNull()) && !jsonObj.get("itemType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `itemType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("itemType").toString()));
      }
      if ((jsonObj.get("globalListPrice") != null && !jsonObj.get("globalListPrice").isJsonNull()) && !jsonObj.get("globalListPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalListPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalListPrice").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseCiscoFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseCiscoFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseCiscoFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseCiscoFields.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseCiscoFields>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseCiscoFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseCiscoFields read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductDetailResponseCiscoFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductDetailResponseCiscoFields
  * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseCiscoFields
  */
  public static ProductDetailResponseCiscoFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseCiscoFields.class);
  }

 /**
  * Convert an instance of ProductDetailResponseCiscoFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

