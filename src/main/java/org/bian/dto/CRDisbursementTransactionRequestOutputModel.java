package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRequestOutputModel
 */
public class CRDisbursementTransactionRequestOutputModel   {
  private CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;

  private String disbursementTransactionRequestActionTaskReference = null;

  private Object disbursementTransactionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get disbursementTransactionInstanceRecord
   * @return disbursementTransactionInstanceRecord
  **/

  public CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord getDisbursementTransactionInstanceRecord() {
    return disbursementTransactionInstanceRecord;
  }

  public void setDisbursementTransactionInstanceRecord(CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord) {
    this.disbursementTransactionInstanceRecord = disbursementTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disbursement Transaction instance request service call 
   * @return disbursementTransactionRequestActionTaskReference
  **/

  public String getDisbursementTransactionRequestActionTaskReference() {
    return disbursementTransactionRequestActionTaskReference;
  }

  public void setDisbursementTransactionRequestActionTaskReference(String disbursementTransactionRequestActionTaskReference) {
    this.disbursementTransactionRequestActionTaskReference = disbursementTransactionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return disbursementTransactionRequestActionTaskRecord
  **/

  public Object getDisbursementTransactionRequestActionTaskRecord() {
    return disbursementTransactionRequestActionTaskRecord;
  }

  public void setDisbursementTransactionRequestActionTaskRecord(Object disbursementTransactionRequestActionTaskRecord) {
    this.disbursementTransactionRequestActionTaskRecord = disbursementTransactionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

