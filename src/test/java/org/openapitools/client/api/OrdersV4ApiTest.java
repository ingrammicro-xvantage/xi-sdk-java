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
import org.openapitools.client.model.OrderCreateRequest;
import org.openapitools.client.model.OrderCreateResponse;
import org.openapitools.client.model.OrderDeleteRequest;
import org.openapitools.client.model.OrderDeleteResponse;
import org.openapitools.client.model.OrderDetailRequest;
import org.openapitools.client.model.OrderDetailResponse;
import org.openapitools.client.model.OrderModifyRequest;
import org.openapitools.client.model.OrderModifyResponse;
import org.openapitools.client.model.OrderSearchRequest;
import org.openapitools.client.model.OrderSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersV4Api
 */
@Disabled
public class OrdersV4ApiTest {

    private final OrdersV4Api api = new OrdersV4Api();

    /**
     * Create a new Order
     *
     * The order create transaction is a real-time transaction that allows customers to place standard product and direct ship (licensing and warranties) orders with Ingram Micro using API.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postV4OrdercreateTest() throws ApiException {
        OrderCreateRequest orderCreateRequest = null;
        OrderCreateResponse response = api.postV4Ordercreate(orderCreateRequest);
        // TODO: test validations
    }

    /**
     * Delete an Order
     *
     * A real-time request to delete a previously accepted order must be submitted before the order is released to Ingram Micro’s warehouse. After release the order is no longer eligible for deletion. Order delete transaction submitted after the order is released will be rejected and will not be applied. *Direct ship orders cannot be deleted. Contact your sales rep for assistance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postV4OrderdeleteTest() throws ApiException {
        OrderDeleteRequest orderDeleteRequest = null;
        OrderDeleteResponse response = api.postV4Orderdelete(orderDeleteRequest);
        // TODO: test validations
    }

    /**
     * Get Order Details
     *
     * A real-time request that allows the customer to query Ingram Micro for detailed information for a specific open or shipped order. Orders are searched using Ingram Micro Sales Order Number.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postV4OrderdetailsTest() throws ApiException {
        OrderDetailRequest orderDetailRequest = null;
        OrderDetailResponse response = api.postV4Orderdetails(orderDetailRequest);
        // TODO: test validations
    }

    /**
     * Modify an Existing Order
     *
     * The order modify transaction allows for changes to be made after the order creation process but before the order is released to Ingram Micro’s warehouse system.  Order modify transaction submitted after the order is released will be rejected and will not be applied.  Types of modifications allowable: Order release, add comment, and carrier change. NOTE - Direct Ship orders cannot be modified. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postV4OrdermodifyTest() throws ApiException {
        OrderModifyRequest orderModifyRequest = null;
        OrderModifyResponse response = api.postV4Ordermodify(orderModifyRequest);
        // TODO: test validations
    }

    /**
     * Order Search
     *
     * Search your orders using various search parameters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postV4OrdersearchTest() throws ApiException {
        OrderSearchRequest orderSearchRequest = null;
        OrderSearchResponse response = api.postV4Ordersearch(orderSearchRequest);
        // TODO: test validations
    }

}
