package com.exception;

public class NotEligibleForVoteException extends RuntimeException {
    
	
	public NotEligibleForVoteException(String msg) {
		super(msg);
	}
}
