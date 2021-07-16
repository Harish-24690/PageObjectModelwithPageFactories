package test.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import test.base.Page;
import test.pages.locators.SigninLocators;

public class SigninPage extends Page {
	SigninLocators signin;
	
	public SigninPage(){
		
		this.signin = new SigninLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.signin);
	}
	
	public void doLogin(String username ,String password){
	type(signin.emaild,username);       //signin.emaild.sendKeys(username);
	type(signin.password,password);     //signin.password.sendKeys(password);
	
	click(signin.signin);              //signin.signin.click();
		
		
	}

}
