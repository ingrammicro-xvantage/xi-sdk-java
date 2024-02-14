# DealsApi

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResellersV6Dealsdetails**](DealsApi.md#getResellersV6Dealsdetails) | **GET** /resellers/v6/deals/{dealId} | Deals Details |
| [**getResellersV6Dealssearch**](DealsApi.md#getResellersV6Dealssearch) | **GET** /resellers/v6/deals/search | Deals Search |


<a id="getResellersV6Dealsdetails"></a>
# **getResellersV6Dealsdetails**
> DealsDetailsResponse getResellersV6Dealsdetails(imCustomerNumber, imCountryCode, imCorrelationID, imApplicationId, imEnvironment, dealId)

Deals Details

The Deals Details API will retrieve all the details related to the specific deal id.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    DealsApi apiInstance = new DealsApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String imApplicationId = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    String imEnvironment = "20-222222"; // String | Environment name.
    String dealId = "12345678"; // String | Unique deal ID.
    try {
      DealsDetailsResponse result = apiInstance.getResellersV6Dealsdetails(imCustomerNumber, imCountryCode, imCorrelationID, imApplicationId, imEnvironment, dealId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#getResellersV6Dealsdetails");
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
| **imApplicationId** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | |
| **imEnvironment** | **String**| Environment name. | |
| **dealId** | **String**| Unique deal ID. | |

### Return type

[**DealsDetailsResponse**](DealsDetailsResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

<a id="getResellersV6Dealssearch"></a>
# **getResellersV6Dealssearch**
> DealsSearchResponse getResellersV6Dealssearch(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, endUser, vendor, dealId)

Deals Search

The Deals Search API, by default, will retrieve all the deals that are associated with the customer’s account. The customer will be able to search deals using the End-user name, Vendor name, or DealID. 

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.DealsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    DealsApi apiInstance = new DealsApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    String endUser = "EnduserCompany"; // String | The end user/customer's name.
    String vendor = "Cisco"; // String | The vendor's name.
    String dealId = "12345678"; // String | Deal/Special bid number.
    try {
      DealsSearchResponse result = apiInstance.getResellersV6Dealssearch(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, endUser, vendor, dealId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DealsApi#getResellersV6Dealssearch");
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
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |
| **endUser** | **String**| The end user/customer&#39;s name. | [optional] |
| **vendor** | **String**| The vendor&#39;s name. | [optional] |
| **dealId** | **String**| Deal/Special bid number. | [optional] |

### Return type

[**DealsSearchResponse**](DealsSearchResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

