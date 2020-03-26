package com.Stepdefination;

import java.io.IOException;

import com.pages.SelectBasket;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelBasketStep  extends SelectBasket
  {
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() 
	   {
		//To calling the launchbrowser method
		launchbrowser("chrome");
	   }

	@When("^the user click on the login page and enters the username and password$")
	public void the_user_click_on_the_login_page_and_enters_the_username_and_password() throws IOException 
	   {
		//To calling the Mylogin method
		Mylogin();
	   }

	@Then("^the user click on the shopping basket\\.$")
	public void the_user_click_on_the_shopping_basket() throws InterruptedException  
	    {
		//To calling the shoppingbasket method
		shoppingbasket();
	    }
	
	@Then("^the user click on the selectbasket$")
	public void the_user_click_on_the_selectbasket() 
	    {
		//To calling the Selectbasket method
		Selectbasket();
		moveListItems();
	    }
	
	@Then ("^the user logout from the website and closes the browser$")
	public void the_user_logout_from_the_website_and_closes_the_browser() throws InterruptedException 
	    {
		//To calling the logOutPage method
		logOutPage();	
	    }
     }
