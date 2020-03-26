@Jainbookagency
Feature: JainBook Website

@TC01_jainbook
Scenario:  Invalid login to the jainbook application

Given the user is launching the chrome application
When the user click on the login page
Then the user enters the inavalid username and invalid password.
Then the user click on the login button and it should not navigate to the next page 
Then it idisplays an appropriate pop-up message
And the user minimizing pop-up window and close the browser

@TC02_jainbook
Scenario:  valid login and click on the categories  

Given the user is launchs the chrome application
When the user click on the login page and enters username and password
Then the user click on the  Categories option
Then the user click on the  education option
Then the user scrolls the page down
Then the user clicks on the fourth page
And the user closes the browser


@TC03_jainbook
Scenario:  login and enter the search data with in the data

Given the user launch the chrome application
When the user click on the login page and enters the username and password
Then the user click on the shopping basket.
Then the user click on the selectbasket
Then the user logout from the website and closes the browser


