/*
 * Bill Pay Exchange Biller Management API
 * Biller Management Service
 *
 * OpenAPI spec version: 1.0.0
 * Contact: Bill_Pay_Development_Support@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.biller_management_client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServerErrorErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-30T10:30:57.815-06:00[America/Chicago]")
public class ServerErrorErrors {
  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private List<ErrorDetail> error = new ArrayList<ErrorDetail>();

  public ServerErrorErrors error(List<ErrorDetail> error) {
    this.error = error;
    return this;
  }

  public ServerErrorErrors addErrorItem(ErrorDetail errorItem) {
    this.error.add(errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(required = true, value = "")
  public List<ErrorDetail> getError() {
    return error;
  }

  public void setError(List<ErrorDetail> error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerErrorErrors serverErrorErrors = (ServerErrorErrors) o;
    return Objects.equals(this.error, serverErrorErrors.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerErrorErrors {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

