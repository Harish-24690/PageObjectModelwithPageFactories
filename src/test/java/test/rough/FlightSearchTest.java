package test.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.base.Page;
import test.pages.actions.HomePage;

public class FlightSearchTest {
	
	public static void main(String[] args) {
		
		Page.initConfiguration();
		HomePage home = new HomePage();
	     home.gotoFlights().bookAFlight("Delhi (DEL - Indira Gandhi Intl.)", "Bengaluru (BLR - Kempegowda Intl.)");
	     
	    // Page.quitBrowser();
		
	}

}
