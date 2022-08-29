package com.page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.model.LoginDetails;
import com.reader.LocatorReader;
import com.utils.BasePage;

public class LumaCustomerLoginPage extends BasePage {
	
	public static By tfemail =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfemail"));
	public static By tfpassword =  By.id(LocatorReader.LOCATOR_READER.getProperty("tfpassword"));
	public static By btnsubmit =  By.name(LocatorReader.LOCATOR_READER.getProperty("btnsubmit"));
    public static By userhomepage= By.xpath(LocatorReader.LOCATOR_READER.getProperty("txtwelcomemessage"));
    public static By txtwelcomemessage= By.xpath(LocatorReader.LOCATOR_READER.getProperty("txtwelcomemessage"));




 public void doLogin(LoginDetails logindetails) {
	 
		driver.findElement(tfemail).clear(); // clear the prefilled values from testbox
		driver.findElement(tfemail).sendKeys(logindetails.getUsername()); // enter values in text box
		driver.findElement(tfpassword).clear(); // clear the prefilled values from testbox
		driver.findElement(tfpassword).sendKeys(logindetails.getPassword()); // enter values in text box
		driver.findElement(btnsubmit).click();
		
		//System.out.println(driver.findElement(txtwelcomemessage).getText());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      Assert.assertEquals(driver.findElement(txtwelcomemessage).getText(), "Welcome, sddadada dadsada!");

	 
 }
 
 }


