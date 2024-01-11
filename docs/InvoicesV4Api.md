# InvoicesV4Api

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postV4Invoicedetails**](InvoicesV4Api.md#postV4Invoicedetails) | **POST** /invoices/v4/invoicedetails | Get Invoice Details |


<a id="postV4Invoicedetails"></a>
# **postV4Invoicedetails**
> InvoiceDetailResponse postV4Invoicedetails(invoiceDetailRequest)

Get Invoice Details

A real-time request that allows the customer to query Ingram Micro for Invoice information for a specific open or shipped order (in the past 9 months). Orders are searched using Ingram Micro Sales Order Number.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesV4Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesV4Api apiInstance = new InvoicesV4Api(defaultClient);
    InvoiceDetailRequest invoiceDetailRequest = new InvoiceDetailRequest(); // InvoiceDetailRequest | 
    try {
      InvoiceDetailResponse result = apiInstance.postV4Invoicedetails(invoiceDetailRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesV4Api#postV4Invoicedetails");
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
| **invoiceDetailRequest** | [**InvoiceDetailRequest**](InvoiceDetailRequest.md)|  | [optional] |

### Return type

[**InvoiceDetailResponse**](InvoiceDetailResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

