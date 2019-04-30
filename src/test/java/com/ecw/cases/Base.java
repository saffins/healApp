package com.ecw.cases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> driver ;
	
	 
	public static AndroidDriver<AndroidElement> getDriverInstance() throws MalformedURLException {

		File f = new File("src");
		File fs = new File(f, "healow_com.ecw.healow.ent.apk");

		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.DEVICE_NAME, "note8");
		ds.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		ds.setCapability("automationName", "UIAutomator2");
		 driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), ds);
		 
		 return driver;
	}

}
