package com.step;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.WebDriverUtils;

public class ActionsWebElement extends WebDriverUtils {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		handleIframes();
	}

	// Handle web based alerts

	public static void handleAlerts() {

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		// Accepting the aerts
		driver.findElement(By.id("alertBox")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmBox")).click();
		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("promptBox")).click();
		driver.switchTo().alert().sendKeys("siva");
		driver.switchTo().alert().accept();


	}
	
	//Handle drop downs

	public static void handleDropDowns() {

		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");


		Select select = new Select(driver.findElement(By.id("RESULT_RadioButton-9")));

		List<WebElement> lwe = select.getOptions();
		
		for (WebElement wb : lwe) {
			System.out.println(wb.getText());
		}
		
		System.out.println(lwe.size());

	}
	
	//Handle radio buttons

	public static void handleRadioButtons() {

		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

	
	//Handle Mouse events  - Actions
	public static void usingActions() {
		
		Actions action = new Actions(driver);


		driver.get("http://mrbool.com");

		
		action.moveToElement(driver.findElement(By.id("headermenudesktop"))).perform();

	}
  
	//Right Click
	public static void usingActions1() throws AWTException {

		String baseUrl = "https://swisnl.github.io/jQuery-contextMenu/demo.html";

		driver.get(baseUrl);
		WebElement rightclickme = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions action = new Actions(driver);
		action.contextClick(rightclickme).perform();

		
	}

	// Robot class
	
	public static void RobotActions() throws AWTException {
		
		String baseUrl = "https://magento.softwaretestingboard.com/customer/account/login";

		driver.get(baseUrl);

		driver.findElement(By.id("email")).sendKeys("sss@sss.com");
		driver.findElement(By.id("pass")).sendKeys("wqeqeqeq");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);

		
	}

      // Taking screenshot	
	public static void takeScreenshot() throws IOException {
		
		String baseUrl = "https://magento.softwaretestingboard.com/customer/account/login";

		driver.get(baseUrl);

		
		TakesScreenshot scrShot =((TakesScreenshot) driver);
		
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		//Move image file to new destination

        File DestFile=new File("screenshots\\homepage.png");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);

	}
	
	public static void explicitwait() {
		
		
		String baseUrl = "https://magento.softwaretestingboard.com/customer/account/login";
		driver.get(baseUrl);
		

		
		  driver.get(baseUrl);
		  
		  try { WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(30));
		  System.out.println(
		  ww.until(ExpectedConditions.invisibilityOfElementLocated((By.id("email")))));
		  } catch (Exception e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		 
	}
	
	public static void fluentWait() {
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	
	wait.withTimeout(Duration.ofSeconds(30));
	
	wait.pollingEvery(Duration.ofSeconds(5));
	
	wait.ignoring(NoSuchElementException.class);

	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("email")));


	}
	
	
	public static void MultipleWindows() {
		
		 driver.get("https://demoqa.com/browser-windows");

	        // Open new window by clicking the button
	         driver.findElement(By.id("windowButton")).click();

	        
	         String parentwindowhandler = driver.getWindowHandle();
	         

	         
	         Set<String> all = driver.getWindowHandles();
	         
	          for(String s : all) {
	        	  
	        	  System.out.println(s);
	        	  if(!s.equalsIgnoreCase(parentwindowhandler)) {
	        		  driver.switchTo().window(s);
	        	  }
	          }
	         
	          // Click on the new window element and read the text displayed on the window
		         WebElement text = driver.findElement(By.id("sampleHeading"));
		         
	   
	         // Fetching the text using method and printing it     
	         System.out.println("Element found using text: " + text.getText());
	         driver.switchTo().defaultContent();
		
	}
	
	public static void findElements() {
		
		//https://www.hyrtutorials.com/p/frames=practice.html
		driver.get("https://sports.bwin.com/en/sports");
		
		List<WebElement> ls = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links "+ls.size());
		
		for (WebElement wb : ls) {
			System.out.println(wb);
		}
		
		
			
		
			List<WebElement> ls1 =	driver.findElements(By.tagName("iframe"));
			
			System.out.println("Total iframes "+ls1.size());


		
	}
	
	public static void handleIframes() throws InterruptedException {
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_links_w3schools");
			 
		Thread.sleep(1000);
		if (driver.findElements(By.id("accept-choices")).size() > 0) {
			driver.findElement(By.id("accept-choices")).click();
		}
			 
	//driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//a[normalize-space()='Visit W3Schools.com!']")).click();
	
		
		
	}
	
}
