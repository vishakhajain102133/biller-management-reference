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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Request Model class for Biller Management API
 */
@ApiModel(description = "Request Model class for Biller Management API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-30T10:30:57.815-06:00[America/Chicago]")
public class BillerManagementRequest {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "effectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private String effectiveDate;

  public static final String SERIALIZED_NAME_GENERAL = "general";
  @SerializedName(SERIALIZED_NAME_GENERAL)
  private GeneralModel general = null;

  public static final String SERIALIZED_NAME_SERVICE_RELATIONSHIPS = "serviceRelationships";
  @SerializedName(SERIALIZED_NAME_SERVICE_RELATIONSHIPS)
  private List<ServiceRelationshipModel> serviceRelationships = new ArrayList<ServiceRelationshipModel>();

  public static final String SERIALIZED_NAME_CARD_PAYMENT_SUPPORT = "cardPaymentSupport";
  @SerializedName(SERIALIZED_NAME_CARD_PAYMENT_SUPPORT)
  private CardPaymentModel cardPaymentSupport = null;

  public static final String SERIALIZED_NAME_CONVENIENCE_FEES = "convenienceFees";
  @SerializedName(SERIALIZED_NAME_CONVENIENCE_FEES)
  private List<ConvenienceFeeModel> convenienceFees = null;

  public static final String SERIALIZED_NAME_SERVICE_AREAS = "serviceAreas";
  @SerializedName(SERIALIZED_NAME_SERVICE_AREAS)
  private ServiceAreaModel serviceAreas = null;

  public static final String SERIALIZED_NAME_CONSUMER_AUTHS = "consumerAuths";
  @SerializedName(SERIALIZED_NAME_CONSUMER_AUTHS)
  private List<ConsumerAuthenticationModel> consumerAuths = null;

  public static final String SERIALIZED_NAME_DEACTIVATION = "deactivation";
  @SerializedName(SERIALIZED_NAME_DEACTIVATION)
  private DeactivationModel deactivation = null;

  public BillerManagementRequest action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Biller Action, avaliable values are: Add, Update, Deactivate
   * @return action
  **/
  @ApiModelProperty(example = "Add", required = true, value = "Biller Action, avaliable values are: Add, Update, Deactivate")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public BillerManagementRequest effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * Effective Date, format MM/DD/YYYY
   * @return effectiveDate
  **/
  @ApiModelProperty(example = "04/01/2020", required = true, value = "Effective Date, format MM/DD/YYYY")
  public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public BillerManagementRequest general(GeneralModel general) {
    this.general = general;
    return this;
  }

   /**
   * Get general
   * @return general
  **/
  @ApiModelProperty(required = true, value = "")
  public GeneralModel getGeneral() {
    return general;
  }

  public void setGeneral(GeneralModel general) {
    this.general = general;
  }

  public BillerManagementRequest serviceRelationships(List<ServiceRelationshipModel> serviceRelationships) {
    this.serviceRelationships = serviceRelationships;
    return this;
  }

  public BillerManagementRequest addServiceRelationshipsItem(ServiceRelationshipModel serviceRelationshipsItem) {
    this.serviceRelationships.add(serviceRelationshipsItem);
    return this;
  }

   /**
   * Service Relationship List, currently only allow 1 service relationship per Biller
   * @return serviceRelationships
  **/
  @ApiModelProperty(required = true, value = "Service Relationship List, currently only allow 1 service relationship per Biller")
  public List<ServiceRelationshipModel> getServiceRelationships() {
    return serviceRelationships;
  }

  public void setServiceRelationships(List<ServiceRelationshipModel> serviceRelationships) {
    this.serviceRelationships = serviceRelationships;
  }

  public BillerManagementRequest cardPaymentSupport(CardPaymentModel cardPaymentSupport) {
    this.cardPaymentSupport = cardPaymentSupport;
    return this;
  }

   /**
   * Get cardPaymentSupport
   * @return cardPaymentSupport
  **/
  @ApiModelProperty(value = "")
  public CardPaymentModel getCardPaymentSupport() {
    return cardPaymentSupport;
  }

  public void setCardPaymentSupport(CardPaymentModel cardPaymentSupport) {
    this.cardPaymentSupport = cardPaymentSupport;
  }

  public BillerManagementRequest convenienceFees(List<ConvenienceFeeModel> convenienceFees) {
    this.convenienceFees = convenienceFees;
    return this;
  }

