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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner;

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
 * MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse {
  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private List<MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner> details;

  public MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse() {
  }

  public MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse details(List<MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner> details) {
    this.details = details;
    return this;
  }

  public MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse addDetailsItem(MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  public List<MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner> getDetails() {
    return details;
  }

  public void setDetails(List<MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner> details) {
    this.details = details;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse multiSKUPriceAndStockResponseServiceresponsePriceandstockresponse = (MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse) o;
    return Objects.equals(this.details, multiSKUPriceAndStockResponseServiceresponsePriceandstockresponse.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
    openapiFields.add("details");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse is not found in the empty JSON string", MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("details") != null && !jsonObj.get("details").isJsonNull()) {
        JsonArray jsonArraydetails = jsonObj.getAsJsonArray("details");
        if (jsonArraydetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("details").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `details` to be an array in the JSON string but got `%s`", jsonObj.get("details").toString()));
          }

          // validate the optional field `details` (array)
          for (int i = 0; i < jsonArraydetails.size(); i++) {
            MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner.validateJsonElement(jsonArraydetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse>() {
           @Override
           public void write(JsonWriter out, MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse
  * @throws IOException if the JSON string is invalid with respect to MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse
  */
  public static MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse.class);
  }

 /**
  * Convert an instance of MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

