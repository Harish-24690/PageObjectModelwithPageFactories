package test.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test.base.Page;
import test.pages.actions.SigninPage;
import test.utilities.TestUtil;

public class SigninTest {
	
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public  void signInTest(Hashtable<String ,String >data) {
		if(!data.get("runmode").equals("Y")){
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
			
		}
		Page.initConfiguration();	
		SigninPage page=	Page.topnav.gotoSignin();
		page.doLogin(data.get("username"), data.get("password"));
		Page.quitBrowser();
		
		
	}
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
			Page.quitBrowser();
		}
		
		
	}

}
