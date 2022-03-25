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
 * Queue
 */
@JsonPropertyOrder({
  Queue.JSON_PROPERTY_RECORD_TYPE,
  Queue.JSON_PROPERTY_ID,
  Queue.JSON_PROPERTY_NAME,
  Queue.JSON_PROPERTY_CREATED_AT,
  Queue.JSON_PROPERTY_UPDATED_AT,
  Queue.JSON_PROPERTY_CURRENT_SIZE,
  Queue.JSON_PROPERTY_MAX_SIZE,
  Queue.JSON_PROPERTY_AVERAGE_WAIT_TIME_SECS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Queue {
  /**
   * Gets or Sets recordType
   */
  public enum RecordTypeEnum {
    QUEUE("queue");

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

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public static final String JSON_PROPERTY_CURRENT_SIZE = "current_size";
  private Integer currentSize;

  public static final String JSON_PROPERTY_MAX_SIZE = "max_size";
  private Integer maxSize;

  public static final String JSON_PROPERTY_AVERAGE_WAIT_TIME_SECS = "average_wait_time_secs";
  private Integer averageWaitTimeSecs;

  public Queue() { 
  }

  public Queue recordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "queue", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RecordTypeEnum getRecordType() {
    return recordType;
  }


  @JsonProperty(JSON_PROPERTY_RECORD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecordType(RecordTypeEnum recordType) {
    this.recordType = recordType;
  }


  public Queue id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Uniquely identifies the queue
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", required = true, value = "Uniquely identifies the queue")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public Queue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the queue
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "support", required = true, value = "Name of the queue")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public Queue createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the queue was created
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-01-23T18:10:02.574Z", required = true, value = "ISO 8601 formatted date of when the queue was created")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Queue updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * ISO 8601 formatted date of when the queue was last updated
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-01-23T18:10:02.574Z", required = true, value = "ISO 8601 formatted date of when the queue was last updated")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Queue currentSize(Integer currentSize) {
    this.currentSize = currentSize;
    return this;
  }

   /**
   * The number of calls currently in the queue
   * @return currentSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "The number of calls currently in the queue")
  @JsonProperty(JSON_PROPERTY_CURRENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCurrentSize() {
    return currentSize;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentSize(Integer currentSize) {
    this.currentSize = currentSize;
  }


  public Queue maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * The maximum number of calls allowed in the queue
   * @return maxSize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50", required = true, value = "The maximum number of calls allowed in the queue")
  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getMaxSize() {
    return maxSize;
  }


  @JsonProperty(JSON_PROPERTY_MAX_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }


  public Queue averageWaitTimeSecs(Integer averageWaitTimeSecs) {
    this.averageWaitTimeSecs = averageWaitTimeSecs;
    return this;
  }

   /**
   * The average time that the calls currently in the queue have spent waiting, given in seconds.
   * @return averageWaitTimeSecs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "175", required = true, value = "The average time that the calls currently in the queue have spent waiting, given in seconds.")
  @JsonProperty(JSON_PROPERTY_AVERAGE_WAIT_TIME_SECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAverageWaitTimeSecs() {
    return averageWaitTimeSecs;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_WAIT_TIME_SECS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAverageWaitTimeSecs(Integer averageWaitTimeSecs) {
    this.averageWaitTimeSecs = averageWaitTimeSecs;
  }


  /**
   * Return true if this Queue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Queue queue = (Queue) o;
    return Objects.equals(this.recordType, queue.recordType) &&
        Objects.equals(this.id, queue.id) &&
        Objects.equals(this.name, queue.name) &&
        Objects.equals(this.createdAt, queue.createdAt) &&
        Objects.equals(this.updatedAt, queue.updatedAt) &&
        Objects.equals(this.currentSize, queue.currentSize) &&
        Objects.equals(this.maxSize, queue.maxSize) &&
        Objects.equals(this.averageWaitTimeSecs, queue.averageWaitTimeSecs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordType, id, name, createdAt, updatedAt, currentSize, maxSize, averageWaitTimeSecs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Queue {\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    averageWaitTimeSecs: ").append(toIndentedString(averageWaitTimeSecs)).append("\n");
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

