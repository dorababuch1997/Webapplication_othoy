package Steps_definitations;

import org.openqa.selenium.WebDriver;

import Utilites.UtilsManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	public UtilsManager manager =null;
	
	
	
	
	public Hooks(UtilsManager manager) {
		this.manager = manager;
	}
	
	@Before
	private void BrowserStart() {
		
		System.out.println("before classs");
		
		manager.seleniumUtils.createDriver("chrome");
		
	}
	
	@After
	private void BrowserShutDown() {
	
		System.out.println("afterclass");
		
		manager.seleniumUtils.driver.quit();
		
	}
}
