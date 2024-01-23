

# OrderSearchResponseServiceResponseOrdersearchresponseOrdersInnerSubordersInnerLinksInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**topic** | [**TopicEnum**](#TopicEnum) | topic being orders or invoices, if it is orders then the link will provide details of the order. If its invoices then the link provides details of the invoice |  [optional] |
|**href** | **URI** | The API endpoint for accessing the relevant data |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of call that can be made to the href link |  [optional] |



## Enum: TopicEnum

| Name | Value |
|---- | -----|
| ORDERS | &quot;orders&quot; |
| INVOICES | &quot;invoices&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |



