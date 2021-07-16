package test.base;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.listeners.CustomListeners;
import test.utilities.ExcelReader;

public class Page {
	
	public static WebDriver driver;
	public static Logger LOGGER = LogManager.getLogger(Page.class.getName());
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\TestLoginExcel.xlsx");
	public static WebDriverWait wait;

	public static String browser;
	public static TopNavigation topnav;
	
	public static void initConfiguration(){
		
		if(Constants.Browser.equals("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			LOGGER.debug("Launching Firefox");
        }else if(Constants.Browser.equals("chrome")){
        	
        	WebDriverManager.chromedriver().setup();
    		Map<String, Object> prefs = new HashMap<String, Object>();
    		prefs.put("profile.default_content_setting_values.notifications", 2);
    		prefs.put("credentials_enable_service", false);
    		prefs.put("profile.password_manager_enabled", false);
    		ChromeOptions options = new ChromeOptions();
    		options.setExperimentalOption("prefs", prefs);
    		options.addArguments("--disable-extensions");
    		options.addArguments("--disable-infobars");

    		driver =  new ChromeDriver(options);
    		LOGGER.debug("Launching Chrome");
        }else if(Constants.Browser.equals("ie")){
        	
        	WebDriverManager.iedriver().setup();
    		driver = new InternetExplorerDriver();
    		LOGGER.debug("Launching InternetExplorer");
        }
		
		
		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.implictwait,TimeUnit.SECONDS);
		//wait = new WebDriverWait();
		topnav = new TopNavigation(driver);
	}
	
	
	
	public  static void click(WebElement element){
		
		element.click();
		CustomListeners.testReport.get().log(Status.INFO, "Clicking on : " + element);
		
		
	}
	
public static void type(WebElement element ,String Value){
		
	element.sendKeys(Value);
		CustomListeners.testReport.get().log(Status.INFO, "Typing on :" +element+   "entering value :" +Value);
	}


static WebElement dropdown;
public void select(WebElement element ,String Value){
	
	
	Select select = new Select(dropdown);
	select.selectByVisibleText(Value);
	CustomListeners.testReport.get().log(Status.INFO, " Typing on :" +element+   "Selected the value from dropdown :" +Value);
}

public static void quitBrowser(){
		
		driver.quit();
		
		
	}

}
