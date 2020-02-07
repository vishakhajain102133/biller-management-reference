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
 * Biller Service Area Model
 */
@ApiModel(description = "Biller Service Area Model")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-30T10:30:57.815-06:00[America/Chicago]")
public class ConvenienceFeeModel {
  public static final String SERIALIZED_NAME_RECORD_ACTION = "recordAction";
  @SerializedName(SERIALIZED_NAME_RECORD_ACTION)
  private String recordAction;

  public static final String SERIALIZED_NAME_PAYMENT_TYPE = "paymentType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TYPE)
  private String paymentType;

  public static final String SERIALIZED_NAME_FLAT_FEE = "flatFee";
  @SerializedName(SERIALIZED_NAME_FLAT_FEE)
  private String flatFee;

  public static final String SERIALIZED_NAME_PERCENT_FEE = "percentFee";
  @SerializedName(SERIALIZED_NAME_PERCENT_FEE)
  private String percentFee;

  public ConvenienceFeeModel recordAction(String recordAction) {
    this.recordAction = recordAction;
    return this;
  }

   /**
   * Record Action, avaliable values are: Add, Delete and Update, only required when Biller action is &#39;Update&#39;
   * @return recordAction
  **/
  @ApiModelProperty(example = "Add", value = "Record Action, avaliable values are: Add, Delete and Update, only required when Biller action is 'Update'")
  public String getRecordAction() {
    return recordAction;
  }

  public void setRecordAction(String recordAction) {
    this.recordAction = recordAction;
  }

  public ConvenienceFeeModel paymentType(String paymentType) {
    this.paymentType = paymentType;
    return this;
  }

   /**
   * Payment Type, avaliable values are: CRDT, DEBT, PRPD, BANK
   * @return paymentType
  **/
  @ApiModelProperty(example = "CRDT", required = true, value = "Payment Type, avaliable values are: CRDT, DEBT, PRPD, BANK")
  public String getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(String paymentType) {
    this.paymentType = paymentType;
  }

  public ConvenienceFeeModel flatFee(String flatFee) {
    this.flatFee = flatFee;
    return this;
  }

   /**
   * Flat Fee
   * @return flatFee
  **/
  @ApiModelProperty(example = "2.0", required = true, value = "Flat Fee")
  public String getFlatFee() {
    return flatFee;
  }

  public void setFlatFee(String flatFee) {
    this.flatFee = flatFee;
  }

  public ConvenienceFeeModel percentFee(String percentFee) {
    this.percentFee = percentFee;
    return this;
  }

   /**
   * Percent Fee
   * @return percentFee
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "Percent Fee")
  public String getPercentFee() {
    return percentFee;
  }

  public void setPercentFee(String percentFee) {
    this.percentFee = percentFee;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvenienceFeeModel convenienceFeeModel = (ConvenienceFeeModel) o;
    return Objects.equals(this.recordAction, convenienceFeeModel.recordAction) &&
        Objects.equals(this.paymentType, convenienceFeeModel.paymentType) &&
        Objects.equals(this.flatFee, convenienceFeeModel.flatFee) &&
        Objects.equals(this.percentFee, convenienceFeeModel.percentFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordAction, paymentType, flatFee, percentFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvenienceFeeModel {\n");

    sb.append("    recordAction: ").append(toIndentedString(recordAction)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    flatFee: ").append(toIndentedString(flatFee)).append("\n");
    sb.append("    percentFee: ").append(toIndentedString(percentFee)).append("\n");
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

