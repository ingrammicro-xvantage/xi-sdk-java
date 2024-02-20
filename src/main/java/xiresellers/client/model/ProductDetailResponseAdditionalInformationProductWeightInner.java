/*
 * XI Sdk Resellers
 * For Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
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
 * ProductDetailResponseAdditionalInformationProductWeightInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-20T10:02:29.305984Z[Etc/UTC]")
public class ProductDetailResponseAdditionalInformationProductWeightInner {
  public static final String SERIALIZED_NAME_PLANT_ID = "plantId";
  @SerializedName(SERIALIZED_NAME_PLANT_ID)
  private String plantId;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public static final String SERIALIZED_NAME_WEIGHT_UNIT = "weightUnit";
  @SerializedName(SERIALIZED_NAME_WEIGHT_UNIT)
  private String weightUnit;

  public ProductDetailResponseAdditionalInformationProductWeightInner() {
  }

  public ProductDetailResponseAdditionalInformationProductWeightInner plantId(String plantId) {
    this.plantId = plantId;
    return this;
  }

   /**
   * ID of the plant.  Example : &#39;US01&#39;
   * @return plantId
  **/
  @javax.annotation.Nullable
  public String getPlantId() {
    return plantId;
  }

  public void setPlantId(String plantId) {
    this.plantId = plantId;
  }


  public ProductDetailResponseAdditionalInformationProductWeightInner weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight of the product.   Example : 2
   * @return weight
  **/
  @javax.annotation.Nullable
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public ProductDetailResponseAdditionalInformationProductWeightInner weightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

   /**
   * Weight unit of the product.   Example : &#39;LB&#39;
   * @return weightUnit
  **/
  @javax.annotation.Nullable
  public String getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseAdditionalInformationProductWeightInner productDetailResponseAdditionalInformationProductWeightInner = (ProductDetailResponseAdditionalInformationProductWeightInner) o;
    return Objects.equals(this.plantId, productDetailResponseAdditionalInformationProductWeightInner.plantId) &&
        Objects.equals(this.weight, productDetailResponseAdditionalInformationProductWeightInner.weight) &&
        Objects.equals(this.weightUnit, productDetailResponseAdditionalInformationProductWeightInner.weightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plantId, weight, weightUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseAdditionalInformationProductWeightInner {\n");
    sb.append("    plantId: ").append(toIndentedString(plantId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
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
    openapiFields.add("plantId");
    openapiFields.add("weight");
    openapiFields.add("weightUnit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseAdditionalInformationProductWeightInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseAdditionalInformationProductWeightInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseAdditionalInformationProductWeightInner is not found in the empty JSON string", ProductDetailResponseAdditionalInformationProductWeightInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseAdditionalInformationProductWeightInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseAdditionalInformationProductWeightInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("plantId") != null && !jsonObj.get("plantId").isJsonNull()) && !jsonObj.get("plantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plantId").toString()));
      }
      if ((jsonObj.get("weightUnit") != null && !jsonObj.get("weightUnit").isJsonNull()) && !jsonObj.get("weightUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weightUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weightUnit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseAdditionalInformationProductWeightInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseAdditionalInformationProductWeightInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseAdditionalInformationProductWeightInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseAdditionalInformationProductWeightInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseAdditionalInformationProductWeightInner>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseAdditionalInformationProductWeightInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseAdditionalInformationProductWeightInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductDetailResponseAdditionalInformationProductWeightInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductDetailResponseAdditionalInformationProductWeightInner
  * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseAdditionalInformationProductWeightInner
  */
  public static ProductDetailResponseAdditionalInformationProductWeightInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseAdditionalInformationProductWeightInner.class);
  }

 /**
  * Convert an instance of ProductDetailResponseAdditionalInformationProductWeightInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

