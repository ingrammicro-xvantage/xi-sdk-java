/*
 * Reseller API Documentation
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.FreightRequest;
import org.openapitools.client.model.FreightResponse;
import org.openapitools.client.model.GetResellerV6ValidateQuote500Response;
import org.openapitools.client.model.PostRenewalssearch400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FreightEstimateApi
 */
@Disabled
public class FreightEstimateApiTest {

    private final FreightEstimateApi api = new FreightEstimateApi();

    /**
     * Freight Estimate
     *
     * The freight estimator endpoint will allow customers to understand the freight cost for an order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postFreightestimateTest() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imCustomerContact = null;
        String imSenderID = null;
        FreightRequest freightRequest = null;
        FreightResponse response = api.postFreightestimate(imCustomerNumber, imCountryCode, imCorrelationID, imCustomerContact, imSenderID, freightRequest);
        // TODO: test validations
    }

}
