package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceReportRecord
 */
public class CRDisbursementTransactionRetrieveInputModelDisbursementTransactionInstanceReportRecord   {
  private String disbursementTransactionInstanceReportReference = null;

  private String disbursementTransactionInstanceReportType = null;

  private String disbursementTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return disbursementTransactionInstanceReportReference
  **/

  public String getDisbursementTransactionInstanceReportReference() {
    return disbursementTransactionInstanceReportReference;
  }

  public void setDisbursementTransactionInstanceReportReference(String disbursementTransactionInstanceReportReference) {
    this.disbursementTransactionInstanceReportReference = disbursementTransactionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return disbursementTransactionInstanceReportType
  **/

  public String getDisbursementTransactionInstanceReportType() {
    return disbursementTransactionInstanceReportType;
  }

  public void setDisbursementTransactionInstanceReportType(String disbursementTransactionInstanceReportType) {
    this.disbursementTransactionInstanceReportType = disbursementTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return disbursementTransactionInstanceReportParameters
  **/

  public String getDisbursementTransactionInstanceReportParameters() {
    return disbursementTransactionInstanceReportParameters;
  }

  public void setDisbursementTransactionInstanceReportParameters(String disbursementTransactionInstanceReportParameters) {
    this.disbursementTransactionInstanceReportParameters = disbursementTransactionInstanceReportParameters;
  }


}

