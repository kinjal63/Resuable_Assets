package com.ra.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.ra.dto.UserDTO;

public class PasswordValidator implements ConstraintValidator<PasswordConstraint, Object>{
	@Override
	public void initialize(PasswordConstraint constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(Object object, ConstraintValidatorContext cv) {
		UserDTO userDTO = (UserDTO)object;
		return checkPassword(userDTO);
	}
	
	private boolean checkPassword(UserDTO userDTO) {
		return userDTO.getPassword().equals(userDTO.getConfirmPassword());
	}
}
