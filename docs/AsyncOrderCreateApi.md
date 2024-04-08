# AsyncOrderCreateApi

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postAsyncOrderCreateV7**](AsyncOrderCreateApi.md#postAsyncOrderCreateV7) | **POST** /resellers/v7/orders | Async Order Create |


<a id="postAsyncOrderCreateV7"></a>
# **postAsyncOrderCreateV7**
> AsyncOrderCreateResponse postAsyncOrderCreateV7(imCustomerNumber, imCountryCode, imCorrelationID, asyncOrderCreateDTO, imSenderID)

Async Order Create

This API will allow customers to perform both standard ordering and quote to order functionality via a single API enabling them to have a single endpoint to cater to all types of orders.  This approach will standardize the ordering flow for customers where they will get the response for all orders on to their webhooks.  It provides the much-awaited async ordering flow for Reseller API where large orders can also be placed via a single API with guaranteed delivery. 

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.AsyncOrderCreateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    AsyncOrderCreateApi apiInstance = new AsyncOrderCreateApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems.
    AsyncOrderCreateDTO asyncOrderCreateDTO = new AsyncOrderCreateDTO(); // AsyncOrderCreateDTO | 
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction.
    try {
      AsyncOrderCreateResponse result = apiInstance.postAsyncOrderCreateV7(imCustomerNumber, imCountryCode, imCorrelationID, asyncOrderCreateDTO, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AsyncOrderCreateApi#postAsyncOrderCreateV7");
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
| **asyncOrderCreateDTO** | [**AsyncOrderCreateDTO**](AsyncOrderCreateDTO.md)|  | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. | [optional] |

### Return type

[**AsyncOrderCreateResponse**](AsyncOrderCreateResponse.md)

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

