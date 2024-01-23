

# OrderDetailResponseLinesInnerShipmentDetailsInner

Shipping details for the line item.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**quantity** | **Integer** | The quantity shipped of the line item. |  [optional] |
|**estimatedShipDate** | **LocalDate** | The estimated ship date for the line item. |  [optional] |
|**shippedDate** | **LocalDate** | The date the line item was shipped. |  [optional] |
|**estimatedDeliveryDate** | **LocalDate** | The date the line item is expected to be delivered. |  [optional] |
|**deliveredDate** | **LocalDate** | The actual date of delivery of the line item. |  [optional] |
|**shipFromWarehouseId** | **String** | The ID of the warehouse the product will ship from. |  [optional] |
|**shipFromLocation** | **String** | The city and state the line item ships from. |  [optional] |
|**invoiceNumber** | **String** | The Ingram Micro invoice number for the line item. |  [optional] |
|**invoiceDate** | **LocalDate** | The date the IngramMicro invoice was created for the line item. |  [optional] |
|**carrierDetails** | [**OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails**](OrderDetailResponseLinesInnerShipmentDetailsInnerCarrierDetails.md) |  |  [optional] |



