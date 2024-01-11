

# OrderCreateResponseOrdersInnerLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subOrderNumber** | **String** | The sub order number. The two-digit prefix is the warehouse code of the warehouse nearest the reseller. The middle number is the order number. The two-digit suffix is the sub order number. |  [optional] |
|**ingramLineNumber** | **String** | The Ingram Micro line number for the product. |  [optional] |
|**customerLineNumber** | **String** | The reseller&#39;s line number for reference in their system. |  [optional] |
|**lineStatus** | **String** | The status for the line item in the order. One of: Backordered, Open |  [optional] |
|**ingramPartNumber** | **String** | The Ingram Micro part number for the line item. |  [optional] |
|**vendorPartNumber** | **String** | The vendor part number for the line item. |  [optional] |
|**unitPrice** | **BigDecimal** | The unit price for the line item. |  [optional] |
|**extendedUnitPrice** | **BigDecimal** | The extended list price (unit price X quantity) for the line item. |  [optional] |
|**quantityOrdered** | **Integer** | The quantity of the line item ordered. |  [optional] |
|**quantityConfirmed** | **Integer** | The quantity of the line item that has been confirmed. |  [optional] |
|**quantityBackOrdered** | **Integer** | The quantity of the line item that is backordered. |  [optional] |
|**specialBidNumber** | **String** | The bid number for the line item provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers. |  [optional] |
|**notes** | **String** | Line-level notes. |  [optional] |
|**shipmentDetails** | [**List&lt;OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner&gt;**](OrderCreateResponseOrdersInnerLinesInnerShipmentDetailsInner.md) | The shipment details for the line item. |  [optional] |
|**additionalAttributes** | [**List&lt;OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner&gt;**](OrderCreateResponseOrdersInnerLinesInnerAdditionalAttributesInner.md) | SAP requested and country-specific line level details. |  [optional] |



