package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionExchangeOutputModel
 */
public class CRDisbursementTransactionExchangeOutputModel   {
  private String disbursementTransactionExchangeActionTaskReference = null;

  private Object disbursementTransactionExchangeActionTaskRecord = null;

  private String disbursementTransactionExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disbursement Transaction instance exchange service call 
   * @return disbursementTransactionExchangeActionTaskReference
  **/

  public String getDisbursementTransactionExchangeActionTaskReference() {
    return disbursementTransactionExchangeActionTaskReference;
  }

  public void setDisbursementTransactionExchangeActionTaskReference(String disbursementTransactionExchangeActionTaskReference) {
    this.disbursementTransactionExchangeActionTaskReference = disbursementTransactionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return disbursementTransactionExchangeActionResponse
  **/

  public String getDisbursementTransactionExchangeActionResponse() {
    return disbursementTransactionExchangeActionResponse;
  }

  public void setDisbursementTransactionExchangeActionResponse(String disbursementTransactionExchangeActionResponse) {
    this.disbursementTransactionExchangeActionResponse = disbursementTransactionExchangeActionResponse;
  }


}

