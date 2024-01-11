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
import org.openapitools.client.model.OrderStatusAsyncNotificationRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrderStatusApi
 */
@Disabled
public class OrderStatusApiTest {

    private final OrderStatusApi api = new OrderStatusApi();

    /**
     * Order Status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resellersV1WebhooksOrderstatuseventPostTest() throws ApiException {
        String targeturl = null;
        String xHubSignature = null;
        OrderStatusAsyncNotificationRequest orderStatusAsyncNotificationRequest = null;
        api.resellersV1WebhooksOrderstatuseventPost(targeturl, xHubSignature, orderStatusAsyncNotificationRequest);
        // TODO: test validations
    }

}
