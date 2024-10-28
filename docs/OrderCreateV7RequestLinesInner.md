

# OrderCreateV7RequestLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerLineNumber** | **String** | The reseller&#39;s line item number for reference in their system. The customer line number needs to be a unique numeric value between 1 and 884. In the event we receive duplicate values or alphanumeric values in the customer line number, we will re-sequence the customer line number. To prevent re-sequencing, please use a unique numeric value between 1 and 884 in the customer line number. |  [optional] |
|**ingramPartNumber** | **String** | The unique IngramMicro part number. |  [optional] |
|**vendorPartNumber** | **String** | The vendor&#39;s part number for the line item. |  [optional] |
|**quantity** | **Integer** | The requested quantity of the line item. |  [optional] |
|**unitPrice** | **BigDecimal** | The reseller-requested unit price for the line item. The unit price is not guaranteed. |  [optional] |
|**specialBidNumber** | **String** | The line-level bid number provided to the reseller by the vendor for special pricing and discounts. Used to track the bid number in the case of split orders or where different line items have different bid numbers. Line-level bid number take precedence over header-level bid numbers. |  [optional] |
|**endUserPrice** | **BigDecimal** | The end-user price. Required for Export Orders. |  [optional] |
|**notes** | **String** | The attribute field data. |  [optional] |
|**endUserInfo** | [**List&lt;OrderCreateV7RequestLinesInnerEndUserInfoInner&gt;**](OrderCreateV7RequestLinesInnerEndUserInfoInner.md) |  |  [optional] |
|**additionalAttributes** | [**List&lt;OrderCreateV7RequestLinesInnerAdditionalAttributesInner&gt;**](OrderCreateV7RequestLinesInnerAdditionalAttributesInner.md) |  |  [optional] |
|**warrantyInfo** | [**List&lt;OrderCreateV7RequestLinesInnerWarrantyInfoInner&gt;**](OrderCreateV7RequestLinesInnerWarrantyInfoInner.md) |  |  [optional] |
|**vmfAdditionalAttributesLines** | [**List&lt;OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner&gt;**](OrderCreateV7RequestLinesInnerVmfAdditionalAttributesLinesInner.md) |  |  [optional] |



