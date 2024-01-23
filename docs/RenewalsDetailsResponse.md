

# RenewalsDetailsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**renewalId** | **String** | Unique Ingram renewal ID. |  [optional] |
|**ingramOrderNumber** | **String** | The IngramMicro sales order number. |  [optional] |
|**ingramOrderDate** | **LocalDate** | The IngramMicro sales order date. |  [optional] |
|**expirationDate** | **LocalDate** | Renewal expiration date. |  [optional] |
|**ingramPurchaseOrderNumber** | **String** | Ingram purchase order number. |  [optional] |
|**customerOrderNumber** | **String** | The reseller&#39;s order number for reference in their system. |  [optional] |
|**endCustomerOrderNumber** | **String** | The end customer&#39;s order number for reference in their system. |  [optional] |
|**renewalValue** | **BigDecimal** | The value of the renewal. |  [optional] |
|**endUser** | **String** | The company name for the end user/customer. |  [optional] |
|**vendor** | **String** | The name of the vendor. |  [optional] |
|**status** | **String** | The status of the renewal. |  [optional] |
|**endUserInfo** | [**List&lt;RenewalsDetailsResponseEndUserInfoInner&gt;**](RenewalsDetailsResponseEndUserInfoInner.md) |  |  [optional] |
|**referenceNumber** | [**List&lt;RenewalsDetailsResponseReferenceNumberInner&gt;**](RenewalsDetailsResponseReferenceNumberInner.md) |  |  [optional] |
|**products** | [**List&lt;RenewalsDetailsResponseProductsInner&gt;**](RenewalsDetailsResponseProductsInner.md) |  |  [optional] |
|**additionalAttributes** | [**List&lt;RenewalsDetailsResponseAdditionalAttributesInner&gt;**](RenewalsDetailsResponseAdditionalAttributesInner.md) |  |  [optional] |



