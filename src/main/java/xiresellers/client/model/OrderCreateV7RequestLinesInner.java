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
import xiresellers.client.model.OrderCreateV7RequestLinesInnerAdditionalAttributesInner;
import xiresellers.client.model.OrderCreateV7RequestLinesInnerEndUserInfoInner;
import xiresellers.client.model.OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner;
import xiresellers.client.model.OrderCreateV7RequestLinesInnerWarrantyInfoInner;

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
 * OrderCreateV7RequestLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T04:33:02.050337Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderCreateV7RequestLinesInner {
  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_UNIT_PRICE = "unitPrice";
  @SerializedName(SERIALIZED_NAME_UNIT_PRICE)
  private BigDecimal unitPrice;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_END_USER_PRICE = "endUserPrice";
  @SerializedName(SERIALIZED_NAME_END_USER_PRICE)
  private BigDecimal endUserPrice;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private List<OrderCreateV7RequestLinesInnerEndUserInfoInner> endUserInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderCreateV7RequestLinesInnerAdditionalAttributesInner> additionalAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_WARRANTY_INFO = "warrantyInfo";
  @SerializedName(SERIALIZED_NAME_WARRANTY_INFO)
  private List<OrderCreateV7RequestLinesInnerWarrantyInfoInner> warrantyInfo = new ArrayList<>();

  public static final String SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES_LINES = "vmfAdditionalAttributesLines";
  @SerializedName(SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES_LINES)
  private List<OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner> vmfAdditionalAttributesLines = new ArrayList<>();

  public OrderCreateV7RequestLinesInner() {
  }

  public OrderCreateV7RequestLinesInner customerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

  /**
   * The reseller&#39;s line item number for reference in their system. The customer line number needs to be a unique numeric value between 1 and 884. In the event we receive duplicate values or alphanumeric values in the customer line number, we will re-sequence the customer line number. To prevent re-sequencing, please use a unique numeric value between 1 and 884 in the customer line number.
   * @return customerLineNumber
   */
  @javax.annotation.Nullable
  public String getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public OrderCreateV7RequestLinesInner ingramPartNumber(String ingramPartNumber) {
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


  public OrderCreateV7RequestLinesInner vendorPartNumber(String vendorPartNumber) {
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


  public OrderCreateV7RequestLinesInner quantity(Integer quantity) {
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


  public OrderCreateV7RequestLinesInner unitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * The reseller-requested unit price for the line item. The unit price is not guaranteed.
   * @return unitPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderCreateV7RequestLinesInner specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

  /**
   * The line-level bid number provided to the reseller by the vendor for special pricing and discounts. Used to track the bid number in the case of split orders or where different line items have different bid numbers. Line-level bid number take precedence over header-level bid numbers.
   * @return specialBidNumber
   */
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public OrderCreateV7RequestLinesInner endUserPrice(BigDecimal endUserPrice) {
    this.endUserPrice = endUserPrice;
    return this;
  }

  /**
   * The end-user price. Required for Export Orders.
   * @return endUserPrice
   */
  @javax.annotation.Nullable
  public BigDecimal getEndUserPrice() {
    return endUserPrice;
  }

  public void setEndUserPrice(BigDecimal endUserPrice) {
    this.endUserPrice = endUserPrice;
  }


  public OrderCreateV7RequestLinesInner notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * The attribute field data.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderCreateV7RequestLinesInner endUserInfo(List<OrderCreateV7RequestLinesInnerEndUserInfoInner> endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

  public OrderCreateV7RequestLinesInner addEndUserInfoItem(OrderCreateV7RequestLinesInnerEndUserInfoInner endUserInfoItem) {
    if (this.endUserInfo == null) {
      this.endUserInfo = new ArrayList<>();
    }
    this.endUserInfo.add(endUserInfoItem);
    return this;
  }

  /**
   * Get endUserInfo
   * @return endUserInfo
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7RequestLinesInnerEndUserInfoInner> getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(List<OrderCreateV7RequestLinesInnerEndUserInfoInner> endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public OrderCreateV7RequestLinesInner additionalAttributes(List<OrderCreateV7RequestLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderCreateV7RequestLinesInner addAdditionalAttributesItem(OrderCreateV7RequestLinesInnerAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

  /**
   * Get additionalAttributes
   * @return additionalAttributes
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7RequestLinesInnerAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderCreateV7RequestLinesInnerAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  public OrderCreateV7RequestLinesInner warrantyInfo(List<OrderCreateV7RequestLinesInnerWarrantyInfoInner> warrantyInfo) {
    this.warrantyInfo = warrantyInfo;
    return this;
  }

  public OrderCreateV7RequestLinesInner addWarrantyInfoItem(OrderCreateV7RequestLinesInnerWarrantyInfoInner warrantyInfoItem) {
    if (this.warrantyInfo == null) {
      this.warrantyInfo = new ArrayList<>();
    }
    this.warrantyInfo.add(warrantyInfoItem);
    return this;
  }

  /**
   * Get warrantyInfo
   * @return warrantyInfo
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7RequestLinesInnerWarrantyInfoInner> getWarrantyInfo() {
    return warrantyInfo;
  }

  public void setWarrantyInfo(List<OrderCreateV7RequestLinesInnerWarrantyInfoInner> warrantyInfo) {
    this.warrantyInfo = warrantyInfo;
  }


  public OrderCreateV7RequestLinesInner vmfAdditionalAttributesLines(List<OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner> vmfAdditionalAttributesLines) {
    this.vmfAdditionalAttributesLines = vmfAdditionalAttributesLines;
    return this;
  }

  public OrderCreateV7RequestLinesInner addVmfAdditionalAttributesLinesItem(OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner vmfAdditionalAttributesLinesItem) {
    if (this.vmfAdditionalAttributesLines == null) {
      this.vmfAdditionalAttributesLines = new ArrayList<>();
    }
    this.vmfAdditionalAttributesLines.add(vmfAdditionalAttributesLinesItem);
    return this;
  }

  /**
   * Get vmfAdditionalAttributesLines
   * @return vmfAdditionalAttributesLines
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner> getVmfAdditionalAttributesLines() {
    return vmfAdditionalAttributesLines;
  }

  public void setVmfAdditionalAttributesLines(List<OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner> vmfAdditionalAttributesLines) {
    this.vmfAdditionalAttributesLines = vmfAdditionalAttributesLines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7RequestLinesInner orderCreateV7RequestLinesInner = (OrderCreateV7RequestLinesInner) o;
    return Objects.equals(this.customerLineNumber, orderCreateV7RequestLinesInner.customerLineNumber) &&
        Objects.equals(this.ingramPartNumber, orderCreateV7RequestLinesInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, orderCreateV7RequestLinesInner.vendorPartNumber) &&
        Objects.equals(this.quantity, orderCreateV7RequestLinesInner.quantity) &&
        Objects.equals(this.unitPrice, orderCreateV7RequestLinesInner.unitPrice) &&
        Objects.equals(this.specialBidNumber, orderCreateV7RequestLinesInner.specialBidNumber) &&
        Objects.equals(this.endUserPrice, orderCreateV7RequestLinesInner.endUserPrice) &&
        Objects.equals(this.notes, orderCreateV7RequestLinesInner.notes) &&
        Objects.equals(this.endUserInfo, orderCreateV7RequestLinesInner.endUserInfo) &&
        Objects.equals(this.additionalAttributes, orderCreateV7RequestLinesInner.additionalAttributes) &&
        Objects.equals(this.warrantyInfo, orderCreateV7RequestLinesInner.warrantyInfo) &&
        Objects.equals(this.vmfAdditionalAttributesLines, orderCreateV7RequestLinesInner.vmfAdditionalAttributesLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerLineNumber, ingramPartNumber, vendorPartNumber, quantity, unitPrice, specialBidNumber, endUserPrice, notes, endUserInfo, additionalAttributes, warrantyInfo, vmfAdditionalAttributesLines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7RequestLinesInner {\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    endUserPrice: ").append(toIndentedString(endUserPrice)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    warrantyInfo: ").append(toIndentedString(warrantyInfo)).append("\n");
    sb.append("    vmfAdditionalAttributesLines: ").append(toIndentedString(vmfAdditionalAttributesLines)).append("\n");
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
    openapiFields.add("customerLineNumber");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("quantity");
    openapiFields.add("unitPrice");
    openapiFields.add("specialBidNumber");
    openapiFields.add("endUserPrice");
    openapiFields.add("notes");
    openapiFields.add("endUserInfo");
    openapiFields.add("additionalAttributes");
    openapiFields.add("warrantyInfo");
    openapiFields.add("vmfAdditionalAttributesLines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7RequestLinesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7RequestLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7RequestLinesInner is not found in the empty JSON string", OrderCreateV7RequestLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7RequestLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7RequestLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerLineNumber") != null && !jsonObj.get("customerLineNumber").isJsonNull()) && !jsonObj.get("customerLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLineNumber").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        JsonArray jsonArrayendUserInfo = jsonObj.getAsJsonArray("endUserInfo");
        if (jsonArrayendUserInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("endUserInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `endUserInfo` to be an array in the JSON string but got `%s`", jsonObj.get("endUserInfo").toString()));
          }

          // validate the optional field `endUserInfo` (array)
          for (int i = 0; i < jsonArrayendUserInfo.size(); i++) {
            OrderCreateV7RequestLinesInnerEndUserInfoInner.validateJsonElement(jsonArrayendUserInfo.get(i));
          };
        }
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            OrderCreateV7RequestLinesInnerAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("warrantyInfo") != null && !jsonObj.get("warrantyInfo").isJsonNull()) {
        JsonArray jsonArraywarrantyInfo = jsonObj.getAsJsonArray("warrantyInfo");
        if (jsonArraywarrantyInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warrantyInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warrantyInfo` to be an array in the JSON string but got `%s`", jsonObj.get("warrantyInfo").toString()));
          }

          // validate the optional field `warrantyInfo` (array)
          for (int i = 0; i < jsonArraywarrantyInfo.size(); i++) {
            OrderCreateV7RequestLinesInnerWarrantyInfoInner.validateJsonElement(jsonArraywarrantyInfo.get(i));
          };
        }
      }
      if (jsonObj.get("vmfAdditionalAttributesLines") != null && !jsonObj.get("vmfAdditionalAttributesLines").isJsonNull()) {
        JsonArray jsonArrayvmfAdditionalAttributesLines = jsonObj.getAsJsonArray("vmfAdditionalAttributesLines");
        if (jsonArrayvmfAdditionalAttributesLines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vmfAdditionalAttributesLines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vmfAdditionalAttributesLines` to be an array in the JSON string but got `%s`", jsonObj.get("vmfAdditionalAttributesLines").toString()));
          }

          // validate the optional field `vmfAdditionalAttributesLines` (array)
          for (int i = 0; i < jsonArrayvmfAdditionalAttributesLines.size(); i++) {
            OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner.validateJsonElement(jsonArrayvmfAdditionalAttributesLines.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7RequestLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7RequestLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7RequestLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7RequestLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7RequestLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7RequestLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7RequestLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7RequestLinesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7RequestLinesInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7RequestLinesInner
   */
  public static OrderCreateV7RequestLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7RequestLinesInner.class);
  }

  /**
   * Convert an instance of OrderCreateV7RequestLinesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

