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
 * ProductDetailResponseIndicators
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-07T05:01:51.614791330Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class ProductDetailResponseIndicators {
  public static final String SERIALIZED_NAME_HAS_WARRANTY = "hasWarranty";
  @SerializedName(SERIALIZED_NAME_HAS_WARRANTY)
  @javax.annotation.Nullable
  private Boolean hasWarranty;

  public static final String SERIALIZED_NAME_IS_NEW_PRODUCT = "isNewProduct";
  @SerializedName(SERIALIZED_NAME_IS_NEW_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isNewProduct;

  public static final String SERIALIZED_NAME_HAS_RETURN_LIMITS = "HasReturnLimits";
  @SerializedName(SERIALIZED_NAME_HAS_RETURN_LIMITS)
  @javax.annotation.Nullable
  private Boolean hasReturnLimits;

  public static final String SERIALIZED_NAME_IS_BACK_ORDER_ALLOWED = "IsBackOrderAllowed";
  @SerializedName(SERIALIZED_NAME_IS_BACK_ORDER_ALLOWED)
  @javax.annotation.Nullable
  private Boolean isBackOrderAllowed;

  public static final String SERIALIZED_NAME_IS_SHIPPED_FROM_PARTNER = "isShippedFromPartner";
  @SerializedName(SERIALIZED_NAME_IS_SHIPPED_FROM_PARTNER)
  @javax.annotation.Nullable
  private Boolean isShippedFromPartner;

  public static final String SERIALIZED_NAME_IS_REPLACEMENT_PRODUCT = "isReplacementProduct";
  @SerializedName(SERIALIZED_NAME_IS_REPLACEMENT_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isReplacementProduct;

  public static final String SERIALIZED_NAME_IS_DIRECTSHIP = "isDirectship";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTSHIP)
  @javax.annotation.Nullable
  private Boolean isDirectship;

  public static final String SERIALIZED_NAME_IS_DOWNLOADABLE = "isDownloadable";
  @SerializedName(SERIALIZED_NAME_IS_DOWNLOADABLE)
  @javax.annotation.Nullable
  private Boolean isDownloadable;

  public static final String SERIALIZED_NAME_IS_DIGITAL_TYPE = "isDigitalType";
  @SerializedName(SERIALIZED_NAME_IS_DIGITAL_TYPE)
  @javax.annotation.Nullable
  private Boolean isDigitalType;

  public static final String SERIALIZED_NAME_SKU_TYPE = "skuType";
  @SerializedName(SERIALIZED_NAME_SKU_TYPE)
  @javax.annotation.Nullable
  private String skuType;

  public static final String SERIALIZED_NAME_HAS_STD_SPECIAL_PRICE = "hasStdSpecialPrice";
  @SerializedName(SERIALIZED_NAME_HAS_STD_SPECIAL_PRICE)
  @javax.annotation.Nullable
  private Boolean hasStdSpecialPrice;

  public static final String SERIALIZED_NAME_HAS_ACOP_SPECIAL_PRICE = "hasAcopSpecialPrice";
  @SerializedName(SERIALIZED_NAME_HAS_ACOP_SPECIAL_PRICE)
  @javax.annotation.Nullable
  private Boolean hasAcopSpecialPrice;

  public static final String SERIALIZED_NAME_HAS_ACOP_QUANTITY_BREAK = "hasAcopQuantityBreak";
  @SerializedName(SERIALIZED_NAME_HAS_ACOP_QUANTITY_BREAK)
  @javax.annotation.Nullable
  private Boolean hasAcopQuantityBreak;

  public static final String SERIALIZED_NAME_HAS_STD_WEB_DISCOUNT = "hasStdWebDiscount";
  @SerializedName(SERIALIZED_NAME_HAS_STD_WEB_DISCOUNT)
  @javax.annotation.Nullable
  private Boolean hasStdWebDiscount;

  public static final String SERIALIZED_NAME_HAS_SPECIAL_BID = "hasSpecialBid";
  @SerializedName(SERIALIZED_NAME_HAS_SPECIAL_BID)
  @javax.annotation.Nullable
  private Boolean hasSpecialBid;

  public static final String SERIALIZED_NAME_IS_EXPORTABLE_TO_COUNTRY = "isExportableToCountry";
  @SerializedName(SERIALIZED_NAME_IS_EXPORTABLE_TO_COUNTRY)
  @javax.annotation.Nullable
  private Boolean isExportableToCountry;

  public static final String SERIALIZED_NAME_IS_DISCONTINUED_PRODUCT = "isDiscontinuedProduct";
  @SerializedName(SERIALIZED_NAME_IS_DISCONTINUED_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isDiscontinuedProduct;

  public static final String SERIALIZED_NAME_IS_REFURBISHED_PRODUCT = "isRefurbishedProduct";
  @SerializedName(SERIALIZED_NAME_IS_REFURBISHED_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isRefurbishedProduct;

  public static final String SERIALIZED_NAME_IS_RETURNABLE_PRODUCT = "isReturnableProduct";
  @SerializedName(SERIALIZED_NAME_IS_RETURNABLE_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isReturnableProduct;

  public static final String SERIALIZED_NAME_IS_INGRAM_SHIP = "isIngramShip";
  @SerializedName(SERIALIZED_NAME_IS_INGRAM_SHIP)
  @javax.annotation.Nullable
  private Boolean isIngramShip;

  public static final String SERIALIZED_NAME_IS_ENDUSER_REQUIRED = "isEnduserRequired";
  @SerializedName(SERIALIZED_NAME_IS_ENDUSER_REQUIRED)
  @javax.annotation.Nullable
  private Boolean isEnduserRequired;

  public static final String SERIALIZED_NAME_IS_HEAVY_WEIGHT = "isHeavyWeight";
  @SerializedName(SERIALIZED_NAME_IS_HEAVY_WEIGHT)
  @javax.annotation.Nullable
  private Boolean isHeavyWeight;

  public static final String SERIALIZED_NAME_HAS_LTL = "hasLtl";
  @SerializedName(SERIALIZED_NAME_HAS_LTL)
  @javax.annotation.Nullable
  private Boolean hasLtl;

  public static final String SERIALIZED_NAME_IS_CLEARANCE_PRODUCT = "isClearanceProduct";
  @SerializedName(SERIALIZED_NAME_IS_CLEARANCE_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isClearanceProduct;

  public static final String SERIALIZED_NAME_HAS_BUNDLE = "hasBundle";
  @SerializedName(SERIALIZED_NAME_HAS_BUNDLE)
  @javax.annotation.Nullable
  private Boolean hasBundle;

  public static final String SERIALIZED_NAME_IS_OVERSIZE_PRODUCT = "isOversizeProduct";
  @SerializedName(SERIALIZED_NAME_IS_OVERSIZE_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isOversizeProduct;

  public static final String SERIALIZED_NAME_IS_PREORDER_PRODUCT = "isPreorderProduct";
  @SerializedName(SERIALIZED_NAME_IS_PREORDER_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isPreorderProduct;

  public static final String SERIALIZED_NAME_IS_LICENSE_PRODUCT = "isLicenseProduct";
  @SerializedName(SERIALIZED_NAME_IS_LICENSE_PRODUCT)
  @javax.annotation.Nullable
  private Boolean isLicenseProduct;

  public static final String SERIALIZED_NAME_IS_DIRECTSHIP_ORDERABLE = "isDirectshipOrderable";
  @SerializedName(SERIALIZED_NAME_IS_DIRECTSHIP_ORDERABLE)
  @javax.annotation.Nullable
  private Boolean isDirectshipOrderable;

  public static final String SERIALIZED_NAME_IS_SERVICE_SKU = "isServiceSku";
  @SerializedName(SERIALIZED_NAME_IS_SERVICE_SKU)
  @javax.annotation.Nullable
  private Boolean isServiceSku;

  public static final String SERIALIZED_NAME_IS_CONFIGURABLE = "isConfigurable";
  @SerializedName(SERIALIZED_NAME_IS_CONFIGURABLE)
  @javax.annotation.Nullable
  private Boolean isConfigurable;

  public ProductDetailResponseIndicators() {
  }

  public ProductDetailResponseIndicators hasWarranty(@javax.annotation.Nullable Boolean hasWarranty) {
    this.hasWarranty = hasWarranty;
    return this;
  }

  /**
   * Boolean that indicates whether product has a warranty.
   * @return hasWarranty
   */
  @javax.annotation.Nullable
  public Boolean getHasWarranty() {
    return hasWarranty;
  }

  public void setHasWarranty(@javax.annotation.Nullable Boolean hasWarranty) {
    this.hasWarranty = hasWarranty;
  }


  public ProductDetailResponseIndicators isNewProduct(@javax.annotation.Nullable Boolean isNewProduct) {
    this.isNewProduct = isNewProduct;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a new product. 
   * @return isNewProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsNewProduct() {
    return isNewProduct;
  }

  public void setIsNewProduct(@javax.annotation.Nullable Boolean isNewProduct) {
    this.isNewProduct = isNewProduct;
  }


  public ProductDetailResponseIndicators hasReturnLimits(@javax.annotation.Nullable Boolean hasReturnLimits) {
    this.hasReturnLimits = hasReturnLimits;
    return this;
  }

  /**
   * Boolean that indicates whether there is any limit to return the product.
   * @return hasReturnLimits
   */
  @javax.annotation.Nullable
  public Boolean getHasReturnLimits() {
    return hasReturnLimits;
  }

  public void setHasReturnLimits(@javax.annotation.Nullable Boolean hasReturnLimits) {
    this.hasReturnLimits = hasReturnLimits;
  }


  public ProductDetailResponseIndicators isBackOrderAllowed(@javax.annotation.Nullable Boolean isBackOrderAllowed) {
    this.isBackOrderAllowed = isBackOrderAllowed;
    return this;
  }

  /**
   * Boolean that indicates whether back order is allowed for the product.
   * @return isBackOrderAllowed
   */
  @javax.annotation.Nullable
  public Boolean getIsBackOrderAllowed() {
    return isBackOrderAllowed;
  }

  public void setIsBackOrderAllowed(@javax.annotation.Nullable Boolean isBackOrderAllowed) {
    this.isBackOrderAllowed = isBackOrderAllowed;
  }


  public ProductDetailResponseIndicators isShippedFromPartner(@javax.annotation.Nullable Boolean isShippedFromPartner) {
    this.isShippedFromPartner = isShippedFromPartner;
    return this;
  }

  /**
   * Boolean that indicates whether product is shipped from the partner.
   * @return isShippedFromPartner
   */
  @javax.annotation.Nullable
  public Boolean getIsShippedFromPartner() {
    return isShippedFromPartner;
  }

  public void setIsShippedFromPartner(@javax.annotation.Nullable Boolean isShippedFromPartner) {
    this.isShippedFromPartner = isShippedFromPartner;
  }


  public ProductDetailResponseIndicators isReplacementProduct(@javax.annotation.Nullable Boolean isReplacementProduct) {
    this.isReplacementProduct = isReplacementProduct;
    return this;
  }

  /**
   * Boolean that indicates whether product is a replacement product.
   * @return isReplacementProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsReplacementProduct() {
    return isReplacementProduct;
  }

  public void setIsReplacementProduct(@javax.annotation.Nullable Boolean isReplacementProduct) {
    this.isReplacementProduct = isReplacementProduct;
  }


  public ProductDetailResponseIndicators isDirectship(@javax.annotation.Nullable Boolean isDirectship) {
    this.isDirectship = isDirectship;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a direct ship product.
   * @return isDirectship
   */
  @javax.annotation.Nullable
  public Boolean getIsDirectship() {
    return isDirectship;
  }

  public void setIsDirectship(@javax.annotation.Nullable Boolean isDirectship) {
    this.isDirectship = isDirectship;
  }


  public ProductDetailResponseIndicators isDownloadable(@javax.annotation.Nullable Boolean isDownloadable) {
    this.isDownloadable = isDownloadable;
    return this;
  }

  /**
   * Boolean that indicates whether product is downloadable.
   * @return isDownloadable
   */
  @javax.annotation.Nullable
  public Boolean getIsDownloadable() {
    return isDownloadable;
  }

  public void setIsDownloadable(@javax.annotation.Nullable Boolean isDownloadable) {
    this.isDownloadable = isDownloadable;
  }


  public ProductDetailResponseIndicators isDigitalType(@javax.annotation.Nullable Boolean isDigitalType) {
    this.isDigitalType = isDigitalType;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a digital product. 
   * @return isDigitalType
   */
  @javax.annotation.Nullable
  public Boolean getIsDigitalType() {
    return isDigitalType;
  }

  public void setIsDigitalType(@javax.annotation.Nullable Boolean isDigitalType) {
    this.isDigitalType = isDigitalType;
  }


  public ProductDetailResponseIndicators skuType(@javax.annotation.Nullable String skuType) {
    this.skuType = skuType;
    return this;
  }

  /**
   * skutype
   * @return skuType
   */
  @javax.annotation.Nullable
  public String getSkuType() {
    return skuType;
  }

  public void setSkuType(@javax.annotation.Nullable String skuType) {
    this.skuType = skuType;
  }


  public ProductDetailResponseIndicators hasStdSpecialPrice(@javax.annotation.Nullable Boolean hasStdSpecialPrice) {
    this.hasStdSpecialPrice = hasStdSpecialPrice;
    return this;
  }

  /**
   * Boolean that indicates whether product has any standard special price.
   * @return hasStdSpecialPrice
   */
  @javax.annotation.Nullable
  public Boolean getHasStdSpecialPrice() {
    return hasStdSpecialPrice;
  }

  public void setHasStdSpecialPrice(@javax.annotation.Nullable Boolean hasStdSpecialPrice) {
    this.hasStdSpecialPrice = hasStdSpecialPrice;
  }


  public ProductDetailResponseIndicators hasAcopSpecialPrice(@javax.annotation.Nullable Boolean hasAcopSpecialPrice) {
    this.hasAcopSpecialPrice = hasAcopSpecialPrice;
    return this;
  }

  /**
   * Boolean that indicates whether product has any ACOP special price.
   * @return hasAcopSpecialPrice
   */
  @javax.annotation.Nullable
  public Boolean getHasAcopSpecialPrice() {
    return hasAcopSpecialPrice;
  }

  public void setHasAcopSpecialPrice(@javax.annotation.Nullable Boolean hasAcopSpecialPrice) {
    this.hasAcopSpecialPrice = hasAcopSpecialPrice;
  }


  public ProductDetailResponseIndicators hasAcopQuantityBreak(@javax.annotation.Nullable Boolean hasAcopQuantityBreak) {
    this.hasAcopQuantityBreak = hasAcopQuantityBreak;
    return this;
  }

  /**
   * Boolean that indicates whether product has any ACOP quantity break.
   * @return hasAcopQuantityBreak
   */
  @javax.annotation.Nullable
  public Boolean getHasAcopQuantityBreak() {
    return hasAcopQuantityBreak;
  }

  public void setHasAcopQuantityBreak(@javax.annotation.Nullable Boolean hasAcopQuantityBreak) {
    this.hasAcopQuantityBreak = hasAcopQuantityBreak;
  }


  public ProductDetailResponseIndicators hasStdWebDiscount(@javax.annotation.Nullable Boolean hasStdWebDiscount) {
    this.hasStdWebDiscount = hasStdWebDiscount;
    return this;
  }

  /**
   * Boolean that indicates whether product has any standard web discount.
   * @return hasStdWebDiscount
   */
  @javax.annotation.Nullable
  public Boolean getHasStdWebDiscount() {
    return hasStdWebDiscount;
  }

  public void setHasStdWebDiscount(@javax.annotation.Nullable Boolean hasStdWebDiscount) {
    this.hasStdWebDiscount = hasStdWebDiscount;
  }


  public ProductDetailResponseIndicators hasSpecialBid(@javax.annotation.Nullable Boolean hasSpecialBid) {
    this.hasSpecialBid = hasSpecialBid;
    return this;
  }

  /**
   * Boolean that indicates whether product has any special bid.
   * @return hasSpecialBid
   */
  @javax.annotation.Nullable
  public Boolean getHasSpecialBid() {
    return hasSpecialBid;
  }

  public void setHasSpecialBid(@javax.annotation.Nullable Boolean hasSpecialBid) {
    this.hasSpecialBid = hasSpecialBid;
  }


  public ProductDetailResponseIndicators isExportableToCountry(@javax.annotation.Nullable Boolean isExportableToCountry) {
    this.isExportableToCountry = isExportableToCountry;
    return this;
  }

  /**
   * Boolean that indicates whether product is exportable.
   * @return isExportableToCountry
   */
  @javax.annotation.Nullable
  public Boolean getIsExportableToCountry() {
    return isExportableToCountry;
  }

  public void setIsExportableToCountry(@javax.annotation.Nullable Boolean isExportableToCountry) {
    this.isExportableToCountry = isExportableToCountry;
  }


  public ProductDetailResponseIndicators isDiscontinuedProduct(@javax.annotation.Nullable Boolean isDiscontinuedProduct) {
    this.isDiscontinuedProduct = isDiscontinuedProduct;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a discontinued product.
   * @return isDiscontinuedProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsDiscontinuedProduct() {
    return isDiscontinuedProduct;
  }

  public void setIsDiscontinuedProduct(@javax.annotation.Nullable Boolean isDiscontinuedProduct) {
    this.isDiscontinuedProduct = isDiscontinuedProduct;
  }


  public ProductDetailResponseIndicators isRefurbishedProduct(@javax.annotation.Nullable Boolean isRefurbishedProduct) {
    this.isRefurbishedProduct = isRefurbishedProduct;
    return this;
  }

  /**
   * Boolean that indicates whether product is refurbished.
   * @return isRefurbishedProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsRefurbishedProduct() {
    return isRefurbishedProduct;
  }

  public void setIsRefurbishedProduct(@javax.annotation.Nullable Boolean isRefurbishedProduct) {
    this.isRefurbishedProduct = isRefurbishedProduct;
  }


  public ProductDetailResponseIndicators isReturnableProduct(@javax.annotation.Nullable Boolean isReturnableProduct) {
    this.isReturnableProduct = isReturnableProduct;
    return this;
  }

  /**
   * Boolean that indicates if the product can be returned.
   * @return isReturnableProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsReturnableProduct() {
    return isReturnableProduct;
  }

  public void setIsReturnableProduct(@javax.annotation.Nullable Boolean isReturnableProduct) {
    this.isReturnableProduct = isReturnableProduct;
  }


  public ProductDetailResponseIndicators isIngramShip(@javax.annotation.Nullable Boolean isIngramShip) {
    this.isIngramShip = isIngramShip;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a Ingram shipped product.
   * @return isIngramShip
   */
  @javax.annotation.Nullable
  public Boolean getIsIngramShip() {
    return isIngramShip;
  }

  public void setIsIngramShip(@javax.annotation.Nullable Boolean isIngramShip) {
    this.isIngramShip = isIngramShip;
  }


  public ProductDetailResponseIndicators isEnduserRequired(@javax.annotation.Nullable Boolean isEnduserRequired) {
    this.isEnduserRequired = isEnduserRequired;
    return this;
  }

  /**
   * Do vendor requires Enduser name required to create an order.
   * @return isEnduserRequired
   */
  @javax.annotation.Nullable
  public Boolean getIsEnduserRequired() {
    return isEnduserRequired;
  }

  public void setIsEnduserRequired(@javax.annotation.Nullable Boolean isEnduserRequired) {
    this.isEnduserRequired = isEnduserRequired;
  }


  public ProductDetailResponseIndicators isHeavyWeight(@javax.annotation.Nullable Boolean isHeavyWeight) {
    this.isHeavyWeight = isHeavyWeight;
    return this;
  }

  /**
   * Boolean that indicates whether it’s  heavy weight product.
   * @return isHeavyWeight
   */
  @javax.annotation.Nullable
  public Boolean getIsHeavyWeight() {
    return isHeavyWeight;
  }

  public void setIsHeavyWeight(@javax.annotation.Nullable Boolean isHeavyWeight) {
    this.isHeavyWeight = isHeavyWeight;
  }


  public ProductDetailResponseIndicators hasLtl(@javax.annotation.Nullable Boolean hasLtl) {
    this.hasLtl = hasLtl;
    return this;
  }

  /**
   * Boolean that indicates whether it hasLtl or not.
   * @return hasLtl
   */
  @javax.annotation.Nullable
  public Boolean getHasLtl() {
    return hasLtl;
  }

  public void setHasLtl(@javax.annotation.Nullable Boolean hasLtl) {
    this.hasLtl = hasLtl;
  }


  public ProductDetailResponseIndicators isClearanceProduct(@javax.annotation.Nullable Boolean isClearanceProduct) {
    this.isClearanceProduct = isClearanceProduct;
    return this;
  }

  /**
   * Boolean that indicates whether it’s clearnce product.
   * @return isClearanceProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsClearanceProduct() {
    return isClearanceProduct;
  }

  public void setIsClearanceProduct(@javax.annotation.Nullable Boolean isClearanceProduct) {
    this.isClearanceProduct = isClearanceProduct;
  }


  public ProductDetailResponseIndicators hasBundle(@javax.annotation.Nullable Boolean hasBundle) {
    this.hasBundle = hasBundle;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a bundled product.
   * @return hasBundle
   */
  @javax.annotation.Nullable
  public Boolean getHasBundle() {
    return hasBundle;
  }

  public void setHasBundle(@javax.annotation.Nullable Boolean hasBundle) {
    this.hasBundle = hasBundle;
  }


  public ProductDetailResponseIndicators isOversizeProduct(@javax.annotation.Nullable Boolean isOversizeProduct) {
    this.isOversizeProduct = isOversizeProduct;
    return this;
  }

  /**
   * Boolean that indicates whether it’s oversized product.
   * @return isOversizeProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsOversizeProduct() {
    return isOversizeProduct;
  }

  public void setIsOversizeProduct(@javax.annotation.Nullable Boolean isOversizeProduct) {
    this.isOversizeProduct = isOversizeProduct;
  }


  public ProductDetailResponseIndicators isPreorderProduct(@javax.annotation.Nullable Boolean isPreorderProduct) {
    this.isPreorderProduct = isPreorderProduct;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a preorder product.
   * @return isPreorderProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsPreorderProduct() {
    return isPreorderProduct;
  }

  public void setIsPreorderProduct(@javax.annotation.Nullable Boolean isPreorderProduct) {
    this.isPreorderProduct = isPreorderProduct;
  }


  public ProductDetailResponseIndicators isLicenseProduct(@javax.annotation.Nullable Boolean isLicenseProduct) {
    this.isLicenseProduct = isLicenseProduct;
    return this;
  }

  /**
   * Boolean that indicates whether it’s a licened product.
   * @return isLicenseProduct
   */
  @javax.annotation.Nullable
  public Boolean getIsLicenseProduct() {
    return isLicenseProduct;
  }

  public void setIsLicenseProduct(@javax.annotation.Nullable Boolean isLicenseProduct) {
    this.isLicenseProduct = isLicenseProduct;
  }


  public ProductDetailResponseIndicators isDirectshipOrderable(@javax.annotation.Nullable Boolean isDirectshipOrderable) {
    this.isDirectshipOrderable = isDirectshipOrderable;
    return this;
  }

  /**
   * Boolean that indicates whether product is directship orderable.
   * @return isDirectshipOrderable
   */
  @javax.annotation.Nullable
  public Boolean getIsDirectshipOrderable() {
    return isDirectshipOrderable;
  }

  public void setIsDirectshipOrderable(@javax.annotation.Nullable Boolean isDirectshipOrderable) {
    this.isDirectshipOrderable = isDirectshipOrderable;
  }


  public ProductDetailResponseIndicators isServiceSku(@javax.annotation.Nullable Boolean isServiceSku) {
    this.isServiceSku = isServiceSku;
    return this;
  }

  /**
   * Boolean that indicates whether product is service SKU.
   * @return isServiceSku
   */
  @javax.annotation.Nullable
  public Boolean getIsServiceSku() {
    return isServiceSku;
  }

  public void setIsServiceSku(@javax.annotation.Nullable Boolean isServiceSku) {
    this.isServiceSku = isServiceSku;
  }


  public ProductDetailResponseIndicators isConfigurable(@javax.annotation.Nullable Boolean isConfigurable) {
    this.isConfigurable = isConfigurable;
    return this;
  }

  /**
   * Boolean that indicates whether product is configurable.
   * @return isConfigurable
   */
  @javax.annotation.Nullable
  public Boolean getIsConfigurable() {
    return isConfigurable;
  }

  public void setIsConfigurable(@javax.annotation.Nullable Boolean isConfigurable) {
    this.isConfigurable = isConfigurable;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailResponseIndicators productDetailResponseIndicators = (ProductDetailResponseIndicators) o;
    return Objects.equals(this.hasWarranty, productDetailResponseIndicators.hasWarranty) &&
        Objects.equals(this.isNewProduct, productDetailResponseIndicators.isNewProduct) &&
        Objects.equals(this.hasReturnLimits, productDetailResponseIndicators.hasReturnLimits) &&
        Objects.equals(this.isBackOrderAllowed, productDetailResponseIndicators.isBackOrderAllowed) &&
        Objects.equals(this.isShippedFromPartner, productDetailResponseIndicators.isShippedFromPartner) &&
        Objects.equals(this.isReplacementProduct, productDetailResponseIndicators.isReplacementProduct) &&
        Objects.equals(this.isDirectship, productDetailResponseIndicators.isDirectship) &&
        Objects.equals(this.isDownloadable, productDetailResponseIndicators.isDownloadable) &&
        Objects.equals(this.isDigitalType, productDetailResponseIndicators.isDigitalType) &&
        Objects.equals(this.skuType, productDetailResponseIndicators.skuType) &&
        Objects.equals(this.hasStdSpecialPrice, productDetailResponseIndicators.hasStdSpecialPrice) &&
        Objects.equals(this.hasAcopSpecialPrice, productDetailResponseIndicators.hasAcopSpecialPrice) &&
        Objects.equals(this.hasAcopQuantityBreak, productDetailResponseIndicators.hasAcopQuantityBreak) &&
        Objects.equals(this.hasStdWebDiscount, productDetailResponseIndicators.hasStdWebDiscount) &&
        Objects.equals(this.hasSpecialBid, productDetailResponseIndicators.hasSpecialBid) &&
        Objects.equals(this.isExportableToCountry, productDetailResponseIndicators.isExportableToCountry) &&
        Objects.equals(this.isDiscontinuedProduct, productDetailResponseIndicators.isDiscontinuedProduct) &&
        Objects.equals(this.isRefurbishedProduct, productDetailResponseIndicators.isRefurbishedProduct) &&
        Objects.equals(this.isReturnableProduct, productDetailResponseIndicators.isReturnableProduct) &&
        Objects.equals(this.isIngramShip, productDetailResponseIndicators.isIngramShip) &&
        Objects.equals(this.isEnduserRequired, productDetailResponseIndicators.isEnduserRequired) &&
        Objects.equals(this.isHeavyWeight, productDetailResponseIndicators.isHeavyWeight) &&
        Objects.equals(this.hasLtl, productDetailResponseIndicators.hasLtl) &&
        Objects.equals(this.isClearanceProduct, productDetailResponseIndicators.isClearanceProduct) &&
        Objects.equals(this.hasBundle, productDetailResponseIndicators.hasBundle) &&
        Objects.equals(this.isOversizeProduct, productDetailResponseIndicators.isOversizeProduct) &&
        Objects.equals(this.isPreorderProduct, productDetailResponseIndicators.isPreorderProduct) &&
        Objects.equals(this.isLicenseProduct, productDetailResponseIndicators.isLicenseProduct) &&
        Objects.equals(this.isDirectshipOrderable, productDetailResponseIndicators.isDirectshipOrderable) &&
        Objects.equals(this.isServiceSku, productDetailResponseIndicators.isServiceSku) &&
        Objects.equals(this.isConfigurable, productDetailResponseIndicators.isConfigurable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasWarranty, isNewProduct, hasReturnLimits, isBackOrderAllowed, isShippedFromPartner, isReplacementProduct, isDirectship, isDownloadable, isDigitalType, skuType, hasStdSpecialPrice, hasAcopSpecialPrice, hasAcopQuantityBreak, hasStdWebDiscount, hasSpecialBid, isExportableToCountry, isDiscontinuedProduct, isRefurbishedProduct, isReturnableProduct, isIngramShip, isEnduserRequired, isHeavyWeight, hasLtl, isClearanceProduct, hasBundle, isOversizeProduct, isPreorderProduct, isLicenseProduct, isDirectshipOrderable, isServiceSku, isConfigurable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailResponseIndicators {\n");
    sb.append("    hasWarranty: ").append(toIndentedString(hasWarranty)).append("\n");
    sb.append("    isNewProduct: ").append(toIndentedString(isNewProduct)).append("\n");
    sb.append("    hasReturnLimits: ").append(toIndentedString(hasReturnLimits)).append("\n");
    sb.append("    isBackOrderAllowed: ").append(toIndentedString(isBackOrderAllowed)).append("\n");
    sb.append("    isShippedFromPartner: ").append(toIndentedString(isShippedFromPartner)).append("\n");
    sb.append("    isReplacementProduct: ").append(toIndentedString(isReplacementProduct)).append("\n");
    sb.append("    isDirectship: ").append(toIndentedString(isDirectship)).append("\n");
    sb.append("    isDownloadable: ").append(toIndentedString(isDownloadable)).append("\n");
    sb.append("    isDigitalType: ").append(toIndentedString(isDigitalType)).append("\n");
    sb.append("    skuType: ").append(toIndentedString(skuType)).append("\n");
    sb.append("    hasStdSpecialPrice: ").append(toIndentedString(hasStdSpecialPrice)).append("\n");
    sb.append("    hasAcopSpecialPrice: ").append(toIndentedString(hasAcopSpecialPrice)).append("\n");
    sb.append("    hasAcopQuantityBreak: ").append(toIndentedString(hasAcopQuantityBreak)).append("\n");
    sb.append("    hasStdWebDiscount: ").append(toIndentedString(hasStdWebDiscount)).append("\n");
    sb.append("    hasSpecialBid: ").append(toIndentedString(hasSpecialBid)).append("\n");
    sb.append("    isExportableToCountry: ").append(toIndentedString(isExportableToCountry)).append("\n");
    sb.append("    isDiscontinuedProduct: ").append(toIndentedString(isDiscontinuedProduct)).append("\n");
    sb.append("    isRefurbishedProduct: ").append(toIndentedString(isRefurbishedProduct)).append("\n");
    sb.append("    isReturnableProduct: ").append(toIndentedString(isReturnableProduct)).append("\n");
    sb.append("    isIngramShip: ").append(toIndentedString(isIngramShip)).append("\n");
    sb.append("    isEnduserRequired: ").append(toIndentedString(isEnduserRequired)).append("\n");
    sb.append("    isHeavyWeight: ").append(toIndentedString(isHeavyWeight)).append("\n");
    sb.append("    hasLtl: ").append(toIndentedString(hasLtl)).append("\n");
    sb.append("    isClearanceProduct: ").append(toIndentedString(isClearanceProduct)).append("\n");
    sb.append("    hasBundle: ").append(toIndentedString(hasBundle)).append("\n");
    sb.append("    isOversizeProduct: ").append(toIndentedString(isOversizeProduct)).append("\n");
    sb.append("    isPreorderProduct: ").append(toIndentedString(isPreorderProduct)).append("\n");
    sb.append("    isLicenseProduct: ").append(toIndentedString(isLicenseProduct)).append("\n");
    sb.append("    isDirectshipOrderable: ").append(toIndentedString(isDirectshipOrderable)).append("\n");
    sb.append("    isServiceSku: ").append(toIndentedString(isServiceSku)).append("\n");
    sb.append("    isConfigurable: ").append(toIndentedString(isConfigurable)).append("\n");
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
    openapiFields.add("hasWarranty");
    openapiFields.add("isNewProduct");
    openapiFields.add("HasReturnLimits");
    openapiFields.add("IsBackOrderAllowed");
    openapiFields.add("isShippedFromPartner");
    openapiFields.add("isReplacementProduct");
    openapiFields.add("isDirectship");
    openapiFields.add("isDownloadable");
    openapiFields.add("isDigitalType");
    openapiFields.add("skuType");
    openapiFields.add("hasStdSpecialPrice");
    openapiFields.add("hasAcopSpecialPrice");
    openapiFields.add("hasAcopQuantityBreak");
    openapiFields.add("hasStdWebDiscount");
    openapiFields.add("hasSpecialBid");
    openapiFields.add("isExportableToCountry");
    openapiFields.add("isDiscontinuedProduct");
    openapiFields.add("isRefurbishedProduct");
    openapiFields.add("isReturnableProduct");
    openapiFields.add("isIngramShip");
    openapiFields.add("isEnduserRequired");
    openapiFields.add("isHeavyWeight");
    openapiFields.add("hasLtl");
    openapiFields.add("isClearanceProduct");
    openapiFields.add("hasBundle");
    openapiFields.add("isOversizeProduct");
    openapiFields.add("isPreorderProduct");
    openapiFields.add("isLicenseProduct");
    openapiFields.add("isDirectshipOrderable");
    openapiFields.add("isServiceSku");
    openapiFields.add("isConfigurable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductDetailResponseIndicators
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductDetailResponseIndicators.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductDetailResponseIndicators is not found in the empty JSON string", ProductDetailResponseIndicators.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductDetailResponseIndicators.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductDetailResponseIndicators` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("skuType") != null && !jsonObj.get("skuType").isJsonNull()) && !jsonObj.get("skuType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `skuType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("skuType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductDetailResponseIndicators.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductDetailResponseIndicators' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductDetailResponseIndicators> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductDetailResponseIndicators.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductDetailResponseIndicators>() {
           @Override
           public void write(JsonWriter out, ProductDetailResponseIndicators value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductDetailResponseIndicators read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductDetailResponseIndicators given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductDetailResponseIndicators
   * @throws IOException if the JSON string is invalid with respect to ProductDetailResponseIndicators
   */
  public static ProductDetailResponseIndicators fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductDetailResponseIndicators.class);
  }

  /**
   * Convert an instance of ProductDetailResponseIndicators to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

