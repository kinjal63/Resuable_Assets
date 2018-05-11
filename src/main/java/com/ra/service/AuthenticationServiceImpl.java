package com.ra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ra.dao.UserRepository;
import com.ra.response.LoginResponse;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public LoginResponse loginUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean userExists(String email) {
		return false;
	}
}
