package com.ecw.cases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ecw.pages.DialPage;

public class Dial extends Config  {

	DialPage dp;
	
	 
	
	@Test
	public void verifyMyRecords() throws InterruptedException {

		System.out.println("dial class " +driver);
		Thread.sleep(3000);
		dp = new DialPage(driver);
		dp.myRecords();

		WebElement verify = driver.findElement(By.id("com.ecw.healow.ent:id/vitals"));
		Assert.assertEquals(verify.isDisplayed(), true);
	}

	@Test
	public void verifyTrackers() {

		dp.trackers();

	}

	@Test
	public void verifyFindAppt() {

		dp.findAppointment();

	}

	@Test
	public void verifyCheckIn() {

		dp.checkIn();

	}

	@Test
	public void verifyMed() {

		dp.medications();

	}

	@Test
	public void verifyApptCenter() {

		dp.apptCenter();

	}

}
