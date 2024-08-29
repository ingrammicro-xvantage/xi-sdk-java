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
import xiresellers.client.model.FreightResponseFreightEstimateResponseDistributionInner;
import xiresellers.client.model.FreightResponseFreightEstimateResponseLinesInner;

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
 * FreightResponseFreightEstimateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-29T17:32:11.198732Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FreightResponseFreightEstimateResponse {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_TOTAL_FREIGHT_AMOUNT = "totalFreightAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_FREIGHT_AMOUNT)
  private BigDecimal totalFreightAmount;

  public static final String SERIALIZED_NAME_TOTAL_TAX_AMOUNT = "totalTaxAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX_AMOUNT)
  private BigDecimal totalTaxAmount;

  public static final String SERIALIZED_NAME_TOTAL_FEES = "totalFees";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEES)
  private BigDecimal totalFees;

  public static final String SERIALIZED_NAME_TOTAL_NET_AMOUNT = "totalNetAmount";
  @SerializedName(SERIALIZED_NAME_TOTAL_NET_AMOUNT)
  private BigDecimal totalNetAmount;

  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "grossAmount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private BigDecimal grossAmount;

  public static final String SERIALIZED_NAME_DISTRIBUTION = "distribution";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION)
  private List<FreightResponseFreightEstimateResponseDistributionInner> distribution = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<FreightResponseFreightEstimateResponseLinesInner> lines = new ArrayList<>();

  public FreightResponseFreightEstimateResponse() {
  }

  public FreightResponseFreightEstimateResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The country-specific three-character ISO 4217 currency code used for the order.
   * @return currencyCode
   */
  @javax.annotation.Nullable
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public FreightResponseFreightEstimateResponse totalFreightAmount(BigDecimal totalFreightAmount) {
    this.totalFreightAmount = totalFreightAmount;
    return this;
  }

  /**
   * Total freight amount.
   * @return totalFreightAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalFreightAmount() {
    return totalFreightAmount;
  }

  public void setTotalFreightAmount(BigDecimal totalFreightAmount) {
    this.totalFreightAmount = totalFreightAmount;
  }


  public FreightResponseFreightEstimateResponse totalTaxAmount(BigDecimal totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
    return this;
  }

  /**
   * Total tax amount.
   * @return totalTaxAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalTaxAmount() {
    return totalTaxAmount;
  }

  public void setTotalTaxAmount(BigDecimal totalTaxAmount) {
    this.totalTaxAmount = totalTaxAmount;
  }


  public FreightResponseFreightEstimateResponse totalFees(BigDecimal totalFees) {
    this.totalFees = totalFees;
    return this;
  }

  /**
   * Total fees.
   * @return totalFees
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalFees() {
    return totalFees;
  }

  public void setTotalFees(BigDecimal totalFees) {
    this.totalFees = totalFees;
  }


  public FreightResponseFreightEstimateResponse totalNetAmount(BigDecimal totalNetAmount) {
    this.totalNetAmount = totalNetAmount;
    return this;
  }

  /**
   * Total net amount.
   * @return totalNetAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getTotalNetAmount() {
    return totalNetAmount;
  }

  public void setTotalNetAmount(BigDecimal totalNetAmount) {
    this.totalNetAmount = totalNetAmount;
  }


  public FreightResponseFreightEstimateResponse grossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
    return this;
  }

  /**
   * Gross amount.
   * @return grossAmount
   */
  @javax.annotation.Nullable
  public BigDecimal getGrossAmount() {
    return grossAmount;
  }

  public void setGrossAmount(BigDecimal grossAmount) {
    this.grossAmount = grossAmount;
  }


  public FreightResponseFreightEstimateResponse distribution(List<FreightResponseFreightEstimateResponseDistributionInner> distribution) {
    this.distribution = distribution;
    return this;
  }

  public FreightResponseFreightEstimateResponse addDistributionItem(FreightResponseFreightEstimateResponseDistributionInner distributionItem) {
    if (this.distribution == null) {
      this.distribution = new ArrayList<>();
    }
    this.distribution.add(distributionItem);
    return this;
  }

  /**
   * Get distribution
   * @return distribution
   */
  @javax.annotation.Nullable
  public List<FreightResponseFreightEstimateResponseDistributionInner> getDistribution() {
    return distribution;
  }

  public void setDistribution(List<FreightResponseFreightEstimateResponseDistributionInner> distribution) {
    this.distribution = distribution;
  }


  public FreightResponseFreightEstimateResponse lines(List<FreightResponseFreightEstimateResponseLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public FreightResponseFreightEstimateResponse addLinesItem(FreightResponseFreightEstimateResponseLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * Get lines
   * @return lines
   */
  @javax.annotation.Nullable
  public List<FreightResponseFreightEstimateResponseLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<FreightResponseFreightEstimateResponseLinesInner> lines) {
    this.lines = lines;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreightResponseFreightEstimateResponse freightResponseFreightEstimateResponse = (FreightResponseFreightEstimateResponse) o;
    return Objects.equals(this.currencyCode, freightResponseFreightEstimateResponse.currencyCode) &&
        Objects.equals(this.totalFreightAmount, freightResponseFreightEstimateResponse.totalFreightAmount) &&
        Objects.equals(this.totalTaxAmount, freightResponseFreightEstimateResponse.totalTaxAmount) &&
        Objects.equals(this.totalFees, freightResponseFreightEstimateResponse.totalFees) &&
        Objects.equals(this.totalNetAmount, freightResponseFreightEstimateResponse.totalNetAmount) &&
        Objects.equals(this.grossAmount, freightResponseFreightEstimateResponse.grossAmount) &&
        Objects.equals(this.distribution, freightResponseFreightEstimateResponse.distribution) &&
        Objects.equals(this.lines, freightResponseFreightEstimateResponse.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, totalFreightAmount, totalTaxAmount, totalFees, totalNetAmount, grossAmount, distribution, lines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreightResponseFreightEstimateResponse {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    totalFreightAmount: ").append(toIndentedString(totalFreightAmount)).append("\n");
    sb.append("    totalTaxAmount: ").append(toIndentedString(totalTaxAmount)).append("\n");
    sb.append("    totalFees: ").append(toIndentedString(totalFees)).append("\n");
    sb.append("    totalNetAmount: ").append(toIndentedString(totalNetAmount)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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
    openapiFields.add("currencyCode");
    openapiFields.add("totalFreightAmount");
    openapiFields.add("totalTaxAmount");
    openapiFields.add("totalFees");
    openapiFields.add("totalNetAmount");
    openapiFields.add("grossAmount");
    openapiFields.add("distribution");
    openapiFields.add("lines");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FreightResponseFreightEstimateResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FreightResponseFreightEstimateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FreightResponseFreightEstimateResponse is not found in the empty JSON string", FreightResponseFreightEstimateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FreightResponseFreightEstimateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FreightResponseFreightEstimateResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("currencyCode") != null && !jsonObj.get("currencyCode").isJsonNull()) && !jsonObj.get("currencyCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencyCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencyCode").toString()));
      }
      if (jsonObj.get("distribution") != null && !jsonObj.get("distribution").isJsonNull()) {
        JsonArray jsonArraydistribution = jsonObj.getAsJsonArray("distribution");
        if (jsonArraydistribution != null) {
          // ensure the json data is an array
          if (!jsonObj.get("distribution").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `distribution` to be an array in the JSON string but got `%s`", jsonObj.get("distribution").toString()));
          }

          // validate the optional field `distribution` (array)
          for (int i = 0; i < jsonArraydistribution.size(); i++) {
            FreightResponseFreightEstimateResponseDistributionInner.validateJsonElement(jsonArraydistribution.get(i));
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
            FreightResponseFreightEstimateResponseLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FreightResponseFreightEstimateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FreightResponseFreightEstimateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FreightResponseFreightEstimateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FreightResponseFreightEstimateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<FreightResponseFreightEstimateResponse>() {
           @Override
           public void write(JsonWriter out, FreightResponseFreightEstimateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FreightResponseFreightEstimateResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FreightResponseFreightEstimateResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FreightResponseFreightEstimateResponse
   * @throws IOException if the JSON string is invalid with respect to FreightResponseFreightEstimateResponse
   */
  public static FreightResponseFreightEstimateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FreightResponseFreightEstimateResponse.class);
  }

  /**
   * Convert an instance of FreightResponseFreightEstimateResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

