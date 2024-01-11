# InvoicesV5Api

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInvoices**](InvoicesV5Api.md#getInvoices) | **GET** /resellers/v5/invoices/{invoiceNumber} | Get Invoice Details |


<a id="getInvoices"></a>
# **getInvoices**
> InvoiceDetails getInvoices(invoiceNumber, customerNumber, isoCountryCode)

Get Invoice Details

View invoice details. This is a request to query invoice details for a specific Ingram Micro order placed in the last 9 months, whether open or shipped.   &lt;strong&gt;invoiceNumber&lt;/strong&gt;, &lt;strong&gt;isoCountryCode&lt;/strong&gt; and &lt;strong&gt;customerNumber&lt;/strong&gt; parameters are required.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvoicesV5Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesV5Api apiInstance = new InvoicesV5Api(defaultClient);
    String invoiceNumber = "20-RCW67-11"; // String | Ingram Micro Invoice Number
    String customerNumber = "20-222222"; // String | Your unique Ingram Micro customer number
    String isoCountryCode = "US"; // String | ISO 2 char country code
    try {
      InvoiceDetails result = apiInstance.getInvoices(invoiceNumber, customerNumber, isoCountryCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesV5Api#getInvoices");
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
| **invoiceNumber** | **String**| Ingram Micro Invoice Number | [default to 20-RCW67-11] |
| **customerNumber** | **String**| Your unique Ingram Micro customer number | [default to 20-222222] |
| **isoCountryCode** | **String**| ISO 2 char country code | [default to US] |

### Return type

[**InvoiceDetails**](InvoiceDetails.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

