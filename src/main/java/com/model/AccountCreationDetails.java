package com.model;

public class AccountCreationDetails {
	
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private String passowrd;
	
	private String confirmpassword;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "AccountCreationDetails [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", passowrd=" + passowrd + ", confirmpassword=" + confirmpassword + "]";
	}
	
	
	
	
	

}
