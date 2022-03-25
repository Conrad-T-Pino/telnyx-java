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
 * UpdateManagedAccountRequest
 */
@JsonPropertyOrder({
  UpdateManagedAccountRequest.JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateManagedAccountRequest {
  public static final String JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING = "managed_account_allow_custom_pricing";
  private Boolean managedAccountAllowCustomPricing;

  public UpdateManagedAccountRequest() { 
  }

  public UpdateManagedAccountRequest managedAccountAllowCustomPricing(Boolean managedAccountAllowCustomPricing) {
    this.managedAccountAllowCustomPricing = managedAccountAllowCustomPricing;
    return this;
  }

   /**
   * Boolean value that indicates if the managed account is able to have custom pricing set for it or not. If false, uses the pricing of the manager account. Defaults to false. This value may be changed, but there may be time lag between when the value is changed and pricing changes take effect.
   * @return managedAccountAllowCustomPricing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Boolean value that indicates if the managed account is able to have custom pricing set for it or not. If false, uses the pricing of the manager account. Defaults to false. This value may be changed, but there may be time lag between when the value is changed and pricing changes take effect.")
  @JsonProperty(JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getManagedAccountAllowCustomPricing() {
    return managedAccountAllowCustomPricing;
  }


  @JsonProperty(JSON_PROPERTY_MANAGED_ACCOUNT_ALLOW_CUSTOM_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManagedAccountAllowCustomPricing(Boolean managedAccountAllowCustomPricing) {
    this.managedAccountAllowCustomPricing = managedAccountAllowCustomPricing;
  }


  /**
   * Return true if this UpdateManagedAccountRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateManagedAccountRequest updateManagedAccountRequest = (UpdateManagedAccountRequest) o;
    return Objects.equals(this.managedAccountAllowCustomPricing, updateManagedAccountRequest.managedAccountAllowCustomPricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedAccountAllowCustomPricing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateManagedAccountRequest {\n");
    sb.append("    managedAccountAllowCustomPricing: ").append(toIndentedString(managedAccountAllowCustomPricing)).append("\n");
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

