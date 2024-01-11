# ReturnsApi

All URIs are relative to *https://api.ingrammicro.com:443/sandbox*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResellersV6Returnsdetails**](ReturnsApi.md#getResellersV6Returnsdetails) | **GET** /resellers/v6/returns/{caseRequestNumber} | Returns Details |
| [**getResellersV6Returnssearch**](ReturnsApi.md#getResellersV6Returnssearch) | **GET** /resellers/v6/returns/search | Returns Search |
| [**postReturnscreate**](ReturnsApi.md#postReturnscreate) | **POST** /resellers/v6/returns/create | Returns Create |


<a id="getResellersV6Returnsdetails"></a>
# **getResellersV6Returnsdetails**
> ReturnsDetailsResponse getResellersV6Returnsdetails(imCustomerNumber, imCountryCode, imCorrelationID, caseRequestNumber, imSenderID)

Returns Details

The Returns Details API will retrieve all the details related to the specific caseRequestNumber.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ReturnsApi apiInstance = new ReturnsApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String caseRequestNumber = "12345678"; // String | A unique return request number.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    try {
      ReturnsDetailsResponse result = apiInstance.getResellersV6Returnsdetails(imCustomerNumber, imCountryCode, imCorrelationID, caseRequestNumber, imSenderID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsApi#getResellersV6Returnsdetails");
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
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **caseRequestNumber** | **String**| A unique return request number. | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |

### Return type

[**ReturnsDetailsResponse**](ReturnsDetailsResponse.md)

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

<a id="getResellersV6Returnssearch"></a>
# **getResellersV6Returnssearch**
> ReturnsSearchResponse getResellersV6Returnssearch(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, caseRequestNumber, invoiceNumber, returnClaimId, referenceNumber, ingramPartNumber, vendorPartNumber, returnStatusIn, claimStatusIn, createdOnBt, modifiedOnBt, returnReasonIn, page, size, sort, sortingColumnName)

Returns Search

The Returns Search API, by default, will retrieve all the returns that are associated with the customer’s account. The customer will be able to search returns using the query parameters. The Returns Search response will return the following information:  returnClaimId, caseRequestNumber, createdOn, referenceNumber, and returnReason.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ReturnsApi apiInstance = new ReturnsApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    String caseRequestNumber = "caseRequestNumber_example"; // String | A unique return request number.
    String invoiceNumber = "invoiceNumber_example"; // String | The Invoice number for the order.
    String returnClaimId = "returnClaimId_example"; // String | A unique return claim Id.
    String referenceNumber = "referenceNumber_example"; // String | The reference number for the return.
    String ingramPartNumber = "ingramPartNumber_example"; // String | Unique IngramMicro part number.
    String vendorPartNumber = "vendorPartNumber_example"; // String | The vendor's part number.
    String returnStatusIn = "returnStatusIn_example"; // String | Comma-separated values of pre-defined status. Open, Approved, Partially Approved, Denied, Voided.
    String claimStatusIn = "claimStatusIn_example"; // String | Comma-separated values of pre-defined status. Open, Approved, Partially Approved, Denied, Voided.
    String createdOnBt = "createdOnBt_example"; // String | The date on which the return request was created. 
    String modifiedOnBt = "modifiedOnBt_example"; // String | The date on which the return request was last updated.
    String returnReasonIn = "returnReasonIn_example"; // String | Comma separated Pre-defined value. test, (EW) Express Warehousing, (AR) Account Receivables, (BB) Buy Back, (BE) Stock Balance Exception, (BO) Bill Only, (CE) Credit Dept Use - Credit Exception, (CF) Configuration Fee, (CS ) Customer Service Discretion, (CS1) Customer Service Discretion CS Error, (DE) Defective Exception, (DF) Defective Items, (DI) Direct Credit, (DM) Damaged from Carrier, (DN) Damaged Without Product, (DT) Direct/ Special Order, (DT1) Direct Ship billed, not shipped., (FO) Freight Out, (FX) No-Scan, (IN) Incomplete, (LS) Lost Shipment, (MN) Minimum Order Fee Credit, (OS) Over Shipment, (PR) Pricing Error, (RF) Refusal Credit, (RI) Re-Invoice, (RP) Return For Repair, (RT) Return Not Credited, (RTD) RCN, (SB) Stock Balance, (SD) Sales Discretion, (SH) Incorrect Shipping And Handling, (SS) Short Shipment, (SSK) Short Ship kit, (SW) Sales Writeoff, (TE) Opened Return, (TR) Training Refund, (TX) Tax Credit, (WS) Wrong Sales Sealed, (WW) Wrong Warehouse, (FS) Warehouse Failed Serial# Capture, Latin America Vebdor Credits, Select Source, ITAD - Trade-in Credit, Withholding Tax
    String page = "page_example"; // String | Number of page.
    String size = "size_example"; // String | The submitted pagesize, default is 25
    String sort = "sort_example"; // String | Refers to the column selected to apply the sorting criteria.
    String sortingColumnName = "sortingColumnName_example"; // String | The column name which will be sorted on.
    try {
      ReturnsSearchResponse result = apiInstance.getResellersV6Returnssearch(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, caseRequestNumber, invoiceNumber, returnClaimId, referenceNumber, ingramPartNumber, vendorPartNumber, returnStatusIn, claimStatusIn, createdOnBt, modifiedOnBt, returnReasonIn, page, size, sort, sortingColumnName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsApi#getResellersV6Returnssearch");
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
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |
| **caseRequestNumber** | **String**| A unique return request number. | [optional] |
| **invoiceNumber** | **String**| The Invoice number for the order. | [optional] |
| **returnClaimId** | **String**| A unique return claim Id. | [optional] |
| **referenceNumber** | **String**| The reference number for the return. | [optional] |
| **ingramPartNumber** | **String**| Unique IngramMicro part number. | [optional] |
| **vendorPartNumber** | **String**| The vendor&#39;s part number. | [optional] |
| **returnStatusIn** | **String**| Comma-separated values of pre-defined status. Open, Approved, Partially Approved, Denied, Voided. | [optional] |
| **claimStatusIn** | **String**| Comma-separated values of pre-defined status. Open, Approved, Partially Approved, Denied, Voided. | [optional] |
| **createdOnBt** | **String**| The date on which the return request was created.  | [optional] |
| **modifiedOnBt** | **String**| The date on which the return request was last updated. | [optional] |
| **returnReasonIn** | **String**| Comma separated Pre-defined value. test, (EW) Express Warehousing, (AR) Account Receivables, (BB) Buy Back, (BE) Stock Balance Exception, (BO) Bill Only, (CE) Credit Dept Use - Credit Exception, (CF) Configuration Fee, (CS ) Customer Service Discretion, (CS1) Customer Service Discretion CS Error, (DE) Defective Exception, (DF) Defective Items, (DI) Direct Credit, (DM) Damaged from Carrier, (DN) Damaged Without Product, (DT) Direct/ Special Order, (DT1) Direct Ship billed, not shipped., (FO) Freight Out, (FX) No-Scan, (IN) Incomplete, (LS) Lost Shipment, (MN) Minimum Order Fee Credit, (OS) Over Shipment, (PR) Pricing Error, (RF) Refusal Credit, (RI) Re-Invoice, (RP) Return For Repair, (RT) Return Not Credited, (RTD) RCN, (SB) Stock Balance, (SD) Sales Discretion, (SH) Incorrect Shipping And Handling, (SS) Short Shipment, (SSK) Short Ship kit, (SW) Sales Writeoff, (TE) Opened Return, (TR) Training Refund, (TX) Tax Credit, (WS) Wrong Sales Sealed, (WW) Wrong Warehouse, (FS) Warehouse Failed Serial# Capture, Latin America Vebdor Credits, Select Source, ITAD - Trade-in Credit, Withholding Tax | [optional] |
| **page** | **String**| Number of page. | [optional] |
| **size** | **String**| The submitted pagesize, default is 25 | [optional] |
| **sort** | **String**| Refers to the column selected to apply the sorting criteria. | [optional] |
| **sortingColumnName** | **String**| The column name which will be sorted on. | [optional] |

### Return type

[**ReturnsSearchResponse**](ReturnsSearchResponse.md)

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

<a id="postReturnscreate"></a>
# **postReturnscreate**
> ReturnsCreateResponse postReturnscreate(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, returnsCreateRequest)

Returns Create

Return create endpoint will allow customers to create a return request. In order to create a request, the customer must provide either ingramPartNumber or vendorPartNumber along with other required fields listed below. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReturnsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.ingrammicro.com:443/sandbox");
    
    // Configure OAuth2 access token for authorization: application
    OAuth application = (OAuth) defaultClient.getAuthentication("application");
    application.setAccessToken("YOUR ACCESS TOKEN");

    ReturnsApi apiInstance = new ReturnsApi(defaultClient);
    String imCustomerNumber = "20-222222"; // String | Your unique Ingram Micro customer number.
    String imCountryCode = "US"; // String | Two-character ISO country code.
    String imCorrelationID = "fbac82ba-cf0a-4bcf-fc03-0c5084"; // String | Unique transaction number to identify each transaction across all the systems.
    String imSenderID = "MyCompany"; // String | Unique value used to identify the sender of the transaction. Example: MyCompany
    ReturnsCreateRequest returnsCreateRequest = new ReturnsCreateRequest(); // ReturnsCreateRequest | 
    try {
      ReturnsCreateResponse result = apiInstance.postReturnscreate(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, returnsCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnsApi#postReturnscreate");
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
| **imCustomerNumber** | **String**| Your unique Ingram Micro customer number. | |
| **imCountryCode** | **String**| Two-character ISO country code. | |
| **imCorrelationID** | **String**| Unique transaction number to identify each transaction across all the systems. | |
| **imSenderID** | **String**| Unique value used to identify the sender of the transaction. Example: MyCompany | [optional] |
| **returnsCreateRequest** | [**ReturnsCreateRequest**](ReturnsCreateRequest.md)|  | [optional] |

### Return type

[**ReturnsCreateResponse**](ReturnsCreateResponse.md)

### Authorization

[application](../README.md#application)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Error: Bad Request |  -  |
| **500** | Internal Server Error |  -  |

