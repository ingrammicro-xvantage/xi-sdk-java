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
import xiresellers.client.model.ValidateQuoteResponseLinesInner;
import xiresellers.client.model.ValidateQuoteResponseVmfAdditionalAttributesInner;

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
 * ValidateQuoteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-11T09:58:37.670146Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ValidateQuoteResponse {
  public static final String SERIALIZED_NAME_QUOTE_NUMBER = "quoteNumber";
  @SerializedName(SERIALIZED_NAME_QUOTE_NUMBER)
  private String quoteNumber;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES = "vmfAdditionalAttributes";
  @SerializedName(SERIALIZED_NAME_VMF_ADDITIONAL_ATTRIBUTES)
  private List<ValidateQuoteResponseVmfAdditionalAttributesInner> vmfAdditionalAttributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private List<ValidateQuoteResponseLinesInner> lines = new ArrayList<>();

  public static final String SERIALIZED_NAME_QUOTE_TYPE = "quoteType";
  @SerializedName(SERIALIZED_NAME_QUOTE_TYPE)
  private Integer quoteType;

  public static final String SERIALIZED_NAME_VENDOR_GROUP_NAME = "vendorGroupName";
  @SerializedName(SERIALIZED_NAME_VENDOR_GROUP_NAME)
  private String vendorGroupName;

  public static final String SERIALIZED_NAME_VENDOR_QUOTE_NUMBER = "vendorQuoteNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_QUOTE_NUMBER)
  private String vendorQuoteNumber;

  public static final String SERIALIZED_NAME_VENDOR_MASTER_NUMBER = "vendorMasterNumber";
  @SerializedName(SERIALIZED_NAME_VENDOR_MASTER_NUMBER)
  private String vendorMasterNumber;

  public ValidateQuoteResponse() {
  }

  public ValidateQuoteResponse quoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
    return this;
  }

  /**
   * A unique identifier generated by Ingram Micro&#39;s CRM specific to each quote.
   * @return quoteNumber
   */
  @javax.annotation.Nullable
  public String getQuoteNumber() {
    return quoteNumber;
  }

  public void setQuoteNumber(String quoteNumber) {
    this.quoteNumber = quoteNumber;
  }


  public ValidateQuoteResponse vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

  /**
   * The name of the vendor.
   * @return vendorName
   */
  @javax.annotation.Nullable
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public ValidateQuoteResponse vmfAdditionalAttributes(List<ValidateQuoteResponseVmfAdditionalAttributesInner> vmfAdditionalAttributes) {
    this.vmfAdditionalAttributes = vmfAdditionalAttributes;
    return this;
  }

  public ValidateQuoteResponse addVmfAdditionalAttributesItem(ValidateQuoteResponseVmfAdditionalAttributesInner vmfAdditionalAttributesItem) {
    if (this.vmfAdditionalAttributes == null) {
      this.vmfAdditionalAttributes = new ArrayList<>();
    }
    this.vmfAdditionalAttributes.add(vmfAdditionalAttributesItem);
    return this;
  }

  /**
   * The object containing the list of fields required at a header level by the vendor.
   * @return vmfAdditionalAttributes
   */
  @javax.annotation.Nullable
  public List<ValidateQuoteResponseVmfAdditionalAttributesInner> getVmfAdditionalAttributes() {
    return vmfAdditionalAttributes;
  }

  public void setVmfAdditionalAttributes(List<ValidateQuoteResponseVmfAdditionalAttributesInner> vmfAdditionalAttributes) {
    this.vmfAdditionalAttributes = vmfAdditionalAttributes;
  }


  public ValidateQuoteResponse lines(List<ValidateQuoteResponseLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public ValidateQuoteResponse addLinesItem(ValidateQuoteResponseLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * The object containing the lines from the quote.
   * @return lines
   */
  @javax.annotation.Nullable
  public List<ValidateQuoteResponseLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<ValidateQuoteResponseLinesInner> lines) {
    this.lines = lines;
  }


  public ValidateQuoteResponse quoteType(Integer quoteType) {
    this.quoteType = quoteType;
    return this;
  }

  /**
   * Get quoteType
   * @return quoteType
   */
  @javax.annotation.Nullable
  public Integer getQuoteType() {
    return quoteType;
  }

  public void setQuoteType(Integer quoteType) {
    this.quoteType = quoteType;
  }


  public ValidateQuoteResponse vendorGroupName(String vendorGroupName) {
    this.vendorGroupName = vendorGroupName;
    return this;
  }

  /**
   * Get vendorGroupName
   * @return vendorGroupName
   */
  @javax.annotation.Nullable
  public String getVendorGroupName() {
    return vendorGroupName;
  }

  public void setVendorGroupName(String vendorGroupName) {
    this.vendorGroupName = vendorGroupName;
  }


  public ValidateQuoteResponse vendorQuoteNumber(String vendorQuoteNumber) {
    this.vendorQuoteNumber = vendorQuoteNumber;
    return this;
  }

  /**
   * Get vendorQuoteNumber
   * @return vendorQuoteNumber
   */
  @javax.annotation.Nullable
  public String getVendorQuoteNumber() {
    return vendorQuoteNumber;
  }

  public void setVendorQuoteNumber(String vendorQuoteNumber) {
    this.vendorQuoteNumber = vendorQuoteNumber;
  }


  public ValidateQuoteResponse vendorMasterNumber(String vendorMasterNumber) {
    this.vendorMasterNumber = vendorMasterNumber;
    return this;
  }

  /**
   * Get vendorMasterNumber
   * @return vendorMasterNumber
   */
  @javax.annotation.Nullable
  public String getVendorMasterNumber() {
    return vendorMasterNumber;
  }

  public void setVendorMasterNumber(String vendorMasterNumber) {
    this.vendorMasterNumber = vendorMasterNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateQuoteResponse validateQuoteResponse = (ValidateQuoteResponse) o;
    return Objects.equals(this.quoteNumber, validateQuoteResponse.quoteNumber) &&
        Objects.equals(this.vendorName, validateQuoteResponse.vendorName) &&
        Objects.equals(this.vmfAdditionalAttributes, validateQuoteResponse.vmfAdditionalAttributes) &&
        Objects.equals(this.lines, validateQuoteResponse.lines) &&
        Objects.equals(this.quoteType, validateQuoteResponse.quoteType) &&
        Objects.equals(this.vendorGroupName, validateQuoteResponse.vendorGroupName) &&
        Objects.equals(this.vendorQuoteNumber, validateQuoteResponse.vendorQuoteNumber) &&
        Objects.equals(this.vendorMasterNumber, validateQuoteResponse.vendorMasterNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quoteNumber, vendorName, vmfAdditionalAttributes, lines, quoteType, vendorGroupName, vendorQuoteNumber, vendorMasterNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateQuoteResponse {\n");
    sb.append("    quoteNumber: ").append(toIndentedString(quoteNumber)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vmfAdditionalAttributes: ").append(toIndentedString(vmfAdditionalAttributes)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    quoteType: ").append(toIndentedString(quoteType)).append("\n");
    sb.append("    vendorGroupName: ").append(toIndentedString(vendorGroupName)).append("\n");
    sb.append("    vendorQuoteNumber: ").append(toIndentedString(vendorQuoteNumber)).append("\n");
    sb.append("    vendorMasterNumber: ").append(toIndentedString(vendorMasterNumber)).append("\n");
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
    openapiFields.add("vendorName");
    openapiFields.add("vmfAdditionalAttributes");
    openapiFields.add("lines");
    openapiFields.add("quoteType");
    openapiFields.add("vendorGroupName");
    openapiFields.add("vendorQuoteNumber");
    openapiFields.add("vendorMasterNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ValidateQuoteResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValidateQuoteResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValidateQuoteResponse is not found in the empty JSON string", ValidateQuoteResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValidateQuoteResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValidateQuoteResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("quoteNumber") != null && !jsonObj.get("quoteNumber").isJsonNull()) && !jsonObj.get("quoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quoteNumber").toString()));
      }
      if ((jsonObj.get("vendorName") != null && !jsonObj.get("vendorName").isJsonNull()) && !jsonObj.get("vendorName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorName").toString()));
      }
      if (jsonObj.get("vmfAdditionalAttributes") != null && !jsonObj.get("vmfAdditionalAttributes").isJsonNull()) {
        JsonArray jsonArrayvmfAdditionalAttributes = jsonObj.getAsJsonArray("vmfAdditionalAttributes");
        if (jsonArrayvmfAdditionalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vmfAdditionalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vmfAdditionalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("vmfAdditionalAttributes").toString()));
          }

          // validate the optional field `vmfAdditionalAttributes` (array)
          for (int i = 0; i < jsonArrayvmfAdditionalAttributes.size(); i++) {
            ValidateQuoteResponseVmfAdditionalAttributesInner.validateJsonElement(jsonArrayvmfAdditionalAttributes.get(i));
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
            ValidateQuoteResponseLinesInner.validateJsonElement(jsonArraylines.get(i));
          };
        }
      }
      if ((jsonObj.get("vendorGroupName") != null && !jsonObj.get("vendorGroupName").isJsonNull()) && !jsonObj.get("vendorGroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorGroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorGroupName").toString()));
      }
      if ((jsonObj.get("vendorQuoteNumber") != null && !jsonObj.get("vendorQuoteNumber").isJsonNull()) && !jsonObj.get("vendorQuoteNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorQuoteNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorQuoteNumber").toString()));
      }
      if ((jsonObj.get("vendorMasterNumber") != null && !jsonObj.get("vendorMasterNumber").isJsonNull()) && !jsonObj.get("vendorMasterNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vendorMasterNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vendorMasterNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValidateQuoteResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValidateQuoteResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValidateQuoteResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValidateQuoteResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ValidateQuoteResponse>() {
           @Override
           public void write(JsonWriter out, ValidateQuoteResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValidateQuoteResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ValidateQuoteResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ValidateQuoteResponse
   * @throws IOException if the JSON string is invalid with respect to ValidateQuoteResponse
   */
  public static ValidateQuoteResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValidateQuoteResponse.class);
  }

  /**
   * Convert an instance of ValidateQuoteResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

