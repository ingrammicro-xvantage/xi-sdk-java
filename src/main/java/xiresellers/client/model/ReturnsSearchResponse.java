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
import xiresellers.client.model.ReturnsSearchResponseReturnsClaimsInner;

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
 * ReturnsSearchResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T07:55:29.335518Z[Etc/UTC]")
public class ReturnsSearchResponse {
  public static final String SERIALIZED_NAME_RECORDS_FOUND = "recordsFound";
  @SerializedName(SERIALIZED_NAME_RECORDS_FOUND)
  private Integer recordsFound;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_RETURNS_CLAIMS = "returnsClaims";
  @SerializedName(SERIALIZED_NAME_RETURNS_CLAIMS)
  private List<ReturnsSearchResponseReturnsClaimsInner> returnsClaims;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private String nextPage;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE = "previousPage";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE)
  private String previousPage;

  public ReturnsSearchResponse() {
  }

  public ReturnsSearchResponse recordsFound(Integer recordsFound) {
    this.recordsFound = recordsFound;
    return this;
  }

   /**
   * Number of records found.
   * @return recordsFound
  **/
  @javax.annotation.Nullable
  public Integer getRecordsFound() {
    return recordsFound;
  }

  public void setRecordsFound(Integer recordsFound) {
    this.recordsFound = recordsFound;
  }


  public ReturnsSearchResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Number of records in a page.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ReturnsSearchResponse pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Number of page.
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  public Integer getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public ReturnsSearchResponse returnsClaims(List<ReturnsSearchResponseReturnsClaimsInner> returnsClaims) {
    this.returnsClaims = returnsClaims;
    return this;
  }

  public ReturnsSearchResponse addReturnsClaimsItem(ReturnsSearchResponseReturnsClaimsInner returnsClaimsItem) {
    if (this.returnsClaims == null) {
      this.returnsClaims = new ArrayList<>();
    }
    this.returnsClaims.add(returnsClaimsItem);
    return this;
  }

   /**
   * Get returnsClaims
   * @return returnsClaims
  **/
  @javax.annotation.Nullable
  public List<ReturnsSearchResponseReturnsClaimsInner> getReturnsClaims() {
    return returnsClaims;
  }

  public void setReturnsClaims(List<ReturnsSearchResponseReturnsClaimsInner> returnsClaims) {
    this.returnsClaims = returnsClaims;
  }


  public ReturnsSearchResponse nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * URL for the next page.
   * @return nextPage
  **/
  @javax.annotation.Nullable
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  public ReturnsSearchResponse previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }

   /**
   * URL for the previous page.
   * @return previousPage
  **/
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
    ReturnsSearchResponse returnsSearchResponse = (ReturnsSearchResponse) o;
    return Objects.equals(this.recordsFound, returnsSearchResponse.recordsFound) &&
        Objects.equals(this.pageSize, returnsSearchResponse.pageSize) &&
        Objects.equals(this.pageNumber, returnsSearchResponse.pageNumber) &&
        Objects.equals(this.returnsClaims, returnsSearchResponse.returnsClaims) &&
        Objects.equals(this.nextPage, returnsSearchResponse.nextPage) &&
        Objects.equals(this.previousPage, returnsSearchResponse.previousPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordsFound, pageSize, pageNumber, returnsClaims, nextPage, previousPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsSearchResponse {\n");
    sb.append("    recordsFound: ").append(toIndentedString(recordsFound)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    returnsClaims: ").append(toIndentedString(returnsClaims)).append("\n");
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
    openapiFields.add("recordsFound");
    openapiFields.add("pageSize");
    openapiFields.add("pageNumber");
    openapiFields.add("returnsClaims");
    openapiFields.add("nextPage");
    openapiFields.add("previousPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReturnsSearchResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnsSearchResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnsSearchResponse is not found in the empty JSON string", ReturnsSearchResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnsSearchResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnsSearchResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("returnsClaims") != null && !jsonObj.get("returnsClaims").isJsonNull()) {
        JsonArray jsonArrayreturnsClaims = jsonObj.getAsJsonArray("returnsClaims");
        if (jsonArrayreturnsClaims != null) {
          // ensure the json data is an array
          if (!jsonObj.get("returnsClaims").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `returnsClaims` to be an array in the JSON string but got `%s`", jsonObj.get("returnsClaims").toString()));
          }

          // validate the optional field `returnsClaims` (array)
          for (int i = 0; i < jsonArrayreturnsClaims.size(); i++) {
            ReturnsSearchResponseReturnsClaimsInner.validateJsonElement(jsonArrayreturnsClaims.get(i));
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
       if (!ReturnsSearchResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnsSearchResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnsSearchResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnsSearchResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnsSearchResponse>() {
           @Override
           public void write(JsonWriter out, ReturnsSearchResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnsSearchResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReturnsSearchResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReturnsSearchResponse
  * @throws IOException if the JSON string is invalid with respect to ReturnsSearchResponse
  */
  public static ReturnsSearchResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnsSearchResponse.class);
  }

 /**
  * Convert an instance of ReturnsSearchResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

