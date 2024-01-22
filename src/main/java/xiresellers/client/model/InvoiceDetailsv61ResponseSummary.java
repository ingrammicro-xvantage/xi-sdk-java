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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import xiresellers.client.model.InvoiceDetailsv61ResponseSummaryForeignFxTotals;
import xiresellers.client.model.InvoiceDetailsv61ResponseSummaryLines;
import xiresellers.client.model.InvoiceDetailsv61ResponseSummaryMiscChargesInner;
import xiresellers.client.model.InvoiceDetailsv61ResponseSummaryTotals;

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
 * InvoiceDetailsv61ResponseSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-22T09:48:07.665984Z[Etc/UTC]")
public class InvoiceDetailsv61ResponseSummary {
  public static final String SERIALIZED_NAME_LINES = "lines";
  @SerializedName(SERIALIZED_NAME_LINES)
  private InvoiceDetailsv61ResponseSummaryLines lines;

  public static final String SERIALIZED_NAME_MISC_CHARGES = "miscCharges";
  @SerializedName(SERIALIZED_NAME_MISC_CHARGES)
  private List<InvoiceDetailsv61ResponseSummaryMiscChargesInner> miscCharges;

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private InvoiceDetailsv61ResponseSummaryTotals totals;

  public static final String SERIALIZED_NAME_FOREIGN_FX_TOTALS = "foreignFxTotals";
  @SerializedName(SERIALIZED_NAME_FOREIGN_FX_TOTALS)
  private InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignFxTotals;

  public InvoiceDetailsv61ResponseSummary() {
  }

  public InvoiceDetailsv61ResponseSummary lines(InvoiceDetailsv61ResponseSummaryLines lines) {
    this.lines = lines;
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponseSummaryLines getLines() {
    return lines;
  }

  public void setLines(InvoiceDetailsv61ResponseSummaryLines lines) {
    this.lines = lines;
  }


  public InvoiceDetailsv61ResponseSummary miscCharges(List<InvoiceDetailsv61ResponseSummaryMiscChargesInner> miscCharges) {
    this.miscCharges = miscCharges;
    return this;
  }

  public InvoiceDetailsv61ResponseSummary addMiscChargesItem(InvoiceDetailsv61ResponseSummaryMiscChargesInner miscChargesItem) {
    if (this.miscCharges == null) {
      this.miscCharges = new ArrayList<>();
    }
    this.miscCharges.add(miscChargesItem);
    return this;
  }

   /**
   * Miscellaneous charges.
   * @return miscCharges
  **/
  @javax.annotation.Nullable
  public List<InvoiceDetailsv61ResponseSummaryMiscChargesInner> getMiscCharges() {
    return miscCharges;
  }

  public void setMiscCharges(List<InvoiceDetailsv61ResponseSummaryMiscChargesInner> miscCharges) {
    this.miscCharges = miscCharges;
  }


  public InvoiceDetailsv61ResponseSummary totals(InvoiceDetailsv61ResponseSummaryTotals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponseSummaryTotals getTotals() {
    return totals;
  }

  public void setTotals(InvoiceDetailsv61ResponseSummaryTotals totals) {
    this.totals = totals;
  }


  public InvoiceDetailsv61ResponseSummary foreignFxTotals(InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignFxTotals) {
    this.foreignFxTotals = foreignFxTotals;
    return this;
  }

   /**
   * Get foreignFxTotals
   * @return foreignFxTotals
  **/
  @javax.annotation.Nullable
  public InvoiceDetailsv61ResponseSummaryForeignFxTotals getForeignFxTotals() {
    return foreignFxTotals;
  }

  public void setForeignFxTotals(InvoiceDetailsv61ResponseSummaryForeignFxTotals foreignFxTotals) {
    this.foreignFxTotals = foreignFxTotals;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDetailsv61ResponseSummary invoiceDetailsv61ResponseSummary = (InvoiceDetailsv61ResponseSummary) o;
    return Objects.equals(this.lines, invoiceDetailsv61ResponseSummary.lines) &&
        Objects.equals(this.miscCharges, invoiceDetailsv61ResponseSummary.miscCharges) &&
        Objects.equals(this.totals, invoiceDetailsv61ResponseSummary.totals) &&
        Objects.equals(this.foreignFxTotals, invoiceDetailsv61ResponseSummary.foreignFxTotals);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(lines, miscCharges, totals, foreignFxTotals);
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
    sb.append("class InvoiceDetailsv61ResponseSummary {\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    miscCharges: ").append(toIndentedString(miscCharges)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    foreignFxTotals: ").append(toIndentedString(foreignFxTotals)).append("\n");
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
    openapiFields.add("lines");
    openapiFields.add("miscCharges");
    openapiFields.add("totals");
    openapiFields.add("foreignFxTotals");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to InvoiceDetailsv61ResponseSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDetailsv61ResponseSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDetailsv61ResponseSummary is not found in the empty JSON string", InvoiceDetailsv61ResponseSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InvoiceDetailsv61ResponseSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InvoiceDetailsv61ResponseSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `lines`
      if (jsonObj.get("lines") != null && !jsonObj.get("lines").isJsonNull()) {
        InvoiceDetailsv61ResponseSummaryLines.validateJsonElement(jsonObj.get("lines"));
      }
      if (jsonObj.get("miscCharges") != null && !jsonObj.get("miscCharges").isJsonNull()) {
        JsonArray jsonArraymiscCharges = jsonObj.getAsJsonArray("miscCharges");
        if (jsonArraymiscCharges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("miscCharges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `miscCharges` to be an array in the JSON string but got `%s`", jsonObj.get("miscCharges").toString()));
          }

          // validate the optional field `miscCharges` (array)
          for (int i = 0; i < jsonArraymiscCharges.size(); i++) {
            InvoiceDetailsv61ResponseSummaryMiscChargesInner.validateJsonElement(jsonArraymiscCharges.get(i));
          };
        }
      }
      // validate the optional field `totals`
      if (jsonObj.get("totals") != null && !jsonObj.get("totals").isJsonNull()) {
        InvoiceDetailsv61ResponseSummaryTotals.validateJsonElement(jsonObj.get("totals"));
      }
      // validate the optional field `foreignFxTotals`
      if (jsonObj.get("foreignFxTotals") != null && !jsonObj.get("foreignFxTotals").isJsonNull()) {
        InvoiceDetailsv61ResponseSummaryForeignFxTotals.validateJsonElement(jsonObj.get("foreignFxTotals"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDetailsv61ResponseSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDetailsv61ResponseSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDetailsv61ResponseSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDetailsv61ResponseSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDetailsv61ResponseSummary>() {
           @Override
           public void write(JsonWriter out, InvoiceDetailsv61ResponseSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDetailsv61ResponseSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InvoiceDetailsv61ResponseSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InvoiceDetailsv61ResponseSummary
  * @throws IOException if the JSON string is invalid with respect to InvoiceDetailsv61ResponseSummary
  */
  public static InvoiceDetailsv61ResponseSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDetailsv61ResponseSummary.class);
  }

 /**
  * Convert an instance of InvoiceDetailsv61ResponseSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
