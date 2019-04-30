package com.ecw.pages;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage {

	AndroidDriver<AndroidElement> driver;

	public LoginPage(AndroidDriver<AndroidElement> driver) {

		this.driver = driver;

	}

	public void getStarted() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("com.ecw.healow.ent:id/txtGetStarted")).click();
		driver.findElement(By.className("android.widget.EditText")).click();
		driver.findElement(By.className("android.widget.EditText")).clear();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void enterPtCode(String ptCode) {

		driver.findElement(By.className("android.widget.EditText")).sendKeys(ptCode);
		 driver.navigate().back();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("com.ecw.healow.ent:id/logIn")).click();

	}
	
	public void enterCreds(String uname, String pass){
		
		driver.findElement(By.id("com.ecw.healow.ent:id/txtUserName")).sendKeys(uname);
		driver.findElement(By.id("com.ecw.healow.ent:id/txtPassword")).sendKeys(pass);
		driver.findElement(By.id("com.ecw.healow.ent:id/btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByXPath("(//android.widget.TextView)[2]").click();
		
		
	}
	
	 

}
