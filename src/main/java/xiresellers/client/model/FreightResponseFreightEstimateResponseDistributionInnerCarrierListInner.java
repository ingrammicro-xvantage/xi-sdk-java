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
 * FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-21T06:31:48.655902Z[Etc/UTC]")
public class FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner {
  public static final String SERIALIZED_NAME_CARRIER_CODE = "carrierCode";
  @SerializedName(SERIALIZED_NAME_CARRIER_CODE)
  private String carrierCode;

  public static final String SERIALIZED_NAME_SHIP_VIA = "shipVia";
  @SerializedName(SERIALIZED_NAME_SHIP_VIA)
  private String shipVia;

  public static final String SERIALIZED_NAME_CARRIER_MODE = "carrierMode";
  @SerializedName(SERIALIZED_NAME_CARRIER_MODE)
  private String carrierMode;

  public static final String SERIALIZED_NAME_ESTIMATED_FREIGHT_CHARGE = "estimatedFreightCharge";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_FREIGHT_CHARGE)
  private BigDecimal estimatedFreightCharge;

  public static final String SERIALIZED_NAME_DAYS_IN_TRANSIT = "daysInTransit";
  @SerializedName(SERIALIZED_NAME_DAYS_IN_TRANSIT)
  private Integer daysInTransit;

  public FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner() {
  }

  public FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * The code for the shipping carrier for the line item.
   * @return carrierCode
  **/
  @javax.annotation.Nullable
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }


  public FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner shipVia(String shipVia) {
    this.shipVia = shipVia;
    return this;
  }

   /**
   * The name of the shipping carrier.
   * @return shipVia
  **/
  @javax.annotation.Nullable
  public String getShipVia() {
    return shipVia;
  }

  public void setShipVia(String shipVia) {
    this.shipVia = shipVia;
  }


  public FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner carrierMode(String carrierMode) {
    this.carrierMode = carrierMode;
    return this;
  }

   /**
   * Mode of the carrier.
   * @return carrierMode
  **/
  @javax.annotation.Nullable
  public String getCarrierMode() {
    return carrierMode;
  }

  public void setCarrierMode(String carrierMode) {
    this.carrierMode = carrierMode;
  }


  public FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner estimatedFreightCharge(BigDecimal estimatedFreightCharge) {
    this.estimatedFreightCharge = estimatedFreightCharge;
    return this;
  }

   /**
   * Estimated freight charge.
   * @return estimatedFreightCharge
  **/
  @javax.annotation.Nullable
  public BigDecimal getEstimatedFreightCharge() {
    return estimatedFreightCharge;
  }

  public void setEstimatedFreightCharge(BigDecimal estimatedFreightCharge) {
    this.estimatedFreightCharge = estimatedFreightCharge;
  }


  public FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner daysInTransit(Integer daysInTransit) {
    this.daysInTransit = daysInTransit;
    return this;
  }

   /**
   * Number of transit days.
   * @return daysInTransit
  **/
  @javax.annotation.Nullable
  public Integer getDaysInTransit() {
    return daysInTransit;
  }

  public void setDaysInTransit(Integer daysInTransit) {
    this.daysInTransit = daysInTransit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner freightResponseFreightEstimateResponseDistributionInnerCarrierListInner = (FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner) o;
    return Objects.equals(this.carrierCode, freightResponseFreightEstimateResponseDistributionInnerCarrierListInner.carrierCode) &&
        Objects.equals(this.shipVia, freightResponseFreightEstimateResponseDistributionInnerCarrierListInner.shipVia) &&
        Objects.equals(this.carrierMode, freightResponseFreightEstimateResponseDistributionInnerCarrierListInner.carrierMode) &&
        Objects.equals(this.estimatedFreightCharge, freightResponseFreightEstimateResponseDistributionInnerCarrierListInner.estimatedFreightCharge) &&
        Objects.equals(this.daysInTransit, freightResponseFreightEstimateResponseDistributionInnerCarrierListInner.daysInTransit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, shipVia, carrierMode, estimatedFreightCharge, daysInTransit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner {\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    carrierMode: ").append(toIndentedString(carrierMode)).append("\n");
    sb.append("    estimatedFreightCharge: ").append(toIndentedString(estimatedFreightCharge)).append("\n");
    sb.append("    daysInTransit: ").append(toIndentedString(daysInTransit)).append("\n");
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
    openapiFields.add("carrierCode");
    openapiFields.add("shipVia");
    openapiFields.add("carrierMode");
    openapiFields.add("estimatedFreightCharge");
    openapiFields.add("daysInTransit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner is not found in the empty JSON string", FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("carrierCode") != null && !jsonObj.get("carrierCode").isJsonNull()) && !jsonObj.get("carrierCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierCode").toString()));
      }
      if ((jsonObj.get("shipVia") != null && !jsonObj.get("shipVia").isJsonNull()) && !jsonObj.get("shipVia").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipVia` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipVia").toString()));
      }
      if ((jsonObj.get("carrierMode") != null && !jsonObj.get("carrierMode").isJsonNull()) && !jsonObj.get("carrierMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `carrierMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("carrierMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner>() {
           @Override
           public void write(JsonWriter out, FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner
  * @throws IOException if the JSON string is invalid with respect to FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner
  */
  public static FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.class);
  }

 /**
  * Convert an instance of FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

