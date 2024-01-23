/*
 * Reseller API
 * For Resellers. <br> Who are looking to Innovate with Ingram Micro's API SolutionsAutomate your eCommerce with our offering of APIs and Webhooks to create a seamless experience for your customers.
 *
 * The version of the OpenAPI document: 6.0
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
import xiresellers.client.model.InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner;
import xiresellers.client.model.OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerShipmentdetailsInner;

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
 * OrderDetailResponseServiceresponseOrderdetailresponseLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T11:06:29.712836Z[Etc/UTC]")
public class OrderDetailResponseServiceresponseOrderdetailresponseLinesInner {
  public static final String SERIALIZED_NAME_LINENUMBER = "linenumber";
  @SerializedName(SERIALIZED_NAME_LINENUMBER)
  private String linenumber;

  public static final String SERIALIZED_NAME_GLOBALLINENUMBER = "globallinenumber";
  @SerializedName(SERIALIZED_NAME_GLOBALLINENUMBER)
  private String globallinenumber;

  public static final String SERIALIZED_NAME_ORDERSUFFIX = "ordersuffix";
  @SerializedName(SERIALIZED_NAME_ORDERSUFFIX)
  private String ordersuffix;

  public static final String SERIALIZED_NAME_ERPORDERNUMBER = "erpordernumber";
  @SerializedName(SERIALIZED_NAME_ERPORDERNUMBER)
  private String erpordernumber;

  public static final String SERIALIZED_NAME_LINESTATUS = "linestatus";
  @SerializedName(SERIALIZED_NAME_LINESTATUS)
  private String linestatus;

  public static final String SERIALIZED_NAME_PARTNUMBER = "partnumber";
  @SerializedName(SERIALIZED_NAME_PARTNUMBER)
  private String partnumber;

  public static final String SERIALIZED_NAME_MANUFACTURERPARTNUMBER = "manufacturerpartnumber";
  @SerializedName(SERIALIZED_NAME_MANUFACTURERPARTNUMBER)
  private String manufacturerpartnumber;

  public static final String SERIALIZED_NAME_VENDORNAME = "vendorname";
  @SerializedName(SERIALIZED_NAME_VENDORNAME)
  private String vendorname;

  public static final String SERIALIZED_NAME_VENDORCODE = "vendorcode";
  @SerializedName(SERIALIZED_NAME_VENDORCODE)
  private String vendorcode;

  public static final String SERIALIZED_NAME_PARTDESCRIPTION1 = "partdescription1";
  @SerializedName(SERIALIZED_NAME_PARTDESCRIPTION1)
  private String partdescription1;

  public static final String SERIALIZED_NAME_PARTDESCRIPTION2 = "partdescription2";
  @SerializedName(SERIALIZED_NAME_PARTDESCRIPTION2)
  private String partdescription2;

  public static final String SERIALIZED_NAME_UNITWEIGHT = "unitweight";
  @SerializedName(SERIALIZED_NAME_UNITWEIGHT)
  private String unitweight;

  public static final String SERIALIZED_NAME_UNITPRICE = "unitprice";
  @SerializedName(SERIALIZED_NAME_UNITPRICE)
  private BigDecimal unitprice;

  public static final String SERIALIZED_NAME_EXTENDEDPRICE = "extendedprice";
  @SerializedName(SERIALIZED_NAME_EXTENDEDPRICE)
  private BigDecimal extendedprice;

  public static final String SERIALIZED_NAME_TAXAMOUNT = "taxamount";
  @SerializedName(SERIALIZED_NAME_TAXAMOUNT)
  private BigDecimal taxamount;

  public static final String SERIALIZED_NAME_REQUESTEDQUANTITY = "requestedquantity";
  @SerializedName(SERIALIZED_NAME_REQUESTEDQUANTITY)
  private String requestedquantity;

  public static final String SERIALIZED_NAME_CONFIRMEDQUANTITY = "confirmedquantity";
  @SerializedName(SERIALIZED_NAME_CONFIRMEDQUANTITY)
  private String confirmedquantity;

  public static final String SERIALIZED_NAME_BACKORDERQUANTITY = "backorderquantity";
  @SerializedName(SERIALIZED_NAME_BACKORDERQUANTITY)
  private String backorderquantity;

  public static final String SERIALIZED_NAME_SERIALNUMBERDETAILS = "serialnumberdetails";
  @SerializedName(SERIALIZED_NAME_SERIALNUMBERDETAILS)
  private List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner> serialnumberdetails;

  public static final String SERIALIZED_NAME_TRACKINGNUMBER = "trackingnumber";
  @SerializedName(SERIALIZED_NAME_TRACKINGNUMBER)
  private List<String> trackingnumber;

  public static final String SERIALIZED_NAME_SHIPMENTDETAILS = "shipmentdetails";
  @SerializedName(SERIALIZED_NAME_SHIPMENTDETAILS)
  private List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerShipmentdetailsInner> shipmentdetails;

  public static final String SERIALIZED_NAME_PRODUCTEXTENDEDSPECS = "productextendedspecs";
  @SerializedName(SERIALIZED_NAME_PRODUCTEXTENDEDSPECS)
  private List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> productextendedspecs;

  public static final String SERIALIZED_NAME_BACKORDERETADATE = "backorderetadate";
  @SerializedName(SERIALIZED_NAME_BACKORDERETADATE)
  private String backorderetadate;

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner() {
  }

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner linenumber(String linenumber) {
    this.linenumber = linenumber;
    return this;
  }

   /**
   * Impulse line number
   * @return linenumber
  **/
  @javax.annotation.Nullable
  public String getLinenumber() {
    return linenumber;
  }

  public void setLinenumber(String linenumber) {
    this.linenumber = linenumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner globallinenumber(String globallinenumber) {
    this.globallinenumber = globallinenumber;
    return this;
  }

   /**
   * Line of the Globel Sku / Customer Line Number
   * @return globallinenumber
  **/
  @javax.annotation.Nullable
  public String getGloballinenumber() {
    return globallinenumber;
  }

  public void setGloballinenumber(String globallinenumber) {
    this.globallinenumber = globallinenumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner ordersuffix(String ordersuffix) {
    this.ordersuffix = ordersuffix;
    return this;
  }

   /**
   * Order Suffix
   * @return ordersuffix
  **/
  @javax.annotation.Nullable
  public String getOrdersuffix() {
    return ordersuffix;
  }

  public void setOrdersuffix(String ordersuffix) {
    this.ordersuffix = ordersuffix;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner erpordernumber(String erpordernumber) {
    this.erpordernumber = erpordernumber;
    return this;
  }

   /**
   * Sales order number
   * @return erpordernumber
  **/
  @javax.annotation.Nullable
  public String getErpordernumber() {
    return erpordernumber;
  }

  public void setErpordernumber(String erpordernumber) {
    this.erpordernumber = erpordernumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner linestatus(String linestatus) {
    this.linestatus = linestatus;
    return this;
  }

   /**
   * Status of the line
   * @return linestatus
  **/
  @javax.annotation.Nullable
  public String getLinestatus() {
    return linestatus;
  }

  public void setLinestatus(String linestatus) {
    this.linestatus = linestatus;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner partnumber(String partnumber) {
    this.partnumber = partnumber;
    return this;
  }

   /**
   * Ingram part number
   * @return partnumber
  **/
  @javax.annotation.Nullable
  public String getPartnumber() {
    return partnumber;
  }

  public void setPartnumber(String partnumber) {
    this.partnumber = partnumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner manufacturerpartnumber(String manufacturerpartnumber) {
    this.manufacturerpartnumber = manufacturerpartnumber;
    return this;
  }

   /**
   * manufacture number of the product
   * @return manufacturerpartnumber
  **/
  @javax.annotation.Nullable
  public String getManufacturerpartnumber() {
    return manufacturerpartnumber;
  }

  public void setManufacturerpartnumber(String manufacturerpartnumber) {
    this.manufacturerpartnumber = manufacturerpartnumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner vendorname(String vendorname) {
    this.vendorname = vendorname;
    return this;
  }

   /**
   * name of the vendor
   * @return vendorname
  **/
  @javax.annotation.Nullable
  public String getVendorname() {
    return vendorname;
  }

  public void setVendorname(String vendorname) {
    this.vendorname = vendorname;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner vendorcode(String vendorcode) {
    this.vendorcode = vendorcode;
    return this;
  }

   /**
   * Ingram Micro assigned code for the vendor
   * @return vendorcode
  **/
  @javax.annotation.Nullable
  public String getVendorcode() {
    return vendorcode;
  }

  public void setVendorcode(String vendorcode) {
    this.vendorcode = vendorcode;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner partdescription1(String partdescription1) {
    this.partdescription1 = partdescription1;
    return this;
  }

   /**
   * Get partdescription1
   * @return partdescription1
  **/
  @javax.annotation.Nullable
  public String getPartdescription1() {
    return partdescription1;
  }

  public void setPartdescription1(String partdescription1) {
    this.partdescription1 = partdescription1;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner partdescription2(String partdescription2) {
    this.partdescription2 = partdescription2;
    return this;
  }

   /**
   * Get partdescription2
   * @return partdescription2
  **/
  @javax.annotation.Nullable
  public String getPartdescription2() {
    return partdescription2;
  }

  public void setPartdescription2(String partdescription2) {
    this.partdescription2 = partdescription2;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner unitweight(String unitweight) {
    this.unitweight = unitweight;
    return this;
  }

   /**
   * weight of the product unit
   * @return unitweight
  **/
  @javax.annotation.Nullable
  public String getUnitweight() {
    return unitweight;
  }

  public void setUnitweight(String unitweight) {
    this.unitweight = unitweight;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner unitprice(BigDecimal unitprice) {
    this.unitprice = unitprice;
    return this;
  }

   /**
   * Customer price of the unit
   * @return unitprice
  **/
  @javax.annotation.Nullable
  public BigDecimal getUnitprice() {
    return unitprice;
  }

  public void setUnitprice(BigDecimal unitprice) {
    this.unitprice = unitprice;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner extendedprice(BigDecimal extendedprice) {
    this.extendedprice = extendedprice;
    return this;
  }

   /**
   * extended price of the order
   * @return extendedprice
  **/
  @javax.annotation.Nullable
  public BigDecimal getExtendedprice() {
    return extendedprice;
  }

  public void setExtendedprice(BigDecimal extendedprice) {
    this.extendedprice = extendedprice;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner taxamount(BigDecimal taxamount) {
    this.taxamount = taxamount;
    return this;
  }

   /**
   * tax amount for the order
   * @return taxamount
  **/
  @javax.annotation.Nullable
  public BigDecimal getTaxamount() {
    return taxamount;
  }

  public void setTaxamount(BigDecimal taxamount) {
    this.taxamount = taxamount;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner requestedquantity(String requestedquantity) {
    this.requestedquantity = requestedquantity;
    return this;
  }

   /**
   * no. of units requested
   * @return requestedquantity
  **/
  @javax.annotation.Nullable
  public String getRequestedquantity() {
    return requestedquantity;
  }

  public void setRequestedquantity(String requestedquantity) {
    this.requestedquantity = requestedquantity;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner confirmedquantity(String confirmedquantity) {
    this.confirmedquantity = confirmedquantity;
    return this;
  }

   /**
   * no. of units confirmed available
   * @return confirmedquantity
  **/
  @javax.annotation.Nullable
  public String getConfirmedquantity() {
    return confirmedquantity;
  }

  public void setConfirmedquantity(String confirmedquantity) {
    this.confirmedquantity = confirmedquantity;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner backorderquantity(String backorderquantity) {
    this.backorderquantity = backorderquantity;
    return this;
  }

   /**
   * quantity of back order
   * @return backorderquantity
  **/
  @javax.annotation.Nullable
  public String getBackorderquantity() {
    return backorderquantity;
  }

  public void setBackorderquantity(String backorderquantity) {
    this.backorderquantity = backorderquantity;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner serialnumberdetails(List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner> serialnumberdetails) {
    this.serialnumberdetails = serialnumberdetails;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner addSerialnumberdetailsItem(OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner serialnumberdetailsItem) {
    if (this.serialnumberdetails == null) {
      this.serialnumberdetails = new ArrayList<>();
    }
    this.serialnumberdetails.add(serialnumberdetailsItem);
    return this;
  }

   /**
   * Get serialnumberdetails
   * @return serialnumberdetails
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner> getSerialnumberdetails() {
    return serialnumberdetails;
  }

  public void setSerialnumberdetails(List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner> serialnumberdetails) {
    this.serialnumberdetails = serialnumberdetails;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner trackingnumber(List<String> trackingnumber) {
    this.trackingnumber = trackingnumber;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner addTrackingnumberItem(String trackingnumberItem) {
    if (this.trackingnumber == null) {
      this.trackingnumber = new ArrayList<>();
    }
    this.trackingnumber.add(trackingnumberItem);
    return this;
  }

   /**
   * Get trackingnumber
   * @return trackingnumber
  **/
  @javax.annotation.Nullable
  public List<String> getTrackingnumber() {
    return trackingnumber;
  }

  public void setTrackingnumber(List<String> trackingnumber) {
    this.trackingnumber = trackingnumber;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner shipmentdetails(List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerShipmentdetailsInner> shipmentdetails) {
    this.shipmentdetails = shipmentdetails;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner addShipmentdetailsItem(OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerShipmentdetailsInner shipmentdetailsItem) {
    if (this.shipmentdetails == null) {
      this.shipmentdetails = new ArrayList<>();
    }
    this.shipmentdetails.add(shipmentdetailsItem);
    return this;
  }

   /**
   * Get shipmentdetails
   * @return shipmentdetails
  **/
  @javax.annotation.Nullable
  public List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerShipmentdetailsInner> getShipmentdetails() {
    return shipmentdetails;
  }

  public void setShipmentdetails(List<OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerShipmentdetailsInner> shipmentdetails) {
    this.shipmentdetails = shipmentdetails;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner productextendedspecs(List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> productextendedspecs) {
    this.productextendedspecs = productextendedspecs;
    return this;
  }

  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner addProductextendedspecsItem(InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner productextendedspecsItem) {
    if (this.productextendedspecs == null) {
      this.productextendedspecs = new ArrayList<>();
    }
    this.productextendedspecs.add(productextendedspecsItem);
    return this;
  }

   /**
   * Get productextendedspecs
   * @return productextendedspecs
  **/
  @javax.annotation.Nullable
  public List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> getProductextendedspecs() {
    return productextendedspecs;
  }

  public void setProductextendedspecs(List<InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner> productextendedspecs) {
    this.productextendedspecs = productextendedspecs;
  }


  public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner backorderetadate(String backorderetadate) {
    this.backorderetadate = backorderetadate;
    return this;
  }

   /**
   * estimated date of back order
   * @return backorderetadate
  **/
  @javax.annotation.Nullable
  public String getBackorderetadate() {
    return backorderetadate;
  }

  public void setBackorderetadate(String backorderetadate) {
    this.backorderetadate = backorderetadate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDetailResponseServiceresponseOrderdetailresponseLinesInner orderDetailResponseServiceresponseOrderdetailresponseLinesInner = (OrderDetailResponseServiceresponseOrderdetailresponseLinesInner) o;
    return Objects.equals(this.linenumber, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.linenumber) &&
        Objects.equals(this.globallinenumber, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.globallinenumber) &&
        Objects.equals(this.ordersuffix, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.ordersuffix) &&
        Objects.equals(this.erpordernumber, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.erpordernumber) &&
        Objects.equals(this.linestatus, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.linestatus) &&
        Objects.equals(this.partnumber, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.partnumber) &&
        Objects.equals(this.manufacturerpartnumber, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.manufacturerpartnumber) &&
        Objects.equals(this.vendorname, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.vendorname) &&
        Objects.equals(this.vendorcode, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.vendorcode) &&
        Objects.equals(this.partdescription1, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.partdescription1) &&
        Objects.equals(this.partdescription2, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.partdescription2) &&
        Objects.equals(this.unitweight, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.unitweight) &&
        Objects.equals(this.unitprice, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.unitprice) &&
        Objects.equals(this.extendedprice, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.extendedprice) &&
        Objects.equals(this.taxamount, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.taxamount) &&
        Objects.equals(this.requestedquantity, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.requestedquantity) &&
        Objects.equals(this.confirmedquantity, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.confirmedquantity) &&
        Objects.equals(this.backorderquantity, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.backorderquantity) &&
        Objects.equals(this.serialnumberdetails, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.serialnumberdetails) &&
        Objects.equals(this.trackingnumber, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.trackingnumber) &&
        Objects.equals(this.shipmentdetails, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.shipmentdetails) &&
        Objects.equals(this.productextendedspecs, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.productextendedspecs) &&
        Objects.equals(this.backorderetadate, orderDetailResponseServiceresponseOrderdetailresponseLinesInner.backorderetadate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linenumber, globallinenumber, ordersuffix, erpordernumber, linestatus, partnumber, manufacturerpartnumber, vendorname, vendorcode, partdescription1, partdescription2, unitweight, unitprice, extendedprice, taxamount, requestedquantity, confirmedquantity, backorderquantity, serialnumberdetails, trackingnumber, shipmentdetails, productextendedspecs, backorderetadate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDetailResponseServiceresponseOrderdetailresponseLinesInner {\n");
    sb.append("    linenumber: ").append(toIndentedString(linenumber)).append("\n");
    sb.append("    globallinenumber: ").append(toIndentedString(globallinenumber)).append("\n");
    sb.append("    ordersuffix: ").append(toIndentedString(ordersuffix)).append("\n");
    sb.append("    erpordernumber: ").append(toIndentedString(erpordernumber)).append("\n");
    sb.append("    linestatus: ").append(toIndentedString(linestatus)).append("\n");
    sb.append("    partnumber: ").append(toIndentedString(partnumber)).append("\n");
    sb.append("    manufacturerpartnumber: ").append(toIndentedString(manufacturerpartnumber)).append("\n");
    sb.append("    vendorname: ").append(toIndentedString(vendorname)).append("\n");
    sb.append("    vendorcode: ").append(toIndentedString(vendorcode)).append("\n");
    sb.append("    partdescription1: ").append(toIndentedString(partdescription1)).append("\n");
    sb.append("    partdescription2: ").append(toIndentedString(partdescription2)).append("\n");
    sb.append("    unitweight: ").append(toIndentedString(unitweight)).append("\n");
    sb.append("    unitprice: ").append(toIndentedString(unitprice)).append("\n");
    sb.append("    extendedprice: ").append(toIndentedString(extendedprice)).append("\n");
    sb.append("    taxamount: ").append(toIndentedString(taxamount)).append("\n");
    sb.append("    requestedquantity: ").append(toIndentedString(requestedquantity)).append("\n");
    sb.append("    confirmedquantity: ").append(toIndentedString(confirmedquantity)).append("\n");
    sb.append("    backorderquantity: ").append(toIndentedString(backorderquantity)).append("\n");
    sb.append("    serialnumberdetails: ").append(toIndentedString(serialnumberdetails)).append("\n");
    sb.append("    trackingnumber: ").append(toIndentedString(trackingnumber)).append("\n");
    sb.append("    shipmentdetails: ").append(toIndentedString(shipmentdetails)).append("\n");
    sb.append("    productextendedspecs: ").append(toIndentedString(productextendedspecs)).append("\n");
    sb.append("    backorderetadate: ").append(toIndentedString(backorderetadate)).append("\n");
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
    openapiFields.add("linenumber");
    openapiFields.add("globallinenumber");
    openapiFields.add("ordersuffix");
    openapiFields.add("erpordernumber");
    openapiFields.add("linestatus");
    openapiFields.add("partnumber");
    openapiFields.add("manufacturerpartnumber");
    openapiFields.add("vendorname");
    openapiFields.add("vendorcode");
    openapiFields.add("partdescription1");
    openapiFields.add("partdescription2");
    openapiFields.add("unitweight");
    openapiFields.add("unitprice");
    openapiFields.add("extendedprice");
    openapiFields.add("taxamount");
    openapiFields.add("requestedquantity");
    openapiFields.add("confirmedquantity");
    openapiFields.add("backorderquantity");
    openapiFields.add("serialnumberdetails");
    openapiFields.add("trackingnumber");
    openapiFields.add("shipmentdetails");
    openapiFields.add("productextendedspecs");
    openapiFields.add("backorderetadate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OrderDetailResponseServiceresponseOrderdetailresponseLinesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderDetailResponseServiceresponseOrderdetailresponseLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderDetailResponseServiceresponseOrderdetailresponseLinesInner is not found in the empty JSON string", OrderDetailResponseServiceresponseOrderdetailresponseLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderDetailResponseServiceresponseOrderdetailresponseLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderDetailResponseServiceresponseOrderdetailresponseLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("linenumber") != null && !jsonObj.get("linenumber").isJsonNull()) && !jsonObj.get("linenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linenumber").toString()));
      }
      if ((jsonObj.get("globallinenumber") != null && !jsonObj.get("globallinenumber").isJsonNull()) && !jsonObj.get("globallinenumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globallinenumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globallinenumber").toString()));
      }
      if ((jsonObj.get("ordersuffix") != null && !jsonObj.get("ordersuffix").isJsonNull()) && !jsonObj.get("ordersuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ordersuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ordersuffix").toString()));
      }
      if ((jsonObj.get("erpordernumber") != null && !jsonObj.get("erpordernumber").isJsonNull()) && !jsonObj.get("erpordernumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `erpordernumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("erpordernumber").toString()));
      }
      if ((jsonObj.get("linestatus") != null && !jsonObj.get("linestatus").isJsonNull()) && !jsonObj.get("linestatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linestatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linestatus").toString()));
      }
      if ((jsonObj.get("partnumber") != null && !jsonObj.get("partnumber").isJsonNull()) && !jsonObj.get("partnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnumber").toString()));
      }
      if ((jsonObj.get("manufacturerpartnumber") != null && !jsonObj.get("manufacturerpartnumber").isJsonNull()) && !jsonObj.get("manufacturerpartnumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `manufacturerpartnumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("manufacturerpartnumber").toString()));
      }
      if ((jsonObj.get("vendorname") != null && !jsonObj.get("vendorname").isJsonNull()) && !jsonObj.get("vendorname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorname").toString()));
      }
      if ((jsonObj.get("vendorcode") != null && !jsonObj.get("vendorcode").isJsonNull()) && !jsonObj.get("vendorcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorcode").toString()));
      }
      if ((jsonObj.get("partdescription1") != null && !jsonObj.get("partdescription1").isJsonNull()) && !jsonObj.get("partdescription1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partdescription1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partdescription1").toString()));
      }
      if ((jsonObj.get("partdescription2") != null && !jsonObj.get("partdescription2").isJsonNull()) && !jsonObj.get("partdescription2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partdescription2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partdescription2").toString()));
      }
      if ((jsonObj.get("unitweight") != null && !jsonObj.get("unitweight").isJsonNull()) && !jsonObj.get("unitweight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unitweight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unitweight").toString()));
      }
      if ((jsonObj.get("requestedquantity") != null && !jsonObj.get("requestedquantity").isJsonNull()) && !jsonObj.get("requestedquantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestedquantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestedquantity").toString()));
      }
      if ((jsonObj.get("confirmedquantity") != null && !jsonObj.get("confirmedquantity").isJsonNull()) && !jsonObj.get("confirmedquantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmedquantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmedquantity").toString()));
      }
      if ((jsonObj.get("backorderquantity") != null && !jsonObj.get("backorderquantity").isJsonNull()) && !jsonObj.get("backorderquantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backorderquantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backorderquantity").toString()));
      }
      if (jsonObj.get("serialnumberdetails") != null && !jsonObj.get("serialnumberdetails").isJsonNull()) {
        JsonArray jsonArrayserialnumberdetails = jsonObj.getAsJsonArray("serialnumberdetails");
        if (jsonArrayserialnumberdetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("serialnumberdetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `serialnumberdetails` to be an array in the JSON string but got `%s`", jsonObj.get("serialnumberdetails").toString()));
          }

          // validate the optional field `serialnumberdetails` (array)
          for (int i = 0; i < jsonArrayserialnumberdetails.size(); i++) {
            OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerSerialnumberdetailsInner.validateJsonElement(jsonArrayserialnumberdetails.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("trackingnumber") != null && !jsonObj.get("trackingnumber").isJsonNull() && !jsonObj.get("trackingnumber").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `trackingnumber` to be an array in the JSON string but got `%s`", jsonObj.get("trackingnumber").toString()));
      }
      if (jsonObj.get("shipmentdetails") != null && !jsonObj.get("shipmentdetails").isJsonNull()) {
        JsonArray jsonArrayshipmentdetails = jsonObj.getAsJsonArray("shipmentdetails");
        if (jsonArrayshipmentdetails != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shipmentdetails").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shipmentdetails` to be an array in the JSON string but got `%s`", jsonObj.get("shipmentdetails").toString()));
          }

          // validate the optional field `shipmentdetails` (array)
          for (int i = 0; i < jsonArrayshipmentdetails.size(); i++) {
            OrderDetailResponseServiceresponseOrderdetailresponseLinesInnerShipmentdetailsInner.validateJsonElement(jsonArrayshipmentdetails.get(i));
          };
        }
      }
      if (jsonObj.get("productextendedspecs") != null && !jsonObj.get("productextendedspecs").isJsonNull()) {
        JsonArray jsonArrayproductextendedspecs = jsonObj.getAsJsonArray("productextendedspecs");
        if (jsonArrayproductextendedspecs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("productextendedspecs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `productextendedspecs` to be an array in the JSON string but got `%s`", jsonObj.get("productextendedspecs").toString()));
          }

          // validate the optional field `productextendedspecs` (array)
          for (int i = 0; i < jsonArrayproductextendedspecs.size(); i++) {
            InvoiceDetailResponseServiceresponseInvoicedetailresponseExtendedspecsInner.validateJsonElement(jsonArrayproductextendedspecs.get(i));
          };
        }
      }
      if ((jsonObj.get("backorderetadate") != null && !jsonObj.get("backorderetadate").isJsonNull()) && !jsonObj.get("backorderetadate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `backorderetadate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("backorderetadate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderDetailResponseServiceresponseOrderdetailresponseLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderDetailResponseServiceresponseOrderdetailresponseLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderDetailResponseServiceresponseOrderdetailresponseLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderDetailResponseServiceresponseOrderdetailresponseLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderDetailResponseServiceresponseOrderdetailresponseLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderDetailResponseServiceresponseOrderdetailresponseLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderDetailResponseServiceresponseOrderdetailresponseLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderDetailResponseServiceresponseOrderdetailresponseLinesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderDetailResponseServiceresponseOrderdetailresponseLinesInner
  * @throws IOException if the JSON string is invalid with respect to OrderDetailResponseServiceresponseOrderdetailresponseLinesInner
  */
  public static OrderDetailResponseServiceresponseOrderdetailresponseLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderDetailResponseServiceresponseOrderdetailresponseLinesInner.class);
  }

 /**
  * Convert an instance of OrderDetailResponseServiceresponseOrderdetailresponseLinesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

