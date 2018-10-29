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
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaclickacademy.baseclass.BaseClass;
import com.qaclickacademy.pages.LandingPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LandingPageTestCases extends BaseClass {

	Logger log = Logger.getLogger(LandingPageTestCases.class.getName());
	LandingPage lp;

	WebDriver driver;


	@BeforeMethod
	public void setUp() throws IOException {
		driver = invokeBrowser();
		lp = new LandingPage(driver);

	}

	// @Test(priority=1)
	// public void verifyLandingPage()
	// {
	// lp.popUp().click();
	// }

	@Test(priority = 1)
	public void verifyHomePage() {

		logger = extent.startTest("verifyHomePage");
		lp.homePage().click();
		log.info("Home page clicked");
		String homePageTitle = driver.getTitle();
		Assert.assertEquals(homePageTitle,
				"QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
	}

	@Test(priority = 2)
	public void verifyCoursePage() {

		logger = extent.startTest("verifCoursePage");
		lp.coursePage().click();
		log.info("Course page clicked");
		String coursePageTitle = driver.getTitle();
		Assert.assertEquals(coursePageTitle, "QAClick Academy | All Courses");

	}

	@Test(priority = 3)
	public void verifyVideoPage() {

		logger = extent.startTest("verifyVideoPage");
		lp.videoPage().click();
		log.info("Video page clicked");
		String videoPageTitle = driver.getTitle();
		Assert.assertEquals(videoPageTitle, "QAClick Academy | Video Galery123");
	}

	@Test(priority = 4)
	public void verifyInterviewGuidePage() {

		logger = extent.startTest("verifyInterviewGuidePage");
		lp.interviewGuidePage().click();
		log.info("Interview guide page clicked");
		String interviewGuidePageTitle = driver.getTitle();
		Assert.assertEquals(interviewGuidePageTitle, "QAClick Academy | Interview Guide");
	}

	@Test(priority = 5)
	public void verifyPractisePage() {

		logger = extent.startTest("verifyPractisePage");
		lp.practisePage().click();
		log.info("Practise  page clicked");
		String practisePageTitle = driver.getTitle();
		Assert.assertEquals(practisePageTitle, "Practice Page12345");

	}

	@Test(priority = 6)
	public void verifyBlogPage() {

		logger = extent.startTest("verifyBlogPage");
		lp.blogPage().click();
		log.info("Blog page clicked");
		String blogPageTitle = driver.getTitle();
		Assert.assertEquals(blogPageTitle, "QAClickAcademy Blog - QAClickAcademy | Become a Test Expert");
	}

	@Test(priority = 7)
	public void verifyAboutPage() {

		logger = extent.startTest("verifyAboutePage");
		lp.aboutPage().click();
		log.info("About page clicked");
		String aboutPageTitle = driver.getTitle();
		Assert.assertEquals(aboutPageTitle, "QAClick Academy | About Us123");
	}

	@Test(priority = 8)
	public void verifyContactPage() {

		logger = extent.startTest("verifyContactPage");
		lp.contactPage().click();
		log.info("Contact page clicked");
		String contactPageTite = driver.getTitle();
		Assert.assertEquals(contactPageTite, "QAClick Academy | Contact Us");
	}

	@Test(priority = 9)
	public void verifyRegisterPage() {

		logger = extent.startTest("verifyRegisterPage");
		lp.registerPage().click();
		log.info("Register page clicked");
		String registerPageTite = driver.getTitle();
		Assert.assertEquals(registerPageTite, "QaClickAcademy");
	}

	@Test(priority = 10)
	public void verifyLoginPage() {

		logger = extent.startTest("verifyLoginPage");
		lp.loginPage().click();
		log.info("Login page clicked");
		String loginPageTite = driver.getTitle();
		Assert.assertEquals(loginPageTite, "QaClickAcademy");
	}



}
