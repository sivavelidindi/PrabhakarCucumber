package com.org.abcCompany.pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.org.abcCompany.config.Config;
import com.org.abcCompany.stepDefinitions.Hooks;
import com.org.abcCompany.util.GenericClass;

public class POMClass1 {

	static WebDriver driver;

	private static final String APP_URL = Config.getProperty("appURL");

	public POMClass1() throws IOException {
		driver = Hooks.driver;
	}

	public void openApplication() {
		driver.get(APP_URL);
	}

	public void clickonForm() {
		driver.findElement(GenericClass.getbjectLocator("lnkWebPageForms")).click();
	}

	public void layoutandPresentation() {
		driver.findElement(GenericClass.getbjectLocator("lnkLayoutandPresentation")).click();
	}

	public void isFormDisplayed() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Layout and Presentation");
	}

	public void enterName(String name) {
		driver.findElement(GenericClass.getbjectLocator("txtName")).sendKeys(name);
	}

	public void enterEmail(String email) {
		driver.findElement(GenericClass.getbjectLocator("txtEmail")).sendKeys(email);
	}

	public void selectBreakfast(String item) {
		try {
			switch (item) {
			case "Orange Juice":
				driver.findElement(GenericClass.getbjectLocator("chkOrangeJuice")).click();
				break;
			default:
				driver.findElement(GenericClass.getbjectLocator("chkEggs")).click();
				break;
			}
		} catch (Exception e) {

		}
	}

	public void selectCoffeeWithanyPreferences(String preference) {
		try {

			WebElement element = driver.findElement(GenericClass.getbjectLocator("lbCoffee"));
			Select lb = new Select(element);
			switch (preference) {
			case "Honey":
				lb.selectByVisibleText("Honey");
				break;
			default:
				lb.selectByVisibleText("Skim Milk");
				break;
			}
		} catch (Exception e) {

		}
	}

	public void clickonSubmitButton() {
		driver.findElement(GenericClass.getbjectLocator("btnSubmit")).click();
	}

	public void clickonAlertWindow() {
		driver.switchTo().alert().accept();
	}
}
