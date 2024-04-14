package com.learnertracker.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	@FindBy(xpath="//p[text()='ICTAK - Learner Tracker']")
	private WebElement htxt;
	@FindBy(xpath="//img[@class='App-logo mb-2']")
	private WebElement hlogo;
	@FindBy(xpath="button[text()='Login']")
	private WebElement ltxt;
	
	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public boolean txt()
	{
		return htxt.getText().toString().contains("ICTAK - Learner Tracker");
	}
	public boolean logo()
	{
		return hlogo.isDisplayed();
	}
	
	}
	
	

