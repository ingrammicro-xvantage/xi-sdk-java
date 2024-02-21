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
import xiresellers.client.model.AvailabilityAsyncNotificationRequestResourceInnerLinksInner;

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
 * AvailabilityAsyncNotificationRequestResourceInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T06:31:48.655902Z[Etc/UTC]")
public class AvailabilityAsyncNotificationRequestResourceInner {
  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_UPC_CODE = "upcCode";
  @SerializedName(SERIALIZED_NAME_UPC_CODE)
  private String upcCode;

  public static final String SERIALIZED_NAME_SKU_STATUS = "skuStatus";
  @SerializedName(SERIALIZED_NAME_SKU_STATUS)
  private String skuStatus;

  public static final String SERIALIZED_NAME_BACK_ORDER_FLAG = "backOrderFlag";
  @SerializedName(SERIALIZED_NAME_BACK_ORDER_FLAG)
  private String backOrderFlag;

  public static final String SERIALIZED_NAME_TOTAL_AVAILABILITY = "totalAvailability";
  @SerializedName(SERIALIZED_NAME_TOTAL_AVAILABILITY)
  private String totalAvailability;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<AvailabilityAsyncNotificationRequestResourceInnerLinksInner> links;

  public AvailabilityAsyncNotificationRequestResourceInner() {
  }

  public AvailabilityAsyncNotificationRequestResourceInner eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The event name sent in the event request.
   * @return eventType
  **/
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public AvailabilityAsyncNotificationRequestResourceInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * The Unique IngramMicro part number for the product.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public AvailabilityAsyncNotificationRequestResourceInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * The vendors part number for the product.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public AvailabilityAsyncNotificationRequestResourceInner vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * The name of the vendor/manufacturer of the product.
   * @return vendorName
  **/
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public AvailabilityAsyncNotificationRequestResourceInner upcCode(String upcCode) {
    this.upcCode = upcCode;
    return this;
  }

   /**
   * The UPC code for the product. Consists of 12 numeric digits that are uniquly assigned to each trade item.
   * @return upcCode
  **/
  @javax.annotation.Nullable
  public String getUpcCode() {
    return upcCode;
  }

  public void setUpcCode(String upcCode) {
    this.upcCode = upcCode;
  }


  public AvailabilityAsyncNotificationRequestResourceInner skuStatus(String skuStatus) {
    this.skuStatus = skuStatus;
    return this;
  }

   /**
   * Status returned saying whether sku is active.
   * @return skuStatus
  **/
  @javax.annotation.Nullable
  public String getSkuStatus() {
    return skuStatus;
  }

  public void setSkuStatus(String skuStatus) {
    this.skuStatus = skuStatus;
  }


  public AvailabilityAsyncNotificationRequestResourceInner backOrderFlag(String backOrderFlag) {
    this.backOrderFlag = backOrderFlag;
    return this;
  }

   /**
   * Backordered Flag.
   * @return backOrderFlag
  **/
  @javax.annotation.Nullable
  public String getBackOrderFlag() {
    return backOrderFlag;
  }

  public void setBackOrderFlag(String backOrderFlag) {
    this.backOrderFlag = backOrderFlag;
  }


  public AvailabilityAsyncNotificationRequestResourceInner totalAvailability(String totalAvailability) {
    this.totalAvailability = totalAvailability;
    return this;
  }

   /**
   * totalAvailability.
   * @return totalAvailability
  **/
  @javax.annotation.Nullable
  public String getTotalAvailability() {
    return totalAvailability;
  }

  public void setTotalAvailability(String totalAvailability) {
    this.totalAvailability = totalAvailability;
  }


