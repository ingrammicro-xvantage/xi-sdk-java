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
 * Serial information of the hardware to be associated with the warranty, applicable on post sale orders.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-03T11:27:04.886246725Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner {
  public static final String SERIALIZED_NAME_DATE_OF_PURCHASE = "dateOfPurchase";
  @SerializedName(SERIALIZED_NAME_DATE_OF_PURCHASE)
  @javax.annotation.Nullable
  private String dateOfPurchase;

  public static final String SERIALIZED_NAME_SHIP_DATE = "shipDate";
  @SerializedName(SERIALIZED_NAME_SHIP_DATE)
  @javax.annotation.Nullable
  private String shipDate;

  public static final String SERIALIZED_NAME_PRIMARY_SERIAL_NUMBER = "primarySerialNumber";
  @SerializedName(SERIALIZED_NAME_PRIMARY_SERIAL_NUMBER)
  @javax.annotation.Nullable
  private String primarySerialNumber;

  public static final String SERIALIZED_NAME_SECONDARY_SERIAL_NUMBER = "secondarySerialNumber";
  @SerializedName(SERIALIZED_NAME_SECONDARY_SERIAL_NUMBER)
  @javax.annotation.Nullable
  private String secondarySerialNumber;

  public OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner() {
  }

  public OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner dateOfPurchase(@javax.annotation.Nullable String dateOfPurchase) {
    this.dateOfPurchase = dateOfPurchase;
    return this;
  }

  /**
   * Date of purchase of the hardware.
   * @return dateOfPurchase
   */
  @javax.annotation.Nullable
  public String getDateOfPurchase() {
    return dateOfPurchase;
  }

  public void setDateOfPurchase(@javax.annotation.Nullable String dateOfPurchase) {
    this.dateOfPurchase = dateOfPurchase;
  }


  public OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner shipDate(@javax.annotation.Nullable String shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Vendor specific mandatory field, date of hardware/product shipment from vendor.
   * @return shipDate
   */
  @javax.annotation.Nullable
  public String getShipDate() {
    return shipDate;
  }

  public void setShipDate(@javax.annotation.Nullable String shipDate) {
    this.shipDate = shipDate;
  }


  public OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner primarySerialNumber(@javax.annotation.Nullable String primarySerialNumber) {
    this.primarySerialNumber = primarySerialNumber;
    return this;
  }

  /**
   * Serial number of the hardware/product.
   * @return primarySerialNumber
   */
  @javax.annotation.Nullable
  public String getPrimarySerialNumber() {
    return primarySerialNumber;
  }

  public void setPrimarySerialNumber(@javax.annotation.Nullable String primarySerialNumber) {
    this.primarySerialNumber = primarySerialNumber;
  }


  public OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner secondarySerialNumber(@javax.annotation.Nullable String secondarySerialNumber) {
    this.secondarySerialNumber = secondarySerialNumber;
    return this;
  }

  /**
   * Serial number of accessory associated with the above hardware/product.
   * @return secondarySerialNumber
   */
  @javax.annotation.Nullable
  public String getSecondarySerialNumber() {
    return secondarySerialNumber;
  }

  public void setSecondarySerialNumber(@javax.annotation.Nullable String secondarySerialNumber) {
    this.secondarySerialNumber = secondarySerialNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner orderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner = (OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner) o;
    return Objects.equals(this.dateOfPurchase, orderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.dateOfPurchase) &&
        Objects.equals(this.shipDate, orderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.shipDate) &&
        Objects.equals(this.primarySerialNumber, orderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.primarySerialNumber) &&
        Objects.equals(this.secondarySerialNumber, orderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.secondarySerialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateOfPurchase, shipDate, primarySerialNumber, secondarySerialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner {\n");
    sb.append("    dateOfPurchase: ").append(toIndentedString(dateOfPurchase)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    primarySerialNumber: ").append(toIndentedString(primarySerialNumber)).append("\n");
    sb.append("    secondarySerialNumber: ").append(toIndentedString(secondarySerialNumber)).append("\n");
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
    openapiFields.add("dateOfPurchase");
    openapiFields.add("shipDate");
    openapiFields.add("primarySerialNumber");
    openapiFields.add("secondarySerialNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner is not found in the empty JSON string", OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("dateOfPurchase") != null && !jsonObj.get("dateOfPurchase").isJsonNull()) && !jsonObj.get("dateOfPurchase").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dateOfPurchase` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dateOfPurchase").toString()));
      }
      if ((jsonObj.get("shipDate") != null && !jsonObj.get("shipDate").isJsonNull()) && !jsonObj.get("shipDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipDate").toString()));
      }
      if ((jsonObj.get("primarySerialNumber") != null && !jsonObj.get("primarySerialNumber").isJsonNull()) && !jsonObj.get("primarySerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primarySerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primarySerialNumber").toString()));
      }
      if ((jsonObj.get("secondarySerialNumber") != null && !jsonObj.get("secondarySerialNumber").isJsonNull()) && !jsonObj.get("secondarySerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondarySerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondarySerialNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner
   */
  public static OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner.class);
  }

  /**
   * Convert an instance of OrderCreateV7RequestLinesInnerWarrantyInfoInnerSerialInfoInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

