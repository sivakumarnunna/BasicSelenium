package com.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.model.AccountCreationDetails;
import com.model.LoginDetails;
import com.reader.LocatorReader;
import com.utils.BasePage;

public class AccountCreationPage extends BasePage {
	
	
	
	
	public static By tffirstname =  By.id(LocatorReader.LOCATOR_READER.getProperty("tffirstname"));
	public static By tflastname =  By.id(LocatorReader.LOCATOR_READER.getProperty("tflastname"));

	public static By tfregemail =  By.name(LocatorReader.LOCATOR_READER.getProperty("tfregemail"));

	
	
	public static By tfregpassword =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfregpassword"));
	public static By tfregconfpassword =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfregconfpassword"));

	
	public static By btnsubmit =  By.xpath(LocatorReader.LOCATOR_READER.getProperty("btnregsubmit"));
	
	
	public void createAccount(AccountCreationDetails accountcreationdetails) {
		
		
		driver.findElement(By.linkText("Create an Account")).click();
		 
		driver.findElement(tffirstname).clear(); 
		driver.findElement(tffirstname).sendKeys(accountcreationdetails.getFirstname()); 
	
		driver.findElement(tflastname).clear(); 
		driver.findElement(tflastname).sendKeys(accountcreationdetails.getLastname()); 
		
		driver.findElement(tfregemail).clear(); 
		driver.findElement(tfregemail).sendKeys(accountcreationdetails.getEmail()); 
		
		driver.findElement(tfregpassword).clear(); 
		driver.findElement(tfregpassword).sendKeys(accountcreationdetails.getPassowrd()); 
		
		driver.findElement(tfregconfpassword).clear(); 
		driver.findElement(tfregconfpassword).sendKeys(accountcreationdetails.getConfirmpassword()); 
		
		driver.findElement(btnsubmit).click();
		
	

	 
 }


}
