package Application_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilites.UtilsManager;



public class LoginPages {
	
	private WebDriver driver;
	private UtilsManager utilsManager;
	
	public LoginPages(WebDriver driver, UtilsManager utilsManager) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.utilsManager = utilsManager;	
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement loginbutton;
	
	
	public void Enter_Username_and_Password(String username,String password) {
		
		email.sendKeys(username);
		email.sendKeys(password);
	}
	
	public void Click_On_LoginButton() {	
		loginbutton.click();
	}
	
}
