/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of APIs and webhooks to craft a seamless journey for your customers.
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
import xiresellers.client.model.RenewalsSearchResponseRenewalsInnerLinksInner;

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
 * DealsSearchResponseDealsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T10:40:58.644115Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DealsSearchResponseDealsInner {
  public static final String SERIALIZED_NAME_DEAL_ID = "dealId";
  @SerializedName(SERIALIZED_NAME_DEAL_ID)
  private String dealId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_END_USER = "endUser";
  @SerializedName(SERIALIZED_NAME_END_USER)
  private String endUser;

  public static final String SERIALIZED_NAME_VENDOR = "vendor";
  @SerializedName(SERIALIZED_NAME_VENDOR)
  private String vendor;

  public static final String SERIALIZED_NAME_DEAL_EXPIRY_DATE = "dealExpiryDate";
  @SerializedName(SERIALIZED_NAME_DEAL_EXPIRY_DATE)
  private String dealExpiryDate;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private RenewalsSearchResponseRenewalsInnerLinksInner links;

  public DealsSearchResponseDealsInner() {
  }

  public DealsSearchResponseDealsInner dealId(String dealId) {
    this.dealId = dealId;
    return this;
  }

   /**
   * Deal/Special bid number.
   * @return dealId
  **/
  @javax.annotation.Nullable
  public String getDealId() {
    return dealId;
  }

  public void setDealId(String dealId) {
    this.dealId = dealId;
  }


  public DealsSearchResponseDealsInner version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Most recent version number of the deal.
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  public DealsSearchResponseDealsInner endUser(String endUser) {
    this.endUser = endUser;
    return this;
  }

   /**
   * The end user/customer&#39;s name.
   * @return endUser
  **/
  @javax.annotation.Nullable
  public String getEndUser() {
    return endUser;
  }

  public void setEndUser(String endUser) {
    this.endUser = endUser;
  }


  public DealsSearchResponseDealsInner vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * The vendor&#39;s name.
   * @return vendor
  **/
  @javax.annotation.Nullable
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }


  public DealsSearchResponseDealsInner dealExpiryDate(String dealExpiryDate) {
    this.dealExpiryDate = dealExpiryDate;
    return this;
  }

   /**
   * Expiration date of the deal/Special bid.
   * @return dealExpiryDate
  **/
  @javax.annotation.Nullable
  public String getDealExpiryDate() {
    return dealExpiryDate;
  }

  public void setDealExpiryDate(String dealExpiryDate) {
    this.dealExpiryDate = dealExpiryDate;
  }


  public DealsSearchResponseDealsInner links(RenewalsSearchResponseRenewalsInnerLinksInner links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public RenewalsSearchResponseRenewalsInnerLinksInner getLinks() {
    return links;
  }

  public void setLinks(RenewalsSearchResponseRenewalsInnerLinksInner links) {
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
    DealsSearchResponseDealsInner dealsSearchResponseDealsInner = (DealsSearchResponseDealsInner) o;
    return Objects.equals(this.dealId, dealsSearchResponseDealsInner.dealId) &&
        Objects.equals(this.version, dealsSearchResponseDealsInner.version) &&
        Objects.equals(this.endUser, dealsSearchResponseDealsInner.endUser) &&
        Objects.equals(this.vendor, dealsSearchResponseDealsInner.vendor) &&
        Objects.equals(this.dealExpiryDate, dealsSearchResponseDealsInner.dealExpiryDate) &&
        Objects.equals(this.links, dealsSearchResponseDealsInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dealId, version, endUser, vendor, dealExpiryDate, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DealsSearchResponseDealsInner {\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    endUser: ").append(toIndentedString(endUser)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    dealExpiryDate: ").append(toIndentedString(dealExpiryDate)).append("\n");
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
    openapiFields.add("dealId");
    openapiFields.add("version");
    openapiFields.add("endUser");
    openapiFields.add("vendor");
    openapiFields.add("dealExpiryDate");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DealsSearchResponseDealsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DealsSearchResponseDealsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DealsSearchResponseDealsInner is not found in the empty JSON string", DealsSearchResponseDealsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DealsSearchResponseDealsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DealsSearchResponseDealsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dealId") != null && !jsonObj.get("dealId").isJsonNull()) && !jsonObj.get("dealId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealId").toString()));
      }
      if ((jsonObj.get("version") != null && !jsonObj.get("version").isJsonNull()) && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      if ((jsonObj.get("endUser") != null && !jsonObj.get("endUser").isJsonNull()) && !jsonObj.get("endUser").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endUser` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endUser").toString()));
      }
      if ((jsonObj.get("vendor") != null && !jsonObj.get("vendor").isJsonNull()) && !jsonObj.get("vendor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendor").toString()));
      }
      if ((jsonObj.get("dealExpiryDate") != null && !jsonObj.get("dealExpiryDate").isJsonNull()) && !jsonObj.get("dealExpiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dealExpiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dealExpiryDate").toString()));
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        RenewalsSearchResponseRenewalsInnerLinksInner.validateJsonElement(jsonObj.get("links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DealsSearchResponseDealsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DealsSearchResponseDealsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DealsSearchResponseDealsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DealsSearchResponseDealsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DealsSearchResponseDealsInner>() {
           @Override
           public void write(JsonWriter out, DealsSearchResponseDealsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DealsSearchResponseDealsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DealsSearchResponseDealsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DealsSearchResponseDealsInner
  * @throws IOException if the JSON string is invalid with respect to DealsSearchResponseDealsInner
  */
  public static DealsSearchResponseDealsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DealsSearchResponseDealsInner.class);
  }

 /**
  * Convert an instance of DealsSearchResponseDealsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

