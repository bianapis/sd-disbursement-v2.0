package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord;
import org.bian.dto.CRDisbursementTransactionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRequestInputModel
 */
public class CRDisbursementTransactionRequestInputModel   {
  private String disbursementServicingSessionReference = null;

  private String disbursementTransactionInstanceReference = null;

  private CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;

  private Object disbursementTransactionRequestActionTaskRecord = null;

  private CRDisbursementTransactionRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord getDisbursementTransactionInstanceRecord() {
    return disbursementTransactionInstanceRecord;
  }

  public void setDisbursementTransactionInstanceRecord(CRDisbursementTransactionRequestInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord) {
    this.disbursementTransactionInstanceRecord = disbursementTransactionInstanceRecord;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRDisbursementTransactionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRDisbursementTransactionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

