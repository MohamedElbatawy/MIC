package pages;

import java.sql.Driver;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageBases;

public class SubmissionScreenPage extends PageBases {

	
	public SubmissionScreenPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//i[@class='icon-plus-sign icon-white']")
	WebElement newSubmissionIcon;
	
	@FindBy(xpath="//ul[@class='owl-breadcrumb']")
	WebElement moveFromSubmissionButton;
	
	
	
	//@FindBy(xpath = "//input[@class='k-input owl-lookup-code']")
	//@FindBy(css = "input[class^='k-input owl-lookup-code']")
	//WebElement producerName;
	
	
	//@FindBy(xpath="//*[@class='owl-input-wrap']//child::input[1]")
	//WebElement producerCode;

	@FindBy(xpath="//span[@class='owl-widget owl-lookup k-datepicker k-widget k-header owl-first-tab-element owl-state-invalid']//child::span[1]//child::span[2]")
	WebElement producersList;
	
	
	@FindBy(xpath="//input[@class='k-textbox']")
	WebElement producerSearch;
	
	@FindBy(xpath="//td[@class='owl-member owl-cell']")
	WebElement selectMarketSource;
	
	//@FindBy(xpath="//input[@class='k-input owl-lookup-desc']")
	//WebElement producerField;
	
	
	
	//@FindBy(xpath="//span[@class='k-select'][@unselectable='on']")
	//WebElement producerList;
	
	
	
	
	//@FindBy(xpath="(//span[@class='k-icon k-i-arrow-s'])[5]")
	//WebElement producerList;
	
	//@FindBy(css ="span.k-icon.k-i-arrow-s:before")
	//WebElement producerList;
	
	
	
	//@FindBy(xpath="//tr[@class='owl-member owl-cell']")
	//WebElement producer;
	
	//@FindBy(xpath = "//span[@class='k-icon k-i-search']")
	//WebElement searchForInsured;
	
	@FindBy(xpath="//span[@class='owl-widget owl-lookup k-datepicker k-widget k-header owl-state-invalid']//child::span[1]//child::span[2]")
	WebElement searchForInsured;
	
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement insuredSearchButton;
	
	@FindBy(xpath = "//span[@class='k-icon k-i-maximize']")
	WebElement maxmizeInsuredScreen;
	
	//@FindBy(xpath = "//*[@id=\"EnquiryResutsGrid\"]/div[2]/table/tbody/tr[3]")
	//@FindBy(id = "EnquiryResutsGrid_active_cell")
	//WebElement selectInsured;
	
	
	@FindBy(xpath="//div[@class='owl-enquiry-results-wrapper owl-widget']//child::div[1]//child::div[2]//child::table//child::tbody//child::tr[3]")
	WebElement selectInsured;
	
	
	//@FindBy(xpath = "//td[@id='EnquiryResutsGrid_active_cell']")
		//@FindBy(id = "EnquiryResutsGrid_active_cell")
	//WebElement selectInsured;
	
	//td[@id='EnquiryResutsGrid_active_cell']
	
	//@FindBy(xpath = "//button[@class='btn btn-primary']")
	@FindBy(xpath = "//*[@id=\"EnquiryContent\"]/div[2]/div/button[1]")
	WebElement okButtonForInsured;
	
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[5]/div[1]/div[3]/span[1]/span[1]/span[2]")
	//@FindBy(xpath="//span[@class='owl-widget owl-lookup k-datepicker k-widget k-header']//child::span[1]//child::span[2]//child::span[1]")
	WebElement marketSource;
	
	@FindBy(xpath="//input[@class='k-textbox']")
	WebElement MarketSourceCode;
	
	@FindBy(xpath="//td[@class='owl-member owl-cell']")
	WebElement selectpProducer;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[5]/div[1]/div[2]/span[1]/span[1]/span[2]")
	//@FindBy(xpath="//span[@class='owl-widget owl-lookup k-datepicker k-widget k-header']//child::span[1]//child::span[2]//child::span[1]")
	WebElement underwritterName;
	
	
	@FindBy(xpath="(//span[@class='k-icon k-i-arrow-s'])[20]")
	WebElement officessList;
	
	
	@FindBy(xpath="//td[@class='owl-member owl-cell']")
	WebElement selectpOffice;
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[5]/div[1]/div[7]/span[1]/span[1]/span[2]")
	WebElement policyTypeList;
	
	@FindBy(xpath="//td[contains(text(),'Standard Policy')]")
	WebElement policyType;
	
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[5]/div[1]/div[8]/span[1]/span[1]/span[2]/span[1]")
	WebElement productList;
	
	@FindBy(xpath="//td[@id='aria_active_cell']")
	WebElement productType;
	
	
	
	@FindBy(xpath="//body/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[5]/div[1]/div[11]/span[1]/span[1]/span[2]")
	WebElement hazardLevelList;
	
