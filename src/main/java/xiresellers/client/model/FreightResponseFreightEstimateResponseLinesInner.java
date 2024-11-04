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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * FreightResponseFreightEstimateResponseLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-04T05:16:26.828393Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class FreightResponseFreightEstimateResponseLinesInner {
  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_WAREHOUSE_ID = "warehouseId";
  @SerializedName(SERIALIZED_NAME_WAREHOUSE_ID)
  private String warehouseId;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_NET_AMOUNT = "netAmount";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT)
  private BigDecimal netAmount;

  public FreightResponseFreightEstimateResponseLinesInner() {
  }

  public FreightResponseFreightEstimateResponseLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * The unique IngramMicro part number.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public FreightResponseFreightEstimateResponseLinesInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * The vendor part number for the line item.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public FreightResponseFreightEstimateResponseLinesInner warehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  /**
   * The ID of the warehouse the line item will ship from.
   * @return warehouseId
   */
  @javax.annotation.Nullable
  public String getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
  }


  public FreightResponseFreightEstimateResponseLinesInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The requested quantity of the line item.
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public FreightResponseFreightEstimateResponseLinesInner unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The unit price for the line item.
   * @return unitPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public FreightResponseFreightEstimateResponseLinesInner netAmount(BigDecimal netAmount) {
    this.netAmount = netAmount;
    return this;
  }

  /**
   * The net amount (unit price X quantity) for the line item.
   * @return netAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(BigDecimal netAmount) {
    this.netAmount = netAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreightResponseFreightEstimateResponseLinesInner freightResponseFreightEstimateResponseLinesInner = (FreightResponseFreightEstimateResponseLinesInner) o;
    return Objects.equals(this.ingramPartNumber, freightResponseFreightEstimateResponseLinesInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, freightResponseFreightEstimateResponseLinesInner.vendorPartNumber) &&
        Objects.equals(this.warehouseId, freightResponseFreightEstimateResponseLinesInner.warehouseId) &&
        Objects.equals(this.quantity, freightResponseFreightEstimateResponseLinesInner.quantity) &&
        Objects.equals(this.unitPrice, freightResponseFreightEstimateResponseLinesInner.unitPrice) &&
        Objects.equals(this.netAmount, freightResponseFreightEstimateResponseLinesInner.netAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramPartNumber, vendorPartNumber, warehouseId, quantity, unitPrice, netAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreightResponseFreightEstimateResponseLinesInner {\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
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
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("warehouseId");
    openapiFields.add("quantity");
    openapiFields.add("unitPrice");
    openapiFields.add("netAmount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FreightResponseFreightEstimateResponseLinesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreightResponseFreightEstimateResponseLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreightResponseFreightEstimateResponseLinesInner is not found in the empty JSON string", FreightResponseFreightEstimateResponseLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreightResponseFreightEstimateResponseLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreightResponseFreightEstimateResponseLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("warehouseId") != null && !jsonObj.get("warehouseId").isJsonNull()) && !jsonObj.get("warehouseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warehouseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warehouseId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreightResponseFreightEstimateResponseLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreightResponseFreightEstimateResponseLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreightResponseFreightEstimateResponseLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreightResponseFreightEstimateResponseLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FreightResponseFreightEstimateResponseLinesInner>() {
           @Override
           public void write(JsonWriter out, FreightResponseFreightEstimateResponseLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreightResponseFreightEstimateResponseLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FreightResponseFreightEstimateResponseLinesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FreightResponseFreightEstimateResponseLinesInner
   * @throws IOException if the JSON string is invalid with respect to FreightResponseFreightEstimateResponseLinesInner
   */
  public static FreightResponseFreightEstimateResponseLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreightResponseFreightEstimateResponseLinesInner.class);
  }

  /**
   * Convert an instance of FreightResponseFreightEstimateResponseLinesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

