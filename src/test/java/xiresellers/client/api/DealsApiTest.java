/*
 * XI Sdk Resellers
 * For Resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
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
import xiresellers.client.model.DealsDetailsResponse;
import xiresellers.client.model.DealsSearchResponse;
import xiresellers.client.model.PostCreateorderV7500Response;
import xiresellers.client.model.PostRenewalssearch400Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DealsApi
 */
@Disabled
public class DealsApiTest {

    private final DealsApi api = new DealsApi();

    /**
     * Deals Details
     *
     * The Deals Details API will retrieve all the details related to the specific deal id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellersV6DealsdetailsTest() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imApplicationId = null;
        String dealId = null;
        DealsDetailsResponse response = api.getResellersV6Dealsdetails(imCustomerNumber, imCountryCode, imCorrelationID, imApplicationId, dealId);
        // TODO: test validations
    }

    /**
     * Deals Search
     *
     * The Deals Search API, by default, will retrieve all the deals that are associated with the customer’s account. The customer will be able to search deals using the End-user name, Vendor name, or DealID. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellersV6DealssearchTest() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imSenderID = null;
        String endUser = null;
        String vendor = null;
        String dealId = null;
        Integer size = null;
        Integer page = null;
        DealsSearchResponse response = api.getResellersV6Dealssearch(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, endUser, vendor, dealId, size, page);
        // TODO: test validations
    }

}
