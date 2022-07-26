package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.PageBases;

public class LoginPage extends PageBases {

	//WebDriverWait wait2;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// wait = new WebDriverWait(driver, 120);

	}
	
	//WebDriverWait wait2 = new WebDriverWait(driver, 50);

	@FindBy(xpath = "//input[@name='userName']")
	WebElement userNameEditBox;


	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordEditBox;
	
	@FindBy(xpath = "(//span[@class='k-dropdown-wrap k-state-default'])[1]")
	public WebElement insuredTypeField;
	
	@FindBy(xpath = "//li[@data-offset-index='1']")
	WebElement generalInsurenceItem;
	
	
	@FindBy(xpath = "(//span[@class='k-dropdown-wrap k-state-default'])[2]")
	public WebElement languageField;
	
	
	
	@FindBy(xpath = "//li[@data-offset-index='5']")
	 public WebElement ProductLanguageItem;
	

	@FindBy(xpath = "//button[@name='login']")
	WebElement logInButton;
	
	
	By languageFeldBtn 		= By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[2]");
	By ProductLanguageList 	= By.xpath("//li[@data-offset-index='5']");
	

	public void userData(String userName,String password) throws InterruptedException {

		Thread.sleep(5000);
		setTextElementText(userNameEditBox, userName);
		setTextElementText(passwordEditBox, password);
		//Thread.sleep(30000);
	}
	
	public void selectedBusinesstype() throws InterruptedException
	{
		
		
		clickButton(insuredTypeField);
		
		clickButton(generalInsurenceItem);
		
		
	}
	
	public void selectedProductLanguage() throws InterruptedException
	{
		
		
		//wait.until(ExpectedConditions.visibilityOf(languageFeldBtn));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(languageFeldBtn));
		//Thread.sleep(2000);
		//click(languageFeldBtn);
		
		//click(ProductLanguageList);
	
		wait.until(ExpectedConditions.visibilityOf (languageField));
		//Thread.sleep(30000);
		clickButton(languageField);
		//wait.until(ExpectedConditions.visibilityOf(ProductLanguageItem));
		Thread.sleep(2000);
		clickButton(ProductLanguageItem);
	}
	
	public void loginAcion() throws InterruptedException {
		clickButton(logInButton);
		//Thread.sleep(10000);
	}

	

}
