package test.testcases;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import errorcollectors.ErrorCollector;
import io.github.bonigarcia.wdm.WebDriverManager;
import test.base.Page;
import test.pages.actions.HomePage;
import test.utilities.TestUtil;

public class FlightSearchTest {
 
	@BeforeTest
	public void setUp(){
		
		Page.initConfiguration();
	}
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public  void flightSearchTest(Hashtable<String,String>data) {
		
		
		HomePage home = new HomePage();
		ErrorCollector.verifyEquals(home.findtabCount(), 5);     //Assert.assertEquals(home.tabCount(), 6);
	     home.gotoFlights().bookAFlight(data.get("leavingfrom"), data.get("goingto"));
	     
		
	}
	
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
			Page.quitBrowser();
		}
	}

}
