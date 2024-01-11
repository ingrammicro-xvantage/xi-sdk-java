/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import org.openapitools.client.model.ProductSearchResponseServiceresponseProductsearchresponseInner;
import org.openapitools.client.model.ProductSearchResponseServiceresponseResponsepreamble;

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

import org.openapitools.client.JSON;

/**
 * ProductSearchResponseServiceresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class ProductSearchResponseServiceresponse {
  public static final String SERIALIZED_NAME_RESPONSEPREAMBLE = "responsepreamble";
  @SerializedName(SERIALIZED_NAME_RESPONSEPREAMBLE)
  private ProductSearchResponseServiceresponseResponsepreamble responsepreamble;

  public static final String SERIALIZED_NAME_PRODUCTSEARCHRESPONSE = "productsearchresponse";
  @SerializedName(SERIALIZED_NAME_PRODUCTSEARCHRESPONSE)
  private List<ProductSearchResponseServiceresponseProductsearchresponseInner> productsearchresponse;

  public ProductSearchResponseServiceresponse() {
  }

  public ProductSearchResponseServiceresponse responsepreamble(ProductSearchResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
    return this;
  }

   /**
   * Get responsepreamble
   * @return responsepreamble
  **/
  @javax.annotation.Nullable
  public ProductSearchResponseServiceresponseResponsepreamble getResponsepreamble() {
    return responsepreamble;
  }

  public void setResponsepreamble(ProductSearchResponseServiceresponseResponsepreamble responsepreamble) {
    this.responsepreamble = responsepreamble;
  }


  public ProductSearchResponseServiceresponse productsearchresponse(List<ProductSearchResponseServiceresponseProductsearchresponseInner> productsearchresponse) {
    this.productsearchresponse = productsearchresponse;
    return this;
  }

  public ProductSearchResponseServiceresponse addProductsearchresponseItem(ProductSearchResponseServiceresponseProductsearchresponseInner productsearchresponseItem) {
    if (this.productsearchresponse == null) {
      this.productsearchresponse = new ArrayList<>();
    }
    this.productsearchresponse.add(productsearchresponseItem);
    return this;
  }

   /**
   * Get productsearchresponse
   * @return productsearchresponse
  **/
  @javax.annotation.Nullable
  public List<ProductSearchResponseServiceresponseProductsearchresponseInner> getProductsearchresponse() {
    return productsearchresponse;
  }

  public void setProductsearchresponse(List<ProductSearchResponseServiceresponseProductsearchresponseInner> productsearchresponse) {
    this.productsearchresponse = productsearchresponse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSearchResponseServiceresponse productSearchResponseServiceresponse = (ProductSearchResponseServiceresponse) o;
    return Objects.equals(this.responsepreamble, productSearchResponseServiceresponse.responsepreamble) &&
        Objects.equals(this.productsearchresponse, productSearchResponseServiceresponse.productsearchresponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsepreamble, productsearchresponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSearchResponseServiceresponse {\n");
    sb.append("    responsepreamble: ").append(toIndentedString(responsepreamble)).append("\n");
    sb.append("    productsearchresponse: ").append(toIndentedString(productsearchresponse)).append("\n");
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
    openapiFields.add("responsepreamble");
    openapiFields.add("productsearchresponse");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductSearchResponseServiceresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductSearchResponseServiceresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSearchResponseServiceresponse is not found in the empty JSON string", ProductSearchResponseServiceresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductSearchResponseServiceresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSearchResponseServiceresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `responsepreamble`
      if (jsonObj.get("responsepreamble") != null && !jsonObj.get("responsepreamble").isJsonNull()) {
        ProductSearchResponseServiceresponseResponsepreamble.validateJsonElement(jsonObj.get("responsepreamble"));
      }
      if (jsonObj.get("productsearchresponse") != null && !jsonObj.get("productsearchresponse").isJsonNull()) {
        JsonArray jsonArrayproductsearchresponse = jsonObj.getAsJsonArray("productsearchresponse");
        if (jsonArrayproductsearchresponse != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productsearchresponse").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productsearchresponse` to be an array in the JSON string but got `%s`", jsonObj.get("productsearchresponse").toString()));
          }

          // validate the optional field `productsearchresponse` (array)
          for (int i = 0; i < jsonArrayproductsearchresponse.size(); i++) {
            ProductSearchResponseServiceresponseProductsearchresponseInner.validateJsonElement(jsonArrayproductsearchresponse.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSearchResponseServiceresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSearchResponseServiceresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSearchResponseServiceresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSearchResponseServiceresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSearchResponseServiceresponse>() {
           @Override
           public void write(JsonWriter out, ProductSearchResponseServiceresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSearchResponseServiceresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSearchResponseServiceresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSearchResponseServiceresponse
  * @throws IOException if the JSON string is invalid with respect to ProductSearchResponseServiceresponse
  */
  public static ProductSearchResponseServiceresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSearchResponseServiceresponse.class);
  }

 /**
  * Convert an instance of ProductSearchResponseServiceresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

