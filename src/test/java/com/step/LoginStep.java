package com.step;


import com.model.LoginDetails;
import com.page.LumaCustomerLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStep  {
	
	LoginDetails logindetails = new LoginDetails();
	LumaCustomerLoginPage lognpage = new LumaCustomerLoginPage();
	
	
	@Given("email to login {string}")
	public void username(String username) {
		logindetails.setUsername(username);
	}

	@Given("password to login {string}")
	public void password(String password) {
		logindetails.setPassword(password);

	}

	@When("I click on Signin button")
	public void i_click_on_signin_button() throws InterruptedException {
		
		lognpage.doLogin(logindetails);
	}

	@Then("login Should be successful")
	public void login_should_be_successful() {
	   
	}




}
