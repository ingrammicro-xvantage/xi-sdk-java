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
import java.util.Arrays;
import org.openapitools.client.model.ProductSearchRequestServicerequestProductsearchrequest;
import org.openapitools.client.model.ProductSearchRequestServicerequestRequestpreamble;

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
 * ProductSearchRequestServicerequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-11T06:30:19.223435Z[Etc/UTC]")
public class ProductSearchRequestServicerequest {
  public static final String SERIALIZED_NAME_REQUESTPREAMBLE = "requestpreamble";
  @SerializedName(SERIALIZED_NAME_REQUESTPREAMBLE)
  private ProductSearchRequestServicerequestRequestpreamble requestpreamble;

  public static final String SERIALIZED_NAME_PRODUCTSEARCHREQUEST = "productsearchrequest";
  @SerializedName(SERIALIZED_NAME_PRODUCTSEARCHREQUEST)
  private ProductSearchRequestServicerequestProductsearchrequest productsearchrequest;

  public ProductSearchRequestServicerequest() {
  }

  public ProductSearchRequestServicerequest requestpreamble(ProductSearchRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
    return this;
  }

   /**
   * Get requestpreamble
   * @return requestpreamble
  **/
  @javax.annotation.Nullable
  public ProductSearchRequestServicerequestRequestpreamble getRequestpreamble() {
    return requestpreamble;
  }

  public void setRequestpreamble(ProductSearchRequestServicerequestRequestpreamble requestpreamble) {
    this.requestpreamble = requestpreamble;
  }


  public ProductSearchRequestServicerequest productsearchrequest(ProductSearchRequestServicerequestProductsearchrequest productsearchrequest) {
    this.productsearchrequest = productsearchrequest;
    return this;
  }

   /**
   * Get productsearchrequest
   * @return productsearchrequest
  **/
  @javax.annotation.Nullable
  public ProductSearchRequestServicerequestProductsearchrequest getProductsearchrequest() {
    return productsearchrequest;
  }

  public void setProductsearchrequest(ProductSearchRequestServicerequestProductsearchrequest productsearchrequest) {
    this.productsearchrequest = productsearchrequest;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSearchRequestServicerequest productSearchRequestServicerequest = (ProductSearchRequestServicerequest) o;
    return Objects.equals(this.requestpreamble, productSearchRequestServicerequest.requestpreamble) &&
        Objects.equals(this.productsearchrequest, productSearchRequestServicerequest.productsearchrequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestpreamble, productsearchrequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSearchRequestServicerequest {\n");
    sb.append("    requestpreamble: ").append(toIndentedString(requestpreamble)).append("\n");
    sb.append("    productsearchrequest: ").append(toIndentedString(productsearchrequest)).append("\n");
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
    openapiFields.add("requestpreamble");
    openapiFields.add("productsearchrequest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductSearchRequestServicerequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductSearchRequestServicerequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductSearchRequestServicerequest is not found in the empty JSON string", ProductSearchRequestServicerequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductSearchRequestServicerequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductSearchRequestServicerequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `requestpreamble`
      if (jsonObj.get("requestpreamble") != null && !jsonObj.get("requestpreamble").isJsonNull()) {
        ProductSearchRequestServicerequestRequestpreamble.validateJsonElement(jsonObj.get("requestpreamble"));
      }
      // validate the optional field `productsearchrequest`
      if (jsonObj.get("productsearchrequest") != null && !jsonObj.get("productsearchrequest").isJsonNull()) {
        ProductSearchRequestServicerequestProductsearchrequest.validateJsonElement(jsonObj.get("productsearchrequest"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductSearchRequestServicerequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductSearchRequestServicerequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductSearchRequestServicerequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductSearchRequestServicerequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductSearchRequestServicerequest>() {
           @Override
           public void write(JsonWriter out, ProductSearchRequestServicerequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductSearchRequestServicerequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductSearchRequestServicerequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductSearchRequestServicerequest
  * @throws IOException if the JSON string is invalid with respect to ProductSearchRequestServicerequest
  */
  public static ProductSearchRequestServicerequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductSearchRequestServicerequest.class);
  }

 /**
  * Convert an instance of ProductSearchRequestServicerequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

