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
 * MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-14T10:07:36.431201Z[Etc/UTC]")
public class MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem {
  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public static final String SERIALIZED_NAME_INGRAMPARTNUMBER = "ingrampartnumber";
  @SerializedName(SERIALIZED_NAME_INGRAMPARTNUMBER)
  private String ingrampartnumber;

  public static final String SERIALIZED_NAME_VENDORPARTNUMBER = "vendorpartnumber";
  @SerializedName(SERIALIZED_NAME_VENDORPARTNUMBER)
  private String vendorpartnumber;

  public static final String SERIALIZED_NAME_U_P_C = "UPC";
  @SerializedName(SERIALIZED_NAME_U_P_C)
  private String UPC;

  public static final String SERIALIZED_NAME_CUSTOMERPARTNUMBER = "customerpartnumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMERPARTNUMBER)
  private String customerpartnumber;

  public static final String SERIALIZED_NAME_WAREHOUSEIDLIST = "warehouseidlist";
  @SerializedName(SERIALIZED_NAME_WAREHOUSEIDLIST)
  private String warehouseidlist;

  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem() {
  }

  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }


  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem ingrampartnumber(String ingrampartnumber) {
    this.ingrampartnumber = ingrampartnumber;
    return this;
  }

   /**
   * Ingram Micro system specific SKU number for the product for which the price is requested at Ingram Micro
   * @return ingrampartnumber
  **/
  @javax.annotation.Nullable
  public String getIngrampartnumber() {
    return ingrampartnumber;
  }

  public void setIngrampartnumber(String ingrampartnumber) {
    this.ingrampartnumber = ingrampartnumber;
  }


  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem vendorpartnumber(String vendorpartnumber) {
    this.vendorpartnumber = vendorpartnumber;
    return this;
  }

   /**
   * Vendor Part Number for the product for which the price is requested at Ingram Micro
   * @return vendorpartnumber
  **/
  @javax.annotation.Nullable
  public String getVendorpartnumber() {
    return vendorpartnumber;
  }

  public void setVendorpartnumber(String vendorpartnumber) {
    this.vendorpartnumber = vendorpartnumber;
  }


  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem UPC(String UPC) {
    this.UPC = UPC;
    return this;
  }

   /**
   * Universal Product code for the product for which the price is requested at Ingram Micro
   * @return UPC
  **/
  @javax.annotation.Nullable
  public String getUPC() {
    return UPC;
  }

  public void setUPC(String UPC) {
    this.UPC = UPC;
  }


  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem customerpartnumber(String customerpartnumber) {
    this.customerpartnumber = customerpartnumber;
    return this;
  }

   /**
   * Unique identification number of customer. For this option the Ingram Micro Sales rep must set up a cross reference table. 
   * @return customerpartnumber
  **/
  @javax.annotation.Nullable
  public String getCustomerpartnumber() {
    return customerpartnumber;
  }

  public void setCustomerpartnumber(String customerpartnumber) {
    this.customerpartnumber = customerpartnumber;
  }


  public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem warehouseidlist(String warehouseidlist) {
    this.warehouseidlist = warehouseidlist;
    return this;
  }

   /**
   * Unique identity for Ingram Micro warehouses against which stock details are returned.
   * @return warehouseidlist
  **/
  @javax.annotation.Nullable
  public String getWarehouseidlist() {
    return warehouseidlist;
  }

  public void setWarehouseidlist(String warehouseidlist) {
    this.warehouseidlist = warehouseidlist;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem multiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem = (MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem) o;
    return Objects.equals(this.index, multiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.index) &&
        Objects.equals(this.ingrampartnumber, multiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.ingrampartnumber) &&
        Objects.equals(this.vendorpartnumber, multiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.vendorpartnumber) &&
        Objects.equals(this.UPC, multiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.UPC) &&
        Objects.equals(this.customerpartnumber, multiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.customerpartnumber) &&
        Objects.equals(this.warehouseidlist, multiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.warehouseidlist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, ingrampartnumber, vendorpartnumber, UPC, customerpartnumber, warehouseidlist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    ingrampartnumber: ").append(toIndentedString(ingrampartnumber)).append("\n");
    sb.append("    vendorpartnumber: ").append(toIndentedString(vendorpartnumber)).append("\n");
    sb.append("    UPC: ").append(toIndentedString(UPC)).append("\n");
    sb.append("    customerpartnumber: ").append(toIndentedString(customerpartnumber)).append("\n");
    sb.append("    warehouseidlist: ").append(toIndentedString(warehouseidlist)).append("\n");
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
    openapiFields.add("index");
    openapiFields.add("ingrampartnumber");
    openapiFields.add("vendorpartnumber");
    openapiFields.add("UPC");
    openapiFields.add("customerpartnumber");
    openapiFields.add("warehouseidlist");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem is not found in the empty JSON string", MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingrampartnumber") != null && !jsonObj.get("ingrampartnumber").isJsonNull()) && !jsonObj.get("ingrampartnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingrampartnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingrampartnumber").toString()));
      }
      if ((jsonObj.get("vendorpartnumber") != null && !jsonObj.get("vendorpartnumber").isJsonNull()) && !jsonObj.get("vendorpartnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorpartnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorpartnumber").toString()));
      }
      if ((jsonObj.get("UPC") != null && !jsonObj.get("UPC").isJsonNull()) && !jsonObj.get("UPC").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `UPC` to be a primitive type in the JSON string but got `%s`", jsonObj.get("UPC").toString()));
      }
      if ((jsonObj.get("customerpartnumber") != null && !jsonObj.get("customerpartnumber").isJsonNull()) && !jsonObj.get("customerpartnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerpartnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerpartnumber").toString()));
      }
      if ((jsonObj.get("warehouseidlist") != null && !jsonObj.get("warehouseidlist").isJsonNull()) && !jsonObj.get("warehouseidlist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warehouseidlist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warehouseidlist").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.class));

       return (TypeAdapter<T>) new TypeAdapter<MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem>() {
           @Override
           public void write(JsonWriter out, MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem
  * @throws IOException if the JSON string is invalid with respect to MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem
  */
  public static MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem.class);
  }

 /**
  * Convert an instance of MultiSKUPriceAndStockRequestServicerequestPriceandstockrequestItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

