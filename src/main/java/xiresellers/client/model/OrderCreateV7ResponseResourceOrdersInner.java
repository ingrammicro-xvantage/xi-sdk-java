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
import xiresellers.client.model.OrderCreateResponseOrdersInnerLinksInner;
import xiresellers.client.model.OrderCreateV7ResponseResourceOrdersInnerLinesInner;

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
 * OrderCreateV7ResponseResourceOrdersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-29T04:46:41.573902Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderCreateV7ResponseResourceOrdersInner {
  public static final String SERIALIZED_NAME_NUMBER_OF_LINES_WITH_SUCCESS = "numberOfLinesWithSuccess";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_LINES_WITH_SUCCESS)
  private Integer numberOfLinesWithSuccess;

  public static final String SERIALIZED_NAME_NUMBER_OF_LINES_WITH_ERROR = "numberOfLinesWithError";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_LINES_WITH_ERROR)
  private Integer numberOfLinesWithError;

  public static final String SERIALIZED_NAME_NUMBER_OF_LINES_WITH_WARNING = "numberOfLinesWithWarning";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_LINES_WITH_WARNING)
  private Integer numberOfLinesWithWarning;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_NUMBER = "ingramOrderNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_NUMBER)
  private String ingramOrderNumber;

  public static final String SERIALIZED_NAME_INGRAM_ORDER_DATE = "ingramOrderDate";
  @SerializedName(SERIALIZED_NAME_INGRAM_ORDER_DATE)
  private String ingramOrderDate;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_ORDER_TYPE = "orderType";
  @SerializedName(SERIALIZED_NAME_ORDER_TYPE)
  private String orderType;

  public static final String SERIALIZED_NAME_ORDER_TOTAL = "orderTotal";
  @SerializedName(SERIALIZED_NAME_ORDER_TOTAL)
  private BigDecimal orderTotal;

  public static final String SERIALIZED_NAME_FREIGHT_CHARGES = "freightCharges";
  @SerializedName(SERIALIZED_NAME_FREIGHT_CHARGES)
  private BigDecimal freightCharges;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "totalTax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  private BigDecimal totalTax;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<OrderCreateV7ResponseResourceOrdersInnerLinesInner> lines = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<OrderCreateResponseOrdersInnerLinksInner> links = new ArrayList<>();

  public OrderCreateV7ResponseResourceOrdersInner() {
  }

  public OrderCreateV7ResponseResourceOrdersInner numberOfLinesWithSuccess(Integer numberOfLinesWithSuccess) {
    this.numberOfLinesWithSuccess = numberOfLinesWithSuccess;
    return this;
  }

  /**
   * The number of lines in the order that were successful.
   * @return numberOfLinesWithSuccess
   */
  @javax.annotation.Nullable
  public Integer getNumberOfLinesWithSuccess() {
    return numberOfLinesWithSuccess;
  }

  public void setNumberOfLinesWithSuccess(Integer numberOfLinesWithSuccess) {
    this.numberOfLinesWithSuccess = numberOfLinesWithSuccess;
  }


  public OrderCreateV7ResponseResourceOrdersInner numberOfLinesWithError(Integer numberOfLinesWithError) {
    this.numberOfLinesWithError = numberOfLinesWithError;
    return this;
  }

  /**
   * The number of lines in the order that have errors.
   * @return numberOfLinesWithError
   */
  @javax.annotation.Nullable
  public Integer getNumberOfLinesWithError() {
    return numberOfLinesWithError;
  }

  public void setNumberOfLinesWithError(Integer numberOfLinesWithError) {
    this.numberOfLinesWithError = numberOfLinesWithError;
  }


  public OrderCreateV7ResponseResourceOrdersInner numberOfLinesWithWarning(Integer numberOfLinesWithWarning) {
    this.numberOfLinesWithWarning = numberOfLinesWithWarning;
    return this;
  }

  /**
   * The number of lines in the order that have a warning.
   * @return numberOfLinesWithWarning
   */
  @javax.annotation.Nullable
  public Integer getNumberOfLinesWithWarning() {
    return numberOfLinesWithWarning;
  }

  public void setNumberOfLinesWithWarning(Integer numberOfLinesWithWarning) {
    this.numberOfLinesWithWarning = numberOfLinesWithWarning;
  }


  public OrderCreateV7ResponseResourceOrdersInner ingramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
    return this;
  }

  /**
   * The Ingram Micro order number.
   * @return ingramOrderNumber
   */
  @javax.annotation.Nullable
  public String getIngramOrderNumber() {
    return ingramOrderNumber;
  }

  public void setIngramOrderNumber(String ingramOrderNumber) {
    this.ingramOrderNumber = ingramOrderNumber;
  }


  public OrderCreateV7ResponseResourceOrdersInner ingramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
    return this;
  }

  /**
   * The date in UTC format that the order was created in Ingram Micro&#39;s system.
   * @return ingramOrderDate
   */
  @javax.annotation.Nullable
  public String getIngramOrderDate() {
    return ingramOrderDate;
  }

  public void setIngramOrderDate(String ingramOrderDate) {
    this.ingramOrderDate = ingramOrderDate;
  }


  public OrderCreateV7ResponseResourceOrdersInner notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Order-level notes.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public OrderCreateV7ResponseResourceOrdersInner orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

  /**
   * The order typer. One of: S&#x3D;Stocked PO D&#x3D;Direct Ship PO
   * @return orderType
   */
  @javax.annotation.Nullable
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }


  public OrderCreateV7ResponseResourceOrdersInner orderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
    return this;
  }

  /**
   * The total price for the order.
   * @return orderTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(BigDecimal orderTotal) {
    this.orderTotal = orderTotal;
  }


  public OrderCreateV7ResponseResourceOrdersInner freightCharges(BigDecimal freightCharges) {
    this.freightCharges = freightCharges;
    return this;
  }

  /**
   * The total freight charges for the order.
   * @return freightCharges
   */
  @javax.annotation.Nullable
  public BigDecimal getFreightCharges() {
    return freightCharges;
  }

  public void setFreightCharges(BigDecimal freightCharges) {
    this.freightCharges = freightCharges;
  }


  public OrderCreateV7ResponseResourceOrdersInner totalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
    return this;
  }

  /**
   * The total tax for the order.
   * @return totalTax
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(BigDecimal totalTax) {
    this.totalTax = totalTax;
  }


  public OrderCreateV7ResponseResourceOrdersInner currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The country-specific three character ISO 4217 currency code used for the order.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public OrderCreateV7ResponseResourceOrdersInner lines(List<OrderCreateV7ResponseResourceOrdersInnerLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public OrderCreateV7ResponseResourceOrdersInner addLinesItem(OrderCreateV7ResponseResourceOrdersInnerLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * The line-level details for the order.
   * @return lines
   */
  @javax.annotation.Nullable
  public List<OrderCreateV7ResponseResourceOrdersInnerLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<OrderCreateV7ResponseResourceOrdersInnerLinesInner> lines) {
    this.lines = lines;
  }


  public OrderCreateV7ResponseResourceOrdersInner links(List<OrderCreateResponseOrdersInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public OrderCreateV7ResponseResourceOrdersInner addLinksItem(OrderCreateResponseOrdersInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Link to Order Details for the order(s).
   * @return links
   */
  @javax.annotation.Nullable
  public List<OrderCreateResponseOrdersInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(List<OrderCreateResponseOrdersInnerLinksInner> links) {
    this.links = links;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderCreateV7ResponseResourceOrdersInner orderCreateV7ResponseResourceOrdersInner = (OrderCreateV7ResponseResourceOrdersInner) o;
    return Objects.equals(this.numberOfLinesWithSuccess, orderCreateV7ResponseResourceOrdersInner.numberOfLinesWithSuccess) &&
        Objects.equals(this.numberOfLinesWithError, orderCreateV7ResponseResourceOrdersInner.numberOfLinesWithError) &&
        Objects.equals(this.numberOfLinesWithWarning, orderCreateV7ResponseResourceOrdersInner.numberOfLinesWithWarning) &&
        Objects.equals(this.ingramOrderNumber, orderCreateV7ResponseResourceOrdersInner.ingramOrderNumber) &&
        Objects.equals(this.ingramOrderDate, orderCreateV7ResponseResourceOrdersInner.ingramOrderDate) &&
        Objects.equals(this.notes, orderCreateV7ResponseResourceOrdersInner.notes) &&
        Objects.equals(this.orderType, orderCreateV7ResponseResourceOrdersInner.orderType) &&
        Objects.equals(this.orderTotal, orderCreateV7ResponseResourceOrdersInner.orderTotal) &&
        Objects.equals(this.freightCharges, orderCreateV7ResponseResourceOrdersInner.freightCharges) &&
        Objects.equals(this.totalTax, orderCreateV7ResponseResourceOrdersInner.totalTax) &&
        Objects.equals(this.currencyCode, orderCreateV7ResponseResourceOrdersInner.currencyCode) &&
        Objects.equals(this.lines, orderCreateV7ResponseResourceOrdersInner.lines) &&
        Objects.equals(this.links, orderCreateV7ResponseResourceOrdersInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfLinesWithSuccess, numberOfLinesWithError, numberOfLinesWithWarning, ingramOrderNumber, ingramOrderDate, notes, orderType, orderTotal, freightCharges, totalTax, currencyCode, lines, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderCreateV7ResponseResourceOrdersInner {\n");
    sb.append("    numberOfLinesWithSuccess: ").append(toIndentedString(numberOfLinesWithSuccess)).append("\n");
    sb.append("    numberOfLinesWithError: ").append(toIndentedString(numberOfLinesWithError)).append("\n");
    sb.append("    numberOfLinesWithWarning: ").append(toIndentedString(numberOfLinesWithWarning)).append("\n");
    sb.append("    ingramOrderNumber: ").append(toIndentedString(ingramOrderNumber)).append("\n");
    sb.append("    ingramOrderDate: ").append(toIndentedString(ingramOrderDate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    orderTotal: ").append(toIndentedString(orderTotal)).append("\n");
    sb.append("    freightCharges: ").append(toIndentedString(freightCharges)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
    openapiFields.add("numberOfLinesWithSuccess");
    openapiFields.add("numberOfLinesWithError");
    openapiFields.add("numberOfLinesWithWarning");
    openapiFields.add("ingramOrderNumber");
    openapiFields.add("ingramOrderDate");
    openapiFields.add("notes");
    openapiFields.add("orderType");
    openapiFields.add("orderTotal");
    openapiFields.add("freightCharges");
    openapiFields.add("totalTax");
    openapiFields.add("currencyCode");
    openapiFields.add("lines");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderCreateV7ResponseResourceOrdersInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderCreateV7ResponseResourceOrdersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderCreateV7ResponseResourceOrdersInner is not found in the empty JSON string", OrderCreateV7ResponseResourceOrdersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderCreateV7ResponseResourceOrdersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderCreateV7ResponseResourceOrdersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramOrderNumber") != null && !jsonObj.get("ingramOrderNumber").isJsonNull()) && !jsonObj.get("ingramOrderNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderNumber").toString()));
      }
      if ((jsonObj.get("ingramOrderDate") != null && !jsonObj.get("ingramOrderDate").isJsonNull()) && !jsonObj.get("ingramOrderDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramOrderDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramOrderDate").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
      if ((jsonObj.get("orderType") != null && !jsonObj.get("orderType").isJsonNull()) && !jsonObj.get("orderType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderType").toString()));
      }
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
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
            OrderCreateV7ResponseResourceOrdersInnerLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            OrderCreateResponseOrdersInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderCreateV7ResponseResourceOrdersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderCreateV7ResponseResourceOrdersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderCreateV7ResponseResourceOrdersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderCreateV7ResponseResourceOrdersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderCreateV7ResponseResourceOrdersInner>() {
           @Override
           public void write(JsonWriter out, OrderCreateV7ResponseResourceOrdersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderCreateV7ResponseResourceOrdersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderCreateV7ResponseResourceOrdersInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderCreateV7ResponseResourceOrdersInner
   * @throws IOException if the JSON string is invalid with respect to OrderCreateV7ResponseResourceOrdersInner
   */
  public static OrderCreateV7ResponseResourceOrdersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderCreateV7ResponseResourceOrdersInner.class);
  }

  /**
   * Convert an instance of OrderCreateV7ResponseResourceOrdersInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

