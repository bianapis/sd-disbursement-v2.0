package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionControlInputModelDisbursementTransactionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionControlInputModel
 */
public class CRDisbursementTransactionControlInputModel   {
  private String disbursementServicingSessionReference = null;

  private String disbursementTransactionInstanceReference = null;

  private Object disbursementTransactionControlActionTaskRecord = null;

  private CRDisbursementTransactionControlInputModelDisbursementTransactionControlActionRequest disbursementTransactionControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return disbursementTransactionControlActionTaskRecord
  **/

  public Object getDisbursementTransactionControlActionTaskRecord() {
    return disbursementTransactionControlActionTaskRecord;
  }

  public void setDisbursementTransactionControlActionTaskRecord(Object disbursementTransactionControlActionTaskRecord) {
    this.disbursementTransactionControlActionTaskRecord = disbursementTransactionControlActionTaskRecord;
  }


  /**
   * Get disbursementTransactionControlActionRequest
   * @return disbursementTransactionControlActionRequest
  **/

  public CRDisbursementTransactionControlInputModelDisbursementTransactionControlActionRequest getDisbursementTransactionControlActionRequest() {
    return disbursementTransactionControlActionRequest;
  }

  public void setDisbursementTransactionControlActionRequest(CRDisbursementTransactionControlInputModelDisbursementTransactionControlActionRequest disbursementTransactionControlActionRequest) {
    this.disbursementTransactionControlActionRequest = disbursementTransactionControlActionRequest;
  }


}

