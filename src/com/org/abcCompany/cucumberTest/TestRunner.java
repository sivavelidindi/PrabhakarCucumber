package com.org.abcCompany.cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"com.org.abcCompany.stepDefinitions"}
		,monochrome=true
		,tags= {"@configScenario"}
		)

public class TestRunner {

}
