package com.qaclickacademy.TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaclickacademy.baseclass.BaseClass;
import com.qaclickacademy.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageTestCases extends BaseClass {

	LoginPage loginPage;

	
	Logger log = Logger.getLogger(LoginPageTestCases.class.getName());

	@BeforeMethod
	public void setUp() throws IOException {
		driver = invokeBrowser();
		loginPage = new LoginPage(driver);

	}

	@Test
	public void loginPageVerification() {
		logger=extent.startTest("loginPageVerification");
		loginPage.login().click();
		log.info("Login page clicked");
		loginPage.email().sendKeys("serajislam1988@gmail.com");
		log.info("Email entered");
		loginPage.password().sendKeys("Bina123");
		log.info("Password entered");
		loginPage.loginButton().click();
		log.info("Login button clicked");
		String currentURL = driver.getCurrentUrl();
		Assert.assertEquals(currentURL, "https://qaclickacademy.usefedora.com/");
	}



}
