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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Carrier
 */
@JsonPropertyOrder({
  Carrier.JSON_PROPERTY_MOBILE_COUNTRY_CODE,
  Carrier.JSON_PROPERTY_MOBILE_NETWORK_CODE,
  Carrier.JSON_PROPERTY_NAME,
  Carrier.JSON_PROPERTY_TYPE,
  Carrier.JSON_PROPERTY_ERROR_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Carrier {
  public static final String JSON_PROPERTY_MOBILE_COUNTRY_CODE = "mobile_country_code";
  private String mobileCountryCode;

  public static final String JSON_PROPERTY_MOBILE_NETWORK_CODE = "mobile_network_code";
  private String mobileNetworkCode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * A phone number type that identifies the type of service associated with the requested phone number
   */
  public enum TypeEnum {
    FIXED_LINE("fixed line"),
    
    MOBILE("mobile"),
    
    VOIP("voip"),
    
    FIXED_LINE_OR_MOBILE("fixed line or mobile"),
    
    TOLL_FREE("toll free"),
    
    PREMIUM_RATE("premium rate"),
    
    SHARED_COST("shared cost"),
    
    PERSONAL_NUMBER("personal number"),
    
    PAGER("pager"),
    
    UAN("uan"),
    
    VOICEMAIL("voicemail"),
    
    UNKNOWN("unknown");

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

  public static final String JSON_PROPERTY_ERROR_CODE = "error_code";
  private String errorCode;

  public Carrier() { 
  }

  public Carrier mobileCountryCode(String mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
    return this;
  }

   /**
   * Region code that matches the specific country calling code if the requested phone number type is mobile
   * @return mobileCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US", value = "Region code that matches the specific country calling code if the requested phone number type is mobile")
  @JsonProperty(JSON_PROPERTY_MOBILE_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileCountryCode() {
    return mobileCountryCode;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileCountryCode(String mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
  }


  public Carrier mobileNetworkCode(String mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
    return this;
  }

   /**
   * National destination code (NDC), with a 0 prefix, if an NDC is found and the requested phone number type is mobile
   * @return mobileNetworkCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0866", value = "National destination code (NDC), with a 0 prefix, if an NDC is found and the requested phone number type is mobile")
  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileNetworkCode() {
    return mobileNetworkCode;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE_NETWORK_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMobileNetworkCode(String mobileNetworkCode) {
    this.mobileNetworkCode = mobileNetworkCode;
  }


  public Carrier name(String name) {
    this.name = name;
    return this;
  }

   /**
   * SPID (Service Provider ID) name, if the requested phone number has been ported; otherwise, the name of carrier who owns the phone number block
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Telnyx/4", value = "SPID (Service Provider ID) name, if the requested phone number has been ported; otherwise, the name of carrier who owns the phone number block")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Carrier type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * A phone number type that identifies the type of service associated with the requested phone number
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "voip", value = "A phone number type that identifies the type of service associated with the requested phone number")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Carrier errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Unused
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unused")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * Return true if this Carrier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carrier carrier = (Carrier) o;
    return Objects.equals(this.mobileCountryCode, carrier.mobileCountryCode) &&
        Objects.equals(this.mobileNetworkCode, carrier.mobileNetworkCode) &&
        Objects.equals(this.name, carrier.name) &&
        Objects.equals(this.type, carrier.type) &&
        Objects.equals(this.errorCode, carrier.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobileCountryCode, mobileNetworkCode, name, type, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrier {\n");
    sb.append("    mobileCountryCode: ").append(toIndentedString(mobileCountryCode)).append("\n");
    sb.append("    mobileNetworkCode: ").append(toIndentedString(mobileNetworkCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

