package test.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	
	@FindBy(xpath = "//*[@id='uitk-tabs-button-container']/li[2]/a")
	public  WebElement flightsTab;
	
	//Locators to book a flight
	
	@FindBy(xpath = "//*[@id='location-field-leg1-origin-menu']/div[1]/button")
	public WebElement Leavingfrom;
	@FindBy(xpath = "//*[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div[1]/span/strong")
	public List<WebElement> Autopopulated1;
	
	
	@FindBy(xpath = "//*[@id='location-field-leg1-destination-menu']/div[1]/button")
	public WebElement Goingto;
	@FindBy(xpath = "//*[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div[1]/span/strong")
	public List<WebElement> Autopopulated2;
	
	
	@FindBy(xpath = "//*[@id='d1-btn']")
	public WebElement Departing;
	@FindBy(xpath = "//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[4]/button")
	public WebElement Departingdate;
	@FindBy(xpath = "//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/table/tbody/tr[4]/td[3]/button")
	public WebElement Returningdate;
	
	@FindBy(xpath = "//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/button")
	public WebElement Done;
	@FindBy(xpath = "//*[@id='wizard-flight-pwa-1']/div[3]/div[2]/button")
	public WebElement Search;
	
	
	@FindBy(css="a[role='tab']")
	public List<WebElement> tabCount;

}
