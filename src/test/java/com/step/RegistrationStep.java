package com.step;

import java.util.List;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import com.model.AccountCreationDetails;
import com.page.AccountCreationPage;
import io.cucumber.datatable.DataTable;
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
	public void i_click_on_create_an_account_button() throws InterruptedException {
		
	accountcreationpage.createAccount(accountcreationdetails);
		
	  
	}

	@Then("account should be created successfully {string} ,{string}")
	public void account_should_be_created_successfully(String firstname, String lastname) throws InterruptedException {
		
		String fullname = firstname+" "+lastname;
		accountcreationpage.verifyAccountCreation(fullname);
		
		
	}
	
	@When("I clicked on Sign out")
	public void i_clicked_on_sign_out() {
		accountcreationpage.doSignOut();
	  
	}

	@Then("user signout successfully")
	public void user_signout_successfully() {
	   
	}

	@When("I am on account creation page")
	public void i_am_on_account_creation_page() {
		accountcreationpage.gotoAccountCreationPage();
		
	}

	@Given("details for creating a new account")
	public void details_for_creating_a_new_account(DataTable accountcreationdetails) throws InterruptedException {
		
		List<List<String>>  accdetls = accountcreationdetails.asLists();
		
		for(List<String> ls : accdetls) {
			
			AccountCreationDetails act = new AccountCreationDetails();
			act.setFirstname(ls.get(0));
			act.setLastname(ls.get(1));
			act.setEmail(ls.get(2)+RandomStringUtils.randomAlphabetic(5)+"@xyz.com");
			act.setPassowrd(ls.get(3));
			act.setConfirmpassword(ls.get(4));
			accountcreationpage.createAccount(act);
			
		}
	   
	}



}
