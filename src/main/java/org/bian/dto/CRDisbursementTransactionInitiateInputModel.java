package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionInitiateInputModelDisbursementTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionInitiateInputModel
 */
public class CRDisbursementTransactionInitiateInputModel   {
  private String disbursementServicingSessionReference = null;

  private Object disbursementTransactionInitiateActionRecord = null;

  private String disbursementTransactionInstanceStatus = null;

  private CRDisbursementTransactionInitiateInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return disbursementServicingSessionReference
  **/

  public String getDisbursementServicingSessionReference() {
    return disbursementServicingSessionReference;
  }

  public void setDisbursementServicingSessionReference(String disbursementServicingSessionReference) {
    this.disbursementServicingSessionReference = disbursementServicingSessionReference;
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

  public CRDisbursementTransactionInitiateInputModelDisbursementTransactionInstanceRecord getDisbursementTransactionInstanceRecord() {
    return disbursementTransactionInstanceRecord;
  }

  public void setDisbursementTransactionInstanceRecord(CRDisbursementTransactionInitiateInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord) {
    this.disbursementTransactionInstanceRecord = disbursementTransactionInstanceRecord;
  }


}

