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


import xiresellers.client.model.GetResellerV6ValidateQuote500Response;
import xiresellers.client.model.PostQuoteToOrderV6400Response;
import xiresellers.client.model.QuoteToOrderDetailsDTO;
import xiresellers.client.model.QuoteToOrderResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuoteToOrderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QuoteToOrderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QuoteToOrderApi(ApiClient apiClient) {
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
     * Build call for postQuoteToOrderV6
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction accross all the systems. (required)
     * @param quoteToOrderDetailsDTO  (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postQuoteToOrderV6Call(String imCustomerNumber, String imCountryCode, String imCorrelationID, QuoteToOrderDetailsDTO quoteToOrderDetailsDTO, String imSenderID, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = quoteToOrderDetailsDTO;

        // create path and map variables
        String localVarPath = "/resellers/v6/q2o/orders";

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

        if (imSenderID != null) {
            localVarHeaderParams.put("IM-SenderID", localVarApiClient.parameterToString(imSenderID));
        }

        if (imCorrelationID != null) {
            localVarHeaderParams.put("IM-CorrelationID", localVarApiClient.parameterToString(imCorrelationID));
        }

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
    private okhttp3.Call postQuoteToOrderV6ValidateBeforeCall(String imCustomerNumber, String imCountryCode, String imCorrelationID, QuoteToOrderDetailsDTO quoteToOrderDetailsDTO, String imSenderID, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'imCustomerNumber' is set
        if (imCustomerNumber == null) {
            throw new ApiException("Missing the required parameter 'imCustomerNumber' when calling postQuoteToOrderV6(Async)");
        }

        // verify the required parameter 'imCountryCode' is set
        if (imCountryCode == null) {
            throw new ApiException("Missing the required parameter 'imCountryCode' when calling postQuoteToOrderV6(Async)");
        }

        // verify the required parameter 'imCorrelationID' is set
        if (imCorrelationID == null) {
            throw new ApiException("Missing the required parameter 'imCorrelationID' when calling postQuoteToOrderV6(Async)");
        }

        // verify the required parameter 'quoteToOrderDetailsDTO' is set
        if (quoteToOrderDetailsDTO == null) {
            throw new ApiException("Missing the required parameter 'quoteToOrderDetailsDTO' when calling postQuoteToOrderV6(Async)");
        }

        return postQuoteToOrderV6Call(imCustomerNumber, imCountryCode, imCorrelationID, quoteToOrderDetailsDTO, imSenderID, _callback);

    }

    /**
     * Quote To Order
     * The “Quote to Order” (QTO) endpoint allows a customer to create an order using the existing quote which is in “Ready to Order” status. A customer can create an order using Configure to order (CTO) quote or a non-configure to order (Non-CTO) quote. Upon successful submission of the order create request, a confirmation message will be returned as an API response. &lt;br &gt; &lt;br &gt;Ingram Micro offers webhooks as a method to send notifications to Resellers once the order creation request is received. All the updates related to Order creation will be pushed as a notification to the customer via a pre-defined callback URL as an HTTP post. &lt;br &gt; &lt;br &gt; **Prerequisite:** Pre-defined callback URL &lt;br &gt; &lt;br &gt; Before creating an order using the quote, it’s recommended to validate the quote using the “Validate Quote” endpoint. Validate Quote endpoint will not only validate the quote but also outline all the mandatory fields required by the vendor at a header level and at the line level which a customer need to pass to the Quote To Order endpoint request.  For a detailed understanding of the “Validate Quote” endpoint, review the “Validate Quote” endpoint documentation. &lt;br &gt;&lt;br &gt; **How it works:** &lt;br &gt;&lt;br &gt; - The customer validates the quote with a quote number from Validate Quote endpoint. &lt;br &gt; - The customer copies all the mandatory fields required by the vendor and adds them to the QTO request body. &lt;br &gt; - The customer provides all the values for Vendor mandatory fields along with other required information for QTO to create an order. &lt;br &gt; - After the order creation request receipt acknowledgment from the QTO endpoint, all further order creation updates will be provided via webhook push notification.
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction accross all the systems. (required)
     * @param quoteToOrderDetailsDTO  (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. (optional)
     * @return QuoteToOrderResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public QuoteToOrderResponse postQuoteToOrderV6(String imCustomerNumber, String imCountryCode, String imCorrelationID, QuoteToOrderDetailsDTO quoteToOrderDetailsDTO, String imSenderID) throws ApiException {
        ApiResponse<QuoteToOrderResponse> localVarResp = postQuoteToOrderV6WithHttpInfo(imCustomerNumber, imCountryCode, imCorrelationID, quoteToOrderDetailsDTO, imSenderID);
        return localVarResp.getData();
    }

    /**
     * Quote To Order
     * The “Quote to Order” (QTO) endpoint allows a customer to create an order using the existing quote which is in “Ready to Order” status. A customer can create an order using Configure to order (CTO) quote or a non-configure to order (Non-CTO) quote. Upon successful submission of the order create request, a confirmation message will be returned as an API response. &lt;br &gt; &lt;br &gt;Ingram Micro offers webhooks as a method to send notifications to Resellers once the order creation request is received. All the updates related to Order creation will be pushed as a notification to the customer via a pre-defined callback URL as an HTTP post. &lt;br &gt; &lt;br &gt; **Prerequisite:** Pre-defined callback URL &lt;br &gt; &lt;br &gt; Before creating an order using the quote, it’s recommended to validate the quote using the “Validate Quote” endpoint. Validate Quote endpoint will not only validate the quote but also outline all the mandatory fields required by the vendor at a header level and at the line level which a customer need to pass to the Quote To Order endpoint request.  For a detailed understanding of the “Validate Quote” endpoint, review the “Validate Quote” endpoint documentation. &lt;br &gt;&lt;br &gt; **How it works:** &lt;br &gt;&lt;br &gt; - The customer validates the quote with a quote number from Validate Quote endpoint. &lt;br &gt; - The customer copies all the mandatory fields required by the vendor and adds them to the QTO request body. &lt;br &gt; - The customer provides all the values for Vendor mandatory fields along with other required information for QTO to create an order. &lt;br &gt; - After the order creation request receipt acknowledgment from the QTO endpoint, all further order creation updates will be provided via webhook push notification.
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction accross all the systems. (required)
     * @param quoteToOrderDetailsDTO  (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. (optional)
     * @return ApiResponse&lt;QuoteToOrderResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QuoteToOrderResponse> postQuoteToOrderV6WithHttpInfo(String imCustomerNumber, String imCountryCode, String imCorrelationID, QuoteToOrderDetailsDTO quoteToOrderDetailsDTO, String imSenderID) throws ApiException {
        okhttp3.Call localVarCall = postQuoteToOrderV6ValidateBeforeCall(imCustomerNumber, imCountryCode, imCorrelationID, quoteToOrderDetailsDTO, imSenderID, null);
        Type localVarReturnType = new TypeToken<QuoteToOrderResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Quote To Order (asynchronously)
     * The “Quote to Order” (QTO) endpoint allows a customer to create an order using the existing quote which is in “Ready to Order” status. A customer can create an order using Configure to order (CTO) quote or a non-configure to order (Non-CTO) quote. Upon successful submission of the order create request, a confirmation message will be returned as an API response. &lt;br &gt; &lt;br &gt;Ingram Micro offers webhooks as a method to send notifications to Resellers once the order creation request is received. All the updates related to Order creation will be pushed as a notification to the customer via a pre-defined callback URL as an HTTP post. &lt;br &gt; &lt;br &gt; **Prerequisite:** Pre-defined callback URL &lt;br &gt; &lt;br &gt; Before creating an order using the quote, it’s recommended to validate the quote using the “Validate Quote” endpoint. Validate Quote endpoint will not only validate the quote but also outline all the mandatory fields required by the vendor at a header level and at the line level which a customer need to pass to the Quote To Order endpoint request.  For a detailed understanding of the “Validate Quote” endpoint, review the “Validate Quote” endpoint documentation. &lt;br &gt;&lt;br &gt; **How it works:** &lt;br &gt;&lt;br &gt; - The customer validates the quote with a quote number from Validate Quote endpoint. &lt;br &gt; - The customer copies all the mandatory fields required by the vendor and adds them to the QTO request body. &lt;br &gt; - The customer provides all the values for Vendor mandatory fields along with other required information for QTO to create an order. &lt;br &gt; - After the order creation request receipt acknowledgment from the QTO endpoint, all further order creation updates will be provided via webhook push notification.
     * @param imCustomerNumber Your unique Ingram Micro customer number. (required)
     * @param imCountryCode Two-character ISO country code. (required)
     * @param imCorrelationID Unique transaction number to identify each transaction accross all the systems. (required)
     * @param quoteToOrderDetailsDTO  (required)
     * @param imSenderID Unique value used to identify the sender of the transaction. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postQuoteToOrderV6Async(String imCustomerNumber, String imCountryCode, String imCorrelationID, QuoteToOrderDetailsDTO quoteToOrderDetailsDTO, String imSenderID, final ApiCallback<QuoteToOrderResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = postQuoteToOrderV6ValidateBeforeCall(imCustomerNumber, imCountryCode, imCorrelationID, quoteToOrderDetailsDTO, imSenderID, _callback);
        Type localVarReturnType = new TypeToken<QuoteToOrderResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
