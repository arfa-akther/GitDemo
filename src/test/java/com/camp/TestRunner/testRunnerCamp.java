package com.camp.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.camp.Utility.baseCamp_class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resourcescamp/FeaturesCamp"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitionCamp",tags= {"@runs"})


public class testRunnerCamp extends AbstractTestNGCucumberTests {

	@BeforeTest 
	public void startURLcamp() {
		baseCamp_class testcamp = new baseCamp_class();
		testcamp.initBrowserCamp();
	}
	
	@AfterTest
	public void closeURLcamp() {
		baseCamp_class testcamp = new baseCamp_class();
		testcamp.driver.quit();
	}
}
