# QuotesV5Api

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getV5QuotesDetails**](QuotesV5Api.md#getV5QuotesDetails) | **GET** /resellers/v5/quote/{quoteNumber} | Get Quote Details |
| [**postV5QuotesSearch**](QuotesV5Api.md#postV5QuotesSearch) | **POST** /resellers/v5/quote/search | Search Quotes |


<a id="getV5QuotesDetails"></a>
# **getV5QuotesDetails**
> QuoteDetails getV5QuotesDetails(quoteNumber, customerNumber, isoCountryCode, thirdPartySource)

Get Quote Details

The quote details API provides all quote details associated with the quote number provided.   The “&lt;strong&gt;quoteNumber&lt;/strong&gt;”, “&lt;strong&gt;isoCountryCode&lt;/strong&gt;” and “&lt;strong&gt;customerNumber&lt;/strong&gt;” parameters are required.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.QuotesV5Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    QuotesV5Api apiInstance = new QuotesV5Api(defaultClient);
    String quoteNumber = "QUO-25576-C8S2W7"; // String | Ingram Micro Quote Number
    String customerNumber = "20-222222"; // String | Your Ingram Micro unique customer number
    String isoCountryCode = "US"; // String | 
    String thirdPartySource = "customer"; // String | Unique identifier used to identify the third party source accessing the services
    try {
      QuoteDetails result = apiInstance.getV5QuotesDetails(quoteNumber, customerNumber, isoCountryCode, thirdPartySource);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesV5Api#getV5QuotesDetails");
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
| **quoteNumber** | **String**| Ingram Micro Quote Number | [default to QUO-25576-C8S2W7] |
| **customerNumber** | **String**| Your Ingram Micro unique customer number | [default to 20-222222] |
| **isoCountryCode** | **String**|  | [default to US] |
| **thirdPartySource** | **String**| Unique identifier used to identify the third party source accessing the services | [optional] [default to customer] |

### Return type

[**QuoteDetails**](QuoteDetails.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postV5QuotesSearch"></a>
# **postV5QuotesSearch**
> QuoteListResponse postV5QuotesSearch(quoteListRequest)

Search Quotes

This endpoint enables the retrieval and filtering of relevant quote list key criteria data, such as quote number, special bid numbers, end user name, status, and date ranges from the Ingram Micro system. By default, the Quotes endpoint retrieves quotes modified or created within the last 30 days.   Observe these additional parameters:&lt;ul&gt;&lt;li&gt;Only active quotes are available through this API.&lt;/li&gt;&lt;li&gt;Quotes older than 365 days are excluded by default.&lt;/li&gt;&lt;li&gt;You can use date range filters to retrieve quotes older than 30 days and up to 365 days.&lt;/li&gt;&lt;li&gt;Quotes that are in draft and closed states are excluded, and are not accessible through this API.&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.QuotesV5Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    QuotesV5Api apiInstance = new QuotesV5Api(defaultClient);
    QuoteListRequest quoteListRequest = new QuoteListRequest(); // QuoteListRequest | 
    try {
      QuoteListResponse result = apiInstance.postV5QuotesSearch(quoteListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling QuotesV5Api#postV5QuotesSearch");
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

