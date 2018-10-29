package com.qaclickacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qaclickacademy.baseclass.BaseClass;

public class LandingPage {

	public WebDriver driver;

//	By clickOnPopUp = By.xpath(
//			"//div//div[@class='sumome-react-wysiwyg-popup-container sumome-react-wysiwyg-popup sumome-react-wysiwyg-is-resizing sumome-animated-default']//div//div[2]");

	By clickOnHomePage = By.xpath("//a[text()='Home']");

	By clickOnCoursePage = By.xpath("//a[text()='Courses']");

	By clickOnVideoPage = By.xpath("//a[text()='Videos']");

	By clickOnInterviewGuidePage = By
			.xpath("//ul[@class='nav navbar-nav navbar-right']//li//a[text()='Interview Guide']");

	By clickOnPracticePage = By.xpath("//a[text()='Practice']");

	By clickOnBlogPage = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li//a[text()='Blog']");

	By clickOnAboutPage = By.xpath("//ul[@class='nav navbar-nav navbar-right']//li//a[text()='About']");

	By clickOnContactPage = By.xpath("//a[text()='Contact']");

	By clickOnRegisterPage = By.xpath("//span[text()='Register']");

	By clickOnLoginPage = By.xpath("//span[text()='Login']");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

//	public WebElement popUp() {
//		return driver.findElement(clickOnPopUp);
//	}

	public WebElement homePage() {
		return driver.findElement(clickOnHomePage);
	}

	public WebElement coursePage() {
		return driver.findElement(clickOnCoursePage);
	}

	public WebElement videoPage() {
		return driver.findElement(clickOnVideoPage);
	}

	public WebElement interviewGuidePage() {
		return driver.findElement(clickOnInterviewGuidePage);
	}

	public WebElement practisePage() {
		return driver.findElement(clickOnPracticePage);

	}

	public WebElement blogPage() {
		return driver.findElement(clickOnBlogPage);
	}

	public WebElement aboutPage() {
		return driver.findElement(clickOnAboutPage);
	}

	public WebElement contactPage() {
		return driver.findElement(clickOnContactPage);
	}

	public WebElement registerPage() {
		return driver.findElement(clickOnRegisterPage);
	}

	public WebElement loginPage() {
		return driver.findElement(clickOnLoginPage);
	}
}
