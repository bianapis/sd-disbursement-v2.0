package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceAnalysis;
import org.bian.dto.CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRetrieveInputModel
 */
public class CRDisbursementTransactionRetrieveInputModel   {
  private Object disbursementTransactionRetrieveActionTaskRecord = null;

  private String disbursementTransactionRetrieveActionRequest = null;

  private CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceReportRecord disbursementTransactionInstanceReportRecord = null;

  private CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceAnalysis disbursementTransactionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return disbursementTransactionRetrieveActionRequest
  **/

  public String getDisbursementTransactionRetrieveActionRequest() {
    return disbursementTransactionRetrieveActionRequest;
  }

  public void setDisbursementTransactionRetrieveActionRequest(String disbursementTransactionRetrieveActionRequest) {
    this.disbursementTransactionRetrieveActionRequest = disbursementTransactionRetrieveActionRequest;
  }


  /**
   * Get disbursementTransactionInstanceReportRecord
   * @return disbursementTransactionInstanceReportRecord
  **/

  public CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceReportRecord getDisbursementTransactionInstanceReportRecord() {
    return disbursementTransactionInstanceReportRecord;
  }

  public void setDisbursementTransactionInstanceReportRecord(CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceReportRecord disbursementTransactionInstanceReportRecord) {
    this.disbursementTransactionInstanceReportRecord = disbursementTransactionInstanceReportRecord;
  }


  /**
   * Get disbursementTransactionInstanceAnalysis
   * @return disbursementTransactionInstanceAnalysis
  **/

  public CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceAnalysis getDisbursementTransactionInstanceAnalysis() {
    return disbursementTransactionInstanceAnalysis;
  }

  public void setDisbursementTransactionInstanceAnalysis(CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceAnalysis disbursementTransactionInstanceAnalysis) {
    this.disbursementTransactionInstanceAnalysis = disbursementTransactionInstanceAnalysis;
  }


}

