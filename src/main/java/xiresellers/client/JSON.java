/*
 * XI Sdk Resellers
 * For Resellers. Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package xiresellers.client;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.TimeZone;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    private static final StdDateFormat sdf = new StdDateFormat()
        .withTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()))
        .withColonInTimeZone(true);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.AvailabilityAsyncNotificationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.AvailabilityAsyncNotificationRequestResourceInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.AvailabilityAsyncNotificationRequestResourceInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.DealsDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.DealsDetailsResponseProductsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.DealsSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.DealsSearchResponseDealsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.Error.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ErrorResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ErrorResponseDTO.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ErrorResponseErrorsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ErrorResponseErrorsInnerFieldsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.Fields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightRequestLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightRequestShipToAddressInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightResponseFreightEstimateResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightResponseFreightEstimateResponseDistributionInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightResponseFreightEstimateResponseDistributionInnerCarrierListInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.FreightResponseFreightEstimateResponseLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.GetResellerV6ValidateQuote400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.GetResellerV6ValidateQuote400ResponseFieldsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.GetResellerV6ValidateQuote500Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseBillToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseFxRateInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponsePaymentTermsInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseShipToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseSummaryForeignFxTotals.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseSummaryLines.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseSummaryMiscChargesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceDetailsv61ResponseSummaryTotals.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.InvoiceSearchResponseInvoicesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestEndUserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestLinesInnerAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestLinesInnerEndUserInfoInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestLinesInnerWarrantyInfoInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestLinesInnerWarrantyInfoInnerSerialInfoInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestResellerInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestShipToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestShipmentDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateRequestVmf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseEndUserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInnerAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInnerLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInnerMiscellaneousChargesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseOrdersInnerRejectedLineItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderCreateResponseShipToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2B.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BBillToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BEndUserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerDelivery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerDeliveryDeliveryDateRange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerShip.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerEstimatedDatesInnerShipShipDateRange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerMultipleShipmentsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerScheduleLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerServiceContractInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerServiceContractInfoContractInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerServiceContractInfoLicenseInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerServiceContractInfoSubscriptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerShipmentDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BLinesInnerShipmentDetailsInnerCarrierDetailsInnerTrackingDetailsInnerSerialNumbersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BMiscellaneousChargesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderDetailB2BShipToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyRequestAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyRequestLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyRequestShipToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyResponseLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyResponseLinesInnerAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyResponseLinesInnerShipmentDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyResponseRejectedLineItemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderModifyResponseShipToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderSearchResponseOrdersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderSearchResponseOrdersInnerLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderSearchResponseOrdersInnerSubOrdersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderSearchResponseOrdersInnerSubOrdersInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderStatusAsyncNotificationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinesInnerSerialNumberDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinesInnerShipmentDetailsInnerPackageDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.OrderStatusAsyncNotificationRequestResourceInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PostQuoteToOrderV6400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PostQuoteToOrderV6400ResponseFieldsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PostRenewalssearch400Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityRequestAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityRequestAvailabilityByWarehouseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityRequestProductsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityRequestProductsInnerAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerAvailability.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerAvailabilityAvailabilityByWarehouseInnerBackOrderInfoInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerDiscountsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerDiscountsInnerQuantityDiscountsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerDiscountsInnerSpecialPricingInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerPricing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerReserveInventoryDetailsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.PriceAndAvailabilityResponseInnerServiceFeesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductDetailResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductDetailResponseAdditionalInformation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductDetailResponseAdditionalInformationProductWeightInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductDetailResponseCiscoFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductDetailResponseIndicators.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductDetailResponseTechnicalSpecificationsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductSearchResponseCatalogInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ProductSearchResponseCatalogInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteDetailsResponseAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteDetailsResponseEndUserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteDetailsResponseProductsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteDetailsResponseProductsInnerPrice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteDetailsResponseResellerInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteSearchResponseQuotesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteSearchResponseQuotesInnerLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderDetailsDTO.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderDetailsDTOAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderDetailsDTOEndUserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderDetailsDTOLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderDetailsDTOLinesInnerVmfAdditionalAttributesLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderDetailsDTOShipToInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderDetailsDTOVmfadditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.QuoteToOrderResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsDetailsResponseAdditionalAttributesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsDetailsResponseEndUserInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsDetailsResponseProductsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsDetailsResponseReferenceNumber.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequestDateType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequestDateTypeEndDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequestDateTypeExpirationDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequestDateTypeInvoiceDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequestDateTypeStartDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequestStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchRequestStatusOpporutinyStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchResponseRenewalsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.RenewalsSearchResponseRenewalsInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsCreateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsCreateRequestListInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsCreateRequestListInnerShipFromInfoInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsCreateResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsCreateResponseReturnsClaimsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsDetailsResponseProductsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsSearchResponseReturnsClaimsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ReturnsSearchResponseReturnsClaimsInnerLinksInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ValidateQuoteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ValidateQuoteResponseLinesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new xiresellers.client.model.ValidateQuoteResponseVmfAdditionalAttributesInner.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(sdf.parse(date).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, DateTimeFormatter will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toInstant().atOffset(ZoneOffset.UTC).format(dtf);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return sdf.parse(date);
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
