package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionInitiateOutputModelDisbursementTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionInitiateOutputModel
 */
public class CRDisbursementTransactionInitiateOutputModel   {
  private String disbursementTransactionInstanceReference = null;

  private String disbursementTransactionInitiateActionReference = null;

  private Object disbursementTransactionInitiateActionRecord = null;

  private String disbursementTransactionInstanceStatus = null;

  private CRDisbursementTransactionInitiateOutputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Disbursement Transaction instance 
   * @return disbursementTransactionInstanceReference
  **/

  public String getDisbursementTransactionInstanceReference() {
    return disbursementTransactionInstanceReference;
  }

  public void setDisbursementTransactionInstanceReference(String disbursementTransactionInstanceReference) {
    this.disbursementTransactionInstanceReference = disbursementTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return disbursementTransactionInitiateActionReference
  **/

  public String getDisbursementTransactionInitiateActionReference() {
    return disbursementTransactionInitiateActionReference;
  }

  public void setDisbursementTransactionInitiateActionReference(String disbursementTransactionInitiateActionReference) {
    this.disbursementTransactionInitiateActionReference = disbursementTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return disbursementTransactionInitiateActionRecord
  **/

  public Object getDisbursementTransactionInitiateActionRecord() {
    return disbursementTransactionInitiateActionRecord;
  }

  public void setDisbursementTransactionInitiateActionRecord(Object disbursementTransactionInitiateActionRecord) {
    this.disbursementTransactionInitiateActionRecord = disbursementTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Disbursement Transaction instance (e.g. initialised, pending, active) 
   * @return disbursementTransactionInstanceStatus
  **/

  public String getDisbursementTransactionInstanceStatus() {
    return disbursementTransactionInstanceStatus;
  }

  public void setDisbursementTransactionInstanceStatus(String disbursementTransactionInstanceStatus) {
    this.disbursementTransactionInstanceStatus = disbursementTransactionInstanceStatus;
  }


  /**
   * Get disbursementTransactionInstanceRecord
   * @return disbursementTransactionInstanceRecord
  **/

  public CRDisbursementTransactionInitiateOutputModelDisbursementTransactionInstanceRecord getDisbursementTransactionInstanceRecord() {
    return disbursementTransactionInstanceRecord;
  }

  public void setDisbursementTransactionInstanceRecord(CRDisbursementTransactionInitiateOutputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord) {
    this.disbursementTransactionInstanceRecord = disbursementTransactionInstanceRecord;
  }


}