	@FindBy(xpath="//td[@id='aria_active_cell']")
	WebElement hazardLevelType;
	
		
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement SubmissionScreenOkButton;
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void openNewSubmissionScreen() {
		wait.until(ExpectedConditions.visibilityOf(newSubmissionIcon));
		clickButton(newSubmissionIcon);
		
		clickButton(moveFromSubmissionButton);
	}
	
	
	
	
	
	public void producerData() throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOf(producerName));
		//clickButton(producerField);
		//clickButton(producerList);
		//wait.until(ExpectedConditions.visibilityOf(producerList));
		//clickButton(producer);
		//wait.until(ExpectedConditions.elementT(producerName));
		//producerName.click();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		//Thread.sleep(15000);
		//wait.until(ExpectedConditions.elementToBeClickable(producerList));
		//clickButton(producersList);
		//Thread.sleep(10000);
		//clickButton(producerField);
		//producerField.sendKeys("Direct insured");
		//clickButton(producer);
		
		//System.out.println(producerName.isEnabled());
		
		//setTextElementText(producerName, "none");
		
		//clickButton(producerList);
		//writeText(producerName,driver, "none");
		
		//Thread.sleep(10000);
		
	    //producerName.click();
		
		//producerName.clear();
		
		//System.out.println(producerName.isSelected());
		
		//producerName.sendKeys("none");
		
		//producerCode.sendKeys("none");
		
		
		
		
		//System.out.println(producerName.getText());
		
		//Thread.sleep(10000);
		//producerCode.sendKeys(Keys.ENTER);
		
		//System.out.println(producerName.getText());
		//Thread.sleep(10000);
		
		wait.until(ExpectedConditions.visibilityOf(producersList));
		clickButton(producersList);
		
		wait.until(ExpectedConditions.visibilityOf(producerSearch));
		producerSearch.sendKeys("non");
		
		wait.until(ExpectedConditions.textToBePresentInElement(selectpProducer, "NON"));
		//Thread.sleep(50000);
		clickButton(selectpProducer);
		
		//setTextElementText(producerSearch, "none");
		
		//clickButton(producer);
		
		
	}
	
	public void insuredData() throws InterruptedException  {
	    //Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOf(searchForInsured));
		clickButton(searchForInsured);
		
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOf(maxmizeInsuredScreen));
		clickButton(maxmizeInsuredScreen);
		
		clickButton(insuredSearchButton);
		
		//Thread.sleep(15000);
		wait.until(ExpectedConditions.visibilityOf(selectInsured));
		
		System.out.println(selectInsured.isDisplayed());
		System.out.println(selectInsured.isEnabled());
		
		//scrollToElemnent(selectInsured);
		
		//wait.until(ExpectedConditions.elementToBeClickable(selectInsured));
		clickButton(selectInsured);
		
		wait.until(ExpectedConditions.elementToBeClickable(okButtonForInsured));
		clickButton(okButtonForInsured);
		
	}
	
	
	public void selectUWName() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(underwritterName));
		//wait.until(ExpectedConditions.elementToBeClickable(underwritterName));
		clickButton(underwritterName);
		Thread.sleep(5000);
	}
	
	

	public void selectMarketSource() {
		wait.until(ExpectedConditions.visibilityOf(marketSource));
		//wait.until(ExpectedConditions.elementToBeClickable(underwritterName));
		clickButton(marketSource);
		
		wait.until(ExpectedConditions.visibilityOf(MarketSourceCode));
		producerSearch.sendKeys("dir");
		
		wait.until(ExpectedConditions.textToBePresentInElement(selectMarketSource, "DIR"));
		//Thread.sleep(50000);
		clickButton(selectMarketSource);
	}
	

	
	public void selectOffice() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(officessList));
        clickButton(officessList);
		//wait.until(ExpectedConditions.textToBePresentInElement(selectpOffice, "NONE"));
       // wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//td[text()='بنهـــــــــا']"))));
        //clickButton(driver.findElement(By.xpath("//td[text()='بنهـــــــــا']")));
        
        //wait.until(ExpectedConditions.visibilityOf(selectpOffice));
        Thread.sleep(8000);
        clickButton(selectpOffice);
		
		
	}
	
	public void selectPolicyType() {
      
		clickButton(policyTypeList);
		
		//wait.until(ExpectedConditions.visibilityOf(policyType));
		//producerSearch.sendKeys("std");
		
		wait.until(ExpectedConditions.textToBePresentInElement(policyType, "Standard Policy"));
		//Thread.sleep(50000);
		clickButton(policyType);
		
	}
	
	
	
	public void selectProductType() throws InterruptedException {
		Thread.sleep(10000);
		//wait.until(ExpectedConditions.visibilityOf(productList));
		clickButton(productList);
		
		//wait.until(ExpectedConditions.visibilityOf(productType));
		clickButton(productType);
	}
	
	
	public void selectHazardLevel() throws InterruptedException {
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOf(productList));
		clickButton(hazardLevelList);
		
		//wait.until(ExpectedConditions.visibilityOf(productType));
		clickButton(hazardLevelType);
	}
	
	public void clickOnOkButton() {
		
		clickButton(SubmissionScreenOkButton);
	}

}
