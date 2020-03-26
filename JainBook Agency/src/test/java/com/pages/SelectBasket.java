package com.pages;


import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class SelectBasket 
   {
    WebDriver driver;

	//To Inspect the WebElements
	By Login = By.xpath("//*[@id=\"login\"]");
	By Username = By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox1\"]");
	By Password = By.xpath("//*[@id=\"ContentPlaceHolder1_TextBox2\"]");
	By Submit = By.xpath("//*[@id=\"ContentPlaceHolder1_btnlogin\"]");
	By basket =By.xpath("//*[@id=\"basket\"]");
	By selbasket=By.xpath("//*[@id=\"ContentPlaceHolder1_HyperLink1\"]");
	By moverightList =By.xpath("//*[@id=\"bestsellers\"]/a[2]/i");
    By MyAccount = By.xpath("//*[@id=\"form1\"]/div[3]/header/div[2]/div/div[1]/div/ul/li/a/span[1]");
    By LogOut = By.xpath("//*[@id=\"logout\"]");
    
    // To launch different browsers
	public void launchbrowser(String browser)
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
	
	// To give valid login credentials 
	public void Mylogin() throws IOException
	{
	
	driver.findElement(Login).click();
	driver.findElement(Username).sendKeys("saidharmatejathulluru@gmail.com");
	driver.findElement(Password).sendKeys("dharma0808");
	driver.findElement(Submit).click();
	}
	
	//To Click on the Shopingbasket check link
	public void shoppingbasket() throws InterruptedException 
	{
		Thread.sleep(3000);
		WebElement x =driver.findElement(MyAccount);
		WebElement y=driver.findElement(basket);
		Actions act=new Actions(driver);
		act.moveToElement(x);
		act.moveToElement(y).click().build().perform();
		Thread.sleep(300);
	}

	//To Click on the Shopingbasket check link
	public void Selectbasket()
	{
		driver.findElement(selbasket).click();
	}
	
	// To Click on the list Move right
	public void moveListItems()
	{
		driver.findElement(moverightList).click();	
	}
	
	//To click on logout page
	public void logOutPage() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement ab =driver.findElement(MyAccount);
		WebElement cd=driver.findElement(LogOut);
		Actions act=new Actions(driver);
		act.moveToElement(ab);
		act.moveToElement(cd).click().build().perform();
		Thread.sleep(300);

	    driver.close();
	}
}
