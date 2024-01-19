# OrdersV4Api

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postV4Ordercreate**](OrdersV4Api.md#postV4Ordercreate) | **POST** /orders/v4/ordercreate | Create a new Order |
| [**postV4Orderdelete**](OrdersV4Api.md#postV4Orderdelete) | **POST** /orders/v4/orderdelete | Delete an Order |
| [**postV4Orderdetails**](OrdersV4Api.md#postV4Orderdetails) | **POST** /orders/v4/orderdetails | Get Order Details |
| [**postV4Ordermodify**](OrdersV4Api.md#postV4Ordermodify) | **POST** /orders/v4/ordermodify | Modify an Existing Order |
| [**postV4Ordersearch**](OrdersV4Api.md#postV4Ordersearch) | **POST** /orders/v4/orderlookup | Order Search |


<a id="postV4Ordercreate"></a>
# **postV4Ordercreate**
> OrderCreateResponse postV4Ordercreate(orderCreateRequest)

Create a new Order

The order create transaction is a real-time transaction that allows customers to place standard product and direct ship (licensing and warranties) orders with Ingram Micro using API.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersV4Api apiInstance = new OrdersV4Api(defaultClient);
    OrderCreateRequest orderCreateRequest = new OrderCreateRequest(); // OrderCreateRequest | 
    try {
      OrderCreateResponse result = apiInstance.postV4Ordercreate(orderCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV4Api#postV4Ordercreate");
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
| **orderCreateRequest** | [**OrderCreateRequest**](OrderCreateRequest.md)|  | [optional] |

### Return type

[**OrderCreateResponse**](OrderCreateResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postV4Orderdelete"></a>
# **postV4Orderdelete**
> OrderDeleteResponse postV4Orderdelete(orderDeleteRequest)

Delete an Order

A real-time request to delete a previously accepted order must be submitted before the order is released to Ingram Micro’s warehouse. After release the order is no longer eligible for deletion. Order delete transaction submitted after the order is released will be rejected and will not be applied. *Direct ship orders cannot be deleted. Contact your sales rep for assistance.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersV4Api apiInstance = new OrdersV4Api(defaultClient);
    OrderDeleteRequest orderDeleteRequest = new OrderDeleteRequest(); // OrderDeleteRequest | 
    try {
      OrderDeleteResponse result = apiInstance.postV4Orderdelete(orderDeleteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV4Api#postV4Orderdelete");
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
| **orderDeleteRequest** | [**OrderDeleteRequest**](OrderDeleteRequest.md)|  | [optional] |

### Return type

[**OrderDeleteResponse**](OrderDeleteResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postV4Orderdetails"></a>
# **postV4Orderdetails**
> OrderDetailResponse postV4Orderdetails(orderDetailRequest)

Get Order Details

A real-time request that allows the customer to query Ingram Micro for detailed information for a specific open or shipped order. Orders are searched using Ingram Micro Sales Order Number.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersV4Api apiInstance = new OrdersV4Api(defaultClient);
    OrderDetailRequest orderDetailRequest = new OrderDetailRequest(); // OrderDetailRequest | 
    try {
      OrderDetailResponse result = apiInstance.postV4Orderdetails(orderDetailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV4Api#postV4Orderdetails");
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
| **orderDetailRequest** | [**OrderDetailRequest**](OrderDetailRequest.md)|  | [optional] |

### Return type

[**OrderDetailResponse**](OrderDetailResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postV4Ordermodify"></a>
# **postV4Ordermodify**
> OrderModifyResponse postV4Ordermodify(orderModifyRequest)

Modify an Existing Order

The order modify transaction allows for changes to be made after the order creation process but before the order is released to Ingram Micro’s warehouse system.  Order modify transaction submitted after the order is released will be rejected and will not be applied.  Types of modifications allowable: Order release, add comment, and carrier change. NOTE - Direct Ship orders cannot be modified. 

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersV4Api apiInstance = new OrdersV4Api(defaultClient);
    OrderModifyRequest orderModifyRequest = new OrderModifyRequest(); // OrderModifyRequest | 
    try {
      OrderModifyResponse result = apiInstance.postV4Ordermodify(orderModifyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV4Api#postV4Ordermodify");
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
| **orderModifyRequest** | [**OrderModifyRequest**](OrderModifyRequest.md)|  | [optional] |

### Return type

[**OrderModifyResponse**](OrderModifyResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="postV4Ordersearch"></a>
# **postV4Ordersearch**
> OrderSearchResponse postV4Ordersearch(orderSearchRequest)

Order Search

Search your orders using various search parameters

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.OrdersV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    OrdersV4Api apiInstance = new OrdersV4Api(defaultClient);
    OrderSearchRequest orderSearchRequest = new OrderSearchRequest(); // OrderSearchRequest | 
    try {
      OrderSearchResponse result = apiInstance.postV4Ordersearch(orderSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersV4Api#postV4Ordersearch");
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
| **orderSearchRequest** | [**OrderSearchRequest**](OrderSearchRequest.md)|  | [optional] |

### Return type

[**OrderSearchResponse**](OrderSearchResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

