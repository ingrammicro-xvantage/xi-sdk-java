# AccesstokenApi

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccesstoken**](AccesstokenApi.md#getAccesstoken) | **GET** /oauth/oauth20/token | Accesstoken |


<a id="getAccesstoken"></a>
# **getAccesstoken**
> AccesstokenResponse getAccesstoken(grantType, clientId, clientSecret)

Accesstoken

The Authentication endpoint will provide an access token to access the API.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.models.*;
import xiresellers.client.api.AccesstokenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");

    AccesstokenApi apiInstance = new AccesstokenApi(defaultClient);
    String grantType = "client_credentials"; // String | Keep grant_type as client_credentials only.
    String clientId = "clientId_example"; // String | 
    String clientSecret = "clientSecret_example"; // String | 
    try {
      AccesstokenResponse result = apiInstance.getAccesstoken(grantType, clientId, clientSecret);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccesstokenApi#getAccesstoken");
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
| **grantType** | **String**| Keep grant_type as client_credentials only. | |
| **clientId** | **String**|  | |
| **clientSecret** | **String**|  | |

### Return type

[**AccesstokenResponse**](AccesstokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

