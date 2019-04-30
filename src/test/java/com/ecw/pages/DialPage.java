package com.ecw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DialPage {

	AndroidDriver<AndroidElement> driver;

	public DialPage(AndroidDriver<AndroidElement> driver) {

		this.driver = driver;

	}

	public void myRecords() {

		driver.findElement(By.id("com.ecw.healow.ent:id/my_accounts_icon")).click();
		WebElement verify = driver.findElement(By.id("com.ecw.healow.ent:id/vitals"));

	}

	public void trackers() {

		driver.navigate().back();
		driver.findElement(By.id("com.ecw.healow.ent:id/my_trackers_icon")).click();

	}

	public void findAppointment() {

		driver.navigate().back();
		driver.findElement(By.id("com.ecw.healow.ent:id/find_appointments_icon")).click();

	}

	public void checkIn() {

		driver.navigate().back();
		driver.findElement(By.id("com.ecw.healow.ent:id/check_in_icon")).click();

	}

	public void medications() {

		driver.navigate().back();
		driver.findElement(By.id("com.ecw.healow.ent:id/meds_cabinet_icon")).click();

	}

	public void apptCenter() {

		driver.navigate().back();
		driver.findElement(By.id("com.ecw.healow.ent:id/appt_center_icon")).click();

	}

}
