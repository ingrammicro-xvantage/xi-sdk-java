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
import xiresellers.client.model.ReturnsDetailsResponseProductsInner;

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
 * ReturnsDetailsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-07T09:47:59.759396Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ReturnsDetailsResponse {
  public static final String SERIALIZED_NAME_TYPE_OF_DETAILS = "typeOfDetails";
  @SerializedName(SERIALIZED_NAME_TYPE_OF_DETAILS)
  private String typeOfDetails;

  public static final String SERIALIZED_NAME_RMA_CLAIM_ID = "rmaClaimId";
  @SerializedName(SERIALIZED_NAME_RMA_CLAIM_ID)
  private String rmaClaimId;

  public static final String SERIALIZED_NAME_CASE_REQUEST_NUMBER = "caseRequestNumber";
  @SerializedName(SERIALIZED_NAME_CASE_REQUEST_NUMBER)
  private String caseRequestNumber;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private String createdOn;

  public static final String SERIALIZED_NAME_RETURN_REASON = "returnReason";
  @SerializedName(SERIALIZED_NAME_RETURN_REASON)
  private String returnReason;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_RETURN_WAREHOUSE_ADDRESS = "returnWarehouseAddress";
  @SerializedName(SERIALIZED_NAME_RETURN_WAREHOUSE_ADDRESS)
  private String returnWarehouseAddress;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<ReturnsDetailsResponseProductsInner> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUB_TOTAL = "subTotal";
  @SerializedName(SERIALIZED_NAME_SUB_TOTAL)
  private BigDecimal subTotal;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private BigDecimal tax;

  public static final String SERIALIZED_NAME_ADDITIONAL_FEES = "additionalFees";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_FEES)
  private BigDecimal additionalFees;

  public static final String SERIALIZED_NAME_ESTIMATED_TOTAL = "estimatedTotal";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_TOTAL)
  private BigDecimal estimatedTotal;

  public ReturnsDetailsResponse() {
  }

  public ReturnsDetailsResponse typeOfDetails(String typeOfDetails) {
    this.typeOfDetails = typeOfDetails;
    return this;
  }

  /**
   * The type of the details. Return or Claim.
   * @return typeOfDetails
   */
  @javax.annotation.Nullable
  public String getTypeOfDetails() {
    return typeOfDetails;
  }

  public void setTypeOfDetails(String typeOfDetails) {
    this.typeOfDetails = typeOfDetails;
  }


  public ReturnsDetailsResponse rmaClaimId(String rmaClaimId) {
    this.rmaClaimId = rmaClaimId;
    return this;
  }

  /**
   * The rmaClaimId claim id.
   * @return rmaClaimId
   */
  @javax.annotation.Nullable
  public String getRmaClaimId() {
    return rmaClaimId;
  }

  public void setRmaClaimId(String rmaClaimId) {
    this.rmaClaimId = rmaClaimId;
  }


  public ReturnsDetailsResponse caseRequestNumber(String caseRequestNumber) {
    this.caseRequestNumber = caseRequestNumber;
    return this;
  }

  /**
   * A unique return request number.
   * @return caseRequestNumber
   */
  @javax.annotation.Nullable
  public String getCaseRequestNumber() {
    return caseRequestNumber;
  }

  public void setCaseRequestNumber(String caseRequestNumber) {
    this.caseRequestNumber = caseRequestNumber;
  }


  public ReturnsDetailsResponse createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date on which the return request was created.
   * @return createdOn
   */
  @javax.annotation.Nullable
  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  public ReturnsDetailsResponse returnReason(String returnReason) {
    this.returnReason = returnReason;
    return this;
  }

  /**
   * The reason for the return.
   * @return returnReason
   */
  @javax.annotation.Nullable
  public String getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(String returnReason) {
    this.returnReason = returnReason;
  }


  public ReturnsDetailsResponse referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

  /**
   * The reference number for the return.
   * @return referenceNumber
   */
  @javax.annotation.Nullable
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public ReturnsDetailsResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the request.
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ReturnsDetailsResponse returnWarehouseAddress(String returnWarehouseAddress) {
    this.returnWarehouseAddress = returnWarehouseAddress;
    return this;
  }

  /**
   * The address of the return warehouse.
   * @return returnWarehouseAddress
   */
  @javax.annotation.Nullable
  public String getReturnWarehouseAddress() {
    return returnWarehouseAddress;
  }

  public void setReturnWarehouseAddress(String returnWarehouseAddress) {
    this.returnWarehouseAddress = returnWarehouseAddress;
  }


  public ReturnsDetailsResponse products(List<ReturnsDetailsResponseProductsInner> products) {
    this.products = products;
    return this;
  }

  public ReturnsDetailsResponse addProductsItem(ReturnsDetailsResponseProductsInner productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
   */
  @javax.annotation.Nullable
  public List<ReturnsDetailsResponseProductsInner> getProducts() {
    return products;
  }

  public void setProducts(List<ReturnsDetailsResponseProductsInner> products) {
    this.products = products;
  }


  public ReturnsDetailsResponse subTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
    return this;
  }

  /**
   * Sub total amount of the return request.
   * @return subTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getSubTotal() {
    return subTotal;
  }

  public void setSubTotal(BigDecimal subTotal) {
    this.subTotal = subTotal;
  }


  public ReturnsDetailsResponse tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

  /**
   * The tax amount of the return request.
   * @return tax
   */
  @javax.annotation.Nullable
  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }


  public ReturnsDetailsResponse additionalFees(BigDecimal additionalFees) {
    this.additionalFees = additionalFees;
    return this;
  }

  /**
   * The additional fees for the return request.
   * @return additionalFees
   */
  @javax.annotation.Nullable
  public BigDecimal getAdditionalFees() {
    return additionalFees;
  }

  public void setAdditionalFees(BigDecimal additionalFees) {
    this.additionalFees = additionalFees;
  }


  public ReturnsDetailsResponse estimatedTotal(BigDecimal estimatedTotal) {
    this.estimatedTotal = estimatedTotal;
    return this;
  }

  /**
   * The total estimated amount for the return request.
   * @return estimatedTotal
   */
  @javax.annotation.Nullable
  public BigDecimal getEstimatedTotal() {
    return estimatedTotal;
  }

  public void setEstimatedTotal(BigDecimal estimatedTotal) {
    this.estimatedTotal = estimatedTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnsDetailsResponse returnsDetailsResponse = (ReturnsDetailsResponse) o;
    return Objects.equals(this.typeOfDetails, returnsDetailsResponse.typeOfDetails) &&
        Objects.equals(this.rmaClaimId, returnsDetailsResponse.rmaClaimId) &&
        Objects.equals(this.caseRequestNumber, returnsDetailsResponse.caseRequestNumber) &&
        Objects.equals(this.createdOn, returnsDetailsResponse.createdOn) &&
        Objects.equals(this.returnReason, returnsDetailsResponse.returnReason) &&
        Objects.equals(this.referenceNumber, returnsDetailsResponse.referenceNumber) &&
        Objects.equals(this.status, returnsDetailsResponse.status) &&
        Objects.equals(this.returnWarehouseAddress, returnsDetailsResponse.returnWarehouseAddress) &&
        Objects.equals(this.products, returnsDetailsResponse.products) &&
        Objects.equals(this.subTotal, returnsDetailsResponse.subTotal) &&
        Objects.equals(this.tax, returnsDetailsResponse.tax) &&
        Objects.equals(this.additionalFees, returnsDetailsResponse.additionalFees) &&
        Objects.equals(this.estimatedTotal, returnsDetailsResponse.estimatedTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfDetails, rmaClaimId, caseRequestNumber, createdOn, returnReason, referenceNumber, status, returnWarehouseAddress, products, subTotal, tax, additionalFees, estimatedTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsDetailsResponse {\n");
    sb.append("    typeOfDetails: ").append(toIndentedString(typeOfDetails)).append("\n");
    sb.append("    rmaClaimId: ").append(toIndentedString(rmaClaimId)).append("\n");
    sb.append("    caseRequestNumber: ").append(toIndentedString(caseRequestNumber)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    returnWarehouseAddress: ").append(toIndentedString(returnWarehouseAddress)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    additionalFees: ").append(toIndentedString(additionalFees)).append("\n");
    sb.append("    estimatedTotal: ").append(toIndentedString(estimatedTotal)).append("\n");
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
    openapiFields.add("typeOfDetails");
    openapiFields.add("rmaClaimId");
    openapiFields.add("caseRequestNumber");
    openapiFields.add("createdOn");
    openapiFields.add("returnReason");
    openapiFields.add("referenceNumber");
    openapiFields.add("status");
    openapiFields.add("returnWarehouseAddress");
    openapiFields.add("products");
    openapiFields.add("subTotal");
    openapiFields.add("tax");
    openapiFields.add("additionalFees");
    openapiFields.add("estimatedTotal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReturnsDetailsResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnsDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnsDetailsResponse is not found in the empty JSON string", ReturnsDetailsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnsDetailsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnsDetailsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("typeOfDetails") != null && !jsonObj.get("typeOfDetails").isJsonNull()) && !jsonObj.get("typeOfDetails").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeOfDetails` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeOfDetails").toString()));
      }
      if ((jsonObj.get("rmaClaimId") != null && !jsonObj.get("rmaClaimId").isJsonNull()) && !jsonObj.get("rmaClaimId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rmaClaimId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rmaClaimId").toString()));
      }
      if ((jsonObj.get("caseRequestNumber") != null && !jsonObj.get("caseRequestNumber").isJsonNull()) && !jsonObj.get("caseRequestNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseRequestNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseRequestNumber").toString()));
      }
      if ((jsonObj.get("createdOn") != null && !jsonObj.get("createdOn").isJsonNull()) && !jsonObj.get("createdOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdOn").toString()));
      }
      if ((jsonObj.get("returnReason") != null && !jsonObj.get("returnReason").isJsonNull()) && !jsonObj.get("returnReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnReason").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("returnWarehouseAddress") != null && !jsonObj.get("returnWarehouseAddress").isJsonNull()) && !jsonObj.get("returnWarehouseAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnWarehouseAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnWarehouseAddress").toString()));
      }
      if (jsonObj.get("products") != null && !jsonObj.get("products").isJsonNull()) {
        JsonArray jsonArrayproducts = jsonObj.getAsJsonArray("products");
        if (jsonArrayproducts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("products").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `products` to be an array in the JSON string but got `%s`", jsonObj.get("products").toString()));
          }

          // validate the optional field `products` (array)
          for (int i = 0; i < jsonArrayproducts.size(); i++) {
            ReturnsDetailsResponseProductsInner.validateJsonElement(jsonArrayproducts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnsDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnsDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnsDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnsDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnsDetailsResponse>() {
           @Override
           public void write(JsonWriter out, ReturnsDetailsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnsDetailsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReturnsDetailsResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReturnsDetailsResponse
   * @throws IOException if the JSON string is invalid with respect to ReturnsDetailsResponse
   */
  public static ReturnsDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnsDetailsResponse.class);
  }

  /**
   * Convert an instance of ReturnsDetailsResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

