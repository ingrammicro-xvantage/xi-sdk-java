

# OrderCreateResponseServiceresponseOrdercreateresponseInnerLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**linetype** | **String** | “P”-Line or SKU Number “C”-Comment Line |  [optional] |
|**globallinenumber** | **String** | Ingram generated line number |  [optional] |
|**partnumber** | **String** | Ingram Micro Sku Number |  [optional] |
|**globalskuid** | **String** |  |  [optional] |
|**linenumber** | **String** |  |  [optional] |
|**carriercode** | **String** | Transportation 2 digit codes |  [optional] |
|**carrierdescription** | **String** | Transportation Carrier Name |  [optional] |
|**requestedunitprice** | **BigDecimal** | Price requested by reseller. Price Variance can be set up by Ingram Micro Sales Rep |  [optional] |
|**requestedquantity** | **Integer** | Quanity Requested |  [optional] |
|**confirmedquantity** | **Integer** | Quanity Shipped |  [optional] |
|**backorderedquantity** | **Integer** | Quanity of units that didn’t ship |  [optional] |
|**unitproductprice** | **BigDecimal** | Price Per Unit |  [optional] |
|**netamount** | **BigDecimal** | Total amount. Quantity X Unit Price |  [optional] |
|**warehouseid** | **String** |  |  [optional] |
|**ordersuffix** | **String** | Use order suffix with the globalorderid for this line item. |  [optional] |



