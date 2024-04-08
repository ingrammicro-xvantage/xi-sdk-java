/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package xiresellers.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.AsyncOrderCreateDTOAdditionalAttributesInner;
import xiresellers.client.model.AsyncOrderCreateDTOEndUserInfo;
import xiresellers.client.model.AsyncOrderCreateDTOLinesInner;
import xiresellers.client.model.AsyncOrderCreateDTOResellerInfo;
import xiresellers.client.model.AsyncOrderCreateDTOShipToInfo;
import xiresellers.client.model.AsyncOrderCreateDTOShipmentDetails;
import xiresellers.client.model.AsyncOrderCreateDTOVmfadditionalAttributesInner;
import xiresellers.client.model.AsyncOrderCreateDTOWarrantyInfoInner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * AsyncOrderCreateDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T10:59:03.033551Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AsyncOrderCreateDTO {
  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER = "customerOrderNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ORDER_NUMBER)
  private String customerOrderNumber;

  public static final String SERIALIZED_NAME_ENDCUSTOMER_ORDER_NUMBER = "endcustomerOrderNumber";
  @SerializedName(SERIALIZED_NAME_ENDCUSTOMER_ORDER_NUMBER)
  private String endcustomerOrderNumber;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_BILL_TO_ADDRESS_ID = "billToAddressId";
  @SerializedName(SERIALIZED_NAME_BILL_TO_ADDRESS_ID)
  private String billToAddressId;

  public static final String SERIALIZED_NAME_SPECIAL_BID_NUMBER = "specialBidNumber";
  @SerializedName(SERIALIZED_NAME_SPECIAL_BID_NUMBER)
  private String specialBidNumber;

  public static final String SERIALIZED_NAME_INTERNAL_COMMENTS = "internalComments";
  @SerializedName(SERIALIZED_NAME_INTERNAL_COMMENTS)
  private String internalComments;

  public static final String SERIALIZED_NAME_ACCEPT_BACK_ORDER = "acceptBackOrder";
  @SerializedName(SERIALIZED_NAME_ACCEPT_BACK_ORDER)
  private Boolean acceptBackOrder;

  public static final String SERIALIZED_NAME_VEND_AUTH_NUMBER = "vendAuthNumber";
  @SerializedName(SERIALIZED_NAME_VEND_AUTH_NUMBER)
  private String vendAuthNumber;

  public static final String SERIALIZED_NAME_RESELLER_INFO = "resellerInfo";
  @SerializedName(SERIALIZED_NAME_RESELLER_INFO)
  private AsyncOrderCreateDTOResellerInfo resellerInfo;

  public static final String SERIALIZED_NAME_END_USER_INFO = "endUserInfo";
  @SerializedName(SERIALIZED_NAME_END_USER_INFO)
  private AsyncOrderCreateDTOEndUserInfo endUserInfo;

  public static final String SERIALIZED_NAME_SHIP_TO_INFO = "shipToInfo";
  @SerializedName(SERIALIZED_NAME_SHIP_TO_INFO)
  private AsyncOrderCreateDTOShipToInfo shipToInfo;

  public static final String SERIALIZED_NAME_SHIPMENT_DETAILS = "shipmentDetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_DETAILS)
  private AsyncOrderCreateDTOShipmentDetails shipmentDetails;

  public static final String SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES = "additionalAttributes";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ATTRIBUTES)
  private List<AsyncOrderCreateDTOAdditionalAttributesInner> additionalAttributes;

  public static final String SERIALIZED_NAME_VMFADDITIONAL_ATTRIBUTES = "vmfadditionalAttributes";
  @SerializedName(SERIALIZED_NAME_VMFADDITIONAL_ATTRIBUTES)
  private List<AsyncOrderCreateDTOVmfadditionalAttributesInner> vmfadditionalAttributes;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<AsyncOrderCreateDTOLinesInner> lines;

  public static final String SERIALIZED_NAME_WARRANTY_INFO = "warrantyInfo";
  @SerializedName(SERIALIZED_NAME_WARRANTY_INFO)
  private List<AsyncOrderCreateDTOWarrantyInfoInner> warrantyInfo;

  public AsyncOrderCreateDTO() {
  }

  public AsyncOrderCreateDTO quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

   /**
   * A unique identifier generated by Ingram Micro&#39;s CRM specific to each quote.
   * @return quoteNumber
  **/
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public AsyncOrderCreateDTO customerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
    return this;
  }

   /**
   * The reseller&#39;s order number for reference in their system.
   * @return customerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getCustomerOrderNumber() {
    return customerOrderNumber;
  }

  public void setCustomerOrderNumber(String customerOrderNumber) {
    this.customerOrderNumber = customerOrderNumber;
  }


  public AsyncOrderCreateDTO endcustomerOrderNumber(String endcustomerOrderNumber) {
    this.endcustomerOrderNumber = endcustomerOrderNumber;
    return this;
  }

   /**
   * The end customer&#39;s order number for reference in their system.
   * @return endcustomerOrderNumber
  **/
  @javax.annotation.Nullable
  public String getEndcustomerOrderNumber() {
    return endcustomerOrderNumber;
  }

  public void setEndcustomerOrderNumber(String endcustomerOrderNumber) {
    this.endcustomerOrderNumber = endcustomerOrderNumber;
  }


  public AsyncOrderCreateDTO notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Order header level notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public AsyncOrderCreateDTO billToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
    return this;
  }

   /**
   * Suffix used to identify billing address. Created during onboarding. Resellers are provided with one or more address IDs depending on how many bill to addresses they need for various flooring companies they are using for credit.
   * @return billToAddressId
  **/
  @javax.annotation.Nullable
  public String getBillToAddressId() {
    return billToAddressId;
  }

  public void setBillToAddressId(String billToAddressId) {
    this.billToAddressId = billToAddressId;
  }


  public AsyncOrderCreateDTO specialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
    return this;
  }

   /**
   * The bid number is provided to the reseller by the vendor for special pricing and discounts. Line-level bid numbers take precedence over header-level bid numbers.
   * @return specialBidNumber
  **/
  @javax.annotation.Nullable
  public String getSpecialBidNumber() {
    return specialBidNumber;
  }

  public void setSpecialBidNumber(String specialBidNumber) {
    this.specialBidNumber = specialBidNumber;
  }


  public AsyncOrderCreateDTO internalComments(String internalComments) {
    this.internalComments = internalComments;
    return this;
  }

   /**
   * need to replace with actual description
   * @return internalComments
  **/
  @javax.annotation.Nullable
  public String getInternalComments() {
    return internalComments;
  }

  public void setInternalComments(String internalComments) {
    this.internalComments = internalComments;
  }


  public AsyncOrderCreateDTO acceptBackOrder(Boolean acceptBackOrder) {
    this.acceptBackOrder = acceptBackOrder;
    return this;
  }

   /**
   * ENUM [\&quot;true\&quot;,\&quot;false\&quot;] - accept order if this item is backordered. This field along with shipComplete field decides the value of backorderflag. The value of this field is ignored when shipComplete field is present.
   * @return acceptBackOrder
  **/
  @javax.annotation.Nullable
  public Boolean getAcceptBackOrder() {
    return acceptBackOrder;
  }

  public void setAcceptBackOrder(Boolean acceptBackOrder) {
    this.acceptBackOrder = acceptBackOrder;
  }


  public AsyncOrderCreateDTO vendAuthNumber(String vendAuthNumber) {
    this.vendAuthNumber = vendAuthNumber;
    return this;
  }

   /**
   * Authorization number provided by vendor to Ingram&#39;s reseller. Orders will be placed on hold without this value, vendor specific mandatory field - please reach out Ingram Sales team for list of vendor for whom this is mandatory.
   * @return vendAuthNumber
  **/
  @javax.annotation.Nullable
  public String getVendAuthNumber() {
    return vendAuthNumber;
  }

  public void setVendAuthNumber(String vendAuthNumber) {
    this.vendAuthNumber = vendAuthNumber;
  }


  public AsyncOrderCreateDTO resellerInfo(AsyncOrderCreateDTOResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
    return this;
  }

   /**
   * Get resellerInfo
   * @return resellerInfo
  **/
  @javax.annotation.Nullable
  public AsyncOrderCreateDTOResellerInfo getResellerInfo() {
    return resellerInfo;
  }

  public void setResellerInfo(AsyncOrderCreateDTOResellerInfo resellerInfo) {
    this.resellerInfo = resellerInfo;
  }


  public AsyncOrderCreateDTO endUserInfo(AsyncOrderCreateDTOEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
    return this;
  }

   /**
   * Get endUserInfo
   * @return endUserInfo
  **/
  @javax.annotation.Nullable
  public AsyncOrderCreateDTOEndUserInfo getEndUserInfo() {
    return endUserInfo;
  }

  public void setEndUserInfo(AsyncOrderCreateDTOEndUserInfo endUserInfo) {
    this.endUserInfo = endUserInfo;
  }


  public AsyncOrderCreateDTO shipToInfo(AsyncOrderCreateDTOShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
    return this;
  }

   /**
   * Get shipToInfo
   * @return shipToInfo
  **/
  @javax.annotation.Nullable
  public AsyncOrderCreateDTOShipToInfo getShipToInfo() {
    return shipToInfo;
  }

  public void setShipToInfo(AsyncOrderCreateDTOShipToInfo shipToInfo) {
    this.shipToInfo = shipToInfo;
  }


  public AsyncOrderCreateDTO shipmentDetails(AsyncOrderCreateDTOShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

   /**
   * Get shipmentDetails
   * @return shipmentDetails
  **/
  @javax.annotation.Nullable
  public AsyncOrderCreateDTOShipmentDetails getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(AsyncOrderCreateDTOShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }


  public AsyncOrderCreateDTO additionalAttributes(List<AsyncOrderCreateDTOAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public AsyncOrderCreateDTO addAdditionalAttributesItem(AsyncOrderCreateDTOAdditionalAttributesInner additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new ArrayList<>();
    }
    this.additionalAttributes.add(additionalAttributesItem);
    return this;
  }

   /**
   * Additional order create attributes.
   * @return additionalAttributes
  **/
  @javax.annotation.Nullable
  public List<AsyncOrderCreateDTOAdditionalAttributesInner> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(List<AsyncOrderCreateDTOAdditionalAttributesInner> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }


  public AsyncOrderCreateDTO vmfadditionalAttributes(List<AsyncOrderCreateDTOVmfadditionalAttributesInner> vmfadditionalAttributes) {
    this.vmfadditionalAttributes = vmfadditionalAttributes;
    return this;
  }

  public AsyncOrderCreateDTO addVmfadditionalAttributesItem(AsyncOrderCreateDTOVmfadditionalAttributesInner vmfadditionalAttributesItem) {
    if (this.vmfadditionalAttributes == null) {
      this.vmfadditionalAttributes = new ArrayList<>();
    }
    this.vmfadditionalAttributes.add(vmfadditionalAttributesItem);
    return this;
  }

   /**
   * The object containing the list of fields required at a header level by the vendor.
   * @return vmfadditionalAttributes
  **/
  @javax.annotation.Nullable
  public List<AsyncOrderCreateDTOVmfadditionalAttributesInner> getVmfadditionalAttributes() {
    return vmfadditionalAttributes;
  }

  public void setVmfadditionalAttributes(List<AsyncOrderCreateDTOVmfadditionalAttributesInner> vmfadditionalAttributes) {
    this.vmfadditionalAttributes = vmfadditionalAttributes;
  }


  public AsyncOrderCreateDTO lines(List<AsyncOrderCreateDTOLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public AsyncOrderCreateDTO addLinesItem(AsyncOrderCreateDTOLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

   /**
   * The object containing the lines that require vendor mandatory fields.
   * @return lines
  **/
  @javax.annotation.Nullable
  public List<AsyncOrderCreateDTOLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<AsyncOrderCreateDTOLinesInner> lines) {
    this.lines = lines;
  }


  public AsyncOrderCreateDTO warrantyInfo(List<AsyncOrderCreateDTOWarrantyInfoInner> warrantyInfo) {
    this.warrantyInfo = warrantyInfo;
    return this;
  }

  public AsyncOrderCreateDTO addWarrantyInfoItem(AsyncOrderCreateDTOWarrantyInfoInner warrantyInfoItem) {
    if (this.warrantyInfo == null) {
      this.warrantyInfo = new ArrayList<>();
    }
    this.warrantyInfo.add(warrantyInfoItem);
    return this;
  }

   /**
   * Warranty Information
   * @return warrantyInfo
  **/
  @javax.annotation.Nullable
  public List<AsyncOrderCreateDTOWarrantyInfoInner> getWarrantyInfo() {
    return warrantyInfo;
  }

  public void setWarrantyInfo(List<AsyncOrderCreateDTOWarrantyInfoInner> warrantyInfo) {
    this.warrantyInfo = warrantyInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncOrderCreateDTO asyncOrderCreateDTO = (AsyncOrderCreateDTO) o;
    return Objects.equals(this.quoteNumber, asyncOrderCreateDTO.quoteNumber) &&
        Objects.equals(this.customerOrderNumber, asyncOrderCreateDTO.customerOrderNumber) &&
        Objects.equals(this.endcustomerOrderNumber, asyncOrderCreateDTO.endcustomerOrderNumber) &&
        Objects.equals(this.notes, asyncOrderCreateDTO.notes) &&
        Objects.equals(this.billToAddressId, asyncOrderCreateDTO.billToAddressId) &&
        Objects.equals(this.specialBidNumber, asyncOrderCreateDTO.specialBidNumber) &&
        Objects.equals(this.internalComments, asyncOrderCreateDTO.internalComments) &&
        Objects.equals(this.acceptBackOrder, asyncOrderCreateDTO.acceptBackOrder) &&
        Objects.equals(this.vendAuthNumber, asyncOrderCreateDTO.vendAuthNumber) &&
        Objects.equals(this.resellerInfo, asyncOrderCreateDTO.resellerInfo) &&
        Objects.equals(this.endUserInfo, asyncOrderCreateDTO.endUserInfo) &&
        Objects.equals(this.shipToInfo, asyncOrderCreateDTO.shipToInfo) &&
        Objects.equals(this.shipmentDetails, asyncOrderCreateDTO.shipmentDetails) &&
        Objects.equals(this.additionalAttributes, asyncOrderCreateDTO.additionalAttributes) &&
        Objects.equals(this.vmfadditionalAttributes, asyncOrderCreateDTO.vmfadditionalAttributes) &&
        Objects.equals(this.lines, asyncOrderCreateDTO.lines) &&
        Objects.equals(this.warrantyInfo, asyncOrderCreateDTO.warrantyInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteNumber, customerOrderNumber, endcustomerOrderNumber, notes, billToAddressId, specialBidNumber, internalComments, acceptBackOrder, vendAuthNumber, resellerInfo, endUserInfo, shipToInfo, shipmentDetails, additionalAttributes, vmfadditionalAttributes, lines, warrantyInfo);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncOrderCreateDTO {\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    customerOrderNumber: ").append(toIndentedString(customerOrderNumber)).append("\n");
    sb.append("    endcustomerOrderNumber: ").append(toIndentedString(endcustomerOrderNumber)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    billToAddressId: ").append(toIndentedString(billToAddressId)).append("\n");
    sb.append("    specialBidNumber: ").append(toIndentedString(specialBidNumber)).append("\n");
    sb.append("    internalComments: ").append(toIndentedString(internalComments)).append("\n");
    sb.append("    acceptBackOrder: ").append(toIndentedString(acceptBackOrder)).append("\n");
    sb.append("    vendAuthNumber: ").append(toIndentedString(vendAuthNumber)).append("\n");
    sb.append("    resellerInfo: ").append(toIndentedString(resellerInfo)).append("\n");
    sb.append("    endUserInfo: ").append(toIndentedString(endUserInfo)).append("\n");
    sb.append("    shipToInfo: ").append(toIndentedString(shipToInfo)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    vmfadditionalAttributes: ").append(toIndentedString(vmfadditionalAttributes)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    warrantyInfo: ").append(toIndentedString(warrantyInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("quoteNumber");
    openapiFields.add("customerOrderNumber");
    openapiFields.add("endcustomerOrderNumber");
    openapiFields.add("notes");
    openapiFields.add("billToAddressId");
    openapiFields.add("specialBidNumber");
    openapiFields.add("internalComments");
    openapiFields.add("acceptBackOrder");
    openapiFields.add("vendAuthNumber");
    openapiFields.add("resellerInfo");
    openapiFields.add("endUserInfo");
    openapiFields.add("shipToInfo");
    openapiFields.add("shipmentDetails");
    openapiFields.add("additionalAttributes");
    openapiFields.add("vmfadditionalAttributes");
    openapiFields.add("lines");
    openapiFields.add("warrantyInfo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AsyncOrderCreateDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AsyncOrderCreateDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AsyncOrderCreateDTO is not found in the empty JSON string", AsyncOrderCreateDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AsyncOrderCreateDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AsyncOrderCreateDTO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("customerOrderNumber") != null && !jsonObj.get("customerOrderNumber").isJsonNull()) && !jsonObj.get("customerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerOrderNumber").toString()));
      }
      if ((jsonObj.get("endcustomerOrderNumber") != null && !jsonObj.get("endcustomerOrderNumber").isJsonNull()) && !jsonObj.get("endcustomerOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endcustomerOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endcustomerOrderNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("billToAddressId") != null && !jsonObj.get("billToAddressId").isJsonNull()) && !jsonObj.get("billToAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billToAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billToAddressId").toString()));
      }
      if ((jsonObj.get("specialBidNumber") != null && !jsonObj.get("specialBidNumber").isJsonNull()) && !jsonObj.get("specialBidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specialBidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specialBidNumber").toString()));
      }
      if ((jsonObj.get("internalComments") != null && !jsonObj.get("internalComments").isJsonNull()) && !jsonObj.get("internalComments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internalComments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internalComments").toString()));
      }
      if ((jsonObj.get("vendAuthNumber") != null && !jsonObj.get("vendAuthNumber").isJsonNull()) && !jsonObj.get("vendAuthNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendAuthNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendAuthNumber").toString()));
      }
      // validate the optional field `resellerInfo`
      if (jsonObj.get("resellerInfo") != null && !jsonObj.get("resellerInfo").isJsonNull()) {
        AsyncOrderCreateDTOResellerInfo.validateJsonElement(jsonObj.get("resellerInfo"));
      }
      // validate the optional field `endUserInfo`
      if (jsonObj.get("endUserInfo") != null && !jsonObj.get("endUserInfo").isJsonNull()) {
        AsyncOrderCreateDTOEndUserInfo.validateJsonElement(jsonObj.get("endUserInfo"));
      }
      // validate the optional field `shipToInfo`
      if (jsonObj.get("shipToInfo") != null && !jsonObj.get("shipToInfo").isJsonNull()) {
        AsyncOrderCreateDTOShipToInfo.validateJsonElement(jsonObj.get("shipToInfo"));
      }
      // validate the optional field `shipmentDetails`
      if (jsonObj.get("shipmentDetails") != null && !jsonObj.get("shipmentDetails").isJsonNull()) {
        AsyncOrderCreateDTOShipmentDetails.validateJsonElement(jsonObj.get("shipmentDetails"));
      }
      if (jsonObj.get("additionalAttributes") != null && !jsonObj.get("additionalAttributes").isJsonNull()) {
        JsonArray jsonArrayadditionalAttributes = jsonObj.getAsJsonArray("additionalAttributes");
        if (jsonArrayadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("additionalAttributes").toString()));
          }

          // validate the optional field `additionalAttributes` (array)
          for (int i = 0; i < jsonArrayadditionalAttributes.size(); i++) {
            AsyncOrderCreateDTOAdditionalAttributesInner.validateJsonElement(jsonArrayadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("vmfadditionalAttributes") != null && !jsonObj.get("vmfadditionalAttributes").isJsonNull()) {
        JsonArray jsonArrayvmfadditionalAttributes = jsonObj.getAsJsonArray("vmfadditionalAttributes");
        if (jsonArrayvmfadditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vmfadditionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vmfadditionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("vmfadditionalAttributes").toString()));
          }

          // validate the optional field `vmfadditionalAttributes` (array)
          for (int i = 0; i < jsonArrayvmfadditionalAttributes.size(); i++) {
            AsyncOrderCreateDTOVmfadditionalAttributesInner.validateJsonElement(jsonArrayvmfadditionalAttributes.get(i));
          };
        }
      }
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        JsonArray jsonArraylines = jsonObj.getAsJsonArray("lines");
        if (jsonArraylines != null) {
          // ensure the json data is an array
          if (!jsonObj.get("lines").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `lines` to be an array in the JSON string but got `%s`", jsonObj.get("lines").toString()));
          }

          // validate the optional field `lines` (array)
          for (int i = 0; i < jsonArraylines.size(); i++) {
            AsyncOrderCreateDTOLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      if (jsonObj.get("warrantyInfo") != null && !jsonObj.get("warrantyInfo").isJsonNull()) {
        JsonArray jsonArraywarrantyInfo = jsonObj.getAsJsonArray("warrantyInfo");
        if (jsonArraywarrantyInfo != null) {
          // ensure the json data is an array
          if (!jsonObj.get("warrantyInfo").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `warrantyInfo` to be an array in the JSON string but got `%s`", jsonObj.get("warrantyInfo").toString()));
          }

          // validate the optional field `warrantyInfo` (array)
          for (int i = 0; i < jsonArraywarrantyInfo.size(); i++) {
            AsyncOrderCreateDTOWarrantyInfoInner.validateJsonElement(jsonArraywarrantyInfo.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncOrderCreateDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncOrderCreateDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncOrderCreateDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncOrderCreateDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncOrderCreateDTO>() {
           @Override
           public void write(JsonWriter out, AsyncOrderCreateDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncOrderCreateDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncOrderCreateDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncOrderCreateDTO
  * @throws IOException if the JSON string is invalid with respect to AsyncOrderCreateDTO
  */
  public static AsyncOrderCreateDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncOrderCreateDTO.class);
  }

 /**
  * Convert an instance of AsyncOrderCreateDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

