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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * The object containing the Array of SIM card registration codes.
 */
@ApiModel(description = "The object containing the Array of SIM card registration codes.")
@JsonPropertyOrder({
  CreateSIMCardValidateRequest.JSON_PROPERTY_REGISTRATION_CODES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateSIMCardValidateRequest {
  public static final String JSON_PROPERTY_REGISTRATION_CODES = "registration_codes";
  private List<String> registrationCodes = null;

  public CreateSIMCardValidateRequest() { 
  }

  public CreateSIMCardValidateRequest registrationCodes(List<String> registrationCodes) {
    this.registrationCodes = registrationCodes;
    return this;
  }

  public CreateSIMCardValidateRequest addRegistrationCodesItem(String registrationCodesItem) {
    if (this.registrationCodes == null) {
      this.registrationCodes = new ArrayList<>();
    }
    this.registrationCodes.add(registrationCodesItem);
    return this;
  }

   /**
   * Get registrationCodes
   * @return registrationCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGISTRATION_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRegistrationCodes() {
    return registrationCodes;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION_CODES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationCodes(List<String> registrationCodes) {
    this.registrationCodes = registrationCodes;
  }


  /**
   * Return true if this Create_SIM_Card_Validate_Request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSIMCardValidateRequest createSIMCardValidateRequest = (CreateSIMCardValidateRequest) o;
    return Objects.equals(this.registrationCodes, createSIMCardValidateRequest.registrationCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registrationCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSIMCardValidateRequest {\n");
    sb.append("    registrationCodes: ").append(toIndentedString(registrationCodes)).append("\n");
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

