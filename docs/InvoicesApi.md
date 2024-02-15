# InvoicesApi

All URIs are relative to *https://api.ingrammicro.com:443*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInvoicedetailsV61**](InvoicesApi.md#getInvoicedetailsV61) | **GET** /resellers/v6.1/invoices/{invoiceNumber} | Get Invoice Details v6.1 |
| [**getResellersV6Invoicesearch**](InvoicesApi.md#getResellersV6Invoicesearch) | **GET** /resellers/v6/invoices | Search your invoice |


<a id="getInvoicedetailsV61"></a>
# **getInvoicedetailsV61**
> InvoiceDetailsv61Response getInvoicedetailsV61(invoiceNumber, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers)

Get Invoice Details v6.1

Use your Ingram Micro invoice number to search for existing invoices or retrieve existing invoice details.  The invoice number, IM-CustomerNumber, IM-CountryCode, IM-ApplicationId and IM-CorrelationID are required parameters.  .

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String invoiceNumber = "335238411"; // String | The Ingram Micro invoice number.
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String imApplicationID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany.
    String customerType = "invoice"; // String | it should be invoice or order
    Boolean includeSerialNumbers = false; // Boolean | if serial in the response send as true or else false
    try {
      InvoiceDetailsv61Response result = apiInstance.getInvoicedetailsV61(invoiceNumber, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getInvoicedetailsV61");
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
| **invoiceNumber** | **String**| The Ingram Micro invoice number. | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **imApplicationID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany. | |
| **customerType** | **String**| it should be invoice or order | [optional] |
| **includeSerialNumbers** | **Boolean**| if serial in the response send as true or else false | [optional] |

### Return type

[**InvoiceDetailsv61Response**](InvoiceDetailsv61Response.md)

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

<a id="getResellersV6Invoicesearch"></a>
# **getResellersV6Invoicesearch**
> InvoiceSearchResponse getResellersV6Invoicesearch(imApplicationID, imCustomerNumber, imCountryCode, imCorrelationID, paymentTermsNetDate, invoiceDate, invoiceDueDate, orderDate, orderFromDate, orderToDate, orderNumber, deliveryNumber, invoiceNumber, invoiceStatus, invoiceType, customerOrderNumber, endCustomerOrderNumber, specialBidNumber, invoiceFromDueDate, invoiceToDueDate, invoiceFromDate, invoiceToDate, pageSize, pageNumber, orderby, direction, serialNumber)

Search your invoice

Search your Ingram Micro invoices. This endpoint searches by multiple invoice parameters and supports pagination of results.

### Example
```java
// Import classes:
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.Configuration;
import xiresellers.client.auth.*;
import xiresellers.client.models.*;
import xiresellers.client.api.InvoicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    InvoicesApi apiInstance = new InvoicesApi(defaultClient);
    String imApplicationID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String paymentTermsNetDate = "2021-04-23"; // String | Search by payment terms net date(yyyy-MM-dd).
    String invoiceDate = "2021-04-23"; // String | Search by invoice date(yyyy-MM-dd).
    String invoiceDueDate = "2021-04-23"; // String | Search by invoice date from(yyyy-MM-dd).
    String orderDate = "2021-04-23"; // String | Search by OrderDate date(yyyy-MM-dd).
    String orderFromDate = "2021-04-23"; // String | Search by OrderFromDate date(yyyy-MM-dd).
    String orderToDate = "2021-04-23"; // String | Search by OrderToDate date(yyyy-MM-dd).
    String orderNumber = "2021-04-23"; // String | Search by order number
    String deliveryNumber = "335238411"; // String | Search by delivery number.
    String invoiceNumber = "invoiceNumber_example"; // String | The Ingram Micro invoice number.
    String invoiceStatus = "invoiceStatus_example"; // String | Ingram Micro invoice status.
    String invoiceType = "invoiceType_example"; // String | Ingram Micro InvoiceType.
    String customerOrderNumber = "customerOrderNumber_example"; // String | Ingram Micro CustomerOrderNumber.
    String endCustomerOrderNumber = "endCustomerOrderNumber_example"; // String | Ingram Micro EndCustomerOrderNumber.
    String specialBidNumber = "specialBidNumber_example"; // String | Ingram Micro SpecialBidNumber.
    String invoiceFromDueDate = "2021-04-23"; // String | Search by invoice due date from(yyyy-MM-dd).
    String invoiceToDueDate = "2021-04-23"; // String | Search by invoice due date to(yyyy-MM-dd).
    List<String> invoiceFromDate = Arrays.asList(); // List<String> | Search by invoice date from(yyyy-MM-dd).
    List<String> invoiceToDate = Arrays.asList(); // List<String> | Search by invoice date To(yyyy-MM-dd).
    Integer pageSize = 56; // Integer | Number of records required in the call - max records 100 per page.
    Integer pageNumber = 56; // Integer | The page number reference.
    String orderby = "InvoiceDate"; // String | Column name with which we want to sort.
    String direction = "desc"; // String | asc or desc , along with orderby column result set will be sorted.
    String serialNumber = "serialNumber_example"; // String | Serial number of the product.
    try {
      InvoiceSearchResponse result = apiInstance.getResellersV6Invoicesearch(imApplicationID, imCustomerNumber, imCountryCode, imCorrelationID, paymentTermsNetDate, invoiceDate, invoiceDueDate, orderDate, orderFromDate, orderToDate, orderNumber, deliveryNumber, invoiceNumber, invoiceStatus, invoiceType, customerOrderNumber, endCustomerOrderNumber, specialBidNumber, invoiceFromDueDate, invoiceToDueDate, invoiceFromDate, invoiceToDate, pageSize, pageNumber, orderby, direction, serialNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvoicesApi#getResellersV6Invoicesearch");
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
| **imApplicationID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | |
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **paymentTermsNetDate** | **String**| Search by payment terms net date(yyyy-MM-dd). | [optional] |
| **invoiceDate** | **String**| Search by invoice date(yyyy-MM-dd). | [optional] |
| **invoiceDueDate** | **String**| Search by invoice date from(yyyy-MM-dd). | [optional] |
| **orderDate** | **String**| Search by OrderDate date(yyyy-MM-dd). | [optional] |
| **orderFromDate** | **String**| Search by OrderFromDate date(yyyy-MM-dd). | [optional] |
| **orderToDate** | **String**| Search by OrderToDate date(yyyy-MM-dd). | [optional] |
| **orderNumber** | **String**| Search by order number | [optional] |
| **deliveryNumber** | **String**| Search by delivery number. | [optional] |
| **invoiceNumber** | **String**| The Ingram Micro invoice number. | [optional] |
| **invoiceStatus** | **String**| Ingram Micro invoice status. | [optional] |
| **invoiceType** | **String**| Ingram Micro InvoiceType. | [optional] |
| **customerOrderNumber** | **String**| Ingram Micro CustomerOrderNumber. | [optional] |
| **endCustomerOrderNumber** | **String**| Ingram Micro EndCustomerOrderNumber. | [optional] |
| **specialBidNumber** | **String**| Ingram Micro SpecialBidNumber. | [optional] |
| **invoiceFromDueDate** | **String**| Search by invoice due date from(yyyy-MM-dd). | [optional] |
| **invoiceToDueDate** | **String**| Search by invoice due date to(yyyy-MM-dd). | [optional] |
| **invoiceFromDate** | [**List&lt;String&gt;**](String.md)| Search by invoice date from(yyyy-MM-dd). | [optional] |
| **invoiceToDate** | [**List&lt;String&gt;**](String.md)| Search by invoice date To(yyyy-MM-dd). | [optional] |
| **pageSize** | **Integer**| Number of records required in the call - max records 100 per page. | [optional] |
| **pageNumber** | **Integer**| The page number reference. | [optional] |
| **orderby** | **String**| Column name with which we want to sort. | [optional] |
| **direction** | **String**| asc or desc , along with orderby column result set will be sorted. | [optional] |
| **serialNumber** | **String**| Serial number of the product. | [optional] |

### Return type

[**InvoiceSearchResponse**](InvoiceSearchResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | InvoiceSearchResponse to be returned |  -  |
| **400** | Bad Request |  -  |
| **500** | Internal Server Error |  -  |

