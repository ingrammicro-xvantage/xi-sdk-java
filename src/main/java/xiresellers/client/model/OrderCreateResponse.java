/*
 * XI SDK Resellers
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xiresellers.client.model.OrderCreateResponseEndUserInfo;
import xiresellers.client.model.OrderCreateResponseOrdersInner;
import xiresellers.client.model.OrderCreateResponseShipToInfo;

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
 * OrderCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-16T05:46:16.662413Z[Etc/UTC]")
public class OrderCreateResponse {
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

  public static final String SERIALIZED_NAME_ORDER_SPLIT = "orderSplit";
  @SerializedName(SERIALIZED_NAME_ORDER_SPLIT)
  private Boolean orderSplit;

  public static final String SERIALIZED_NAME_PROCESSED_PARTIALLY = "processedPartially";
  @SerializedName(SERIALIZED_NAME_PROCESSED_PARTIALLY)
  private Boolean processedPartially;

  public static final String SERIALIZED_NAME_PURCHASE_ORDER_TOTAL = "purchaseOrderTotal";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER_TOTAL)
  private BigDecimal purchaseOrderTotal;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private OrderCreateResponseShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private OrderCreateResponseEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private List<OrderCreateResponseOrdersInner> orders;

  public OrderCreateResponse() {
  }

  public OrderCreateResponse customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

   /**
   * The reseller&#39;s unique PO/Order number.
   * @return customerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public OrderCreateResponse endCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
    return this;
  }

   /**
   * The end user/customer&#39;s Purchase Order number.
   * @return endCustomerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getEndCustomerOrderNumber() {
    return endCustomerOrderNumber;
  }

  public void setEndCustomerOrderNumber(String endCustomerOrderNumber) {
    this.endCustomerOrderNumber = endCustomerOrderNumber;
  }


  public OrderCreateResponse billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

   /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit
   * @return billToAddressId
  **/
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public OrderCreateResponse specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * The bid number provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers.
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public OrderCreateResponse orderSplit(Boolean orderSplit) {
    this.orderSplit = orderSplit;
    return this;
  }

   /**
   * true for multiple orders
   * @return orderSplit
  **/
  @javax.annotation.Nullable
  public Boolean getOrderSplit() {
    return orderSplit;
  }

  public void setOrderSplit(Boolean orderSplit) {
    this.orderSplit = orderSplit;
  }


  public OrderCreateResponse processedPartially(Boolean processedPartially) {
    this.processedPartially = processedPartially;
    return this;
  }

   /**
   * true for partial order succesfully placed
   * @return processedPartially
  **/
  @javax.annotation.Nullable
  public Boolean getProcessedPartially() {
    return processedPartially;
  }

  public void setProcessedPartially(Boolean processedPartially) {
    this.processedPartially = processedPartially;
  }


  public OrderCreateResponse purchaseOrderTotal(BigDecimal purchaseOrderTotal) {
    this.purchaseOrderTotal = purchaseOrderTotal;
    return this;
  }

   /**
   * Total of all the orders including taxes and fees.
   * @return purchaseOrderTotal
  **/
  @javax.annotation.Nullable
  public BigDecimal getPurchaseOrderTotal() {
    return purchaseOrderTotal;
  }

  public void setPurchaseOrderTotal(BigDecimal purchaseOrderTotal) {
    this.purchaseOrderTotal = purchaseOrderTotal;
  }


  public OrderCreateResponse shipToInfo(OrderCreateResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

   /**
   * Get shipToInfo
   * @return shipToInfo
  **/
  @javax.annotation.Nullable
  public OrderCreateResponseShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(OrderCreateResponseShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderCreateResponse endUserInfo(OrderCreateResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

   /**
   * Get endUserInfo
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public OrderCreateResponseEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(OrderCreateResponseEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public OrderCreateResponse orders(List<OrderCreateResponseOrdersInner> orders) {
    this.orders = orders;
    return this;
  }

  public OrderCreateResponse addOrdersItem(OrderCreateResponseOrdersInner ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Order-level details.
   * @return orders
  **/
  @javax.annotation.Nullable
  public List<OrderCreateResponseOrdersInner> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderCreateResponseOrdersInner> orders) {
    this.orders = orders;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateResponse orderCreateResponse = (OrderCreateResponse) o;
    return Objects.equals(this.customerOrderNumber, orderCreateResponse.customerOrderNumber) &&
        Objects.equals(this.endCustomerOrderNumber, orderCreateResponse.endCustomerOrderNumber) &&
        Objects.equals(this.billToAddressId, orderCreateResponse.billToAddressId) &&
        Objects.equals(this.specialBidNumber, orderCreateResponse.specialBidNumber) &&
        Objects.equals(this.orderSplit, orderCreateResponse.orderSplit) &&
        Objects.equals(this.processedPartially, orderCreateResponse.processedPartially) &&
        Objects.equals(this.purchaseOrderTotal, orderCreateResponse.purchaseOrderTotal) &&
        Objects.equals(this.shipToInfo, orderCreateResponse.shipToInfo) &&
        Objects.equals(this.endUserInfo, orderCreateResponse.endUserInfo) &&
        Objects.equals(this.orders, orderCreateResponse.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderNumber, endCustomerOrderNumber, billToAddressId, specialBidNumber, orderSplit, processedPartially, purchaseOrderTotal, shipToInfo, endUserInfo, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateResponse {\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endCustomerOrderNumber: ").append(toIndentedString(endCustomerOrderNumber)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    orderSplit: ").append(toIndentedString(orderSplit)).append("\n");
    sb.append("    processedPartially: ").append(toIndentedString(processedPartially)).append("\n");
    sb.append("    purchaseOrderTotal: ").append(toIndentedString(purchaseOrderTotal)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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
    openapiFields.add("orderSplit");
    openapiFields.add("processedPartially");
    openapiFields.add("purchaseOrderTotal");
    openapiFields.add("shipToInfo");
    openapiFields.add("endUserInfo");
    openapiFields.add("orders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderCreateResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateResponse is not found in the empty JSON string", OrderCreateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
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
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderCreateResponseShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        OrderCreateResponseEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      if (jsonObj.get("orders") != null && !jsonObj.get("orders").isJsonNull()) {
        JsonArray jsonArrayorders = jsonObj.getAsJsonArray("orders");
        if (jsonArrayorders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("orders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `orders` to be an array in the JSON string but got `%s`", jsonObj.get("orders").toString()));
          }

          // validate the optional field `orders` (array)
          for (int i = 0; i < jsonArrayorders.size(); i++) {
            OrderCreateResponseOrdersInner.validateJsonElement(jsonArrayorders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateResponse>() {
           @Override
           public void write(JsonWriter out, OrderCreateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderCreateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderCreateResponse
  * @throws IOException if the JSON string is invalid with respect to OrderCreateResponse
  */
  public static OrderCreateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateResponse.class);
  }

 /**
  * Convert an instance of OrderCreateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

