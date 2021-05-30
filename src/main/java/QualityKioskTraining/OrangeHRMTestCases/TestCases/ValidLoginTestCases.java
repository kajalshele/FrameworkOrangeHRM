package QualityKioskTraining.OrangeHRMTestCases.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import QualityKioskTraining.OrangeHRMTestCases.Pages.LoginPage;

public class ValidLoginTestCases {
	
	LoginPage loginPage;
	@BeforeClass
	@Parameters("browser")
	public void init(String browser) {
		loginPage=new LoginPage(browser);
	}
	@Test(priority=1)
	public void testLoginWithValidCredential() {
		/*
		 * open browser
		 * open url
		 * enter username
		 * enter pwd
		 * click signIn
		 * verify welcome sreen appears
		 */
		loginPage.doLogin("Admin", "admin123");		
	}
	
	
}
