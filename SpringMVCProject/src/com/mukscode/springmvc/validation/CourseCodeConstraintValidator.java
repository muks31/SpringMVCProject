package com.mukscode.springmvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result=false;
		
		if(theCode !=null) {
			for(String str: coursePrefix) {
				result = theCode.startsWith(str);

				if(result) {
					break;
				}
			}
		}
		else {
			result = true;
		}
		return result;
	}

}
