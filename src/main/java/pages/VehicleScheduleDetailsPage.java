package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageBases;

public class VehicleScheduleDetailsPage extends PageBases {

	
	
	public VehicleScheduleDetailsPage(WebDriver driver) {
		super(driver);
		
	}


	
	@FindBy(xpath="//i[@class='owl-grid-action icon-plus-sign']")
	WebElement addNewVehicleSchedule;
	
	//@FindBy(xpath="//body/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[4]/span[1]/span[1]/span[2]")
	//WebElement typeOfVehicleList;
	
	@FindBy(xpath="//span[@class='owl-widget owl-lookup k-datepicker k-widget k-header owl-state-invalid k-state-border-down']//child::span[1]//child::span[2]")
	WebElement typeOfVehicleList;
	
	//@FindBy(xpath="//span[@class='k-input owl-lookup-code']")
	//WebElement typeOfVehicleList;
	
	@FindBy(xpath="//td[@class='owl-member owl-cell']")
	WebElement selectVehicleType;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement clickOkButton;
	
	
	
	
	
	public void ClickOnAddNewSchedule() throws InterruptedException {
		
		//wait.until(ExpectedConditions.visibilityOf(addNewVehicleSchedule));
		Thread.sleep(1000);
		clickButton(addNewVehicleSchedule);
		
		Thread.sleep(5000);
		
		//zoomOut();
		
	}
	
	
public void vehicleData() throws InterruptedException {
		
		//scrollToElemnent(typeOfVehicle);
		//wait.until(ExpectedConditions.visibilityOf(typeOfVehicleList));
		Thread.sleep(30000);
		clickButton(typeOfVehicleList);
		//typeOfVehicleList.sendKeys("BU");
		//wait.until(ExpectedConditions.visibilityOf(selectVehicleType));
		Thread.sleep(15000);
		clickButton(selectVehicleType);
	
	}
	
	
	



		
}
