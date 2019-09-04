package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceAnalysis
 */
public class CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceAnalysis   {
  private String disbursementTransactionInstanceAnalysisData = null;

  private String disbursementTransactionInstanceAnalysisReportType = null;

  private Object disbursementTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return disbursementTransactionInstanceAnalysisData
  **/

  public String getDisbursementTransactionInstanceAnalysisData() {
    return disbursementTransactionInstanceAnalysisData;
  }

  public void setDisbursementTransactionInstanceAnalysisData(String disbursementTransactionInstanceAnalysisData) {
    this.disbursementTransactionInstanceAnalysisData = disbursementTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return disbursementTransactionInstanceAnalysisReportType
  **/

  public String getDisbursementTransactionInstanceAnalysisReportType() {
    return disbursementTransactionInstanceAnalysisReportType;
  }

  public void setDisbursementTransactionInstanceAnalysisReportType(String disbursementTransactionInstanceAnalysisReportType) {
    this.disbursementTransactionInstanceAnalysisReportType = disbursementTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return disbursementTransactionInstanceAnalysisReport
  **/

  public Object getDisbursementTransactionInstanceAnalysisReport() {
    return disbursementTransactionInstanceAnalysisReport;
  }

  public void setDisbursementTransactionInstanceAnalysisReport(Object disbursementTransactionInstanceAnalysisReport) {
    this.disbursementTransactionInstanceAnalysisReport = disbursementTransactionInstanceAnalysisReport;
  }


}

