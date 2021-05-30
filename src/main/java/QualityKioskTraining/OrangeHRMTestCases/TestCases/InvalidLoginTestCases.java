package QualityKioskTraining.OrangeHRMTestCases.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import QualityKioskTraining.OrangeHRMTestCases.Pages.LoginPage;

public class InvalidLoginTestCases {
	LoginPage loginPage;
	@BeforeClass
	@Parameters("browser")
	public void init(String browser) {
		loginPage=new LoginPage(browser);
	}
	
	@Test(priority=1 ,dataProvider="invalidLoginData")
	public void testLoginWithInValidCredential(String username,String password,String errorMsg) {
		/*
		 * open browser
		 * open url
		 * enter username
		 * enter pwd
		 * click signIn
		 * verify welcome sreen appears
		 */
		loginPage.doLogin(username, password);		
		String currentError=loginPage.getLoginError();
		
		Assert.assertEquals(errorMsg, currentError);
	}
	
	@DataProvider
	public Object[][] invalidLoginData(){
		return new Object[][] {
			{"","admin123","Username cannot be empty"},
			{"Admin","","Password cannot be empty"},
			{"kajal","kajalshele","Invalid credentials"}
			
		};
	}
	
	

}
