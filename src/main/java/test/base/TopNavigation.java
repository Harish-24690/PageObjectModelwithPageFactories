package test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import test.pages.actions.SigninPage;
import test.pages.locators.HomePageLocators;
import test.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	TopNavigationLocators topnavigation;
	
	public TopNavigation(WebDriver driver){
		
		this.topnavigation= new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.topnavigation);
		
		
	}
	
	
	public SigninPage gotoSignin(){
	Page.click(topnavigation.signinbutton);  //topnavigation.signinbutton.click();
	Page.click(topnavigation.signin);   //topnavigation.signin.click();
		return new SigninPage();
		
		
	}
	
	public void gotoTrips(){
		
		
	}
	public void gotoSupport(){
		
		
	}
	public void gotoFlights(){
		
		
	}
	public void gotoStays(){
		
	}
	public void gotoCars(){
		
		
	}

}
