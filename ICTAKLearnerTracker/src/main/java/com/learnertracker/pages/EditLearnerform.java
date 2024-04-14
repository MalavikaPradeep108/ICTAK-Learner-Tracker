package com.learnertracker.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditLearnerform {
	WebDriver driver;

	@FindBy(xpath="//input[@name='learnerid']")
	WebElement id;
	@FindBy(xpath="//input[@name='name']")
	WebElement name;
	@FindBy(xpath="//select[@name='course']")
	WebElement course;
	@FindBy(xpath="//select[@name='project']")
	WebElement project;
	@FindBy(xpath="//select[@name='batch']")
	WebElement batch;
	@FindBy(xpath="//select[@name='cstatus']")
	WebElement cstatus;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	//-----------------Edit/Update LearnerForm
	@FindBy(xpath="//div[@class='table-responsive']//following::button[5]")
	WebElement editbtn;
	@FindBy(xpath="//a[text()='LearnerTracker']")
	WebElement exp;
	//-------------------Delete LearnerDetails----------------------/
	@FindBy(xpath="//div[@class='table-responsive']//following::button[8]")
	WebElement deletebtn;
	
	
	public EditLearnerform(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}


	public void edit()  {
		editbtn.click();
		
	}
	
	
	public void editLearner(String a , String n , int b,int cs) {
		id.clear();
		id.sendKeys(a);
		name.clear();
		name.sendKeys(n);
		Select dp=new Select(batch);
		dp.selectByIndex(b);
		Select dn=new Select(cstatus);
		dn.selectByIndex(cs);
		
		 JavascriptExecutor j=(JavascriptExecutor)driver;
		 j.executeScript("arguments[0].click();" , submit);
		
		
	}

	public boolean assertion() {
		return exp.getText().toString().contains("LearnerTracker");
	}
	
	public void delete()  {
		deletebtn.click();
		
	}

}
