

# MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemstatus** | **String** |  |  [optional] |
|**statusmessage** | **String** |  |  [optional] |
|**ingrampartnumber** | **String** | SKU number for the product for which order needs to be created with Ingram Micro |  [optional] |
|**vendorpartnumber** | **String** | Vendor Part number for the product |  [optional] |
|**globalskuid** | **String** |  |  [optional] |
|**customerprice** | **String** | Customer specific price for the product, excluding taxes |  [optional] |
|**partdescription1** | **String** | Description on the part number that is being requested |  [optional] |
|**partdescription2** | **String** | Contuiation of description on the part number that is being requested |  [optional] |
|**vendornumber** | **String** | Internal four digit code assigned by Ingram |  [optional] |
|**vendorname** | **String** | Name of the vendor |  [optional] |
|**cpucode** | **String** | Ingram internal code for a product |  [optional] |
|**propertyClass** | [**PropertyClassEnum**](#PropertyClassEnum) | Ingram Micro assigned product classification. |  [optional] |
|**skustatus** | **String** | Identifies if the SKU has been discontinued. Rules must be defined on the values to be sent out to partner. |  [optional] |
|**mediacpu** | **String** |  |  [optional] |
|**categorysubcategory** | **String** | Ingram&#39;s internal categorization of the product |  [optional] |
|**retailprice** | **BigDecimal** | MSRP Price 0.00 |  |
|**newmedia** | **String** | Internal four-digit code assigned by Ingram to represent the item group |  [optional] |
|**enduserrequired** | [**EnduserrequiredEnum**](#EnduserrequiredEnum) | Y - End user required N - Not required End user |  [optional] |
|**backorderflag** | [**BackorderflagEnum**](#BackorderflagEnum) | Y- Allow Backorder Flag N- Not allowed |  [optional] |
|**skuauthorized** | **String** |  |  [optional] |
|**extendedvendorpartnumber** | **String** |  |  [optional] |
|**warehousedetails** | [**List&lt;MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInnerWarehousedetailsInner&gt;**](MultiSKUPriceAndStockResponseServiceresponsePriceandstockresponseDetailsInnerWarehousedetailsInner.md) |  |  [optional] |



## Enum: PropertyClassEnum

| Name | Value |
|---- | -----|
| A_STOCKED_PRODUCT_IN_ALL_IM_WAREHOUSES | &quot;A-Stocked product in all IM warehouses&quot; |
| B_LIMITED_STOCK_IN_IM_WAREHOUSES | &quot;B-Limited stock in IM warehouses&quot; |
| C_STOCKED_IN_FEWER_WARESHOUSES | &quot;C-Stocked in fewer wareshouses&quot; |
| D_INGRAM_DISCONTINUED | &quot;D-Ingram discontinued&quot; |
| E_PLANNED_TO_BE_PHASED_OUT_AS_PER_THE_VENDOR | &quot;E-Planned to be phased out as per the vendor&quot; |
| F_CARRIED_FOR_SPECIFIC_CUSTOMER_AS_PER_THE_CONTRACT | &quot;F-Carried for specific customer as per the contract&quot; |
| N_NEW_SKU | &quot;N-New SKU&quot; |
| O_DISCONTINUED_TO_BE_LIQUIDATED | &quot;O-Discontinued to be liquidated&quot; |
| S_ORDER_FOR_SPECIALIZED_DEMAND | &quot;S-Order for specialized demand&quot; |
| V_DISCONTINUED_BY_VENDOR | &quot;V-Discontinued by vendor&quot; |
| X_DIRECT_SHIP_PRODUCTS_FROM_VENDOR | &quot;X-Direct Ship products from vendor&quot; |



## Enum: EnduserrequiredEnum

| Name | Value |
|---- | -----|
| Y_END_USER_DATA_REQUIRED | &quot;Y-End user data required&quot; |
| N_END_USER_DATA_NOT_REQUIRED | &quot;N-End user data not required&quot; |



## Enum: BackorderflagEnum

| Name | Value |
|---- | -----|
| Y_CAN_BE_BACKORDERED | &quot;Y- Can be backordered&quot; |
| N_CANNOT_BE_BACKORDERED | &quot;N-Cannot be backordered&quot; |



