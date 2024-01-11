# StockUpdateApi

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**resellersV1WebhooksAvailabilityupdatePost**](StockUpdateApi.md#resellersV1WebhooksAvailabilityupdatePost) | **POST** /resellers/v1/webhooks/availabilityupdate | Stock Update |


<a id="resellersV1WebhooksAvailabilityupdatePost"></a>
# **resellersV1WebhooksAvailabilityupdatePost**
> resellersV1WebhooksAvailabilityupdatePost(targeturl, xHubSignature, availabilityAsyncNotificationRequest)

Stock Update

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StockUpdateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    StockUpdateApi apiInstance = new StockUpdateApi(defaultClient);
    String targeturl = "https://59a2dc5368073ab42fd9a92e210a9fdb.m.pipedream.net/"; // String | The webhook url where the request needs to sent.
    String xHubSignature = "3LeaTfLE5FLj1FcYflwdwFosH4ADHmMbds6thtirGC3e9lEkF9/1pt4T2fQQGlxf40EznDBER0b60M75K6ZW0A=="; // String | Ingram Micro creates a signature token by use of a secret key + Event ID. The algorithm to generate the secret ley is given at link https://developer.ingrammicro.com/reseller/article/how-use-webhook-secret-key. Use the event Id in the below sample along with your secret key to generate the key. Alternatively, to send try this out, use a random text to see how it works.
    AvailabilityAsyncNotificationRequest availabilityAsyncNotificationRequest = new AvailabilityAsyncNotificationRequest(); // AvailabilityAsyncNotificationRequest | 
    try {
      apiInstance.resellersV1WebhooksAvailabilityupdatePost(targeturl, xHubSignature, availabilityAsyncNotificationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling StockUpdateApi#resellersV1WebhooksAvailabilityupdatePost");
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
| **availabilityAsyncNotificationRequest** | [**AvailabilityAsyncNotificationRequest**](AvailabilityAsyncNotificationRequest.md)|  | |

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

