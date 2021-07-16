package test.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	//#app-layer-base > div.uitk-grid.pageWhiteBackground > header > header > div > div > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-flex-end.uitk-flex-nowrap.uitk-flex-item.uitk-flex-basis-half_width.uitk-flex-grow-1 > div > button > div
	//@FindBy(css="#app-layer-base > div.uitk-grid.pageWhiteBackground > header > header > div > div > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-flex-end.uitk-flex-nowrap.uitk-flex-item.uitk-flex-basis-half_width.uitk-flex-grow-1 > div > button > div")
	@FindAll({
	@FindBy(css="#app-layer-base > div.uitk-grid.pageWhiteBackground > header > header > div > div > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-flex-end.uitk-flex-nowrap.uitk-flex-item.uitk-flex-basis-half_width.uitk-flex-grow-1 > div > button > div"),	
	@FindBy(xpath="//*[@id='app-layer-base']/div[1]/header/header/div/div/div[2]/div/button/div"),
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/header/header/div/div/div[2]/div/button/div")
	})
	public WebElement signinbutton;
	
	@FindBy(css="#app-layer-base > div.uitk-grid.pageWhiteBackground > header > header > div > div > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-flex-end.uitk-flex-nowrap.uitk-flex-item.uitk-flex-basis-half_width.uitk-flex-grow-1 > div > div > div:nth-child(2) > a")
	public WebElement signin;

}
