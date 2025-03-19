package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Manjinder Singh
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/manjindermaan/Downloads/chromedriver-mac-arm64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("manjinder@random.com");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		driver.findElement(By.id("password")).sendKeys("random@123456");
		driver.findElement(By.id("birthdate")).sendKeys("28071999");
		
		/*
		driver.findElement(By.id("email")).sendKeys("mani28au@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Random@123");
		driver.findElement(By.id("confirmPassword")).sendKeys("Random@123");
		*/
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
	
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/div/div/div/div/div[4]/div[4]/button/div")).click();
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png"));
        System.out.println("Screenshot saved successfully.");

		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
