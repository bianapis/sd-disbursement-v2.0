/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class DisbursementApiServiceImpl implements DisbursementApiService {

	public SDDisbursementActivateOutputModel activate(SDDisbursementActivateInputModel request){
		return JsonReader.read("activate-SDDisbursementActivateOutputModel.json",new TypeReference<SDDisbursementActivateOutputModel>(){});
	}
	
	public SDDisbursementConfigureOutputModel configure(String sdReferenceId, SDDisbursementConfigureInputModel request){
		return JsonReader.read("configure-SDDisbursementConfigureOutputModel.json",new TypeReference<SDDisbursementConfigureOutputModel>(){});
	}
	
	public CRDisbursementTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRDisbursementTransactionControlInputModel request){
		return JsonReader.read("control-CRDisbursementTransactionControlOutputModel.json",new TypeReference<CRDisbursementTransactionControlOutputModel>(){});
	}
	
	public CRDisbursementTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRDisbursementTransactionExchangeInputModel request){
		return JsonReader.read("exchange-CRDisbursementTransactionExchangeOutputModel.json",new TypeReference<CRDisbursementTransactionExchangeOutputModel>(){});
	}
	
	public CRDisbursementTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRDisbursementTransactionExecuteInputModel request){
		return JsonReader.read("execute-CRDisbursementTransactionExecuteOutputModel.json",new TypeReference<CRDisbursementTransactionExecuteOutputModel>(){});
	}
	
	public SDDisbursementFeedbackOutputModel feedback(String sdReferenceId, SDDisbursementFeedbackInputModel request){
		return JsonReader.read("feedback-SDDisbursementFeedbackOutputModel.json",new TypeReference<SDDisbursementFeedbackOutputModel>(){});
	}
	
	public CRDisbursementTransactionInitiateOutputModel initiate(String sdReferenceId, CRDisbursementTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRDisbursementTransactionInitiateOutputModel.json",new TypeReference<CRDisbursementTransactionInitiateOutputModel>(){});
	}
	
	public CRDisbursementTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRDisbursementTransactionRequestInputModel request){
		return JsonReader.read("request-CRDisbursementTransactionRequestOutputModel.json",new TypeReference<CRDisbursementTransactionRequestOutputModel>(){});
	}
	
	public CRDisbursementTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRDisbursementTransactionRetrieveOutputModel.json",new TypeReference<CRDisbursementTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDDisbursementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDDisbursementRetrieveOutputModel.json",new TypeReference<SDDisbursementRetrieveOutputModel>(){});
	}
	
	public CRDisbursementTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRDisbursementTransactionUpdateInputModel request){
		return JsonReader.read("update-CRDisbursementTransactionUpdateOutputModel.json",new TypeReference<CRDisbursementTransactionUpdateOutputModel>(){});
	}
	
}
