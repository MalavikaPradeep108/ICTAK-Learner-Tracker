package com.learnertracker.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PofficerLogout {
	WebDriver driver;
	
	
	@FindBy(xpath="//div[@class='me-5 pe-5 nav-item dropdown']")
	private WebElement podropdown;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement polotxt;

	
	public PofficerLogout(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public void pofficerDropdown() {
		podropdown.click();
	}
	public void pofficerLogout()  {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",logoutbtn);
	}
	public boolean pofficrlotxt() {
		return polotxt.getText().toString().contains("LearnerTracker");
	}
	
}
