package test.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninLocators {
	
	@FindBy(xpath="//*[@id='signin-loginid']")
	public WebElement emaild;
	
	@FindBy(xpath="//*[@id='signin-password']")
	public WebElement password;
    
	@FindBy(css="#submitButton")
	public WebElement signin;
	
}
