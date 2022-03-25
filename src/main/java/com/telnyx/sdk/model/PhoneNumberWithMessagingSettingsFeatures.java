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
import com.telnyx.sdk.model.MessagingFeatureSet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * PhoneNumberWithMessagingSettingsFeatures
 */
@JsonPropertyOrder({
  PhoneNumberWithMessagingSettingsFeatures.JSON_PROPERTY_SMS,
  PhoneNumberWithMessagingSettingsFeatures.JSON_PROPERTY_MMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PhoneNumberWithMessagingSettingsFeatures {
  public static final String JSON_PROPERTY_SMS = "sms";
  private JsonNullable<MessagingFeatureSet> sms = JsonNullable.<MessagingFeatureSet>undefined();

  public static final String JSON_PROPERTY_MMS = "mms";
  private JsonNullable<MessagingFeatureSet> mms = JsonNullable.<MessagingFeatureSet>undefined();

  public PhoneNumberWithMessagingSettingsFeatures() { 
  }

  public PhoneNumberWithMessagingSettingsFeatures sms(MessagingFeatureSet sms) {
    this.sms = JsonNullable.<MessagingFeatureSet>of(sms);
    return this;
  }

   /**
   * Get sms
   * @return sms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public MessagingFeatureSet getSms() {
        return sms.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MessagingFeatureSet> getSms_JsonNullable() {
    return sms;
  }
  
  @JsonProperty(JSON_PROPERTY_SMS)
  public void setSms_JsonNullable(JsonNullable<MessagingFeatureSet> sms) {
    this.sms = sms;
  }

  public void setSms(MessagingFeatureSet sms) {
    this.sms = JsonNullable.<MessagingFeatureSet>of(sms);
  }


  public PhoneNumberWithMessagingSettingsFeatures mms(MessagingFeatureSet mms) {
    this.mms = JsonNullable.<MessagingFeatureSet>of(mms);
    return this;
  }

   /**
   * Get mms
   * @return mms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public MessagingFeatureSet getMms() {
        return mms.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<MessagingFeatureSet> getMms_JsonNullable() {
    return mms;
  }
  
  @JsonProperty(JSON_PROPERTY_MMS)
  public void setMms_JsonNullable(JsonNullable<MessagingFeatureSet> mms) {
    this.mms = mms;
  }

  public void setMms(MessagingFeatureSet mms) {
    this.mms = JsonNullable.<MessagingFeatureSet>of(mms);
  }


  /**
   * Return true if this PhoneNumberWithMessagingSettings_features object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberWithMessagingSettingsFeatures phoneNumberWithMessagingSettingsFeatures = (PhoneNumberWithMessagingSettingsFeatures) o;
    return equalsNullable(this.sms, phoneNumberWithMessagingSettingsFeatures.sms) &&
        equalsNullable(this.mms, phoneNumberWithMessagingSettingsFeatures.mms);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(sms), hashCodeNullable(mms));
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
    sb.append("class PhoneNumberWithMessagingSettingsFeatures {\n");
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    mms: ").append(toIndentedString(mms)).append("\n");
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

