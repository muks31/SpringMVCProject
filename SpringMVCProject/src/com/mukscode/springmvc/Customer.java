package com.mukscode.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mukscode.springmvc.validation.CourseCode;

public class Customer {
	
	//@NotNull(message="First Name is required")
	//@Size(min=1, message = "First Name is required") /* Commented these two lines of code. NotBlank will be able to handle*/
	@NotBlank(message = "First Name is rquired")
	private String firstName;
	
	//@NotNull(message="First Name is required")
	//(min=1,message ="Last name is required")
	@NotBlank(message="Last Name is required")
	private String lastName;
	
	
	@Min(value=0, message="Must be greater than or equals to 0")
	@Max(value=10, message ="Must be Less than or equals to 10")
	@NotNull(message = "is required")
	private Integer freePasses;
	
	@CourseCode(value={"MUKS", "MRD"}, message="Must start with MUKS or MRD")
	private String courseCode;
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
