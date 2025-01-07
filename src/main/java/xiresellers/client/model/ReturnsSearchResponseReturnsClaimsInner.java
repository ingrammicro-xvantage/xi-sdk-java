/*
 * XI Sdk Resellers
 * For Resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of API's and webhooks to craft a seamless journey for your customers.
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
import xiresellers.client.model.ReturnsSearchResponseReturnsClaimsInnerLinksInner;

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
 * ReturnsSearchResponseReturnsClaimsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T09:55:14.296096519Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ReturnsSearchResponseReturnsClaimsInner {
  public static final String SERIALIZED_NAME_RETURN_CLAIM_ID = "returnClaimId";
  @SerializedName(SERIALIZED_NAME_RETURN_CLAIM_ID)
  @javax.annotation.Nullable
  private String returnClaimId;

  public static final String SERIALIZED_NAME_CASE_REQUEST_NUMBER = "caseRequestNumber";
  @SerializedName(SERIALIZED_NAME_CASE_REQUEST_NUMBER)
  @javax.annotation.Nullable
  private String caseRequestNumber;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  @javax.annotation.Nullable
  private String createdOn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nullable
  private String type;

  public static final String SERIALIZED_NAME_RETURN_REASON = "returnReason";
  @SerializedName(SERIALIZED_NAME_RETURN_REASON)
  @javax.annotation.Nullable
  private String returnReason;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  @javax.annotation.Nullable
  private String referenceNumber;

  public static final String SERIALIZED_NAME_ESTIMATED_TOTAL_VALUE = "estimatedTotalValue";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_TOTAL_VALUE)
  @javax.annotation.Nullable
  private Double estimatedTotalValue;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  @javax.annotation.Nullable
  private BigDecimal credit;

  public static final String SERIALIZED_NAME_MODIFIED_ON = "modifiedOn";
  @SerializedName(SERIALIZED_NAME_MODIFIED_ON)
  @javax.annotation.Nullable
  private String modifiedOn;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  @javax.annotation.Nullable
  private List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> links = new ArrayList<>();

  public ReturnsSearchResponseReturnsClaimsInner() {
  }

  public ReturnsSearchResponseReturnsClaimsInner returnClaimId(@javax.annotation.Nullable String returnClaimId) {
    this.returnClaimId = returnClaimId;
    return this;
  }

  /**
   * A unique return claim Id.
   * @return returnClaimId
   */
  @javax.annotation.Nullable
  public String getReturnClaimId() {
    return returnClaimId;
  }

  public void setReturnClaimId(@javax.annotation.Nullable String returnClaimId) {
    this.returnClaimId = returnClaimId;
  }


  public ReturnsSearchResponseReturnsClaimsInner caseRequestNumber(@javax.annotation.Nullable String caseRequestNumber) {
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

  public void setCaseRequestNumber(@javax.annotation.Nullable String caseRequestNumber) {
    this.caseRequestNumber = caseRequestNumber;
  }


  public ReturnsSearchResponseReturnsClaimsInner createdOn(@javax.annotation.Nullable String createdOn) {
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

  public void setCreatedOn(@javax.annotation.Nullable String createdOn) {
    this.createdOn = createdOn;
  }


  public ReturnsSearchResponseReturnsClaimsInner type(@javax.annotation.Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of request.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(@javax.annotation.Nullable String type) {
    this.type = type;
  }


  public ReturnsSearchResponseReturnsClaimsInner returnReason(@javax.annotation.Nullable String returnReason) {
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

  public void setReturnReason(@javax.annotation.Nullable String returnReason) {
    this.returnReason = returnReason;
  }


  public ReturnsSearchResponseReturnsClaimsInner referenceNumber(@javax.annotation.Nullable String referenceNumber) {
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

  public void setReferenceNumber(@javax.annotation.Nullable String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public ReturnsSearchResponseReturnsClaimsInner estimatedTotalValue(@javax.annotation.Nullable Double estimatedTotalValue) {
    this.estimatedTotalValue = estimatedTotalValue;
    return this;
  }

  /**
   * The estimated total value of the return.
   * @return estimatedTotalValue
   */
  @javax.annotation.Nullable
  public Double getEstimatedTotalValue() {
    return estimatedTotalValue;
  }

  public void setEstimatedTotalValue(@javax.annotation.Nullable Double estimatedTotalValue) {
    this.estimatedTotalValue = estimatedTotalValue;
  }


  public ReturnsSearchResponseReturnsClaimsInner credit(@javax.annotation.Nullable BigDecimal credit) {
    this.credit = credit;
    return this;
  }

  /**
   * The amount of credit.
   * @return credit
   */
  @javax.annotation.Nullable
  public BigDecimal getCredit() {
    return credit;
  }

  public void setCredit(@javax.annotation.Nullable BigDecimal credit) {
    this.credit = credit;
  }


  public ReturnsSearchResponseReturnsClaimsInner modifiedOn(@javax.annotation.Nullable String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date on which the return request was last updated.
   * @return modifiedOn
   */
  @javax.annotation.Nullable
  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(@javax.annotation.Nullable String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }


  public ReturnsSearchResponseReturnsClaimsInner status(@javax.annotation.Nullable String status) {
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

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public ReturnsSearchResponseReturnsClaimsInner links(@javax.annotation.Nullable List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public ReturnsSearchResponseReturnsClaimsInner addLinksItem(ReturnsSearchResponseReturnsClaimsInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable
  public List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(@javax.annotation.Nullable List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> links) {
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
    ReturnsSearchResponseReturnsClaimsInner returnsSearchResponseReturnsClaimsInner = (ReturnsSearchResponseReturnsClaimsInner) o;
    return Objects.equals(this.returnClaimId, returnsSearchResponseReturnsClaimsInner.returnClaimId) &&
        Objects.equals(this.caseRequestNumber, returnsSearchResponseReturnsClaimsInner.caseRequestNumber) &&
        Objects.equals(this.createdOn, returnsSearchResponseReturnsClaimsInner.createdOn) &&
        Objects.equals(this.type, returnsSearchResponseReturnsClaimsInner.type) &&
        Objects.equals(this.returnReason, returnsSearchResponseReturnsClaimsInner.returnReason) &&
        Objects.equals(this.referenceNumber, returnsSearchResponseReturnsClaimsInner.referenceNumber) &&
        Objects.equals(this.estimatedTotalValue, returnsSearchResponseReturnsClaimsInner.estimatedTotalValue) &&
        Objects.equals(this.credit, returnsSearchResponseReturnsClaimsInner.credit) &&
        Objects.equals(this.modifiedOn, returnsSearchResponseReturnsClaimsInner.modifiedOn) &&
        Objects.equals(this.status, returnsSearchResponseReturnsClaimsInner.status) &&
        Objects.equals(this.links, returnsSearchResponseReturnsClaimsInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnClaimId, caseRequestNumber, createdOn, type, returnReason, referenceNumber, estimatedTotalValue, credit, modifiedOn, status, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsSearchResponseReturnsClaimsInner {\n");
    sb.append("    returnClaimId: ").append(toIndentedString(returnClaimId)).append("\n");
    sb.append("    caseRequestNumber: ").append(toIndentedString(caseRequestNumber)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    estimatedTotalValue: ").append(toIndentedString(estimatedTotalValue)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("returnClaimId");
    openapiFields.add("caseRequestNumber");
    openapiFields.add("createdOn");
    openapiFields.add("type");
    openapiFields.add("returnReason");
    openapiFields.add("referenceNumber");
    openapiFields.add("estimatedTotalValue");
    openapiFields.add("credit");
    openapiFields.add("modifiedOn");
    openapiFields.add("status");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReturnsSearchResponseReturnsClaimsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnsSearchResponseReturnsClaimsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnsSearchResponseReturnsClaimsInner is not found in the empty JSON string", ReturnsSearchResponseReturnsClaimsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnsSearchResponseReturnsClaimsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnsSearchResponseReturnsClaimsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("returnClaimId") != null && !jsonObj.get("returnClaimId").isJsonNull()) && !jsonObj.get("returnClaimId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnClaimId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnClaimId").toString()));
      }
      if ((jsonObj.get("caseRequestNumber") != null && !jsonObj.get("caseRequestNumber").isJsonNull()) && !jsonObj.get("caseRequestNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseRequestNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseRequestNumber").toString()));
      }
      if ((jsonObj.get("createdOn") != null && !jsonObj.get("createdOn").isJsonNull()) && !jsonObj.get("createdOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdOn").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("returnReason") != null && !jsonObj.get("returnReason").isJsonNull()) && !jsonObj.get("returnReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnReason").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("modifiedOn") != null && !jsonObj.get("modifiedOn").isJsonNull()) && !jsonObj.get("modifiedOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedOn").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
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
            ReturnsSearchResponseReturnsClaimsInnerLinksInner.validateJsonElement(jsonArraylinks.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReturnsSearchResponseReturnsClaimsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnsSearchResponseReturnsClaimsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnsSearchResponseReturnsClaimsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnsSearchResponseReturnsClaimsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnsSearchResponseReturnsClaimsInner>() {
           @Override
           public void write(JsonWriter out, ReturnsSearchResponseReturnsClaimsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnsSearchResponseReturnsClaimsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReturnsSearchResponseReturnsClaimsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReturnsSearchResponseReturnsClaimsInner
   * @throws IOException if the JSON string is invalid with respect to ReturnsSearchResponseReturnsClaimsInner
   */
  public static ReturnsSearchResponseReturnsClaimsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnsSearchResponseReturnsClaimsInner.class);
  }

  /**
   * Convert an instance of ReturnsSearchResponseReturnsClaimsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

