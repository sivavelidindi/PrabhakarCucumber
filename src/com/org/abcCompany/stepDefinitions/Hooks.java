package com.org.abcCompany.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.org.abcCompany.config.DriverSetup;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void beforeMethod() {
		driver = DriverSetup.setupDriver();
	}

	@After
	public void afterMethod() {
		driver.quit();
	}
}
