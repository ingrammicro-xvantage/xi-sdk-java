# InvoicesV6Api

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInvoicedetailsV6**](InvoicesV6Api.md#getInvoicedetailsV6) | **GET** /resellers/v6/invoices/{invoicenumber} | Get Invoice Details v6 |


<a id="getInvoicedetailsV6"></a>
# **getInvoicedetailsV6**
> InvoiceDetailResponse getInvoicedetailsV6(invoicenumber, version, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers)

Get Invoice Details v6

Use your Ingram Micro invoice number to search for existing invoices or retrieve existing invoice details.  The invoice number, IM-CustomerNumber, IM-CountryCode, IM-ApplicationId and IM-CorrelationID are required parameters.  .

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.InvoicesV6Api;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesV6Api apiInstance = new InvoicesV6Api(defaultClient);
    String invoicenumber = "335238411"; // String | The Ingram Micro invoice number.
    String version = "20-222222"; // String | Version of codebase.
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String imApplicationID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany.
    String customerType = "invoice"; // String | it should be invoice or order
    Boolean includeSerialNumbers = false; // Boolean | if serial in the response send as true or else false
    try {
      InvoiceDetailResponse result = apiInstance.getInvoicedetailsV6(invoicenumber, version, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesV6Api#getInvoicedetailsV6");
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
| **invoicenumber** | **String**| The Ingram Micro invoice number. | |
| **version** | **String**| Version of codebase. | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **imApplicationID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany. | |
| **customerType** | **String**| it should be invoice or order | [optional] |
| **includeSerialNumbers** | **Boolean**| if serial in the response send as true or else false | [optional] |

### Return type

[**InvoiceDetailResponse**](InvoiceDetailResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * IM-CorrelationID - Unique transaction number to identify each transaction across all the systems. <br>  * IM-ApplicationID - Unique value used to identify the sender of the transaction. Example: MyCompany <br>  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

