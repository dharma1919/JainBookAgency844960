package com.Stepdefination;

import java.io.IOException;

import com.pages.InvalidInput;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class invalidStep extends InvalidInput
{
	@Given("^the user is launching the chrome application$")
	public void the_user_is_launching_the_chrome_application() 
	   {
		//To calling the launchBrowsers method
		launchBrowsers("chrome");
	   }
	
	@When("^the user click on the login page$")
	public void the_user_click_on_the_login_page()  
	    {
		//To calling the clickLogin method
		clickLogin();
	    }
	
	//To calling the usernamepassword method
	@Then("^the user enters the inavalid username and invalid password\\.$")
	public void the_user_enters_the_inavalid_username_and_invalid_password() throws IOException, InterruptedException  
	  {
		 for(int i=1;i<=1;i++) 
		  {
		usernamepassword(i);
		  }
	  }

	@Then("^the user click on the login button and it should not navigate to the next page$")
	public void the_user_click_on_the_login_button_and_it_should_not_navigate_to_the_next_page()  
	{
		//To calling the submitting method
		submitting();
	}

	@Then("^it idisplays an appropriate pop-up message$")
	public void it_idisplays_an_appropriate_pop_up_message() 
	{
		//To calling the popHandling method
		popHandling();
	}

	@Then("^the user minimizing pop-up window and close the browser$")
	public void the_user_minimizing_pop_up_window_and_close_the_browser() 
	{
		//To calling the close method
		close();
	}

}
