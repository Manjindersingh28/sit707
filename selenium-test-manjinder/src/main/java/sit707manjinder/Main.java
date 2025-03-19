package sit707manjinder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	 public static void main(String[] args) {
	        // Set the path to the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "/Users/manjindermaan/Downloads/chromedriver-mac-arm64/chromedriver");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        
	        // Open the website
	        System.out.println(driver);
	        driver.get("https://www.google.com");

	        try {
	            // Wait for 5 seconds
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            // Handle the exception
	            e.printStackTrace();
	        }

	        // Close the browser
	        driver.close();
	    }

}






   
