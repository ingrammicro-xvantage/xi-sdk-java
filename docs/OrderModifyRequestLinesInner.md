

# OrderModifyRequestLinesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ingramPartNumber** | **String** | The unique IngramMicro part number. |  [optional] |
|**ingramLineNumber** | **String** | The IngramMicro line number. |  [optional] |
|**customerLineNumber** | **String** | The reseller&#39;s line number for reference in their system. |  [optional] |
|**addUpdateDeleteLine** | [**AddUpdateDeleteLineEnum**](#AddUpdateDeleteLineEnum) | The line number that was added, updated, or deleted. |  [optional] |
|**quantity** | **Integer** | The quantity of the line item. |  [optional] |
|**notes** | **String** | The line-level notes. |  [optional] |



## Enum: AddUpdateDeleteLineEnum

| Name | Value |
|---- | -----|
| UPDATE | &quot;UPDATE&quot; |
| DELETE | &quot;DELETE&quot; |
| ADD | &quot;ADD&quot; |



