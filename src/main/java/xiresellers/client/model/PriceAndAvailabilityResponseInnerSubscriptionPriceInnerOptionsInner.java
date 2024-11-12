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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInner;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerFeesInner;
import xiresellers.client.model.PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner;

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
 * PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T05:37:19.764548Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner {
  public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_RESOURCE_U_ID = "resourceUId";
  @SerializedName(SERIALIZED_NAME_RESOURCE_U_ID)
  private String resourceUId;

  public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
  private String resourceName;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_MIN_UNITS = "minUnits";
  @SerializedName(SERIALIZED_NAME_MIN_UNITS)
  private BigDecimal minUnits;

  public static final String SERIALIZED_NAME_MAX_UNITS = "maxUnits";
  @SerializedName(SERIALIZED_NAME_MAX_UNITS)
  private BigDecimal maxUnits;

  public static final String SERIALIZED_NAME_RECURRINGPRICEMODEL = "recurringpricemodel";
  @SerializedName(SERIALIZED_NAME_RECURRINGPRICEMODEL)
  private String recurringpricemodel;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE = "unitOfMeasure";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE)
  private String unitOfMeasure;

  public static final String SERIALIZED_NAME_RESOURCE_PRICING = "resourcePricing";
  @SerializedName(SERIALIZED_NAME_RESOURCE_PRICING)
  private List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner> resourcePricing = new ArrayList<>();

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInner> discounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerFeesInner> fees = new ArrayList<>();

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner() {
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   * @return resourceId
   */
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner resourceUId(String resourceUId) {
    this.resourceUId = resourceUId;
    return this;
  }

  /**
   * The resource id of the subscription product.
   * @return resourceUId
   */
  @javax.annotation.Nullable
  public String getResourceUId() {
    return resourceUId;
  }

  public void setResourceUId(String resourceUId) {
    this.resourceUId = resourceUId;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The name of the resource of the subscription product.
   * @return resourceName
   */
  @javax.annotation.Nullable
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * Vendor’s part number for the subscription product.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner minUnits(BigDecimal minUnits) {
    this.minUnits = minUnits;
    return this;
  }

  /**
   * Minimum unit needs to purchased.
   * @return minUnits
   */
  @javax.annotation.Nullable
  public BigDecimal getMinUnits() {
    return minUnits;
  }

  public void setMinUnits(BigDecimal minUnits) {
    this.minUnits = minUnits;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner maxUnits(BigDecimal maxUnits) {
    this.maxUnits = maxUnits;
    return this;
  }

  /**
   * Maximum unit available for a purchase.
   * @return maxUnits
   */
  @javax.annotation.Nullable
  public BigDecimal getMaxUnits() {
    return maxUnits;
  }

  public void setMaxUnits(BigDecimal maxUnits) {
    this.maxUnits = maxUnits;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner recurringpricemodel(String recurringpricemodel) {
    this.recurringpricemodel = recurringpricemodel;
    return this;
  }

  /**
   * Recurring price model
   * @return recurringpricemodel
   */
  @javax.annotation.Nullable
  public String getRecurringpricemodel() {
    return recurringpricemodel;
  }

  public void setRecurringpricemodel(String recurringpricemodel) {
    this.recurringpricemodel = recurringpricemodel;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Unit of mesaure for a subscription product.
   * @return unitOfMeasure
   */
  @javax.annotation.Nullable
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner resourcePricing(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner> resourcePricing) {
    this.resourcePricing = resourcePricing;
    return this;
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner addResourcePricingItem(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner resourcePricingItem) {
    if (this.resourcePricing == null) {
      this.resourcePricing = new ArrayList<>();
    }
    this.resourcePricing.add(resourcePricingItem);
    return this;
  }

  /**
   * Get resourcePricing
   * @return resourcePricing
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner> getResourcePricing() {
    return resourcePricing;
  }

  public void setResourcePricing(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner> resourcePricing) {
    this.resourcePricing = resourcePricing;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner discounts(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInner> discounts) {
    this.discounts = discounts;
    return this;
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner addDiscountsItem(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInner discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

  /**
   * Get discounts
   * @return discounts
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInner> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInner> discounts) {
    this.discounts = discounts;
  }


  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner fees(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerFeesInner> fees) {
    this.fees = fees;
    return this;
  }

  public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner addFeesItem(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerFeesInner feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<>();
    }
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Get fees
   * @return fees
   */
  @javax.annotation.Nullable
  public List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerFeesInner> getFees() {
    return fees;
  }

  public void setFees(List<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerFeesInner> fees) {
    this.fees = fees;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner = (PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner) o;
    return Objects.equals(this.resourceId, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.resourceId) &&
        Objects.equals(this.resourceUId, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.resourceUId) &&
        Objects.equals(this.resourceName, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.resourceName) &&
        Objects.equals(this.vendorPartNumber, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.vendorPartNumber) &&
        Objects.equals(this.minUnits, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.minUnits) &&
        Objects.equals(this.maxUnits, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.maxUnits) &&
        Objects.equals(this.recurringpricemodel, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.recurringpricemodel) &&
        Objects.equals(this.unitOfMeasure, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.unitOfMeasure) &&
        Objects.equals(this.resourcePricing, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.resourcePricing) &&
        Objects.equals(this.discounts, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.discounts) &&
        Objects.equals(this.fees, priceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceUId, resourceName, vendorPartNumber, minUnits, maxUnits, recurringpricemodel, unitOfMeasure, resourcePricing, discounts, fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceUId: ").append(toIndentedString(resourceUId)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    minUnits: ").append(toIndentedString(minUnits)).append("\n");
    sb.append("    maxUnits: ").append(toIndentedString(maxUnits)).append("\n");
    sb.append("    recurringpricemodel: ").append(toIndentedString(recurringpricemodel)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    resourcePricing: ").append(toIndentedString(resourcePricing)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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
    openapiFields.add("resourceUId");
    openapiFields.add("resourceName");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("minUnits");
    openapiFields.add("maxUnits");
    openapiFields.add("recurringpricemodel");
    openapiFields.add("unitOfMeasure");
    openapiFields.add("resourcePricing");
    openapiFields.add("discounts");
    openapiFields.add("fees");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner is not found in the empty JSON string", PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("resourceId") != null && !jsonObj.get("resourceId").isJsonNull()) && !jsonObj.get("resourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceId").toString()));
      }
      if ((jsonObj.get("resourceUId") != null && !jsonObj.get("resourceUId").isJsonNull()) && !jsonObj.get("resourceUId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceUId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceUId").toString()));
      }
      if ((jsonObj.get("resourceName") != null && !jsonObj.get("resourceName").isJsonNull()) && !jsonObj.get("resourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resourceName").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("recurringpricemodel") != null && !jsonObj.get("recurringpricemodel").isJsonNull()) && !jsonObj.get("recurringpricemodel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recurringpricemodel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recurringpricemodel").toString()));
      }
      if ((jsonObj.get("unitOfMeasure") != null && !jsonObj.get("unitOfMeasure").isJsonNull()) && !jsonObj.get("unitOfMeasure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitOfMeasure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitOfMeasure").toString()));
      }
      if (jsonObj.get("resourcePricing") != null && !jsonObj.get("resourcePricing").isJsonNull()) {
        JsonArray jsonArrayresourcePricing = jsonObj.getAsJsonArray("resourcePricing");
        if (jsonArrayresourcePricing != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resourcePricing").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resourcePricing` to be an array in the JSON string but got `%s`", jsonObj.get("resourcePricing").toString()));
          }

          // validate the optional field `resourcePricing` (array)
          for (int i = 0; i < jsonArrayresourcePricing.size(); i++) {
            PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerResourcePricingInner.validateJsonElement(jsonArrayresourcePricing.get(i));
          };
        }
      }
      if (jsonObj.get("discounts") != null && !jsonObj.get("discounts").isJsonNull()) {
        JsonArray jsonArraydiscounts = jsonObj.getAsJsonArray("discounts");
        if (jsonArraydiscounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("discounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `discounts` to be an array in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
          }

          // validate the optional field `discounts` (array)
          for (int i = 0; i < jsonArraydiscounts.size(); i++) {
            PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerDiscountsInner.validateJsonElement(jsonArraydiscounts.get(i));
          };
        }
      }
      if (jsonObj.get("fees") != null && !jsonObj.get("fees").isJsonNull()) {
        JsonArray jsonArrayfees = jsonObj.getAsJsonArray("fees");
        if (jsonArrayfees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fees` to be an array in the JSON string but got `%s`", jsonObj.get("fees").toString()));
          }

          // validate the optional field `fees` (array)
          for (int i = 0; i < jsonArrayfees.size(); i++) {
            PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInnerFeesInner.validateJsonElement(jsonArrayfees.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner>() {
           @Override
           public void write(JsonWriter out, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner
   * @throws IOException if the JSON string is invalid with respect to PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner
   */
  public static PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner.class);
  }

  /**
   * Convert an instance of PriceAndAvailabilityResponseInnerSubscriptionPriceInnerOptionsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