  public BillerManagementRequest addConvenienceFeesItem(ConvenienceFeeModel convenienceFeesItem) {
    if (this.convenienceFees == null) {
      this.convenienceFees = new ArrayList<ConvenienceFeeModel>();
    }
    this.convenienceFees.add(convenienceFeesItem);
    return this;
  }

   /**
   * Convenience Fee List, only required when convenience fee flag in General is set to &#39;Yes&#39;
   * @return convenienceFees
  **/
  @ApiModelProperty(value = "Convenience Fee List, only required when convenience fee flag in General is set to 'Yes'")
  public List<ConvenienceFeeModel> getConvenienceFees() {
    return convenienceFees;
  }

  public void setConvenienceFees(List<ConvenienceFeeModel> convenienceFees) {
    this.convenienceFees = convenienceFees;
  }

  public BillerManagementRequest serviceAreas(ServiceAreaModel serviceAreas) {
    this.serviceAreas = serviceAreas;
    return this;
  }

   /**
   * Get serviceAreas
   * @return serviceAreas
  **/
  @ApiModelProperty(required = true, value = "")
  public ServiceAreaModel getServiceAreas() {
    return serviceAreas;
  }

  public void setServiceAreas(ServiceAreaModel serviceAreas) {
    this.serviceAreas = serviceAreas;
  }

  public BillerManagementRequest consumerAuths(List<ConsumerAuthenticationModel> consumerAuths) {
    this.consumerAuths = consumerAuths;
    return this;
  }

  public BillerManagementRequest addConsumerAuthsItem(ConsumerAuthenticationModel consumerAuthsItem) {
    if (this.consumerAuths == null) {
      this.consumerAuths = new ArrayList<ConsumerAuthenticationModel>();
    }
    this.consumerAuths.add(consumerAuthsItem);
    return this;
  }

   /**
   * Consumer Authentication List, maximum 3 consumer authentications allowed per Biller
   * @return consumerAuths
  **/
  @ApiModelProperty(value = "Consumer Authentication List, maximum 3 consumer authentications allowed per Biller")
  public List<ConsumerAuthenticationModel> getConsumerAuths() {
    return consumerAuths;
  }

  public void setConsumerAuths(List<ConsumerAuthenticationModel> consumerAuths) {
    this.consumerAuths = consumerAuths;
  }

  public BillerManagementRequest deactivation(DeactivationModel deactivation) {
    this.deactivation = deactivation;
    return this;
  }

   /**
   * Get deactivation
   * @return deactivation
  **/
  @ApiModelProperty(value = "")
  public DeactivationModel getDeactivation() {
    return deactivation;
  }

  public void setDeactivation(DeactivationModel deactivation) {
    this.deactivation = deactivation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillerManagementRequest billerManagementRequest = (BillerManagementRequest) o;
    return Objects.equals(this.action, billerManagementRequest.action) &&
        Objects.equals(this.effectiveDate, billerManagementRequest.effectiveDate) &&
        Objects.equals(this.general, billerManagementRequest.general) &&
        Objects.equals(this.serviceRelationships, billerManagementRequest.serviceRelationships) &&
        Objects.equals(this.cardPaymentSupport, billerManagementRequest.cardPaymentSupport) &&
        Objects.equals(this.convenienceFees, billerManagementRequest.convenienceFees) &&
        Objects.equals(this.serviceAreas, billerManagementRequest.serviceAreas) &&
        Objects.equals(this.consumerAuths, billerManagementRequest.consumerAuths) &&
        Objects.equals(this.deactivation, billerManagementRequest.deactivation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, effectiveDate, general, serviceRelationships, cardPaymentSupport, convenienceFees, serviceAreas, consumerAuths, deactivation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillerManagementRequest {\n");

    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
    sb.append("    serviceRelationships: ").append(toIndentedString(serviceRelationships)).append("\n");
    sb.append("    cardPaymentSupport: ").append(toIndentedString(cardPaymentSupport)).append("\n");
    sb.append("    convenienceFees: ").append(toIndentedString(convenienceFees)).append("\n");
    sb.append("    serviceAreas: ").append(toIndentedString(serviceAreas)).append("\n");
    sb.append("    consumerAuths: ").append(toIndentedString(consumerAuths)).append("\n");
    sb.append("    deactivation: ").append(toIndentedString(deactivation)).append("\n");
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
