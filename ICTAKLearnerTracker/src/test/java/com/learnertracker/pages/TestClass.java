package com.learnertracker.pages;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	
	//Test classes are written here
	
	HomePage hpgobj;
	TrainerLoginpage trlgobj;
	LearnerForm lfobj;
	EditLearnerform eobj;
	TrainerLogout tloobj;
	PofficerLoginpage polgobj;
	PofficerDashboard psuobj;
	PofficerLogout poloobj;
	
	@Test(priority=1)
	public void TC_LHP_001() {
		hpgobj=new HomePage(driver);
		Assert.assertEquals(true,hpgobj.txt());
		Assert.assertEquals(true,hpgobj.logo());
		System.out.println("Home page validated");
	}
	@Test(priority=2)
	public void TC_TLG_001()  {
		trlgobj=new TrainerLoginpage(driver);
		trlgobj.setName("trainer");
		trlgobj.setPassword("");
		trlgobj.trLogin();
		driver.navigate().refresh();		
		
	}
	@Test(priority=3)
	public void TC_TLG_002()  {
		trlgobj=new TrainerLoginpage(driver);
		trlgobj.setName("");
		trlgobj.setPassword("trainer@123");
		trlgobj.trLogin();
		driver.navigate().refresh();		
		
	}
	
	@Test(priority=4)
	public void TC_TLG_003()  {
		trlgobj=new TrainerLoginpage(driver);
		trlgobj.setName("trainer");
		trlgobj.setPassword("trainer@123");
		Assert.assertEquals(true, trlgobj.lgtxt());
		trlgobj.trLogin();
		System.out.println("Trainer Login Successful");
	}
	
	@Test(priority=11)
	public void TC_LRF_001()  {
		lfobj=new LearnerForm(driver);
		Assert.assertEquals(true, lfobj.learnertxt());
		lfobj.learnerId("ST-01");
		lfobj.Name("John");
		lfobj.Course(5);
		lfobj.Project(1);
		lfobj.Batch(4);
		lfobj.courseStatus(1);
		lfobj.Submit();
		lfobj.okBuuton();
		System.out.println("Learner's form posted successful");
	}
	@Test(priority=15)
	public void TC_ELF_001()   {
		eobj=new EditLearnerform(driver);
		eobj.edit();
		Assert.assertEquals(true, eobj.assertion());
		eobj.editLearner("DSA-10", "Neil", 4, 1);	
		System.out.println("Learner's form updated");
	}
	@Test(priority=13)
	public void TC_ELF_002() {
		eobj=new EditLearnerform(driver);
		eobj.edit();
		eobj.editLearner("DSA.10", "Neil", 4, 1);
		driver.navigate().refresh();
	}
	@Test(priority=14)
	public void TC_ELF_003()  {
		eobj=new EditLearnerform(driver);
		eobj.edit();
		eobj.editLearner("DSA-10", " ", 4, 1);
		driver.navigate().refresh();
	}
	
	
	@Test(priority=16)
	public void TC_DLD_001() {
		eobj=new EditLearnerform(driver);
		Assert.assertEquals(true, eobj.assertion());
		eobj.delete();
		System.out.println("Learner's details deleted");
	}
	
	
	@Test(priority=12)
	public void TC_CSV_001() throws InterruptedException {
		lfobj=new LearnerForm(driver);
		Assert.assertEquals(true, lfobj.learnertxt());
		String filepath="C:\\Users\\Malavika\\Downloads\\SampleCSV - Sheet1 (1).csv";
		File file=new File(filepath);
		if(file.exists()) {
			lfobj.fileButton();
			lfobj.chooseFile(filepath);
			lfobj.submitButton();
		}else {
			System.out.println("file not found :"+filepath);
		}
	}
			
	@Test(priority=5)
	public void TC_LRF_002()  {
		lfobj=new LearnerForm(driver);
		lfobj.addButton();
		lfobj.learnerId("ST.01");
		lfobj.Submit();
		driver.navigate().refresh();		
		
	}
	@Test(priority=6)
	public void TC_LRF_003() {
		lfobj=new LearnerForm(driver);
		lfobj.learnerId("ST-01");
		lfobj.Name("123");
		lfobj.Submit();
		driver.navigate().refresh();	
	}
	@Test(priority=7)
	public void TC_LRF_004() {
		lfobj=new LearnerForm(driver);
		lfobj.learnerId("ST-01");
		lfobj.Name("John");
		lfobj.Course(0);
		lfobj.Submit();
		driver.navigate().refresh();
	}
	@Test(priority=8)
	public void TC_LRF_005()  {
		lfobj=new LearnerForm(driver);
		lfobj.learnerId("ST-01");
		lfobj.Name("John");
		lfobj.Course(5);
		lfobj.Project(0);
		lfobj.Submit();
		driver.navigate().refresh();
	}
	@Test(priority=9)
	public void TC_LRF_006()  {
		lfobj=new LearnerForm(driver);
		lfobj.learnerId("ST-01");
		lfobj.Name("John");
		lfobj.Course(5);
		lfobj.Project(1);
		lfobj.Batch(0);
		lfobj.Submit();
		driver.navigate().refresh();
	}
	@Test(priority=10)
	public void TC_LRF_007()  {
		lfobj=new LearnerForm(driver);
		lfobj.learnerId("ST-01");
		lfobj.Name("John");
		lfobj.Course(5);
		lfobj.Project(1);
		lfobj.Batch(4);
		lfobj.courseStatus(0);
		lfobj.Submit();
		driver.navigate().refresh();
	}

	@Test(priority=17)
	public void TC_TLO_001()  {
		tloobj=new TrainerLogout(driver);
		Assert.assertEquals(true, tloobj.tLogouttxt());
		tloobj.trainerDropdown();
		tloobj.thLogout();
		System.out.println("Trainer Logout Successful");
		
	}
	@Test(priority=18)
	public void TC_PLG_001(){
		polgobj=new PofficerLoginpage(driver);
		Assert.assertEquals(true, polgobj.polgtxt());
		polgobj.setName("pofficer");
		polgobj.setPassword("");
		polgobj.poLogin();
		driver.navigate().refresh();
	}
	@Test(priority=19)
	public void TC_PLG_002() {
		polgobj=new PofficerLoginpage(driver);
		polgobj.setName("");
		polgobj.setPassword("pofficer@123");
		polgobj.poLogin();
		driver.navigate().refresh();
	}
	
	@Test(priority=20)
	public void TC_PLG_003()  {
		polgobj=new PofficerLoginpage(driver);
		polgobj.setName("pofficer");
		polgobj.setPassword("pofficer@123");
		polgobj.poLogin();
		System.out.println("Pofficer Login Successful");
	}
	@Test(priority=21)
	public void TC_PSU_001()  {
		psuobj=new PofficerDashboard(driver);
		Assert.assertEquals(true,psuobj.pofficertxt());
		psuobj.updateStatus();
		psuobj.placementStatus(1);
		psuobj.Button();
		System.out.println("Placement status Updated");
	}
	@Test(priority=22)
	public void TC_PLO_001() {
		poloobj=new PofficerLogout(driver);
		Assert.assertEquals(true, poloobj.pofficrlotxt());
		poloobj.pofficerDropdown();
		poloobj.pofficerLogout();
		System.out.println("Pofficer Logout successful");
	}
	
} 


