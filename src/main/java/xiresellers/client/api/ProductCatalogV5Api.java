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


import xiresellers.client.model.PriceAndAvailabilityRequest;
import xiresellers.client.model.PriceAndAvailabilityResponse;
import xiresellers.client.model.ProductSearchResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCatalogV5Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProductCatalogV5Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ProductCatalogV5Api(ApiClient apiClient) {
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
     * Build call for getV5CatalogProductsearch
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode 2 chars country code (required)
     * @param partNumber Part Number can be ingram part number or vendor part number or customer part number or UPC (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getV5CatalogProductsearchCall(String customerNumber, String isoCountryCode, String partNumber, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/resellers/v5/Catalog";

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

        if (partNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("partNumber", partNumber));
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
    private okhttp3.Call getV5CatalogProductsearchValidateBeforeCall(String customerNumber, String isoCountryCode, String partNumber, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'customerNumber' is set
        if (customerNumber == null) {
            throw new ApiException("Missing the required parameter 'customerNumber' when calling getV5CatalogProductsearch(Async)");
        }

        // verify the required parameter 'isoCountryCode' is set
        if (isoCountryCode == null) {
            throw new ApiException("Missing the required parameter 'isoCountryCode' when calling getV5CatalogProductsearch(Async)");
        }

        // verify the required parameter 'partNumber' is set
        if (partNumber == null) {
            throw new ApiException("Missing the required parameter 'partNumber' when calling getV5CatalogProductsearch(Async)");
        }

        return getV5CatalogProductsearchCall(customerNumber, isoCountryCode, partNumber, _callback);

    }

    /**
     * Search Product Catalog
     * Search the Ingram Micro product catalog using customerNumber, isoCountryCode and partNumber.&lt;ul&gt;&lt;li&gt;customerNumber and isoCountryCode fields are required.&lt;/li&gt;&lt;li&gt;The PartNumber field accepts the following:&lt;ul&gt;&lt;li&gt;Ingram part number&lt;/li&gt;&lt;li&gt;Vendor part number&lt;/li&gt;&lt;li&gt;Customer part number&lt;/li&gt;&lt;li&gt;UPC (Universal Product Code)&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode 2 chars country code (required)
     * @param partNumber Part Number can be ingram part number or vendor part number or customer part number or UPC (required)
     * @return ProductSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ProductSearchResponse getV5CatalogProductsearch(String customerNumber, String isoCountryCode, String partNumber) throws ApiException {
        ApiResponse<ProductSearchResponse> localVarResp = getV5CatalogProductsearchWithHttpInfo(customerNumber, isoCountryCode, partNumber);
        return localVarResp.getData();
    }

    /**
     * Search Product Catalog
     * Search the Ingram Micro product catalog using customerNumber, isoCountryCode and partNumber.&lt;ul&gt;&lt;li&gt;customerNumber and isoCountryCode fields are required.&lt;/li&gt;&lt;li&gt;The PartNumber field accepts the following:&lt;ul&gt;&lt;li&gt;Ingram part number&lt;/li&gt;&lt;li&gt;Vendor part number&lt;/li&gt;&lt;li&gt;Customer part number&lt;/li&gt;&lt;li&gt;UPC (Universal Product Code)&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode 2 chars country code (required)
     * @param partNumber Part Number can be ingram part number or vendor part number or customer part number or UPC (required)
     * @return ApiResponse&lt;ProductSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProductSearchResponse> getV5CatalogProductsearchWithHttpInfo(String customerNumber, String isoCountryCode, String partNumber) throws ApiException {
        okhttp3.Call localVarCall = getV5CatalogProductsearchValidateBeforeCall(customerNumber, isoCountryCode, partNumber, null);
        Type localVarReturnType = new TypeToken<ProductSearchResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Product Catalog (asynchronously)
     * Search the Ingram Micro product catalog using customerNumber, isoCountryCode and partNumber.&lt;ul&gt;&lt;li&gt;customerNumber and isoCountryCode fields are required.&lt;/li&gt;&lt;li&gt;The PartNumber field accepts the following:&lt;ul&gt;&lt;li&gt;Ingram part number&lt;/li&gt;&lt;li&gt;Vendor part number&lt;/li&gt;&lt;li&gt;Customer part number&lt;/li&gt;&lt;li&gt;UPC (Universal Product Code)&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param customerNumber Your unique Ingram Micro customer number (required)
     * @param isoCountryCode 2 chars country code (required)
     * @param partNumber Part Number can be ingram part number or vendor part number or customer part number or UPC (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getV5CatalogProductsearchAsync(String customerNumber, String isoCountryCode, String partNumber, final ApiCallback<ProductSearchResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getV5CatalogProductsearchValidateBeforeCall(customerNumber, isoCountryCode, partNumber, _callback);
        Type localVarReturnType = new TypeToken<ProductSearchResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for multiSKUPriceAndStock
     * @param priceAndAvailabilityRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call multiSKUPriceAndStockCall(PriceAndAvailabilityRequest priceAndAvailabilityRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = priceAndAvailabilityRequest;

        // create path and map variables
        String localVarPath = "/resellers/v5/Catalog/priceandavailability";

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
    private okhttp3.Call multiSKUPriceAndStockValidateBeforeCall(PriceAndAvailabilityRequest priceAndAvailabilityRequest, final ApiCallback _callback) throws ApiException {
        return multiSKUPriceAndStockCall(priceAndAvailabilityRequest, _callback);

    }

    /**
     * Find availability of upto 50 SKUs
     * Search the product catalog for the price and availability for up to 50 SKUs at one time. This endpoint helps to confirm the details just prior to placing a real-time call.&lt;ul&gt;&lt;li&gt;You may request visibility for reserve stock if you participate in reserved inventory, in addition to the stock that is open to all the partners. Please see the details in the endpoint model below.&lt;/li&gt;&lt;li&gt;Follow these guidelines when using this endpoint:&lt;ul&gt;&lt;li&gt;This endpoint is not for refreshing the full catalog with availability and pricing information. Ingram Micro applies rate limits on this endpoint. Continuous cyclical calls will error out. Customers that perform this activity may lose access to the endpoint.&lt;/li&gt;&lt;li&gt;For the full catalog refresh, Ingram Micro can provide a Price and Inventory file in flat file format, made available through FTP download. Please contact your Ingram Micro sales rep for details.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param priceAndAvailabilityRequest  (optional)
     * @return PriceAndAvailabilityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public PriceAndAvailabilityResponse multiSKUPriceAndStock(PriceAndAvailabilityRequest priceAndAvailabilityRequest) throws ApiException {
        ApiResponse<PriceAndAvailabilityResponse> localVarResp = multiSKUPriceAndStockWithHttpInfo(priceAndAvailabilityRequest);
        return localVarResp.getData();
    }

    /**
     * Find availability of upto 50 SKUs
     * Search the product catalog for the price and availability for up to 50 SKUs at one time. This endpoint helps to confirm the details just prior to placing a real-time call.&lt;ul&gt;&lt;li&gt;You may request visibility for reserve stock if you participate in reserved inventory, in addition to the stock that is open to all the partners. Please see the details in the endpoint model below.&lt;/li&gt;&lt;li&gt;Follow these guidelines when using this endpoint:&lt;ul&gt;&lt;li&gt;This endpoint is not for refreshing the full catalog with availability and pricing information. Ingram Micro applies rate limits on this endpoint. Continuous cyclical calls will error out. Customers that perform this activity may lose access to the endpoint.&lt;/li&gt;&lt;li&gt;For the full catalog refresh, Ingram Micro can provide a Price and Inventory file in flat file format, made available through FTP download. Please contact your Ingram Micro sales rep for details.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param priceAndAvailabilityRequest  (optional)
     * @return ApiResponse&lt;PriceAndAvailabilityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PriceAndAvailabilityResponse> multiSKUPriceAndStockWithHttpInfo(PriceAndAvailabilityRequest priceAndAvailabilityRequest) throws ApiException {
        okhttp3.Call localVarCall = multiSKUPriceAndStockValidateBeforeCall(priceAndAvailabilityRequest, null);
        Type localVarReturnType = new TypeToken<PriceAndAvailabilityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find availability of upto 50 SKUs (asynchronously)
     * Search the product catalog for the price and availability for up to 50 SKUs at one time. This endpoint helps to confirm the details just prior to placing a real-time call.&lt;ul&gt;&lt;li&gt;You may request visibility for reserve stock if you participate in reserved inventory, in addition to the stock that is open to all the partners. Please see the details in the endpoint model below.&lt;/li&gt;&lt;li&gt;Follow these guidelines when using this endpoint:&lt;ul&gt;&lt;li&gt;This endpoint is not for refreshing the full catalog with availability and pricing information. Ingram Micro applies rate limits on this endpoint. Continuous cyclical calls will error out. Customers that perform this activity may lose access to the endpoint.&lt;/li&gt;&lt;li&gt;For the full catalog refresh, Ingram Micro can provide a Price and Inventory file in flat file format, made available through FTP download. Please contact your Ingram Micro sales rep for details.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     * @param priceAndAvailabilityRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call multiSKUPriceAndStockAsync(PriceAndAvailabilityRequest priceAndAvailabilityRequest, final ApiCallback<PriceAndAvailabilityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = multiSKUPriceAndStockValidateBeforeCall(priceAndAvailabilityRequest, _callback);
        Type localVarReturnType = new TypeToken<PriceAndAvailabilityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
