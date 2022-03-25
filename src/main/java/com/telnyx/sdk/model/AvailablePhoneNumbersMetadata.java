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
 * AvailablePhoneNumbersMetadata
 */
@JsonPropertyOrder({
  AvailablePhoneNumbersMetadata.JSON_PROPERTY_TOTAL_RESULTS,
  AvailablePhoneNumbersMetadata.JSON_PROPERTY_BEST_EFFORT_RESULTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvailablePhoneNumbersMetadata {
  public static final String JSON_PROPERTY_TOTAL_RESULTS = "total_results";
  private Integer totalResults;

  public static final String JSON_PROPERTY_BEST_EFFORT_RESULTS = "best_effort_results";
  private Integer bestEffortResults;

  public AvailablePhoneNumbersMetadata() { 
  }

  public AvailablePhoneNumbersMetadata totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalResults() {
    return totalResults;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  public AvailablePhoneNumbersMetadata bestEffortResults(Integer bestEffortResults) {
    this.bestEffortResults = bestEffortResults;
    return this;
  }

   /**
   * Get bestEffortResults
   * @return bestEffortResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BEST_EFFORT_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBestEffortResults() {
    return bestEffortResults;
  }


  @JsonProperty(JSON_PROPERTY_BEST_EFFORT_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBestEffortResults(Integer bestEffortResults) {
    this.bestEffortResults = bestEffortResults;
  }


  /**
   * Return true if this AvailablePhoneNumbersMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailablePhoneNumbersMetadata availablePhoneNumbersMetadata = (AvailablePhoneNumbersMetadata) o;
    return Objects.equals(this.totalResults, availablePhoneNumbersMetadata.totalResults) &&
        Objects.equals(this.bestEffortResults, availablePhoneNumbersMetadata.bestEffortResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResults, bestEffortResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailablePhoneNumbersMetadata {\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    bestEffortResults: ").append(toIndentedString(bestEffortResults)).append("\n");
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

