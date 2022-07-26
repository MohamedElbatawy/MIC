package base;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class PageBases {

	public WebDriver driver;
	public WebDriverWait wait;

	public static JavascriptExecutor executor;

	static Actions action;




	// create a constructor to initialise the driver
	public PageBases(WebDriver driver ) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver,30);
		executor = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}


	//protected static  WebDriver driver ;  

	public void click(By button) {
		WebElement e1 = driver.findElement(button);
		System.out.println("Clicked on button ["+e1.getText() + "]");
		e1.click();
	}
	
	protected static void clickButton(WebElement button) 
	{

		button.click();
	}

	protected static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}

	protected static void scrollDown() 
	{
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].scrollIntoView(true);", element);    
		executor.executeScript("window.scrollBy(0,1000)");

	}


	protected static void scrollUp() 
	{
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].scrollIntoView(true);", element); 
		//executor.executeScript("window.scrollBy(0,-1000)");

		//action.sendKeys(Keys.HOME).build().perform();

		//action.keyDown(Keys.CONTROL).sendKeys(Keys.).perform();

		//action.sendKeys(Keys.PAGE_UP).build().perform();

	}


	protected static void scrollToElemnent(WebElement element) 
	{
		//action.moveToElement(element);
		//action.perform();

		executor.executeScript("arguments[0].scrollIntoView(true);",element);

		//executor.executeScript("arguments[0].scrollIntoView(false);", element);

	}

	protected static void zoomOut() 
	{
		try {
			Robot robot = new Robot();

			for (int i = 1; i < 4; i++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
		}

		catch (AWTException e)
		{
			e.printStackTrace();
		}

	}









}
