package com.utils;

import org.openqa.selenium.By;

public class WebDriverUtils extends BasePage {
	
	
	public boolean EnterText( By by,String text) {
		try {
			Thread.sleep(1000);
			driver.findElement(by).clear(); 
			driver.findElement(by).sendKeys(text); 
			logger.info("Entered "+text+" in the filed "+by);
			return true;
		}
		catch(Exception e) {
			logger.error(e.getMessage());
		}
		return false;
	}
	
	public boolean click( By by) {
		try {
			Thread.sleep(1000);
			driver.findElement(by).click();
			logger.info("Clicked successfully link/button:: "+by);

			return true;
		}
		catch(Exception e) {
			logger.error(e.getMessage());
		}
		return false;
	}


}
