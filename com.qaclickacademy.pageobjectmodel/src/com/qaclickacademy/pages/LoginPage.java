package com.qaclickacademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	
	By clickOnLoginButton = By.xpath("//span[text()='Login']");
	
	By enterEmail = By.id("user_email");
	
	By enterPassword = By.name("user[password]");
	
	By clickLoginButton = By.name("commit");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement login()
	{
		return driver.findElement(clickOnLoginButton);
	}
	
	public WebElement email()
	{
		return driver.findElement(enterEmail);
	}
	
	public WebElement password()
	{
		return driver.findElement(enterPassword);
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(clickLoginButton);
	}
	

}
