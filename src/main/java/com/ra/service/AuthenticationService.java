package com.ra.service;

import com.ra.response.LoginResponse;

public interface AuthenticationService {
//	private Re registerUser();
	LoginResponse loginUser();
	boolean userExists(String email);
}
