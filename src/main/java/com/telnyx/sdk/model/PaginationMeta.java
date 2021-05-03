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
 * PaginationMeta
 */
@JsonPropertyOrder({
  PaginationMeta.JSON_PROPERTY_PAGE_NUMBER,
  PaginationMeta.JSON_PROPERTY_PAGE_SIZE,
  PaginationMeta.JSON_PROPERTY_TOTAL_PAGES,
  PaginationMeta.JSON_PROPERTY_TOTAL_RESULTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PaginationMeta {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "page_number";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Integer pageSize;

  public static final String JSON_PROPERTY_TOTAL_PAGES = "total_pages";
  private Integer totalPages;

  public static final String JSON_PROPERTY_TOTAL_RESULTS = "total_results";
  private Integer totalResults;


  public PaginationMeta pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public PaginationMeta pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Get pageSize
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "25", value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public PaginationMeta totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  public PaginationMeta totalResults(Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

   /**
   * Get totalResults
   * @return totalResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "55", value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalResults() {
    return totalResults;
  }


  public void setTotalResults(Integer totalResults) {
    this.totalResults = totalResults;
  }


  /**
   * Return true if this PaginationMeta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationMeta paginationMeta = (PaginationMeta) o;
    return Objects.equals(this.pageNumber, paginationMeta.pageNumber) &&
        Objects.equals(this.pageSize, paginationMeta.pageSize) &&
        Objects.equals(this.totalPages, paginationMeta.totalPages) &&
        Objects.equals(this.totalResults, paginationMeta.totalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageSize, totalPages, totalResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationMeta {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
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

