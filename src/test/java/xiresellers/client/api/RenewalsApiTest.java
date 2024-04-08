/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of APIs and webhooks to craft a seamless journey for your customers.
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
import xiresellers.client.model.GetResellerV6ValidateQuote500Response;
import xiresellers.client.model.PostRenewalssearch400Response;
import xiresellers.client.model.RenewalsDetailsResponse;
import xiresellers.client.model.RenewalsSearchRequest;
import xiresellers.client.model.RenewalsSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RenewalsApi
 */
@Disabled
public class RenewalsApiTest {

    private final RenewalsApi api = new RenewalsApi();

    /**
     * Renewals Details
     *
     * The Renewal Details API endpoint will retrieve all the details related to the renewal. The customer is required to pass renewalId as a path parameter while sending a request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResellersV6RenewalsdetailsTest() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String renewalId = null;
        String imSenderID = null;
        RenewalsDetailsResponse response = api.getResellersV6Renewalsdetails(imCustomerNumber, imCountryCode, imCorrelationID, renewalId, imSenderID);
        // TODO: test validations
    }

    /**
     * Renewals Search
     *
     * The Renewal Search API, by default, will retrieve all the renewals that are associated with the customer’s account. The customer will be able to search for renewals via basic search or advanced search. Basic search is available thru the query string parameters, whereas the advanced search is available thru the request body schema. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postRenewalssearchTest() throws ApiException {
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imSenderID = null;
        String customerOrderNumber = null;
        String ingramPurchaseOrderNumber = null;
        String serialNumber = null;
        String page = null;
        String size = null;
        String sort = null;
        RenewalsSearchRequest renewalsSearchRequest = null;
        RenewalsSearchResponse response = api.postRenewalssearch(imCustomerNumber, imCountryCode, imCorrelationID, imSenderID, customerOrderNumber, ingramPurchaseOrderNumber, serialNumber, page, size, sort, renewalsSearchRequest);
        // TODO: test validations
    }

}
