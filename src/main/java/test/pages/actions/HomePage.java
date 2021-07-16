package test.pages.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import test.base.Page;
import test.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	
	public HomePage(){
	
		this.home= new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.home);
		
		
		
	}
	public HomePage gotoFlights(){
		//home.flightsTab.click();
		click(home.flightsTab);
		return this;
		
	}
	
	public void goToStays(){

      
	}

	public void goTOCars(){
		
		
	}
	
	public void goTOPackages(){
		
		
	}
	
	public void goToThingstodo(){
		
		
	}
	public void goTOCruises(){
		
		
	}
	public void bookAFlight(String leavingfrom , String goingto ){
		type(home.Leavingfrom,leavingfrom);
		//home.Leavingfrom.sendKeys(leavingfrom);
		List<WebElement> elements =  home.Autopopulated1;
		  for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(leavingfrom)) {
                element.click();
                break;
            }

        }
        type(home.Goingto,goingto);
		//home.Goingto.sendKeys(goingto);
		List<WebElement> elements1 =  home.Autopopulated2;
        for (WebElement element : elements1) {
            if (element.getText().equalsIgnoreCase(goingto)) {
                element.click();
                break;
            }

        }
		//home.Departing.click();
		click(home.Departing);
		//home.Departingdate.click();
		click(home.Departingdate);
		//home.Returningdate.click();
		click(home.Returningdate);
		//home.Done.click();
		click(home.Done);
		//home.Search.click();
		click(home.Search);
		
		
		
	}
	public int findtabCount(){
		
		return home.tabCount.size();
	}
}
