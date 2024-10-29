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
 * RenewalsDetailsResponseProductsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T04:46:41.573902Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RenewalsDetailsResponseProductsInner {
  public static final String SERIALIZED_NAME_INGRAM_LINE_NUMBER = "ingramLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_LINE_NUMBER)
  private String ingramLineNumber;

  public static final String SERIALIZED_NAME_PRODUCT_DESCRIPTION = "productDescription";
  @SerializedName(SERIALIZED_NAME_PRODUCT_DESCRIPTION)
  private String productDescription;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_MANUFACTURER_PART_NUMBER = "manufacturerPartNumber";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_PART_NUMBER)
  private String manufacturerPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_IS_CONSOLIDATED = "isConsolidated";
  @SerializedName(SERIALIZED_NAME_IS_CONSOLIDATED)
  private String isConsolidated;

  public RenewalsDetailsResponseProductsInner() {
  }

  public RenewalsDetailsResponseProductsInner ingramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
    return this;
  }

  /**
   * Unique Ingram Micro line number.
   * @return ingramLineNumber
   */
  @javax.annotation.Nullable
  public String getIngramLineNumber() {
    return ingramLineNumber;
  }

  public void setIngramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
  }


  public RenewalsDetailsResponseProductsInner productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * The description of the product.
   * @return productDescription
   */
  @javax.annotation.Nullable
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }


  public RenewalsDetailsResponseProductsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * The vendor&#39;s part number for the line item.
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public RenewalsDetailsResponseProductsInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * Unique IngramMicro part number.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public RenewalsDetailsResponseProductsInner manufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
    return this;
  }

  /**
   * The manufacturer&#39;s part number for the line item.
   * @return manufacturerPartNumber
   */
  @javax.annotation.Nullable
  public String getManufacturerPartNumber() {
    return manufacturerPartNumber;
  }

  public void setManufacturerPartNumber(String manufacturerPartNumber) {
    this.manufacturerPartNumber = manufacturerPartNumber;
  }


  public RenewalsDetailsResponseProductsInner quantity(String quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of the line item.
   * @return quantity
   */
  @javax.annotation.Nullable
  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(String quantity) {
    this.quantity = quantity;
  }


  public RenewalsDetailsResponseProductsInner unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The unit price of the line item.
   * @return unitPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public RenewalsDetailsResponseProductsInner isConsolidated(String isConsolidated) {
    this.isConsolidated = isConsolidated;
    return this;
  }

  /**
   * Is the line item consolidated? Yes or No.
   * @return isConsolidated
   */
  @javax.annotation.Nullable
  public String getIsConsolidated() {
    return isConsolidated;
  }

  public void setIsConsolidated(String isConsolidated) {
    this.isConsolidated = isConsolidated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenewalsDetailsResponseProductsInner renewalsDetailsResponseProductsInner = (RenewalsDetailsResponseProductsInner) o;
    return Objects.equals(this.ingramLineNumber, renewalsDetailsResponseProductsInner.ingramLineNumber) &&
        Objects.equals(this.productDescription, renewalsDetailsResponseProductsInner.productDescription) &&
        Objects.equals(this.vendorPartNumber, renewalsDetailsResponseProductsInner.vendorPartNumber) &&
        Objects.equals(this.ingramPartNumber, renewalsDetailsResponseProductsInner.ingramPartNumber) &&
        Objects.equals(this.manufacturerPartNumber, renewalsDetailsResponseProductsInner.manufacturerPartNumber) &&
        Objects.equals(this.quantity, renewalsDetailsResponseProductsInner.quantity) &&
        Objects.equals(this.unitPrice, renewalsDetailsResponseProductsInner.unitPrice) &&
        Objects.equals(this.isConsolidated, renewalsDetailsResponseProductsInner.isConsolidated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramLineNumber, productDescription, vendorPartNumber, ingramPartNumber, manufacturerPartNumber, quantity, unitPrice, isConsolidated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenewalsDetailsResponseProductsInner {\n");
    sb.append("    ingramLineNumber: ").append(toIndentedString(ingramLineNumber)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    manufacturerPartNumber: ").append(toIndentedString(manufacturerPartNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    isConsolidated: ").append(toIndentedString(isConsolidated)).append("\n");
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
    openapiFields.add("ingramLineNumber");
    openapiFields.add("productDescription");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("manufacturerPartNumber");
    openapiFields.add("quantity");
    openapiFields.add("unitPrice");
    openapiFields.add("isConsolidated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RenewalsDetailsResponseProductsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RenewalsDetailsResponseProductsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RenewalsDetailsResponseProductsInner is not found in the empty JSON string", RenewalsDetailsResponseProductsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RenewalsDetailsResponseProductsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RenewalsDetailsResponseProductsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramLineNumber") != null && !jsonObj.get("ingramLineNumber").isJsonNull()) && !jsonObj.get("ingramLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramLineNumber").toString()));
      }
      if ((jsonObj.get("productDescription") != null && !jsonObj.get("productDescription").isJsonNull()) && !jsonObj.get("productDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productDescription").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("manufacturerPartNumber") != null && !jsonObj.get("manufacturerPartNumber").isJsonNull()) && !jsonObj.get("manufacturerPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturerPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturerPartNumber").toString()));
      }
      if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull()) && !jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if ((jsonObj.get("isConsolidated") != null && !jsonObj.get("isConsolidated").isJsonNull()) && !jsonObj.get("isConsolidated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isConsolidated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isConsolidated").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RenewalsDetailsResponseProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RenewalsDetailsResponseProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RenewalsDetailsResponseProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RenewalsDetailsResponseProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RenewalsDetailsResponseProductsInner>() {
           @Override
           public void write(JsonWriter out, RenewalsDetailsResponseProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RenewalsDetailsResponseProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RenewalsDetailsResponseProductsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RenewalsDetailsResponseProductsInner
   * @throws IOException if the JSON string is invalid with respect to RenewalsDetailsResponseProductsInner
   */
  public static RenewalsDetailsResponseProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RenewalsDetailsResponseProductsInner.class);
  }

  /**
   * Convert an instance of RenewalsDetailsResponseProductsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

