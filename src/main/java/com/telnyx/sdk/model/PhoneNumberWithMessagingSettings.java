/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.NumberHealthMetrics;
import com.telnyx.sdk.model.PhoneNumberWithMessagingSettingsFeatures;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumberWithMessagingSettings
 */
@JsonPropertyOrder({
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_RECORD_TYPE,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_ID,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_MESSAGING_PROFILE_ID,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_CREATED_AT,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_UPDATED_AT,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_COUNTRY_CODE,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_TYPE,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_HEALTH,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_ELIGIBLE_MESSAGING_PRODUCTS,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_TRAFFIC_TYPE,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_MESSAGING_PRODUCT,
  PhoneNumberWithMessagingSettings.JSON_PROPERTY_FEATURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumberWithMessagingSettings {
  /**
   * Identifies the type of the resource.
   */
  public enum RecordTypeEnum {
    MESSAGING_PHONE_NUMBER("messaging_phone_number");

    private String value;

    RecordTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RecordTypeEnum fromValue(String value) {
      for (RecordTypeEnum b : RecordTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private RecordTypeEnum recordType;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phone_number";
  private String phoneNumber;

  public static final String JSON_PROPERTY_MESSAGING_PROFILE_ID = "messaging_profile_id";
  private JsonNullable<String> messagingProfileId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "country_code";
  private String countryCode;

  /**
   * The type of the phone number
   */
  public enum TypeEnum {
    LONG_CODE("long-code"),
    
    TOLL_FREE("toll-free"),
    
    SHORT_CODE("short-code"),
    
    LONGCODE("longcode"),
    
    TOLLFREE("tollfree"),
    
    SHORTCODE("shortcode");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_HEALTH = "health";
  private NumberHealthMetrics health;

  public static final String JSON_PROPERTY_ELIGIBLE_MESSAGING_PRODUCTS = "eligible_messaging_products";
  private List<String> eligibleMessagingProducts = null;

  public static final String JSON_PROPERTY_TRAFFIC_TYPE = "traffic_type";
  private String trafficType;

  public static final String JSON_PROPERTY_MESSAGING_PRODUCT = "messaging_product";
  private String messagingProduct;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private PhoneNumberWithMessagingSettingsFeatures features;


   /**
   * Identifies the type of the resource.
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "messaging_phone_number", value = "Identifies the type of the resource.")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }




   /**
   * Identifies the type of resource.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the type of resource.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * +E.164 formatted phone number.
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "+E.164 formatted phone number.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }




  public PhoneNumberWithMessagingSettings messagingProfileId(String messagingProfileId) {
    this.messagingProfileId = JsonNullable.<String>of(messagingProfileId);
    return this;
  }

   /**
   * Unique identifier for a messaging profile.
   * @return messagingProfileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier for a messaging profile.")
  @JsonIgnore

  public String getMessagingProfileId() {
        return messagingProfileId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMessagingProfileId_JsonNullable() {
    return messagingProfileId;
  }
  
  @JsonProperty(JSON_PROPERTY_MESSAGING_PROFILE_ID)
  public void setMessagingProfileId_JsonNullable(JsonNullable<String> messagingProfileId) {
    this.messagingProfileId = messagingProfileId;
  }

  public void setMessagingProfileId(String messagingProfileId) {
    this.messagingProfileId = JsonNullable.<String>of(messagingProfileId);
  }


   /**
   * ISO 8601 formatted date indicating when the resource was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was created.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * ISO 8601 formatted date indicating when the resource was updated.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 8601 formatted date indicating when the resource was updated.")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }




   /**
   * ISO 3166-1 alpha-2 country code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "ISO 3166-1 alpha-2 country code.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }




   /**
   * The type of the phone number
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the phone number")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }




  public PhoneNumberWithMessagingSettings health(NumberHealthMetrics health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NumberHealthMetrics getHealth() {
    return health;
  }


  public void setHealth(NumberHealthMetrics health) {
    this.health = health;
  }


   /**
   * The messaging products that this number can be registered to use
   * @return eligibleMessagingProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The messaging products that this number can be registered to use")
  @JsonProperty(JSON_PROPERTY_ELIGIBLE_MESSAGING_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEligibleMessagingProducts() {
    return eligibleMessagingProducts;
  }




   /**
   * The messaging traffic or use case for which the number is currently configured.
   * @return trafficType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P2P", value = "The messaging traffic or use case for which the number is currently configured.")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrafficType() {
    return trafficType;
  }




  public PhoneNumberWithMessagingSettings messagingProduct(String messagingProduct) {
    this.messagingProduct = messagingProduct;
    return this;
  }

   /**
   * The messaging product that the number is registered to use
   * @return messagingProduct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P2P", value = "The messaging product that the number is registered to use")
  @JsonProperty(JSON_PROPERTY_MESSAGING_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessagingProduct() {
    return messagingProduct;
  }


  public void setMessagingProduct(String messagingProduct) {
    this.messagingProduct = messagingProduct;
  }


  public PhoneNumberWithMessagingSettings features(PhoneNumberWithMessagingSettingsFeatures features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PhoneNumberWithMessagingSettingsFeatures getFeatures() {
    return features;
  }


  public void setFeatures(PhoneNumberWithMessagingSettingsFeatures features) {
    this.features = features;
  }


  /**
   * Return true if this PhoneNumberWithMessagingSettings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberWithMessagingSettings phoneNumberWithMessagingSettings = (PhoneNumberWithMessagingSettings) o;
    return Objects.equals(this.recordType, phoneNumberWithMessagingSettings.recordType) &&
        Objects.equals(this.id, phoneNumberWithMessagingSettings.id) &&
        Objects.equals(this.phoneNumber, phoneNumberWithMessagingSettings.phoneNumber) &&
        Objects.equals(this.messagingProfileId, phoneNumberWithMessagingSettings.messagingProfileId) &&
        Objects.equals(this.createdAt, phoneNumberWithMessagingSettings.createdAt) &&
        Objects.equals(this.updatedAt, phoneNumberWithMessagingSettings.updatedAt) &&
        Objects.equals(this.countryCode, phoneNumberWithMessagingSettings.countryCode) &&
        Objects.equals(this.type, phoneNumberWithMessagingSettings.type) &&
        Objects.equals(this.health, phoneNumberWithMessagingSettings.health) &&
        Objects.equals(this.eligibleMessagingProducts, phoneNumberWithMessagingSettings.eligibleMessagingProducts) &&
        Objects.equals(this.trafficType, phoneNumberWithMessagingSettings.trafficType) &&
        Objects.equals(this.messagingProduct, phoneNumberWithMessagingSettings.messagingProduct) &&
        Objects.equals(this.features, phoneNumberWithMessagingSettings.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, phoneNumber, messagingProfileId, createdAt, updatedAt, countryCode, type, health, eligibleMessagingProducts, trafficType, messagingProduct, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberWithMessagingSettings {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    messagingProfileId: ").append(toIndentedString(messagingProfileId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    eligibleMessagingProducts: ").append(toIndentedString(eligibleMessagingProducts)).append("\n");
    sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
    sb.append("    messagingProduct: ").append(toIndentedString(messagingProduct)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

}

