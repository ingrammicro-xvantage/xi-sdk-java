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


import xiresellers.client.model.QuoteDetails;
import xiresellers.client.model.QuoteListRequest;
import xiresellers.client.model.QuoteListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuotesV5Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QuotesV5Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QuotesV5Api(ApiClient apiClient) {
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
     * Build call for getV5QuotesDetails
     * @param quoteNumber Ingram Micro Quote Number (required)
     * @param customerNumber Your Ingram Micro unique customer number (required)
     * @param isoCountryCode  (required)
     * @param thirdPartySource Unique identifier used to identify the third party source accessing the services (optional, default to customer)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getV5QuotesDetailsCall(String quoteNumber, String customerNumber, String isoCountryCode, String thirdPartySource, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/resellers/v5/quote/{quoteNumber}"
            .replace("{" + "quoteNumber" + "}", localVarApiClient.escapeString(quoteNumber.toString()));

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

        if (thirdPartySource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("thirdPartySource", thirdPartySource));
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
    private okhttp3.Call getV5QuotesDetailsValidateBeforeCall(String quoteNumber, String customerNumber, String isoCountryCode, String thirdPartySource, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'quoteNumber' is set
        if (quoteNumber == null) {
            throw new ApiException("Missing the required parameter 'quoteNumber' when calling getV5QuotesDetails(Async)");
        }

        // verify the required parameter 'customerNumber' is set
        if (customerNumber == null) {
            throw new ApiException("Missing the required parameter 'customerNumber' when calling getV5QuotesDetails(Async)");
        }

        // verify the required parameter 'isoCountryCode' is set
        if (isoCountryCode == null) {
            throw new ApiException("Missing the required parameter 'isoCountryCode' when calling getV5QuotesDetails(Async)");
        }

        return getV5QuotesDetailsCall(quoteNumber, customerNumber, isoCountryCode, thirdPartySource, _callback);

    }

    /**
     * Get Quote Details
     * The quote details API provides all quote details associated with the quote number provided.   The “&lt;strong&gt;quoteNumber&lt;/strong&gt;”, “&lt;strong&gt;isoCountryCode&lt;/strong&gt;” and “&lt;strong&gt;customerNumber&lt;/strong&gt;” parameters are required.
     * @param quoteNumber Ingram Micro Quote Number (required)
     * @param customerNumber Your Ingram Micro unique customer number (required)
     * @param isoCountryCode  (required)
     * @param thirdPartySource Unique identifier used to identify the third party source accessing the services (optional, default to customer)
     * @return QuoteDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuoteDetails getV5QuotesDetails(String quoteNumber, String customerNumber, String isoCountryCode, String thirdPartySource) throws ApiException {
        ApiResponse<QuoteDetails> localVarResp = getV5QuotesDetailsWithHttpInfo(quoteNumber, customerNumber, isoCountryCode, thirdPartySource);
        return localVarResp.getData();
    }

    /**
     * Get Quote Details
     * The quote details API provides all quote details associated with the quote number provided.   The “&lt;strong&gt;quoteNumber&lt;/strong&gt;”, “&lt;strong&gt;isoCountryCode&lt;/strong&gt;” and “&lt;strong&gt;customerNumber&lt;/strong&gt;” parameters are required.
     * @param quoteNumber Ingram Micro Quote Number (required)
     * @param customerNumber Your Ingram Micro unique customer number (required)
     * @param isoCountryCode  (required)
     * @param thirdPartySource Unique identifier used to identify the third party source accessing the services (optional, default to customer)
     * @return ApiResponse&lt;QuoteDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuoteDetails> getV5QuotesDetailsWithHttpInfo(String quoteNumber, String customerNumber, String isoCountryCode, String thirdPartySource) throws ApiException {
        okhttp3.Call localVarCall = getV5QuotesDetailsValidateBeforeCall(quoteNumber, customerNumber, isoCountryCode, thirdPartySource, null);
        Type localVarReturnType = new TypeToken<QuoteDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Quote Details (asynchronously)
     * The quote details API provides all quote details associated with the quote number provided.   The “&lt;strong&gt;quoteNumber&lt;/strong&gt;”, “&lt;strong&gt;isoCountryCode&lt;/strong&gt;” and “&lt;strong&gt;customerNumber&lt;/strong&gt;” parameters are required.
     * @param quoteNumber Ingram Micro Quote Number (required)
     * @param customerNumber Your Ingram Micro unique customer number (required)
     * @param isoCountryCode  (required)
     * @param thirdPartySource Unique identifier used to identify the third party source accessing the services (optional, default to customer)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getV5QuotesDetailsAsync(String quoteNumber, String customerNumber, String isoCountryCode, String thirdPartySource, final ApiCallback<QuoteDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV5QuotesDetailsValidateBeforeCall(quoteNumber, customerNumber, isoCountryCode, thirdPartySource, _callback);
        Type localVarReturnType = new TypeToken<QuoteDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postV5QuotesSearch
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
    public okhttp3.Call postV5QuotesSearchCall(QuoteListRequest quoteListRequest, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/resellers/v5/quote/search";

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
    private okhttp3.Call postV5QuotesSearchValidateBeforeCall(QuoteListRequest quoteListRequest, final ApiCallback _callback) throws ApiException {
        return postV5QuotesSearchCall(quoteListRequest, _callback);

    }

    /**
     * Search Quotes
     * This endpoint enables the retrieval and filtering of relevant quote list key criteria data, such as quote number, special bid numbers, end user name, status, and date ranges from the Ingram Micro system. By default, the Quotes endpoint retrieves quotes modified or created within the last 30 days.   Observe these additional parameters:&lt;ul&gt;&lt;li&gt;Only active quotes are available through this API.&lt;/li&gt;&lt;li&gt;Quotes older than 365 days are excluded by default.&lt;/li&gt;&lt;li&gt;You can use date range filters to retrieve quotes older than 30 days and up to 365 days.&lt;/li&gt;&lt;li&gt;Quotes that are in draft and closed states are excluded, and are not accessible through this API.&lt;/li&gt;&lt;/ul&gt;
     * @param quoteListRequest  (optional)
     * @return QuoteListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QuoteListResponse postV5QuotesSearch(QuoteListRequest quoteListRequest) throws ApiException {
        ApiResponse<QuoteListResponse> localVarResp = postV5QuotesSearchWithHttpInfo(quoteListRequest);
        return localVarResp.getData();
    }

    /**
     * Search Quotes
     * This endpoint enables the retrieval and filtering of relevant quote list key criteria data, such as quote number, special bid numbers, end user name, status, and date ranges from the Ingram Micro system. By default, the Quotes endpoint retrieves quotes modified or created within the last 30 days.   Observe these additional parameters:&lt;ul&gt;&lt;li&gt;Only active quotes are available through this API.&lt;/li&gt;&lt;li&gt;Quotes older than 365 days are excluded by default.&lt;/li&gt;&lt;li&gt;You can use date range filters to retrieve quotes older than 30 days and up to 365 days.&lt;/li&gt;&lt;li&gt;Quotes that are in draft and closed states are excluded, and are not accessible through this API.&lt;/li&gt;&lt;/ul&gt;
     * @param quoteListRequest  (optional)
     * @return ApiResponse&lt;QuoteListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuoteListResponse> postV5QuotesSearchWithHttpInfo(QuoteListRequest quoteListRequest) throws ApiException {
        okhttp3.Call localVarCall = postV5QuotesSearchValidateBeforeCall(quoteListRequest, null);
        Type localVarReturnType = new TypeToken<QuoteListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Quotes (asynchronously)
     * This endpoint enables the retrieval and filtering of relevant quote list key criteria data, such as quote number, special bid numbers, end user name, status, and date ranges from the Ingram Micro system. By default, the Quotes endpoint retrieves quotes modified or created within the last 30 days.   Observe these additional parameters:&lt;ul&gt;&lt;li&gt;Only active quotes are available through this API.&lt;/li&gt;&lt;li&gt;Quotes older than 365 days are excluded by default.&lt;/li&gt;&lt;li&gt;You can use date range filters to retrieve quotes older than 30 days and up to 365 days.&lt;/li&gt;&lt;li&gt;Quotes that are in draft and closed states are excluded, and are not accessible through this API.&lt;/li&gt;&lt;/ul&gt;
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
    public okhttp3.Call postV5QuotesSearchAsync(QuoteListRequest quoteListRequest, final ApiCallback<QuoteListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postV5QuotesSearchValidateBeforeCall(quoteListRequest, _callback);
        Type localVarReturnType = new TypeToken<QuoteListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
