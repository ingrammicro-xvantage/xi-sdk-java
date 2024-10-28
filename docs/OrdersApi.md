# OrdersApi

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOrdercancel**](OrdersApi.md#deleteOrdercancel) | **DELETE** /resellers/v6/orders/{OrderNumber} | Cancel your Order |
| [**getOrderdetailsV61**](OrdersApi.md#getOrderdetailsV61) | **GET** /resellers/v6.1/orders/{ordernumber} | Get Order Details v6.1 |
| [**getResellersV6Ordersearch**](OrdersApi.md#getResellersV6Ordersearch) | **GET** /resellers/v6/orders/search | Search your Orders |
| [**postCreateorderV6**](OrdersApi.md#postCreateorderV6) | **POST** /resellers/v6/orders | Create your Order |
| [**postCreateorderV7**](OrdersApi.md#postCreateorderV7) | **POST** /resellers/v7/orders | Create your Order v7 |
| [**putOrdermodify**](OrdersApi.md#putOrdermodify) | **PUT** /resellers/v6/orders/{orderNumber} | Modify your Order |


<a id="deleteOrdercancel"></a>
# **deleteOrdercancel**
> deleteOrdercancel(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, regionCode, imSenderID)

Cancel your Order

This call must be submitted before the order is released to Ingram Micro’s warehouse. The order cannot be canceled once it is released to the warehouse. Order should be on customer hold to delete any order from Ingram system.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderNumber = "20-RD128"; // String | Ingram Micro sales order number.
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems.
    String regionCode = "CS"; // String | Region code for sandbox testing - Not for use in production.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    try {
      apiInstance.deleteOrdercancel(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, regionCode, imSenderID);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#deleteOrdercancel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderNumber** | **String**| Ingram Micro sales order number. | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction accross all the systems. | |
| **regionCode** | **String**| Region code for sandbox testing - Not for use in production. | [optional] |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |

### Return type

null (empty response body)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **400** | Bad Request |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **404** | Not Found |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **405** | Method Not Allowed |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **500** | Internal Server Error |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |

<a id="getOrderdetailsV61"></a>
# **getOrderdetailsV61**
> OrderDetailB2B getOrderdetailsV61(ordernumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, ingramOrderDate, vendorNumber, simulateStatus, isIml, regionCode)

Get Order Details v6.1

The Orders details API endpoint allows a customer to retrieve their Ingram Micro orders details by using the Ingram Micro sales order number as a path parameter. The sales order number, IM-CustomerNumber, IM-CountryCode, and IM-CorrelationID are required parameters.&lt;br&gt;&lt;br&gt;*Service contracts, subscriptions, and license information are unavailable at the moment, this information will be available in the future. &lt;br&gt;&lt;br&gt; Recent bug fixes:   - Fixed duplication of serial numbers in the API response.   - Fixed API time-out issues   - Fixed missing tracking information.   - Implemented enhanced order status.  

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String ordernumber = "20-RD3QV"; // String | The Ingram Micro sales order number.
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany.
    LocalDate ingramOrderDate = LocalDate.parse("Wed May 13 00:00:00 UTC 2020"); // LocalDate | The date and time in UTC format that the order was created.
    String vendorNumber = "vendorNumber_example"; // String | Vendor Number.
    String simulateStatus = "IM::SHIPPED"; // String | Order response for various order statuses. Not for use in production.
    Boolean isIml = true; // Boolean | True/False only for IML customers.
    String regionCode = "regionCode_example"; // String | Region code for sandbox testing - Not for use in production.
    try {
      OrderDetailB2B result = apiInstance.getOrderdetailsV61(ordernumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, ingramOrderDate, vendorNumber, simulateStatus, isIml, regionCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderdetailsV61");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ordernumber** | **String**| The Ingram Micro sales order number. | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction accross all the systems. | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany. | [optional] |
| **ingramOrderDate** | **LocalDate**| The date and time in UTC format that the order was created. | [optional] |
| **vendorNumber** | **String**| Vendor Number. | [optional] |
| **simulateStatus** | **String**| Order response for various order statuses. Not for use in production. | [optional] [enum: IM::SHIPPED, IM::PARTIALLY_SHIPPED, IM::HOLD, IM::INVOICED] |
| **isIml** | **Boolean**| True/False only for IML customers. | [optional] |
| **regionCode** | **String**| Region code for sandbox testing - Not for use in production. | [optional] |

### Return type

[**OrderDetailB2B**](OrderDetailB2B.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **500** | Server Error |  -  |

<a id="getResellersV6Ordersearch"></a>
# **getResellersV6Ordersearch**
> OrderSearchResponse getResellersV6Ordersearch(imCustomerNumber, imCountryCode, imCorrelationID, ingramOrderNumber, orderStatus, orderStatusIn, ingramOrderDate, ingramOrderDateBt, imSenderID, customerOrderNumber, pageSize, pageNumber, endCustomerOrderNumber, invoiceDateBt, shipDateBt, deliveryDateBt, ingramPartNumber, vendorPartNumber, serialNumber, trackingNumber, vendorName, specialBidNumber)

Search your Orders

The Orders Search API endpoint allows a customer to search their Ingram Micro orders by using any of the available query string parameters, customer can search their order by using single query string parameters or combining them together. This endpoint supports the pagination of results.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems.
    String ingramOrderNumber = "ingramOrderNumber_example"; // String | The Ingram Micro order number.
    String orderStatus = "SHIPPED"; // String | Ingram Micro order status.
    List<String> orderStatusIn = Arrays.asList(); // List<String> | Ingram Micro order status(can use it for multiple entries).
    String ingramOrderDate = "2021-04-23"; // String | Search by Order date(yyyy-MM-dd).
    List<String> ingramOrderDateBt = Arrays.asList(); // List<String> | Search with the start and end date(only 2 entries allowed).
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    String customerOrderNumber = "customerOrderNumber_example"; // String | Search using your PO/Order number.
    Integer pageSize = 56; // Integer | The number of records required in the call - max records 100 per page.
    Integer pageNumber = 56; // Integer | The page number reference.
    String endCustomerOrderNumber = "endCustomerOrderNumber_example"; // String | End customer/user purchase order number.
    List<String> invoiceDateBt = Arrays.asList(); // List<String> | Invoice date of order, search with the start and end date(only 2 entries allowed).*Currently, this feature is not available in Australia.
    List<String> shipDateBt = Arrays.asList(); // List<String> | Shipment date of order, search with the start and end date(only 2 entries allowed).
    List<String> deliveryDateBt = Arrays.asList(); // List<String> | The delivery date of the order, search with the start and end date(only 2 entries allowed).*Currently, this feature is not available in Australia
    String ingramPartNumber = "ingramPartNumber_example"; // String | Ingram Micro unique part number for the product.
    String vendorPartNumber = "vendorPartNumber_example"; // String | Vendor’s part number for the product.
    String serialNumber = "serialNumber_example"; // String | A serial number of the product.
    String trackingNumber = "trackingNumber_example"; // String | The tracking number of the order.*Currently, this feature is not available in Australia
    String vendorName = "vendorName_example"; // String | Name of the vendor.
    String specialBidNumber = "specialBidNumber_example"; // String | The bid number provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers.*Currently, this feature is not available in Australia
    try {
      OrderSearchResponse result = apiInstance.getResellersV6Ordersearch(imCustomerNumber, imCountryCode, imCorrelationID, ingramOrderNumber, orderStatus, orderStatusIn, ingramOrderDate, ingramOrderDateBt, imSenderID, customerOrderNumber, pageSize, pageNumber, endCustomerOrderNumber, invoiceDateBt, shipDateBt, deliveryDateBt, ingramPartNumber, vendorPartNumber, serialNumber, trackingNumber, vendorName, specialBidNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getResellersV6Ordersearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction accross all the systems. | |
| **ingramOrderNumber** | **String**| The Ingram Micro order number. | [optional] |
| **orderStatus** | **String**| Ingram Micro order status. | [optional] [enum: SHIPPED, PROCESSING, ON HOLD, BACKORDERED, CANCELLED] |
| **orderStatusIn** | [**List&lt;String&gt;**](String.md)| Ingram Micro order status(can use it for multiple entries). | [optional] |
| **ingramOrderDate** | **String**| Search by Order date(yyyy-MM-dd). | [optional] |
| **ingramOrderDateBt** | [**List&lt;String&gt;**](String.md)| Search with the start and end date(only 2 entries allowed). | [optional] |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |
| **customerOrderNumber** | **String**| Search using your PO/Order number. | [optional] |
| **pageSize** | **Integer**| The number of records required in the call - max records 100 per page. | [optional] |
| **pageNumber** | **Integer**| The page number reference. | [optional] |
| **endCustomerOrderNumber** | **String**| End customer/user purchase order number. | [optional] |
| **invoiceDateBt** | [**List&lt;String&gt;**](String.md)| Invoice date of order, search with the start and end date(only 2 entries allowed).*Currently, this feature is not available in Australia. | [optional] |
| **shipDateBt** | [**List&lt;String&gt;**](String.md)| Shipment date of order, search with the start and end date(only 2 entries allowed). | [optional] |
| **deliveryDateBt** | [**List&lt;String&gt;**](String.md)| The delivery date of the order, search with the start and end date(only 2 entries allowed).*Currently, this feature is not available in Australia | [optional] |
| **ingramPartNumber** | **String**| Ingram Micro unique part number for the product. | [optional] |
| **vendorPartNumber** | **String**| Vendor’s part number for the product. | [optional] |
| **serialNumber** | **String**| A serial number of the product. | [optional] |
| **trackingNumber** | **String**| The tracking number of the order.*Currently, this feature is not available in Australia | [optional] |
| **vendorName** | **String**| Name of the vendor. | [optional] |
| **specialBidNumber** | **String**| The bid number provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers.*Currently, this feature is not available in Australia | [optional] |

### Return type

[**OrderSearchResponse**](OrderSearchResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OrderSearch_Response to be returned |  -  |
| **204** | No Content |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="postCreateorderV6"></a>
# **postCreateorderV6**
> OrderCreateResponse postCreateorderV6(imCustomerNumber, imCountryCode, imCorrelationID, orderCreateRequest, imSenderID)

Create your Order

Instantly create and place orders. The POST API supports stocked SKUs as well as licensing and warranties SKUs. IM-CustomerNumber, IM-CountryCode, IM-SenderID and IM-CorrelationID are required parameters. Ingram Micro recommends that you provide the ingrampartnumber for each SKU contained in each order. NOTE: You must have net terms to use the Ingram Micro Order Create API. Ingram Micro offers trade credit when using our APIs, and repayment is based on net terms. For example, if your net terms agreement is net-30, you will have 30 days to make a full payment. Ingram Micro does not allow credit card transactions for API ordering. 

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems.
    OrderCreateRequest orderCreateRequest = new OrderCreateRequest(); // OrderCreateRequest | 
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    try {
      OrderCreateResponse result = apiInstance.postCreateorderV6(imCustomerNumber, imCountryCode, imCorrelationID, orderCreateRequest, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#postCreateorderV6");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction accross all the systems. | |
| **orderCreateRequest** | [**OrderCreateRequest**](OrderCreateRequest.md)|  | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |

### Return type

[**OrderCreateResponse**](OrderCreateResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **207** | Multi-Status |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **400** | Bad Request |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **500** | Internal Server Error |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |

<a id="postCreateorderV7"></a>
# **postCreateorderV7**
> OrderCreateV7Response201 postCreateorderV7(imCustomerNumber, imCountryCode, imCorrelationID, orderCreateV7Request, imSenderID)

Create your Order v7

The Order Create v7 allows our customers to create orders asynchronously. The customer can create either standard orders using stocked SKUs and/or create a “Quote to Order” using the existing quote which is in “Ready to Order” status, or the customer can create an order using the “Configure to order” (CTO) quote. Upon successful submission of the order create request, a confirmation message will be returned as an API response. &lt;br &gt; &lt;br &gt; Once the order is processed, Ingram Micro will notify customers via webhook using a pre-defined callback URL as an HTTP post regarding the updates related to the order. Upon successful order creation, a notification will be sent via webhook regarding the order details, in the event of any error occurring during the order creation process, an error message will be delivered via webhook. Nightly system unavailability will delay response Async response. &lt;br &gt; &lt;br &gt; The key differentiator between standard ordering and “Quote To Order” is the optional input field in the request body which is “quoteNumber”. If a customer passes the quote number in the request body, the order will be processed as a “Quote To Order” using the details from the quote. Any SKUs, quantity, or price information that are passed in the lines object within the request will be ignored in the case of “Quote To Order”.&lt;br &gt; &lt;br &gt; **Prerequisite:** Pre-defined callback URL &lt;br &gt; &lt;br &gt; **Standard ordering::**&lt;br&gt;&lt;br&gt;Ingram Micro recommends that you provide the ingramPartNumber for each SKU contained in each order. NOTE: You must have net terms to use the Ingram Micro Order Create API. Ingram Micro offers trade credit when using our APIs, and repayment is based on net terms. For example, if your net terms agreement is net 30, you will have 30 days to make a full payment. Ingram Micro does not allow credit card transactions for API ordering. &lt;br&gt;&lt;br&gt;[**Key differences between v6 and v7 Migration**](https://developer.ingrammicro.com/reseller/page/v6-and-v7-migration) &lt;br&gt;&lt;br&gt; &lt;br&gt;&lt;br&gt;**Quote to Order / Configure to Order:**&lt;br&gt;&lt;br&gt;If customers are planning to use Quote to Order or Configure to Order Quotes, it’s recommended to validate the quote using the “Validate Quote” endpoint before creating an order using the quote. Validate Quote endpoint will not only validate the quote but also outline all the mandatory fields required by the vendor at a header level and at the line level which a customer needs to pass to the Quote to Order endpoint request. For a detailed understanding of the “Validate Quote” endpoint, review the “Validate Quote” endpoint documentation. &lt;br&gt;&lt;br&gt; **How it works:**&lt;br&gt;&lt;br&gt;- The customer validates the quote with a quote number from the Validate Quote endpoint.&lt;br&gt;- The customer copies all the mandatory fields required by the vendor and adds them to the QTO request body.&lt;br&gt;- The customer provides all the values for Vendor mandatory fields along with other required information for QTO to create an order.&lt;br&gt;- After the order creation request receipt acknowledgment from the QTO endpoint, all further order creation updates will be provided via webhook push notification.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    OrderCreateV7Request orderCreateV7Request = new OrderCreateV7Request(); // OrderCreateV7Request | 
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    try {
      OrderCreateV7Response201 result = apiInstance.postCreateorderV7(imCustomerNumber, imCountryCode, imCorrelationID, orderCreateV7Request, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#postCreateorderV7");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **orderCreateV7Request** | [**OrderCreateV7Request**](OrderCreateV7Request.md)|  | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |

### Return type

[**OrderCreateV7Response201**](OrderCreateV7Response201.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation response |  -  |
| **201** | Webhook Response |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

<a id="putOrdermodify"></a>
# **putOrdermodify**
> OrderModifyResponse putOrdermodify(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, orderModifyRequest, actionCode, regionCode, imSenderID)

Modify your Order

The Order Modify API endpoint allows for changes to be made to an order after the order creation process as long as the order was created with the customer hold flag.  * Orders can be modified within 24hrs of being placed with the customer hold flag, after 24hrs they are voided if they are not released by the customer.  * Modifying orders that were placed without the customer hold flag is not possible 

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String orderNumber = "20-RC1RD"; // String | Ingram sales order number.
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    OrderModifyRequest orderModifyRequest = new OrderModifyRequest(); // OrderModifyRequest | 
    String actionCode = "release"; // String | Action code to be used for order release.
    String regionCode = "CS"; // String | Region code paramter to be used only for order release functionality.Region code is only for sandbox not for production
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    try {
      OrderModifyResponse result = apiInstance.putOrdermodify(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, orderModifyRequest, actionCode, regionCode, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#putOrdermodify");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderNumber** | **String**| Ingram sales order number. | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **orderModifyRequest** | [**OrderModifyRequest**](OrderModifyRequest.md)|  | |
| **actionCode** | **String**| Action code to be used for order release. | [optional] |
| **regionCode** | **String**| Region code paramter to be used only for order release functionality.Region code is only for sandbox not for production | [optional] |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |

### Return type

[**OrderModifyResponse**](OrderModifyResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **201** | Created |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **207** | Multi-Status |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **400** | Bad Request |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |

