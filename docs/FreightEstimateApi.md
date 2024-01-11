# FreightEstimateApi

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postFreightestimate**](FreightEstimateApi.md#postFreightestimate) | **POST** /resellers/v6/freightestimate | Freight Estimate |


<a id="postFreightestimate"></a>
# **postFreightestimate**
> FreightResponse postFreightestimate(imCustomerNumber, imCountryCode, imCorrelationID, imCustomerContact, imSenderID, freightRequest)

Freight Estimate

The freight estimator endpoint will allow customers to understand the freight cost for an order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FreightEstimateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    FreightEstimateApi apiInstance = new FreightEstimateApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String imCustomerContact = "John.Doe@reseller.com"; // String | Logged in Users email address contact.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction.
    FreightRequest freightRequest = new FreightRequest(); // FreightRequest | 
    try {
      FreightResponse result = apiInstance.postFreightestimate(imCustomerNumber, imCountryCode, imCorrelationID, imCustomerContact, imSenderID, freightRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FreightEstimateApi#postFreightestimate");
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
| **imCustomerContact** | **String**| Logged in Users email address contact. | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. | [optional] |
| **freightRequest** | [**FreightRequest**](FreightRequest.md)|  | [optional] |

### Return type

[**FreightResponse**](FreightResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Error: Bad Request |  -  |
| **500** | Internal Server Error |  -  |

