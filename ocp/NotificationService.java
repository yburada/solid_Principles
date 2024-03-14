package com.services.ocp;

public interface NotificationService {
	/* O-> open close principle -> If the requirement extends we should not change or modify the current 
	requirement we have to extend the current requirement and code what we require */
	public void sendOtp();
	
	public void sendTransactionReport(String medium);

}
