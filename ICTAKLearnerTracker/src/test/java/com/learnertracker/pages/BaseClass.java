package com.learnertracker.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
		
		@BeforeTest
		public void Configure() throws InterruptedException {
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://learnertracker.netlify.app/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			Thread.sleep(2000);
		}
		@AfterTest
		public void Final() {
			System.out.println("All testcases are executed");
		}
	}


