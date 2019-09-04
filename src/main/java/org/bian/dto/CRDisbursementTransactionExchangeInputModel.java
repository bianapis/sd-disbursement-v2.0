package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionExchangeInputModelDisbursementTransactionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionExchangeInputModel
 */
public class CRDisbursementTransactionExchangeInputModel   {
  private String disbursementServicingSessionReference = null;

  private String disbursementTransactionInstanceReference = null;

  private Object disbursementTransactionExchangeActionTaskRecord = null;

  private CRDisbursementTransactionExchangeInputModelDisbursementTransactionExchangeActionRequest disbursementTransactionExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return disbursementTransactionExchangeActionTaskRecord
  **/

  public Object getDisbursementTransactionExchangeActionTaskRecord() {
    return disbursementTransactionExchangeActionTaskRecord;
  }

  public void setDisbursementTransactionExchangeActionTaskRecord(Object disbursementTransactionExchangeActionTaskRecord) {
    this.disbursementTransactionExchangeActionTaskRecord = disbursementTransactionExchangeActionTaskRecord;
  }


  /**
   * Get disbursementTransactionExchangeActionRequest
   * @return disbursementTransactionExchangeActionRequest
  **/

  public CRDisbursementTransactionExchangeInputModelDisbursementTransactionExchangeActionRequest getDisbursementTransactionExchangeActionRequest() {
    return disbursementTransactionExchangeActionRequest;
  }

  public void setDisbursementTransactionExchangeActionRequest(CRDisbursementTransactionExchangeInputModelDisbursementTransactionExchangeActionRequest disbursementTransactionExchangeActionRequest) {
    this.disbursementTransactionExchangeActionRequest = disbursementTransactionExchangeActionRequest;
  }


}

