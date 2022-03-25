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
 * RegulatoryRequirementCriteria
 */
@JsonPropertyOrder({
  RegulatoryRequirementCriteria.JSON_PROPERTY_RECORD_TYPE,
  RegulatoryRequirementCriteria.JSON_PROPERTY_CRITERIA_TYPE,
  RegulatoryRequirementCriteria.JSON_PROPERTY_CRITERIA_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RegulatoryRequirementCriteria {
  public static final String JSON_PROPERTY_RECORD_TYPE = "record_type";
  private String recordType;

  /**
   * Gets or Sets criteriaType
   */
  public enum CriteriaTypeEnum {
    COUNTRY("country"),
    
    PHONE_NUMBER_TYPE("phone_number_type");

    private String value;

    CriteriaTypeEnum(String value) {
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
    public static CriteriaTypeEnum fromValue(String value) {
      for (CriteriaTypeEnum b : CriteriaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CRITERIA_TYPE = "criteria_type";
  private CriteriaTypeEnum criteriaType;

  public static final String JSON_PROPERTY_CRITERIA_VALUE = "criteria_value";
  private String criteriaValue;

  public RegulatoryRequirementCriteria() { 
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "phone_number_regulatory_requirement_criteria", value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecordType() {
    return recordType;
  }




   /**
   * Get criteriaType
   * @return criteriaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITERIA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CriteriaTypeEnum getCriteriaType() {
    return criteriaType;
  }




   /**
   * Get criteriaValue
   * @return criteriaValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AU", value = "")
  @JsonProperty(JSON_PROPERTY_CRITERIA_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCriteriaValue() {
    return criteriaValue;
  }




  /**
   * Return true if this RegulatoryRequirementCriteria object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegulatoryRequirementCriteria regulatoryRequirementCriteria = (RegulatoryRequirementCriteria) o;
    return Objects.equals(this.recordType, regulatoryRequirementCriteria.recordType) &&
        Objects.equals(this.criteriaType, regulatoryRequirementCriteria.criteriaType) &&
        Objects.equals(this.criteriaValue, regulatoryRequirementCriteria.criteriaValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, criteriaType, criteriaValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegulatoryRequirementCriteria {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    criteriaType: ").append(toIndentedString(criteriaType)).append("\n");
    sb.append("    criteriaValue: ").append(toIndentedString(criteriaValue)).append("\n");
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

