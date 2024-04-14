package com.learnertracker.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PofficerDashboard {
	WebDriver driver;
	
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement pstxt;
	@FindBy(xpath="//button[@class='btn btn-success btn btn-primary']")
	private WebElement update;
	@FindBy(xpath="//select[@name='pstatus']")
	private WebElement pstatus;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement btn;
	
	
	public PofficerDashboard(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public void updateStatus() {
		update.click();
		
	}
	public void placementStatus(int a)  {
		Select dropdown=new Select(pstatus);
		dropdown.selectByIndex(a);
		
	}
	public boolean pofficertxt() {
		return pstxt.getText().toString().contains("LearnerTracker");
	}
	public void Button()  {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", btn);
	
	}
}
