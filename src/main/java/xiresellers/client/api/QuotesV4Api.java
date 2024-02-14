/*
 * XI Sdk Resellers
 * For Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
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


import xiresellers.client.model.QuoteDetailsRequest;
import xiresellers.client.model.QuoteDetailsResponse;
import xiresellers.client.model.QuoteListRequest;
import xiresellers.client.model.QuoteListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuotesV4Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QuotesV4Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QuotesV4Api(ApiClient apiClient) {
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
     * Build call for postV4Quotedetails
     * @param quoteDetailsRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postV4QuotedetailsCall(QuoteDetailsRequest quoteDetailsRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = quoteDetailsRequest;

        // create path and map variables
        String localVarPath = "/quotes/v1/quotedetails";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "application" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postV4QuotedetailsValidateBeforeCall(QuoteDetailsRequest quoteDetailsRequest, final ApiCallback _callback) throws ApiException {
        return postV4QuotedetailsCall(quoteDetailsRequest, _callback);

    }

    /**
     * Get Quote Details
     * A real-time request to delete a previously accepted order must be submitted before the order is released to Ingram Micro’s warehouse. After release the order is no longer eligible for deletion. Order delete transaction submitted after the order is released will be rejected and will not be applied. *Direct ship orders cannot be deleted. Contact your sales rep for assistance.
     * @param quoteDetailsRequest  (optional)
     * @return QuoteDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuoteDetailsResponse postV4Quotedetails(QuoteDetailsRequest quoteDetailsRequest) throws ApiException {
        ApiResponse<QuoteDetailsResponse> localVarResp = postV4QuotedetailsWithHttpInfo(quoteDetailsRequest);
        return localVarResp.getData();
    }

    /**
     * Get Quote Details
     * A real-time request to delete a previously accepted order must be submitted before the order is released to Ingram Micro’s warehouse. After release the order is no longer eligible for deletion. Order delete transaction submitted after the order is released will be rejected and will not be applied. *Direct ship orders cannot be deleted. Contact your sales rep for assistance.
     * @param quoteDetailsRequest  (optional)
     * @return ApiResponse&lt;QuoteDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuoteDetailsResponse> postV4QuotedetailsWithHttpInfo(QuoteDetailsRequest quoteDetailsRequest) throws ApiException {
        okhttp3.Call localVarCall = postV4QuotedetailsValidateBeforeCall(quoteDetailsRequest, null);
        Type localVarReturnType = new TypeToken<QuoteDetailsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Quote Details (asynchronously)
     * A real-time request to delete a previously accepted order must be submitted before the order is released to Ingram Micro’s warehouse. After release the order is no longer eligible for deletion. Order delete transaction submitted after the order is released will be rejected and will not be applied. *Direct ship orders cannot be deleted. Contact your sales rep for assistance.
     * @param quoteDetailsRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postV4QuotedetailsAsync(QuoteDetailsRequest quoteDetailsRequest, final ApiCallback<QuoteDetailsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postV4QuotedetailsValidateBeforeCall(quoteDetailsRequest, _callback);
        Type localVarReturnType = new TypeToken<QuoteDetailsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postV4Quotesearch
     * @param quoteListRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postV4QuotesearchCall(QuoteListRequest quoteListRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = quoteListRequest;

        // create path and map variables
        String localVarPath = "/quotes/v1/quotes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "application" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postV4QuotesearchValidateBeforeCall(QuoteListRequest quoteListRequest, final ApiCallback _callback) throws ApiException {
        return postV4QuotesearchCall(quoteListRequest, _callback);

    }

    /**
     * Get Quote List
     * A real-time request that allows the customer to query Ingram Micro for detailed information for a specific open or shipped order. Orders are searched using Ingram Micro Sales Order Number.
     * @param quoteListRequest  (optional)
     * @return QuoteListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuoteListResponse postV4Quotesearch(QuoteListRequest quoteListRequest) throws ApiException {
        ApiResponse<QuoteListResponse> localVarResp = postV4QuotesearchWithHttpInfo(quoteListRequest);
        return localVarResp.getData();
    }

    /**
     * Get Quote List
     * A real-time request that allows the customer to query Ingram Micro for detailed information for a specific open or shipped order. Orders are searched using Ingram Micro Sales Order Number.
     * @param quoteListRequest  (optional)
     * @return ApiResponse&lt;QuoteListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuoteListResponse> postV4QuotesearchWithHttpInfo(QuoteListRequest quoteListRequest) throws ApiException {
        okhttp3.Call localVarCall = postV4QuotesearchValidateBeforeCall(quoteListRequest, null);
        Type localVarReturnType = new TypeToken<QuoteListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Quote List (asynchronously)
     * A real-time request that allows the customer to query Ingram Micro for detailed information for a specific open or shipped order. Orders are searched using Ingram Micro Sales Order Number.
     * @param quoteListRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postV4QuotesearchAsync(QuoteListRequest quoteListRequest, final ApiCallback<QuoteListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postV4QuotesearchValidateBeforeCall(quoteListRequest, _callback);
        Type localVarReturnType = new TypeToken<QuoteListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
