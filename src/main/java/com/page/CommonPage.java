package com.page;

import org.openqa.selenium.By;

import com.reader.LocatorReader;

public class CommonPage {
	
	
	public static By lnkcreateaccout=By.linkText(LocatorReader.LOCATOR_READER.getProperty("lnkcreateaccout"));
	public static By lnksignin = By.linkText(LocatorReader.LOCATOR_READER.getProperty("lnksignin"));	
    public static By txtwelcomemessage= By.xpath(LocatorReader.LOCATOR_READER.getProperty("txtwelcomemessage"));


}
