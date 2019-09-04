/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface DisbursementApiService {

	SDDisbursementActivateOutputModel activate(SDDisbursementActivateInputModel request);
	
	SDDisbursementConfigureOutputModel configure(String sdReferenceId, SDDisbursementConfigureInputModel request);
	
	CRDisbursementTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRDisbursementTransactionControlInputModel request);
	
	CRDisbursementTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRDisbursementTransactionExchangeInputModel request);
	
	CRDisbursementTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRDisbursementTransactionExecuteInputModel request);
	
	SDDisbursementFeedbackOutputModel feedback(String sdReferenceId, SDDisbursementFeedbackInputModel request);
	
	CRDisbursementTransactionInitiateOutputModel initiate(String sdReferenceId, CRDisbursementTransactionInitiateInputModel request);
	
	CRDisbursementTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRDisbursementTransactionRequestInputModel request);
	
	CRDisbursementTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDDisbursementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRDisbursementTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDisbursementTransactionUpdateInputModel request);
	
}
