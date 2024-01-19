# OrdersV6Api

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrderdetailsV6**](OrdersV6Api.md#getOrderdetailsV6) | **GET** /resellers/v6/orders/{ordernumber} | Get Order Details v6 |


<a id="getOrderdetailsV6"></a>
# **getOrderdetailsV6**
> OrderDetailResponse getOrderdetailsV6(ordernumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, ingramOrderDate, vendorNumber, simulateStatus, isIml, regionCode)

Get Order Details v6

Use your Ingram Micro sales order number to search for existing orders or retrieve existing order details.  The sales order number, IM-CustomerNumber, IM-CountryCode, IM-SenderID and IM-CorrelationID are required parameters.  In a case when the IM sales order number is repeated, you can refine the result by providing for additional filtering.  Use the \&quot;simulateStatus\&quot; query parameter to test the GET order response for various order statuses. This parameter is only available in the sandbox to help with development and testing of the GET order endpoint.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersV6Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersV6Api apiInstance = new OrdersV6Api(defaultClient);
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
      OrderDetailResponse result = apiInstance.getOrderdetailsV6(ordernumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, ingramOrderDate, vendorNumber, simulateStatus, isIml, regionCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV6Api#getOrderdetailsV6");
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

[**OrderDetailResponse**](OrderDetailResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

