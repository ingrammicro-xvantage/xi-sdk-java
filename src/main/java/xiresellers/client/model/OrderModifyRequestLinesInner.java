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
import java.util.Arrays;

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
 * OrderModifyRequestLinesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-11T10:16:59.765249Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class OrderModifyRequestLinesInner {
  public static final String SERIALIZED_NAME_INGRAM_PART_NUMBER = "ingramPartNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_PART_NUMBER)
  private String ingramPartNumber;

  public static final String SERIALIZED_NAME_INGRAM_LINE_NUMBER = "ingramLineNumber";
  @SerializedName(SERIALIZED_NAME_INGRAM_LINE_NUMBER)
  private String ingramLineNumber;

  public static final String SERIALIZED_NAME_CUSTOMER_LINE_NUMBER = "customerLineNumber";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_LINE_NUMBER)
  private String customerLineNumber;

  /**
   * The line number that was added, updated, or deleted.
   */
  @JsonAdapter(AddUpdateDeleteLineEnum.Adapter.class)
  public enum AddUpdateDeleteLineEnum {
    UPDATE("UPDATE"),
    
    DELETE("DELETE"),
    
    ADD("ADD");

    private String value;

    AddUpdateDeleteLineEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddUpdateDeleteLineEnum fromValue(String value) {
      for (AddUpdateDeleteLineEnum b : AddUpdateDeleteLineEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AddUpdateDeleteLineEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddUpdateDeleteLineEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddUpdateDeleteLineEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddUpdateDeleteLineEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AddUpdateDeleteLineEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ADD_UPDATE_DELETE_LINE = "addUpdateDeleteLine";
  @SerializedName(SERIALIZED_NAME_ADD_UPDATE_DELETE_LINE)
  private AddUpdateDeleteLineEnum addUpdateDeleteLine;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private String notes;

  public OrderModifyRequestLinesInner() {
  }

  public OrderModifyRequestLinesInner ingramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
    return this;
  }

  /**
   * The unique IngramMicro part number.
   * @return ingramPartNumber
   */
  @javax.annotation.Nullable
  public String getIngramPartNumber() {
    return ingramPartNumber;
  }

  public void setIngramPartNumber(String ingramPartNumber) {
    this.ingramPartNumber = ingramPartNumber;
  }


  public OrderModifyRequestLinesInner ingramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
    return this;
  }

  /**
   * The IngramMicro line number.
   * @return ingramLineNumber
   */
  @javax.annotation.Nullable
  public String getIngramLineNumber() {
    return ingramLineNumber;
  }

  public void setIngramLineNumber(String ingramLineNumber) {
    this.ingramLineNumber = ingramLineNumber;
  }


  public OrderModifyRequestLinesInner customerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
    return this;
  }

  /**
   * The reseller&#39;s line number for reference in their system.
   * @return customerLineNumber
   */
  @javax.annotation.Nullable
  public String getCustomerLineNumber() {
    return customerLineNumber;
  }

  public void setCustomerLineNumber(String customerLineNumber) {
    this.customerLineNumber = customerLineNumber;
  }


  public OrderModifyRequestLinesInner addUpdateDeleteLine(AddUpdateDeleteLineEnum addUpdateDeleteLine) {
    this.addUpdateDeleteLine = addUpdateDeleteLine;
    return this;
  }

  /**
   * The line number that was added, updated, or deleted.
   * @return addUpdateDeleteLine
   */
  @javax.annotation.Nullable
  public AddUpdateDeleteLineEnum getAddUpdateDeleteLine() {
    return addUpdateDeleteLine;
  }

  public void setAddUpdateDeleteLine(AddUpdateDeleteLineEnum addUpdateDeleteLine) {
    this.addUpdateDeleteLine = addUpdateDeleteLine;
  }


  public OrderModifyRequestLinesInner quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The quantity of the line item.
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public OrderModifyRequestLinesInner notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * The line-level notes.
   * @return notes
   */
  @javax.annotation.Nullable
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderModifyRequestLinesInner orderModifyRequestLinesInner = (OrderModifyRequestLinesInner) o;
    return Objects.equals(this.ingramPartNumber, orderModifyRequestLinesInner.ingramPartNumber) &&
        Objects.equals(this.ingramLineNumber, orderModifyRequestLinesInner.ingramLineNumber) &&
        Objects.equals(this.customerLineNumber, orderModifyRequestLinesInner.customerLineNumber) &&
        Objects.equals(this.addUpdateDeleteLine, orderModifyRequestLinesInner.addUpdateDeleteLine) &&
        Objects.equals(this.quantity, orderModifyRequestLinesInner.quantity) &&
        Objects.equals(this.notes, orderModifyRequestLinesInner.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingramPartNumber, ingramLineNumber, customerLineNumber, addUpdateDeleteLine, quantity, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderModifyRequestLinesInner {\n");
    sb.append("    ingramPartNumber: ").append(toIndentedString(ingramPartNumber)).append("\n");
    sb.append("    ingramLineNumber: ").append(toIndentedString(ingramLineNumber)).append("\n");
    sb.append("    customerLineNumber: ").append(toIndentedString(customerLineNumber)).append("\n");
    sb.append("    addUpdateDeleteLine: ").append(toIndentedString(addUpdateDeleteLine)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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
    openapiFields.add("ingramPartNumber");
    openapiFields.add("ingramLineNumber");
    openapiFields.add("customerLineNumber");
    openapiFields.add("addUpdateDeleteLine");
    openapiFields.add("quantity");
    openapiFields.add("notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to OrderModifyRequestLinesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OrderModifyRequestLinesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderModifyRequestLinesInner is not found in the empty JSON string", OrderModifyRequestLinesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OrderModifyRequestLinesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderModifyRequestLinesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ingramPartNumber") != null && !jsonObj.get("ingramPartNumber").isJsonNull()) && !jsonObj.get("ingramPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramPartNumber").toString()));
      }
      if ((jsonObj.get("ingramLineNumber") != null && !jsonObj.get("ingramLineNumber").isJsonNull()) && !jsonObj.get("ingramLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ingramLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ingramLineNumber").toString()));
      }
      if ((jsonObj.get("customerLineNumber") != null && !jsonObj.get("customerLineNumber").isJsonNull()) && !jsonObj.get("customerLineNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerLineNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerLineNumber").toString()));
      }
      if ((jsonObj.get("addUpdateDeleteLine") != null && !jsonObj.get("addUpdateDeleteLine").isJsonNull()) && !jsonObj.get("addUpdateDeleteLine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addUpdateDeleteLine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addUpdateDeleteLine").toString()));
      }
      // validate the optional field `addUpdateDeleteLine`
      if (jsonObj.get("addUpdateDeleteLine") != null && !jsonObj.get("addUpdateDeleteLine").isJsonNull()) {
        AddUpdateDeleteLineEnum.validateJsonElement(jsonObj.get("addUpdateDeleteLine"));
      }
      if ((jsonObj.get("notes") != null && !jsonObj.get("notes").isJsonNull()) && !jsonObj.get("notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderModifyRequestLinesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderModifyRequestLinesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderModifyRequestLinesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderModifyRequestLinesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderModifyRequestLinesInner>() {
           @Override
           public void write(JsonWriter out, OrderModifyRequestLinesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderModifyRequestLinesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of OrderModifyRequestLinesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of OrderModifyRequestLinesInner
   * @throws IOException if the JSON string is invalid with respect to OrderModifyRequestLinesInner
   */
  public static OrderModifyRequestLinesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderModifyRequestLinesInner.class);
  }

  /**
   * Convert an instance of OrderModifyRequestLinesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

