package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionControlOutputModel
 */
public class CRDisbursementTransactionControlOutputModel   {
  private String disbursementTransactionControlActionTaskReference = null;

  private Object disbursementTransactionControlActionTaskRecord = null;

  private String disbursementTransactionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disbursement Transaction instance control processing service call 
   * @return disbursementTransactionControlActionTaskReference
  **/

  public String getDisbursementTransactionControlActionTaskReference() {
    return disbursementTransactionControlActionTaskReference;
  }

  public void setDisbursementTransactionControlActionTaskReference(String disbursementTransactionControlActionTaskReference) {
    this.disbursementTransactionControlActionTaskReference = disbursementTransactionControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return disbursementTransactionControlActionResponse
  **/

  public String getDisbursementTransactionControlActionResponse() {
    return disbursementTransactionControlActionResponse;
  }

  public void setDisbursementTransactionControlActionResponse(String disbursementTransactionControlActionResponse) {
    this.disbursementTransactionControlActionResponse = disbursementTransactionControlActionResponse;
  }


}

