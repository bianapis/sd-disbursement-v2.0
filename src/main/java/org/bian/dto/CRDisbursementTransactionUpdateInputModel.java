package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionUpdateInputModelDisbursementTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionUpdateInputModel
 */
public class CRDisbursementTransactionUpdateInputModel   {
  private String disbursementServicingSessionReference = null;

  private String disbursementTransactionInstanceReference = null;

  private CRDisbursementTransactionUpdateInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;

  private Object disbursementTransactionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get disbursementTransactionInstanceRecord
   * @return disbursementTransactionInstanceRecord
  **/

  public CRDisbursementTransactionUpdateInputModelDisbursementTransactionInstanceRecord getDisbursementTransactionInstanceRecord() {
    return disbursementTransactionInstanceRecord;
  }

  public void setDisbursementTransactionInstanceRecord(CRDisbursementTransactionUpdateInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord) {
    this.disbursementTransactionInstanceRecord = disbursementTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return disbursementTransactionUpdateActionTaskRecord
  **/

  public Object getDisbursementTransactionUpdateActionTaskRecord() {
    return disbursementTransactionUpdateActionTaskRecord;
  }

  public void setDisbursementTransactionUpdateActionTaskRecord(Object disbursementTransactionUpdateActionTaskRecord) {
    this.disbursementTransactionUpdateActionTaskRecord = disbursementTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