  public AvailabilityAsyncNotificationRequestResourceInner links(List<AvailabilityAsyncNotificationRequestResourceInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public AvailabilityAsyncNotificationRequestResourceInner addLinksItem(AvailabilityAsyncNotificationRequestResourceInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Link to Order Details for the order(s).
   * @return links
  **/
  @javax.annotation.Nullable
  public List<AvailabilityAsyncNotificationRequestResourceInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(List<AvailabilityAsyncNotificationRequestResourceInnerLinksInner> links) {
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
    AvailabilityAsyncNotificationRequestResourceInner availabilityAsyncNotificationRequestResourceInner = (AvailabilityAsyncNotificationRequestResourceInner) o;
    return Objects.equals(this.eventType, availabilityAsyncNotificationRequestResourceInner.eventType) &&
        Objects.equals(this.ingramPartNumber, availabilityAsyncNotificationRequestResourceInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, availabilityAsyncNotificationRequestResourceInner.vendorPartNumber) &&
        Objects.equals(this.vendorName, availabilityAsyncNotificationRequestResourceInner.vendorName) &&
        Objects.equals(this.upcCode, availabilityAsyncNotificationRequestResourceInner.upcCode) &&
        Objects.equals(this.skuStatus, availabilityAsyncNotificationRequestResourceInner.skuStatus) &&
        Objects.equals(this.backOrderFlag, availabilityAsyncNotificationRequestResourceInner.backOrderFlag) &&
        Objects.equals(this.totalAvailability, availabilityAsyncNotificationRequestResourceInner.totalAvailability) &&
        Objects.equals(this.links, availabilityAsyncNotificationRequestResourceInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, ingramPartNumber, vendorPartNumber, vendorName, upcCode, skuStatus, backOrderFlag, totalAvailability, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailabilityAsyncNotificationRequestResourceInner {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    upcCode: ").append(toIndentedString(upcCode)).append("\n");
    sb.append("    skuStatus: ").append(toIndentedString(skuStatus)).append("\n");
    sb.append("    backOrderFlag: ").append(toIndentedString(backOrderFlag)).append("\n");
    sb.append("    totalAvailability: ").append(toIndentedString(totalAvailability)).append("\n");
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
    openapiFields.add("eventType");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("vendorName");
    openapiFields.add("upcCode");
    openapiFields.add("skuStatus");
    openapiFields.add("backOrderFlag");
    openapiFields.add("totalAvailability");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AvailabilityAsyncNotificationRequestResourceInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AvailabilityAsyncNotificationRequestResourceInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailabilityAsyncNotificationRequestResourceInner is not found in the empty JSON string", AvailabilityAsyncNotificationRequestResourceInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AvailabilityAsyncNotificationRequestResourceInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvailabilityAsyncNotificationRequestResourceInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull()) && !jsonObj.get("eventType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventType").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("upcCode") != null && !jsonObj.get("upcCode").isJsonNull()) && !jsonObj.get("upcCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upcCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upcCode").toString()));
      }
      if ((jsonObj.get("skuStatus") != null && !jsonObj.get("skuStatus").isJsonNull()) && !jsonObj.get("skuStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skuStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skuStatus").toString()));
      }
      if ((jsonObj.get("backOrderFlag") != null && !jsonObj.get("backOrderFlag").isJsonNull()) && !jsonObj.get("backOrderFlag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backOrderFlag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backOrderFlag").toString()));
      }
      if ((jsonObj.get("totalAvailability") != null && !jsonObj.get("totalAvailability").isJsonNull()) && !jsonObj.get("totalAvailability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `totalAvailability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("totalAvailability").toString()));
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
            AvailabilityAsyncNotificationRequestResourceInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailabilityAsyncNotificationRequestResourceInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailabilityAsyncNotificationRequestResourceInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailabilityAsyncNotificationRequestResourceInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailabilityAsyncNotificationRequestResourceInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailabilityAsyncNotificationRequestResourceInner>() {
           @Override
           public void write(JsonWriter out, AvailabilityAsyncNotificationRequestResourceInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvailabilityAsyncNotificationRequestResourceInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvailabilityAsyncNotificationRequestResourceInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailabilityAsyncNotificationRequestResourceInner
  * @throws IOException if the JSON string is invalid with respect to AvailabilityAsyncNotificationRequestResourceInner
  */
  public static AvailabilityAsyncNotificationRequestResourceInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailabilityAsyncNotificationRequestResourceInner.class);
  }

 /**
  * Convert an instance of AvailabilityAsyncNotificationRequestResourceInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

