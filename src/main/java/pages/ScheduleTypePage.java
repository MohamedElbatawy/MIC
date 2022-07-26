package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageBases;

public class ScheduleTypePage extends PageBases {

	
	
	public ScheduleTypePage(WebDriver driver) {
		super(driver);
		
	}


	
	@FindBy(xpath="//i[@class='owl-grid-action icon-plus-sign']")
	WebElement addNewScheduleIcon;
	
	@FindBy(xpath="//span[contains(text(),'Clear Submission')]")
	WebElement clearSubmissioForTheQuote;
	
	
	@FindBy(xpath="//span[contains(text(),'View Schedules')]")
	WebElement viewScheduleOption;
	
    //@FindBy(xpath="//body/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[20]/span[1]")
	//WebElement viewScheduleOption;
	
	@FindBy(xpath="//span[@class='owl-widget owl-lookup k-datepicker k-widget k-header owl-first-tab-element owl-state-invalid']//child::span[1]//child::span[2]")
	WebElement scheduleTypeList;
	
	@FindBy(xpath="//input[@class='k-textbox']")
	WebElement ScheduleSearch;
	
	@FindBy(xpath="//td[contains(text(),'Vehicles  Schedule')]")
	WebElement selectSchedule;
	
	
	@FindBy(xpath="//span[@class='owl-widget owl-lookup k-datepicker k-widget k-header owl-state-invalid']//child::span[1]//child::span[2]")
	WebElement policySection;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement clickOkButton;
	
	@FindBy(xpath="//i[@class='owl-grid-action icon-eye-open']")
	WebElement scheduleViewIcon;
	
	
	
	public void ClickOnAddNewSchedule() throws InterruptedException {
		
		//wait.until(ExpectedConditions.visibilityOf(addNewScheduleIcon));
		Thread.sleep(10000);
		clickButton(addNewScheduleIcon);
		
	}
	
	
	public void selectSchedule() {
		
		wait.until(ExpectedConditions.visibilityOf(scheduleTypeList));
		clickButton(scheduleTypeList);
		
		wait.until(ExpectedConditions.visibilityOf(ScheduleSearch));
		ScheduleSearch.sendKeys("VLC");
		
		wait.until(ExpectedConditions.textToBePresentInElement(selectSchedule, "Vehicles Schedule"));
		
		clickButton(selectSchedule);
		
		
		
	}
	
	public void selectPolicySection() {
	
		clickButton(policySection);
	}
	
	public void clickOKButton() throws InterruptedException {
		
		//wait.until(ExpectedConditions.visibilityOf(clickOkButton));
		
		Thread.sleep(8000);
		clickButton(clickOkButton);
	}
	
	
public void clickOnViewIcon() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(scheduleViewIcon));
		
		//Thread.sleep(8000);
		clickButton(scheduleViewIcon);
	}
	
	
	
	



		
}
