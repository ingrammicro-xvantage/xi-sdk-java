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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import xiresellers.client.JSON;

/**
 * QuoteDetailsResponseProductsInnerPriceDiscountsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T13:12:48.606866Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class QuoteDetailsResponseProductsInnerPriceDiscountsInner {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AVALIABLE_QUNATITY = "avaliableQunatity";
  @SerializedName(SERIALIZED_NAME_AVALIABLE_QUNATITY)
  private Integer avaliableQunatity;

  public static final String SERIALIZED_NAME_MINIMUM_QUANTITY = "minimumQuantity";
  @SerializedName(SERIALIZED_NAME_MINIMUM_QUANTITY)
  private Integer minimumQuantity;

  public static final String SERIALIZED_NAME_BID_NUMBER = "bidNumber";
  @SerializedName(SERIALIZED_NAME_BID_NUMBER)
  private String bidNumber;

  public static final String SERIALIZED_NAME_BID_VERSION = "bidVersion";
  @SerializedName(SERIALIZED_NAME_BID_VERSION)
  private String bidVersion;

  public static final String SERIALIZED_NAME_VALID_FROM = "validFrom";
  @SerializedName(SERIALIZED_NAME_VALID_FROM)
  private String validFrom;

  public static final String SERIALIZED_NAME_VALID_TO = "validTo";
  @SerializedName(SERIALIZED_NAME_VALID_TO)
  private String validTo;

  public static final String SERIALIZED_NAME_DISCOUNT_OFF_LIST = "discountOffList";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_OFF_LIST)
  private BigDecimal discountOffList;

  public QuoteDetailsResponseProductsInnerPriceDiscountsInner() {
  }

  public QuoteDetailsResponseProductsInnerPriceDiscountsInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner avaliableQunatity(Integer avaliableQunatity) {
    this.avaliableQunatity = avaliableQunatity;
    return this;
  }

   /**
   * Get avaliableQunatity
   * @return avaliableQunatity
  **/
  @javax.annotation.Nullable
  public Integer getAvaliableQunatity() {
    return avaliableQunatity;
  }

  public void setAvaliableQunatity(Integer avaliableQunatity) {
    this.avaliableQunatity = avaliableQunatity;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner minimumQuantity(Integer minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
    return this;
  }

   /**
   * Get minimumQuantity
   * @return minimumQuantity
  **/
  @javax.annotation.Nullable
  public Integer getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(Integer minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner bidNumber(String bidNumber) {
    this.bidNumber = bidNumber;
    return this;
  }

   /**
   * Get bidNumber
   * @return bidNumber
  **/
  @javax.annotation.Nullable
  public String getBidNumber() {
    return bidNumber;
  }

  public void setBidNumber(String bidNumber) {
    this.bidNumber = bidNumber;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner bidVersion(String bidVersion) {
    this.bidVersion = bidVersion;
    return this;
  }

   /**
   * Get bidVersion
   * @return bidVersion
  **/
  @javax.annotation.Nullable
  public String getBidVersion() {
    return bidVersion;
  }

  public void setBidVersion(String bidVersion) {
    this.bidVersion = bidVersion;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner validFrom(String validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @javax.annotation.Nullable
  public String getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner validTo(String validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @javax.annotation.Nullable
  public String getValidTo() {
    return validTo;
  }

  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }


  public QuoteDetailsResponseProductsInnerPriceDiscountsInner discountOffList(BigDecimal discountOffList) {
    this.discountOffList = discountOffList;
    return this;
  }

   /**
   * Get discountOffList
   * @return discountOffList
  **/
  @javax.annotation.Nullable
  public BigDecimal getDiscountOffList() {
    return discountOffList;
  }

  public void setDiscountOffList(BigDecimal discountOffList) {
    this.discountOffList = discountOffList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuoteDetailsResponseProductsInnerPriceDiscountsInner quoteDetailsResponseProductsInnerPriceDiscountsInner = (QuoteDetailsResponseProductsInnerPriceDiscountsInner) o;
    return Objects.equals(this.type, quoteDetailsResponseProductsInnerPriceDiscountsInner.type) &&
        Objects.equals(this.amount, quoteDetailsResponseProductsInnerPriceDiscountsInner.amount) &&
        Objects.equals(this.expirationDate, quoteDetailsResponseProductsInnerPriceDiscountsInner.expirationDate) &&
        Objects.equals(this.description, quoteDetailsResponseProductsInnerPriceDiscountsInner.description) &&
        Objects.equals(this.avaliableQunatity, quoteDetailsResponseProductsInnerPriceDiscountsInner.avaliableQunatity) &&
        Objects.equals(this.minimumQuantity, quoteDetailsResponseProductsInnerPriceDiscountsInner.minimumQuantity) &&
        Objects.equals(this.bidNumber, quoteDetailsResponseProductsInnerPriceDiscountsInner.bidNumber) &&
        Objects.equals(this.bidVersion, quoteDetailsResponseProductsInnerPriceDiscountsInner.bidVersion) &&
        Objects.equals(this.validFrom, quoteDetailsResponseProductsInnerPriceDiscountsInner.validFrom) &&
        Objects.equals(this.validTo, quoteDetailsResponseProductsInnerPriceDiscountsInner.validTo) &&
        Objects.equals(this.discountOffList, quoteDetailsResponseProductsInnerPriceDiscountsInner.discountOffList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, amount, expirationDate, description, avaliableQunatity, minimumQuantity, bidNumber, bidVersion, validFrom, validTo, discountOffList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteDetailsResponseProductsInnerPriceDiscountsInner {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    avaliableQunatity: ").append(toIndentedString(avaliableQunatity)).append("\n");
    sb.append("    minimumQuantity: ").append(toIndentedString(minimumQuantity)).append("\n");
    sb.append("    bidNumber: ").append(toIndentedString(bidNumber)).append("\n");
    sb.append("    bidVersion: ").append(toIndentedString(bidVersion)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    discountOffList: ").append(toIndentedString(discountOffList)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("amount");
    openapiFields.add("expirationDate");
    openapiFields.add("description");
    openapiFields.add("avaliableQunatity");
    openapiFields.add("minimumQuantity");
    openapiFields.add("bidNumber");
    openapiFields.add("bidVersion");
    openapiFields.add("validFrom");
    openapiFields.add("validTo");
    openapiFields.add("discountOffList");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QuoteDetailsResponseProductsInnerPriceDiscountsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QuoteDetailsResponseProductsInnerPriceDiscountsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QuoteDetailsResponseProductsInnerPriceDiscountsInner is not found in the empty JSON string", QuoteDetailsResponseProductsInnerPriceDiscountsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QuoteDetailsResponseProductsInnerPriceDiscountsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QuoteDetailsResponseProductsInnerPriceDiscountsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) && !jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("bidNumber") != null && !jsonObj.get("bidNumber").isJsonNull()) && !jsonObj.get("bidNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bidNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bidNumber").toString()));
      }
      if ((jsonObj.get("bidVersion") != null && !jsonObj.get("bidVersion").isJsonNull()) && !jsonObj.get("bidVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bidVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bidVersion").toString()));
      }
      if ((jsonObj.get("validFrom") != null && !jsonObj.get("validFrom").isJsonNull()) && !jsonObj.get("validFrom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validFrom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validFrom").toString()));
      }
      if ((jsonObj.get("validTo") != null && !jsonObj.get("validTo").isJsonNull()) && !jsonObj.get("validTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validTo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QuoteDetailsResponseProductsInnerPriceDiscountsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QuoteDetailsResponseProductsInnerPriceDiscountsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QuoteDetailsResponseProductsInnerPriceDiscountsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QuoteDetailsResponseProductsInnerPriceDiscountsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QuoteDetailsResponseProductsInnerPriceDiscountsInner>() {
           @Override
           public void write(JsonWriter out, QuoteDetailsResponseProductsInnerPriceDiscountsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QuoteDetailsResponseProductsInnerPriceDiscountsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QuoteDetailsResponseProductsInnerPriceDiscountsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QuoteDetailsResponseProductsInnerPriceDiscountsInner
  * @throws IOException if the JSON string is invalid with respect to QuoteDetailsResponseProductsInnerPriceDiscountsInner
  */
  public static QuoteDetailsResponseProductsInnerPriceDiscountsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QuoteDetailsResponseProductsInnerPriceDiscountsInner.class);
  }

 /**
  * Convert an instance of QuoteDetailsResponseProductsInnerPriceDiscountsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

