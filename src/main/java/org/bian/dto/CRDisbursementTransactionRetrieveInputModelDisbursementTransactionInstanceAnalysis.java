package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceAnalysis
 */
public class CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceAnalysis   {
  private String disbursementTransactionInstanceAnalysisReference = null;

  private String disbursementTransactionInstanceAnalysisReportType = null;

  private String disbursementTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return disbursementTransactionInstanceAnalysisReference
  **/

  public String getDisbursementTransactionInstanceAnalysisReference() {
    return disbursementTransactionInstanceAnalysisReference;
  }

  public void setDisbursementTransactionInstanceAnalysisReference(String disbursementTransactionInstanceAnalysisReference) {
    this.disbursementTransactionInstanceAnalysisReference = disbursementTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return disbursementTransactionInstanceAnalysisParameters
  **/

  public String getDisbursementTransactionInstanceAnalysisParameters() {
    return disbursementTransactionInstanceAnalysisParameters;
  }

  public void setDisbursementTransactionInstanceAnalysisParameters(String disbursementTransactionInstanceAnalysisParameters) {
    this.disbursementTransactionInstanceAnalysisParameters = disbursementTransactionInstanceAnalysisParameters;
  }


}

