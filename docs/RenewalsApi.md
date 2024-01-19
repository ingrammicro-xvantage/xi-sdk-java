# RenewalsApi

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResellersV6Renewalsdetails**](RenewalsApi.md#getResellersV6Renewalsdetails) | **GET** /resellers/v6/renewals/{renewalId} | Renewals Details |
| [**postRenewalssearch**](RenewalsApi.md#postRenewalssearch) | **POST** /resellers/v6/renewals/search | Renewals Search |


<a id="getResellersV6Renewalsdetails"></a>
# **getResellersV6Renewalsdetails**
> RenewalsDetailsResponse getResellersV6Renewalsdetails(imCustomerNumber, imCountryCode, imCorrelationID, renewalId, imSenderID)

Renewals Details

The Renewal Details API endpoint will retrieve all the details related to the renewal. The customer is required to pass renewalId as a path parameter while sending a request.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.RenewalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    RenewalsApi apiInstance = new RenewalsApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String renewalId = "123456"; // String | Unique Ingram renewal ID.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    try {
      RenewalsDetailsResponse result = apiInstance.getResellersV6Renewalsdetails(imCustomerNumber, imCountryCode, imCorrelationID, renewalId, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RenewalsApi#getResellersV6Renewalsdetails");
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
| **renewalId** | **String**| Unique Ingram renewal ID. | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |

### Return type

[**RenewalsDetailsResponse**](RenewalsDetailsResponse.md)

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

<a id="postRenewalssearch"></a>
# **postRenewalssearch**
> RenewalsSearchResponse postRenewalssearch(imCustomerNumber, imCountryCode, imCorrelationID, contentType, imSenderID, customerOrderNumber, ingramPurchaseOrderNumber, serialNumber, page, size, sort, renewalsSearchRequest)

Renewals Search

The Renewal Search API, by default, will retrieve all the renewals that are associated with the customer’s account. The customer will be able to search for renewals via basic search or advanced search. Basic search is available thru the query string parameters, whereas the advanced search is available thru the request body schema. 

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.RenewalsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    RenewalsApi apiInstance = new RenewalsApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String contentType = "application/json"; // String | The media type for JSON Request.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    String customerOrderNumber = "customerOrderNumber_example"; // String | The reseller's unique PO/Order number.
    String ingramPurchaseOrderNumber = "ingramPurchaseOrderNumber_example"; // String | Sales order number.
    String serialNumber = "serialNumber_example"; // String | A serial number of the product.
    String page = "page_example"; // String | Number of page.
    String size = "size_example"; // String | The submitted pagesize, default is 25.
    String sort = "sort_example"; // String | Refers to the column selected to apply the sorting criteria.
    RenewalsSearchRequest renewalsSearchRequest = new RenewalsSearchRequest(); // RenewalsSearchRequest | 
    try {
      RenewalsSearchResponse result = apiInstance.postRenewalssearch(imCustomerNumber, imCountryCode, imCorrelationID, contentType, imSenderID, customerOrderNumber, ingramPurchaseOrderNumber, serialNumber, page, size, sort, renewalsSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RenewalsApi#postRenewalssearch");
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
| **contentType** | **String**| The media type for JSON Request. | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |
| **customerOrderNumber** | **String**| The reseller&#39;s unique PO/Order number. | [optional] |
| **ingramPurchaseOrderNumber** | **String**| Sales order number. | [optional] |
| **serialNumber** | **String**| A serial number of the product. | [optional] |
| **page** | **String**| Number of page. | [optional] |
| **size** | **String**| The submitted pagesize, default is 25. | [optional] |
| **sort** | **String**| Refers to the column selected to apply the sorting criteria. | [optional] |
| **renewalsSearchRequest** | [**RenewalsSearchRequest**](RenewalsSearchRequest.md)|  | [optional] |

### Return type

[**RenewalsSearchResponse**](RenewalsSearchResponse.md)

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

