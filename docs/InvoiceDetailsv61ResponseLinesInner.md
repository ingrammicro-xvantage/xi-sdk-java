

# InvoiceDetailsv61ResponseLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ingramLineNumber** | **String** | Unique line number from Ingram. |  [optional] |
|**customerLineNumber** | **String** | Line number passes by customer while creating an order. |  [optional] |
|**ingramPartNumber** | **String** | Ingram Micro SKU (stock keeping unit). An identification, usually alphanumeric, of a particular product that allows it to be tracked for inventory purposes. |  [optional] |
|**vendorPartNumber** | **String** | Vendor Part Number. |  [optional] |
|**customerPartNumber** | **String** | Part number from customer&#39;s system. |  [optional] |
|**vendorName** | **String** | Name of the vendor. |  [optional] |
|**productDescription** | **String** | Description of the product. |  [optional] |
|**unitWeight** | **String** | Weight of the product. |  [optional] |
|**quantity** | **Integer** | Quantity of the product. |  [optional] |
|**unitPrice** | **Double** | Unit price of the product. |  [optional] |
|**unitOfMeasure** | **String** | Unit of measure of the product. |  [optional] |
|**currencyCode** | **String** | Currency code. |  [optional] |
|**extendedPrice** | **Double** | Extended price of the product. |  [optional] |
|**taxPercentage** | **Double** | Tax percentage |  [optional] |
|**taxRate** | **Double** | Tax rate |  [optional] |
|**taxAmount** | **Double** | Line level tax amount. |  [optional] |
|**serialNumbers** | [**List&lt;InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner&gt;**](InvoiceDetailsv61ResponseLinesInnerSerialNumbersInner.md) |  |  [optional] |
|**quantityOrdered** | **Integer** | Quantity ordered by the customer. |  [optional] |
|**quantityShipped** | **Integer** | Quantity shipped to the customer. |  [optional] |



