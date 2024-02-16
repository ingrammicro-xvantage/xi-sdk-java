/*
 * XI SDK Resellers
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


import xiresellers.client.model.DealsDetailsResponse;
import xiresellers.client.model.DealsSearchResponse;
import xiresellers.client.model.GetResellerV6ValidateQuote500Response;
import xiresellers.client.model.PostRenewalssearch400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DealsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DealsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DealsApi(ApiClient apiClient) {
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
     * Build call for getResellersV6Dealsdetails
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationId Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imEnvironment Environment name. (required)
     * @param dealId Unique deal ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getResellersV6DealsdetailsCall(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationId, String imEnvironment, String dealId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/resellers/v6/deals/{dealId}"
            .replace("{" + "dealId" + "}", localVarApiClient.escapeString(dealId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (imCustomerNumber != null) {
            localVarHeaderParams.put("IM-CustomerNumber", localVarApiClient.parameterToString(imCustomerNumber));
        }

        if (imCountryCode != null) {
            localVarHeaderParams.put("IM-CountryCode", localVarApiClient.parameterToString(imCountryCode));
        }

        if (imCorrelationID != null) {
            localVarHeaderParams.put("IM-CorrelationID", localVarApiClient.parameterToString(imCorrelationID));
        }

        if (imApplicationId != null) {
            localVarHeaderParams.put("IM-ApplicationId", localVarApiClient.parameterToString(imApplicationId));
        }

        if (imEnvironment != null) {
            localVarHeaderParams.put("IM-Environment", localVarApiClient.parameterToString(imEnvironment));
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
    private okhttp3.Call getResellersV6DealsdetailsValidateBeforeCall(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationId, String imEnvironment, String dealId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'imCustomerNumber' is set
        if (imCustomerNumber == null) {
            throw new ApiException("Missing the required parameter 'imCustomerNumber' when calling getResellersV6Dealsdetails(Async)");
        }

        // verify the required parameter 'imCountryCode' is set
        if (imCountryCode == null) {
            throw new ApiException("Missing the required parameter 'imCountryCode' when calling getResellersV6Dealsdetails(Async)");
        }

        // verify the required parameter 'imCorrelationID' is set
        if (imCorrelationID == null) {
            throw new ApiException("Missing the required parameter 'imCorrelationID' when calling getResellersV6Dealsdetails(Async)");
        }

        // verify the required parameter 'imApplicationId' is set
        if (imApplicationId == null) {
            throw new ApiException("Missing the required parameter 'imApplicationId' when calling getResellersV6Dealsdetails(Async)");
        }

        // verify the required parameter 'imEnvironment' is set
        if (imEnvironment == null) {
            throw new ApiException("Missing the required parameter 'imEnvironment' when calling getResellersV6Dealsdetails(Async)");
        }

        // verify the required parameter 'dealId' is set
        if (dealId == null) {
            throw new ApiException("Missing the required parameter 'dealId' when calling getResellersV6Dealsdetails(Async)");
        }

        return getResellersV6DealsdetailsCall(imCustomerNumber, imCountryCode, imCorrelationID, imApplicationId, imEnvironment, dealId, _callback);

    }

    /**
     * Deals Details
     * The Deals Details API will retrieve all the details related to the specific deal id.
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationId Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imEnvironment Environment name. (required)
     * @param dealId Unique deal ID. (required)
     * @return DealsDetailsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public DealsDetailsResponse getResellersV6Dealsdetails(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationId, String imEnvironment, String dealId) throws ApiException {
        ApiResponse<DealsDetailsResponse> localVarResp = getResellersV6DealsdetailsWithHttpInfo(imCustomerNumber, imCountryCode, imCorrelationID, imApplicationId, imEnvironment, dealId);
        return localVarResp.getData();
    }

    /**
     * Deals Details
     * The Deals Details API will retrieve all the details related to the specific deal id.
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationId Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imEnvironment Environment name. (required)
     * @param dealId Unique deal ID. (required)
     * @return ApiResponse&lt;DealsDetailsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DealsDetailsResponse> getResellersV6DealsdetailsWithHttpInfo(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationId, String imEnvironment, String dealId) throws ApiException {
        okhttp3.Call localVarCall = getResellersV6DealsdetailsValidateBeforeCall(imCustomerNumber, imCountryCode, imCorrelationID, imApplicationId, imEnvironment, dealId, null);
        Type localVarReturnType = new TypeToken<DealsDetailsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deals Details (asynchronously)
     * The Deals Details API will retrieve all the details related to the specific deal id.
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imApplicationId Unique value used to identify the sender of the transaction. Example: MyCompany (required)
     * @param imEnvironment Environment name. (required)
     * @param dealId Unique deal ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getResellersV6DealsdetailsAsync(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imApplicationId, String imEnvironment, String dealId, final ApiCallback<DealsDetailsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResellersV6DealsdetailsValidateBeforeCall(imCustomerNumber, imCountryCode, imCorrelationID, imApplicationId, imEnvironment, dealId, _callback);
        Type localVarReturnType = new TypeToken<DealsDetailsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getResellersV6Dealssearch
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. Example: MyCompany (optional)
     * @param endUser The end user/customer&#39;s name. (optional)
     * @param vendor The vendor&#39;s name. (optional)
     * @param dealId Deal/Special bid number. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getResellersV6DealssearchCall(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imSenderID, String endUser, String vendor, String dealId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/resellers/v6/deals/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (endUser != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("endUser", endUser));
        }

        if (vendor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("vendor", vendor));
        }

        if (dealId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dealId", dealId));
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

        if (imSenderID != null) {
            localVarHeaderParams.put("IM-SenderID", localVarApiClient.parameterToString(imSenderID));
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
    private okhttp3.Call getResellersV6DealssearchValidateBeforeCall(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imSenderID, String endUser, String vendor, String dealId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'imCustomerNumber' is set
        if (imCustomerNumber == null) {
            throw new ApiException("Missing the required parameter 'imCustomerNumber' when calling getResellersV6Dealssearch(Async)");
        }

        // verify the required parameter 'imCountryCode' is set
        if (imCountryCode == null) {
            throw new ApiException("Missing the required parameter 'imCountryCode' when calling getResellersV6Dealssearch(Async)");
        }

        // verify the required parameter 'imCorrelationID' is set
        if (imCorrelationID == null) {
            throw new ApiException("Missing the required parameter 'imCorrelationID' when calling getResellersV6Dealssearch(Async)");
        }

        return getResellersV6DealssearchCall(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, endUser, vendor, dealId, _callback);

    }

    /**
     * Deals Search
     * The Deals Search API, by default, will retrieve all the deals that are associated with the customer’s account. The customer will be able to search deals using the End-user name, Vendor name, or DealID. 
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. Example: MyCompany (optional)
     * @param endUser The end user/customer&#39;s name. (optional)
     * @param vendor The vendor&#39;s name. (optional)
     * @param dealId Deal/Special bid number. (optional)
     * @return DealsSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public DealsSearchResponse getResellersV6Dealssearch(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imSenderID, String endUser, String vendor, String dealId) throws ApiException {
        ApiResponse<DealsSearchResponse> localVarResp = getResellersV6DealssearchWithHttpInfo(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, endUser, vendor, dealId);
        return localVarResp.getData();
    }

    /**
     * Deals Search
     * The Deals Search API, by default, will retrieve all the deals that are associated with the customer’s account. The customer will be able to search deals using the End-user name, Vendor name, or DealID. 
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. Example: MyCompany (optional)
     * @param endUser The end user/customer&#39;s name. (optional)
     * @param vendor The vendor&#39;s name. (optional)
     * @param dealId Deal/Special bid number. (optional)
     * @return ApiResponse&lt;DealsSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DealsSearchResponse> getResellersV6DealssearchWithHttpInfo(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imSenderID, String endUser, String vendor, String dealId) throws ApiException {
        okhttp3.Call localVarCall = getResellersV6DealssearchValidateBeforeCall(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, endUser, vendor, dealId, null);
        Type localVarReturnType = new TypeToken<DealsSearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deals Search (asynchronously)
     * The Deals Search API, by default, will retrieve all the deals that are associated with the customer’s account. The customer will be able to search deals using the End-user name, Vendor name, or DealID. 
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction across all the systems. (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. Example: MyCompany (optional)
     * @param endUser The end user/customer&#39;s name. (optional)
     * @param vendor The vendor&#39;s name. (optional)
     * @param dealId Deal/Special bid number. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getResellersV6DealssearchAsync(String imCustomerNumber, String imCountryCode, String imCorrelationID, String imSenderID, String endUser, String vendor, String dealId, final ApiCallback<DealsSearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getResellersV6DealssearchValidateBeforeCall(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, endUser, vendor, dealId, _callback);
        Type localVarReturnType = new TypeToken<DealsSearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
