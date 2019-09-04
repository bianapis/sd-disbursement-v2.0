package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionUpdateInputModelDisbursementTransactionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionUpdateOutputModel
 */
public class CRDisbursementTransactionUpdateOutputModel   {
  private CRDisbursementTransactionUpdateInputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;

  private String disbursementTransactionUpdateActionTaskReference = null;

  private Object disbursementTransactionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return disbursementTransactionUpdateActionTaskReference
  **/

  public String getDisbursementTransactionUpdateActionTaskReference() {
    return disbursementTransactionUpdateActionTaskReference;
  }

  public void setDisbursementTransactionUpdateActionTaskReference(String disbursementTransactionUpdateActionTaskReference) {
    this.disbursementTransactionUpdateActionTaskReference = disbursementTransactionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

