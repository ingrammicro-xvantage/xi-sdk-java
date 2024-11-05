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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderCreateRequestAdditionalAttributesInner;
import xiresellers.client.model.OrderCreateRequestEndUserInfo;
import xiresellers.client.model.OrderCreateRequestLinesInner;
import xiresellers.client.model.OrderCreateRequestResellerInfo;
import xiresellers.client.model.OrderCreateRequestShipToInfo;
import xiresellers.client.model.OrderCreateRequestShipmentDetails;
import xiresellers.client.model.OrderCreateRequestVmf;

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
 * OrderCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T09:22:48.202953Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderCreateRequest {
  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER = "endCustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER)
  private String endCustomerOrderNumber;

  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_ACCEPT_BACK_ORDER = "acceptBackOrder";
  @SerializedName(SERIALIZED_NAME_ACCEPT_BACK_ORDER)
  private Boolean acceptBackOrder;

  public static final String SERIALIZED_NAME_RESELLER_INFO = "resellerInfo";
  @SerializedName(SERIALIZED_NAME_RESELLER_INFO)
  private OrderCreateRequestResellerInfo resellerInfo;

  public static final String SERIALIZED_NAME_VMF = "vmf";
  @SerializedName(SERIALIZED_NAME_VMF)
  private OrderCreateRequestVmf vmf;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private OrderCreateRequestShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private OrderCreateRequestEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<OrderCreateRequestLinesInner> lines = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private OrderCreateRequestShipmentDetails shipmentDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderCreateRequestAdditionalAttributesInner> additionalAttributes = new ArrayList<>();

  public OrderCreateRequest() {
  }

  public OrderCreateRequest customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

  /**
   * The reseller&#39;s unique PO/Order number.
   * @return customerOrderNumber
   */
  @javax.annotation.Nonnull
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public OrderCreateRequest endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

  /**
   * The end user/customer&#39;s Purchase Order number.
   * @return endCustomerOrderNumber
   */
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public OrderCreateRequest billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

  /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit.
   * @return billToAddressId
   */
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public OrderCreateRequest specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

  /**
   * The bid number provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers.
   * @return specialBidNumber
   */
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public OrderCreateRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Order level notes.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderCreateRequest acceptBackOrder(Boolean acceptBackOrder) {
    this.acceptBackOrder = acceptBackOrder;
    return this;
  }

  /**
   * ENUM [\&quot;true\&quot;,\&quot;false\&quot;] - accept order if this item is backordered. This field along with shipComplete field decides the value of backorderflag. The value of this field is ignored when shipComplete field is present.
   * @return acceptBackOrder
   */
  @javax.annotation.Nullable
  public Boolean getAcceptBackOrder() {
    return acceptBackOrder;
  }

  public void setAcceptBackOrder(Boolean acceptBackOrder) {
    this.acceptBackOrder = acceptBackOrder;
  }


  public OrderCreateRequest resellerInfo(OrderCreateRequestResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
    return this;
  }

  /**
   * Get resellerInfo
   * @return resellerInfo
   */
  @javax.annotation.Nullable
  public OrderCreateRequestResellerInfo getResellerInfo() {
    return resellerInfo;
  }

  public void setResellerInfo(OrderCreateRequestResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
  }


  public OrderCreateRequest vmf(OrderCreateRequestVmf vmf) {
    this.vmf = vmf;
    return this;
  }

  /**
   * Get vmf
   * @return vmf
   */
  @javax.annotation.Nullable
  public OrderCreateRequestVmf getVmf() {
    return vmf;
  }

  public void setVmf(OrderCreateRequestVmf vmf) {
    this.vmf = vmf;
  }


  public OrderCreateRequest shipToInfo(OrderCreateRequestShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

  /**
   * Get shipToInfo
   * @return shipToInfo
   */
  @javax.annotation.Nullable
  public OrderCreateRequestShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(OrderCreateRequestShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderCreateRequest endUserInfo(OrderCreateRequestEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

  /**
   * Get endUserInfo
   * @return endUserInfo
   */
  @javax.annotation.Nullable
  public OrderCreateRequestEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(OrderCreateRequestEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public OrderCreateRequest lines(List<OrderCreateRequestLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderCreateRequest addLinesItem(OrderCreateRequestLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * The line-level details of the order.
   * @return lines
   */
  @javax.annotation.Nullable
  public List<OrderCreateRequestLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<OrderCreateRequestLinesInner> lines) {
    this.lines = lines;
  }


  public OrderCreateRequest shipmentDetails(OrderCreateRequestShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  /**
   * Get shipmentDetails
   * @return shipmentDetails
   */
  @javax.annotation.Nullable
  public OrderCreateRequestShipmentDetails getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(OrderCreateRequestShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public OrderCreateRequest additionalAttributes(List<OrderCreateRequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderCreateRequest addAdditionalAttributesItem(OrderCreateRequestAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

  /**
   * Shipment-level additional attributes.
   * @return additionalAttributes
   */
  @javax.annotation.Nullable
  public List<OrderCreateRequestAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderCreateRequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateRequest orderCreateRequest = (OrderCreateRequest) o;
    return Objects.equals(this.customerOrderNumber, orderCreateRequest.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, orderCreateRequest.endCustomerOrderNumber) &&
        Objects.equals(this.billToAddressId, orderCreateRequest.billToAddressId) &&
        Objects.equals(this.specialBidNumber, orderCreateRequest.specialBidNumber) &&
        Objects.equals(this.notes, orderCreateRequest.notes) &&
        Objects.equals(this.acceptBackOrder, orderCreateRequest.acceptBackOrder) &&
        Objects.equals(this.resellerInfo, orderCreateRequest.resellerInfo) &&
        Objects.equals(this.vmf, orderCreateRequest.vmf) &&
        Objects.equals(this.shipToInfo, orderCreateRequest.shipToInfo) &&
        Objects.equals(this.endUserInfo, orderCreateRequest.endUserInfo) &&
        Objects.equals(this.lines, orderCreateRequest.lines) &&
        Objects.equals(this.shipmentDetails, orderCreateRequest.shipmentDetails) &&
        Objects.equals(this.additionalAttributes, orderCreateRequest.additionalAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderNumber, endCustomerOrderNumber, billToAddressId, specialBidNumber, notes, acceptBackOrder, resellerInfo, vmf, shipToInfo, endUserInfo, lines, shipmentDetails, additionalAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateRequest {\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    acceptBackOrder: ").append(toIndentedString(acceptBackOrder)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    vmf: ").append(toIndentedString(vmf)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endCustomerOrderNumber");
    openapiFields.add("billToAddressId");
    openapiFields.add("specialBidNumber");
    openapiFields.add("notes");
    openapiFields.add("acceptBackOrder");
    openapiFields.add("resellerInfo");
    openapiFields.add("vmf");
    openapiFields.add("shipToInfo");
    openapiFields.add("endUserInfo");
    openapiFields.add("lines");
    openapiFields.add("shipmentDetails");
    openapiFields.add("additionalAttributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("customerOrderNumber");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateRequest is not found in the empty JSON string", OrderCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderCreateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endCustomerOrderNumber") != null && !jsonObj.get("endCustomerOrderNumber").isJsonNull()) && !jsonObj.get("endCustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      // validate the optional field `resellerInfo`
      if (jsonObj.get("resellerInfo") != null && !jsonObj.get("resellerInfo").isJsonNull()) {
        OrderCreateRequestResellerInfo.validateJsonElement(jsonObj.get("resellerInfo"));
      }
      // validate the optional field `vmf`
      if (jsonObj.get("vmf") != null && !jsonObj.get("vmf").isJsonNull()) {
        OrderCreateRequestVmf.validateJsonElement(jsonObj.get("vmf"));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderCreateRequestShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        OrderCreateRequestEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
        if (jsonArraylines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
          }

          // validate the optional field `lines` (array)
          for (int i = 0; i < jsonArraylines.size(); i++) {
            OrderCreateRequestLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      // validate the optional field `shipmentDetails`
      if (jsonObj.get("shipmentDetails") != null && !jsonObj.get("shipmentDetails").isJsonNull()) {
        OrderCreateRequestShipmentDetails.validateJsonElement(jsonObj.get("shipmentDetails"));
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
            OrderCreateRequestAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateRequest>() {
           @Override
           public void write(JsonWriter out, OrderCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateRequest
   * @throws IOException if the JSON string is invalid with respect to OrderCreateRequest
   */
  public static OrderCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateRequest.class);
  }

  /**
   * Convert an instance of OrderCreateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

