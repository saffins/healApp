package com.ecw.cases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ecw.pages.DialPage;
import com.ecw.pages.LoginPage;

public class Login extends Config {

	LoginPage lpage;

	@Test
	public void getStart() {
		System.out.println("dial class " +driver);

		lpage = new LoginPage(driver);
		lpage.getStarted();
		lpage.enterPtCode("BBIDBD");

		WebElement uname = driver.findElement(By.id("com.ecw.healow.ent:id/txtUserName"));

		Assert.assertEquals(uname.isDisplayed(), true);

	}

	@Test
	public void loginToApp() {
		WebDriverWait w = new WebDriverWait(driver, 60);
		w.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.EditText")));
		lpage.enterCreds("johnbeat4", "hello123");
		WebElement tc = driver.findElementByXPath("(//android.widget.TextView)[2]");

	}

	@Test
	public void setPin() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		for (int i = 0; i < 8; i++) {

			driver.findElement(By.id("com.ecw.healow.ent:id/tvTwo")).click();
		}

		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.ecw.healow.ent:id/txtnotnow")));
		driver.findElement(By.id("com.ecw.healow.ent:id/txtnotnow")).click();
		driver.navigate().back();
		Thread.sleep(3000);

	}

	
}
