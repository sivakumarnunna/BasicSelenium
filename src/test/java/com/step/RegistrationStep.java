package com.step;

import com.model.AccountCreationDetails;
import com.page.AccountCreationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep {
	
	AccountCreationDetails accountcreationdetails = new AccountCreationDetails();
	AccountCreationPage accountcreationpage = new  AccountCreationPage();
	
	
	
	@Given("firstname to register {string}")
	public void firstname_to_register(String firstname) {
		accountcreationdetails.setFirstname(firstname);
	}

	@Given("lastname to register {string}")
	public void lastname_to_register(String lastname) {
		accountcreationdetails.setLastname(lastname);
	}

	@Given("email to register {string}")
	public void email_to_register(String email) {
		accountcreationdetails.setEmail(email);
	}

	@Given("password to register {string}")
	public void password_to_register_test(String password) {
		accountcreationdetails.setPassowrd(password);
	}

	@Given("confirmpassword {string}")
	public void confirmpassword(String cnfmpassword) {
		accountcreationdetails.setConfirmpassword(cnfmpassword);
	    	}

	@When("I click on create an account button")
	public void i_click_on_create_an_account_button() {
		
	accountcreationpage.createAccount(accountcreationdetails);
		
	  
	}

	@Then("account should be created successfully")
	public void account_should_be_created_successfully() {

	}



}
