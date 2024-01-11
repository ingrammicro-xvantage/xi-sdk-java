

# OrderCreateResponseServiceresponseOrdercreateresponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numberoflineswithsuccess** | **String** | Number of line items that were successful |  [optional] |
|**numberoflineswitherror** | **String** | Number of line items with error |  [optional] |
|**numberoflineswithwarning** | **String** | Number of line items with warnings |  [optional] |
|**globalorderid** | **String** | Ingram sales order number |  [optional] |
|**ordertype** | [**OrdertypeEnum**](#OrdertypeEnum) | S&#x3D;Stocked PO D&#x3D;Direct Ship PO |  [optional] |
|**ordertimestamp** | **String** | Time order received |  [optional] |
|**invoicingsystemorderid** | **String** | Ingram Micro generated order number |  [optional] |
|**taxamount** | **BigDecimal** |  |  [optional] |
|**freightamount** | **BigDecimal** | Freight amount customer pays for freight |  [optional] |
|**orderamount** | **BigDecimal** | Total amount of order with freight and taxes |  [optional] |
|**lines** | [**List&lt;OrderCreateResponseServiceresponseOrdercreateresponseInnerLinesInner&gt;**](OrderCreateResponseServiceresponseOrdercreateresponseInnerLinesInner.md) | Collection of lines |  [optional] |



## Enum: OrdertypeEnum

| Name | Value |
|---- | -----|
| S | &quot;S&quot; |
| D | &quot;D&quot; |



