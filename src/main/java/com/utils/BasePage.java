package com.utils;


import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.page.AccountCreationPage;
import com.reader.ConfigReader;


public class BasePage {
	
	public static  Logger logger = LogManager.getLogger(AccountCreationPage.class);

	
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
		
		logger.info("Browser is :: "+BROWSER_TYPE);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(ConfigReader.BASE_URL);
		logger.info(ConfigReader.BASE_URL+" opened successfully on "+BROWSER_TYPE);

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	}
	
	

}
