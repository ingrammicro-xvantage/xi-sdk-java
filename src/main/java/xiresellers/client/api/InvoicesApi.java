/*
 * XI Sdk Resellers
 * For Resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package xiresellers.client.api;

import xiresellers.client.ApiCallback;
import xiresellers.client.ApiClient;
import xiresellers.client.ApiException;
import xiresellers.client.ApiResponse;
import xiresellers.client.Configuration;
import xiresellers.client.Pair;
import xiresellers.client.ProgressRequestBody;
import xiresellers.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import xiresellers.client.model.ErrorResponse;
import xiresellers.client.model.InvoiceDetailsv61Response;
import xiresellers.client.model.InvoiceSearchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoicesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvoicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoicesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getInvoicedetailsV61
     * @param invoiceNumber The Ingram Micro invoice number. (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany. (required)
     * @param customerType it should be invoice or order (optional)
     * @param includeSerialNumbers if serial in the response send as true or else false (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInvoicedetailsV61Call(String invoiceNumber, String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationID, String customerType, Boolean includeSerialNumbers, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/resellers/v6.1/invoices/{invoiceNumber}"
            .replace("{" + "invoiceNumber" + "}", localVarApiClient.escapeString(invoiceNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (customerType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerType", customerType));
        }

        if (includeSerialNumbers != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeSerialNumbers", includeSerialNumbers));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (imCustomerNumber != null) {
            localVarHeaderParams.put("IM-CustomerNumber", localVarApiClient.parameterToString(imCustomerNumber));
        }


        if (imCountryCode != null) {
            localVarHeaderParams.put("IM-CountryCode", localVarApiClient.parameterToString(imCountryCode));
        }


        if (imCorrelationID != null) {
            localVarHeaderParams.put("IM-CorrelationID", localVarApiClient.parameterToString(imCorrelationID));
        }


        if (imApplicationID != null) {
            localVarHeaderParams.put("IM-ApplicationID", localVarApiClient.parameterToString(imApplicationID));
        }


        String[] localVarAuthNames = new String[] { "application" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInvoicedetailsV61ValidateBeforeCall(String invoiceNumber, String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationID, String customerType, Boolean includeSerialNumbers, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'invoiceNumber' is set
        if (invoiceNumber == null) {
            throw new ApiException("Missing the required parameter 'invoiceNumber' when calling getInvoicedetailsV61(Async)");
        }

        // verify the required parameter 'imCustomerNumber' is set
        if (imCustomerNumber == null) {
            throw new ApiException("Missing the required parameter 'imCustomerNumber' when calling getInvoicedetailsV61(Async)");
        }

        // verify the required parameter 'imCountryCode' is set
        if (imCountryCode == null) {
            throw new ApiException("Missing the required parameter 'imCountryCode' when calling getInvoicedetailsV61(Async)");
        }

        // verify the required parameter 'imCorrelationID' is set
        if (imCorrelationID == null) {
            throw new ApiException("Missing the required parameter 'imCorrelationID' when calling getInvoicedetailsV61(Async)");
        }

        // verify the required parameter 'imApplicationID' is set
        if (imApplicationID == null) {
            throw new ApiException("Missing the required parameter 'imApplicationID' when calling getInvoicedetailsV61(Async)");
        }

        return getInvoicedetailsV61Call(invoiceNumber, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers, _callback);

    }

    /**
     * Get Invoice Details v6.1
     * Use your Ingram Micro invoice number to search for existing invoices or retrieve existing invoice details.  The invoice number, IM-CustomerNumber, IM-CountryCode, IM-ApplicationId and IM-CorrelationID are required parameters.  .
     * @param invoiceNumber The Ingram Micro invoice number. (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany. (required)
     * @param customerType it should be invoice or order (optional)
     * @param includeSerialNumbers if serial in the response send as true or else false (optional)
     * @return InvoiceDetailsv61Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public InvoiceDetailsv61Response getInvoicedetailsV61(String invoiceNumber, String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationID, String customerType, Boolean includeSerialNumbers) throws ApiException {
        ApiResponse<InvoiceDetailsv61Response> localVarResp = getInvoicedetailsV61WithHttpInfo(invoiceNumber, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers);
        return localVarResp.getData();
    }

    /**
     * Get Invoice Details v6.1
     * Use your Ingram Micro invoice number to search for existing invoices or retrieve existing invoice details.  The invoice number, IM-CustomerNumber, IM-CountryCode, IM-ApplicationId and IM-CorrelationID are required parameters.  .
     * @param invoiceNumber The Ingram Micro invoice number. (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany. (required)
     * @param customerType it should be invoice or order (optional)
     * @param includeSerialNumbers if serial in the response send as true or else false (optional)
     * @return ApiResponse&lt;InvoiceDetailsv61Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoiceDetailsv61Response> getInvoicedetailsV61WithHttpInfo(String invoiceNumber, String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationID, String customerType, Boolean includeSerialNumbers) throws ApiException {
        okhttp3.Call localVarCall = getInvoicedetailsV61ValidateBeforeCall(invoiceNumber, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers, null);
        Type localVarReturnType = new TypeToken<InvoiceDetailsv61Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Invoice Details v6.1 (asynchronously)
     * Use your Ingram Micro invoice number to search for existing invoices or retrieve existing invoice details.  The invoice number, IM-CustomerNumber, IM-CountryCode, IM-ApplicationId and IM-CorrelationID are required parameters.  .
     * @param invoiceNumber The Ingram Micro invoice number. (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany. (required)
     * @param customerType it should be invoice or order (optional)
     * @param includeSerialNumbers if serial in the response send as true or else false (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInvoicedetailsV61Async(String invoiceNumber, String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationID, String customerType, Boolean includeSerialNumbers, final ApiCallback<InvoiceDetailsv61Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInvoicedetailsV61ValidateBeforeCall(invoiceNumber, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers, _callback);
        Type localVarReturnType = new TypeToken<InvoiceDetailsv61Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getResellersV6Invoicesearch
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param paymentTermsNetDate Search by payment terms net date(yyyy-MM-dd). (optional)
     * @param invoiceDate Search by invoice date(yyyy-MM-dd). (optional)
     * @param invoiceDueDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param orderDate Search by OrderDate date(yyyy-MM-dd). (optional)
     * @param orderFromDate Search by OrderFromDate date(yyyy-MM-dd). (optional)
     * @param orderToDate Search by OrderToDate date(yyyy-MM-dd). (optional)
     * @param orderNumber Search by order number (optional)
     * @param deliveryNumber Search by delivery number. (optional)
     * @param invoiceNumber The Ingram Micro invoice number. (optional)
     * @param invoiceStatus Ingram Micro invoice status. (optional)
     * @param invoiceType Ingram Micro InvoiceType. (optional)
     * @param customerOrderNumber Ingram Micro CustomerOrderNumber. (optional)
     * @param endCustomerOrderNumber Ingram Micro EndCustomerOrderNumber. (optional)
     * @param specialBidNumber Ingram Micro SpecialBidNumber. (optional)
     * @param invoiceFromDueDate Search by invoice due date from(yyyy-MM-dd). (optional)
     * @param invoiceToDueDate Search by invoice due date to(yyyy-MM-dd). (optional)
     * @param invoiceFromDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param invoiceToDate Search by invoice date To(yyyy-MM-dd). (optional)
     * @param pageSize Number of records required in the call - max records 100 per page. (optional)
     * @param pageNumber The page number reference. (optional)
     * @param orderby Column name with which we want to sort. (optional)
     * @param direction asc or desc , along with orderby column result set will be sorted. (optional)
     * @param serialNumber Serial number of the product. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> InvoiceSearchResponse to be returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getResellersV6InvoicesearchCall(String imApplicationID, String imCustomerNumber, String imCountryCode, String imCorrelationID, String paymentTermsNetDate, String invoiceDate, String invoiceDueDate, String orderDate, String orderFromDate, String orderToDate, String orderNumber, String deliveryNumber, String invoiceNumber, String invoiceStatus, String invoiceType, String customerOrderNumber, String endCustomerOrderNumber, String specialBidNumber, String invoiceFromDueDate, String invoiceToDueDate, List<String> invoiceFromDate, List<String> invoiceToDate, Integer pageSize, Integer pageNumber, String orderby, String direction, String serialNumber, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/resellers/v6/invoices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (paymentTermsNetDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("paymentTermsNetDate", paymentTermsNetDate));
        }

        if (invoiceDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoiceDate", invoiceDate));
        }

        if (invoiceDueDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoiceDueDate", invoiceDueDate));
        }

        if (orderDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderDate", orderDate));
        }

        if (orderFromDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderFromDate", orderFromDate));
        }

        if (orderToDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderToDate", orderToDate));
        }

        if (orderNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderNumber", orderNumber));
        }

        if (deliveryNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("DeliveryNumber", deliveryNumber));
        }

        if (invoiceNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoiceNumber", invoiceNumber));
        }

        if (invoiceStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoiceStatus", invoiceStatus));
        }

        if (invoiceType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoiceType", invoiceType));
        }

        if (customerOrderNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerOrderNumber", customerOrderNumber));
        }

        if (endCustomerOrderNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endCustomerOrderNumber", endCustomerOrderNumber));
        }

        if (specialBidNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("specialBidNumber", specialBidNumber));
        }

        if (invoiceFromDueDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoiceFromDueDate", invoiceFromDueDate));
        }

        if (invoiceToDueDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("invoiceToDueDate", invoiceToDueDate));
        }

        if (invoiceFromDate != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "invoiceFromDate", invoiceFromDate));
        }

        if (invoiceToDate != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "invoiceToDate", invoiceToDate));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageNumber", pageNumber));
        }

        if (orderby != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orderby", orderby));
        }

        if (direction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("direction", direction));
        }

        if (serialNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("serialNumber", serialNumber));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (imApplicationID != null) {
            localVarHeaderParams.put("IM-ApplicationID", localVarApiClient.parameterToString(imApplicationID));
        }


        if (imCustomerNumber != null) {
            localVarHeaderParams.put("IM-CustomerNumber", localVarApiClient.parameterToString(imCustomerNumber));
        }


        if (imCountryCode != null) {
            localVarHeaderParams.put("IM-CountryCode", localVarApiClient.parameterToString(imCountryCode));
        }


        if (imCorrelationID != null) {
            localVarHeaderParams.put("IM-CorrelationID", localVarApiClient.parameterToString(imCorrelationID));
        }


        String[] localVarAuthNames = new String[] { "application" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getResellersV6InvoicesearchValidateBeforeCall(String imApplicationID, String imCustomerNumber, String imCountryCode, String imCorrelationID, String paymentTermsNetDate, String invoiceDate, String invoiceDueDate, String orderDate, String orderFromDate, String orderToDate, String orderNumber, String deliveryNumber, String invoiceNumber, String invoiceStatus, String invoiceType, String customerOrderNumber, String endCustomerOrderNumber, String specialBidNumber, String invoiceFromDueDate, String invoiceToDueDate, List<String> invoiceFromDate, List<String> invoiceToDate, Integer pageSize, Integer pageNumber, String orderby, String direction, String serialNumber, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'imApplicationID' is set
        if (imApplicationID == null) {
            throw new ApiException("Missing the required parameter 'imApplicationID' when calling getResellersV6Invoicesearch(Async)");
        }

        // verify the required parameter 'imCustomerNumber' is set
        if (imCustomerNumber == null) {
            throw new ApiException("Missing the required parameter 'imCustomerNumber' when calling getResellersV6Invoicesearch(Async)");
        }

        // verify the required parameter 'imCountryCode' is set
        if (imCountryCode == null) {
            throw new ApiException("Missing the required parameter 'imCountryCode' when calling getResellersV6Invoicesearch(Async)");
        }

        // verify the required parameter 'imCorrelationID' is set
        if (imCorrelationID == null) {
            throw new ApiException("Missing the required parameter 'imCorrelationID' when calling getResellersV6Invoicesearch(Async)");
        }

        return getResellersV6InvoicesearchCall(imApplicationID, imCustomerNumber, imCountryCode, imCorrelationID, paymentTermsNetDate, invoiceDate, invoiceDueDate, orderDate, orderFromDate, orderToDate, orderNumber, deliveryNumber, invoiceNumber, invoiceStatus, invoiceType, customerOrderNumber, endCustomerOrderNumber, specialBidNumber, invoiceFromDueDate, invoiceToDueDate, invoiceFromDate, invoiceToDate, pageSize, pageNumber, orderby, direction, serialNumber, _callback);

    }

    /**
     * Search your invoice
     * Search your Ingram Micro invoices. This endpoint searches by multiple invoice parameters and supports pagination of results.
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param paymentTermsNetDate Search by payment terms net date(yyyy-MM-dd). (optional)
     * @param invoiceDate Search by invoice date(yyyy-MM-dd). (optional)
     * @param invoiceDueDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param orderDate Search by OrderDate date(yyyy-MM-dd). (optional)
     * @param orderFromDate Search by OrderFromDate date(yyyy-MM-dd). (optional)
     * @param orderToDate Search by OrderToDate date(yyyy-MM-dd). (optional)
     * @param orderNumber Search by order number (optional)
     * @param deliveryNumber Search by delivery number. (optional)
     * @param invoiceNumber The Ingram Micro invoice number. (optional)
     * @param invoiceStatus Ingram Micro invoice status. (optional)
     * @param invoiceType Ingram Micro InvoiceType. (optional)
     * @param customerOrderNumber Ingram Micro CustomerOrderNumber. (optional)
     * @param endCustomerOrderNumber Ingram Micro EndCustomerOrderNumber. (optional)
     * @param specialBidNumber Ingram Micro SpecialBidNumber. (optional)
     * @param invoiceFromDueDate Search by invoice due date from(yyyy-MM-dd). (optional)
     * @param invoiceToDueDate Search by invoice due date to(yyyy-MM-dd). (optional)
     * @param invoiceFromDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param invoiceToDate Search by invoice date To(yyyy-MM-dd). (optional)
     * @param pageSize Number of records required in the call - max records 100 per page. (optional)
     * @param pageNumber The page number reference. (optional)
     * @param orderby Column name with which we want to sort. (optional)
     * @param direction asc or desc , along with orderby column result set will be sorted. (optional)
     * @param serialNumber Serial number of the product. (optional)
     * @return InvoiceSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> InvoiceSearchResponse to be returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public InvoiceSearchResponse getResellersV6Invoicesearch(String imApplicationID, String imCustomerNumber, String imCountryCode, String imCorrelationID, String paymentTermsNetDate, String invoiceDate, String invoiceDueDate, String orderDate, String orderFromDate, String orderToDate, String orderNumber, String deliveryNumber, String invoiceNumber, String invoiceStatus, String invoiceType, String customerOrderNumber, String endCustomerOrderNumber, String specialBidNumber, String invoiceFromDueDate, String invoiceToDueDate, List<String> invoiceFromDate, List<String> invoiceToDate, Integer pageSize, Integer pageNumber, String orderby, String direction, String serialNumber) throws ApiException {
        ApiResponse<InvoiceSearchResponse> localVarResp = getResellersV6InvoicesearchWithHttpInfo(imApplicationID, imCustomerNumber, imCountryCode, imCorrelationID, paymentTermsNetDate, invoiceDate, invoiceDueDate, orderDate, orderFromDate, orderToDate, orderNumber, deliveryNumber, invoiceNumber, invoiceStatus, invoiceType, customerOrderNumber, endCustomerOrderNumber, specialBidNumber, invoiceFromDueDate, invoiceToDueDate, invoiceFromDate, invoiceToDate, pageSize, pageNumber, orderby, direction, serialNumber);
        return localVarResp.getData();
    }

    /**
     * Search your invoice
     * Search your Ingram Micro invoices. This endpoint searches by multiple invoice parameters and supports pagination of results.
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param paymentTermsNetDate Search by payment terms net date(yyyy-MM-dd). (optional)
     * @param invoiceDate Search by invoice date(yyyy-MM-dd). (optional)
     * @param invoiceDueDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param orderDate Search by OrderDate date(yyyy-MM-dd). (optional)
     * @param orderFromDate Search by OrderFromDate date(yyyy-MM-dd). (optional)
     * @param orderToDate Search by OrderToDate date(yyyy-MM-dd). (optional)
     * @param orderNumber Search by order number (optional)
     * @param deliveryNumber Search by delivery number. (optional)
     * @param invoiceNumber The Ingram Micro invoice number. (optional)
     * @param invoiceStatus Ingram Micro invoice status. (optional)
     * @param invoiceType Ingram Micro InvoiceType. (optional)
     * @param customerOrderNumber Ingram Micro CustomerOrderNumber. (optional)
     * @param endCustomerOrderNumber Ingram Micro EndCustomerOrderNumber. (optional)
     * @param specialBidNumber Ingram Micro SpecialBidNumber. (optional)
     * @param invoiceFromDueDate Search by invoice due date from(yyyy-MM-dd). (optional)
     * @param invoiceToDueDate Search by invoice due date to(yyyy-MM-dd). (optional)
     * @param invoiceFromDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param invoiceToDate Search by invoice date To(yyyy-MM-dd). (optional)
     * @param pageSize Number of records required in the call - max records 100 per page. (optional)
     * @param pageNumber The page number reference. (optional)
     * @param orderby Column name with which we want to sort. (optional)
     * @param direction asc or desc , along with orderby column result set will be sorted. (optional)
     * @param serialNumber Serial number of the product. (optional)
     * @return ApiResponse&lt;InvoiceSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> InvoiceSearchResponse to be returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoiceSearchResponse> getResellersV6InvoicesearchWithHttpInfo(String imApplicationID, String imCustomerNumber, String imCountryCode, String imCorrelationID, String paymentTermsNetDate, String invoiceDate, String invoiceDueDate, String orderDate, String orderFromDate, String orderToDate, String orderNumber, String deliveryNumber, String invoiceNumber, String invoiceStatus, String invoiceType, String customerOrderNumber, String endCustomerOrderNumber, String specialBidNumber, String invoiceFromDueDate, String invoiceToDueDate, List<String> invoiceFromDate, List<String> invoiceToDate, Integer pageSize, Integer pageNumber, String orderby, String direction, String serialNumber) throws ApiException {
        okhttp3.Call localVarCall = getResellersV6InvoicesearchValidateBeforeCall(imApplicationID, imCustomerNumber, imCountryCode, imCorrelationID, paymentTermsNetDate, invoiceDate, invoiceDueDate, orderDate, orderFromDate, orderToDate, orderNumber, deliveryNumber, invoiceNumber, invoiceStatus, invoiceType, customerOrderNumber, endCustomerOrderNumber, specialBidNumber, invoiceFromDueDate, invoiceToDueDate, invoiceFromDate, invoiceToDate, pageSize, pageNumber, orderby, direction, serialNumber, null);
        Type localVarReturnType = new TypeToken<InvoiceSearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search your invoice (asynchronously)
     * Search your Ingram Micro invoices. This endpoint searches by multiple invoice parameters and supports pagination of results.
     * @param imApplicationID Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param paymentTermsNetDate Search by payment terms net date(yyyy-MM-dd). (optional)
     * @param invoiceDate Search by invoice date(yyyy-MM-dd). (optional)
     * @param invoiceDueDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param orderDate Search by OrderDate date(yyyy-MM-dd). (optional)
     * @param orderFromDate Search by OrderFromDate date(yyyy-MM-dd). (optional)
     * @param orderToDate Search by OrderToDate date(yyyy-MM-dd). (optional)
     * @param orderNumber Search by order number (optional)
     * @param deliveryNumber Search by delivery number. (optional)
     * @param invoiceNumber The Ingram Micro invoice number. (optional)
     * @param invoiceStatus Ingram Micro invoice status. (optional)
     * @param invoiceType Ingram Micro InvoiceType. (optional)
     * @param customerOrderNumber Ingram Micro CustomerOrderNumber. (optional)
     * @param endCustomerOrderNumber Ingram Micro EndCustomerOrderNumber. (optional)
     * @param specialBidNumber Ingram Micro SpecialBidNumber. (optional)
     * @param invoiceFromDueDate Search by invoice due date from(yyyy-MM-dd). (optional)
     * @param invoiceToDueDate Search by invoice due date to(yyyy-MM-dd). (optional)
     * @param invoiceFromDate Search by invoice date from(yyyy-MM-dd). (optional)
     * @param invoiceToDate Search by invoice date To(yyyy-MM-dd). (optional)
     * @param pageSize Number of records required in the call - max records 100 per page. (optional)
     * @param pageNumber The page number reference. (optional)
     * @param orderby Column name with which we want to sort. (optional)
     * @param direction asc or desc , along with orderby column result set will be sorted. (optional)
     * @param serialNumber Serial number of the product. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> InvoiceSearchResponse to be returned </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getResellersV6InvoicesearchAsync(String imApplicationID, String imCustomerNumber, String imCountryCode, String imCorrelationID, String paymentTermsNetDate, String invoiceDate, String invoiceDueDate, String orderDate, String orderFromDate, String orderToDate, String orderNumber, String deliveryNumber, String invoiceNumber, String invoiceStatus, String invoiceType, String customerOrderNumber, String endCustomerOrderNumber, String specialBidNumber, String invoiceFromDueDate, String invoiceToDueDate, List<String> invoiceFromDate, List<String> invoiceToDate, Integer pageSize, Integer pageNumber, String orderby, String direction, String serialNumber, final ApiCallback<InvoiceSearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResellersV6InvoicesearchValidateBeforeCall(imApplicationID, imCustomerNumber, imCountryCode, imCorrelationID, paymentTermsNetDate, invoiceDate, invoiceDueDate, orderDate, orderFromDate, orderToDate, orderNumber, deliveryNumber, invoiceNumber, invoiceStatus, invoiceType, customerOrderNumber, endCustomerOrderNumber, specialBidNumber, invoiceFromDueDate, invoiceToDueDate, invoiceFromDate, invoiceToDate, pageSize, pageNumber, orderby, direction, serialNumber, _callback);
        Type localVarReturnType = new TypeToken<InvoiceSearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
