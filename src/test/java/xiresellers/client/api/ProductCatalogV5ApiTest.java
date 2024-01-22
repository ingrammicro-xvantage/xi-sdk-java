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
import xiresellers.client.model.PriceAndAvailabilityRequest;
import xiresellers.client.model.PriceAndAvailabilityResponse;
import xiresellers.client.model.ProductSearchResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductCatalogV5Api
 */
@Disabled
public class ProductCatalogV5ApiTest {

    private final ProductCatalogV5Api api = new ProductCatalogV5Api();

    /**
     * Search Product Catalog
     *
     * Search the Ingram Micro product catalog using customerNumber, isoCountryCode and partNumber.&lt;ul&gt;&lt;li&gt;customerNumber and isoCountryCode fields are required.&lt;/li&gt;&lt;li&gt;The PartNumber field accepts the following:&lt;ul&gt;&lt;li&gt;Ingram part number&lt;/li&gt;&lt;li&gt;Vendor part number&lt;/li&gt;&lt;li&gt;Customer part number&lt;/li&gt;&lt;li&gt;UPC (Universal Product Code)&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getV5CatalogProductsearchTest() throws ApiException {
        String customerNumber = null;
        String isoCountryCode = null;
        String partNumber = null;
        ProductSearchResponse response = api.getV5CatalogProductsearch(customerNumber, isoCountryCode, partNumber);
        // TODO: test validations
    }

    /**
     * Find availability of upto 50 SKUs
     *
     * Search the product catalog for the price and availability for up to 50 SKUs at one time. This endpoint helps to confirm the details just prior to placing a real-time call.&lt;ul&gt;&lt;li&gt;You may request visibility for reserve stock if you participate in reserved inventory, in addition to the stock that is open to all the partners. Please see the details in the endpoint model below.&lt;/li&gt;&lt;li&gt;Follow these guidelines when using this endpoint:&lt;ul&gt;&lt;li&gt;This endpoint is not for refreshing the full catalog with availability and pricing information. Ingram Micro applies rate limits on this endpoint. Continuous cyclical calls will error out. Customers that perform this activity may lose access to the endpoint.&lt;/li&gt;&lt;li&gt;For the full catalog refresh, Ingram Micro can provide a Price and Inventory file in flat file format, made available through FTP download. Please contact your Ingram Micro sales rep for details.&lt;/li&gt;&lt;/ul&gt;&lt;/li&gt;&lt;/ul&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void multiSKUPriceAndStockTest() throws ApiException {
        PriceAndAvailabilityRequest priceAndAvailabilityRequest = null;
        PriceAndAvailabilityResponse response = api.multiSKUPriceAndStock(priceAndAvailabilityRequest);
        // TODO: test validations
    }

}