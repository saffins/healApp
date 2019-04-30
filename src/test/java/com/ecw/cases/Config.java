package com.ecw.cases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Config {

	public AndroidDriver<AndroidElement> driver;

	public Dial dial;
	public Login login;

	@BeforeSuite
	public void setUp() throws MalformedURLException {
		driver = Base.getDriverInstance();
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}
}
