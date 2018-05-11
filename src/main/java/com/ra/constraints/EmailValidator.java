package com.ra.constraints;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<EmailConstraint, String> {
	private Pattern pattern;
    private Matcher matcher;
    
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+ " +
        "(.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(.[A-Za-z0-9]+)* " +
        "(.[A-Za-z]{2,})$";
    
	@Override
	public void initialize(EmailConstraint constraintAnnotation) {
	}
	
	@Override
	public boolean isValid(String email, ConstraintValidatorContext arg1) {
		return checkEmail(email);
	}
	
	private boolean checkEmail(String email) {
		pattern = Pattern.compile(EMAIL_PATTERN);
		matcher = pattern.matcher(EMAIL_PATTERN);
		return matcher.matches();
	}
}
