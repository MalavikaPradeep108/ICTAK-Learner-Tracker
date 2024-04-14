package com.learnertracker.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LearnerForm {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/tadd']/button")
	private WebElement addbuttn;
	@FindBy(xpath="//input[@name='learnerid']")
	private WebElement learnerid ;
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	@FindBy(xpath="//select[@name='course']")
	private WebElement course;
	@FindBy(xpath="//select[@name='project']")
	private WebElement project;
	@FindBy(xpath="//select[@name='batch']")
	private WebElement batch;
	@FindBy(xpath="//select[@name='cstatus']")
	private WebElement coursestatus;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement submit;
	@FindBy(xpath="//button[text()='OK']")
	private WebElement okbutn;
	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement lttxt;
	
	//-------------------------------CSV File Upload------------------------------------------
	@FindBy(xpath="//a[@href='/upload']/button")
	private WebElement filebttn;
	@FindBy(xpath="//input[@type='file']")
	private WebElement csvfile;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitbtn ;
	@FindBy(xpath="//button[text()='Return to Dashboard']")
	WebElement retrn;
	@FindBy(xpath="//button[text()='OK']")
	WebElement ok;
	
	
	public LearnerForm(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public void addButton() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", addbuttn);
		
	}
	public void learnerId(String Learnerid)  {
		learnerid.sendKeys(Learnerid);
		
	}
	public void Name(String Name)  {
		name.sendKeys(Name);
		
	}
	public void Course(int a)  {
		Select dropdown=new Select(course);
		dropdown.selectByIndex(a);
		
	
	}
	public void Project(int a)  {
		Select dropdown=new Select(project);
		dropdown.selectByIndex(a);
		
	}
	public void Batch(int a) {
		Select dropdown=new Select(batch);
		dropdown.selectByIndex(a);
		
	}
	
	public void courseStatus(int a)  {
		Select dropdown=new Select(coursestatus);
		dropdown.selectByIndex(a);
		
		
	}
	public void Submit() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", submit);
		
		
	}
	public void okBuuton() {
		okbutn.click();
		
	}
	public void fileButton() {
		filebttn.click();
	}
	public void chooseFile(String path) throws InterruptedException {
		csvfile.sendKeys(path);
		Thread.sleep(4000);
	}
	public void submitButton()  {
		submitbtn.click();
		retrn.click();
		ok.click();
		//driver.switchTo().alert().accept();
	}
	
	public boolean learnertxt() {
		return lttxt.getText().toString().contains("LearnerTracker");
	}
	
	

	
	
}
