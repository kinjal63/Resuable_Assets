package com.ra.response;

public class LoginResponse {
	private Error error;
	private boolean success;
	
	public LoginResponse() {
		this.success = true;
	}
	
	public LoginResponse(Error error) {
		this.success = false;
		this.error = error;
	}
}
