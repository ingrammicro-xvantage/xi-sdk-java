# QuoteToOrderApi

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postQuoteToOrderV6**](QuoteToOrderApi.md#postQuoteToOrderV6) | **POST** /resellers/v6/q2o/orders | Quote To Order |


<a id="postQuoteToOrderV6"></a>
# **postQuoteToOrderV6**
> QuoteToOrderResponse postQuoteToOrderV6(imCustomerNumber, imCountryCode, imCorrelationID, quoteToOrderDetailsDTO, imSenderID)

Quote To Order

The “Quote to Order” (QTO) endpoint allows a customer to create an order using the existing quote which is in “Ready to Order” status. A customer can create an order using Configure to order (CTO) quote or a non-configure to order (Non-CTO) quote. Upon successful submission of the order create request, a confirmation message will be returned as an API response. &lt;br &gt; &lt;br &gt;Ingram Micro offers webhooks as a method to send notifications to Resellers once the order creation request is received. All the updates related to Order creation will be pushed as a notification to the customer via a pre-defined callback URL as an HTTP post. &lt;br &gt; &lt;br &gt; **Prerequisite:** Pre-defined callback URL &lt;br &gt; &lt;br &gt; Before creating an order using the quote, it’s recommended to validate the quote using the “Validate Quote” endpoint. Validate Quote endpoint will not only validate the quote but also outline all the mandatory fields required by the vendor at a header level and at the line level which a customer need to pass to the Quote To Order endpoint request.  For a detailed understanding of the “Validate Quote” endpoint, review the “Validate Quote” endpoint documentation. &lt;br &gt;&lt;br &gt; **How it works:** &lt;br &gt;&lt;br &gt; - The customer validates the quote with a quote number from Validate Quote endpoint. &lt;br &gt; - The customer copies all the mandatory fields required by the vendor and adds them to the QTO request body. &lt;br &gt; - The customer provides all the values for Vendor mandatory fields along with other required information for QTO to create an order. &lt;br &gt; - After the order creation request receipt acknowledgment from the QTO endpoint, all further order creation updates will be provided via webhook push notification.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.QuoteToOrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    QuoteToOrderApi apiInstance = new QuoteToOrderApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems.
    QuoteToOrderDetailsDTO quoteToOrderDetailsDTO = new QuoteToOrderDetailsDTO(); // QuoteToOrderDetailsDTO | 
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction.
    try {
      QuoteToOrderResponse result = apiInstance.postQuoteToOrderV6(imCustomerNumber, imCountryCode, imCorrelationID, quoteToOrderDetailsDTO, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuoteToOrderApi#postQuoteToOrderV6");
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
| **quoteToOrderDetailsDTO** | [**QuoteToOrderDetailsDTO**](QuoteToOrderDetailsDTO.md)|  | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. | [optional] |

### Return type

[**QuoteToOrderResponse**](QuoteToOrderResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

