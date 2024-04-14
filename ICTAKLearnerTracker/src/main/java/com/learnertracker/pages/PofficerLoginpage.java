package com.learnertracker.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PofficerLoginpage {
WebDriver driver;
	
	@FindBy(xpath="//p[text()='ICTAK - Learner Tracker']")
	private WebElement ptxt;
	@FindBy(xpath="//*[@id=\"username\"]")
	private WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")
	private WebElement password;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement login;
	
	
	public PofficerLoginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public void setName(String Username) {
		username.sendKeys(Username);
		
	}
	public void setPassword(String Password)  {
		password.sendKeys(Password);
		
	}
	public boolean polgtxt()
	{
		return ptxt.getText().toString().contains("ICTAK - Learner Tracker");
	}
	public void poLogin()  {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", login);
		
	}
	
}
