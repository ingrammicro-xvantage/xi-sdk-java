# ProductCatalogV4Api

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postV4Multiskupriceandstock**](ProductCatalogV4Api.md#postV4Multiskupriceandstock) | **POST** /products/v4/multiskupriceandstock | Product availability for upto 50 SKUs |
| [**postV4Productsearch**](ProductCatalogV4Api.md#postV4Productsearch) | **POST** /products/v4/productsearch | Real-time Product Search |


<a id="postV4Multiskupriceandstock"></a>
# **postV4Multiskupriceandstock**
> MultiSKUPriceAndStockResponse postV4Multiskupriceandstock(multiSKUPriceAndStockRequest)

Product availability for upto 50 SKUs

Find price and availability of up to 50 SKUs in a single request. As you increase the number of items in the request response time will be extended. This transaction must not be used as a continuous cyclical call to populate availability and pricing for your full catalog. Customers that perform this activity will lose access to price and availability.  Ingram can provide a Price catalog file and an Inventory file in flat file format, which can be obtained through FTP download. Please contact 1800-616-4665 or Electronic.Services@ingrammicro.com for more information on these files.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.ProductCatalogV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ProductCatalogV4Api apiInstance = new ProductCatalogV4Api(defaultClient);
    MultiSKUPriceAndStockRequest multiSKUPriceAndStockRequest = new MultiSKUPriceAndStockRequest(); // MultiSKUPriceAndStockRequest | 
    try {
      MultiSKUPriceAndStockResponse result = apiInstance.postV4Multiskupriceandstock(multiSKUPriceAndStockRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogV4Api#postV4Multiskupriceandstock");
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
| **multiSKUPriceAndStockRequest** | [**MultiSKUPriceAndStockRequest**](MultiSKUPriceAndStockRequest.md)|  | [optional] |

### Return type

[**MultiSKUPriceAndStockResponse**](MultiSKUPriceAndStockResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a id="postV4Productsearch"></a>
# **postV4Productsearch**
> ProductSearchResponse postV4Productsearch(productSearchRequest)

Real-time Product Search

A real time search that provides the Ingram Micro part number using the manufacturer part number.  This API is helpful to eliminate any errors when a manufactuer has the same part number and Ingram Micro has had to create multiple sku numbers 

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.ProductCatalogV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ProductCatalogV4Api apiInstance = new ProductCatalogV4Api(defaultClient);
    ProductSearchRequest productSearchRequest = new ProductSearchRequest(); // ProductSearchRequest | 
    try {
      ProductSearchResponse result = apiInstance.postV4Productsearch(productSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogV4Api#postV4Productsearch");
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
| **productSearchRequest** | [**ProductSearchRequest**](ProductSearchRequest.md)|  | [optional] |

### Return type

[**ProductSearchResponse**](ProductSearchResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

