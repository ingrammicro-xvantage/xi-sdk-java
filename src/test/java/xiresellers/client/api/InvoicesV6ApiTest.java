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
import xiresellers.client.model.InvoiceDetailResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoicesV6Api
 */
@Disabled
public class InvoicesV6ApiTest {

    private final InvoicesV6Api api = new InvoicesV6Api();

    /**
     * Get Invoice Details v6
     *
     * Use your Ingram Micro invoice number to search for existing invoices or retrieve existing invoice details.  The invoice number, IM-CustomerNumber, IM-CountryCode, IM-ApplicationId and IM-CorrelationID are required parameters.  .
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoicedetailsV6Test() throws ApiException {
        String invoicenumber = null;
        String version = null;
        String imCustomerNumber = null;
        String imCountryCode = null;
        String imCorrelationID = null;
        String imApplicationID = null;
        String customerType = null;
        Boolean includeSerialNumbers = null;
        InvoiceDetailResponse response = api.getInvoicedetailsV6(invoicenumber, version, imCustomerNumber, imCountryCode, imCorrelationID, imApplicationID, customerType, includeSerialNumbers);
        // TODO: test validations
    }

}
