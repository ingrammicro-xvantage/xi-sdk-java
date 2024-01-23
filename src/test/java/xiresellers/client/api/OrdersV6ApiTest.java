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

import xiresellers.client.ApiException;
import xiresellers.client.model.ErrorResponse;
import java.time.LocalDate;
import xiresellers.client.model.OrderDetailResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrdersV6Api
 */
@Disabled
public class OrdersV6ApiTest {

    private final OrdersV6Api api = new OrdersV6Api();

    /**
     * Get Order Details v6
     *
     * Use your Ingram Micro sales order number to search for existing orders or retrieve existing order details.  The sales order number, IM-CustomerNumber, IM-CountryCode, IM-SenderID and IM-CorrelationID are required parameters.  In a case when the IM sales order number is repeated, you can refine the result by providing for additional filtering.  Use the \&quot;simulateStatus\&quot; query parameter to test the GET order response for various order statuses. This parameter is only available in the sandbox to help with development and testing of the GET order endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderdetailsV6Test() throws ApiException {
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
        OrderDetailResponse response = api.getOrderdetailsV6(ordernumber, imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, ingramOrderDate, vendorNumber, simulateStatus, isIml, regionCode);
        // TODO: test validations
    }

}
