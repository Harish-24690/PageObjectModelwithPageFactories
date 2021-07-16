package test.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPage {
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#app-layer-base > div.uitk-grid.pageWhiteBackground > header > header > div > div > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-flex-end.uitk-flex-nowrap.uitk-flex-item.uitk-flex-basis-half_width.uitk-flex-grow-1 > div > button > div")).click();
		driver.findElement(By.cssSelector("#app-layer-base > div.uitk-grid.pageWhiteBackground > header > header > div > div > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-flex-end.uitk-flex-nowrap.uitk-flex-item.uitk-flex-basis-half_width.uitk-flex-grow-1 > div > div > div:nth-child(2) > a")).click();
		//action.moveToElement(target);
		//action.click();
		//driver.findElement(By.xpath("//*[@id='app-layer-base']/div[1]/header/header/div/div/div[2]/div/button/div"));
		
	}
	
	

}
