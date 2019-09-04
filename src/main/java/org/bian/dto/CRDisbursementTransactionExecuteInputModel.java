package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionExecuteInputModelDisbursementTransactionInstanceRecord;
import org.bian.dto.CRDisbursementTransactionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionExecuteInputModel
 */
public class CRDisbursementTransactionExecuteInputModel   {
  private String disbursementServicingSessionReference = null;

  private String disbursementTransactionInstanceReference = null;

  private CRDisbursementTransactionExecuteInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;

  private Object disbursementTransactionExecuteActionTaskRecord = null;

  private CRDisbursementTransactionExecuteInputModelExecuteRecordType executeRecordType = null;


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

  public CRDisbursementTransactionExecuteInputModelDisbursementTransactionInstanceRecord getDisbursementTransactionInstanceRecord() {
    return disbursementTransactionInstanceRecord;
  }

  public void setDisbursementTransactionInstanceRecord(CRDisbursementTransactionExecuteInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord) {
    this.disbursementTransactionInstanceRecord = disbursementTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return disbursementTransactionExecuteActionTaskRecord
  **/

  public Object getDisbursementTransactionExecuteActionTaskRecord() {
    return disbursementTransactionExecuteActionTaskRecord;
  }

  public void setDisbursementTransactionExecuteActionTaskRecord(Object disbursementTransactionExecuteActionTaskRecord) {
    this.disbursementTransactionExecuteActionTaskRecord = disbursementTransactionExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRDisbursementTransactionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRDisbursementTransactionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

