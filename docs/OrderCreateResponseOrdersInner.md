

# OrderCreateResponseOrdersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numberOfLinesWithSuccess** | **Integer** | The number of lines in the order that were successful. |  [optional] |
|**numberOfLinesWithError** | **Integer** | The number of lines in the order that have errors. |  [optional] |
|**numberOfLinesWithWarning** | **Integer** | The number of lines in the order that have a warning. |  [optional] |
|**ingramOrderNumber** | **String** | The Ingram Micro order number. |  [optional] |
|**ingramOrderDate** | **String** | The date in UTC format that the order was created in Ingram Micro&#39;s system. |  [optional] |
|**notes** | **String** | Order-level notes. |  [optional] |
|**orderType** | **String** | The order typer. One of: S&#x3D;Stocked PO D&#x3D;Direct Ship PO |  [optional] |
|**orderTotal** | **BigDecimal** | The total price for the order. |  [optional] |
|**freightCharges** | **BigDecimal** | The total freight charges for the order. |  [optional] |
|**totalTax** | **BigDecimal** | The total tax for the order. |  [optional] |
|**currencyCode** | **String** | The country-specific three character ISO 4217 currency code used for the order. |  [optional] |
|**lines** | [**List&lt;OrderCreateResponseOrdersInnerLinesInner&gt;**](OrderCreateResponseOrdersInnerLinesInner.md) | The line-level details for the order. |  [optional] |
|**miscellaneousCharges** | [**List&lt;OrderCreateResponseOrdersInnerMiscellaneousChargesInner&gt;**](OrderCreateResponseOrdersInnerMiscellaneousChargesInner.md) |  |  [optional] |
|**links** | [**List&lt;OrderCreateResponseOrdersInnerLinksInner&gt;**](OrderCreateResponseOrdersInnerLinksInner.md) | Link to Order Details for the order(s). |  [optional] |
|**rejectedLineItems** | [**List&lt;OrderCreateResponseOrdersInnerRejectedLineItemsInner&gt;**](OrderCreateResponseOrdersInnerRejectedLineItemsInner.md) | A list of rejected line items. |  [optional] |
|**additionalAttributes** | [**List&lt;OrderCreateResponseOrdersInnerAdditionalAttributesInner&gt;**](OrderCreateResponseOrdersInnerAdditionalAttributesInner.md) |  |  [optional] |



