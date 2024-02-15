# ProductCatalogV5Api

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getV5CatalogProductsearch**](ProductCatalogV5Api.md#getV5CatalogProductsearch) | **GET** /resellers/v5/Catalog | Search Product Catalog |
| [**multiSKUPriceAndStock**](ProductCatalogV5Api.md#multiSKUPriceAndStock) | **POST** /resellers/v5/Catalog/priceandavailability | Find availability of upto 50 SKUs |


<a id="getV5CatalogProductsearch"></a>
# **getV5CatalogProductsearch**
> ProductSearchResponse getV5CatalogProductsearch(customerNumber, isoCountryCode, partNumber)

Search Product Catalog

Search the Ingram Micro product catalog using customerNumber, isoCountryCode and partNumber.&lt;ul&gt;&lt;li&gt;customerNumber and isoCountryCode fields are required.&lt;/li&gt;&lt;li&gt;The PartNumber field accepts the following:&lt;ul&gt;&lt;li&gt;Ingram part number&lt;/li&gt;&lt;li&gt;Vendor part number&lt;/li&gt;&lt;li&gt;Customer part number&lt;/li&gt;&lt;li&gt;UPC (Universal Product Code)&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.ProductCatalogV5Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ProductCatalogV5Api apiInstance = new ProductCatalogV5Api(defaultClient);
    String customerNumber = "20-222222"; // String | Your unique Ingram Micro customer number
    String isoCountryCode = "US"; // String | 2 chars country code
    String partNumber = "1AQ821"; // String | Part Number can be ingram part number or vendor part number or customer part number or UPC
    try {
      ProductSearchResponse result = apiInstance.getV5CatalogProductsearch(customerNumber, isoCountryCode, partNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogV5Api#getV5CatalogProductsearch");
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
| **customerNumber** | **String**| Your unique Ingram Micro customer number | [default to 20-222222] |
| **isoCountryCode** | **String**| 2 chars country code | [default to US] |
| **partNumber** | **String**| Part Number can be ingram part number or vendor part number or customer part number or UPC | [default to 1AQ821] |

### Return type

[**ProductSearchResponse**](ProductSearchResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="multiSKUPriceAndStock"></a>
# **multiSKUPriceAndStock**
> PriceAndAvailabilityResponse multiSKUPriceAndStock(priceAndAvailabilityRequest)

Find availability of upto 50 SKUs

Search the product catalog for the price and availability for up to 50 SKUs at one time. This endpoint helps to confirm the details just prior to placing a real-time call.&lt;ul&gt;&lt;li&gt;You may request visibility for reserve stock if you participate in reserved inventory, in addition to the stock that is open to all the partners. Please see the details in the endpoint model below.&lt;/li&gt;&lt;li&gt;Follow these guidelines when using this endpoint:&lt;ul&gt;&lt;li&gt;This endpoint is not for refreshing the full catalog with availability and pricing information. Ingram Micro applies rate limits on this endpoint. Continuous cyclical calls will error out. Customers that perform this activity may lose access to the endpoint.&lt;/li&gt;&lt;li&gt;For the full catalog refresh, Ingram Micro can provide a Price and Inventory file in flat file format, made available through FTP download. Please contact your Ingram Micro sales rep for details.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.ProductCatalogV5Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ProductCatalogV5Api apiInstance = new ProductCatalogV5Api(defaultClient);
    PriceAndAvailabilityRequest priceAndAvailabilityRequest = new PriceAndAvailabilityRequest(); // PriceAndAvailabilityRequest | 
    try {
      PriceAndAvailabilityResponse result = apiInstance.multiSKUPriceAndStock(priceAndAvailabilityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogV5Api#multiSKUPriceAndStock");
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
| **priceAndAvailabilityRequest** | [**PriceAndAvailabilityRequest**](PriceAndAvailabilityRequest.md)|  | [optional] |

### Return type

[**PriceAndAvailabilityResponse**](PriceAndAvailabilityResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

