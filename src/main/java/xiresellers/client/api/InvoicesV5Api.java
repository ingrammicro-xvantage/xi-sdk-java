/*
 * Reseller API
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
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


import xiresellers.client.model.InvoiceDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoicesV5Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public InvoicesV5Api() {
        this(Configuration.getDefaultApiClient());
    }

    public InvoicesV5Api(ApiClient apiClient) {
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
     * Build call for getInvoices
     * @param invoiceNumber Ingram Micro Invoice Number (required)
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode ISO 2 char country code (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInvoicesCall(String invoiceNumber, String customerNumber, String isoCountryCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/resellers/v5/invoices/{invoiceNumber}"
            .replace("{" + "invoiceNumber" + "}", localVarApiClient.escapeString(invoiceNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (customerNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("customerNumber", customerNumber));
        }

        if (isoCountryCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("isoCountryCode", isoCountryCode));
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

        String[] localVarAuthNames = new String[] { "application" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInvoicesValidateBeforeCall(String invoiceNumber, String customerNumber, String isoCountryCode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'invoiceNumber' is set
        if (invoiceNumber == null) {
            throw new ApiException("Missing the required parameter 'invoiceNumber' when calling getInvoices(Async)");
        }

        // verify the required parameter 'customerNumber' is set
        if (customerNumber == null) {
            throw new ApiException("Missing the required parameter 'customerNumber' when calling getInvoices(Async)");
        }

        // verify the required parameter 'isoCountryCode' is set
        if (isoCountryCode == null) {
            throw new ApiException("Missing the required parameter 'isoCountryCode' when calling getInvoices(Async)");
        }

        return getInvoicesCall(invoiceNumber, customerNumber, isoCountryCode, _callback);

    }

    /**
     * Get Invoice Details
     * View invoice details. This is a request to query invoice details for a specific Ingram Micro order placed in the last 9 months, whether open or shipped.   &lt;strong&gt;invoiceNumber&lt;/strong&gt;, &lt;strong&gt;isoCountryCode&lt;/strong&gt; and &lt;strong&gt;customerNumber&lt;/strong&gt; parameters are required.
     * @param invoiceNumber Ingram Micro Invoice Number (required)
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode ISO 2 char country code (required)
     * @return InvoiceDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public InvoiceDetails getInvoices(String invoiceNumber, String customerNumber, String isoCountryCode) throws ApiException {
        ApiResponse<InvoiceDetails> localVarResp = getInvoicesWithHttpInfo(invoiceNumber, customerNumber, isoCountryCode);
        return localVarResp.getData();
    }

    /**
     * Get Invoice Details
     * View invoice details. This is a request to query invoice details for a specific Ingram Micro order placed in the last 9 months, whether open or shipped.   &lt;strong&gt;invoiceNumber&lt;/strong&gt;, &lt;strong&gt;isoCountryCode&lt;/strong&gt; and &lt;strong&gt;customerNumber&lt;/strong&gt; parameters are required.
     * @param invoiceNumber Ingram Micro Invoice Number (required)
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode ISO 2 char country code (required)
     * @return ApiResponse&lt;InvoiceDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InvoiceDetails> getInvoicesWithHttpInfo(String invoiceNumber, String customerNumber, String isoCountryCode) throws ApiException {
        okhttp3.Call localVarCall = getInvoicesValidateBeforeCall(invoiceNumber, customerNumber, isoCountryCode, null);
        Type localVarReturnType = new TypeToken<InvoiceDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Invoice Details (asynchronously)
     * View invoice details. This is a request to query invoice details for a specific Ingram Micro order placed in the last 9 months, whether open or shipped.   &lt;strong&gt;invoiceNumber&lt;/strong&gt;, &lt;strong&gt;isoCountryCode&lt;/strong&gt; and &lt;strong&gt;customerNumber&lt;/strong&gt; parameters are required.
     * @param invoiceNumber Ingram Micro Invoice Number (required)
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode ISO 2 char country code (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInvoicesAsync(String invoiceNumber, String customerNumber, String isoCountryCode, final ApiCallback<InvoiceDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInvoicesValidateBeforeCall(invoiceNumber, customerNumber, isoCountryCode, _callback);
        Type localVarReturnType = new TypeToken<InvoiceDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
