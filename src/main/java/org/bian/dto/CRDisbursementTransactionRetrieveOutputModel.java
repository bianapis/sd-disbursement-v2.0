package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceAnalysis;
import org.bian.dto.CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceRecord;
import org.bian.dto.CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRetrieveOutputModel
 */
public class CRDisbursementTransactionRetrieveOutputModel   {
  private CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord = null;

  private String disbursementTransactionRetrieveActionTaskReference = null;

  private Object disbursementTransactionRetrieveActionTaskRecord = null;

  private String disbursementTransactionRetrieveActionResponse = null;

  private CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceReportRecord disbursementTransactionInstanceReportRecord = null;

  private CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceAnalysis disbursementTransactionInstanceAnalysis = null;


  /**
   * Get disbursementTransactionInstanceRecord
   * @return disbursementTransactionInstanceRecord
  **/

  public CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceRecord getDisbursementTransactionInstanceRecord() {
    return disbursementTransactionInstanceRecord;
  }

  public void setDisbursementTransactionInstanceRecord(CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceRecord disbursementTransactionInstanceRecord) {
    this.disbursementTransactionInstanceRecord = disbursementTransactionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Disbursement Transaction instance retrieve service call 
   * @return disbursementTransactionRetrieveActionTaskReference
  **/

  public String getDisbursementTransactionRetrieveActionTaskReference() {
    return disbursementTransactionRetrieveActionTaskReference;
  }

  public void setDisbursementTransactionRetrieveActionTaskReference(String disbursementTransactionRetrieveActionTaskReference) {
    this.disbursementTransactionRetrieveActionTaskReference = disbursementTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return disbursementTransactionRetrieveActionTaskRecord
  **/

  public Object getDisbursementTransactionRetrieveActionTaskRecord() {
    return disbursementTransactionRetrieveActionTaskRecord;
  }

  public void setDisbursementTransactionRetrieveActionTaskRecord(Object disbursementTransactionRetrieveActionTaskRecord) {
    this.disbursementTransactionRetrieveActionTaskRecord = disbursementTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return disbursementTransactionRetrieveActionResponse
  **/

  public String getDisbursementTransactionRetrieveActionResponse() {
    return disbursementTransactionRetrieveActionResponse;
  }

  public void setDisbursementTransactionRetrieveActionResponse(String disbursementTransactionRetrieveActionResponse) {
    this.disbursementTransactionRetrieveActionResponse = disbursementTransactionRetrieveActionResponse;
  }


  /**
   * Get disbursementTransactionInstanceReportRecord
   * @return disbursementTransactionInstanceReportRecord
  **/

  public CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceReportRecord getDisbursementTransactionInstanceReportRecord() {
    return disbursementTransactionInstanceReportRecord;
  }

  public void setDisbursementTransactionInstanceReportRecord(CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceReportRecord disbursementTransactionInstanceReportRecord) {
    this.disbursementTransactionInstanceReportRecord = disbursementTransactionInstanceReportRecord;
  }


  /**
   * Get disbursementTransactionInstanceAnalysis
   * @return disbursementTransactionInstanceAnalysis
  **/

  public CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceAnalysis getDisbursementTransactionInstanceAnalysis() {
    return disbursementTransactionInstanceAnalysis;
  }

  public void setDisbursementTransactionInstanceAnalysis(CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceAnalysis disbursementTransactionInstanceAnalysis) {
    this.disbursementTransactionInstanceAnalysis = disbursementTransactionInstanceAnalysis;
  }


}

