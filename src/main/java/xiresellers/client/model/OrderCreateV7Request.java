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
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.OrderCreateV7RequestAdditionalAttributesInner;
import xiresellers.client.model.OrderCreateV7RequestEndUserInfo;
import xiresellers.client.model.OrderCreateV7RequestLinesInner;
import xiresellers.client.model.OrderCreateV7RequestResellerInfo;
import xiresellers.client.model.OrderCreateV7RequestShipToInfo;
import xiresellers.client.model.OrderCreateV7RequestShipmentDetails;
import xiresellers.client.model.OrderCreateV7RequestVmfAdditionalAttributesInner;

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
 * OrderCreateV7Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T08:54:01.152945Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderCreateV7Request {
  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER = "endCustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_ORDER_NUMBER)
  private String endCustomerOrderNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_ACCEPT_BACK_ORDER = "acceptBackOrder";
  @SerializedName(SERIALIZED_NAME_ACCEPT_BACK_ORDER)
  private Boolean acceptBackOrder;

  public static final String SERIALIZED_NAME_VEND_AUTH_NUMBER = "vendAuthNumber";
  @SerializedName(SERIALIZED_NAME_VEND_AUTH_NUMBER)
  private String vendAuthNumber;

  public static final String SERIALIZED_NAME_RESELLER_INFO = "resellerInfo";
  @SerializedName(SERIALIZED_NAME_RESELLER_INFO)
  private OrderCreateV7RequestResellerInfo resellerInfo;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private OrderCreateV7RequestEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private OrderCreateV7RequestShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private OrderCreateV7RequestShipmentDetails shipmentDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<OrderCreateV7RequestAdditionalAttributesInner> additionalAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES = "vmfAdditionalAttributes";
  @SerializedName(SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES)
  private List<OrderCreateV7RequestVmfAdditionalAttributesInner> vmfAdditionalAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<OrderCreateV7RequestLinesInner> lines = new ArrayList<>();

  public OrderCreateV7Request() {
  }

  public OrderCreateV7Request quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

  /**
   * A unique identifier generated by Ingram Micro&#39;s CRM specific to each quote.
   * @return quoteNumber
   */
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public OrderCreateV7Request customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

  /**
   * The reseller&#39;s order number for reference in their system.
   * @return customerOrderNumber
   */
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public OrderCreateV7Request endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

  /**
   * The end customer&#39;s order number for reference in their system.
   * @return endCustomerOrderNumber
   */
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public OrderCreateV7Request notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Order header level notes.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderCreateV7Request billToAddressId(String billToAddressId) {
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


  public OrderCreateV7Request specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

  /**
   * The bid number is provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers.
   * @return specialBidNumber
   */
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public OrderCreateV7Request acceptBackOrder(Boolean acceptBackOrder) {
    this.acceptBackOrder = acceptBackOrder;
    return this;
  }

  /**
   * ENUM [&#39;true&#39;,&#39;false&#39;] - accept order if this item is backordered. This field along with shipComplete field decides the value of backorderflag. The value of this field is ignored when shipComplete field is present.
   * @return acceptBackOrder
   */
  @javax.annotation.Nullable
  public Boolean getAcceptBackOrder() {
    return acceptBackOrder;
  }

  public void setAcceptBackOrder(Boolean acceptBackOrder) {
    this.acceptBackOrder = acceptBackOrder;
  }


  public OrderCreateV7Request vendAuthNumber(String vendAuthNumber) {
    this.vendAuthNumber = vendAuthNumber;
    return this;
  }

  /**
   * Authorization number provided by vendor to Ingram&#39;s reseller. Orders will be placed on hold without this value, vendor specific mandatory field - please reach out Ingram Sales team for list of vendor for whom this is mandatory.
   * @return vendAuthNumber
   */
  @javax.annotation.Nullable
  public String getVendAuthNumber() {
    return vendAuthNumber;
  }

  public void setVendAuthNumber(String vendAuthNumber) {
    this.vendAuthNumber = vendAuthNumber;
  }


  public OrderCreateV7Request resellerInfo(OrderCreateV7RequestResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
    return this;
  }

  /**
   * Get resellerInfo
   * @return resellerInfo
   */
  @javax.annotation.Nullable
  public OrderCreateV7RequestResellerInfo getResellerInfo() {
    return resellerInfo;
  }

  public void setResellerInfo(OrderCreateV7RequestResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
  }


  public OrderCreateV7Request endUserInfo(OrderCreateV7RequestEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

  /**
   * Get endUserInfo
   * @return endUserInfo
   */
  @javax.annotation.Nullable
  public OrderCreateV7RequestEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(OrderCreateV7RequestEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public OrderCreateV7Request shipToInfo(OrderCreateV7RequestShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

  /**
   * Get shipToInfo
   * @return shipToInfo
   */
  @javax.annotation.Nullable
  public OrderCreateV7RequestShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(OrderCreateV7RequestShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderCreateV7Request shipmentDetails(OrderCreateV7RequestShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

  /**
   * Get shipmentDetails
   * @return shipmentDetails
   */
  @javax.annotation.Nullable
  public OrderCreateV7RequestShipmentDetails getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(OrderCreateV7RequestShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public OrderCreateV7Request additionalAttributes(List<OrderCreateV7RequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public OrderCreateV7Request addAdditionalAttributesItem(OrderCreateV7RequestAdditionalAttributesInner additionalAttributesItem) {
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
  public List<OrderCreateV7RequestAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<OrderCreateV7RequestAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  public OrderCreateV7Request vmfAdditionalAttributes(List<OrderCreateV7RequestVmfAdditionalAttributesInner> vmfAdditionalAttributes) {
    this.vmfAdditionalAttributes = vmfAdditionalAttributes;
    return this;
  }

  public OrderCreateV7Request addVmfAdditionalAttributesItem(OrderCreateV7RequestVmfAdditionalAttributesInner vmfAdditionalAttributesItem) {
    if (this.vmfAdditionalAttributes == null) {
      this.vmfAdditionalAttributes = new ArrayList<>();
    }
    this.vmfAdditionalAttributes.add(vmfAdditionalAttributesItem);
    return this;
  }

  /**
   * The object containing the list of fields required at a header level by the vendor.
   * @return vmfAdditionalAttributes
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7RequestVmfAdditionalAttributesInner> getVmfAdditionalAttributes() {
    return vmfAdditionalAttributes;
  }

  public void setVmfAdditionalAttributes(List<OrderCreateV7RequestVmfAdditionalAttributesInner> vmfAdditionalAttributes) {
    this.vmfAdditionalAttributes = vmfAdditionalAttributes;
  }


  public OrderCreateV7Request lines(List<OrderCreateV7RequestLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderCreateV7Request addLinesItem(OrderCreateV7RequestLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * Get lines
   * @return lines
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7RequestLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<OrderCreateV7RequestLinesInner> lines) {
    this.lines = lines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7Request orderCreateV7Request = (OrderCreateV7Request) o;
    return Objects.equals(this.quoteNumber, orderCreateV7Request.quoteNumber) &&
        Objects.equals(this.customerOrderNumber, orderCreateV7Request.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, orderCreateV7Request.endCustomerOrderNumber) &&
        Objects.equals(this.notes, orderCreateV7Request.notes) &&
        Objects.equals(this.billToAddressId, orderCreateV7Request.billToAddressId) &&
        Objects.equals(this.specialBidNumber, orderCreateV7Request.specialBidNumber) &&
        Objects.equals(this.acceptBackOrder, orderCreateV7Request.acceptBackOrder) &&
        Objects.equals(this.vendAuthNumber, orderCreateV7Request.vendAuthNumber) &&
        Objects.equals(this.resellerInfo, orderCreateV7Request.resellerInfo) &&
        Objects.equals(this.endUserInfo, orderCreateV7Request.endUserInfo) &&
        Objects.equals(this.shipToInfo, orderCreateV7Request.shipToInfo) &&
        Objects.equals(this.shipmentDetails, orderCreateV7Request.shipmentDetails) &&
        Objects.equals(this.additionalAttributes, orderCreateV7Request.additionalAttributes) &&
        Objects.equals(this.vmfAdditionalAttributes, orderCreateV7Request.vmfAdditionalAttributes) &&
        Objects.equals(this.lines, orderCreateV7Request.lines);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteNumber, customerOrderNumber, endCustomerOrderNumber, notes, billToAddressId, specialBidNumber, acceptBackOrder, vendAuthNumber, resellerInfo, endUserInfo, shipToInfo, shipmentDetails, additionalAttributes, vmfAdditionalAttributes, lines);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7Request {\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    acceptBackOrder: ").append(toIndentedString(acceptBackOrder)).append("\n");
    sb.append("    vendAuthNumber: ").append(toIndentedString(vendAuthNumber)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    vmfAdditionalAttributes: ").append(toIndentedString(vmfAdditionalAttributes)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
    openapiFields.add("quoteNumber");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endCustomerOrderNumber");
    openapiFields.add("notes");
    openapiFields.add("billToAddressId");
    openapiFields.add("specialBidNumber");
    openapiFields.add("acceptBackOrder");
    openapiFields.add("vendAuthNumber");
    openapiFields.add("resellerInfo");
    openapiFields.add("endUserInfo");
    openapiFields.add("shipToInfo");
    openapiFields.add("shipmentDetails");
    openapiFields.add("additionalAttributes");
    openapiFields.add("vmfAdditionalAttributes");
    openapiFields.add("lines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7Request
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7Request.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7Request is not found in the empty JSON string", OrderCreateV7Request.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7Request.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7Request` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endCustomerOrderNumber") != null && !jsonObj.get("endCustomerOrderNumber").isJsonNull()) && !jsonObj.get("endCustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endCustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endCustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("vendAuthNumber") != null && !jsonObj.get("vendAuthNumber").isJsonNull()) && !jsonObj.get("vendAuthNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendAuthNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendAuthNumber").toString()));
      }
      // validate the optional field `resellerInfo`
      if (jsonObj.get("resellerInfo") != null && !jsonObj.get("resellerInfo").isJsonNull()) {
        OrderCreateV7RequestResellerInfo.validateJsonElement(jsonObj.get("resellerInfo"));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        OrderCreateV7RequestEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderCreateV7RequestShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      // validate the optional field `shipmentDetails`
      if (jsonObj.get("shipmentDetails") != null && !jsonObj.get("shipmentDetails").isJsonNull()) {
        OrderCreateV7RequestShipmentDetails.validateJsonElement(jsonObj.get("shipmentDetails"));
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
            OrderCreateV7RequestAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("vmfAdditionalAttributes") != null && !jsonObj.get("vmfAdditionalAttributes").isJsonNull()) {
        JsonArray jsonArrayvmfAdditionalAttributes = jsonObj.getAsJsonArray("vmfAdditionalAttributes");
        if (jsonArrayvmfAdditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vmfAdditionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vmfAdditionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("vmfAdditionalAttributes").toString()));
          }

          // validate the optional field `vmfAdditionalAttributes` (array)
          for (int i = 0; i < jsonArrayvmfAdditionalAttributes.size(); i++) {
            OrderCreateV7RequestVmfAdditionalAttributesInner.validateJsonElement(jsonArrayvmfAdditionalAttributes.get(i));
          };
        }
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
            OrderCreateV7RequestLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7Request.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7Request>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7Request given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7Request
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7Request
   */
  public static OrderCreateV7Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7Request.class);
  }

  /**
   * Convert an instance of OrderCreateV7Request to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

