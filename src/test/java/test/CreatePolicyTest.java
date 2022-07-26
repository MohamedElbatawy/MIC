package test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.TestBase;
import data.Loadproperties;
import pages.LoginPage;
import pages.QuotePreperationPage;
import pages.ScheduleTypePage;
import pages.SubmissionScreenPage;
import pages.VehicleScheduleDetailsPage;


public class CreatePolicyTest extends TestBase {
	
	
	LoginPage loginPageObject;
	
	
	 
	
	String userName=Loadproperties.userData.getProperty("UserName");
	String password=Loadproperties.userData.getProperty("password");
	
	
	

	@Test(priority = 1, alwaysRun = true)
	public void loginTest() throws InterruptedException {
		
		
		loginPageObject=new LoginPage(driver);
		
		loginPageObject.userData(userName, password);
		
		/*if (loginPageObject.insuredTypeField.isDisplayed()==false||loginPageObject.languageField.isDisplayed()==false) {
			
			driver.navigate().refresh();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			loginPageObject.userData(userName, password);
			
			loginPageObject.selectedBusinesstype();

			loginPageObject.selectedProductLanguage();
			
			System.out.println(loginPageObject.ProductLanguageItem.getText());
			
			loginPageObject.loginAcion();
		}*/
			
			
		loginPageObject.selectedBusinesstype();
		
		loginPageObject.selectedProductLanguage();
		
		//System.out.println(loginPageObject.ProductLanguageItem.getText());
		
		loginPageObject.loginAcion();
	}
	
	
	@Test(priority = 2, alwaysRun=true)
	public void SubmissionScreen() throws InterruptedException  {
		SubmissionScreenPage submissionScreenObject=new SubmissionScreenPage(driver);
			submissionScreenObject.openNewSubmissionScreen();
			submissionScreenObject.producerData();
			submissionScreenObject.insuredData();
			submissionScreenObject.selectUWName();
			submissionScreenObject.selectMarketSource();
			submissionScreenObject.selectOffice();
			submissionScreenObject.selectPolicyType();
			submissionScreenObject.selectProductType();
			submissionScreenObject.selectHazardLevel();
			submissionScreenObject.clickOnOkButton();
	}
	
	@Test(priority = 3, alwaysRun=true)
	public void quotePreperation() throws InterruptedException  {
		
		QuotePreperationPage quotePreprationObject=new QuotePreperationPage(driver);
			
			quotePreprationObject.ClickOnPolicyActivityLine();
			quotePreprationObject.clearSubmission();
			quotePreprationObject.viewSchedule();
   }
	
	/*@Test(priority = 4, alwaysRun=true)
	public void scheduleType() throws InterruptedException  {
		
		ScheduleTypePage scheduleTypeObject=new ScheduleTypePage(driver);
			
		scheduleTypeObject.ClickOnAddNewSchedule();
		
		scheduleTypeObject.selectSchedule();
		
		scheduleTypeObject.selectPolicySection();
		
		scheduleTypeObject.clickOKButton();
		
		scheduleTypeObject.clickOnViewIcon();
	}*/
	
	
	/*@Test(priority = 5, alwaysRun=true)
	public void vehicleScheduleDetails() throws InterruptedException  {
		
		VehicleScheduleDetailsPage vehicleScheduleDetailsObject=new VehicleScheduleDetailsPage(driver);
			
		vehicleScheduleDetailsObject.ClickOnAddNewSchedule();
		
		vehicleScheduleDetailsObject.vehicleData();
		
	
	}*/

	
	
}

