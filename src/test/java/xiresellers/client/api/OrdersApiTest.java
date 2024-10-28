/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package xiresellers.client.api;

import xiresellers.client.ApiException;
import xiresellers.client.model.ErrorResponse;
import xiresellers.client.model.ErrorResponseDTO;
import java.time.LocalDate;
import xiresellers.client.model.OrderCreateRequest;
import xiresellers.client.model.OrderCreateResponse;
import xiresellers.client.model.OrderCreateV7Request;
import xiresellers.client.model.OrderCreateV7Response;
import xiresellers.client.model.OrderCreateV7Response201;
import xiresellers.client.model.OrderDetailB2B;
import xiresellers.client.model.OrderModifyRequest;
import xiresellers.client.model.OrderModifyResponse;
import xiresellers.client.model.OrderSearchResponse;
import xiresellers.client.model.PostCreateorderV7400Response;
import xiresellers.client.model.PostCreateorderV7500Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersApi
 */
@Disabled
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    /**
     * Cancel your Order
     *
     * This call must be submitted before the order is released to Ingram Micro’s warehouse. The order cannot be canceled once it is released to the warehouse. Order should be on customer hold to delete any order from Ingram system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrdercancelTest() throws ApiException {
        String orderNumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String regionCode = null;
        String imSenderID = null;
        api.deleteOrdercancel(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, regionCode, imSenderID);
        // TODO: test validations
    }

    /**
     * Get Order Details v6.1
     *
     * The Orders details API endpoint allows a customer to retrieve their Ingram Micro orders details by using the Ingram Micro sales order number as a path parameter. The sales order number, IM-CustomerNumber, IM-CountryCode, and IM-CorrelationID are required parameters.&lt;br&gt;&lt;br&gt;*Service contracts, subscriptions, and license information are unavailable at the moment, this information will be available in the future. &lt;br&gt;&lt;br&gt; Recent bug fixes:   - Fixed duplication of serial numbers in the API response.   - Fixed API time-out issues   - Fixed missing tracking information.   - Implemented enhanced order status.  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderdetailsV61Test() throws ApiException {
        String ordernumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imSenderID = null;
        LocalDate ingramOrderDate = null;
        String vendorNumber = null;
        String simulateStatus = null;
        Boolean isIml = null;
        String regionCode = null;
        OrderDetailB2B response = api.getOrderdetailsV61(ordernumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, ingramOrderDate, vendorNumber, simulateStatus, isIml, regionCode);
        // TODO: test validations
    }

    /**
     * Search your Orders
     *
     * The Orders Search API endpoint allows a customer to search their Ingram Micro orders by using any of the available query string parameters, customer can search their order by using single query string parameters or combining them together. This endpoint supports the pagination of results.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellersV6OrdersearchTest() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String ingramOrderNumber = null;
        String orderStatus = null;
        List<String> orderStatusIn = null;
        String ingramOrderDate = null;
        List<String> ingramOrderDateBt = null;
        String imSenderID = null;
        String customerOrderNumber = null;
        Integer pageSize = null;
        Integer pageNumber = null;
        String endCustomerOrderNumber = null;
        List<String> invoiceDateBt = null;
        List<String> shipDateBt = null;
        List<String> deliveryDateBt = null;
        String ingramPartNumber = null;
        String vendorPartNumber = null;
        String serialNumber = null;
        String trackingNumber = null;
        String vendorName = null;
        String specialBidNumber = null;
        OrderSearchResponse response = api.getResellersV6Ordersearch(imCustomerNumber, imCountryCode, imCorrelationID, ingramOrderNumber, orderStatus, orderStatusIn, ingramOrderDate, ingramOrderDateBt, imSenderID, customerOrderNumber, pageSize, pageNumber, endCustomerOrderNumber, invoiceDateBt, shipDateBt, deliveryDateBt, ingramPartNumber, vendorPartNumber, serialNumber, trackingNumber, vendorName, specialBidNumber);
        // TODO: test validations
    }

    /**
     * Create your Order
     *
     * Instantly create and place orders. The POST API supports stocked SKUs as well as licensing and warranties SKUs. IM-CustomerNumber, IM-CountryCode, IM-SenderID and IM-CorrelationID are required parameters. Ingram Micro recommends that you provide the ingrampartnumber for each SKU contained in each order. NOTE: You must have net terms to use the Ingram Micro Order Create API. Ingram Micro offers trade credit when using our APIs, and repayment is based on net terms. For example, if your net terms agreement is net-30, you will have 30 days to make a full payment. Ingram Micro does not allow credit card transactions for API ordering. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCreateorderV6Test() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        OrderCreateRequest orderCreateRequest = null;
        String imSenderID = null;
        OrderCreateResponse response = api.postCreateorderV6(imCustomerNumber, imCountryCode, imCorrelationID, orderCreateRequest, imSenderID);
        // TODO: test validations
    }

    /**
     * Create your Order v7
     *
     * The Order Create v7 allows our customers to create orders asynchronously. The customer can create either standard orders using stocked SKUs and/or create a “Quote to Order” using the existing quote which is in “Ready to Order” status, or the customer can create an order using the “Configure to order” (CTO) quote. Upon successful submission of the order create request, a confirmation message will be returned as an API response. &lt;br &gt; &lt;br &gt; Once the order is processed, Ingram Micro will notify customers via webhook using a pre-defined callback URL as an HTTP post regarding the updates related to the order. Upon successful order creation, a notification will be sent via webhook regarding the order details, in the event of any error occurring during the order creation process, an error message will be delivered via webhook. Nightly system unavailability will delay response Async response. &lt;br &gt; &lt;br &gt; The key differentiator between standard ordering and “Quote To Order” is the optional input field in the request body which is “quoteNumber”. If a customer passes the quote number in the request body, the order will be processed as a “Quote To Order” using the details from the quote. Any SKUs, quantity, or price information that are passed in the lines object within the request will be ignored in the case of “Quote To Order”.&lt;br &gt; &lt;br &gt; **Prerequisite:** Pre-defined callback URL &lt;br &gt; &lt;br &gt; **Standard ordering::**&lt;br&gt;&lt;br&gt;Ingram Micro recommends that you provide the ingramPartNumber for each SKU contained in each order. NOTE: You must have net terms to use the Ingram Micro Order Create API. Ingram Micro offers trade credit when using our APIs, and repayment is based on net terms. For example, if your net terms agreement is net 30, you will have 30 days to make a full payment. Ingram Micro does not allow credit card transactions for API ordering. &lt;br&gt;&lt;br&gt;[**Key differences between v6 and v7 Migration**](https://developer.ingrammicro.com/reseller/page/v6-and-v7-migration) &lt;br&gt;&lt;br&gt; &lt;br&gt;&lt;br&gt;**Quote to Order / Configure to Order:**&lt;br&gt;&lt;br&gt;If customers are planning to use Quote to Order or Configure to Order Quotes, it’s recommended to validate the quote using the “Validate Quote” endpoint before creating an order using the quote. Validate Quote endpoint will not only validate the quote but also outline all the mandatory fields required by the vendor at a header level and at the line level which a customer needs to pass to the Quote to Order endpoint request. For a detailed understanding of the “Validate Quote” endpoint, review the “Validate Quote” endpoint documentation. &lt;br&gt;&lt;br&gt; **How it works:**&lt;br&gt;&lt;br&gt;- The customer validates the quote with a quote number from the Validate Quote endpoint.&lt;br&gt;- The customer copies all the mandatory fields required by the vendor and adds them to the QTO request body.&lt;br&gt;- The customer provides all the values for Vendor mandatory fields along with other required information for QTO to create an order.&lt;br&gt;- After the order creation request receipt acknowledgment from the QTO endpoint, all further order creation updates will be provided via webhook push notification.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCreateorderV7Test() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        OrderCreateV7Request orderCreateV7Request = null;
        String imSenderID = null;
        OrderCreateV7Response201 response = api.postCreateorderV7(imCustomerNumber, imCountryCode, imCorrelationID, orderCreateV7Request, imSenderID);
        // TODO: test validations
    }

    /**
     * Modify your Order
     *
     * The Order Modify API endpoint allows for changes to be made to an order after the order creation process as long as the order was created with the customer hold flag.  * Orders can be modified within 24hrs of being placed with the customer hold flag, after 24hrs they are voided if they are not released by the customer.  * Modifying orders that were placed without the customer hold flag is not possible 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putOrdermodifyTest() throws ApiException {
        String orderNumber = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        OrderModifyRequest orderModifyRequest = null;
        String actionCode = null;
        String regionCode = null;
        String imSenderID = null;
        OrderModifyResponse response = api.putOrdermodify(orderNumber, imCustomerNumber, imCountryCode, imCorrelationID, orderModifyRequest, actionCode, regionCode, imSenderID);
        // TODO: test validations
    }

}
