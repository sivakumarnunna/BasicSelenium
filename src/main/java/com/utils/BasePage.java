package com.utils;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.reader.ConfigReader;


public class BasePage {
	
	public static WebDriver driver = null;
	public static String BASE_URL;
	public static String BROWSER_TYPE;
	
	static {
		
		BROWSER_TYPE = ConfigReader.CONFIG_READER.getProperty("browsertype");
		switch (BROWSER_TYPE) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");	
			 driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");	
			 driver = new FirefoxDriver();
			break;
		case "msedge":
			System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");	
			 driver = new EdgeDriver();
			break;
	
		default:
			System.out.println("No driver found");	

			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(ConfigReader.BASE_URL);
		driver.findElement(By.linkText("Sign In")).click();   //to work on link
		
		
		
		
		
		
	}
	
	

}
