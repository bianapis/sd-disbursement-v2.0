package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceReportRecord
 */
public class CRDisbursementTransactionRetrieveOutputModelDisbursementTransactionInstanceReportRecord   {
  private String disbursementTransactionInstanceReportData = null;

  private String disbursementTransactionInstanceReportType = null;

  private Object disbursementTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return disbursementTransactionInstanceReportData
  **/

  public String getDisbursementTransactionInstanceReportData() {
    return disbursementTransactionInstanceReportData;
  }

  public void setDisbursementTransactionInstanceReportData(String disbursementTransactionInstanceReportData) {
    this.disbursementTransactionInstanceReportData = disbursementTransactionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return disbursementTransactionInstanceReport
  **/

  public Object getDisbursementTransactionInstanceReport() {
    return disbursementTransactionInstanceReport;
  }

  public void setDisbursementTransactionInstanceReport(Object disbursementTransactionInstanceReport) {
    this.disbursementTransactionInstanceReport = disbursementTransactionInstanceReport;
  }


}

