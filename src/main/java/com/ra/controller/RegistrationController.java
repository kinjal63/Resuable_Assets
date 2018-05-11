package com.ra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ra.dto.UserDTO;
import com.ra.service.AuthenticationService;

@RestController
public class RegistrationController {
	@Autowired
	AuthenticationService authService;

	@RequestMapping(name="/user/register", method=RequestMethod.POST, consumes={"application/json"})
	public @ResponseBody void registerUser(@ModelAttribute("user") UserDTO userDTO) {
		if(authService.userExists(userDTO.getEmail())) {
			
		}
//		authService.registerUser();
	}
	
	public static void main(String[] args) {
		
	}
}
