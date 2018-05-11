package com.ra.response;

import java.util.List;

public class Error {
	private List<String> errors;
	public void addError(String message) {
		this.errors.add(message);
	}
	
	public List<String> getErrors() {
		return this.errors;
	}
}
