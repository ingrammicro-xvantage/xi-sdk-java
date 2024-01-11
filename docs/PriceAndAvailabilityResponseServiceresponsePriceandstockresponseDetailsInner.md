

# PriceAndAvailabilityResponseServiceresponsePriceandstockresponseDetailsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemstatus** | [**ItemstatusEnum**](#ItemstatusEnum) | SUCCESS or FAILED |  [optional] |
|**statusmessage** | **String** | Description of itemstatus |  [optional] |
|**ingrampartnumber** | **String** | Ingram Micro part number |  [optional] |
|**vendorpartnumber** | **String** | Manufacturer/Vendor part number |  [optional] |
|**globalskuid** | **String** |  |  [optional] |
|**customerprice** | **BigDecimal** | Customer specific price for the product, excluding taxes |  [optional] |
|**partdescription1** | **String** | Product description part 1 |  [optional] |
|**partdescription2** | **String** | Product description part 2 |  [optional] |
|**vendornumber** | **String** |  |  [optional] |
|**vendorname** | **String** | Name of the vendor |  [optional] |
|**cpucode** | **String** |  |  [optional] |
|**propertyClass** | [**PropertyClassEnum**](#PropertyClassEnum) | Ingram Micro assigned product classification -  A-Stocked product in all IM warehouses, B-Limited stock in IM warehouses, C-Stocked in fewer wareshouses, D-Ingram discontinued, E-Planned to be phased out as per the vendor, F-Carried for specific customer as per the contract, N-New SKU, O-Discontinued to be liquidated, S-Order for specialized demand, V-Discontinued by vendor, X-Direct Ship products from vendor |  [optional] |
|**skustatus** | [**SkustatusEnum**](#SkustatusEnum) | Identifies if the SKU has been discontinued. |  [optional] |
|**mediacpu** | **String** |  |  [optional] |
|**categorysubcategory** | **String** |  |  [optional] |
|**retailprice** | **BigDecimal** |  |  [optional] |
|**newmedia** | **String** |  |  [optional] |
|**enduserrequired** | [**EnduserrequiredEnum**](#EnduserrequiredEnum) | Y - End user required N - Not required End user |  [optional] |
|**backorderflag** | [**BackorderflagEnum**](#BackorderflagEnum) | Y- Allow Backorder Flag N- Not allowed |  [optional] |
|**skuauthorized** | **String** |  |  [optional] |
|**extendedvendorpartnumber** | **String** |  |  [optional] |
|**warehousedetails** | [**List&lt;WarehouseListType&gt;**](WarehouseListType.md) |  |  [optional] |



## Enum: ItemstatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;SUCCESS&quot; |
| FAILED | &quot;FAILED&quot; |



## Enum: PropertyClassEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| B | &quot;B&quot; |
| C | &quot;C&quot; |
| D | &quot;D&quot; |
| E | &quot;E&quot; |
| F | &quot;F&quot; |
| N | &quot;N&quot; |
| O | &quot;O&quot; |
| S | &quot;S&quot; |
| V | &quot;V&quot; |
| X | &quot;X&quot; |



## Enum: SkustatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |



## Enum: EnduserrequiredEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



## Enum: BackorderflagEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |



