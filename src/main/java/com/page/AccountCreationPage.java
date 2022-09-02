package com.page;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.model.AccountCreationDetails;
import com.reader.ConfigReader;
import com.reader.LocatorReader;
import com.utils.WebDriverUtils;

public class AccountCreationPage extends WebDriverUtils {
	
	public static By tffirstname =  By.id(LocatorReader.LOCATOR_READER.getProperty("tffirstname"));
	public static By tflastname =  By.id(LocatorReader.LOCATOR_READER.getProperty("tflastname"));
	public static By tfregemail =  By.name(LocatorReader.LOCATOR_READER.getProperty("tfregemail"));
	public static By tfregpassword =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfregpassword"));
	public static By tfregconfpassword =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfregconfpassword"));
	public static By btnsubmit =  By.xpath(LocatorReader.LOCATOR_READER.getProperty("btnregsubmit"));
	public static By ddprofile =  By.xpath(LocatorReader.LOCATOR_READER.getProperty("ddprofile"));
	
		public void createAccount(AccountCreationDetails accountcreationdetails) throws InterruptedException {
			
			
		
			logger.info("Creating a new account on "+ConfigReader.BASE_URL);
	
		click(CommonPage.lnkcreateaccout); 
		
		logger.info("Account creation page opened successfully");

		EnterText(tffirstname, accountcreationdetails.getFirstname());
		EnterText(tflastname, accountcreationdetails.getLastname());
		EnterText(tfregemail, accountcreationdetails.getEmail());
		EnterText(tfregpassword, accountcreationdetails.getPassowrd());
		EnterText(tfregconfpassword, accountcreationdetails.getConfirmpassword());
		click(btnsubmit);

 }
		
		public void verifyAccountCreation(String name) throws InterruptedException {
			  Thread.sleep(1000);
		      Assert.assertEquals(driver.findElement(CommonPage.txtwelcomemessage).getText(),"Welcome, "+name+"!");
		      logger.info(name+ " presents on User home page");

	 }
		
		public void doSignOut() {
			
		click(ddprofile);
		click(CommonPage.lnksignout);
		
	 }



}
