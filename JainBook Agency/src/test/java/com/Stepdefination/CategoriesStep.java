package com.Stepdefination;

import java.io.IOException;

import com.pages.ClickCategories;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoriesStep extends ClickCategories 

{
	
@Given("^the user is launchs the chrome application$")
public void the_user_is_launchs_the_chrome_application() 
   {
	//To calling the browser method
	launchingbrowser("chrome");
   } 
@When("^the user click on the login page and enters username and password$")
public void the_user_click_on_the_login_page_and_enters_username_and_password() throws InterruptedException, IOException
   {
	//To calling the loginDetails method
	loginDetails();
    }
@Then("^the user click on the  Categories option$")
public void the_user_click_on_the_Categories_option() throws InterruptedException, IOException  
   {
	//To calling the clickiingCategories method
	clickiingCategories();
   }
@Then("^the user click on the  education option$")
public void the_user_click_on_the_education_option() throws InterruptedException 
    {
	//To calling the clickiingEducation method
	clickiingEducation();
    }

@Then("^the user scrolls the page down$")
public void the_user_scrolls_the_page_down()  
   {
	//To calling the Scrolldown method
	Scrolldown();
   }

@Then("^the user clicks on the fourth page$")
public void the_user_clicks_on_the_fourth_page() 
   {
	//To calling the ClickOnFourth method
	ClickOnFourth();
    }

@Then("^the user closes the browser$")
public void the_user_closes_the_browser()
    {
	//To calling the browserclose method
	browserclose();
    }

  }
