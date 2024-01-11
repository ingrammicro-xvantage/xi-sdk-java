# ProductCatalogApi

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResellerV6Productdetail**](ProductCatalogApi.md#getResellerV6Productdetail) | **GET** /resellers/v6/catalog/details/{ingramPartNumber} | Product Details |
| [**getResellerV6Productsearch**](ProductCatalogApi.md#getResellerV6Productsearch) | **GET** /resellers/v6/catalog | Search Products |
| [**postPriceandavailability**](ProductCatalogApi.md#postPriceandavailability) | **POST** /resellers/v6/catalog/priceandavailability | Price and Availability |


<a id="getResellerV6Productdetail"></a>
# **getResellerV6Productdetail**
> ProductDetailResponse getResellerV6Productdetail(ingramPartNumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID)

Product Details

Search all the product-related details using a unique Ingram Part Number. Currently, this API is available in the USA, India, and Netherlands.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ProductCatalogApi apiInstance = new ProductCatalogApi(defaultClient);
    String ingramPartNumber = "6YE881"; // String | Ingram Micro unique part number for the product
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems
    String imSenderID = "MyCompany"; // String | Sender Identification text
    try {
      ProductDetailResponse result = apiInstance.getResellerV6Productdetail(ingramPartNumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogApi#getResellerV6Productdetail");
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
| **ingramPartNumber** | **String**| Ingram Micro unique part number for the product | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction accross all the systems | |
| **imSenderID** | **String**| Sender Identification text | [optional] |

### Return type

[**ProductDetailResponse**](ProductDetailResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | No Content |  -  |
| **500** | Internal Server Error |  -  |

<a id="getResellerV6Productsearch"></a>
# **getResellerV6Productsearch**
> ProductSearchResponse getResellerV6Productsearch(imCustomerNumber, imCorrelationID, imCountryCode, pageNumber, pageSize, imSenderID, type, hasDiscounts, vendor, vendorPartNumber, acceptLanguage, vendorNumber, keyword, category, skipAuthorisation)

Search Products

Search the Ingram Micro product catalog by providing any of the information in the keyword(Ingram part number / vendor part number/ product description / UPC

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ProductCatalogApi apiInstance = new ProductCatalogApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction accross all the systems
    String imCountryCode = "US"; // String | Two-character ISO country code.
    Integer pageNumber = 56; // Integer | Current page number. Default is 1
    Integer pageSize = 56; // Integer | Number of records required in the call - max records 100 per page
    String imSenderID = "MyCompany"; // String | Sender Identification text
    String type = "IM::physical"; // String | The SKU type of product. One of Physical, Digital, or Any.
    String hasDiscounts = "true"; // String | Specifies if there are discounts available for the product.
    List<String> vendor = Arrays.asList(); // List<String> | The name of the vendor/manufacturer of the product.
    List<String> vendorPartNumber = Arrays.asList(); // List<String> | The vendors part number for the product.
    String acceptLanguage = "en"; // String | Header to the API calls, the content will help us identify the response language.
    String vendorNumber = "vendorNumber_example"; // String | Vendor number of the product
    List<String> keyword = Arrays.asList(); // List<String> | Keyword search,can be ingram part number or vendor part number or product title or vendor nameKeyword search. Can be Ingram Micro part number, vender part number, product title, or vendor name.
    String category = "Accessories"; // String | The category of the product. Example: Displays.
    String skipAuthorisation = "true"; // String | This parameter is True when you want Skip the authorization, so template will work like current B2b template.
    try {
      ProductSearchResponse result = apiInstance.getResellerV6Productsearch(imCustomerNumber, imCorrelationID, imCountryCode, pageNumber, pageSize, imSenderID, type, hasDiscounts, vendor, vendorPartNumber, acceptLanguage, vendorNumber, keyword, category, skipAuthorisation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogApi#getResellerV6Productsearch");
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
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction accross all the systems | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **pageNumber** | **Integer**| Current page number. Default is 1 | [optional] |
| **pageSize** | **Integer**| Number of records required in the call - max records 100 per page | [optional] |
| **imSenderID** | **String**| Sender Identification text | [optional] |
| **type** | **String**| The SKU type of product. One of Physical, Digital, or Any. | [optional] [enum: IM::physical, IM::digital, IM::any] |
| **hasDiscounts** | **String**| Specifies if there are discounts available for the product. | [optional] |
| **vendor** | [**List&lt;String&gt;**](String.md)| The name of the vendor/manufacturer of the product. | [optional] |
| **vendorPartNumber** | [**List&lt;String&gt;**](String.md)| The vendors part number for the product. | [optional] |
| **acceptLanguage** | **String**| Header to the API calls, the content will help us identify the response language. | [optional] [default to en] |
| **vendorNumber** | **String**| Vendor number of the product | [optional] |
| **keyword** | [**List&lt;String&gt;**](String.md)| Keyword search,can be ingram part number or vendor part number or product title or vendor nameKeyword search. Can be Ingram Micro part number, vender part number, product title, or vendor name. | [optional] |
| **category** | **String**| The category of the product. Example: Displays. | [optional] |
| **skipAuthorisation** | **String**| This parameter is True when you want Skip the authorization, so template will work like current B2b template. | [optional] |

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
| **200** | a ProductSearchv6ResponseElement to be returned |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Sender Identification text . <br>  |
| **400** | Bad Request |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Sender Identification text . <br>  |
| **404** | No Content |  -  |
| **500** | Internal Server Error |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Sender Identification text . <br>  |

<a id="postPriceandavailability"></a>
# **postPriceandavailability**
> List&lt;PriceAndAvailabilityResponseInner&gt; postPriceandavailability(includeAvailability, includePricing, imCustomerNumber, imCountryCode, imCorrelationID, priceAndAvailabilityRequest, includeProductAttributes, imSenderID)

Price and Availability

The PriceAndAvailability API, will retrieve Pricing, Availability, discounts, Inventory Location, Reserve Inventory for the products upto 50 products. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ProductCatalogApi apiInstance = new ProductCatalogApi(defaultClient);
    List<Boolean> includeAvailability = Arrays.asList(); // List<Boolean> | Pass boolean value as input, if true the response will contain warehouse availability details, if false the response will not hold warehouse availability details
    Boolean includePricing = true; // Boolean | Pass boolean value as input, if true the response will contain Pricing details of the Product, if false the response will not hold Pricing details.
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    PriceAndAvailabilityRequest priceAndAvailabilityRequest = new PriceAndAvailabilityRequest(); // PriceAndAvailabilityRequest | 
    Boolean includeProductAttributes = true; // Boolean | Pass boolean value as input, if true the response will contain detailed attributes related to the Product, if false or not sent the response will contain very few Product details.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    try {
      List<PriceAndAvailabilityResponseInner> result = apiInstance.postPriceandavailability(includeAvailability, includePricing, imCustomerNumber, imCountryCode, imCorrelationID, priceAndAvailabilityRequest, includeProductAttributes, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogApi#postPriceandavailability");
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
| **includeAvailability** | [**List&lt;Boolean&gt;**](Boolean.md)| Pass boolean value as input, if true the response will contain warehouse availability details, if false the response will not hold warehouse availability details | |
| **includePricing** | **Boolean**| Pass boolean value as input, if true the response will contain Pricing details of the Product, if false the response will not hold Pricing details. | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **priceAndAvailabilityRequest** | [**PriceAndAvailabilityRequest**](PriceAndAvailabilityRequest.md)|  | |
| **includeProductAttributes** | **Boolean**| Pass boolean value as input, if true the response will contain detailed attributes related to the Product, if false or not sent the response will contain very few Product details. | [optional] |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |

### Return type

[**List&lt;PriceAndAvailabilityResponseInner&gt;**](PriceAndAvailabilityResponseInner.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **207** | Multi Status |  -  |
| **400** | Bad Request |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-SenderID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

