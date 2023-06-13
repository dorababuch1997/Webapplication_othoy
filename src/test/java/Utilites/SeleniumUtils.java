package Utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtils {

	
	public static WebDriver driver;
	
	public void createDriver(String BrowserType) {
		
		if (BrowserType.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (BrowserType.equalsIgnoreCase("Firefox")) {
			WebDriverManager.chromedriver().setup();
			
		}else {
			System.out.println("No browser Found");
		}

	}
	
}
