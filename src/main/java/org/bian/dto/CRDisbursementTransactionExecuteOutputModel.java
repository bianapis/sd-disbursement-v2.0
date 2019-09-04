package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionExecuteInputModelDisbursementTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionExecuteOutputModel
 */
public class CRDisbursementTransactionExecuteOutputModel   {
  private CRDisbursementTransactionExecuteInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;

  private String disbursementTransactionExecuteActionTaskReference = null;

  private Object disbursementTransactionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disbursement Transaction instance execute service call 
   * @return disbursementTransactionExecuteActionTaskReference
  **/

  public String getDisbursementTransactionExecuteActionTaskReference() {
    return disbursementTransactionExecuteActionTaskReference;
  }

  public void setDisbursementTransactionExecuteActionTaskReference(String disbursementTransactionExecuteActionTaskReference) {
    this.disbursementTransactionExecuteActionTaskReference = disbursementTransactionExecuteActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

