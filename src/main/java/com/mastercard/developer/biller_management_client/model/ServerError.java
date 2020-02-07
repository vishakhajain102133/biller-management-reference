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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Biller Management API Server Error Model
 */
@ApiModel(description = "Biller Management API Server Error Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-30T10:30:57.815-06:00[America/Chicago]")
public class ServerError {
  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private ServerErrorErrors errors = null;

  public ServerError errors(ServerErrorErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")
  public ServerErrorErrors getErrors() {
    return errors;
  }

  public void setErrors(ServerErrorErrors errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerError serverError = (ServerError) o;
    return Objects.equals(this.errors, serverError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerError {\n");

    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
