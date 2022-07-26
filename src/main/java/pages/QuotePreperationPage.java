package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageBases;

public class QuotePreperationPage extends PageBases {

	
	
	public QuotePreperationPage(WebDriver driver) {
		super(driver);
		
	}


	
	@FindBy(xpath="//td[contains(text(),'Submission to Clear')]")
	WebElement policyActivityLine;
	
	@FindBy(xpath="//span[contains(text(),'Clear Submission')]")
	WebElement clearSubmissioForTheQuote;
	
	
	//@FindBy(xpath="//span[contains(text(),'View Schedules')]")
	//WebElement viewScheduleOption;
	
	//@FindBy(xpath="//body/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/ul[1]/li[21]/span[1]")
	@FindBy(xpath="//span[contains(text(),'View Schedules')]")
	WebElement viewScheduleOption;
	
	
	public void ClickOnPolicyActivityLine() throws InterruptedException {
		
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.textToBePresentInElement(policyActivityLine, "Submission to Clear	"));
		//wait.until(ExpectedConditions.visibilityOf(policyActivityLine));
		clickButton(policyActivityLine);
		
		zoomOut();
		
	}
	
	
public void clearSubmission() throws InterruptedException {
		
		Thread.sleep(5000);
        wait.until(ExpectedConditions.visibilityOf(clearSubmissioForTheQuote));
		System.out.println("Clear submission is displayed "+clearSubmissioForTheQuote.isEnabled());
		clickButton(clearSubmissioForTheQuote);
		Thread.sleep(10000);
		
	}

public void viewSchedule() throws InterruptedException {
	
	//clickButton(policyActivityLine);
	Thread.sleep(10000);
	System.out.println("View schedule is displayed : "+viewScheduleOption.isDisplayed());
    wait.until(ExpectedConditions.visibilityOf(viewScheduleOption));
    System.out.println("View schedule is displayed : "+viewScheduleOption.isDisplayed());
	clickButton(viewScheduleOption);
	
	
}
	
		
}
