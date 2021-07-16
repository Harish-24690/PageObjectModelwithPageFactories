package test.rough;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.expedia.co.in/");
		
		//Clicking on flight tabs
		driver.findElement(By.xpath("//*[@id='uitk-tabs-button-container']/li[2]/a")).click();
		
		
		
		// Enter "Delhi in" text in Search edit box and wait for 30 seconds to load the
        // results
		//                            leavingfrom
        driver.findElement(By.xpath("//*[@id='location-field-leg1-origin-menu']/div[1]/button")).sendKeys("Delhi (DEL - Indira Gandhi Intl.)");
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

        // get all the auto populated results - using xpath
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id='location-field-leg1-origin-menu']/div[2]/ul/li/button/div/div[1]/span/strong"));

        System.out.println(elements.size());

        // Traverse each auto-suggest result and click on the result "delhi", if
        // this suggestion is displayed.
        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase("Delhi (DEL - Indira Gandhi Intl.)")) {
                element.click();
                break;
            }

        }
        
        
     // Enter "bengaluru in" text in Search edit box and wait for 30 seconds to load the
        // results
        driver.findElement(By.xpath("//*[@id='location-field-leg1-destination-menu']/div[1]/button")).sendKeys("Bengaluru (BLR - Kempegowda Intl.)");
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

        // get all the auto populated results - using xpath
        List<WebElement> elements1 = driver.findElements(By.xpath("//*[@id='location-field-leg1-destination-menu']/div[2]/ul/li/button/div/div[1]/span/strong"));

        System.out.println(elements1.size());

        // Traverse each auto-suggest result and click on the result "benguluru", if
        // this suggestion is displayed.
        for (WebElement element : elements1) {
            if (element.getText().equalsIgnoreCase("Bengaluru (BLR - Kempegowda Intl.)")) {
                element.click();
                break;
            }

        }
        
		driver.findElement(By.xpath("//*[@id='d1-btn']")).click();
		driver.findElement(By.xpath("//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[4]/button")).click();
		//driver.findElement(By.xpath("//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/section/section/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/table/tbody/tr[4]/td[3]/button")).click();
		//Clicking on done
		driver.findElement(By.xpath("//*[@id='wizard-flight-tab-roundtrip']/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/button")).click();
		//Clicking on search 
	    driver.findElement(By.xpath("//*[@id='wizard-flight-pwa-1']/div[3]/div[2]/button")).click();
	}

}


/*
package demopackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

 public static void main(String[] args) throws InterruptedException {
  // TODO Auto-generated method stub
  
  System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  
  driver.get("https://www.makemytrip.com/");
  
  driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();
  Thread.sleep(5000);
  
  String flag = "False";
 

  while(flag=="False") {
   
   if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).size()>0) {
    
   driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Aug 10 2020')]")).click(); 
   flag="True";
   Thread.sleep(5000);
   }
   
   else {
    Thread.sleep(5000);
    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
   }
      
  }
  
  
  System.out.println("Test case is passed");
  driver.close();
  
    
 }

}
*/