# QuotesV4Api

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postV4Quotedetails**](QuotesV4Api.md#postV4Quotedetails) | **POST** /quotes/v1/quotedetails | Get Quote Details |
| [**postV4Quotesearch**](QuotesV4Api.md#postV4Quotesearch) | **POST** /quotes/v1/quotes | Get Quote List |


<a id="postV4Quotedetails"></a>
# **postV4Quotedetails**
> QuoteDetailsResponse postV4Quotedetails(quoteDetailsRequest)

Get Quote Details

A real-time request to delete a previously accepted order must be submitted before the order is released to Ingram Micro’s warehouse. After release the order is no longer eligible for deletion. Order delete transaction submitted after the order is released will be rejected and will not be applied. *Direct ship orders cannot be deleted. Contact your sales rep for assistance.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.QuotesV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    QuotesV4Api apiInstance = new QuotesV4Api(defaultClient);
    QuoteDetailsRequest quoteDetailsRequest = new QuoteDetailsRequest(); // QuoteDetailsRequest | 
    try {
      QuoteDetailsResponse result = apiInstance.postV4Quotedetails(quoteDetailsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesV4Api#postV4Quotedetails");
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
| **quoteDetailsRequest** | [**QuoteDetailsRequest**](QuoteDetailsRequest.md)|  | [optional] |

### Return type

[**QuoteDetailsResponse**](QuoteDetailsResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postV4Quotesearch"></a>
# **postV4Quotesearch**
> QuoteListResponse postV4Quotesearch(quoteListRequest)

Get Quote List

A real-time request that allows the customer to query Ingram Micro for detailed information for a specific open or shipped order. Orders are searched using Ingram Micro Sales Order Number.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.QuotesV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    QuotesV4Api apiInstance = new QuotesV4Api(defaultClient);
    QuoteListRequest quoteListRequest = new QuoteListRequest(); // QuoteListRequest | 
    try {
      QuoteListResponse result = apiInstance.postV4Quotesearch(quoteListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesV4Api#postV4Quotesearch");
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
| **quoteListRequest** | [**QuoteListRequest**](QuoteListRequest.md)|  | [optional] |

### Return type

[**QuoteListResponse**](QuoteListResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

