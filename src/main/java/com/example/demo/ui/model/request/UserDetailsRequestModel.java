package com.example.demo.ui.model.request;

public class UserDetailsRequestModel {
	private String firstNameString;

	public String getFirstNameString() {
		return firstNameString;
	}

	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassqwordString() {
		return passqwordString;
	}

	public void setPassqwordString(String passqwordString) {
		this.passqwordString = passqwordString;
	}

	private String lastNameString;
	private String email;
	private String passqwordString;
}
