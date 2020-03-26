package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Excelutlity.Exceldata;


public class InvalidInput {
	
	WebDriver driver;
	
	//To Inspects the Web elements
	By Login = By.xpath("//*[@id=\"login\"]");
	By Username = By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox1\"]");
	By Password = By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox2\"]");
	By Submit = By.xpath("//*[@id=\"ContentPlaceHolder1_btnlogin\"]");
	
    By popup= By.xpath("//*[@id=\"msgdiv\"]/div/div/div");
	By  firstx = By.xpath("//*[@id=\"msgdiv\"]/div/div/button/span");
	By secondx = By.xpath("//*[@id=\"myModal\"]/div/div/button/span");
	
	//To Launch different browsers
	public void launchBrowsers(String browser)
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
	// To Click on Login link
 public void clickLogin()
   {
	driver.findElement(Login).click();
   }

 //To call the invalid details from excel sheet
 public void usernamepassword(int a) throws IOException, InterruptedException
     {
	 Exceldata details= new Exceldata();
	
	 driver.findElement(Username).sendKeys(details.excel_username(a));
	 driver.findElement(Password).sendKeys(details.excel_password(a));
     }
 
 //To  click on the submit login check link
 public void submitting()
    {
	 driver.findElement(Submit).click();
    }
 
//To handle the popup page
 public void popHandling()
    {
	 String  s=driver.findElement(By.xpath("//*[@id=\"msgdiv\"]/div/div/div")).getText();
	 System.out.println("Unable To Login: Email/Password Is Invalid" +s);
	 driver.findElement(firstx).click();
	 driver.findElement(secondx).click();  
    }
 
 // To close the browser
   public void close()
     {
	 driver.quit();
     }
  }
