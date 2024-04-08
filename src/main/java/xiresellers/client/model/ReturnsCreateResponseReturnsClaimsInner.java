/*
 * XI Sdk Resellers
 * For resellers seeking to innovate with Ingram Micro's API solutions, automate your eCommerce experience with our array of APIs and webhooks to craft a seamless journey for your customers.
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
import java.time.LocalDate;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * ReturnsCreateResponseReturnsClaimsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-08T10:40:58.644115Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ReturnsCreateResponseReturnsClaimsInner {
  public static final String SERIALIZED_NAME_RMA_CLAIM_ID = "rmaClaimId";
  @SerializedName(SERIALIZED_NAME_RMA_CLAIM_ID)
  private String rmaClaimId;

  public static final String SERIALIZED_NAME_CASE_REQUEST_NUMBER = "caseRequestNumber";
  @SerializedName(SERIALIZED_NAME_CASE_REQUEST_NUMBER)
  private String caseRequestNumber;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_CREATED_ON = "createdOn";
  @SerializedName(SERIALIZED_NAME_CREATED_ON)
  private LocalDate createdOn;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_RETURN_REASON = "returnReason";
  @SerializedName(SERIALIZED_NAME_RETURN_REASON)
  private String returnReason;

  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_VENDOR_PART_NUMBER = "vendorPartNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_PART_NUMBER)
  private String vendorPartNumber;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public static final String SERIALIZED_NAME_ESTIMATED_TOTAL_VALUE = "estimatedTotalValue";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_TOTAL_VALUE)
  private BigDecimal estimatedTotalValue;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private BigDecimal credit;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> links;

  public ReturnsCreateResponseReturnsClaimsInner() {
  }

  public ReturnsCreateResponseReturnsClaimsInner rmaClaimId(String rmaClaimId) {
    this.rmaClaimId = rmaClaimId;
    return this;
  }

   /**
   * The rmaClaimId claim id.
   * @return rmaClaimId
  **/
  @javax.annotation.Nullable
  public String getRmaClaimId() {
    return rmaClaimId;
  }

  public void setRmaClaimId(String rmaClaimId) {
    this.rmaClaimId = rmaClaimId;
  }


  public ReturnsCreateResponseReturnsClaimsInner caseRequestNumber(String caseRequestNumber) {
    this.caseRequestNumber = caseRequestNumber;
    return this;
  }

   /**
   * A unique return request number.
   * @return caseRequestNumber
  **/
  @javax.annotation.Nullable
  public String getCaseRequestNumber() {
    return caseRequestNumber;
  }

  public void setCaseRequestNumber(String caseRequestNumber) {
    this.caseRequestNumber = caseRequestNumber;
  }


  public ReturnsCreateResponseReturnsClaimsInner referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * The reference number for the return.
   * @return referenceNumber
  **/
  @javax.annotation.Nullable
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public ReturnsCreateResponseReturnsClaimsInner createdOn(LocalDate createdOn) {
    this.createdOn = createdOn;
    return this;
  }

   /**
   * The date on which the return request was created. 
   * @return createdOn
  **/
  @javax.annotation.Nullable
  public LocalDate getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDate createdOn) {
    this.createdOn = createdOn;
  }


  public ReturnsCreateResponseReturnsClaimsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of request.
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public ReturnsCreateResponseReturnsClaimsInner returnReason(String returnReason) {
    this.returnReason = returnReason;
    return this;
  }

   /**
   * The reason for the return.
   * @return returnReason
  **/
  @javax.annotation.Nullable
  public String getReturnReason() {
    return returnReason;
  }

  public void setReturnReason(String returnReason) {
    this.returnReason = returnReason;
  }


  public ReturnsCreateResponseReturnsClaimsInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

   /**
   * Unique line number from Ingram.
   * @return ingramPartNumber
  **/
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public ReturnsCreateResponseReturnsClaimsInner vendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
    return this;
  }

   /**
   * Vendor Part Number.
   * @return vendorPartNumber
  **/
  @javax.annotation.Nullable
  public String getVendorPartNumber() {
    return vendorPartNumber;
  }

  public void setVendorPartNumber(String vendorPartNumber) {
    this.vendorPartNumber = vendorPartNumber;
  }


  public ReturnsCreateResponseReturnsClaimsInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Return quantity of the product.
   * @return quantity
  **/
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public ReturnsCreateResponseReturnsClaimsInner notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Return notes.
   * @return notes
  **/
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  public ReturnsCreateResponseReturnsClaimsInner estimatedTotalValue(BigDecimal estimatedTotalValue) {
    this.estimatedTotalValue = estimatedTotalValue;
    return this;
  }

   /**
   * The estimated total value of the return.
   * @return estimatedTotalValue
  **/
  @javax.annotation.Nullable
  public BigDecimal getEstimatedTotalValue() {
    return estimatedTotalValue;
  }

  public void setEstimatedTotalValue(BigDecimal estimatedTotalValue) {
    this.estimatedTotalValue = estimatedTotalValue;
  }


  public ReturnsCreateResponseReturnsClaimsInner credit(BigDecimal credit) {
    this.credit = credit;
    return this;
  }

   /**
   * The amount of credit.
   * @return credit
  **/
  @javax.annotation.Nullable
  public BigDecimal getCredit() {
    return credit;
  }

  public void setCredit(BigDecimal credit) {
    this.credit = credit;
  }


  public ReturnsCreateResponseReturnsClaimsInner status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the request.
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public ReturnsCreateResponseReturnsClaimsInner links(List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> links) {
    this.links = links;
    return this;
  }

  public ReturnsCreateResponseReturnsClaimsInner addLinksItem(ReturnsSearchResponseReturnsClaimsInnerLinksInner linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  public List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> getLinks() {
    return links;
  }

  public void setLinks(List<ReturnsSearchResponseReturnsClaimsInnerLinksInner> links) {
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
    ReturnsCreateResponseReturnsClaimsInner returnsCreateResponseReturnsClaimsInner = (ReturnsCreateResponseReturnsClaimsInner) o;
    return Objects.equals(this.rmaClaimId, returnsCreateResponseReturnsClaimsInner.rmaClaimId) &&
        Objects.equals(this.caseRequestNumber, returnsCreateResponseReturnsClaimsInner.caseRequestNumber) &&
        Objects.equals(this.referenceNumber, returnsCreateResponseReturnsClaimsInner.referenceNumber) &&
        Objects.equals(this.createdOn, returnsCreateResponseReturnsClaimsInner.createdOn) &&
        Objects.equals(this.type, returnsCreateResponseReturnsClaimsInner.type) &&
        Objects.equals(this.returnReason, returnsCreateResponseReturnsClaimsInner.returnReason) &&
        Objects.equals(this.ingramPartNumber, returnsCreateResponseReturnsClaimsInner.ingramPartNumber) &&
        Objects.equals(this.vendorPartNumber, returnsCreateResponseReturnsClaimsInner.vendorPartNumber) &&
        Objects.equals(this.quantity, returnsCreateResponseReturnsClaimsInner.quantity) &&
        Objects.equals(this.notes, returnsCreateResponseReturnsClaimsInner.notes) &&
        Objects.equals(this.estimatedTotalValue, returnsCreateResponseReturnsClaimsInner.estimatedTotalValue) &&
        Objects.equals(this.credit, returnsCreateResponseReturnsClaimsInner.credit) &&
        Objects.equals(this.status, returnsCreateResponseReturnsClaimsInner.status) &&
        Objects.equals(this.links, returnsCreateResponseReturnsClaimsInner.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rmaClaimId, caseRequestNumber, referenceNumber, createdOn, type, returnReason, ingramPartNumber, vendorPartNumber, quantity, notes, estimatedTotalValue, credit, status, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnsCreateResponseReturnsClaimsInner {\n");
    sb.append("    rmaClaimId: ").append(toIndentedString(rmaClaimId)).append("\n");
    sb.append("    caseRequestNumber: ").append(toIndentedString(caseRequestNumber)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    returnReason: ").append(toIndentedString(returnReason)).append("\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    vendorPartNumber: ").append(toIndentedString(vendorPartNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    estimatedTotalValue: ").append(toIndentedString(estimatedTotalValue)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
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
    openapiFields.add("rmaClaimId");
    openapiFields.add("caseRequestNumber");
    openapiFields.add("referenceNumber");
    openapiFields.add("createdOn");
    openapiFields.add("type");
    openapiFields.add("returnReason");
    openapiFields.add("ingramPartNumber");
    openapiFields.add("vendorPartNumber");
    openapiFields.add("quantity");
    openapiFields.add("notes");
    openapiFields.add("estimatedTotalValue");
    openapiFields.add("credit");
    openapiFields.add("status");
    openapiFields.add("links");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReturnsCreateResponseReturnsClaimsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReturnsCreateResponseReturnsClaimsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReturnsCreateResponseReturnsClaimsInner is not found in the empty JSON string", ReturnsCreateResponseReturnsClaimsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReturnsCreateResponseReturnsClaimsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReturnsCreateResponseReturnsClaimsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("rmaClaimId") != null && !jsonObj.get("rmaClaimId").isJsonNull()) && !jsonObj.get("rmaClaimId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rmaClaimId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rmaClaimId").toString()));
      }
      if ((jsonObj.get("caseRequestNumber") != null && !jsonObj.get("caseRequestNumber").isJsonNull()) && !jsonObj.get("caseRequestNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseRequestNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseRequestNumber").toString()));
      }
      if ((jsonObj.get("referenceNumber") != null && !jsonObj.get("referenceNumber").isJsonNull()) && !jsonObj.get("referenceNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `referenceNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("referenceNumber").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("returnReason") != null && !jsonObj.get("returnReason").isJsonNull()) && !jsonObj.get("returnReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `returnReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("returnReason").toString()));
      }
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("vendorPartNumber") != null && !jsonObj.get("vendorPartNumber").isJsonNull()) && !jsonObj.get("vendorPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorPartNumber").toString()));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
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
       if (!ReturnsCreateResponseReturnsClaimsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReturnsCreateResponseReturnsClaimsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReturnsCreateResponseReturnsClaimsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReturnsCreateResponseReturnsClaimsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReturnsCreateResponseReturnsClaimsInner>() {
           @Override
           public void write(JsonWriter out, ReturnsCreateResponseReturnsClaimsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReturnsCreateResponseReturnsClaimsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReturnsCreateResponseReturnsClaimsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReturnsCreateResponseReturnsClaimsInner
  * @throws IOException if the JSON string is invalid with respect to ReturnsCreateResponseReturnsClaimsInner
  */
  public static ReturnsCreateResponseReturnsClaimsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReturnsCreateResponseReturnsClaimsInner.class);
  }

 /**
  * Convert an instance of ReturnsCreateResponseReturnsClaimsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

