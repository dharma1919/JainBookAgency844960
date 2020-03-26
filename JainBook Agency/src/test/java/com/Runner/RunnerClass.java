package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/features/Testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_jainbook,@TC02_jainbook,@TC03_jainbook"},
		glue = {"com.StepDefination"},
		monochrome = true
		)

public class RunnerClass 
{

}
