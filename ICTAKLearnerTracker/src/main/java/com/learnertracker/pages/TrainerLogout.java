package com.learnertracker.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainerLogout {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='me-5 pe-5 nav-item dropdown']")
	private WebElement thdropdown;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement tlotxt;


	public TrainerLogout(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public void trainerDropdown() {
		thdropdown.click();
	}
	public void thLogout()  {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",logoutbtn);
		
	}
	public boolean tLogouttxt() {
		return tlotxt.getText().toString().contains("LearnerTracker");
	}
	
}