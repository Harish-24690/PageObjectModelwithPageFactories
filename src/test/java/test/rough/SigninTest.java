package test.rough;

import test.base.Page;
import test.pages.actions.SigninPage;

public class SigninTest {
	
	public static void main(String[] args) {
		
		Page.initConfiguration();
		SigninPage page=	Page.topnav.gotoSignin();
		page.doLogin("harishr24690@gmail.com", "Harish9731332306");
		
		
		
	}

}
