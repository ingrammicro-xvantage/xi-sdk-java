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
import xiresellers.client.model.OrderCreateV7ResponseResourceOrdersInner;
import xiresellers.client.model.OrderCreateV7ResponseResourceShipToInfo;

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
 * OrderCreateV7ResponseResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:47:59.759396Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderCreateV7ResponseResource {
  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

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
  private OrderCreateV7ResponseResourceShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private List<OrderCreateV7ResponseResourceOrdersInner> orders = new ArrayList<>();

  public OrderCreateV7ResponseResource() {
  }

  public OrderCreateV7ResponseResource customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

  /**
   * The reseller&#39;s unique PO/Order number.
   * @return customerOrderNumber
   */
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public OrderCreateV7ResponseResource billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

  /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit
   * @return billToAddressId
   */
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public OrderCreateV7ResponseResource orderSplit(Boolean orderSplit) {
    this.orderSplit = orderSplit;
    return this;
  }

  /**
   * true for multiple orders
   * @return orderSplit
   */
  @javax.annotation.Nullable
  public Boolean getOrderSplit() {
    return orderSplit;
  }

  public void setOrderSplit(Boolean orderSplit) {
    this.orderSplit = orderSplit;
  }


  public OrderCreateV7ResponseResource processedPartially(Boolean processedPartially) {
    this.processedPartially = processedPartially;
    return this;
  }

  /**
   * true for partial order succesfully placed
   * @return processedPartially
   */
  @javax.annotation.Nullable
  public Boolean getProcessedPartially() {
    return processedPartially;
  }

  public void setProcessedPartially(Boolean processedPartially) {
    this.processedPartially = processedPartially;
  }


  public OrderCreateV7ResponseResource purchaseOrderTotal(BigDecimal purchaseOrderTotal) {
    this.purchaseOrderTotal = purchaseOrderTotal;
    return this;
  }

  /**
   * Total of all the orders including taxes and fees.
   * @return purchaseOrderTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getPurchaseOrderTotal() {
    return purchaseOrderTotal;
  }

  public void setPurchaseOrderTotal(BigDecimal purchaseOrderTotal) {
    this.purchaseOrderTotal = purchaseOrderTotal;
  }


  public OrderCreateV7ResponseResource shipToInfo(OrderCreateV7ResponseResourceShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

  /**
   * Get shipToInfo
   * @return shipToInfo
   */
  @javax.annotation.Nullable
  public OrderCreateV7ResponseResourceShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(OrderCreateV7ResponseResourceShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public OrderCreateV7ResponseResource orders(List<OrderCreateV7ResponseResourceOrdersInner> orders) {
    this.orders = orders;
    return this;
  }

  public OrderCreateV7ResponseResource addOrdersItem(OrderCreateV7ResponseResourceOrdersInner ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

  /**
   * Order-level details.
   * @return orders
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7ResponseResourceOrdersInner> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderCreateV7ResponseResourceOrdersInner> orders) {
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
    OrderCreateV7ResponseResource orderCreateV7ResponseResource = (OrderCreateV7ResponseResource) o;
    return Objects.equals(this.customerOrderNumber, orderCreateV7ResponseResource.customerOrderNumber) &&
        Objects.equals(this.billToAddressId, orderCreateV7ResponseResource.billToAddressId) &&
        Objects.equals(this.orderSplit, orderCreateV7ResponseResource.orderSplit) &&
        Objects.equals(this.processedPartially, orderCreateV7ResponseResource.processedPartially) &&
        Objects.equals(this.purchaseOrderTotal, orderCreateV7ResponseResource.purchaseOrderTotal) &&
        Objects.equals(this.shipToInfo, orderCreateV7ResponseResource.shipToInfo) &&
        Objects.equals(this.orders, orderCreateV7ResponseResource.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerOrderNumber, billToAddressId, orderSplit, processedPartially, purchaseOrderTotal, shipToInfo, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7ResponseResource {\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    orderSplit: ").append(toIndentedString(orderSplit)).append("\n");
    sb.append("    processedPartially: ").append(toIndentedString(processedPartially)).append("\n");
    sb.append("    purchaseOrderTotal: ").append(toIndentedString(purchaseOrderTotal)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
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
    openapiFields.add("billToAddressId");
    openapiFields.add("orderSplit");
    openapiFields.add("processedPartially");
    openapiFields.add("purchaseOrderTotal");
    openapiFields.add("shipToInfo");
    openapiFields.add("orders");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7ResponseResource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7ResponseResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7ResponseResource is not found in the empty JSON string", OrderCreateV7ResponseResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7ResponseResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7ResponseResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        OrderCreateV7ResponseResourceShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
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
            OrderCreateV7ResponseResourceOrdersInner.validateJsonElement(jsonArrayorders.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7ResponseResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7ResponseResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7ResponseResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7ResponseResource.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7ResponseResource>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7ResponseResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7ResponseResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7ResponseResource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7ResponseResource
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7ResponseResource
   */
  public static OrderCreateV7ResponseResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7ResponseResource.class);
  }

  /**
   * Convert an instance of OrderCreateV7ResponseResource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

