

# ReturnsCreateRequestListInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceNumber** | **String** | The Invoice number of the order. |  |
|**invoiceDate** | **LocalDate** | Date of an Invoice. |  |
|**customerOrderNumber** | **String** | The reseller&#39;s order number for reference in their system. |  [optional] |
|**ingramPartNumber** | **String** | Unique line number from Ingram. |  [optional] |
|**vendorPartNumber** | **String** | Vendor Part Number. |  [optional] |
|**serialNumber** | **String** | Serial number of the product. |  [optional] |
|**quantity** | **Integer** | Return quantity of the product. |  |
|**primaryReason** | **String** | Primary reason to return the product. |  |
|**secondaryReason** | **String** | Secondary reason to return the product. |  |
|**notes** | **String** | Return notes. |  [optional] |
|**referenceNumber** | **String** | Reference number to return the product. |  [optional] |
|**billToAddressId** | **String** | Suffix used to identify billing address. |  [optional] |
|**shipFromInfo** | [**List&lt;ReturnsCreateRequestListInnerShipFromInfoInner&gt;**](ReturnsCreateRequestListInnerShipFromInfoInner.md) |  |  |
|**numberOfBoxes** | **Integer** | Number of boxes to return. |  |



