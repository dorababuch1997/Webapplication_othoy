package Steps_definitations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Application_Pages.LoginPages;
import Utilites.UtilsManager;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	public UtilsManager manager;
	
	public LoginPages loginPages;
	
	public static WebDriver driver;
	
	@Given("Open the url {string}")
	public void open_the_url(String string) {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@When("Enter valid {string} and {string}.")
	public void enter_valid_and(String string, String string2) {
	   
		loginPages.Enter_Username_and_Password(string, string2);
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
	    
		loginPages.Click_On_LoginButton();
	}

	@Then("Verify that the user is successfully logged in and redirected to the home page")
	public void verify_that_the_user_is_successfully_logged_in_and_redirected_to_the_home_page() {
	   
		String currentUrl = manager.seleniumUtils.driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrl.contains("login/privacy"),currentUrl);
			   
	}

	@Then("Verify that an error message is displayed indicating that the login was unsuccessful.")
	public void verify_that_an_error_message_is_displayed_indicating_that_the_login_was_unsuccessful() {
	
		String currentUrl = manager.seleniumUtils.driver.getCurrentUrl();
		
		Assert.assertEquals(currentUrl.contains("login/privacy"),currentUrl);
		
	}


}
