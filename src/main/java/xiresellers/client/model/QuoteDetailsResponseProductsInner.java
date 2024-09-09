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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.QuoteDetailsResponseProductsInnerBillDetailsInner;
import xiresellers.client.model.QuoteDetailsResponseProductsInnerPrice;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * QuoteDetailsResponseProductsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T08:55:15.048117Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QuoteDetailsResponseProductsInner {
  public static final String SERIALIZED_NAME_QUOTE_PRODUCT_GUID = "quoteProductGuid";
  @SerializedName(SERIALIZED_NAME_QUOTE_PRODUCT_GUID)
  private String quoteProductGuid;

  public static final String SERIALIZED_NAME_LINE_NUMBER = "lineNumber";
  @SerializedName(SERIALIZED_NAME_LINE_NUMBER)
  private String lineNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_REMAINING_QUOTE_QTY = "remainingQuoteQty";
  @SerializedName(SERIALIZED_NAME_REMAINING_QUOTE_QTY)
  private Integer remainingQuoteQty;

  public static final String SERIALIZED_NAME_MINIMUM_ORDER_ALLOWED_QTY = "minimumOrderAllowedQty";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ORDER_ALLOWED_QTY)
  private Integer minimumOrderAllowedQty;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_EAN = "ean";
  @SerializedName(SERIALIZED_NAME_EAN)
  private String ean;

  public static final String SERIALIZED_NAME_COO = "coo";
  @SerializedName(SERIALIZED_NAME_COO)
  private String coo;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public static final String SERIALIZED_NAME_WEIGHT_UOM = "weightUom";
  @SerializedName(SERIALIZED_NAME_WEIGHT_UOM)
  private String weightUom;

  public static final String SERIALIZED_NAME_IS_SUGGESTION_PRODUCT = "isSuggestionProduct";
  @SerializedName(SERIALIZED_NAME_IS_SUGGESTION_PRODUCT)
  private Boolean isSuggestionProduct;

  public static final String SERIALIZED_NAME_VPN_CATEGORY = "vpnCategory";
  @SerializedName(SERIALIZED_NAME_VPN_CATEGORY)
  private String vpnCategory;

  public static final String SERIALIZED_NAME_QUOTE_PRODUCTS_SUPPLIER_PART_AUXILIARY_ID = "quoteProductsSupplierPartAuxiliaryId";
  @SerializedName(SERIALIZED_NAME_QUOTE_PRODUCTS_SUPPLIER_PART_AUXILIARY_ID)
  private String quoteProductsSupplierPartAuxiliaryId;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_TERMS = "terms";
  @SerializedName(SERIALIZED_NAME_TERMS)
  private String terms;

  public static final String SERIALIZED_NAME_PLAN_DESCRIPTION = "planDescription";
  @SerializedName(SERIALIZED_NAME_PLAN_DESCRIPTION)
  private String planDescription;

  public static final String SERIALIZED_NAME_IS_SUBSCRIPTION = "isSubscription";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIPTION)
  private Boolean isSubscription;

  public static final String SERIALIZED_NAME_RESELLER_MARGIN = "resellerMargin";
  @SerializedName(SERIALIZED_NAME_RESELLER_MARGIN)
  private String resellerMargin;

  public static final String SERIALIZED_NAME_REQUESTED_START_DATE = "requestedStartDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_START_DATE)
  private String requestedStartDate;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private QuoteDetailsResponseProductsInnerPrice price;

  public static final String SERIALIZED_NAME_BILL_DETAILS = "billDetails";
  @SerializedName(SERIALIZED_NAME_BILL_DETAILS)
  private List<QuoteDetailsResponseProductsInnerBillDetailsInner> billDetails = new ArrayList<>();

  public QuoteDetailsResponseProductsInner() {
  }

  public QuoteDetailsResponseProductsInner quoteProductGuid(String quoteProductGuid) {
    this.quoteProductGuid = quoteProductGuid;
    return this;
  }

  /**
   * Quote Product GUID  is the primary quote key in Ingram Micro&#39;s CRM - needed to retrieve quote details.
   * @return quoteProductGuid
   */
  @javax.annotation.Nullable
  public String getQuoteProductGuid() {
    return quoteProductGuid;
  }

  public void setQuoteProductGuid(String quoteProductGuid) {
    this.quoteProductGuid = quoteProductGuid;
  }


  public QuoteDetailsResponseProductsInner lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Line number which the product will appear in the quote.  Line number is manditory when unique configurations are included in a quote and mainting the item line order is required.
   * @return lineNumber
   */
  @javax.annotation.Nullable
  public String getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }


  public QuoteDetailsResponseProductsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of product line item quoted.
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public QuoteDetailsResponseProductsInner remainingQuoteQty(Integer remainingQuoteQty) {
    this.remainingQuoteQty = remainingQuoteQty;
    return this;
  }

  /**
   * Get remainingQuoteQty
   * @return remainingQuoteQty
   */
  @javax.annotation.Nullable
  public Integer getRemainingQuoteQty() {
    return remainingQuoteQty;
  }

  public void setRemainingQuoteQty(Integer remainingQuoteQty) {
    this.remainingQuoteQty = remainingQuoteQty;
  }


  public QuoteDetailsResponseProductsInner minimumOrderAllowedQty(Integer minimumOrderAllowedQty) {
    this.minimumOrderAllowedQty = minimumOrderAllowedQty;
    return this;
  }

  /**
   * Get minimumOrderAllowedQty
   * @return minimumOrderAllowedQty
   */
  @javax.annotation.Nullable
  public Integer getMinimumOrderAllowedQty() {
    return minimumOrderAllowedQty;
  }

  public void setMinimumOrderAllowedQty(Integer minimumOrderAllowedQty) {
    this.minimumOrderAllowedQty = minimumOrderAllowedQty;
  }


  public QuoteDetailsResponseProductsInner notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Product line item comments.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public QuoteDetailsResponseProductsInner ean(String ean) {
    this.ean = ean;
    return this;
  }

  /**
   * EANUPC
   * @return ean
   */
  @javax.annotation.Nullable
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }


  public QuoteDetailsResponseProductsInner coo(String coo) {
    this.coo = coo;
    return this;
  }

  /**
   * Country of Origin.
   * @return coo
   */
  @javax.annotation.Nullable
  public String getCoo() {
    return coo;
  }

  public void setCoo(String coo) {
    this.coo = coo;
  }


  public QuoteDetailsResponseProductsInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * Ingram Micro SKU (stock keeping unit). An identification, usually alphanumeric, of a particular product that allows it to be tracked for inventory purposes
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public QuoteDetailsResponseProductsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

  /**
   * Vendor Part Number
   * @return vendorPartNumber
   */
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public QuoteDetailsResponseProductsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Product description.  Note - The quote view api returns only the product short description as maintained in Ingram Micro&#39;s crm system.  For long descriptions, please refer to alternative information sources.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public QuoteDetailsResponseProductsInner weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Weight is provided based on country standard.  For countries following Imperial standards - weight is presented as pounds with decimal.  In countries following metric standards, weight is provided as kilograms with decimal.
   * @return weight
   */
  @javax.annotation.Nullable
  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  public QuoteDetailsResponseProductsInner weightUom(String weightUom) {
    this.weightUom = weightUom;
    return this;
  }

  /**
   * Unit of measure
   * @return weightUom
   */
  @javax.annotation.Nullable
  public String getWeightUom() {
    return weightUom;
  }

  public void setWeightUom(String weightUom) {
    this.weightUom = weightUom;
  }


  public QuoteDetailsResponseProductsInner isSuggestionProduct(Boolean isSuggestionProduct) {
    this.isSuggestionProduct = isSuggestionProduct;
    return this;
  }

  /**
   * Flag to indicate if a product line item is a suggested product.  The suggested product is provided in addition to the requested quoted products and a suggested option.  Suggested products are grouped together for subtotal and total calculations.
   * @return isSuggestionProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsSuggestionProduct() {
    return isSuggestionProduct;
  }

  public void setIsSuggestionProduct(Boolean isSuggestionProduct) {
    this.isSuggestionProduct = isSuggestionProduct;
  }


  public QuoteDetailsResponseProductsInner vpnCategory(String vpnCategory) {
    this.vpnCategory = vpnCategory;
    return this;
  }

  /**
   * Vendor product category specific to Cisco. HWDW (hardware) or service.
   * @return vpnCategory
   */
  @javax.annotation.Nullable
  public String getVpnCategory() {
    return vpnCategory;
  }

  public void setVpnCategory(String vpnCategory) {
    this.vpnCategory = vpnCategory;
  }


  public QuoteDetailsResponseProductsInner quoteProductsSupplierPartAuxiliaryId(String quoteProductsSupplierPartAuxiliaryId) {
    this.quoteProductsSupplierPartAuxiliaryId = quoteProductsSupplierPartAuxiliaryId;
    return this;
  }

  /**
   * Vendor product configuration ID specific to Cisco.
   * @return quoteProductsSupplierPartAuxiliaryId
   */
  @javax.annotation.Nullable
  public String getQuoteProductsSupplierPartAuxiliaryId() {
    return quoteProductsSupplierPartAuxiliaryId;
  }

  public void setQuoteProductsSupplierPartAuxiliaryId(String quoteProductsSupplierPartAuxiliaryId) {
    this.quoteProductsSupplierPartAuxiliaryId = quoteProductsSupplierPartAuxiliaryId;
  }


  public QuoteDetailsResponseProductsInner vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  /**
   * Vendor name of the product
   * @return vendorName
   */
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public QuoteDetailsResponseProductsInner terms(String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * Terms of the quote
   * @return terms
   */
  @javax.annotation.Nullable
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }


  public QuoteDetailsResponseProductsInner planDescription(String planDescription) {
    this.planDescription = planDescription;
    return this;
  }

  /**
   * Get planDescription
   * @return planDescription
   */
  @javax.annotation.Nullable
  public String getPlanDescription() {
    return planDescription;
  }

  public void setPlanDescription(String planDescription) {
    this.planDescription = planDescription;
  }


  public QuoteDetailsResponseProductsInner isSubscription(Boolean isSubscription) {
    this.isSubscription = isSubscription;
    return this;
  }

  /**
   * Get isSubscription
   * @return isSubscription
   */
  @javax.annotation.Nullable
  public Boolean getIsSubscription() {
    return isSubscription;
  }

  public void setIsSubscription(Boolean isSubscription) {
    this.isSubscription = isSubscription;
  }


  public QuoteDetailsResponseProductsInner resellerMargin(String resellerMargin) {
    this.resellerMargin = resellerMargin;
    return this;
  }

  /**
   * Get resellerMargin
   * @return resellerMargin
   */
  @javax.annotation.Nullable
  public String getResellerMargin() {
    return resellerMargin;
  }

  public void setResellerMargin(String resellerMargin) {
    this.resellerMargin = resellerMargin;
  }


  public QuoteDetailsResponseProductsInner requestedStartDate(String requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

  /**
   * Get requestedStartDate
   * @return requestedStartDate
   */
  @javax.annotation.Nullable
  public String getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(String requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }


  public QuoteDetailsResponseProductsInner startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public QuoteDetailsResponseProductsInner endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
   */
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public QuoteDetailsResponseProductsInner serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
   */
  @javax.annotation.Nullable
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public QuoteDetailsResponseProductsInner price(QuoteDetailsResponseProductsInnerPrice price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  @javax.annotation.Nullable
  public QuoteDetailsResponseProductsInnerPrice getPrice() {
    return price;
  }

  public void setPrice(QuoteDetailsResponseProductsInnerPrice price) {
    this.price = price;
  }


  public QuoteDetailsResponseProductsInner billDetails(List<QuoteDetailsResponseProductsInnerBillDetailsInner> billDetails) {
    this.billDetails = billDetails;
    return this;
  }

  public QuoteDetailsResponseProductsInner addBillDetailsItem(QuoteDetailsResponseProductsInnerBillDetailsInner billDetailsItem) {
    if (this.billDetails == null) {
      this.billDetails = new ArrayList<>();
    }
    this.billDetails.add(billDetailsItem);
    return this;
  }

  /**
   * Get billDetails
   * @return billDetails
   */
  @javax.annotation.Nullable
  public List<QuoteDetailsResponseProductsInnerBillDetailsInner> getBillDetails() {
    return billDetails;
  }

  public void setBillDetails(List<QuoteDetailsResponseProductsInnerBillDetailsInner> billDetails) {
    this.billDetails = billDetails;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsResponseProductsInner quoteDetailsResponseProductsInner = (QuoteDetailsResponseProductsInner) o;
    return Objects.equals(this.quoteProductGuid, quoteDetailsResponseProductsInner.quoteProductGuid) &&
        Objects.equals(this.lineNumber, quoteDetailsResponseProductsInner.lineNumber) &&
        Objects.equals(this.quantity, quoteDetailsResponseProductsInner.quantity) &&
        Objects.equals(this.remainingQuoteQty, quoteDetailsResponseProductsInner.remainingQuoteQty) &&
        Objects.equals(this.minimumOrderAllowedQty, quoteDetailsResponseProductsInner.minimumOrderAllowedQty) &&
        Objects.equals(this.notes, quoteDetailsResponseProductsInner.notes) &&
        Objects.equals(this.ean, quoteDetailsResponseProductsInner.ean) &&
        Objects.equals(this.coo, quoteDetailsResponseProductsInner.coo) &&
        Objects.equals(this.ingramPartNumber, quoteDetailsResponseProductsInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, quoteDetailsResponseProductsInner.vendorPartNumber) &&
        Objects.equals(this.description, quoteDetailsResponseProductsInner.description) &&
        Objects.equals(this.weight, quoteDetailsResponseProductsInner.weight) &&
        Objects.equals(this.weightUom, quoteDetailsResponseProductsInner.weightUom) &&
        Objects.equals(this.isSuggestionProduct, quoteDetailsResponseProductsInner.isSuggestionProduct) &&
        Objects.equals(this.vpnCategory, quoteDetailsResponseProductsInner.vpnCategory) &&
        Objects.equals(this.quoteProductsSupplierPartAuxiliaryId, quoteDetailsResponseProductsInner.quoteProductsSupplierPartAuxiliaryId) &&
        Objects.equals(this.vendorName, quoteDetailsResponseProductsInner.vendorName) &&
        Objects.equals(this.terms, quoteDetailsResponseProductsInner.terms) &&
        Objects.equals(this.planDescription, quoteDetailsResponseProductsInner.planDescription) &&
        Objects.equals(this.isSubscription, quoteDetailsResponseProductsInner.isSubscription) &&
        Objects.equals(this.resellerMargin, quoteDetailsResponseProductsInner.resellerMargin) &&
        Objects.equals(this.requestedStartDate, quoteDetailsResponseProductsInner.requestedStartDate) &&
        Objects.equals(this.startDate, quoteDetailsResponseProductsInner.startDate) &&
        Objects.equals(this.endDate, quoteDetailsResponseProductsInner.endDate) &&
        Objects.equals(this.serialNumber, quoteDetailsResponseProductsInner.serialNumber) &&
        Objects.equals(this.price, quoteDetailsResponseProductsInner.price) &&
        Objects.equals(this.billDetails, quoteDetailsResponseProductsInner.billDetails);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteProductGuid, lineNumber, quantity, remainingQuoteQty, minimumOrderAllowedQty, notes, ean, coo, ingramPartNumber, vendorPartNumber, description, weight, weightUom, isSuggestionProduct, vpnCategory, quoteProductsSupplierPartAuxiliaryId, vendorName, terms, planDescription, isSubscription, resellerMargin, requestedStartDate, startDate, endDate, serialNumber, price, billDetails);
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
    sb.append("class QuoteDetailsResponseProductsInner {\n");
    sb.append("    quoteProductGuid: ").append(toIndentedString(quoteProductGuid)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    remainingQuoteQty: ").append(toIndentedString(remainingQuoteQty)).append("\n");
    sb.append("    minimumOrderAllowedQty: ").append(toIndentedString(minimumOrderAllowedQty)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    coo: ").append(toIndentedString(coo)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    weightUom: ").append(toIndentedString(weightUom)).append("\n");
    sb.append("    isSuggestionProduct: ").append(toIndentedString(isSuggestionProduct)).append("\n");
    sb.append("    vpnCategory: ").append(toIndentedString(vpnCategory)).append("\n");
    sb.append("    quoteProductsSupplierPartAuxiliaryId: ").append(toIndentedString(quoteProductsSupplierPartAuxiliaryId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    planDescription: ").append(toIndentedString(planDescription)).append("\n");
    sb.append("    isSubscription: ").append(toIndentedString(isSubscription)).append("\n");
    sb.append("    resellerMargin: ").append(toIndentedString(resellerMargin)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    billDetails: ").append(toIndentedString(billDetails)).append("\n");
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
    openapiFields.add("quoteProductGuid");
    openapiFields.add("lineNumber");
    openapiFields.add("quantity");
    openapiFields.add("remainingQuoteQty");
    openapiFields.add("minimumOrderAllowedQty");
    openapiFields.add("notes");
    openapiFields.add("ean");
    openapiFields.add("coo");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("description");
    openapiFields.add("weight");
    openapiFields.add("weightUom");
    openapiFields.add("isSuggestionProduct");
    openapiFields.add("vpnCategory");
    openapiFields.add("quoteProductsSupplierPartAuxiliaryId");
    openapiFields.add("vendorName");
    openapiFields.add("terms");
    openapiFields.add("planDescription");
    openapiFields.add("isSubscription");
    openapiFields.add("resellerMargin");
    openapiFields.add("requestedStartDate");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("serialNumber");
    openapiFields.add("price");
    openapiFields.add("billDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsResponseProductsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsResponseProductsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsResponseProductsInner is not found in the empty JSON string", QuoteDetailsResponseProductsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsResponseProductsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsResponseProductsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteProductGuid") != null && !jsonObj.get("quoteProductGuid").isJsonNull()) && !jsonObj.get("quoteProductGuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteProductGuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteProductGuid").toString()));
      }
      if ((jsonObj.get("lineNumber") != null && !jsonObj.get("lineNumber").isJsonNull()) && !jsonObj.get("lineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lineNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("ean") != null && !jsonObj.get("ean").isJsonNull()) && !jsonObj.get("ean").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ean` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ean").toString()));
      }
      if ((jsonObj.get("coo") != null && !jsonObj.get("coo").isJsonNull()) && !jsonObj.get("coo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coo").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("weightUom") != null && !jsonObj.get("weightUom").isJsonNull()) && !jsonObj.get("weightUom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weightUom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weightUom").toString()));
      }
      if ((jsonObj.get("vpnCategory") != null && !jsonObj.get("vpnCategory").isJsonNull()) && !jsonObj.get("vpnCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vpnCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vpnCategory").toString()));
      }
      if ((jsonObj.get("quoteProductsSupplierPartAuxiliaryId") != null && !jsonObj.get("quoteProductsSupplierPartAuxiliaryId").isJsonNull()) && !jsonObj.get("quoteProductsSupplierPartAuxiliaryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteProductsSupplierPartAuxiliaryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteProductsSupplierPartAuxiliaryId").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if ((jsonObj.get("terms") != null && !jsonObj.get("terms").isJsonNull()) && !jsonObj.get("terms").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terms` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terms").toString()));
      }
      if ((jsonObj.get("planDescription") != null && !jsonObj.get("planDescription").isJsonNull()) && !jsonObj.get("planDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `planDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("planDescription").toString()));
      }
      if ((jsonObj.get("resellerMargin") != null && !jsonObj.get("resellerMargin").isJsonNull()) && !jsonObj.get("resellerMargin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resellerMargin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resellerMargin").toString()));
      }
      if ((jsonObj.get("requestedStartDate") != null && !jsonObj.get("requestedStartDate").isJsonNull()) && !jsonObj.get("requestedStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedStartDate").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if ((jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonNull()) && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
      // validate the optional field `price`
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) {
        QuoteDetailsResponseProductsInnerPrice.validateJsonElement(jsonObj.get("price"));
      }
      if (jsonObj.get("billDetails") != null && !jsonObj.get("billDetails").isJsonNull()) {
        JsonArray jsonArraybillDetails = jsonObj.getAsJsonArray("billDetails");
        if (jsonArraybillDetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("billDetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `billDetails` to be an array in the JSON string but got `%s`", jsonObj.get("billDetails").toString()));
          }

          // validate the optional field `billDetails` (array)
          for (int i = 0; i < jsonArraybillDetails.size(); i++) {
            QuoteDetailsResponseProductsInnerBillDetailsInner.validateJsonElement(jsonArraybillDetails.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsResponseProductsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsResponseProductsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsResponseProductsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsResponseProductsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsResponseProductsInner>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsResponseProductsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsResponseProductsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of QuoteDetailsResponseProductsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of QuoteDetailsResponseProductsInner
   * @throws IOException if the JSON string is invalid with respect to QuoteDetailsResponseProductsInner
   */
  public static QuoteDetailsResponseProductsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsResponseProductsInner.class);
  }

  /**
   * Convert an instance of QuoteDetailsResponseProductsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

