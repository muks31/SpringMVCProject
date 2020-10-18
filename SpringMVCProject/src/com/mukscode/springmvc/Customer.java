package com.mukscode.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	@NotNull
	private Integer freePasses;

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

}
