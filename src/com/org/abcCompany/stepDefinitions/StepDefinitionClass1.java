package com.org.abcCompany.stepDefinitions;

import com.org.abcCompany.pageObjects.POMClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass1 {
	POMClass1 pom;

	public StepDefinitionClass1() {
		try {
			pom = new POMClass1();
		} catch (Exception e) {

		}
	}

	@Given("^User open the application$")
	public void user_open_the_application() throws Throwable {
		pom.openApplication();
	}

	@When("^Click on web page forms$")
	public void click_on_web_page_forms() throws Throwable {
		pom.clickonForm();
	}

	@When("^Click on Layout and Presentation$")
	public void click_on_Layout_and_Presentation() throws Throwable {
		pom.layoutandPresentation();
	}

	@Then("^Verify form is displaying or not$")
	public void verify_form_is_displaying_or_not() throws Throwable {
		pom.isFormDisplayed();
	}

	@When("^Enter \"([^\"]*)\" in the YourName text box$")
	public void enter_testname_in_the_Your_name_text_box(String name) throws Throwable {
		pom.enterName(name);
	}

	@When("^Enter \"([^\"]*)\" in the Email address text box$")
	public void enter_in_the_Email_address_text_box(String email) throws Throwable {
		pom.enterEmail(email);
	}

	@When("^Select BreakFast \"([^\"]*)\"$")
	public void select_BreakFast(String item) throws Throwable {
		pom.selectBreakfast(item);
	}

	@When("^Select Coffee with \"([^\"]*)\"$")
	public void select_Coffee_with(String preferences) throws Throwable {
		pom.selectCoffeeWithanyPreferences(preferences);
	}

	@When("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {
		pom.clickonSubmitButton();
	}

	@When("^Click on alert window$")
	public void verif_alert_window_is_displaying() throws Throwable {
		pom.clickonAlertWindow();
	}
}
