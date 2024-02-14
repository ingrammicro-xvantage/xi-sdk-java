# OrderStatusApi

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resellersV1WebhooksOrderstatuseventPost**](OrderStatusApi.md#resellersV1WebhooksOrderstatuseventPost) | **POST** /resellers/v1/webhooks/orderstatusevent | Order Status |


<a id="resellersV1WebhooksOrderstatuseventPost"></a>
# **resellersV1WebhooksOrderstatuseventPost**
> resellersV1WebhooksOrderstatuseventPost(targeturl, xHubSignature, orderStatusAsyncNotificationRequest)

Order Status

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrderStatusApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrderStatusApi apiInstance = new OrderStatusApi(defaultClient);
    String targeturl = "https://59a2dc5368073ab42fd9a92e210a9fdb.m.pipedream.net/"; // String | The webhook url where the request needs to sent.
    String xHubSignature = "3LeaTfLE5FLj1FcYflwdwFosH4ADHmMbds6thtirGC3e9lEkF9/1pt4T2fQQGlxf40EznDBER0b60M75K6ZW0A=="; // String | Ingram Micro creates a signature token by use of a secret key + Event ID. The algorithm to generate the secret ley is given at link https://developer.ingrammicro.com/reseller/article/how-use-webhook-secret-key. Use the event Id in the below sample along with your secret key to generate the key. Alternatively, to send try this out, use a random text to see how it works.
    OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest = new OrderStatusAsyncNotificationRequest(); // OrderStatusAsyncNotificationRequest | 
    try {
      apiInstance.resellersV1WebhooksOrderstatuseventPost(targeturl, xHubSignature, orderStatusAsyncNotificationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderStatusApi#resellersV1WebhooksOrderstatuseventPost");
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
| **targeturl** | **String**| The webhook url where the request needs to sent. | |
| **xHubSignature** | **String**| Ingram Micro creates a signature token by use of a secret key + Event ID. The algorithm to generate the secret ley is given at link https://developer.ingrammicro.com/reseller/article/how-use-webhook-secret-key. Use the event Id in the below sample along with your secret key to generate the key. Alternatively, to send try this out, use a random text to see how it works. | |
| **orderStatusAsyncNotificationRequest** | [**OrderStatusAsyncNotificationRequest**](OrderStatusAsyncNotificationRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

