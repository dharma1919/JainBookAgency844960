package com.pages;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class ClickCategories {
	
WebDriver driver;
	
	By Login = By.xpath("//*[@id=\"login\"]"); // Inspected web elements
	By Username = By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox1\"]");
	By Password = By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox2\"]");
	By Submit = By.xpath("//*[@id=\"ContentPlaceHolder1_btnlogin\"]");

    By clickCategories = By.xpath("//*[@id=\"navigation\"]/ul/li[2]/a");
    By clickEducation = By.xpath("//*[@id=\"category_menu\"]/li[2]/ul/li[4]/a");
    By clickFourth = By.xpath("//*[@id=\"ContentPlaceHolder1_div_booksearch\"]/div/div/div/div[4]/ul/li[5]/a");
    
    By MyAccount = By.xpath("//*[@id=\"form1\"]/div[3]/header/div[2]/div/div[1]/div/ul/li/a/span[1]");
    By LogOut = By.id("logout");
    
	
	public void launchingbrowser(String browser)// To Launch different browser
	{
		
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DHARMA\\Desktop\\Training\\Drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("Explorer"))
			{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\DHARMA\\JainBook\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.jainbookagency.com/india-largest-online-book-store.aspx");
			System.out.println(driver.getTitle());
	
		}
	
	public void loginDetails() // To give valid login credentials 
	{
	driver.findElement(Login).click();
	driver.findElement(Username).sendKeys("trivenivspd@gmail.com");
	driver.findElement(Password).sendKeys("Triveni@17");
	driver.findElement(Submit).click();
	}
	
	
	
     // To click on categories check link
	public void clickiingCategories() throws IOException, InterruptedException
	{
		
		
		
		 WebElement move= driver.findElement(clickCategories);
	     Actions action= new Actions(driver);
	     action.moveToElement(move).click().build().perform();
	     Thread.sleep(3000);
	     // To call screenshot method to take screen shot
	     Screenshotfile("C:\\Users\\DHARMA\\JainBook\\Screenshot\\categoriesPg.jpg");

	}
	
	// To click on Education check link
	public void clickiingEducation() throws InterruptedException 
	{
		WebElement move1= driver.findElement(clickEducation);
	     Actions action= new Actions(driver);
	     action.moveToElement(move1).click().build().perform();
	     Thread.sleep(3000);
		
	}
	// Screenshot method
	public void Screenshotfile( String path) throws IOException 
	{
	TakesScreenshot ss =((TakesScreenshot)driver);
	File Source = ss.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(Source, new File(path));
	}
	
	// To scroll the webpage down
	public void Scrolldown()
	
	{
    driver.get("https://www.jainbookagency.com/booksearch.aspx?catid=160");
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,1000)");

 
    }
	//To Select the fourth in the webpage list
	public void ClickOnFourth()
	{
		 driver.findElement(clickFourth).click();
	}
	// To close the browser
	 public void browserclose()
     {
	 driver.quit();
     }
	
}
